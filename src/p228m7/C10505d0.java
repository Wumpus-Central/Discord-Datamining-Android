package p228m7;

import java.util.Arrays;
import p079e7.C6728o;
import p119g9.C7558r;
import p119g9.C7570y;

/* renamed from: m7.d0 */
/* loaded from: classes7.dex */
public final class C10505d0 {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m7.d0$a */
    /* loaded from: classes7.dex */
    public static final class C10506a {

        /* renamed from: a */
        public final int f23212a;

        /* renamed from: b */
        public final int f23213b;

        /* renamed from: c */
        public final long[] f23214c;

        /* renamed from: d */
        public final int f23215d;

        /* renamed from: e */
        public final boolean f23216e;

        public C10506a(int i, int i2, long[] jArr, int i3, boolean z) {
            this.f23212a = i;
            this.f23213b = i2;
            this.f23214c = jArr;
            this.f23215d = i3;
            this.f23216e = z;
        }
    }

    /* renamed from: m7.d0$b */
    /* loaded from: classes7.dex */
    public static final class C10507b {

        /* renamed from: a */
        public final String f23217a;

        /* renamed from: b */
        public final String[] f23218b;

        /* renamed from: c */
        public final int f23219c;

        public C10507b(String str, String[] strArr, int i) {
            this.f23217a = str;
            this.f23218b = strArr;
            this.f23219c = i;
        }
    }

    /* renamed from: m7.d0$c */
    /* loaded from: classes7.dex */
    public static final class C10508c {

        /* renamed from: a */
        public final boolean f23220a;

        /* renamed from: b */
        public final int f23221b;

        /* renamed from: c */
        public final int f23222c;

        /* renamed from: d */
        public final int f23223d;

        public C10508c(boolean z, int i, int i2, int i3) {
            this.f23220a = z;
            this.f23221b = i;
            this.f23222c = i2;
            this.f23223d = i3;
        }
    }

    /* renamed from: m7.d0$d */
    /* loaded from: classes7.dex */
    public static final class C10509d {

        /* renamed from: a */
        public final int f23224a;

        /* renamed from: b */
        public final int f23225b;

        /* renamed from: c */
        public final int f23226c;

        /* renamed from: d */
        public final int f23227d;

        /* renamed from: e */
        public final int f23228e;

        /* renamed from: f */
        public final int f23229f;

        /* renamed from: g */
        public final int f23230g;

        /* renamed from: h */
        public final int f23231h;

        /* renamed from: i */
        public final boolean f23232i;

        /* renamed from: j */
        public final byte[] f23233j;

