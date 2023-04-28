package com.facebook.react.fabric.mounting;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.fabric.GuardedFrameCallback;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.touch.JSResponderHandler;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.ReactOverflowViewWithInset;
import com.facebook.react.uimanager.ReactRoot;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.facebook.react.uimanager.events.EventCategoryDef;
import com.facebook.react.views.view.ReactMapBufferViewManager;
import com.facebook.react.views.view.ReactViewManagerWrapper;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;
import p059d6.C6399a;
import p163j$.util.concurrent.ConcurrentHashMap;
import p414x3.C13925a;

/* loaded from: classes7.dex */
public class SurfaceMountingManager {
    private static final boolean SHOW_CHANGED_VIEW_HIERARCHIES = false;
    public static final String TAG = "SurfaceMountingManager";
    private JSResponderHandler mJSResponderHandler;
    private MountingManager.MountItemExecutor mMountItemExecutor;
    private RemoveDeleteTreeUIFrameCallback mRemoveDeleteTreeUIFrameCallback;
    private RootViewManager mRootViewManager;
    private Set<Integer> mScheduledForDeletionViewStateTags;
    private Set<Integer> mSoftDeletedViewStateTags;
    private final int mSurfaceId;
    private Set<Integer> mTagSetForStoppedSurface;
    private ThemedReactContext mThemedReactContext;
    private ViewManagerRegistry mViewManagerRegistry;
    private volatile boolean mIsStopped = false;
    private volatile boolean mRootViewAttached = false;
    private ConcurrentHashMap<Integer, ViewState> mTagToViewState = new ConcurrentHashMap<>();
    private ConcurrentLinkedQueue<MountItem> mOnViewAttachItems = new ConcurrentLinkedQueue<>();
    private final Stack<Integer> mReactTagsToRemove = new Stack<>();
    private final Set<Integer> mErroneouslyReaddedReactTags = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public class RemoveDeleteTreeUIFrameCallback extends GuardedFrameCallback {
        private static final long FRAME_TIME_MS = 16;
        private static final long MAX_TIME_IN_FRAME = 9;

        private boolean haveExceededNonBatchedFrameTime(long j) {
            return FRAME_TIME_MS - ((System.nanoTime() - j) / 1000000) < MAX_TIME_IN_FRAME;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00a3 A[Catch: all -> 0x00f1, TryCatch #0 {all -> 0x00f1, blocks: (B:3:0x0007, B:5:0x0013, B:7:0x0035, B:8:0x0056, B:10:0x0061, B:13:0x0069, B:15:0x0072, B:17:0x0078, B:22:0x0084, B:25:0x0094, B:27:0x009b, B:30:0x00a3, B:31:0x00ac, B:33:0x00c2), top: B:46:0x0007, inners: #1 }] */
        @Override // com.facebook.react.fabric.GuardedFrameCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void doFrameGuarded(long r12) {
            /*
                Method dump skipped, instructions count: 283
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.fabric.mounting.SurfaceMountingManager.RemoveDeleteTreeUIFrameCallback.doFrameGuarded(long):void");
        }

        private RemoveDeleteTreeUIFrameCallback(ReactContext reactContext) {
            super(reactContext);
        }
    }

    /* loaded from: classes7.dex */
    public static class ViewEvent {
        private final boolean mCanCoalesceEvent;
        private final int mCustomCoalesceKey;
        @EventCategoryDef
        private final int mEventCategory;
        private final String mEventName;
        private WritableMap mParams;

        public ViewEvent(String str, WritableMap writableMap, @EventCategoryDef int i, boolean z, int i2) {
            this.mEventName = str;
            this.mParams = writableMap;
            this.mEventCategory = i;
            this.mCanCoalesceEvent = z;
            this.mCustomCoalesceKey = i2;
        }

        public boolean canCoalesceEvent() {
            return this.mCanCoalesceEvent;
        }

        public int getCustomCoalesceKey() {
            return this.mCustomCoalesceKey;
        }

        @EventCategoryDef
        public int getEventCategory() {
            return this.mEventCategory;
        }

        public String getEventName() {
            return this.mEventName;
        }

        public WritableMap getParams() {
            return this.mParams;
        }
    }

    public SurfaceMountingManager(int i, JSResponderHandler jSResponderHandler, ViewManagerRegistry viewManagerRegistry, RootViewManager rootViewManager, MountingManager.MountItemExecutor mountItemExecutor, ThemedReactContext themedReactContext) {
        this.mSurfaceId = i;
        this.mJSResponderHandler = jSResponderHandler;
        this.mViewManagerRegistry = viewManagerRegistry;
        this.mRootViewManager = rootViewManager;
        this.mMountItemExecutor = mountItemExecutor;
        this.mThemedReactContext = themedReactContext;
        if (ReactFeatureFlags.enableDelayedViewStateDeletion) {
            this.mSoftDeletedViewStateTags = new HashSet();
            this.mScheduledForDeletionViewStateTags = new HashSet();
        }
    }

    private void addRootView(final View view) {
        if (!isStopped()) {
            this.mTagToViewState.put(Integer.valueOf(this.mSurfaceId), new ViewState(this.mSurfaceId, view, new ReactViewManagerWrapper.DefaultViewManager(this.mRootViewManager), true));
            Runnable runnable = new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager.1
                @Override // java.lang.Runnable
                public void run() {
                    if (!SurfaceMountingManager.this.isStopped()) {
                        if (view.getId() == SurfaceMountingManager.this.mSurfaceId) {
                            String str = SurfaceMountingManager.TAG;
                            ReactSoftExceptionLogger.logSoftException(str, new IllegalViewOperationException("Race condition in addRootView detected. Trying to set an id of [" + SurfaceMountingManager.this.mSurfaceId + "] on the RootView, but that id has already been set. "));
                        } else if (view.getId() != -1) {
                            C13925a.m2286l(SurfaceMountingManager.TAG, "Trying to add RootTag to RootView that already has a tag: existing tag: [%d] new tag: [%d]", Integer.valueOf(view.getId()), Integer.valueOf(SurfaceMountingManager.this.mSurfaceId));
                            throw new IllegalViewOperationException("Trying to add a root view with an explicit id already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
                        }
                        view.setId(SurfaceMountingManager.this.mSurfaceId);
                        View view2 = view;
                        if (view2 instanceof ReactRoot) {
                            ((ReactRoot) view2).setRootViewTag(SurfaceMountingManager.this.mSurfaceId);
                        }
                        SurfaceMountingManager.this.mRootViewAttached = true;
                        SurfaceMountingManager.this.executeViewAttachMountItems();
                    }
                }
            };
            if (UiThreadUtil.isOnUiThread()) {
                runnable.run();
            } else {
                UiThreadUtil.runOnUiThread(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeViewAttachMountItems() {
        this.mMountItemExecutor.executeItems(this.mOnViewAttachItems);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewState getNullableViewState(int i) {
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null) {
            return null;
        }
        if (ReactFeatureFlags.enableDelayedViewStateDeletion) {
            this.mScheduledForDeletionViewStateTags.remove(Integer.valueOf(i));
        }
        return concurrentHashMap.get(Integer.valueOf(i));
    }

    private static ViewGroupManager<ViewGroup> getViewGroupManager(ViewState viewState) {
        ReactViewManagerWrapper reactViewManagerWrapper = viewState.mViewManager;
        if (reactViewManagerWrapper != null) {
            return reactViewManagerWrapper.getViewGroupManager();
        }
        throw new IllegalStateException("Unable to find ViewManager for view: " + viewState);
    }

    private ViewState getViewState(int i) {
        ViewState viewState = this.mTagToViewState.get(Integer.valueOf(i));
        if (viewState != null) {
            if (ReactFeatureFlags.enableDelayedViewStateDeletion) {
                this.mScheduledForDeletionViewStateTags.remove(Integer.valueOf(i));
            }
            return viewState;
        }
        throw new RetryableMountingLayerException("Unable to find viewState for tag " + i + ". Surface stopped: " + isStopped());
    }

    private static void logViewHierarchy(ViewGroup viewGroup, boolean z) {
        ViewGroup viewGroup2;
        int i;
        int id2 = viewGroup.getId();
        String str = TAG;
        C13925a.m2288j(str, "  <ViewGroup tag=" + id2 + " class=" + viewGroup.getClass().toString() + ">");
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            String str2 = TAG;
            C13925a.m2288j(str2, "     <View idx=" + i2 + " tag=" + viewGroup.getChildAt(i2).getId() + " class=" + viewGroup.getChildAt(i2).getClass().toString() + ">");
        }
        String str3 = TAG;
        C13925a.m2288j(str3, "  </ViewGroup tag=" + id2 + ">");
        if (z) {
            C13925a.m2288j(str3, "Displaying Ancestors:");
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) parent;
                } else {
                    viewGroup2 = null;
                }
                if (viewGroup2 == null) {
                    i = -1;
                } else {
                    i = viewGroup2.getId();
                }
                String str4 = TAG;
                C13925a.m2288j(str4, "<ViewParent tag=" + i + " class=" + parent.getClass().toString() + ">");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onViewStateDeleted(ViewState viewState) {
        StateWrapper stateWrapper = viewState.mStateWrapper;
        if (stateWrapper != null) {
            stateWrapper.destroyState();
            viewState.mStateWrapper = null;
        }
        EventEmitterWrapper eventEmitterWrapper = viewState.mEventEmitter;
        if (eventEmitterWrapper != null) {
            eventEmitterWrapper.destroy();
            viewState.mEventEmitter = null;
        }
        ReactViewManagerWrapper reactViewManagerWrapper = viewState.mViewManager;
        if (!viewState.mIsRoot && reactViewManagerWrapper != null) {
            reactViewManagerWrapper.onDropViewInstance(viewState.mView);
        }
    }

    private void runDeferredTagRemovalAndDeletion() {
        if (this.mReactTagsToRemove.empty()) {
            if (this.mRemoveDeleteTreeUIFrameCallback == null) {
                this.mRemoveDeleteTreeUIFrameCallback = new RemoveDeleteTreeUIFrameCallback(this.mThemedReactContext);
            }
            ReactChoreographer.getInstance().postFrameCallback(ReactChoreographer.CallbackType.IDLE_EVENT, this.mRemoveDeleteTreeUIFrameCallback);
        }
    }

    public void addViewAt(int i, int i2, int i3) {
        int i4;
        UiThreadUtil.assertOnUiThread();
        if (!isStopped()) {
            ViewState viewState = getViewState(i);
            View view = viewState.mView;
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                ViewState viewState2 = getViewState(i2);
                View view2 = viewState2.mView;
                if (view2 != null) {
                    ViewParent parent = view2.getParent();
                    if (parent != null) {
                        boolean z = parent instanceof ViewGroup;
                        if (z) {
                            i4 = ((ViewGroup) parent).getId();
                        } else {
                            i4 = -1;
                        }
                        ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("addViewAt: cannot insert view [" + i2 + "] into parent [" + i + "]: View already has a parent: [" + i4 + "]  Parent: " + parent.getClass().getSimpleName() + " View: " + view2.getClass().getSimpleName()));
                        if (z) {
                            ((ViewGroup) parent).removeView(view2);
                        }
                        this.mErroneouslyReaddedReactTags.add(Integer.valueOf(i2));
                    }
                    try {
                        getViewGroupManager(viewState).addView(viewGroup, view2, i3);
                    } catch (IllegalStateException e) {
                        throw new IllegalStateException("addViewAt: failed to insert view [" + i2 + "] into parent [" + i + "] at index " + i3, e);
                    }
                } else {
                    throw new IllegalStateException("Unable to find view for viewState " + viewState2 + " and tag " + i2);
                }
            } else {
                String str = "Unable to add a view into a view that is not a ViewGroup. ParentTag: " + i + " - Tag: " + i2 + " - Index: " + i3;
                C13925a.m2288j(TAG, str);
                throw new IllegalStateException(str);
            }
        }
    }

    public void attachRootView(View view, ThemedReactContext themedReactContext) {
        this.mThemedReactContext = themedReactContext;
        addRootView(view);
    }

    public void createView(String str, int i, Object obj, StateWrapper stateWrapper, EventEmitterWrapper eventEmitterWrapper, boolean z) {
        if (!isStopped()) {
            ViewState nullableViewState = getNullableViewState(i);
            if (nullableViewState == null || nullableViewState.mView == null) {
                createViewUnsafe(str, i, obj, stateWrapper, eventEmitterWrapper, z);
            }
        }
    }

    public void createViewUnsafe(String str, int i, Object obj, StateWrapper stateWrapper, EventEmitterWrapper eventEmitterWrapper, boolean z) {
        Object obj2;
        View view;
        ReactViewManagerWrapper reactViewManagerWrapper;
        if (obj instanceof ReadableMap) {
            obj2 = new ReactStylesDiffMap((ReadableMap) obj);
        } else {
            obj2 = obj;
        }
        if (z) {
            if (obj instanceof ReadableMapBuffer) {
                reactViewManagerWrapper = ReactMapBufferViewManager.INSTANCE;
            } else {
                reactViewManagerWrapper = new ReactViewManagerWrapper.DefaultViewManager(this.mViewManagerRegistry.get(str));
            }
            view = reactViewManagerWrapper.createView(i, this.mThemedReactContext, obj2, stateWrapper, this.mJSResponderHandler);
        } else {
            reactViewManagerWrapper = null;
            view = null;
        }
        ViewState viewState = new ViewState(i, view, reactViewManagerWrapper);
        viewState.mCurrentProps = obj2;
        viewState.mStateWrapper = stateWrapper;
        viewState.mEventEmitter = eventEmitterWrapper;
        this.mTagToViewState.put(Integer.valueOf(i), viewState);
    }

    public void deleteView(int i) {
        UiThreadUtil.assertOnUiThread();
        if (!isStopped()) {
            ViewState nullableViewState = getNullableViewState(i);
            if (nullableViewState == null) {
                String str = MountingManager.TAG;
                ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Unable to find viewState for tag: " + i + " for deleteView"));
            } else if (ReactFeatureFlags.enableDelayedViewStateDeletion) {
                this.mSoftDeletedViewStateTags.add(Integer.valueOf(i));
            } else {
                this.mTagToViewState.remove(Integer.valueOf(i));
                onViewStateDeleted(nullableViewState);
            }
        }
    }

    public void didUpdateViews() {
        if (ReactFeatureFlags.enableDelayedViewStateDeletion) {
            for (Integer num : this.mScheduledForDeletionViewStateTags) {
                ViewState remove = this.mTagToViewState.remove(num);
                if (remove != null) {
                    onViewStateDeleted(remove);
                }
            }
            this.mScheduledForDeletionViewStateTags = this.mSoftDeletedViewStateTags;
            this.mSoftDeletedViewStateTags = new HashSet();
        }
    }

    public void enqueuePendingEvent(int i, ViewEvent viewEvent) {
        ViewState viewState;
        boolean z;
        UiThreadUtil.assertOnUiThread();
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap != null && (viewState = concurrentHashMap.get(Integer.valueOf(i))) != null) {
            if (viewState.mEventEmitter == null) {
                z = true;
            } else {
                z = false;
            }
            C6399a.m25623b(z, "Only queue pending events when event emitter is null for the given view state");
            if (viewState.mPendingEventQueue == null) {
                viewState.mPendingEventQueue = new LinkedList();
            }
            viewState.mPendingEventQueue.add(viewEvent);
        }
    }

    public void executeOnViewAttach(MountItem mountItem) {
        this.mOnViewAttachItems.add(mountItem);
    }

    public ThemedReactContext getContext() {
        return this.mThemedReactContext;
    }

    public EventEmitterWrapper getEventEmitter(int i) {
        ViewState nullableViewState = getNullableViewState(i);
        if (nullableViewState == null) {
            return null;
        }
        return nullableViewState.mEventEmitter;
    }

    public int getSurfaceId() {
        return this.mSurfaceId;
    }

    public View getView(int i) {
        View view;
        ViewState nullableViewState = getNullableViewState(i);
        if (nullableViewState == null) {
            view = null;
        } else {
            view = nullableViewState.mView;
        }
        if (view != null) {
            return view;
        }
        throw new IllegalViewOperationException("Trying to resolve view with tag " + i + " which doesn't exist");
    }

    public boolean getViewExists(int i) {
        Set<Integer> set = this.mTagSetForStoppedSurface;
        if (set != null && set.contains(Integer.valueOf(i))) {
            return true;
        }
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null) {
            return false;
        }
        return concurrentHashMap.containsKey(Integer.valueOf(i));
    }

    public boolean isRootViewAttached() {
        return this.mRootViewAttached;
    }

    public boolean isStopped() {
        return this.mIsStopped;
    }

    public void preallocateView(String str, int i, Object obj, StateWrapper stateWrapper, EventEmitterWrapper eventEmitterWrapper, boolean z) {
        UiThreadUtil.assertOnUiThread();
        if (!isStopped() && getNullableViewState(i) == null) {
            createViewUnsafe(str, i, obj, stateWrapper, eventEmitterWrapper, z);
        }
    }

    public void printSurfaceState() {
        String str;
        View view;
        C13925a.m2286l(TAG, "Views created for surface {%d}:", Integer.valueOf(getSurfaceId()));
        for (ViewState viewState : this.mTagToViewState.values()) {
            ReactViewManagerWrapper reactViewManagerWrapper = viewState.mViewManager;
            Integer num = null;
            if (reactViewManagerWrapper != null) {
                str = reactViewManagerWrapper.getName();
            } else {
                str = null;
            }
            View view2 = viewState.mView;
            if (view2 != null) {
                view = (View) view2.getParent();
            } else {
                view = null;
            }
            if (view != null) {
                num = Integer.valueOf(view.getId());
            }
            C13925a.m2286l(TAG, "<%s id=%d parentTag=%s isRoot=%b />", str, Integer.valueOf(viewState.mReactTag), num, Boolean.valueOf(viewState.mIsRoot));
        }
    }

    @Deprecated
    public void receiveCommand(int i, int i2, ReadableArray readableArray) {
        if (!isStopped()) {
            ViewState nullableViewState = getNullableViewState(i);
            if (nullableViewState != null) {
                ReactViewManagerWrapper reactViewManagerWrapper = nullableViewState.mViewManager;
                if (reactViewManagerWrapper != null) {
                    View view = nullableViewState.mView;
                    if (view != null) {
                        reactViewManagerWrapper.receiveCommand(view, i2, readableArray);
                        return;
                    }
                    throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i);
                }
                throw new RetryableMountingLayerException("Unable to find viewManager for tag " + i);
            }
            throw new RetryableMountingLayerException("Unable to find viewState for tag: [" + i + "] for commandId: " + i2);
        }
    }

    public void removeDeleteTreeAt(int i, int i2, int i3) {
        int i4;
        if (!isStopped()) {
            UiThreadUtil.assertOnUiThread();
            ViewState nullableViewState = getNullableViewState(i2);
            if (nullableViewState == null) {
                ReactSoftExceptionLogger.logSoftException(MountingManager.TAG, new IllegalStateException("Unable to find viewState for tag: [" + i2 + "] for removeDeleteTreeAt"));
                return;
            }
            View view = nullableViewState.mView;
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup != null) {
                    ViewGroupManager<ViewGroup> viewGroupManager = getViewGroupManager(nullableViewState);
                    View childAt = viewGroupManager.getChildAt(viewGroup, i3);
                    if (childAt != null) {
                        i4 = childAt.getId();
                    } else {
                        i4 = -1;
                    }
                    if (i4 != i) {
                        int childCount = viewGroup.getChildCount();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= childCount) {
                                i5 = -1;
                                break;
                            } else if (viewGroup.getChildAt(i5).getId() == i) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        if (i5 == -1) {
                            C13925a.m2288j(TAG, "removeDeleteTreeAt: [" + i + "] -> [" + i2 + "] @" + i3 + ": view already removed from parent! Children in parent: " + childCount);
                            return;
                        }
                        logViewHierarchy(viewGroup, true);
                        ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Tried to remove+delete view [" + i + "] of parent [" + i2 + "] at index " + i3 + ", but got view tag " + i4 + " - actual index of view: " + i5));
                        i3 = i5;
                    }
                    try {
                        viewGroupManager.removeViewAt(viewGroup, i3);
                        runDeferredTagRemovalAndDeletion();
                        this.mReactTagsToRemove.push(Integer.valueOf(i));
                    } catch (RuntimeException e) {
                        int childCount2 = viewGroupManager.getChildCount(viewGroup);
                        logViewHierarchy(viewGroup, true);
                        throw new IllegalStateException("Cannot remove child at index " + i3 + " from parent ViewGroup [" + viewGroup.getId() + "], only " + childCount2 + " children in parent. Warning: childCount may be incorrect!", e);
                    }
                } else {
                    throw new IllegalStateException("Unable to find view for tag [" + i2 + "]");
                }
            } else {
                String str = "Unable to remove+delete a view from a view that is not a ViewGroup. ParentTag: " + i2 + " - Tag: " + i + " - Index: " + i3;
                C13925a.m2288j(TAG, str);
                throw new IllegalStateException(str);
            }
        }
    }

    public void removeViewAt(int i, int i2, int i3) {
        int i4;
        if (!isStopped()) {
            if (this.mErroneouslyReaddedReactTags.contains(Integer.valueOf(i))) {
                ReactSoftExceptionLogger.logSoftException(TAG, new IllegalViewOperationException("removeViewAt tried to remove a React View that was actually reused. This indicates a bug in the Differ (specifically instruction ordering). [" + i + "]"));
                return;
            }
            UiThreadUtil.assertOnUiThread();
            ViewState nullableViewState = getNullableViewState(i2);
            if (nullableViewState == null) {
                ReactSoftExceptionLogger.logSoftException(MountingManager.TAG, new IllegalStateException("Unable to find viewState for tag: [" + i2 + "] for removeViewAt"));
                return;
            }
            View view = nullableViewState.mView;
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup != null) {
                    ViewGroupManager<ViewGroup> viewGroupManager = getViewGroupManager(nullableViewState);
                    View childAt = viewGroupManager.getChildAt(viewGroup, i3);
                    if (childAt != null) {
                        i4 = childAt.getId();
                    } else {
                        i4 = -1;
                    }
                    if (i4 != i) {
                        int childCount = viewGroup.getChildCount();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= childCount) {
                                i5 = -1;
                                break;
                            } else if (viewGroup.getChildAt(i5).getId() == i) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        if (i5 == -1) {
                            C13925a.m2288j(TAG, "removeViewAt: [" + i + "] -> [" + i2 + "] @" + i3 + ": view already removed from parent! Children in parent: " + childCount);
                            return;
                        }
                        logViewHierarchy(viewGroup, true);
                        ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Tried to remove view [" + i + "] of parent [" + i2 + "] at index " + i3 + ", but got view tag " + i4 + " - actual index of view: " + i5));
                        i3 = i5;
                    }
                    try {
                        viewGroupManager.removeViewAt(viewGroup, i3);
                    } catch (RuntimeException e) {
                        int childCount2 = viewGroupManager.getChildCount(viewGroup);
                        logViewHierarchy(viewGroup, true);
                        throw new IllegalStateException("Cannot remove child at index " + i3 + " from parent ViewGroup [" + viewGroup.getId() + "], only " + childCount2 + " children in parent. Warning: childCount may be incorrect!", e);
                    }
                } else {
                    throw new IllegalStateException("Unable to find view for tag [" + i2 + "]");
                }
            } else {
                String str = "Unable to remove a view from a view that is not a ViewGroup. ParentTag: " + i2 + " - Tag: " + i + " - Index: " + i3;
                C13925a.m2288j(TAG, str);
                throw new IllegalStateException(str);
            }
        }
    }

    public void sendAccessibilityEvent(int i, int i2) {
        if (!isStopped()) {
            ViewState viewState = getViewState(i);
            if (viewState.mViewManager != null) {
                View view = viewState.mView;
                if (view != null) {
                    view.sendAccessibilityEvent(i2);
                    return;
                }
                throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i);
            }
            throw new RetryableMountingLayerException("Unable to find viewState manager for tag " + i);
        }
    }

    public synchronized void setJSResponder(int i, int i2, boolean z) {
        UiThreadUtil.assertOnUiThread();
        if (!isStopped()) {
            if (!z) {
                this.mJSResponderHandler.setJSResponder(i2, null);
                return;
            }
            ViewState viewState = getViewState(i);
            View view = viewState.mView;
            if (i2 != i && (view instanceof ViewParent)) {
                this.mJSResponderHandler.setJSResponder(i2, (ViewParent) view);
            } else if (view == null) {
                SoftAssertions.assertUnreachable("Cannot find view for tag [" + i + "].");
            } else {
                if (viewState.mIsRoot) {
                    SoftAssertions.assertUnreachable("Cannot block native responder on [" + i + "] that is a root view");
                }
                this.mJSResponderHandler.setJSResponder(i2, view.getParent());
            }
        }
    }

    public void stopSurface() {
        EventEmitterWrapper eventEmitterWrapper;
        if (!isStopped()) {
            this.mIsStopped = true;
            for (ViewState viewState : this.mTagToViewState.values()) {
                StateWrapper stateWrapper = viewState.mStateWrapper;
                if (stateWrapper != null) {
                    stateWrapper.destroyState();
                    viewState.mStateWrapper = null;
                }
                if (ReactFeatureFlags.enableAggressiveEventEmitterCleanup && (eventEmitterWrapper = viewState.mEventEmitter) != null) {
                    eventEmitterWrapper.destroy();
                    viewState.mEventEmitter = null;
                }
            }
            Runnable runnable = new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager.2
                @Override // java.lang.Runnable
                public void run() {
                    for (ViewState viewState2 : SurfaceMountingManager.this.mTagToViewState.values()) {
                        SurfaceMountingManager.this.onViewStateDeleted(viewState2);
                    }
                    SurfaceMountingManager surfaceMountingManager = SurfaceMountingManager.this;
                    surfaceMountingManager.mTagSetForStoppedSurface = surfaceMountingManager.mTagToViewState.keySet();
                    SurfaceMountingManager.this.mTagToViewState = null;
                    SurfaceMountingManager.this.mJSResponderHandler = null;
                    SurfaceMountingManager.this.mRootViewManager = null;
                    SurfaceMountingManager.this.mMountItemExecutor = null;
                    SurfaceMountingManager.this.mOnViewAttachItems.clear();
                    if (ReactFeatureFlags.enableViewRecycling) {
                        SurfaceMountingManager.this.mViewManagerRegistry.onSurfaceStopped(SurfaceMountingManager.this.mSurfaceId);
                    }
                }
            };
            if (UiThreadUtil.isOnUiThread()) {
                runnable.run();
            } else {
                UiThreadUtil.runOnUiThread(runnable);
            }
        }
    }

    public void updateEventEmitter(int i, EventEmitterWrapper eventEmitterWrapper) {
        UiThreadUtil.assertOnUiThread();
        if (!isStopped()) {
            ViewState viewState = this.mTagToViewState.get(Integer.valueOf(i));
            if (viewState == null) {
                viewState = new ViewState(i, (View) null, (ReactViewManagerWrapper) null);
                this.mTagToViewState.put(Integer.valueOf(i), viewState);
            }
            EventEmitterWrapper eventEmitterWrapper2 = viewState.mEventEmitter;
            viewState.mEventEmitter = eventEmitterWrapper;
            if (!(eventEmitterWrapper2 == eventEmitterWrapper || eventEmitterWrapper2 == null)) {
                eventEmitterWrapper2.destroy();
            }
            Queue<ViewEvent> queue = viewState.mPendingEventQueue;
            if (queue != null) {
                for (ViewEvent viewEvent : queue) {
                    if (viewEvent.canCoalesceEvent()) {
                        eventEmitterWrapper.invokeUnique(viewEvent.getEventName(), viewEvent.getParams(), viewEvent.getCustomCoalesceKey());
                    } else {
                        eventEmitterWrapper.invoke(viewEvent.getEventName(), viewEvent.getParams(), viewEvent.getEventCategory());
                    }
                }
                viewState.mPendingEventQueue = null;
            }
        }
    }

    public void updateLayout(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        if (!isStopped()) {
            ViewState viewState = getViewState(i);
            if (!viewState.mIsRoot) {
                View view = viewState.mView;
                if (view != null) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
                    ViewParent parent = view.getParent();
                    if (parent instanceof RootView) {
                        parent.requestLayout();
                    }
                    view.layout(i2, i3, i4 + i2, i5 + i3);
                    if (i6 == 0) {
                        i7 = 4;
                    } else {
                        i7 = 0;
                    }
                    if (view.getVisibility() != i7) {
                        view.setVisibility(i7);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Unable to find View for tag: " + i);
            }
        }
    }

    public void updateOverflowInset(int i, int i2, int i3, int i4, int i5) {
        if (!isStopped()) {
            ViewState viewState = getViewState(i);
            if (!viewState.mIsRoot) {
                View view = viewState.mView;
                if (view == null) {
                    throw new IllegalStateException("Unable to find View for tag: " + i);
                } else if (view instanceof ReactOverflowViewWithInset) {
                    ((ReactOverflowViewWithInset) view).setOverflowInset(i2, i3, i4, i5);
                }
            }
        }
    }

    public void updatePadding(int i, int i2, int i3, int i4, int i5) {
        UiThreadUtil.assertOnUiThread();
        if (!isStopped()) {
            ViewState viewState = getViewState(i);
            if (!viewState.mIsRoot) {
                View view = viewState.mView;
                if (view != null) {
                    ReactViewManagerWrapper reactViewManagerWrapper = viewState.mViewManager;
                    if (reactViewManagerWrapper != null) {
                        reactViewManagerWrapper.setPadding(view, i2, i3, i4, i5);
                        return;
                    }
                    throw new IllegalStateException("Unable to find ViewManager for view: " + viewState);
                }
                throw new IllegalStateException("Unable to find View for tag: " + i);
            }
        }
    }

    public void updateProps(int i, Object obj) {
        if (!isStopped()) {
            ViewState viewState = getViewState(i);
            if (obj instanceof ReadableMap) {
                obj = new ReactStylesDiffMap((ReadableMap) obj);
            }
            viewState.mCurrentProps = obj;
            View view = viewState.mView;
            if (view != null) {
                ((ReactViewManagerWrapper) C6399a.m25622c(viewState.mViewManager)).updateProperties(view, viewState.mCurrentProps);
                return;
            }
            throw new IllegalStateException("Unable to find view for tag [" + i + "]");
        }
    }

    public void updateState(int i, StateWrapper stateWrapper) {
        UiThreadUtil.assertOnUiThread();
        if (!isStopped()) {
            ViewState viewState = getViewState(i);
            StateWrapper stateWrapper2 = viewState.mStateWrapper;
            viewState.mStateWrapper = stateWrapper;
            ReactViewManagerWrapper reactViewManagerWrapper = viewState.mViewManager;
            if (reactViewManagerWrapper != null) {
                Object updateState = reactViewManagerWrapper.updateState(viewState.mView, viewState.mCurrentProps, stateWrapper);
                if (updateState != null) {
                    reactViewManagerWrapper.updateExtraData(viewState.mView, updateState);
                }
                if (stateWrapper2 != null) {
                    stateWrapper2.destroyState();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Unable to find ViewManager for tag: " + i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static class ViewState {
        public ReadableMap mCurrentLocalData;
        public Object mCurrentProps;
        public EventEmitterWrapper mEventEmitter;
        final boolean mIsRoot;
        public Queue<ViewEvent> mPendingEventQueue;
        final int mReactTag;
        public StateWrapper mStateWrapper;
        final View mView;
        final ReactViewManagerWrapper mViewManager;

        public String toString() {
            boolean z;
            if (this.mViewManager == null) {
                z = true;
            } else {
                z = false;
            }
            return "ViewState [" + this.mReactTag + "] - isRoot: " + this.mIsRoot + " - props: " + this.mCurrentProps + " - localData: " + this.mCurrentLocalData + " - viewManager: " + this.mViewManager + " - isLayoutOnly: " + z;
        }

        private ViewState(int i, View view, ReactViewManagerWrapper reactViewManagerWrapper) {
            this(i, view, reactViewManagerWrapper, false);
        }

        private ViewState(int i, View view, ReactViewManagerWrapper reactViewManagerWrapper, boolean z) {
            this.mCurrentProps = null;
            this.mCurrentLocalData = null;
            this.mStateWrapper = null;
            this.mEventEmitter = null;
            this.mPendingEventQueue = null;
            this.mReactTag = i;
            this.mView = view;
            this.mIsRoot = z;
            this.mViewManager = reactViewManagerWrapper;
        }
    }

    public void receiveCommand(int i, String str, ReadableArray readableArray) {
        if (!isStopped()) {
            ViewState nullableViewState = getNullableViewState(i);
            if (nullableViewState != null) {
                ReactViewManagerWrapper reactViewManagerWrapper = nullableViewState.mViewManager;
                if (reactViewManagerWrapper != null) {
                    View view = nullableViewState.mView;
                    if (view != null) {
                        reactViewManagerWrapper.receiveCommand(view, str, readableArray);
                        return;
                    }
                    throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i);
                }
                throw new RetryableMountingLayerException("Unable to find viewState manager for tag " + i);
            }
            throw new RetryableMountingLayerException("Unable to find viewState for tag: " + i + " for commandId: " + str);
        }
    }
}
