package p398w7;

import p119g9.C7544l0;
import p119g9.C7557q0;
import p119g9.C7570y;
import p228m7.AbstractC10515j;
import p228m7.C10533x;

/* renamed from: w7.y */
/* loaded from: classes7.dex */
final class C13803y {

    /* renamed from: c */
    private boolean f31070c;

    /* renamed from: d */
    private boolean f31071d;

    /* renamed from: e */
    private boolean f31072e;

    /* renamed from: a */
    private final C7544l0 f31068a = new C7544l0(0);

    /* renamed from: f */
    private long f31073f = -9223372036854775807L;

    /* renamed from: g */
    private long f31074g = -9223372036854775807L;

    /* renamed from: h */
    private long f31075h = -9223372036854775807L;

    /* renamed from: b */
    private final C7570y f31069b = new C7570y();

    /* renamed from: a */
    private static boolean m2631a(byte[] bArr) {
        if ((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private int m2630b(AbstractC10515j jVar) {
        this.f31069b.m22020M(C7557q0.f16373f);
        this.f31070c = true;
        jVar.mo12936f();
        return 0;
    }

    /* renamed from: f */
    private int m2626f(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: h */
    private int m2624h(AbstractC10515j jVar, C10533x xVar) {
        int min = (int) Math.min(20000L, jVar.getLength());
        long j = 0;
        if (jVar.getPosition() != j) {
            xVar.f23290a = j;
            return 1;
        }
        this.f31069b.m22021L(min);
        jVar.mo12936f();
        jVar.mo12930n(this.f31069b.m22012d(), 0, min);
        this.f31073f = m2623i(this.f31069b);
        this.f31071d = true;
        return 0;
    }

    /* renamed from: i */
    private long m2623i(C7570y yVar) {
        int f = yVar.m22010f();
        for (int e = yVar.m22011e(); e < f - 3; e++) {
            if (m2626f(yVar.m22012d(), e) == 442) {
                yVar.m22017P(e + 4);
                long l = m2620l(yVar);
                if (l != -9223372036854775807L) {
                    return l;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: j */
    private int m2622j(AbstractC10515j jVar, C10533x xVar) {
        long length = jVar.getLength();
        int min = (int) Math.min(20000L, length);
        long j = length - min;
        if (jVar.getPosition() != j) {
            xVar.f23290a = j;
            return 1;
        }
        this.f31069b.m22021L(min);
        jVar.mo12936f();
        jVar.mo12930n(this.f31069b.m22012d(), 0, min);
        this.f31074g = m2621k(this.f31069b);
        this.f31072e = true;
        return 0;
    }

    /* renamed from: k */
    private long m2621k(C7570y yVar) {
        int e = yVar.m22011e();
        for (int f = yVar.m22010f() - 4; f >= e; f--) {
            if (m2626f(yVar.m22012d(), f) == 442) {
                yVar.m22017P(f + 4);
                long l = m2620l(yVar);
                if (l != -9223372036854775807L) {
                    return l;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: l */
    public static long m2620l(C7570y yVar) {
        int e = yVar.m22011e();
        if (yVar.m22015a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        yVar.m22006j(bArr, 0, 9);
        yVar.m22017P(e);
        if (!m2631a(bArr)) {
            return -9223372036854775807L;
        }
        return m2619m(bArr);
    }

    /* renamed from: m */
    private static long m2619m(byte[] bArr) {
        byte b = bArr[0];
        byte b2 = bArr[2];
        return (((b & 56) >> 3) << 30) | ((b & 3) << 28) | ((bArr[1] & 255) << 20) | (((b2 & 248) >> 3) << 15) | ((b2 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    /* renamed from: c */
    public long m2629c() {
        return this.f31075h;
    }

    /* renamed from: d */
    public C7544l0 m2628d() {
        return this.f31068a;
    }

    /* renamed from: e */
    public boolean m2627e() {
        return this.f31070c;
    }

    /* renamed from: g */
    public int m2625g(AbstractC10515j jVar, C10533x xVar) {
        if (!this.f31072e) {
            return m2622j(jVar, xVar);
        }
        if (this.f31074g == -9223372036854775807L) {
            return m2630b(jVar);
        }
        if (!this.f31071d) {
            return m2624h(jVar, xVar);
        }
        long j = this.f31073f;
        if (j == -9223372036854775807L) {
            return m2630b(jVar);
        }
        this.f31075h = this.f31068a.m22264b(this.f31074g) - this.f31068a.m22264b(j);
        return m2630b(jVar);
    }
}
