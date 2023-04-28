package com.swmansion.reanimated.layoutReanimation;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.ViewAtIndex;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.facebook.react.uimanager.layoutanimation.LayoutAnimationController;
import com.swmansion.rnscreens.ScreenStackViewManager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes8.dex */
public class ReanimatedNativeHierarchyManager extends NativeViewHierarchyManager {
    private final HashMap<Integer, Runnable> cleanerCallback;
    private boolean initOk;
    private HashMap<Integer, Set<Integer>> mPendingDeletionsForTag;
    private LayoutAnimationController mReaLayoutAnimator;
    private final HashMap<Integer, ArrayList<View>> toBeRemoved;

    public ReanimatedNativeHierarchyManager(ViewManagerRegistry viewManagerRegistry, ReactApplicationContext reactApplicationContext) {
        super(viewManagerRegistry);
        this.toBeRemoved = new HashMap<>();
        this.cleanerCallback = new HashMap<>();
        this.mReaLayoutAnimator = null;
        this.mPendingDeletionsForTag = new HashMap<>();
        this.initOk = true;
        this.mReaLayoutAnimator = new ReaLayoutAnimator(reactApplicationContext, this);
        Class<? super Object> superclass = getClass().getSuperclass();
        if (superclass == null) {
            Log.e("reanimated", "unable to resolve super class of ReanimatedNativeHierarchyManager");
            return;
        }
        try {
            Field declaredField = superclass.getDeclaredField("mLayoutAnimator");
            declaredField.setAccessible(true);
            try {
                Field declaredField2 = Field.class.getDeclaredField("accessFlags");
                declaredField2.setAccessible(true);
                declaredField2.setInt(declaredField, declaredField.getModifiers() & (-17));
            } catch (IllegalAccessException | NoSuchFieldException e) {
                e.printStackTrace();
            }
            declaredField.set(this, this.mReaLayoutAnimator);
        } catch (IllegalAccessException | NoSuchFieldException e2) {
            this.initOk = false;
            e2.printStackTrace();
        }
        try {
            Field declaredField3 = superclass.getDeclaredField("mPendingDeletionsForTag");
            declaredField3.setAccessible(true);
            try {
                Field declaredField4 = Field.class.getDeclaredField("accessFlags");
                declaredField4.setAccessible(true);
                declaredField4.setInt(declaredField3, declaredField3.getModifiers() & (-17));
            } catch (IllegalAccessException | NoSuchFieldException e3) {
                e3.printStackTrace();
            }
            declaredField3.set(this, this.mPendingDeletionsForTag);
        } catch (IllegalAccessException | NoSuchFieldException e4) {
            this.initOk = false;
            e4.printStackTrace();
        }
        if (this.initOk) {
            setLayoutAnimationEnabled(true);
        }
    }

    private boolean isLayoutAnimationDisabled() {
        return !this.initOk || !((ReaLayoutAnimator) this.mReaLayoutAnimator).isLayoutAnimationEnabled();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public synchronized void dropView(View view) {
        if (isLayoutAnimationDisabled()) {
            super.dropView(view);
            return;
        }
        if (this.toBeRemoved.containsKey(Integer.valueOf(view.getId()))) {
            this.toBeRemoved.remove(Integer.valueOf(view.getId()));
        }
        if (this.cleanerCallback.containsKey(Integer.valueOf(view.getId()))) {
            this.cleanerCallback.remove(Integer.valueOf(view.getId()));
            this.cleanerCallback.get(Integer.valueOf(view.getId())).run();
        }
        super.dropView(view);
    }

    @Override // com.facebook.react.uimanager.NativeViewHierarchyManager
    public synchronized void manageChildren(int i, int[] iArr, ViewAtIndex[] viewAtIndexArr, int[] iArr2) {
        Set<Integer> set;
        ArrayList<View> arrayList;
        if (isLayoutAnimationDisabled()) {
            super.manageChildren(i, iArr, viewAtIndexArr, iArr2);
            return;
        }
        try {
            final ViewGroup viewGroup = (ViewGroup) resolveView(i);
            final ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i);
            if (viewGroupManager.getName().equals(ScreenStackViewManager.REACT_CLASS)) {
                super.manageChildren(i, iArr, viewAtIndexArr, iArr2);
                return;
            }
            if (this.toBeRemoved.containsKey(Integer.valueOf(i))) {
                HashSet hashSet = new HashSet();
                Iterator<View> it = this.toBeRemoved.get(Integer.valueOf(i)).iterator();
                while (it.hasNext()) {
                    hashSet.add(Integer.valueOf(it.next().getId()));
                }
                while (viewGroupManager.getChildCount(viewGroup) != 0 && hashSet.contains(Integer.valueOf(viewGroupManager.getChildAt(viewGroup, viewGroupManager.getChildCount(viewGroup) - 1).getId()))) {
                    viewGroupManager.removeViewAt(viewGroup, viewGroupManager.getChildCount(viewGroup) - 1);
                }
            }
            if (iArr2 != null) {
                if (!this.toBeRemoved.containsKey(Integer.valueOf(i))) {
                    this.toBeRemoved.put(Integer.valueOf(i), new ArrayList<>());
                }
                final ArrayList<View> arrayList2 = this.toBeRemoved.get(Integer.valueOf(i));
                int length = iArr2.length;
                int i2 = 0;
                while (i2 < length) {
                    try {
                        final View resolveView = resolveView(Integer.valueOf(iArr2[i2]).intValue());
                        arrayList2.add(resolveView);
                        arrayList = arrayList2;
                        this.cleanerCallback.put(Integer.valueOf(resolveView.getId()), new Runnable() { // from class: com.swmansion.reanimated.layoutReanimation.ReanimatedNativeHierarchyManager.1
                            @Override // java.lang.Runnable
                            public void run() {
                                arrayList2.remove(resolveView);
                                viewGroupManager.removeView(viewGroup, resolveView);
                            }
                        });
                    } catch (IllegalViewOperationException e) {
                        arrayList = arrayList2;
                        e.printStackTrace();
                    }
                    i2++;
                    arrayList2 = arrayList;
                }
            }
            HashMap<Integer, Set<Integer>> hashMap = this.mPendingDeletionsForTag;
            if (!(hashMap == null || (set = hashMap.get(Integer.valueOf(i))) == null)) {
                set.clear();
            }
            super.manageChildren(i, iArr, viewAtIndexArr, null);
            if (this.toBeRemoved.containsKey(Integer.valueOf(i))) {
                Iterator<View> it2 = this.toBeRemoved.get(Integer.valueOf(i)).iterator();
                while (it2.hasNext()) {
                    viewGroupManager.addView(viewGroup, it2.next(), viewGroupManager.getChildCount(viewGroup));
                }
            }
            super.manageChildren(i, null, null, iArr2);
        } catch (IllegalViewOperationException e2) {
            e2.printStackTrace();
            super.manageChildren(i, iArr, viewAtIndexArr, iArr2);
        }
    }

    public void publicDropView(View view) {
        dropView(view);
    }

    public ReanimatedNativeHierarchyManager(ViewManagerRegistry viewManagerRegistry, RootViewManager rootViewManager) {
        super(viewManagerRegistry, rootViewManager);
        this.toBeRemoved = new HashMap<>();
        this.cleanerCallback = new HashMap<>();
        this.mReaLayoutAnimator = null;
        this.mPendingDeletionsForTag = new HashMap<>();
        this.initOk = true;
    }
}
