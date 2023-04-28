package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p078e6.AbstractC6709a;

@AbstractC6709a
/* loaded from: classes7.dex */
public abstract class NativeArray implements NativeArrayInterface {
    @AbstractC6709a
    private HybridData mHybridData;

    static {
        ReactBridge.staticInit();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public NativeArray(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.react.bridge.NativeArrayInterface
    public native String toString();
}
