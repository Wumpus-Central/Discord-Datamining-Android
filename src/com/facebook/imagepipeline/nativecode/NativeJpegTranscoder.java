package com.facebook.imagepipeline.nativecode;

import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import java.io.InputStream;
import java.io.OutputStream;
import p026b6.AbstractC3387c;
import p026b6.C3385a;
import p026b6.C3386b;
import p026b6.C3389e;
import p170j5.C9489b;
import p170j5.C9490c;
import p380v5.C13434e;
import p394w3.AbstractC13731d;
import p394w3.C13729b;
import p394w3.C13740j;

@AbstractC13731d
/* loaded from: classes7.dex */
public class NativeJpegTranscoder implements AbstractC3387c {

    /* renamed from: a */
    private boolean f8344a;

    /* renamed from: b */
    private int f8345b;

    /* renamed from: c */
    private boolean f8346c;

    public NativeJpegTranscoder(boolean z, int i, boolean z2, boolean z3) {
        this.f8344a = z;
        this.f8345b = i;
        this.f8346c = z2;
        if (z3) {
            C4935g.m31249a();
        }
    }

    /* renamed from: e */
    public static void m31257e(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C4935g.m31249a();
        boolean z5 = false;
        if (i2 >= 1) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2839b(Boolean.valueOf(z));
        if (i2 <= 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13740j.m2839b(Boolean.valueOf(z2));
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C13740j.m2839b(Boolean.valueOf(z3));
        if (i3 <= 100) {
            z4 = true;
        } else {
            z4 = false;
        }
        C13740j.m2839b(Boolean.valueOf(z4));
        C13740j.m2839b(Boolean.valueOf(C3389e.m34529j(i)));
        if (!(i2 == 8 && i == 0)) {
            z5 = true;
        }
        C13740j.m2838c(z5, "no transformation requested");
        nativeTranscodeJpeg((InputStream) C13740j.m2834g(inputStream), (OutputStream) C13740j.m2834g(outputStream), i, i2, i3);
    }

    /* renamed from: f */
    public static void m31256f(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C4935g.m31249a();
        boolean z5 = false;
        if (i2 >= 1) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2839b(Boolean.valueOf(z));
        if (i2 <= 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13740j.m2839b(Boolean.valueOf(z2));
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C13740j.m2839b(Boolean.valueOf(z3));
        if (i3 <= 100) {
            z4 = true;
        } else {
            z4 = false;
        }
        C13740j.m2839b(Boolean.valueOf(z4));
        C13740j.m2839b(Boolean.valueOf(C3389e.m34530i(i)));
        if (!(i2 == 8 && i == 1)) {
            z5 = true;
        }
        C13740j.m2838c(z5, "no transformation requested");
        nativeTranscodeJpegWithExifOrientation((InputStream) C13740j.m2834g(inputStream), (OutputStream) C13740j.m2834g(outputStream), i, i2, i3);
    }

    @AbstractC13731d
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    @AbstractC13731d
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    @Override // p026b6.AbstractC3387c
    /* renamed from: a */
    public String mo31261a() {
        return "NativeJpegTranscoder";
    }

    @Override // p026b6.AbstractC3387c
    /* renamed from: b */
    public boolean mo31260b(C9490c cVar) {
        return cVar == C9489b.f21011a;
    }

    /* JADX WARN: Finally extract failed */
    @Override // p026b6.AbstractC3387c
    /* renamed from: c */
    public C3386b mo31259c(C13434e eVar, OutputStream outputStream, RotationOptions rotationOptions, ResizeOptions resizeOptions, C9490c cVar, Integer num) {
        if (num == null) {
            num = 85;
        }
        if (rotationOptions == null) {
            rotationOptions = RotationOptions.m31497a();
        }
        int b = C3385a.m34544b(rotationOptions, resizeOptions, eVar, this.f8345b);
        try {
            int f = C3389e.m34533f(rotationOptions, resizeOptions, eVar, this.f8344a);
            int a = C3389e.m34538a(b);
            if (this.f8346c) {
                f = a;
            }
            InputStream z = eVar.m3696z();
            if (C3389e.f5417a.contains(Integer.valueOf(eVar.m3700r()))) {
                m31256f((InputStream) C13740j.m2833h(z, "Cannot transcode from null input stream!"), outputStream, C3389e.m34535d(rotationOptions, eVar), f, num.intValue());
            } else {
                m31257e((InputStream) C13740j.m2833h(z, "Cannot transcode from null input stream!"), outputStream, C3389e.m34534e(rotationOptions, eVar), f, num.intValue());
            }
            C13729b.m2856b(z);
            int i = 1;
            if (b != 1) {
                i = 0;
            }
            return new C3386b(i);
        } catch (Throwable th2) {
            C13729b.m2856b(null);
            throw th2;
        }
    }

    @Override // p026b6.AbstractC3387c
    /* renamed from: d */
    public boolean mo31258d(C13434e eVar, RotationOptions rotationOptions, ResizeOptions resizeOptions) {
        if (rotationOptions == null) {
            rotationOptions = RotationOptions.m31497a();
        }
        if (C3389e.m34533f(rotationOptions, resizeOptions, eVar, this.f8344a) < 8) {
            return true;
        }
        return false;
    }
}
