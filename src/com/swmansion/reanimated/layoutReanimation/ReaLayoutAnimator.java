package com.swmansion.reanimated.layoutReanimation;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.layoutanimation.LayoutAnimationController;
import com.facebook.react.uimanager.layoutanimation.LayoutAnimationListener;
import com.swmansion.reanimated.ReanimatedModule;
import com.swmansion.rnscreens.ScreenStackViewManager;
import com.swmansion.rnscreens.ScreenViewManager;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ReaLayoutAnimator extends LayoutAnimationController {
    private ReactApplicationContext mContext;
    private WeakReference<NativeViewHierarchyManager> mWeakNativeViewHierarchyManage;
    private AnimationsManager mAnimationsManager = null;
    private volatile boolean mInitialized = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReaLayoutAnimator(ReactApplicationContext reactApplicationContext, NativeViewHierarchyManager nativeViewHierarchyManager) {
        this.mWeakNativeViewHierarchyManage = new WeakReference<>(null);
        this.mContext = reactApplicationContext;
        this.mWeakNativeViewHierarchyManage = new WeakReference<>(nativeViewHierarchyManager);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void dfs(final android.view.View r6, final com.facebook.react.uimanager.NativeViewHierarchyManager r7) {
        /*
            r5 = this;
            int r0 = r6.getId()
            r1 = -1
            if (r0 != r1) goto L_0x0008
            return
        L_0x0008:
            com.facebook.react.uimanager.ViewManager r0 = r7.resolveViewManager(r0)     // Catch: IllegalViewOperationException -> 0x002c
            com.swmansion.reanimated.layoutReanimation.Snapshot r1 = new com.swmansion.reanimated.layoutReanimation.Snapshot     // Catch: IllegalViewOperationException -> 0x002a
            java.lang.ref.WeakReference<com.facebook.react.uimanager.NativeViewHierarchyManager> r2 = r5.mWeakNativeViewHierarchyManage     // Catch: IllegalViewOperationException -> 0x002a
            java.lang.Object r2 = r2.get()     // Catch: IllegalViewOperationException -> 0x002a
            com.facebook.react.uimanager.NativeViewHierarchyManager r2 = (com.facebook.react.uimanager.NativeViewHierarchyManager) r2     // Catch: IllegalViewOperationException -> 0x002a
            r1.<init>(r6, r2)     // Catch: IllegalViewOperationException -> 0x002a
            com.swmansion.reanimated.layoutReanimation.AnimationsManager r2 = r5.mAnimationsManager     // Catch: IllegalViewOperationException -> 0x002a
            android.view.ViewParent r3 = r6.getParent()     // Catch: IllegalViewOperationException -> 0x002a
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3     // Catch: IllegalViewOperationException -> 0x002a
            com.swmansion.reanimated.layoutReanimation.c r4 = new com.swmansion.reanimated.layoutReanimation.c     // Catch: IllegalViewOperationException -> 0x002a
            r4.<init>()     // Catch: IllegalViewOperationException -> 0x002a
            r2.onViewRemoval(r6, r3, r1, r4)     // Catch: IllegalViewOperationException -> 0x002a
            goto L_0x0031
        L_0x002a:
            r1 = move-exception
            goto L_0x002e
        L_0x002c:
            r1 = move-exception
            r0 = 0
        L_0x002e:
            r1.printStackTrace()
        L_0x0031:
            boolean r1 = r0 instanceof com.facebook.react.uimanager.ViewGroupManager
            if (r1 == 0) goto L_0x004b
            com.facebook.react.uimanager.ViewGroupManager r0 = (com.facebook.react.uimanager.ViewGroupManager) r0
            r1 = 0
        L_0x0038:
            r2 = r6
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            int r3 = r0.getChildCount(r2)
            if (r1 >= r3) goto L_0x004b
            android.view.View r2 = r0.getChildAt(r2, r1)
            r5.dfs(r2, r7)
            int r1 = r1 + 1
            goto L_0x0038
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.reanimated.layoutReanimation.ReaLayoutAnimator.dfs(android.view.View, com.facebook.react.uimanager.NativeViewHierarchyManager):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$dfs$1(NativeViewHierarchyManager nativeViewHierarchyManager, View view) {
        ((ReanimatedNativeHierarchyManager) nativeViewHierarchyManager).publicDropView(view);
    }

    @Override // com.facebook.react.uimanager.layoutanimation.LayoutAnimationController
    public void applyLayoutUpdate(View view, int i, int i2, int i3, int i4) {
        if (!isLayoutAnimationEnabled()) {
            super.applyLayoutUpdate(view, i, i2, i3, i4);
            return;
        }
        UiThreadUtil.assertOnUiThread();
        maybeInit();
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            view.layout(i, i2, i3 + i, i4 + i2);
            if (view.getId() != -1) {
                this.mAnimationsManager.onViewCreate(view, (ViewGroup) view.getParent(), new Snapshot(view, this.mWeakNativeViewHierarchyManage.get()));
                return;
            }
            return;
        }
        Snapshot snapshot = new Snapshot(view, this.mWeakNativeViewHierarchyManage.get());
        view.layout(i, i2, i3 + i, i4 + i2);
        this.mAnimationsManager.onViewUpdate(view, snapshot, new Snapshot(view, this.mWeakNativeViewHierarchyManage.get()));
    }

    @Override // com.facebook.react.uimanager.layoutanimation.LayoutAnimationController
    public void deleteView(View view, final LayoutAnimationListener layoutAnimationListener) {
        if (!isLayoutAnimationEnabled()) {
            super.deleteView(view, layoutAnimationListener);
            return;
        }
        UiThreadUtil.assertOnUiThread();
        NativeViewHierarchyManager nativeViewHierarchyManager = this.mWeakNativeViewHierarchyManage.get();
        try {
            ViewManager resolveViewManager = nativeViewHierarchyManager.resolveViewManager(view.getId());
            if (resolveViewManager.getName().equals(ScreenViewManager.REACT_CLASS) && view.getParent() != null && (view.getParent().getParent() instanceof View)) {
                try {
                    if (nativeViewHierarchyManager.resolveViewManager(((View) view.getParent().getParent()).getId()).getName().equals(ScreenStackViewManager.REACT_CLASS)) {
                        super.deleteView(view, layoutAnimationListener);
                        return;
                    }
                } catch (IllegalViewOperationException e) {
                    e.printStackTrace();
                    super.deleteView(view, layoutAnimationListener);
                    return;
                }
            }
            maybeInit();
            this.mAnimationsManager.onViewRemoval(view, (ViewGroup) view.getParent(), new Snapshot(view, this.mWeakNativeViewHierarchyManage.get()), new Runnable() { // from class: com.swmansion.reanimated.layoutReanimation.b
                @Override // java.lang.Runnable
                public final void run() {
                    LayoutAnimationListener.this.onAnimationEnd();
                }
            });
            if (resolveViewManager instanceof ViewGroupManager) {
                ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager;
                int i = 0;
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i < viewGroupManager.getChildCount(viewGroup)) {
                        dfs(viewGroupManager.getChildAt(viewGroup, i), nativeViewHierarchyManager);
                        i++;
                    } else {
                        return;
                    }
                }
            }
        } catch (IllegalViewOperationException e2) {
            e2.printStackTrace();
            super.deleteView(view, layoutAnimationListener);
        }
    }

    public boolean isLayoutAnimationEnabled() {
        maybeInit();
        return this.mAnimationsManager.isLayoutAnimationEnabled();
    }

    public void maybeInit() {
        if (!this.mInitialized) {
            this.mInitialized = true;
            AnimationsManager animationsManager = ((ReanimatedModule) this.mContext.getNativeModule(ReanimatedModule.class)).getNodesManager().getAnimationsManager();
            this.mAnimationsManager = animationsManager;
            animationsManager.setReanimatedNativeHierarchyManager((ReanimatedNativeHierarchyManager) this.mWeakNativeViewHierarchyManage.get());
        }
    }

    @Override // com.facebook.react.uimanager.layoutanimation.LayoutAnimationController
    public boolean shouldAnimateLayout(View view) {
        if (!isLayoutAnimationEnabled()) {
            return super.shouldAnimateLayout(view);
        }
        if (view == null || view.getParent() == null) {
            return false;
        }
        return true;
    }
}
