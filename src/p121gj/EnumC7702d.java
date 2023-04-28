package p121gj;

import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.concurrent.TimeUnit;
import net.time4j.C10779a0;
import net.time4j.C10917h0;
import net.time4j.base.C10813c;

/* renamed from: gj.d */
/* loaded from: classes8.dex */
public enum EnumC7702d {
    NEW_MOON(0),
    FIRST_QUARTER(90),
    FULL_MOON(180),
    LAST_QUARTER(270);
    

    /* renamed from: k */
    private final transient int f16725k;

    /* renamed from: p */
    private static final int[] f16714p = {100, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, 10000, 100000};

    /* renamed from: q */
    private static final C10779a0 f16715q = C10917h0.m11651d0(2000, 1, 6, 18, 13, 42).m11661U();

    /* renamed from: r */
    private static final int[] f16716r = {0, 1, 0, 0, 1, 1, 2, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: s */
    private static final int[] f16717s = {0, 1, 1, 0, 0, 1, 2, 0, 0, 0, 1, 1, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: t */
    private static final int[] f16718t = {0, 1, 0, 0, -1, 1, 2, 0, 0, 1, 0, 1, 1, -1, 2, 0, 3, 1, 0, 1, -1, -1, 1, 0};

    /* renamed from: u */
    private static final int[] f16719u = {0, 1, 1, 0, 0, -1, 2, 0, 0, 0, -1, 1, 1, 2, 1, -1, 0, 1, -2, 1, 3, 0, -1, 1};

    /* renamed from: v */
    private static final int[] f16720v = {1, 0, 2, 0, 1, 1, 0, 1, 1, 2, 3, 0, 0, 2, 1, 2, 0, 1, 2, 1, 1, 1, 3, 4};

    /* renamed from: w */
    private static final int[] f16721w = {1, 0, 1, 2, 0, 1, 0, 1, 1, 3, 2, 0, 0, 1, 2, 1, 2, 1, 1, 1, 0, 2, 1, 3};

    /* renamed from: x */
    private static final int[] f16722x = {0, 0, 0, 2, 0, 0, 0, -2, 2, 0, 0, 2, -2, 0, 0, -2, 0, -2, 2, 2, 2, -2, 0, 0};

    /* renamed from: y */
    private static final int[] f16723y = {0, 0, 0, 0, 2, 0, 0, -2, 2, 0, 0, 2, -2, 0, 0, -2, 2, 2, 0, -2, 0, -2, 2, 0};

    /* renamed from: z */
    private static final double[] f16724z = {-0.4072d, 0.17241d, 0.01608d, 0.01039d, 0.00739d, -0.00514d, 0.00208d, -0.00111d, -5.7E-4d, 5.6E-4d, -4.2E-4d, 4.2E-4d, 3.8E-4d, -2.4E-4d, -7.0E-5d, 4.0E-5d, 4.0E-5d, 3.0E-5d, 3.0E-5d, -3.0E-5d, 3.0E-5d, -2.0E-5d, -2.0E-5d, 2.0E-5d};

    /* renamed from: A */
    private static final double[] f38398A = {-0.40614d, 0.17302d, 0.01614d, 0.01043d, 0.00734d, -0.00515d, 0.00209d, -0.00111d, -5.7E-4d, 5.6E-4d, -4.2E-4d, 4.2E-4d, 3.8E-4d, -2.4E-4d, -7.0E-5d, 4.0E-5d, 4.0E-5d, 3.0E-5d, 3.0E-5d, -3.0E-5d, 3.0E-5d, -2.0E-5d, -2.0E-5d, 2.0E-5d};

    /* renamed from: B */
    private static final double[] f38399B = {-0.62801d, 0.17172d, -0.01183d, 0.00862d, 0.00804d, 0.00454d, 0.00204d, -0.0018d, -7.0E-4d, -4.0E-4d, -3.4E-4d, 3.2E-4d, 3.2E-4d, -2.8E-4d, 2.7E-4d, -5.0E-5d, 4.0E-5d, -4.0E-5d, 4.0E-5d, 3.0E-5d, 3.0E-5d, 2.0E-5d, 2.0E-5d, -2.0E-5d};

    EnumC7702d(int i) {
        this.f16725k = i;
    }

    /* renamed from: d */
    private static double m21620d(double d, double d2, double d3, double d4) {
        return (((0.00306d - ((d * 3.8E-4d) * m21619e(d2))) + (m21619e(d3) * 2.6E-4d)) - (m21619e(d3 - d2) * 2.0E-5d)) + (m21619e(d3 + d2) * 2.0E-5d) + (m21619e(d4 * 2.0d) * 2.0E-5d);
    }

    /* renamed from: e */
    private static double m21619e(double d) {
        return Math.cos((d * 3.141592653589793d) / 180.0d);
    }

    /* renamed from: f */
    private int m21618f(C10779a0 a0Var) {
        return C10813c.m12196g(Math.round((f16715q.m20682L(a0Var, TimeUnit.DAYS) / 29.530588861d) - (this.f16725k / 360.0d)));
    }

    /* renamed from: g */
    private double m21617g(double d, double d2, double d3, double d4) {
        double[] dArr;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        EnumC7702d dVar = NEW_MOON;
        if (this == dVar) {
            dArr = f16724z;
        } else if (this == FULL_MOON) {
            dArr = f38398A;
        } else {
            dArr = f38399B;
        }
        if (this == dVar || this == FULL_MOON) {
            iArr = f16716r;
        } else {
            iArr = f16717s;
        }
        if (this == dVar || this == FULL_MOON) {
            iArr2 = f16718t;
        } else {
            iArr2 = f16719u;
        }
        if (this == dVar || this == FULL_MOON) {
            iArr3 = f16720v;
        } else {
            iArr3 = f16721w;
        }
        if (this == dVar || this == FULL_MOON) {
            iArr4 = f16722x;
        } else {
            iArr4 = f16723y;
        }
        double d5 = 0.0d;
        for (int i = 23; i >= 0; i--) {
            double d6 = dArr[i];
            int i2 = iArr[i];
            if (i2 != 1) {
                if (i2 == 2) {
                    d6 *= d;
                } else {
                    d5 += d6 * m21616h((iArr2[i] * d2) + (iArr3[i] * d3) + (iArr4[i] * d4));
                }
            }
            d6 *= d;
            d5 += d6 * m21616h((iArr2[i] * d2) + (iArr3[i] * d3) + (iArr4[i] * d4));
        }
        return d5;
    }

    /* renamed from: h */
    private static double m21616h(double d) {
        return Math.sin((d * 3.141592653589793d) / 180.0d);
    }

    /* renamed from: a */
    public C10779a0 m21623a(int i) {
        double d = i + (this.f16725k / 360.0d);
        double d2 = d / 1236.85d;
        double d3 = d2 * d2;
        double d4 = 1.0d - (((7.4E-6d * d2) + 0.002516d) * d2);
        double d5 = ((29.1053567d * d) + 2.5534d) - (((1.1E-7d * d2) + 1.4E-6d) * d3);
        double d6 = (385.81693528d * d) + 201.5643d + ((((1.238E-5d - (5.8E-8d * d2)) * d2) + 0.0107582d) * d3);
        double d7 = (390.67050284d * d) + 160.7108d + (((((1.1E-8d * d2) - 2.27E-6d) * d2) - 0.0016118d) * d3);
        double sin = ((((29.530588861d * d) + 2451550.09766d) + (((((7.3E-10d * d2) - 1.5E-7d) * d2) + 1.5437E-4d) * d3)) - (Math.sin(Math.toRadians((124.7746d - (1.56375588d * d)) + (((2.15E-6d * d2) + 0.0020672d) * d3))) * 1.7E-4d)) + m21617g(d4, d5, d6, d7);
        if (this == FIRST_QUARTER) {
            sin += m21620d(d4, d5, d6, d7);
        } else if (this == LAST_QUARTER) {
            sin -= m21620d(d4, d5, d6, d7);
        }
        double[] dArr = {((0.107408d * d) + 299.77d) - (d3 * 0.009173d), 3.25E-4d, (0.016321d * d) + 251.88d, 1.65E-4d, (26.651886d * d) + 251.83d, 1.64E-4d, (36.412478d * d) + 349.42d, 1.26E-4d, (18.206239d * d) + 84.66d, 1.1E-4d, (53.303771d * d) + 141.74d, 6.2E-5d, (2.453732d * d) + 207.14d, 6.0E-5d, (7.30686d * d) + 154.84d, 5.6E-5d, (27.261239d * d) + 34.52d, 4.7E-5d, (0.121824d * d) + 207.19d, 4.2E-5d, (1.844379d * d) + 291.34d, 4.0E-5d, (24.198154d * d) + 161.72d, 3.7E-5d, (25.513099d * d) + 239.56d, 3.5E-5d, (d * 3.592518d) + 331.55d, 2.3E-5d};
        for (int i2 = 0; i2 < 28; i2 += 2) {
            sin += dArr[i2 + 1] * Math.sin(Math.toRadians(dArr[i2]));
        }
        return (C10779a0) C7700c.m21626f(sin).m21624h().mo15654D(C10779a0.f23943y, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    public C10779a0 m21622b(C10779a0 a0Var) {
        int f = m21618f(a0Var);
        C10779a0 a = m21623a(f);
        int i = f;
        while (a.m12311l0(a0Var)) {
            i++;
            a = m21623a(i);
        }
        if (i <= f) {
            while (true) {
                i--;
                C10779a0 a2 = m21623a(i);
                if (a2.m12311l0(a0Var)) {
                    break;
                }
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: c */
    public C10779a0 m21621c(C10779a0 a0Var) {
        int f = m21618f(a0Var);
        C10779a0 a = m21623a(f);
        int i = f;
        while (!a.m12311l0(a0Var)) {
            i--;
            a = m21623a(i);
        }
        if (i >= f) {
            while (a.m20683K(29L, TimeUnit.DAYS).m12311l0(a0Var)) {
                i++;
                C10779a0 a2 = m21623a(i);
                if (!a2.m12311l0(a0Var)) {
                    break;
                }
                a = a2;
            }
        }
        return a;
    }
}
