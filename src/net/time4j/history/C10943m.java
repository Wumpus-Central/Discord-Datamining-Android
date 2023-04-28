package net.time4j.history;

import net.time4j.base.C10813c;

/* renamed from: net.time4j.history.m */
/* loaded from: classes8.dex */
class C10943m {
    /* renamed from: a */
    public static void m11497a(int i, int i2, int i3) {
        if (i < -999999999 || i > 999999999) {
            throw new IllegalArgumentException("YEAR out of range: " + i);
        } else if (i2 < 1 || i2 > 12) {
            throw new IllegalArgumentException("MONTH out of range: " + i2);
        } else if (i3 < 1 || i3 > 31) {
            throw new IllegalArgumentException("DAY_OF_MONTH out of range: " + i3);
        } else if (i3 > m11496b(i, i2)) {
            throw new IllegalArgumentException("DAY_OF_MONTH exceeds month length in given year: " + m11488j(i, i2, i3));
        }
    }

    /* renamed from: b */
    public static int m11496b(int i, int i2) {
        switch (i2) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (m11495c(i)) {
                    return 29;
                }
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                throw new IllegalArgumentException("Invalid month: " + i2);
        }
    }

    /* renamed from: c */
    public static boolean m11495c(int i) {
        return C10813c.m12200c(i, 4) == 0;
    }

    /* renamed from: d */
    public static boolean m11494d(int i, int i2, int i3) {
        return i >= -999999999 && i <= 999999999 && i2 >= 1 && i2 <= 12 && i3 >= 1 && i3 <= m11496b(i, i2);
    }

    /* renamed from: e */
    public static int m11493e(long j) {
        return (int) (j & 255);
    }

    /* renamed from: f */
    public static int m11492f(long j) {
        return (int) ((j >> 16) & 255);
    }

    /* renamed from: g */
    public static int m11491g(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: h */
    public static long m11490h(int i, int i2, int i3) {
        m11497a(i, i2, i3);
        long j = i;
        if (i2 < 3) {
            j--;
            i2 += 12;
        }
        return (((((365 * j) + C10813c.m12201b(j, 4)) + (((i2 + 1) * 153) / 5)) - 123) + i3) - 678883;
    }

    /* renamed from: i */
    public static long m11489i(long j) {
        int i;
        long j2;
        long f = C10813c.m12197f(j, 678883L);
        long b = C10813c.m12201b(f, 1461);
        int d = C10813c.m12199d(f, 1461);
        int i2 = 2;
        if (d == 1460) {
            j2 = (b + 1) * 4;
            i = 29;
        } else {
            int i3 = d / 365;
            int i4 = d % 365;
            j2 = (b * 4) + i3;
            i2 = 2 + (((i4 + 31) * 5) / 153);
            i = (i4 - (((i2 + 1) * 153) / 5)) + 123;
            if (i2 > 12) {
                j2++;
                i2 -= 12;
            }
        }
        if (j2 < -999999999 || j2 > 999999999) {
            throw new IllegalArgumentException("Year out of range: " + j2);
        }
        return i | (j2 << 32) | (i2 << 16);
    }

    /* renamed from: j */
    private static String m11488j(int i, int i2, int i3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i);
        sb2.append('-');
        if (i2 < 10) {
            sb2.append('0');
        }
        sb2.append(i2);
        sb2.append('-');
        if (i3 < 10) {
            sb2.append('0');
        }
        sb2.append(i3);
        return sb2.toString();
    }
}
