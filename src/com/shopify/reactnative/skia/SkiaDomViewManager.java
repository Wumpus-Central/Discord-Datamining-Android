package com.shopify.reactnative.skia;

import com.facebook.react.uimanager.ThemedReactContext;

/* loaded from: classes8.dex */
public class SkiaDomViewManager extends SkiaBaseViewManager {
    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SkiaDomView";
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public SkiaDomView createViewInstance(ThemedReactContext themedReactContext) {
        return new SkiaDomView(themedReactContext);
    }
}
