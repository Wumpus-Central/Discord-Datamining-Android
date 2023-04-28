package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import p078e6.AbstractC6709a;

@AbstractC6709a
/* loaded from: classes7.dex */
public class CoreComponentsRegistry {
    @AbstractC6709a
    private final HybridData mHybridData;

    static {
        SoLoader.m30787r("fabricjni");
    }

    @AbstractC6709a
    private CoreComponentsRegistry(ComponentFactory componentFactory) {
        this.mHybridData = initHybrid(componentFactory);
    }

    @AbstractC6709a
    private native HybridData initHybrid(ComponentFactory componentFactory);

    @AbstractC6709a
    public static CoreComponentsRegistry register(ComponentFactory componentFactory) {
        return new CoreComponentsRegistry(componentFactory);
    }
}
