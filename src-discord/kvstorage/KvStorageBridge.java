package com.discord.kvstorage;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;


public class KvStorageBridge {
    public static final KvStorageBridge instance = new KvStorageBridge();

    private native void activateNative(long j10, CallInvokerHolderImpl callInvokerHolderImpl, String str);

    public void activate(ReactContext reactContext) {
        JavaScriptContextHolder javaScriptContextHolder = reactContext.getJavaScriptContextHolder();
        String absolutePath = reactContext.getFilesDir().getAbsolutePath();
        activateNative(javaScriptContextHolder.get(), (CallInvokerHolderImpl) reactContext.getCatalystInstance().getJSCallInvokerHolder(), absolutePath);
    }
}
