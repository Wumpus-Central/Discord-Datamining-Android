package com.shopify.reactnative.skia;

import android.content.Context;
import com.facebook.jni.HybridData;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.bridge.ReactContext;

/* loaded from: classes8.dex */
public class SkiaDomView extends SkiaBaseView {
    @DoNotStrip
    private HybridData mHybridData;

    public SkiaDomView(Context context) {
        super(context);
        this.mHybridData = initHybrid(((RNSkiaModule) ((ReactContext) context).getNativeModule(RNSkiaModule.class)).getSkiaManager());
    }

    private native HybridData initHybrid(SkiaManager skiaManager);

    protected void finalize() {
        super.finalize();
        this.mHybridData.resetNative();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.shopify.reactnative.skia.SkiaBaseView
    public native void registerView(int i);

    protected native void setBgColor(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.shopify.reactnative.skia.SkiaBaseView
    public native void setDebugMode(boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.shopify.reactnative.skia.SkiaBaseView
    public native void setMode(String str);

    @Override // com.shopify.reactnative.skia.SkiaBaseView
    protected native void surfaceAvailable(Object obj, int i, int i2);

    @Override // com.shopify.reactnative.skia.SkiaBaseView
    protected native void surfaceDestroyed();

    @Override // com.shopify.reactnative.skia.SkiaBaseView
    protected native void surfaceSizeChanged(int i, int i2);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.shopify.reactnative.skia.SkiaBaseView
    public native void unregisterView();

    @Override // com.shopify.reactnative.skia.SkiaBaseView
    protected native void updateTouchPoints(double[] dArr);
}
