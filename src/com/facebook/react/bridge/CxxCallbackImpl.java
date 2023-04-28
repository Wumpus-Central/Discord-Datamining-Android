package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p078e6.AbstractC6709a;

@AbstractC6709a
/* loaded from: classes7.dex */
public class CxxCallbackImpl implements Callback {
    @AbstractC6709a
    private final HybridData mHybridData;

    @AbstractC6709a
    private CxxCallbackImpl(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native void nativeInvoke(NativeArray nativeArray);

    @Override // com.facebook.react.bridge.Callback
    public void invoke(Object... objArr) {
        nativeInvoke(Arguments.fromJavaArgs(objArr));
    }
}
