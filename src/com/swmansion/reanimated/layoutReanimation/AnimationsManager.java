package com.swmansion.reanimated.layoutReanimation;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.IViewManagerWithChildren;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.UIImplementation;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManager;
import com.swmansion.reanimated.Scheduler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public class AnimationsManager implements ViewHierarchyObserver {
    private static final String[] LAYOUT_KEYS = {Snapshot.ORIGIN_X, Snapshot.ORIGIN_Y, "width", "height"};
    private boolean isCatalystInstanceDestroyed;
    private ReactContext mContext;
    private NativeMethodsHolder mNativeMethodsHolder;
    private ReanimatedNativeHierarchyManager mReanimatedNativeHierarchyManager;
    private WeakReference<Scheduler> mScheduler;
    private UIImplementation mUIImplementation;
    private UIManagerModule mUIManager;
    private boolean mCleaningScheduled = false;
    private HashMap<Integer, ViewState> mStates = new HashMap<>();
    private HashMap<Integer, View> mViewForTag = new HashMap<>();
    private HashSet<Integer> mToRemove = new HashSet<>();
    private HashMap<Integer, ViewManager> mViewManager = new HashMap<>();
    private HashMap<Integer, ViewManager> mParentViewManager = new HashMap<>();
    private HashMap<Integer, View> mParent = new HashMap<>();
    private HashMap<Integer, Runnable> mCallbacks = new HashMap<>();

    /* loaded from: classes8.dex */
    public enum ViewState {
        Inactive,
        Appearing,
        Disappearing,
        Layout,
        ToRemove
    }

    public AnimationsManager(ReactContext reactContext, UIImplementation uIImplementation, UIManagerModule uIManagerModule) {
        this.isCatalystInstanceDestroyed = false;
        this.mContext = reactContext;
        this.mUIImplementation = uIImplementation;
        this.mUIManager = uIManagerModule;
        this.isCatalystInstanceDestroyed = false;
    }

    private static void addProp(WritableMap writableMap, String str, Object obj) {
        if (obj == null) {
            writableMap.putNull(str);
        } else if (obj instanceof Double) {
            writableMap.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Integer) {
            writableMap.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Number) {
            writableMap.putDouble(str, ((Number) obj).doubleValue());
        } else if (obj instanceof Boolean) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            writableMap.putString(str, (String) obj);
        } else if (obj instanceof ReadableArray) {
            writableMap.putArray(str, (ReadableArray) obj);
        } else if (obj instanceof ReadableMap) {
            writableMap.putMap(str, (ReadableMap) obj);
        } else {
            throw new IllegalStateException("Unknown type of animated value [Layout Aniamtions]");
        }
    }

    private boolean dfs(View view, View view2, HashSet<Integer> hashSet) {
        ViewGroup viewGroup;
        boolean z;
        if (!hashSet.contains(Integer.valueOf(view2.getId())) && this.mStates.containsKey(Integer.valueOf(view2.getId()))) {
            return true;
        }
        boolean z2 = false;
        if ((view2 instanceof ViewGroup) && (this.mViewManager.get(Integer.valueOf(view2.getId())) instanceof ViewGroupManager)) {
            ViewGroup viewGroup2 = (ViewGroup) view2;
            ViewGroupManager viewGroupManager = (ViewGroupManager) this.mViewManager.get(Integer.valueOf(viewGroup2.getId()));
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < viewGroupManager.getChildCount(viewGroup2); i++) {
                arrayList.add(viewGroupManager.getChildAt(viewGroup2, i));
            }
            Iterator it = arrayList.iterator();
            loop1: while (true) {
                z = false;
                while (it.hasNext()) {
                    View view3 = (View) it.next();
                    if (z || dfs(view, view3, hashSet)) {
                        z = true;
                    }
                }
            }
            z2 = z;
        }
        if (!z2) {
            View view4 = (View) view2.getParent();
            if (this.mCallbacks.containsKey(Integer.valueOf(view2.getId()))) {
                this.mCallbacks.remove(Integer.valueOf(view2.getId()));
                this.mCallbacks.get(Integer.valueOf(view2.getId())).run();
            }
            if (this.mParent.containsKey(Integer.valueOf(view2.getId())) && (viewGroup = (ViewGroup) this.mParent.get(Integer.valueOf(view2.getId()))) != null) {
                viewGroup.removeView(view2);
            }
            this.mStates.remove(Integer.valueOf(view2.getId()));
            this.mViewForTag.remove(Integer.valueOf(view2.getId()));
            this.mViewManager.remove(Integer.valueOf(view2.getId()));
            this.mParentViewManager.remove(Integer.valueOf(view2.getId()));
            this.mParent.remove(Integer.valueOf(view2.getId()));
            this.mNativeMethodsHolder.removeConfigForTag(view2.getId());
            this.mToRemove.remove(Integer.valueOf(view2.getId()));
        }
        return z2;
    }

    private void findRoot(View view, HashSet<Integer> hashSet) {
        int i = -1;
        while (view != null) {
            ViewState viewState = this.mStates.get(Integer.valueOf(view.getId()));
            if (viewState != ViewState.Disappearing) {
                if (viewState == ViewState.ToRemove) {
                    i = view.getId();
                }
                if (!(view.getParent() instanceof View)) {
                    break;
                }
                view = (View) view.getParent();
            } else {
                return;
            }
        }
        if (i != -1) {
            hashSet.add(Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleCleaning$0(WeakReference weakReference) {
        this.mCleaningScheduled = false;
        if (((AnimationsManager) weakReference.get()) != null) {
            removeLeftovers();
        }
    }

    private void removeLeftovers() {
        if (this.mToRemove != null) {
            HashSet<Integer> hashSet = new HashSet<>();
            Iterator<Integer> it = this.mToRemove.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                View view = this.mViewForTag.get(Integer.valueOf(intValue));
                if (view == null) {
                    try {
                        view = this.mUIManager.resolveView(intValue);
                        this.mViewForTag.put(Integer.valueOf(intValue), view);
                    } catch (IllegalViewOperationException unused) {
                    }
                }
                findRoot(view, hashSet);
            }
            Iterator<Integer> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                View view2 = this.mViewForTag.get(Integer.valueOf(it2.next().intValue()));
                if (view2 != null) {
                    dfs(view2, view2, this.mToRemove);
                }
            }
        }
    }

    private void scheduleCleaning() {
        if (!this.mCleaningScheduled) {
            this.mCleaningScheduled = true;
            final WeakReference weakReference = new WeakReference(this);
            this.mContext.runOnUiQueueThread(new Runnable() { // from class: com.swmansion.reanimated.layoutReanimation.a
                @Override // java.lang.Runnable
                public final void run() {
                    AnimationsManager.this.lambda$scheduleCleaning$0(weakReference);
                }
            });
        }
    }

    public ReanimatedNativeHierarchyManager getReanimatedNativeHierarchyManager() {
        return this.mReanimatedNativeHierarchyManager;
    }

    public boolean isLayoutAnimationEnabled() {
        NativeMethodsHolder nativeMethodsHolder = this.mNativeMethodsHolder;
        return nativeMethodsHolder != null && nativeMethodsHolder.isLayoutAnimationEnabled();
    }

    public void notifyAboutEnd(int i, boolean z) {
        if (!z) {
            ViewState viewState = this.mStates.get(Integer.valueOf(i));
            if (viewState == ViewState.Appearing) {
                this.mStates.put(Integer.valueOf(i), ViewState.Layout);
            }
            if (viewState == ViewState.Disappearing) {
                this.mStates.put(Integer.valueOf(i), ViewState.ToRemove);
                this.mToRemove.add(Integer.valueOf(i));
                scheduleCleaning();
            }
        }
    }

    public void notifyAboutProgress(Map<String, Object> map, Integer num) {
        if (this.mStates.get(num) == ViewState.Inactive) {
            this.mStates.put(num, ViewState.Appearing);
        }
        setNewProps(map, this.mViewForTag.get(num), this.mViewManager.get(num), this.mParentViewManager.get(num), Integer.valueOf(this.mParent.get(num).getId()));
    }

    public void onCatalystInstanceDestroy() {
        this.isCatalystInstanceDestroyed = true;
        this.mNativeMethodsHolder = null;
        this.mContext = null;
        this.mUIImplementation = null;
        this.mUIManager = null;
        this.mStates = null;
        this.mToRemove = null;
        this.mViewForTag = null;
        this.mViewManager = null;
        this.mParent = null;
        this.mParentViewManager = null;
        this.mCallbacks = null;
    }

    @Override // com.swmansion.reanimated.layoutReanimation.ViewHierarchyObserver
    public void onViewCreate(View view, ViewGroup viewGroup, Snapshot snapshot) {
        if (!this.isCatalystInstanceDestroyed) {
            Scheduler scheduler = this.mScheduler.get();
            if (scheduler != null) {
                scheduler.triggerUI();
            }
            if (!this.mStates.containsKey(Integer.valueOf(view.getId()))) {
                this.mStates.put(Integer.valueOf(view.getId()), ViewState.Inactive);
                this.mViewForTag.put(Integer.valueOf(view.getId()), view);
                this.mViewManager.put(Integer.valueOf(view.getId()), snapshot.viewManager);
                this.mParentViewManager.put(Integer.valueOf(view.getId()), snapshot.parentViewManager);
                this.mParent.put(Integer.valueOf(view.getId()), snapshot.parent);
            }
            Integer valueOf = Integer.valueOf(view.getId());
            HashMap<String, Object> targetMap = snapshot.toTargetMap();
            if (this.mStates.get(Integer.valueOf(view.getId())) == ViewState.Inactive && targetMap != null) {
                this.mNativeMethodsHolder.startAnimationForTag(valueOf.intValue(), "entering", prepareDataForAnimationWorklet(targetMap, true));
            }
        }
    }

    @Override // com.swmansion.reanimated.layoutReanimation.ViewHierarchyObserver
    public void onViewRemoval(View view, ViewGroup viewGroup, Snapshot snapshot, Runnable runnable) {
        ViewState viewState;
        if (!this.isCatalystInstanceDestroyed) {
            Integer valueOf = Integer.valueOf(view.getId());
            HashMap<String, Object> currentMap = snapshot.toCurrentMap();
            ViewState viewState2 = this.mStates.get(Integer.valueOf(view.getId()));
            ViewState viewState3 = ViewState.Disappearing;
            if (viewState2 != viewState3 && viewState2 != (viewState = ViewState.ToRemove)) {
                this.mCallbacks.put(valueOf, runnable);
                if (viewState2 != ViewState.Inactive && viewState2 != null) {
                    this.mStates.put(valueOf, viewState3);
                    this.mNativeMethodsHolder.startAnimationForTag(valueOf.intValue(), "exiting", prepareDataForAnimationWorklet(currentMap, false));
                } else if (currentMap != null) {
                    this.mStates.put(Integer.valueOf(view.getId()), viewState);
                    this.mToRemove.add(Integer.valueOf(view.getId()));
                    scheduleCleaning();
                }
            }
        }
    }

    @Override // com.swmansion.reanimated.layoutReanimation.ViewHierarchyObserver
    public void onViewUpdate(View view, Snapshot snapshot, Snapshot snapshot2) {
        if (!this.isCatalystInstanceDestroyed) {
            Integer valueOf = Integer.valueOf(view.getId());
            HashMap<String, Object> targetMap = snapshot2.toTargetMap();
            HashMap<String, Object> currentMap = snapshot.toCurrentMap();
            ViewState viewState = this.mStates.get(Integer.valueOf(view.getId()));
            if (!(viewState == null || viewState == ViewState.Disappearing || viewState == ViewState.ToRemove || viewState == ViewState.Inactive)) {
                if (viewState == ViewState.Appearing) {
                    boolean z = true;
                    for (int i = 0; i < Snapshot.targetKeysToTransform.size(); i++) {
                        if (((Number) currentMap.get(Snapshot.currentKeysToTransform.get(i))).doubleValue() != ((Number) targetMap.get(Snapshot.targetKeysToTransform.get(i))).doubleValue()) {
                            z = false;
                        }
                    }
                    if (z) {
                        return;
                    }
                }
                this.mStates.put(Integer.valueOf(view.getId()), ViewState.Layout);
                HashMap<String, Float> prepareDataForAnimationWorklet = prepareDataForAnimationWorklet(currentMap, false);
                HashMap<String, Float> hashMap = new HashMap<>(prepareDataForAnimationWorklet(targetMap, true));
                for (String str : prepareDataForAnimationWorklet.keySet()) {
                    hashMap.put(str, prepareDataForAnimationWorklet.get(str));
                }
                this.mNativeMethodsHolder.startAnimationForTag(valueOf.intValue(), "layout", hashMap);
            }
        }
    }

    public HashMap<String, Float> prepareDataForAnimationWorklet(HashMap<String, Object> hashMap, boolean z) {
        ArrayList<String> arrayList;
        HashMap<String, Float> hashMap2 = new HashMap<>();
        if (z) {
            arrayList = Snapshot.targetKeysToTransform;
        } else {
            arrayList = Snapshot.currentKeysToTransform;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            hashMap2.put(next, Float.valueOf(PixelUtil.toDIPFromPixel(((Integer) hashMap.get(next)).intValue())));
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Activity currentActivity = this.mContext.getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.heightPixels;
            hashMap2.put("windowWidth", Float.valueOf(PixelUtil.toDIPFromPixel(displayMetrics.widthPixels)));
            hashMap2.put("windowHeight", Float.valueOf(PixelUtil.toDIPFromPixel(i)));
        } else {
            hashMap2.put("windowWidth", Float.valueOf(PixelUtil.toDIPFromPixel(0.0f)));
            hashMap2.put("windowHeight", Float.valueOf(PixelUtil.toDIPFromPixel(0.0f)));
        }
        return hashMap2;
    }

    public void printSubTree(View view, int i) {
        if (i == 0) {
            Log.v("rea", "----------------------");
        }
        if (view != null) {
            StringBuilder sb2 = new StringBuilder();
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb2.append("+");
            }
            sb2.append(" TAG:");
            sb2.append(view.getId());
            sb2.append(" STATE:");
            sb2.append(this.mStates.get(Integer.valueOf(view.getId())));
            sb2.append(" CLASS:");
            sb2.append(view.getClass().getSimpleName());
            Log.v("rea", sb2.toString());
            if (view instanceof ViewGroup) {
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i2 < viewGroup.getChildCount()) {
                        printSubTree(viewGroup.getChildAt(i2), i + 1);
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setNativeMethods(NativeMethodsHolder nativeMethodsHolder) {
        this.mNativeMethodsHolder = nativeMethodsHolder;
    }

    public void setNewProps(Map<String, Object> map, View view, ViewManager viewManager, ViewManager viewManager2, Integer num) {
        float f;
        float f2;
        float f3;
        float f4;
        if (map.get(Snapshot.ORIGIN_X) != null) {
            f = ((Double) map.get(Snapshot.ORIGIN_X)).floatValue();
        } else {
            f = PixelUtil.toDIPFromPixel(view.getLeft());
        }
        if (map.get(Snapshot.ORIGIN_Y) != null) {
            f2 = ((Double) map.get(Snapshot.ORIGIN_Y)).floatValue();
        } else {
            f2 = PixelUtil.toDIPFromPixel(view.getTop());
        }
        if (map.get("width") != null) {
            f3 = ((Double) map.get("width")).floatValue();
        } else {
            f3 = PixelUtil.toDIPFromPixel(view.getWidth());
        }
        if (map.get("height") != null) {
            f4 = ((Double) map.get("height")).floatValue();
        } else {
            f4 = PixelUtil.toDIPFromPixel(view.getHeight());
        }
        updateLayout(view, viewManager2, num.intValue(), view.getId(), f, f2, f3, f4);
        map.remove(Snapshot.ORIGIN_X);
        map.remove(Snapshot.ORIGIN_Y);
        map.remove("width");
        map.remove("height");
        if (map.size() != 0) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            for (String str : map.keySet()) {
                addProp(javaOnlyMap, str, map.get(str));
            }
            viewManager.updateProperties(view, new ReactStylesDiffMap(javaOnlyMap));
        }
    }

    public void setReanimatedNativeHierarchyManager(ReanimatedNativeHierarchyManager reanimatedNativeHierarchyManager) {
        this.mReanimatedNativeHierarchyManager = reanimatedNativeHierarchyManager;
    }

    public void setScheduler(Scheduler scheduler) {
        this.mScheduler = new WeakReference<>(scheduler);
    }

    public void updateLayout(View view, ViewManager viewManager, int i, int i2, float f, float f2, float f3, float f4) {
        int round = Math.round(PixelUtil.toPixelFromDIP(f));
        int round2 = Math.round(PixelUtil.toPixelFromDIP(f2));
        int round3 = Math.round(PixelUtil.toPixelFromDIP(f3));
        int round4 = Math.round(PixelUtil.toPixelFromDIP(f4));
        view.measure(View.MeasureSpec.makeMeasureSpec(round3, 1073741824), View.MeasureSpec.makeMeasureSpec(round4, 1073741824));
        ViewParent parent = view.getParent();
        if (parent instanceof RootView) {
            parent.requestLayout();
        }
        if (i % 10 != 1) {
            view.layout(round, round2, round3 + round, round4 + round2);
        } else if (viewManager instanceof IViewManagerWithChildren) {
            IViewManagerWithChildren iViewManagerWithChildren = (IViewManagerWithChildren) viewManager;
            if (iViewManagerWithChildren != null && !iViewManagerWithChildren.needsCustomLayoutForChildren()) {
                view.layout(round, round2, round3 + round, round4 + round2);
            }
        } else {
            throw new IllegalViewOperationException("Trying to use view with tag " + i + " as a parent, but its Manager doesn't implement IViewManagerWithChildren");
        }
    }
}
