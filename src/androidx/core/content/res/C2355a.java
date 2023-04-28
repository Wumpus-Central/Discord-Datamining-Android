package androidx.core.content.res;

import androidx.core.graphics.C2382a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.content.res.a */
/* loaded from: classes.dex */
public class C2355a {

    /* renamed from: a */
    private final float f3269a;

    /* renamed from: b */
    private final float f3270b;

    /* renamed from: c */
    private final float f3271c;

    /* renamed from: d */
    private final float f3272d;

    /* renamed from: e */
    private final float f3273e;

    /* renamed from: f */
    private final float f3274f;

    /* renamed from: g */
    private final float f3275g;

    /* renamed from: h */
    private final float f3276h;

    /* renamed from: i */
    private final float f3277i;

    C2355a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f3269a = f;
        this.f3270b = f2;
        this.f3271c = f3;
        this.f3272d = f4;
        this.f3273e = f5;
        this.f3274f = f6;
        this.f3275g = f7;
        this.f3276h = f8;
        this.f3277i = f9;
    }

    /* renamed from: b */
    private static C2355a m38059b(float f, float f2, float f3) {
        float f4 = 100.0f;
        float f5 = 1000.0f;
        float f6 = 0.0f;
        C2355a aVar = null;
        float f7 = 1000.0f;
        while (Math.abs(f6 - f4) > 0.01f) {
            float f8 = ((f4 - f6) / 2.0f) + f6;
            int p = m38056e(f8, f2, f).m38045p();
            float b = C2356b.m38043b(p);
            float abs = Math.abs(f3 - b);
            if (abs < 0.2f) {
                C2355a c = m38058c(p);
                float a = c.m38060a(m38056e(c.m38050k(), c.m38052i(), f));
                if (a <= 1.0f) {
                    aVar = c;
                    f5 = abs;
                    f7 = a;
                }
            }
            if (f5 == 0.0f && f7 == 0.0f) {
                break;
            } else if (b < f3) {
                f6 = f8;
            } else {
                f4 = f8;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C2355a m38058c(int i) {
        return m38057d(i, C2380m.f3314k);
    }

    /* renamed from: d */
    static C2355a m38057d(int i, C2380m mVar) {
        float f;
        float pow;
        float[] f2 = C2356b.m38039f(i);
        float[][] fArr = C2356b.f3278a;
        float f3 = f2[0];
        float[] fArr2 = fArr[0];
        float f4 = f2[1];
        float f5 = f2[2];
        float f6 = (fArr2[0] * f3) + (fArr2[1] * f4) + (fArr2[2] * f5);
        float[] fArr3 = fArr[1];
        float f7 = (fArr3[0] * f3) + (fArr3[1] * f4) + (fArr3[2] * f5);
        float[] fArr4 = fArr[2];
        float f8 = (f3 * fArr4[0]) + (f4 * fArr4[1]) + (f5 * fArr4[2]);
        float f9 = mVar.m37939i()[0] * f6;
        float f10 = mVar.m37939i()[1] * f7;
        float f11 = mVar.m37939i()[2] * f8;
        float pow2 = (float) Math.pow((mVar.m37945c() * Math.abs(f9)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((mVar.m37945c() * Math.abs(f10)) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((mVar.m37945c() * Math.abs(f11)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f9) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f10) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f11) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d = signum3;
        float f12 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d)) / 11.0f;
        float f13 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f14 = signum2 * 20.0f;
        float f15 = (((signum * 20.0f) + f14) + (21.0f * signum3)) / 20.0f;
        float f16 = (((signum * 40.0f) + f14) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f13, f12)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f17 = (3.1415927f * atan2) / 180.0f;
        float pow5 = ((float) Math.pow((f16 * mVar.m37942f()) / mVar.m37947a(), mVar.m37946b() * mVar.m37938j())) * 100.0f;
        float d2 = mVar.m37944d() * (4.0f / mVar.m37946b()) * ((float) Math.sqrt(pow5 / 100.0f)) * (mVar.m37947a() + 4.0f);
        if (atan2 < 20.14d) {
            f = 360.0f + atan2;
        } else {
            f = atan2;
        }
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, mVar.m37943e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * mVar.m37941g()) * mVar.m37940h()) * ((float) Math.sqrt((f12 * f12) + (f13 * f13)))) / (f15 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        float d3 = pow6 * mVar.m37944d();
        float sqrt = ((float) Math.sqrt((pow * mVar.m37946b()) / (mVar.m37947a() + 4.0f))) * 50.0f;
        float f18 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((0.0228f * d3) + 1.0f)) * 43.85965f;
        double d4 = f17;
        return new C2355a(atan2, pow6, pow5, d2, d3, sqrt, f18, log * ((float) Math.cos(d4)), log * ((float) Math.sin(d4)));
    }

    /* renamed from: e */
    private static C2355a m38056e(float f, float f2, float f3) {
        return m38055f(f, f2, f3, C2380m.f3314k);
    }

    /* renamed from: f */
    private static C2355a m38055f(float f, float f2, float f3, C2380m mVar) {
        double d;
        float b = (4.0f / mVar.m37946b()) * ((float) Math.sqrt(f / 100.0d)) * (mVar.m37947a() + 4.0f) * mVar.m37944d();
        float d2 = f2 * mVar.m37944d();
        float sqrt = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(d))) * mVar.m37946b()) / (mVar.m37947a() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((d2 * 0.0228d) + 1.0d)) * 43.85965f;
        double d3 = (3.1415927f * f3) / 180.0f;
        return new C2355a(f3, f2, f, b, d2, sqrt, f4, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static int m38048m(float f, float f2, float f3) {
        return m38047n(f, f2, f3, C2380m.f3314k);
    }

    /* renamed from: n */
    static int m38047n(float f, float f2, float f3, C2380m mVar) {
        float f4;
        if (f2 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            return C2356b.m38044a(f3);
        }
        if (f < 0.0f) {
            f4 = 0.0f;
        } else {
            f4 = Math.min(360.0f, f);
        }
        C2355a aVar = null;
        boolean z = true;
        float f5 = 0.0f;
        float f6 = f2;
        while (Math.abs(f5 - f2) >= 0.4f) {
            C2355a b = m38059b(f4, f6, f3);
            if (!z) {
                if (b == null) {
                    f2 = f6;
                } else {
                    f5 = f6;
                    aVar = b;
                }
                f6 = ((f2 - f5) / 2.0f) + f5;
            } else if (b != null) {
                return b.m38046o(mVar);
            } else {
                f6 = ((f2 - f5) / 2.0f) + f5;
                z = false;
            }
        }
        if (aVar == null) {
            return C2356b.m38044a(f3);
        }
        return aVar.m38046o(mVar);
    }

    /* renamed from: a */
    float m38060a(C2355a aVar) {
        float l = m38049l() - aVar.m38049l();
        float g = m38054g() - aVar.m38054g();
        float h = m38053h() - aVar.m38053h();
        return (float) (Math.pow(Math.sqrt((l * l) + (g * g) + (h * h)), 0.63d) * 1.41d);
    }

    /* renamed from: g */
    float m38054g() {
        return this.f3276h;
    }

    /* renamed from: h */
    float m38053h() {
        return this.f3277i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public float m38052i() {
        return this.f3270b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public float m38051j() {
        return this.f3269a;
    }

    /* renamed from: k */
    float m38050k() {
        return this.f3271c;
    }

    /* renamed from: l */
    float m38049l() {
        return this.f3275g;
    }

    /* renamed from: o */
    int m38046o(C2380m mVar) {
        float f;
        float f2;
        if (m38052i() == 0.0d || m38050k() == 0.0d) {
            f = 0.0f;
        } else {
            f = m38052i() / ((float) Math.sqrt(m38050k() / 100.0d));
        }
        float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, mVar.m37943e()), 0.73d), 1.1111111111111112d);
        double j = (m38051j() * 3.1415927f) / 180.0f;
        float a = mVar.m37947a() * ((float) Math.pow(m38050k() / 100.0d, (1.0d / mVar.m37946b()) / mVar.m37938j()));
        float cos = ((float) (Math.cos(2.0d + j) + 3.8d)) * 0.25f * 3846.1538f * mVar.m37941g() * mVar.m37940h();
        float f3 = a / mVar.m37942f();
        float sin = (float) Math.sin(j);
        float cos2 = (float) Math.cos(j);
        float f4 = (((0.305f + f3) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f5 = cos2 * f4;
        float f6 = f4 * sin;
        float f7 = f3 * 460.0f;
        float f8 = (((451.0f * f5) + f7) + (288.0f * f6)) / 1403.0f;
        float f9 = ((f7 - (891.0f * f5)) - (261.0f * f6)) / 1403.0f;
        float signum = Math.signum(f8) * (100.0f / mVar.m37945c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f8) * 27.13d) / (400.0d - Math.abs(f8))), 2.380952380952381d));
        float signum2 = Math.signum(f9) * (100.0f / mVar.m37945c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f9) * 27.13d) / (400.0d - Math.abs(f9))), 2.380952380952381d));
        float signum3 = Math.signum(((f7 - (f5 * 220.0f)) - (f6 * 6300.0f)) / 1403.0f) * (100.0f / mVar.m37945c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f2) * 27.13d) / (400.0d - Math.abs(f2))), 2.380952380952381d));
        float f10 = signum / mVar.m37939i()[0];
        float f11 = signum2 / mVar.m37939i()[1];
        float f12 = signum3 / mVar.m37939i()[2];
        float[][] fArr = C2356b.f3279b;
        float[] fArr2 = fArr[0];
        float f13 = (fArr2[0] * f10) + (fArr2[1] * f11) + (fArr2[2] * f12);
        float[] fArr3 = fArr[1];
        float[] fArr4 = fArr[2];
        return C2382a.m37929b(f13, (fArr3[0] * f10) + (fArr3[1] * f11) + (fArr3[2] * f12), (f10 * fArr4[0]) + (f11 * fArr4[1]) + (f12 * fArr4[2]));
    }

    /* renamed from: p */
    int m38045p() {
        return m38046o(C2380m.f3314k);
    }
}
