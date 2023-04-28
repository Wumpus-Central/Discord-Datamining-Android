package p137hd;

/* renamed from: hd.k */
/* loaded from: classes3.dex */
public final class C8006k {

    /* renamed from: a */
    private final float f17268a;

    /* renamed from: b */
    private final float f17269b;

    /* renamed from: c */
    private final float f17270c;

    /* renamed from: d */
    private final float f17271d;

    /* renamed from: e */
    private final float f17272e;

    /* renamed from: f */
    private final float f17273f;

    /* renamed from: g */
    private final float f17274g;

    /* renamed from: h */
    private final float f17275h;

    /* renamed from: i */
    private final float f17276i;

    private C8006k(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f17268a = f;
        this.f17269b = f4;
        this.f17270c = f7;
        this.f17271d = f2;
        this.f17272e = f5;
        this.f17273f = f8;
        this.f17274g = f3;
        this.f17275h = f6;
        this.f17276i = f9;
    }

    /* renamed from: b */
    public static C8006k m20877b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return m20875d(f9, f10, f11, f12, f13, f14, f15, f16).m20874e(m20876c(f, f2, f3, f4, f5, f6, f7, f8));
    }

    /* renamed from: c */
    public static C8006k m20876c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return m20875d(f, f2, f3, f4, f5, f6, f7, f8).m20878a();
    }

    /* renamed from: d */
    public static C8006k m20875d(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new C8006k(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f11 * f10) - (f9 * f13)) / f15;
        return new C8006k((f16 * f3) + (f3 - f), (f17 * f7) + (f7 - f), f, (f4 - f2) + (f16 * f4), (f8 - f2) + (f17 * f8), f2, f16, f17, 1.0f);
    }

    /* renamed from: a */
    C8006k m20878a() {
        float f = this.f17272e;
        float f2 = this.f17276i;
        float f3 = this.f17273f;
        float f4 = this.f17275h;
        float f5 = (f * f2) - (f3 * f4);
        float f6 = this.f17274g;
        float f7 = this.f17271d;
        float f8 = (f3 * f6) - (f7 * f2);
        float f9 = (f7 * f4) - (f * f6);
        float f10 = this.f17270c;
        float f11 = this.f17269b;
        float f12 = (f10 * f4) - (f11 * f2);
        float f13 = this.f17268a;
        return new C8006k(f5, f8, f9, f12, (f2 * f13) - (f10 * f6), (f6 * f11) - (f4 * f13), (f11 * f3) - (f10 * f), (f10 * f7) - (f3 * f13), (f13 * f) - (f11 * f7));
    }

    /* renamed from: e */
    C8006k m20874e(C8006k kVar) {
        float f = this.f17268a;
        float f2 = kVar.f17268a;
        float f3 = this.f17271d;
        float f4 = kVar.f17269b;
        float f5 = this.f17274g;
        float f6 = kVar.f17270c;
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = kVar.f17271d;
        float f9 = kVar.f17272e;
        float f10 = kVar.f17273f;
        float f11 = (f * f8) + (f3 * f9) + (f5 * f10);
        float f12 = kVar.f17274g;
        float f13 = kVar.f17275h;
        float f14 = kVar.f17276i;
        float f15 = (f * f12) + (f3 * f13) + (f5 * f14);
        float f16 = this.f17269b;
        float f17 = this.f17272e;
        float f18 = this.f17275h;
        float f19 = (f18 * f14) + (f16 * f12) + (f17 * f13);
        float f20 = this.f17270c;
        float f21 = this.f17273f;
        float f22 = (f2 * f20) + (f4 * f21);
        float f23 = this.f17276i;
        return new C8006k(f7, f11, f15, (f16 * f2) + (f17 * f4) + (f18 * f6), (f16 * f8) + (f17 * f9) + (f18 * f10), f19, (f6 * f23) + f22, (f8 * f20) + (f9 * f21) + (f10 * f23), (f20 * f12) + (f21 * f13) + (f23 * f14));
    }

    /* renamed from: f */
    public void m20873f(float[] fArr) {
        int length = fArr.length;
        float f = this.f17268a;
        float f2 = this.f17269b;
        float f3 = this.f17270c;
        float f4 = this.f17271d;
        float f5 = this.f17272e;
        float f6 = this.f17273f;
        float f7 = this.f17274g;
        float f8 = this.f17275h;
        float f9 = this.f17276i;
        for (int i = 0; i < length; i += 2) {
            float f10 = fArr[i];
            int i2 = i + 1;
            float f11 = fArr[i2];
            float f12 = (f3 * f10) + (f6 * f11) + f9;
            fArr[i] = (((f * f10) + (f4 * f11)) + f7) / f12;
            fArr[i2] = (((f10 * f2) + (f11 * f5)) + f8) / f12;
        }
    }
}
