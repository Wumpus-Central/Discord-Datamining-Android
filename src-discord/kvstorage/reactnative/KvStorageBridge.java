package com.discord.kvstorage.reactnative;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;

/* loaded from: classes6.dex */
public class KvStorageBridge {
    public static final KvStorageBridge instance = new KvStorageBridge();

    private native void activateNative(long j10, CallInvokerHolderImpl callInvokerHolderImpl, String str);

    public void activate(ReactContext reactContext) {
        JavaScriptContextHolder javaScriptContextHolder = reactContext.getJavaScriptContextHolder();
        String absolutePath = reactContext.getFilesDir().getAbsolutePath();
        activateNative(javaScriptContextHolder.get(), (CallInvokerHolderImpl) reactContext.getCatalystInstance().getJSCallInvokerHolder(), absolutePath);
    }
}
