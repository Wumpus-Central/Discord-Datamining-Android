package p045cj;

import p326ri.C12689a0;

/* renamed from: cj.o */
/* loaded from: classes8.dex */
public final /* synthetic */ class C4058o {
    /* renamed from: a */
    public static /* synthetic */ String m32918a(long j, int i) {
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i2 == 0) {
            return "0";
        }
        if (i2 > 0) {
            return Long.toString(j, i);
        }
        if (i < 2 || i > 36) {
            i = 10;
        }
        int i3 = 64;
        char[] cArr = new char[64];
        int i4 = i - 1;
        if ((i & i4) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            do {
                i3--;
                cArr[i3] = Character.forDigit(((int) j) & i4, i);
                j >>>= numberOfTrailingZeros;
            } while (j != 0);
        } else {
            long a = (i & 1) == 0 ? (j >>> 1) / (i >>> 1) : C12689a0.m5871a(j, i);
            long j2 = i;
            cArr[63] = Character.forDigit((int) (j - (a * j2)), i);
            i3 = 63;
            while (a > 0) {
                i3--;
                cArr[i3] = Character.forDigit((int) (a % j2), i);
                a /= j2;
            }
        }
        return new String(cArr, i3, 64 - i3);
    }
}
