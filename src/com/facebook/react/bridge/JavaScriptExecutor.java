package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p078e6.AbstractC6709a;

@AbstractC6709a
/* loaded from: classes7.dex */
public abstract class JavaScriptExecutor {
    private final HybridData mHybridData;

    /* JADX INFO: Access modifiers changed from: protected */
    public JavaScriptExecutor(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public void close() {
        this.mHybridData.resetNative();
    }

    public abstract String getName();
}
