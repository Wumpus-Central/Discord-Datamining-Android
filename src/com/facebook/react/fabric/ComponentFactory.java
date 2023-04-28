package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import p078e6.AbstractC6709a;

@AbstractC6709a
/* loaded from: classes7.dex */
public class ComponentFactory {
    @AbstractC6709a
    private final HybridData mHybridData = initHybrid();

    static {
        FabricSoLoader.staticInit();
    }

    @AbstractC6709a
    private static native HybridData initHybrid();
}
