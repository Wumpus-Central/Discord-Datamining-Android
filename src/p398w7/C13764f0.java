package p398w7;

import p119g9.C7544l0;
import p119g9.C7557q0;
import p119g9.C7570y;
import p228m7.AbstractC10515j;
import p228m7.C10533x;

/* renamed from: w7.f0 */
/* loaded from: classes7.dex */
final class C13764f0 {

    /* renamed from: a */
    private final int f30779a;

    /* renamed from: d */
    private boolean f30782d;

    /* renamed from: e */
    private boolean f30783e;

    /* renamed from: f */
    private boolean f30784f;

    /* renamed from: b */
    private final C7544l0 f30780b = new C7544l0(0);

    /* renamed from: g */
    private long f30785g = -9223372036854775807L;

    /* renamed from: h */
    private long f30786h = -9223372036854775807L;

    /* renamed from: i */
    private long f30787i = -9223372036854775807L;

    /* renamed from: c */
    private final C7570y f30781c = new C7570y();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13764f0(int i) {
        this.f30779a = i;
    }

    /* renamed from: a */
    private int m2788a(AbstractC10515j jVar) {
        this.f30781c.m22020M(C7557q0.f16373f);
        this.f30782d = true;
        jVar.mo12936f();
        return 0;
    }

    /* renamed from: f */
    private int m2783f(AbstractC10515j jVar, C10533x xVar, int i) {
        int min = (int) Math.min(this.f30779a, jVar.getLength());
        long j = 0;
        if (jVar.getPosition() != j) {
            xVar.f23290a = j;
            return 1;
        }
        this.f30781c.m22021L(min);
        jVar.mo12936f();
        jVar.mo12930n(this.f30781c.m22012d(), 0, min);
        this.f30785g = m2782g(this.f30781c, i);
        this.f30783e = true;
        return 0;
    }

    /* renamed from: g */
    private long m2782g(C7570y yVar, int i) {
        int f = yVar.m22010f();
        for (int e = yVar.m22011e(); e < f; e++) {
            if (yVar.m22012d()[e] == 71) {
                long b = C13778j0.m2720b(yVar, e, i);
                if (b != -9223372036854775807L) {
                    return b;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: h */
    private int m2781h(AbstractC10515j jVar, C10533x xVar, int i) {
        long length = jVar.getLength();
        int min = (int) Math.min(this.f30779a, length);
        long j = length - min;
        if (jVar.getPosition() != j) {
            xVar.f23290a = j;
            return 1;
        }
        this.f30781c.m22021L(min);
        jVar.mo12936f();
        jVar.mo12930n(this.f30781c.m22012d(), 0, min);
        this.f30786h = m2780i(this.f30781c, i);
        this.f30784f = true;
        return 0;
    }

    /* renamed from: i */
    private long m2780i(C7570y yVar, int i) {
        int e = yVar.m22011e();
        int f = yVar.m22010f();
        while (true) {
            f--;
            if (f < e) {
                return -9223372036854775807L;
            }
            if (yVar.m22012d()[f] == 71) {
                long b = C13778j0.m2720b(yVar, f, i);
                if (b != -9223372036854775807L) {
                    return b;
                }
            }
        }
    }

    /* renamed from: b */
    public long m2787b() {
        return this.f30787i;
    }

    /* renamed from: c */
    public C7544l0 m2786c() {
        return this.f30780b;
    }

    /* renamed from: d */
    public boolean m2785d() {
        return this.f30782d;
    }

    /* renamed from: e */
    public int m2784e(AbstractC10515j jVar, C10533x xVar, int i) {
        if (i <= 0) {
            return m2788a(jVar);
        }
        if (!this.f30784f) {
            return m2781h(jVar, xVar, i);
        }
        if (this.f30786h == -9223372036854775807L) {
            return m2788a(jVar);
        }
        if (!this.f30783e) {
            return m2783f(jVar, xVar, i);
        }
        long j = this.f30785g;
        if (j == -9223372036854775807L) {
            return m2788a(jVar);
        }
        this.f30787i = this.f30780b.m22264b(this.f30786h) - this.f30780b.m22264b(j);
        return m2788a(jVar);
    }
}
