package com.facebook.yoga;

/* renamed from: com.facebook.yoga.f */
/* loaded from: classes7.dex */
public class C5128f {
    /* renamed from: a */
    public static long m30593a(float f, float f2) {
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        return Float.floatToRawIntBits(f2) | (floatToRawIntBits << 32);
    }

    /* renamed from: b */
    public static long m30592b(int i, int i2) {
        return m30593a(i, i2);
    }
}
