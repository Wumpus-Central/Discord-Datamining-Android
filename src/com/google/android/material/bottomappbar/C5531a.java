package com.google.android.material.bottomappbar;

import p422xb.C14037f;
import p422xb.C14053m;

/* renamed from: com.google.android.material.bottomappbar.a */
/* loaded from: classes3.dex */
public class C5531a extends C14037f implements Cloneable {

    /* renamed from: k */
    private float f10564k;

    /* renamed from: l */
    private float f10565l;

    /* renamed from: m */
    private float f10566m;

    /* renamed from: n */
    private float f10567n;

    /* renamed from: o */
    private float f10568o;

    /* renamed from: p */
    private float f10569p;

    @Override // p422xb.C14037f
    /* renamed from: c */
    public void mo2006c(float f, float f2, float f3, C14053m mVar) {
        boolean z;
        float f4;
        float f5;
        float f6 = this.f10566m;
        if (f6 == 0.0f) {
            mVar.m1849m(f, 0.0f);
            return;
        }
        float f7 = ((this.f10565l * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.f10564k;
        float f9 = f2 + this.f10568o;
        float f10 = (this.f10567n * f3) + ((1.0f - f3) * f7);
        if (f10 / f7 >= 1.0f) {
            mVar.m1849m(f, 0.0f);
            return;
        }
        float f11 = this.f10569p;
        float f12 = f11 * f3;
        if (f11 == -1.0f || Math.abs((f11 * 2.0f) - f6) < 0.1f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            f5 = 1.75f;
            f4 = 0.0f;
        } else {
            f4 = f10;
            f5 = 0.0f;
        }
        float f13 = f7 + f8;
        float f14 = f4 + f8;
        float sqrt = (float) Math.sqrt((f13 * f13) - (f14 * f14));
        float f15 = f9 - sqrt;
        float f16 = f9 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f14));
        float f17 = (90.0f - degrees) + f5;
        mVar.m1849m(f15, 0.0f);
        float f18 = f8 * 2.0f;
        mVar.m1861a(f15 - f8, 0.0f, f15 + f8, f18, 270.0f, degrees);
        if (z) {
            mVar.m1861a(f9 - f7, (-f7) - f4, f9 + f7, f7 - f4, 180.0f - f17, (f17 * 2.0f) - 180.0f);
        } else {
            float f19 = this.f10565l;
            float f20 = f12 * 2.0f;
            float f21 = f9 - f7;
            mVar.m1861a(f21, -(f12 + f19), f21 + f19 + f20, f19 + f12, 180.0f - f17, ((f17 * 2.0f) - 180.0f) / 2.0f);
            float f22 = f9 + f7;
            float f23 = this.f10565l;
            mVar.m1849m(f22 - ((f23 / 2.0f) + f12), f23 + f12);
            float f24 = this.f10565l;
            mVar.m1861a(f22 - (f20 + f24), -(f12 + f24), f22, f24 + f12, 90.0f, f17 - 90.0f);
        }
        mVar.m1861a(f16 - f8, 0.0f, f16 + f8, f18, 270.0f - degrees, degrees);
        mVar.m1849m(f, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public float m28662d() {
        return this.f10567n;
    }

    /* renamed from: e */
    public float m28661e() {
        return this.f10569p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public float m28660f() {
        return this.f10565l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public float m28659h() {
        return this.f10564k;
    }

    /* renamed from: j */
    public float m28658j() {
        return this.f10566m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m28657k(float f) {
        if (f >= 0.0f) {
            this.f10567n = f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* renamed from: l */
    public void m28656l(float f) {
        this.f10569p = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m28655m(float f) {
        this.f10565l = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m28654n(float f) {
        this.f10564k = f;
    }

    /* renamed from: o */
    public void m28653o(float f) {
        this.f10566m = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m28652q(float f) {
        this.f10568o = f;
    }
}
