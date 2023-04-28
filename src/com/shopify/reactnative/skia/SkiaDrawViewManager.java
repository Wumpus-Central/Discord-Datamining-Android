package com.shopify.reactnative.skia;

import com.facebook.react.uimanager.ThemedReactContext;

/* loaded from: classes8.dex */
public class SkiaDrawViewManager extends SkiaBaseViewManager {
    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SkiaDrawView";
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public SkiaDrawView createViewInstance(ThemedReactContext themedReactContext) {
        return new SkiaDrawView(themedReactContext);
    }
}
