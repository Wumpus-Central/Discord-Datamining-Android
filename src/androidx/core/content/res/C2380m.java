package androidx.core.content.res;

/* renamed from: androidx.core.content.res.m */
/* loaded from: classes.dex */
final class C2380m {

    /* renamed from: k */
    static final C2380m f3314k = m37937k(C2356b.f3280c, (float) ((C2356b.m38037h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a */
    private final float f3315a;

    /* renamed from: b */
    private final float f3316b;

    /* renamed from: c */
    private final float f3317c;

    /* renamed from: d */
    private final float f3318d;

    /* renamed from: e */
    private final float f3319e;

    /* renamed from: f */
    private final float f3320f;

    /* renamed from: g */
    private final float[] f3321g;

    /* renamed from: h */
    private final float f3322h;

    /* renamed from: i */
    private final float f3323i;

    /* renamed from: j */
    private final float f3324j;

    private C2380m(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f3320f = f;
        this.f3315a = f2;
        this.f3316b = f3;
        this.f3317c = f4;
        this.f3318d = f5;
        this.f3319e = f6;
        this.f3321g = fArr;
        this.f3322h = f7;
        this.f3323i = f8;
        this.f3324j = f9;
    }

    /* renamed from: k */
    static C2380m m37937k(float[] fArr, float f, float f2, float f3, boolean z) {
        float f4;
        float f5;
        float[][] fArr2 = C2356b.f3278a;
        float f6 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        float f9 = (fArr3[0] * f6) + (fArr3[1] * f7) + (fArr3[2] * f8);
        float[] fArr4 = fArr2[1];
        float f10 = (fArr4[0] * f6) + (fArr4[1] * f7) + (fArr4[2] * f8);
        float[] fArr5 = fArr2[2];
        float f11 = (f6 * fArr5[0]) + (f7 * fArr5[1]) + (f8 * fArr5[2]);
        float f12 = (f3 / 10.0f) + 0.8f;
        if (f12 >= 0.9d) {
            f4 = C2356b.m38041d(0.59f, 0.69f, (f12 - 0.9f) * 10.0f);
        } else {
            f4 = C2356b.m38041d(0.525f, 0.59f, (f12 - 0.8f) * 10.0f);
        }
        if (z) {
            f5 = 1.0f;
        } else {
            f5 = (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f12;
        }
        double d = f5;
        if (d > 1.0d) {
            f5 = 1.0f;
        } else if (d < 0.0d) {
            f5 = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f9) * f5) + 1.0f) - f5, (((100.0f / f10) * f5) + 1.0f) - f5, (((100.0f / f11) * f5) + 1.0f) - f5};
        float f13 = 1.0f / ((5.0f * f) + 1.0f);
        float f14 = f13 * f13 * f13 * f13;
        float f15 = 1.0f - f14;
        float cbrt = (f14 * f) + (0.1f * f15 * f15 * ((float) Math.cbrt(f * 5.0d)));
        float h = C2356b.m38037h(f2) / fArr[1];
        double d2 = h;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f11) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f9) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f10) / 100.0d, 0.42d), pow2};
        float f16 = fArr7[0];
        float f17 = fArr7[1];
        return new C2380m(h, ((((f16 * 400.0f) / (f16 + 27.13f)) * 2.0f) + ((f17 * 400.0f) / (f17 + 27.13f)) + (((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f)) * pow, pow, pow, f4, f12, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public float m37947a() {
        return this.f3315a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public float m37946b() {
        return this.f3318d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public float m37945c() {
        return this.f3322h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public float m37944d() {
        return this.f3323i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public float m37943e() {
        return this.f3320f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public float m37942f() {
        return this.f3316b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public float m37941g() {
        return this.f3319e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public float m37940h() {
        return this.f3317c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public float[] m37939i() {
        return this.f3321g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public float m37938j() {
        return this.f3324j;
    }
}
