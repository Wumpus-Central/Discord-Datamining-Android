package p398w7;

import p119g9.C7570y;

/* renamed from: w7.j0 */
/* loaded from: classes7.dex */
public final class C13778j0 {
    /* renamed from: a */
    public static int m2721a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    /* renamed from: b */
    public static long m2720b(C7570y yVar, int i, int i2) {
        boolean z;
        yVar.m22017P(i);
        if (yVar.m22015a() < 5) {
            return -9223372036854775807L;
        }
        int n = yVar.m22002n();
        if ((8388608 & n) != 0 || ((2096896 & n) >> 8) != i2) {
            return -9223372036854775807L;
        }
        boolean z2 = true;
        if ((n & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && yVar.m22029D() >= 7 && yVar.m22015a() >= 7) {
            if ((yVar.m22029D() & 16) != 16) {
                z2 = false;
            }
            if (z2) {
                byte[] bArr = new byte[6];
                yVar.m22006j(bArr, 0, 6);
                return m2719c(bArr);
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: c */
    private static long m2719c(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
