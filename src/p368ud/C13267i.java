package p368ud;

import id.C8388a;
import java.lang.reflect.Array;
import td.C13054a;

/* renamed from: ud.i */
/* loaded from: classes3.dex */
final class C13267i {

    /* renamed from: a */
    private static final float[][] f29788a = (float[][]) Array.newInstance(Float.TYPE, C13054a.f29353b.length, 8);

    static {
        int i;
        int i2 = 0;
        while (true) {
            int[] iArr = C13054a.f29353b;
            if (i2 < iArr.length) {
                int i3 = iArr[i2];
                int i4 = i3 & 1;
                int i5 = 0;
                while (i5 < 8) {
                    float f = 0.0f;
                    while (true) {
                        i = i3 & 1;
                        if (i == i4) {
                            f += 1.0f;
                            i3 >>= 1;
                        }
                    }
                    f29788a[i2][(8 - i5) - 1] = f / 17.0f;
                    i5++;
                    i4 = i;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static int m4139a(int[] iArr) {
        long j = 0;
        for (int i = 0; i < iArr.length; i++) {
            for (int i2 = 0; i2 < iArr[i]; i2++) {
                int i3 = 1;
                long j2 = j << 1;
                if (i % 2 != 0) {
                    i3 = 0;
                }
                j = j2 | i3;
            }
        }
        return (int) j;
    }

    /* renamed from: b */
    private static int m4138b(int[] iArr) {
        int d = C8388a.m19875d(iArr);
        float[] fArr = new float[8];
        if (d > 1) {
            for (int i = 0; i < 8; i++) {
                fArr[i] = iArr[i] / d;
            }
        }
        float f = Float.MAX_VALUE;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            float[][] fArr2 = f29788a;
            if (i3 >= fArr2.length) {
                return i2;
            }
            float[] fArr3 = fArr2[i3];
            float f2 = 0.0f;
            for (int i4 = 0; i4 < 8; i4++) {
                float f3 = fArr3[i4] - fArr[i4];
                f2 += f3 * f3;
                if (f2 >= f) {
                    break;
                }
            }
            if (f2 < f) {
                i2 = C13054a.f29353b[i3];
                f = f2;
            }
            i3++;
        }
    }

    /* renamed from: c */
    private static int m4137c(int[] iArr) {
        int a = m4139a(iArr);
        if (C13054a.m4698a(a) == -1) {
            return -1;
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m4136d(int[] iArr) {
        int c = m4137c(m4135e(iArr));
        if (c != -1) {
            return c;
        }
        return m4138b(iArr);
    }

    /* renamed from: e */
    private static int[] m4135e(int[] iArr) {
        float d = C8388a.m19875d(iArr);
        int[] iArr2 = new int[8];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 17; i3++) {
            float f = (d / 34.0f) + ((i3 * d) / 17.0f);
            int i4 = iArr[i2];
            if (i + i4 <= f) {
                i += i4;
                i2++;
            }
            iArr2[i2] = iArr2[i2] + 1;
        }
        return iArr2;
    }
}
