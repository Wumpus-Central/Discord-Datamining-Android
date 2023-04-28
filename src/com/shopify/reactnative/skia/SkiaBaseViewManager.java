package com.shopify.reactnative.skia;

import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import com.swmansion.reanimated.BuildConfig;

/* loaded from: classes8.dex */
public abstract class SkiaBaseViewManager extends ReactViewManager {
    @ReactProp(name = BuildConfig.BUILD_TYPE)
    public void setDebug(ReactViewGroup reactViewGroup, boolean z) {
        ((SkiaBaseView) reactViewGroup).setDebugMode(z);
    }

    @ReactProp(name = "mode")
    public void setMode(ReactViewGroup reactViewGroup, String str) {
        ((SkiaBaseView) reactViewGroup).setMode(str);
    }

    public void onDropViewInstance(ReactViewGroup reactViewGroup) {
        super.onDropViewInstance((SkiaBaseViewManager) reactViewGroup);
        ((SkiaBaseView) reactViewGroup).unregisterView();
    }

    public void setNativeId(ReactViewGroup reactViewGroup, String str) {
        super.setNativeId((SkiaBaseViewManager) reactViewGroup, str);
        ((SkiaBaseView) reactViewGroup).registerView(Integer.parseInt(str));
    }
}
