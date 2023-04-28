package p271oj;

import net.time4j.base.AbstractC10811a;
import net.time4j.base.C10812b;

/* renamed from: oj.f */
/* loaded from: classes8.dex */
public enum EnumC11413f {
    POSIX,
    UTC,
    TAI,
    GPS,
    TT,
    UT;

    /* renamed from: a */
    private static double m10109a(int i, double d) {
        double d2;
        double d3;
        if (i < -2000 || i > 3000) {
            throw new IllegalArgumentException("Year out of range: " + i);
        }
        if (i <= 2050) {
            if (i >= 2018) {
                double d4 = d - 2000.0d;
                d2 = ((0.012125d * d4) + 0.0533d) * d4;
                d3 = 64.16d;
            } else if (i >= 2005) {
                double d5 = d - 2000.0d;
                d2 = ((((((4.2060317E-5d * d5) - 0.00112745d) * d5) + 0.014201d) * d5) + 0.171417d) * d5;
                d3 = 63.5934d;
            } else if (i >= 1986) {
                double d6 = d - 2000.0d;
                d2 = ((((((((2.373599E-5d * d6) + 6.51814E-4d) * d6) + 0.0017275d) * d6) - 0.060374d) * d6) + 0.3345d) * d6;
                d3 = 63.86d;
            } else if (i >= 1961) {
                double d7 = d - 1975.0d;
                return ((((0.0d - (d7 / 718.0d)) * d7) + 1.067d) * d7) + 45.45d;
            } else if (i >= 1941) {
                double d8 = d - 1950.0d;
                d2 = ((((d8 / 2547.0d) + 0.0d) * d8) + 0.407d) * d8;
                d3 = 29.07d;
            } else if (i >= 1920) {
                double d9 = d - 1920.0d;
                d2 = ((((0.0020936d * d9) - 0.0761d) * d9) + 0.84493d) * d9;
                d3 = 21.2d;
            } else if (i >= 1900) {
                double d10 = d - 1900.0d;
                return ((((((0.0061966d - (1.97E-4d * d10)) * d10) - 0.0598939d) * d10) + 1.494119d) * d10) - 2.79d;
            } else if (i >= 1860) {
                double d11 = d - 1860.0d;
                d2 = ((((((((d11 / 233174.0d) - 4.473624E-4d) * d11) + 0.01680668d) * d11) - 0.251754d) * d11) + 0.5737d) * d11;
                d3 = 7.62d;
            } else if (i >= 1800) {
                double d12 = d - 1800.0d;
                d2 = ((((((((((((8.75E-10d * d12) - 1.699E-7d) * d12) + 1.21272E-5d) * d12) - 3.7436E-4d) * d12) + 0.0041116d) * d12) + 0.0068612d) * d12) - 0.332447d) * d12;
                d3 = 13.72d;
            } else if (i >= 1700) {
                double d13 = d - 1700.0d;
                d2 = ((((((d13 / 1174000.0d) + 1.3336E-4d) * d13) - 0.0059285d) * d13) + 0.1603d) * d13;
                d3 = 8.83d;
            } else if (i >= 1600) {
                double d14 = d - 1600.0d;
                d2 = ((((d14 / 7129.0d) - 0.01532d) * d14) - 0.9808d) * d14;
                d3 = 120.0d;
            } else if (i >= 500) {
                double d15 = (d - 1000.0d) / 100.0d;
                d2 = ((((((((((0.0083572073d * d15) - 0.005050998d) * d15) - 0.8503463d) * d15) + 0.319781d) * d15) + 71.23472d) * d15) - 556.01d) * d15;
                d3 = 1574.2d;
            } else if (i >= -500) {
                double d16 = d / 100.0d;
                d2 = ((((((((((0.0090316521d * d16) + 0.022174192d) * d16) - 0.1798452d) * d16) - 5.952053d) * d16) + 33.78311d) * d16) - 1014.41d) * d16;
                d3 = 10583.6d;
            }
            return d2 + d3;
        }
        double d17 = (d - 1820.0d) / 100.0d;
        return ((32.0d * d17) * d17) - 20.0d;
    }

    /* renamed from: b */
    public static double m10108b(int i, int i2) {
        if (i2 >= 1 && i2 <= 12) {
            return m10109a(i, i + ((i2 - 0.5d) / 12.0d));
        }
        throw new IllegalArgumentException("Month out of range: " + i2);
    }

    /* renamed from: c */
    public static double m10107c(AbstractC10811a aVar) {
        int i;
        int m = aVar.mo11643m();
        if (C10812b.m12211e(m)) {
            i = 366;
        } else {
            i = 365;
        }
        int n = aVar.mo11642n();
        int i2 = 1;
        int i3 = 0;
        for (int i4 = 1; i4 < n; i4++) {
            i3 += C10812b.m12212d(m, i4);
        }
        int o = i3 + aVar.mo11641o();
        if (o <= i) {
            if (m == -2001 && o == 365) {
                m = -2000;
            } else {
                i2 = o;
            }
            return m10109a(m, m + ((i2 - 1.0d) / i));
        }
        throw new IllegalArgumentException(aVar.toString());
    }
}
