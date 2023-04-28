package p153i8;

import com.google.android.exoplayer2.source.TrackGroupArray;
import p029b9.AbstractC3415h;
import p079e7.C6722k;
import p079e7.C6725l;
import p079e7.C6736w;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7562u;
import p152i7.C8223h;
import p153i8.AbstractC8287r;

/* renamed from: i8.d */
/* loaded from: classes7.dex */
public final class C8237d implements AbstractC8287r, AbstractC8287r.AbstractC8288a {

    /* renamed from: k */
    public final AbstractC8287r f17846k;

    /* renamed from: l */
    private AbstractC8287r.AbstractC8288a f17847l;

    /* renamed from: m */
    private C8238a[] f17848m = new C8238a[0];

    /* renamed from: n */
    private long f17849n;

    /* renamed from: o */
    long f17850o;

    /* renamed from: p */
    long f17851p;

    /* renamed from: i8.d$a */
    /* loaded from: classes7.dex */
    private final class C8238a implements AbstractC8278o0 {

        /* renamed from: k */
        public final AbstractC8278o0 f17852k;

        /* renamed from: l */
        private boolean f17853l;

        public C8238a(AbstractC8278o0 o0Var) {
            this.f17852k = o0Var;
        }

        @Override // p153i8.AbstractC8278o0
        /* renamed from: a */
        public void mo12456a() {
            this.f17852k.mo12456a();
        }

        /* renamed from: b */
        public void m20222b() {
            this.f17853l = false;
        }

        @Override // p153i8.AbstractC8278o0
        /* renamed from: e */
        public boolean mo12452e() {
            return !C8237d.this.m20226k() && this.f17852k.mo12452e();
        }

        @Override // p153i8.AbstractC8278o0
        /* renamed from: j */
        public int mo12451j(C6725l lVar, C8223h hVar, boolean z) {
            if (C8237d.this.m20226k()) {
                return -3;
            }
            if (this.f17853l) {
                hVar.m20297m(4);
                return -4;
            }
            int j = this.f17852k.mo12451j(lVar, hVar, z);
            if (j == -5) {
                C6722k kVar = (C6722k) C7510a.m22367e(lVar.f14361b);
                int i = kVar.f37972L;
                if (!(i == 0 && kVar.f37973M == 0)) {
                    C8237d dVar = C8237d.this;
                    int i2 = 0;
                    if (dVar.f17850o != 0) {
                        i = 0;
                    }
                    if (dVar.f17851p == Long.MIN_VALUE) {
                        i2 = kVar.f37973M;
                    }
                    lVar.f14361b = kVar.m24531a().m24511M(i).m24510N(i2).m24519E();
                }
                return -5;
            }
            C8237d dVar2 = C8237d.this;
            long j2 = dVar2.f17851p;
            if (j2 == Long.MIN_VALUE || ((j != -4 || hVar.f17800o < j2) && (j != -3 || dVar2.mo12413g() != Long.MIN_VALUE || hVar.f17799n))) {
                return j;
            }
            hVar.mo1151f();
            hVar.m20297m(4);
            this.f17853l = true;
            return -4;
        }

        @Override // p153i8.AbstractC8278o0
        /* renamed from: s */
        public int mo12450s(long j) {
            if (C8237d.this.m20226k()) {
                return -3;
            }
            return this.f17852k.mo12450s(j);
        }
    }

    public C8237d(AbstractC8287r rVar, boolean z, long j, long j2) {
        long j3;
        this.f17846k = rVar;
        if (z) {
            j3 = j;
        } else {
            j3 = -9223372036854775807L;
        }
        this.f17849n = j3;
        this.f17850o = j;
        this.f17851p = j2;
    }