        public C10509d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr) {
            this.f23224a = i;
            this.f23225b = i2;
            this.f23226c = i3;
            this.f23227d = i4;
            this.f23228e = i5;
            this.f23229f = i6;
            this.f23230g = i7;
            this.f23231h = i8;
            this.f23232i = z;
            this.f23233j = bArr;
        }
    }

    /* renamed from: a */
    public static int m12997a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: b */
    private static long m12996b(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    /* renamed from: c */
    private static C10506a m12995c(C10503c0 c0Var) {
        if (c0Var.m13000d(24) == 5653314) {
            int d = c0Var.m13000d(16);
            int d2 = c0Var.m13000d(24);
            long[] jArr = new long[d2];
            boolean c = c0Var.m13001c();
            long j = 0;
            if (!c) {
                boolean c2 = c0Var.m13001c();
                for (int i = 0; i < d2; i++) {
                    if (!c2) {
                        jArr[i] = c0Var.m13000d(5) + 1;
                    } else if (c0Var.m13001c()) {
                        jArr[i] = c0Var.m13000d(5) + 1;
                    } else {
                        jArr[i] = 0;
                    }
                }
            } else {
                int d3 = c0Var.m13000d(5) + 1;
                int i2 = 0;
                while (i2 < d2) {
                    int d4 = c0Var.m13000d(m12997a(d2 - i2));
                    for (int i3 = 0; i3 < d4 && i2 < d2; i3++) {
                        jArr[i2] = d3;
                        i2++;
                    }
                    d3++;
                }
            }
            int d5 = c0Var.m13000d(4);
            if (d5 <= 2) {
                if (d5 == 1 || d5 == 2) {
                    c0Var.m12999e(32);
                    c0Var.m12999e(32);
                    int d6 = c0Var.m13000d(4) + 1;
                    c0Var.m12999e(1);
                    if (d5 != 1) {
                        j = d2 * d;
                    } else if (d != 0) {
                        j = m12996b(d2, d);
                    }
                    c0Var.m12999e((int) (j * d6));
                }
                return new C10506a(d, d2, jArr, d5, c);
            }
            throw new C6728o("lookup type greater than 2 not decodable: " + d5);
        }
        throw new C6728o("expected code book to start with [0x56, 0x43, 0x42] at " + c0Var.m13002b());
    }

    /* renamed from: d */
    private static void m12994d(C10503c0 c0Var) {
        int d = c0Var.m13000d(6) + 1;
        for (int i = 0; i < d; i++) {
            int d2 = c0Var.m13000d(16);
            if (d2 == 0) {
                c0Var.m12999e(8);
                c0Var.m12999e(16);
                c0Var.m12999e(16);
                c0Var.m12999e(6);
                c0Var.m12999e(8);
                int d3 = c0Var.m13000d(4) + 1;
                for (int i2 = 0; i2 < d3; i2++) {
                    c0Var.m12999e(8);
                }
            } else if (d2 == 1) {
                int d4 = c0Var.m13000d(5);
                int[] iArr = new int[d4];
                int i3 = -1;
                for (int i4 = 0; i4 < d4; i4++) {
                    int d5 = c0Var.m13000d(4);
                    iArr[i4] = d5;
                    if (d5 > i3) {
                        i3 = d5;
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = c0Var.m13000d(3) + 1;
                    int d6 = c0Var.m13000d(2);
                    if (d6 > 0) {
                        c0Var.m12999e(8);
                    }
                    for (int i7 = 0; i7 < (1 << d6); i7++) {
                        c0Var.m12999e(8);
                    }
                }
                c0Var.m12999e(2);
                int d7 = c0Var.m13000d(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < d4; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        c0Var.m12999e(d7);
                        i9++;
                    }
                }
            } else {
                throw new C6728o("floor type greater than 1 not decodable: " + d2);
            }
        }
    }

    /* renamed from: e */
    private static void m12993e(int i, C10503c0 c0Var) {
        int i2;
        int d = c0Var.m13000d(6) + 1;
        for (int i3 = 0; i3 < d; i3++) {
            int d2 = c0Var.m13000d(16);
            if (d2 != 0) {
                C7558r.m22109c("VorbisUtil", "mapping type other than 0 not supported: " + d2);
            } else {
                if (c0Var.m13001c()) {
                    i2 = c0Var.m13000d(4) + 1;
                } else {
                    i2 = 1;
                }
                if (c0Var.m13001c()) {
                    int d3 = c0Var.m13000d(8) + 1;
                    for (int i4 = 0; i4 < d3; i4++) {
                        int i5 = i - 1;
                        c0Var.m12999e(m12997a(i5));
                        c0Var.m12999e(m12997a(i5));
                    }
                }
                if (c0Var.m13000d(2) == 0) {
                    if (i2 > 1) {
                        for (int i6 = 0; i6 < i; i6++) {
                            c0Var.m12999e(4);
                        }
                    }
                    for (int i7 = 0; i7 < i2; i7++) {
                        c0Var.m12999e(8);
                        c0Var.m12999e(8);
                        c0Var.m12999e(8);
                    }
                } else {
                    throw new C6728o("to reserved bits must be zero after mapping coupling steps");
                }
            }
        }
    }

    /* renamed from: f */
    private static C10508c[] m12992f(C10503c0 c0Var) {
        int d = c0Var.m13000d(6) + 1;
        C10508c[] cVarArr = new C10508c[d];
        for (int i = 0; i < d; i++) {
            cVarArr[i] = new C10508c(c0Var.m13001c(), c0Var.m13000d(16), c0Var.m13000d(16), c0Var.m13000d(8));
        }
        return cVarArr;
    }

    /* renamed from: g */
    private static void m12991g(C10503c0 c0Var) {
        int i;
        int d = c0Var.m13000d(6) + 1;
        for (int i2 = 0; i2 < d; i2++) {
            if (c0Var.m13000d(16) <= 2) {
                c0Var.m12999e(24);
                c0Var.m12999e(24);
                c0Var.m12999e(24);
                int d2 = c0Var.m13000d(6) + 1;
                c0Var.m12999e(8);
                int[] iArr = new int[d2];
                for (int i3 = 0; i3 < d2; i3++) {
                    int d3 = c0Var.m13000d(3);
                    if (c0Var.m13001c()) {
                        i = c0Var.m13000d(5);
                    } else {
                        i = 0;
                    }
                    iArr[i3] = (i * 8) + d3;
                }
                for (int i4 = 0; i4 < d2; i4++) {
                    for (int i5 = 0; i5 < 8; i5++) {
                        if ((iArr[i4] & (1 << i5)) != 0) {
                            c0Var.m12999e(8);
                        }
                    }
                }
            } else {
                throw new C6728o("residueType greater than 2 is not decodable");
            }
        }
    }

    /* renamed from: h */
    public static C10507b m12990h(C7570y yVar) {
        return m12989i(yVar, true, true);
    }

    /* renamed from: i */
    public static C10507b m12989i(C7570y yVar, boolean z, boolean z2) {
        if (z) {
            m12986l(3, yVar, false);
        }
        String A = yVar.m22032A((int) yVar.m21996t());
        int length = 11 + A.length();
        long t = yVar.m21996t();
        String[] strArr = new String[(int) t];
        int i = length + 4;
        for (int i2 = 0; i2 < t; i2++) {
            String A2 = yVar.m22032A((int) yVar.m21996t());
            strArr[i2] = A2;
            i = i + 4 + A2.length();
        }
        if (!z2 || (yVar.m22029D() & 1) != 0) {
            return new C10507b(A, strArr, i + 1);
        }
        throw new C6728o("framing bit expected to be set");
    }

    /* renamed from: j */
    public static C10509d m12988j(C7570y yVar) {
        boolean z = true;
        m12986l(1, yVar, false);
        int u = yVar.m21995u();
        int D = yVar.m22029D();
        int u2 = yVar.m21995u();
        int q = yVar.m21999q();
        if (q <= 0) {
            q = -1;
        }
        int q2 = yVar.m21999q();
        if (q2 <= 0) {
            q2 = -1;
        }
        int q3 = yVar.m21999q();
        if (q3 <= 0) {
            q3 = -1;
        }
        int D2 = yVar.m22029D();
        int pow = (int) Math.pow(2.0d, D2 & 15);
        int pow2 = (int) Math.pow(2.0d, (D2 & 240) >> 4);
        if ((yVar.m22029D() & 1) <= 0) {
            z = false;
        }
        return new C10509d(u, D, u2, q, q2, q3, pow, pow2, z, Arrays.copyOf(yVar.m22012d(), yVar.m22010f()));
    }

    /* renamed from: k */
    public static C10508c[] m12987k(C7570y yVar, int i) {
        m12986l(5, yVar, false);
        int D = yVar.m22029D() + 1;
        C10503c0 c0Var = new C10503c0(yVar.m22012d());
        c0Var.m12999e(yVar.m22011e() * 8);
        for (int i2 = 0; i2 < D; i2++) {
            m12995c(c0Var);
        }
        int d = c0Var.m13000d(6) + 1;
        for (int i3 = 0; i3 < d; i3++) {
            if (c0Var.m13000d(16) != 0) {
                throw new C6728o("placeholder of time domain transforms not zeroed out");
            }
        }
        m12994d(c0Var);
        m12991g(c0Var);
        m12993e(i, c0Var);
        C10508c[] f = m12992f(c0Var);
        if (c0Var.m13001c()) {
            return f;
        }
        throw new C6728o("framing bit after modes not set as expected");
    }

    /* renamed from: l */
    public static boolean m12986l(int i, C7570y yVar, boolean z) {
        if (yVar.m22015a() < 7) {
            if (z) {
                return false;
            }
            throw new C6728o("too short header: " + yVar.m22015a());
        } else if (yVar.m22029D() != i) {
            if (z) {
                return false;
            }
            throw new C6728o("expected header type " + Integer.toHexString(i));
        } else if (yVar.m22029D() == 118 && yVar.m22029D() == 111 && yVar.m22029D() == 114 && yVar.m22029D() == 98 && yVar.m22029D() == 105 && yVar.m22029D() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new C6728o("expected characters 'vorbis'");
        }
    }
}
