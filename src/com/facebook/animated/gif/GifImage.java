package com.facebook.animated.gif;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import java.nio.ByteBuffer;
import p116g6.C7420a;
import p191k5.AbstractC9751c;
import p191k5.C9749b;
import p209l5.AbstractC10343c;
import p394w3.AbstractC13731d;
import p394w3.C13740j;

@AbstractC13731d
/* loaded from: classes7.dex */
public class GifImage implements AbstractC9751c, AbstractC10343c {

    /* renamed from: b */
    private static volatile boolean f7548b;

    /* renamed from: a */
    private Bitmap.Config f7549a = null;
    @AbstractC13731d
    private long mNativeContext;

    @AbstractC13731d
    public GifImage() {
    }

    /* renamed from: k */
    public static GifImage m32080k(ByteBuffer byteBuffer, ImageDecodeOptions imageDecodeOptions) {
        m32078m();
        byteBuffer.rewind();
        GifImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer, imageDecodeOptions.f8127b, imageDecodeOptions.f8131f);
        nativeCreateFromDirectByteBuffer.f7549a = imageDecodeOptions.f8133h;
        return nativeCreateFromDirectByteBuffer;
    }

    /* renamed from: l */
    public static GifImage m32079l(long j, int i, ImageDecodeOptions imageDecodeOptions) {
        boolean z;
        m32078m();
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2839b(Boolean.valueOf(z));
        GifImage nativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j, i, imageDecodeOptions.f8127b, imageDecodeOptions.f8131f);
        nativeCreateFromNativeMemory.f7549a = imageDecodeOptions.f8133h;
        return nativeCreateFromNativeMemory;
    }

    /* renamed from: m */
    private static synchronized void m32078m() {
        synchronized (GifImage.class) {
            if (!f7548b) {
                f7548b = true;
                C7420a.m22709d("gifimage");
            }
        }
    }

    /* renamed from: n */
    private static C9749b.EnumC0297b m32077n(int i) {
        if (i == 0) {
            return C9749b.EnumC0297b.DISPOSE_DO_NOT;
        }
        if (i == 1) {
            return C9749b.EnumC0297b.DISPOSE_DO_NOT;
        }
        if (i == 2) {
            return C9749b.EnumC0297b.DISPOSE_TO_BACKGROUND;
        }
        if (i == 3) {
            return C9749b.EnumC0297b.DISPOSE_TO_PREVIOUS;
        }
        return C9749b.EnumC0297b.DISPOSE_DO_NOT;
    }

    @AbstractC13731d
    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i, boolean z);

    @AbstractC13731d
    private static native GifImage nativeCreateFromFileDescriptor(int i, int i2, boolean z);

    @AbstractC13731d
    private static native GifImage nativeCreateFromNativeMemory(long j, int i, int i2, boolean z);

    @AbstractC13731d
    private native void nativeDispose();

    @AbstractC13731d
    private native void nativeFinalize();

    @AbstractC13731d
    private native int nativeGetDuration();

    @AbstractC13731d
    private native GifFrame nativeGetFrame(int i);

    @AbstractC13731d
    private native int nativeGetFrameCount();

    @AbstractC13731d
    private native int[] nativeGetFrameDurations();

    @AbstractC13731d
    private native int nativeGetHeight();

    @AbstractC13731d
    private native int nativeGetLoopCount();

    @AbstractC13731d
    private native int nativeGetSizeInBytes();

    @AbstractC13731d
    private native int nativeGetWidth();

    @AbstractC13731d
    private native boolean nativeIsAnimated();

    @Override // p191k5.AbstractC9751c
    /* renamed from: a */
    public int mo15445a() {
        return nativeGetFrameCount();
    }

    @Override // p191k5.AbstractC9751c
    /* renamed from: b */
    public int mo15444b() {
        int nativeGetLoopCount = nativeGetLoopCount();
        if (nativeGetLoopCount == -1) {
            return 1;
        }
        if (nativeGetLoopCount != 0) {
            return nativeGetLoopCount + 1;
        }
        return 0;
    }

    @Override // p191k5.AbstractC9751c
    /* renamed from: c */
    public C9749b mo15443c(int i) {
        GifFrame o = mo15439i(i);
        try {
            return new C9749b(i, o.mo15436b(), o.mo15435c(), o.getWidth(), o.getHeight(), C9749b.EnumC9750a.BLEND_WITH_PREVIOUS, m32077n(o.m32081d()));
        } finally {
            o.dispose();
        }
    }

    @Override // p209l5.AbstractC10343c
    /* renamed from: d */
    public AbstractC9751c mo13574d(ByteBuffer byteBuffer, ImageDecodeOptions imageDecodeOptions) {
        return m32080k(byteBuffer, imageDecodeOptions);
    }

    @Override // p191k5.AbstractC9751c
    /* renamed from: e */
    public boolean mo15442e() {
        return false;
    }

    @Override // p209l5.AbstractC10343c
    /* renamed from: f */
    public AbstractC9751c mo13573f(long j, int i, ImageDecodeOptions imageDecodeOptions) {
        return m32079l(j, i, imageDecodeOptions);
    }

    protected void finalize() {
        nativeFinalize();
    }

    @Override // p191k5.AbstractC9751c
    /* renamed from: g */
    public int mo15441g() {
        return nativeGetSizeInBytes();
    }

    @Override // p191k5.AbstractC9751c
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // p191k5.AbstractC9751c
    public int getWidth() {
        return nativeGetWidth();
    }

    @Override // p191k5.AbstractC9751c
    /* renamed from: h */
    public Bitmap.Config mo15440h() {
        return this.f7549a;
    }

    @Override // p191k5.AbstractC9751c
    /* renamed from: j */
    public int[] mo15438j() {
        return nativeGetFrameDurations();
    }

    /* renamed from: o */
    public GifFrame mo15439i(int i) {
        return nativeGetFrame(i);
    }

    @AbstractC13731d
    GifImage(long j) {
        this.mNativeContext = j;
    }
}
