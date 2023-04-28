package com.facebook.imagepipeline.common;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import p294q5.C11994b;
import p346t5.AbstractC12962c;
import p394w3.C13736i;

/* loaded from: classes7.dex */
public class ImageDecodeOptions {

    /* renamed from: l */
    private static final ImageDecodeOptions f8125l = m31501b().m8053a();

    /* renamed from: a */
    public final int f8126a;

    /* renamed from: b */
    public final int f8127b;

    /* renamed from: c */
    public final boolean f8128c;

    /* renamed from: d */
    public final boolean f8129d;

    /* renamed from: e */
    public final boolean f8130e;

    /* renamed from: f */
    public final boolean f8131f;

    /* renamed from: g */
    public final Bitmap.Config f8132g;

    /* renamed from: h */
    public final Bitmap.Config f8133h;

    /* renamed from: i */
    public final AbstractC12962c f8134i;

    /* renamed from: j */
    public final ColorSpace f8135j;

    /* renamed from: k */
    private final boolean f8136k;

    public ImageDecodeOptions(C11994b bVar) {
        this.f8126a = bVar.m8042l();
        this.f8127b = bVar.m8043k();
        this.f8128c = bVar.m8046h();
        this.f8129d = bVar.m8041m();
        this.f8130e = bVar.m8047g();
        this.f8131f = bVar.m8044j();
        this.f8132g = bVar.m8051c();
        this.f8133h = bVar.m8052b();
        this.f8134i = bVar.m8048f();
        bVar.m8050d();
        this.f8135j = bVar.m8049e();
        this.f8136k = bVar.m8045i();
    }

    /* renamed from: a */
    public static ImageDecodeOptions m31502a() {
        return f8125l;
    }

    /* renamed from: b */
    public static C11994b m31501b() {
        return new C11994b();
    }

    /* renamed from: c */
    protected C13736i.C13738b m31500c() {
        return C13736i.m2846c(this).m2845a("minDecodeIntervalMs", this.f8126a).m2845a("maxDimensionPx", this.f8127b).m2843c("decodePreviewFrame", this.f8128c).m2843c("useLastFrameForPreview", this.f8129d).m2843c("decodeAllFrames", this.f8130e).m2843c("forceStaticImage", this.f8131f).m2844b("bitmapConfigName", this.f8132g.name()).m2844b("animatedBitmapConfigName", this.f8133h.name()).m2844b("customImageDecoder", this.f8134i).m2844b("bitmapTransformation", null).m2844b("colorSpace", this.f8135j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageDecodeOptions imageDecodeOptions = (ImageDecodeOptions) obj;
        if (this.f8126a != imageDecodeOptions.f8126a || this.f8127b != imageDecodeOptions.f8127b || this.f8128c != imageDecodeOptions.f8128c || this.f8129d != imageDecodeOptions.f8129d || this.f8130e != imageDecodeOptions.f8130e || this.f8131f != imageDecodeOptions.f8131f) {
            return false;
        }
        boolean z = this.f8136k;
        if (!z && this.f8132g != imageDecodeOptions.f8132g) {
            return false;
        }
        if ((z || this.f8133h == imageDecodeOptions.f8133h) && this.f8134i == imageDecodeOptions.f8134i && this.f8135j == imageDecodeOptions.f8135j) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = (((((((((this.f8126a * 31) + this.f8127b) * 31) + (this.f8128c ? 1 : 0)) * 31) + (this.f8129d ? 1 : 0)) * 31) + (this.f8130e ? 1 : 0)) * 31) + (this.f8131f ? 1 : 0);
        if (!this.f8136k) {
            i3 = (i3 * 31) + this.f8132g.ordinal();
        }
        int i4 = 0;
        if (!this.f8136k) {
            int i5 = i3 * 31;
            Bitmap.Config config = this.f8133h;
            if (config != null) {
                i2 = config.ordinal();
            } else {
                i2 = 0;
            }
            i3 = i5 + i2;
        }
        int i6 = i3 * 31;
        AbstractC12962c cVar = this.f8134i;
        if (cVar != null) {
            i = cVar.hashCode();
        } else {
            i = 0;
        }
        int i7 = (((i6 + i) * 31) + 0) * 31;
        ColorSpace colorSpace = this.f8135j;
        if (colorSpace != null) {
            i4 = colorSpace.hashCode();
        }
        return i7 + i4;
    }

    public String toString() {
        return "ImageDecodeOptions{" + m31500c().toString() + "}";
    }
}
