package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;
import p116g6.C7420a;

@DoNotStrip
/* loaded from: classes7.dex */
public class ThreadScopeSupport {
    static {
        C7420a.m22709d("fbjni");
    }

    @DoNotStrip
    private static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }

    private static native void runStdFunctionImpl(long j);
}
