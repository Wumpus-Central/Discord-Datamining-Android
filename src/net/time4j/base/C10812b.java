package net.time4j.base;

import com.facebook.react.views.text.TypefaceStyle;

/* renamed from: net.time4j.base.b */
/* loaded from: classes8.dex */
public final class C10812b {
    /* renamed from: a */
    public static void m12215a(int i, int i2, int i3) {
        if (i < -999999999 || i > 999999999) {
            throw new IllegalArgumentException("YEAR out of range: " + i);
        } else if (i2 < 1 || i2 > 12) {
            throw new IllegalArgumentException("MONTH out of range: " + i2);
        } else if (i3 < 1 || i3 > 31) {
            throw new IllegalArgumentException("DAY_OF_MONTH out of range: " + i3);
        } else if (i3 > m12212d(i, i2)) {
            throw new IllegalArgumentException("DAY_OF_MONTH exceeds month length in given year: " + m12203m(i, i2, i3));
        }
    }

    /* renamed from: b */
    private static int m12214b(int i) {
        switch (i) {
            case 1:
                return 28;
            case 2:
                return 31;
            case 3:
                return 2;
            case 4:
                return 5;
            case 5:
                return 7;
            case 6:
                return 10;
            case 7:
                return 12;
            case 8:
                return 15;
            case 9:
                return 18;
            case 10:
                return 20;
            case 11:
                return 23;
            case 12:
                return 25;
            default:
                throw new IllegalArgumentException("Month out of range: " + i);
        }
    }

    /* renamed from: c */
    public static int m12213c(int i, int i2, int i3) {
        if (i3 < 1 || i3 > 31) {
            throw new IllegalArgumentException("Day out of range: " + i3);
        } else if (i3 <= m12212d(i, i2)) {
            int b = m12214b(i2);
            int i4 = i % 100;
            int a = C10813c.m12202a(i, 100);
            if (i4 < 0) {
                i4 += 100;
            }
            if (i2 <= 2 && i4 - 1 < 0) {
                a--;
                i4 = 99;
            }
            int a2 = (((((i3 + b) + i4) + (i4 / 4)) + C10813c.m12202a(a, 4)) - (a * 2)) % 7;
            if (a2 <= 0) {
                return a2 + 7;
            }
            return a2;
        } else {
            throw new IllegalArgumentException("Day exceeds month length: " + m12203m(i, i2, i3));
        }
    }

    /* renamed from: d */
    public static int m12212d(int i, int i2) {
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
                if (m12211e(i)) {
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

    /* renamed from: e */
    public static boolean m12211e(int i) {
        return (i <= 1900 || i >= 2100) ? ((i & 3) == 0 && i % 100 != 0) || i % TypefaceStyle.NORMAL == 0 : (i & 3) == 0;
    }

    /* renamed from: f */
    public static boolean m12210f(int i, int i2, int i3) {
        return i >= -999999999 && i <= 999999999 && i2 >= 1 && i2 <= 12 && i3 >= 1 && i3 <= m12212d(i, i2);
    }

    /* renamed from: g */
    public static int m12209g(long j) {
        return (int) (j & 255);
    }

    /* renamed from: h */
    public static int m12208h(long j) {
        return (int) ((j >> 16) & 255);
    }

    /* renamed from: i */
    public static int m12207i(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: j */
    public static long m12206j(int i, int i2, int i3) {
        m12215a(i, i2, i3);
        long j = i;
        if (i2 < 3) {
            j--;
            i2 += 12;
        }
        return (((((((365 * j) + C10813c.m12201b(j, 4)) - C10813c.m12201b(j, 100)) + C10813c.m12201b(j, TypefaceStyle.NORMAL)) + (((i2 + 1) * 153) / 5)) - 123) + i3) - 678881;
    }

    /* renamed from: k */
    public static long m12205k(AbstractC10811a aVar) {
        return m12206j(aVar.mo11643m(), aVar.mo11642n(), aVar.mo11641o());
    }

    /* renamed from: l */
    public static long m12204l(long j) {
        long j2;
        long f = C10813c.m12197f(j, 678881L);
        long b = C10813c.m12201b(f, 146097);
        int d = C10813c.m12199d(f, 146097);
        int i = 29;
        int i2 = 2;
        if (d == 146096) {
            j2 = (b + 1) * 400;
        } else {
            int i3 = d / 36524;
            int i4 = d % 36524;
            int i5 = i4 / 1461;
            int i6 = i4 % 1461;
            if (i6 == 1460) {
                j2 = (b * 400) + (i3 * 100) + ((i5 + 1) * 4);
            } else {
                int i7 = i6 / 365;
                int i8 = i6 % 365;
                j2 = (b * 400) + (i3 * 100) + (i5 * 4) + i7;
                i2 = 2 + (((i8 + 31) * 5) / 153);
                i = (i8 - (((i2 + 1) * 153) / 5)) + 123;
                if (i2 > 12) {
                    j2++;
                    i2 -= 12;
                }
            }
        }
        if (j2 >= -999999999 && j2 <= 999999999) {
            return (j2 << 32) | (i2 << 16) | i;
        }
        throw new IllegalArgumentException("Year out of range: " + j2);
    }

    /* renamed from: m */
    static String m12203m(int i, int i2, int i3) {
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
