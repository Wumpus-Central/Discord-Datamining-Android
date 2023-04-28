package com.facebook.animated.webp;

import android.graphics.Bitmap;
import p191k5.AbstractC9752d;
import p394w3.AbstractC13731d;

/* loaded from: classes7.dex */
public class WebPFrame implements AbstractC9752d {
    @AbstractC13731d
    private long mNativeContext;

    @AbstractC13731d
    WebPFrame(long j) {
        this.mNativeContext = j;
    }

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeIsBlendWithPreviousFrame();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    private native boolean nativeShouldDisposeToBackgroundColor();

    @Override // p191k5.AbstractC9752d
    /* renamed from: a */
    public void mo15437a(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }

    @Override // p191k5.AbstractC9752d
    /* renamed from: b */
    public int mo15436b() {
        return nativeGetXOffset();
    }

    @Override // p191k5.AbstractC9752d
    /* renamed from: c */
    public int mo15435c() {
        return nativeGetYOffset();
    }

    /* renamed from: d */
    public boolean m32075d() {
        return nativeIsBlendWithPreviousFrame();
    }

    @Override // p191k5.AbstractC9752d
    public void dispose() {
        nativeDispose();
    }

    /* renamed from: e */
    public boolean m32074e() {
        return nativeShouldDisposeToBackgroundColor();
    }

    protected void finalize() {
        nativeFinalize();
    }

    @Override // p191k5.AbstractC9752d
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // p191k5.AbstractC9752d
    public int getWidth() {
        return nativeGetWidth();
    }
}
