package com.facebook.animated.webp;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.nativecode.C4936h;
import java.nio.ByteBuffer;
import p191k5.AbstractC9751c;
import p191k5.C9749b;
import p209l5.AbstractC10343c;
import p394w3.AbstractC13731d;
import p394w3.C13740j;

@AbstractC13731d
/* loaded from: classes7.dex */
public class WebPImage implements AbstractC9751c, AbstractC10343c {

    /* renamed from: a */
    private Bitmap.Config f7550a = null;
    @AbstractC13731d
    private long mNativeContext;

    @AbstractC13731d
    public WebPImage() {
    }

    /* renamed from: k */
    public static WebPImage m32073k(ByteBuffer byteBuffer, ImageDecodeOptions imageDecodeOptions) {
        C4936h.m31248a();
        byteBuffer.rewind();
        WebPImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer);
        if (imageDecodeOptions != null) {
            nativeCreateFromDirectByteBuffer.f7550a = imageDecodeOptions.f8133h;
        }
        return nativeCreateFromDirectByteBuffer;
    }

    /* renamed from: l */
    public static WebPImage m32072l(long j, int i, ImageDecodeOptions imageDecodeOptions) {
        boolean z;
        C4936h.m31248a();
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2839b(Boolean.valueOf(z));
        WebPImage nativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j, i);
        if (imageDecodeOptions != null) {
            nativeCreateFromNativeMemory.f7550a = imageDecodeOptions.f8133h;
        }
        return nativeCreateFromNativeMemory;
    }

    private static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    private static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native WebPFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    @Override // p191k5.AbstractC9751c
    /* renamed from: a */
    public int mo15445a() {
        return nativeGetFrameCount();
    }

    @Override // p191k5.AbstractC9751c
    /* renamed from: b */
    public int mo15444b() {
        return nativeGetLoopCount();
    }

    @Override // p191k5.AbstractC9751c
    /* renamed from: c */
    public C9749b mo15443c(int i) {
        C9749b.EnumC9750a aVar;
        C9749b.EnumC0297b bVar;
        WebPFrame m = mo15439i(i);
        try {
            int b = m.mo15436b();
            int c = m.mo15435c();
            int width = m.getWidth();
            int height = m.getHeight();
            if (m.m32075d()) {
                aVar = C9749b.EnumC9750a.BLEND_WITH_PREVIOUS;
            } else {
                aVar = C9749b.EnumC9750a.NO_BLEND;
            }
            if (m.m32074e()) {
                bVar = C9749b.EnumC0297b.DISPOSE_TO_BACKGROUND;
            } else {
                bVar = C9749b.EnumC0297b.DISPOSE_DO_NOT;
            }
            return new C9749b(i, b, c, width, height, aVar, bVar);
        } finally {
            m.dispose();
        }
    }

    @Override // p209l5.AbstractC10343c
    /* renamed from: d */
    public AbstractC9751c mo13574d(ByteBuffer byteBuffer, ImageDecodeOptions imageDecodeOptions) {
        return m32073k(byteBuffer, imageDecodeOptions);
    }

    @Override // p191k5.AbstractC9751c
    /* renamed from: e */
    public boolean mo15442e() {
        return true;
    }

    @Override // p209l5.AbstractC10343c
    /* renamed from: f */
    public AbstractC9751c mo13573f(long j, int i, ImageDecodeOptions imageDecodeOptions) {
        return m32072l(j, i, imageDecodeOptions);
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
        return this.f7550a;
    }

    @Override // p191k5.AbstractC9751c
    /* renamed from: j */
    public int[] mo15438j() {
        return nativeGetFrameDurations();
    }

    /* renamed from: m */
    public WebPFrame mo15439i(int i) {
        return nativeGetFrame(i);
    }

    @AbstractC13731d
    WebPImage(long j) {
        this.mNativeContext = j;
    }
}
