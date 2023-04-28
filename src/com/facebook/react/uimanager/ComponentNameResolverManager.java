package com.facebook.react.uimanager;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.soloader.SoLoader;
import p078e6.AbstractC6709a;

/* loaded from: classes7.dex */
public class ComponentNameResolverManager {
    @AbstractC6709a
    private final HybridData mHybridData;

    static {
        staticInit();
    }

    public ComponentNameResolverManager(RuntimeExecutor runtimeExecutor, Object obj) {
        this.mHybridData = initHybrid(runtimeExecutor, obj);
        installJSIBindings();
    }

    private native HybridData initHybrid(RuntimeExecutor runtimeExecutor, Object obj);

    private native void installJSIBindings();

    private static void staticInit() {
        SoLoader.m30787r("uimanagerjni");
    }
}
