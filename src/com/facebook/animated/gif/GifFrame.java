package com.facebook.animated.gif;

import android.graphics.Bitmap;
import p191k5.AbstractC9752d;
import p394w3.AbstractC13731d;

/* loaded from: classes7.dex */
public class GifFrame implements AbstractC9752d {
    @AbstractC13731d
    private long mNativeContext;

    @AbstractC13731d
    GifFrame(long j) {
        this.mNativeContext = j;
    }

    @AbstractC13731d
    private native void nativeDispose();

    @AbstractC13731d
    private native void nativeFinalize();

    @AbstractC13731d
    private native int nativeGetDisposalMode();

    @AbstractC13731d
    private native int nativeGetDurationMs();

    @AbstractC13731d
    private native int nativeGetHeight();

    @AbstractC13731d
    private native int nativeGetTransparentPixelColor();

    @AbstractC13731d
    private native int nativeGetWidth();

    @AbstractC13731d
    private native int nativeGetXOffset();

    @AbstractC13731d
    private native int nativeGetYOffset();

    @AbstractC13731d
    private native boolean nativeHasTransparency();

    @AbstractC13731d
    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

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
    public int m32081d() {
        return nativeGetDisposalMode();
    }

    @Override // p191k5.AbstractC9752d
    public void dispose() {
        nativeDispose();
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
