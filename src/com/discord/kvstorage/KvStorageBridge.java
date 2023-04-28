package com.discord.kvstorage;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import java.io.File;

/* loaded from: classes5.dex */
public class KvStorageBridge {
    public static final KvStorageBridge instance = new KvStorageBridge();

    private native void activateNative(long j, CallInvokerHolderImpl callInvokerHolderImpl, String str);

    public void activate(ReactContext reactContext) {
        JavaScriptContextHolder javaScriptContextHolder = reactContext.getJavaScriptContextHolder();
        File filesDir = reactContext.getFilesDir();
        activateNative(javaScriptContextHolder.get(), (CallInvokerHolderImpl) reactContext.getCatalystInstance().getJSCallInvokerHolder(), filesDir.getAbsolutePath());
    }
}
