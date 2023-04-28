package p299qb;

/* renamed from: qb.a */
/* loaded from: classes3.dex */
public final class C12102a {
    /* renamed from: a */
    public static float m7838a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    /* renamed from: b */
    public static float m7837b(float f, float f2, float f3, float f4, float f5, float f6) {
        return m7835d(m7838a(f, f2, f3, f4), m7838a(f, f2, f5, f4), m7838a(f, f2, f5, f6), m7838a(f, f2, f3, f6));
    }

    /* renamed from: c */
    public static float m7836c(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: d */
    private static float m7835d(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }
}
