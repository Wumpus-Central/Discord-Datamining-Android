package com.shopify.reactnative.skia;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import p078e6.AbstractC6709a;

@AbstractC6709a
/* loaded from: classes8.dex */
public class SkiaManager {
    @AbstractC6709a
    private ReactContext mContext;
    @AbstractC6709a
    private HybridData mHybridData;
    @AbstractC6709a
    private PlatformContext mPlatformContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    @AbstractC6709a
    public SkiaManager(ReactContext reactContext) {
        this.mContext = reactContext;
        this.mPlatformContext = new PlatformContext(reactContext);
        this.mHybridData = initHybrid(reactContext.getJavaScriptContextHolder().get(), (CallInvokerHolderImpl) reactContext.getCatalystInstance().getJSCallInvokerHolder(), this.mPlatformContext);
        initializeRuntime();
    }

    private native HybridData initHybrid(long j, CallInvokerHolderImpl callInvokerHolderImpl, PlatformContext platformContext);

    private native void initializeRuntime();

    public void destroy() {
        this.mHybridData.resetNative();
    }

    public float getPixelDensity() {
        return this.mContext.getResources().getDisplayMetrics().density;
    }

    public PlatformContext getPlatformContext() {
        return this.mPlatformContext;
    }

    public native void invalidate();

    public void onHostPause() {
        this.mPlatformContext.onPause();
    }

    public void onHostResume() {
        this.mPlatformContext.onResume();
    }
}