    /* renamed from: e */
    private C6736w m20227e(long j, C6736w wVar) {
        long j2;
        long s = C7557q0.m22127s(wVar.f14372a, 0L, j - this.f17850o);
        long j3 = wVar.f14373b;
        long j4 = this.f17851p;
        if (j4 == Long.MIN_VALUE) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j4 - j;
        }
        long s2 = C7557q0.m22127s(j3, 0L, j2);
        if (s == wVar.f14372a && s2 == wVar.f14373b) {
            return wVar;
        }
        return new C6736w(s, s2);
    }

    /* renamed from: s */
    private static boolean m20224s(long j, AbstractC3415h[] hVarArr) {
        if (j != 0) {
            for (AbstractC3415h hVar : hVarArr) {
                if (hVar != null) {
                    C6722k p = hVar.mo34428p();
                    if (!C7562u.m22087a(p.f14329v, p.f14326s)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: b */
    public long mo12421b() {
        long b = this.f17846k.mo12421b();
        if (b != Long.MIN_VALUE) {
            long j = this.f17851p;
            if (j == Long.MIN_VALUE || b < j) {
                return b;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: c */
    public boolean mo12419c() {
        return this.f17846k.mo12419c();
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: d */
    public long mo12472d(long j, C6736w wVar) {
        long j2 = this.f17850o;
        if (j == j2) {
            return j2;
        }
        return this.f17846k.mo12472d(j, m20227e(j, wVar));
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: f */
    public boolean mo12415f(long j) {
        return this.f17846k.mo12415f(j);
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: g */
    public long mo12413g() {
        long g = this.f17846k.mo12413g();
        if (g != Long.MIN_VALUE) {
            long j = this.f17851p;
            if (j == Long.MIN_VALUE || g < j) {
                return g;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: h */
    public void mo12411h(long j) {
        this.f17846k.mo12411h(j);
    }

    @Override // p153i8.AbstractC8287r.AbstractC8288a
    /* renamed from: j */
    public void mo20028j(AbstractC8287r rVar) {
        ((AbstractC8287r.AbstractC8288a) C7510a.m22367e(this.f17847l)).mo20028j(this);
    }

    /* renamed from: k */
    boolean m20226k() {
        return this.f17849n != -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r0 > r6) goto L_0x0035;
     */
    @Override // p153i8.AbstractC8287r
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo12470l(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f17849n = r0
            i8.d$a[] r0 = r5.f17848m
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.m20222b()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            i8.r r0 = r5.f17846k
            long r0 = r0.mo12470l(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0034
            long r6 = r5.f17850o
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0035
            long r6 = r5.f17851p
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0034
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x0035
        L_0x0034:
            r2 = 1
        L_0x0035:
            p119g9.C7510a.m22366f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p153i8.C8237d.mo12470l(long):long");
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: m */
    public void mo12469m(AbstractC8287r.AbstractC8288a aVar, long j) {
        this.f17847l = aVar;
        this.f17846k.mo12469m(this, j);
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: n */
    public long mo12468n() {
        boolean z;
        if (m20226k()) {
            long j = this.f17849n;
            this.f17849n = -9223372036854775807L;
            long n = mo12468n();
            if (n != -9223372036854775807L) {
                return n;
            }
            return j;
        }
        long n2 = this.f17846k.mo12468n();
        if (n2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z2 = true;
        if (n2 >= this.f17850o) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        long j2 = this.f17851p;
        if (j2 != Long.MIN_VALUE && n2 > j2) {
            z2 = false;
        }
        C7510a.m22366f(z2);
        return n2;
    }

    /* renamed from: p */
    public void mo12471i(AbstractC8287r rVar) {
        ((AbstractC8287r.AbstractC8288a) C7510a.m22367e(this.f17847l)).mo12471i(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r2 > r4) goto L_0x0061;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    @Override // p153i8.AbstractC8287r
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo12466q(p029b9.AbstractC3415h[] r13, boolean[] r14, p153i8.AbstractC8278o0[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            i8.d$a[] r2 = new p153i8.C8237d.C8238a[r2]
            r0.f17848m = r2
            int r2 = r1.length
            i8.o0[] r9 = new p153i8.AbstractC8278o0[r2]
            r10 = 0
            r2 = r10
        L_0x000c:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L_0x0021
            i8.d$a[] r3 = r0.f17848m
            r4 = r1[r2]
            i8.d$a r4 = (p153i8.C8237d.C8238a) r4
            r3[r2] = r4
            if (r4 == 0) goto L_0x001c
            i8.o0 r11 = r4.f17852k
        L_0x001c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0021:
            i8.r r2 = r0.f17846k
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.mo12466q(r3, r4, r5, r6, r7)
            boolean r4 = r12.m20226k()
            if (r4 == 0) goto L_0x0043
            long r4 = r0.f17850o
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0043
            r6 = r13
            boolean r4 = m20224s(r4, r13)
            if (r4 == 0) goto L_0x0043
            r4 = r2
            goto L_0x0048
        L_0x0043:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0048:
            r0.f17849n = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x0063
            long r4 = r0.f17850o
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x0061
            long r4 = r0.f17851p
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0063
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r4 = r10
            goto L_0x0064
        L_0x0063:
            r4 = 1
        L_0x0064:
            p119g9.C7510a.m22366f(r4)
        L_0x0067:
            int r4 = r1.length
            if (r10 >= r4) goto L_0x008d
            r4 = r9[r10]
            if (r4 != 0) goto L_0x0073
            i8.d$a[] r4 = r0.f17848m
            r4[r10] = r11
            goto L_0x0084
        L_0x0073:
            i8.d$a[] r5 = r0.f17848m
            r6 = r5[r10]
            if (r6 == 0) goto L_0x007d
            i8.o0 r6 = r6.f17852k
            if (r6 == r4) goto L_0x0084
        L_0x007d:
            i8.d$a r6 = new i8.d$a
            r6.<init>(r4)
            r5[r10] = r6
        L_0x0084:
            i8.d$a[] r4 = r0.f17848m
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L_0x0067
        L_0x008d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p153i8.C8237d.mo12466q(b9.h[], boolean[], i8.o0[], boolean[], long):long");
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: r */
    public void mo12465r() {
        this.f17846k.mo12465r();
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: t */
    public TrackGroupArray mo12463t() {
        return this.f17846k.mo12463t();
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: u */
    public void mo12462u(long j, boolean z) {
        this.f17846k.mo12462u(j, z);
    }

    /* renamed from: v */
    public void m20223v(long j, long j2) {
        this.f17850o = j;
        this.f17851p = j2;
    }
}
