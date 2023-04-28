package p336s7;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;
import p079e7.C6713c;
import p079e7.C6722k;
import p080e8.C6750h;
import p080e8.C6756k;
import p080e8.C6760m;
import p117g7.C7466l0;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7570y;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10514i;
import p228m7.AbstractC10515j;
import p228m7.AbstractC10516k;
import p228m7.AbstractC10521o;
import p228m7.C10513h;
import p228m7.C10520n;
import p228m7.C10530u;
import p228m7.C10531v;
import p228m7.C10533x;
import p336s7.AbstractC12810g;
import p459z7.C14576a;

/* renamed from: s7.f */
/* loaded from: classes7.dex */
public final class C12809f implements AbstractC10514i {

    /* renamed from: u */
    public static final AbstractC10521o f28744u = new AbstractC10521o() { // from class: s7.d
        @Override // p228m7.AbstractC10521o
        /* renamed from: a */
        public /* synthetic */ AbstractC10514i[] mo2230a(Uri uri, Map map) {
            return C10520n.m12973a(this, uri, map);
        }

        @Override // p228m7.AbstractC10521o
        /* renamed from: b */
        public final AbstractC10514i[] mo2229b() {
            AbstractC10514i[] o;
            o = C12809f.m5431o();
            return o;
        }
    };

    /* renamed from: v */
    private static final C6750h.AbstractC6751a f28745v = new C6750h.AbstractC6751a() { // from class: s7.e
        @Override // p080e8.C6750h.AbstractC6751a
        /* renamed from: a */
        public final boolean mo5442a(int i, int i2, int i3, int i4, int i5) {
            boolean p;
            p = C12809f.m5430p(i, i2, i3, i4, i5);
            return p;
        }
    };

    /* renamed from: a */
    private final int f28746a;

    /* renamed from: b */
    private final long f28747b;

    /* renamed from: c */
    private final C7570y f28748c;

    /* renamed from: d */
    private final C7466l0.C7467a f28749d;

    /* renamed from: e */
    private final C10530u f28750e;

    /* renamed from: f */
    private final C10531v f28751f;

    /* renamed from: g */
    private final AbstractC10500b0 f28752g;

    /* renamed from: h */
    private AbstractC10516k f28753h;

    /* renamed from: i */
    private AbstractC10500b0 f28754i;

    /* renamed from: j */
    private AbstractC10500b0 f28755j;

    /* renamed from: k */
    private int f28756k;

    /* renamed from: l */
    private C14576a f28757l;

    /* renamed from: m */
    private long f28758m;

    /* renamed from: n */
    private long f28759n;

    /* renamed from: o */
    private long f28760o;

    /* renamed from: p */
    private int f28761p;

    /* renamed from: q */
    private AbstractC12810g f28762q;

    /* renamed from: r */
    private boolean f28763r;

    /* renamed from: s */
    private boolean f28764s;

    /* renamed from: t */
    private long f28765t;

    public C12809f() {
        this(0);
    }

    /* renamed from: g */
    private void m5439g() {
        C7510a.m22364h(this.f28754i);
        C7557q0.m22145j(this.f28753h);
    }

    /* renamed from: h */
    private AbstractC12810g m5438h(AbstractC10515j jVar) {
        long l;
        long j;
        AbstractC12810g r = m5428r(jVar);
        C12806c q = m5429q(this.f28757l, jVar.getPosition());
        if (this.f28763r) {
            return new AbstractC12810g.C12811a();
        }
        if ((this.f28746a & 2) != 0) {
            if (q != null) {
                l = q.mo2206i();
                j = q.mo5419g();
            } else if (r != null) {
                l = r.mo2206i();
                j = r.mo5419g();
            } else {
                l = m5434l(this.f28757l);
                j = -1;
            }
            r = new C12805b(l, jVar.getPosition(), j);
        } else if (q != null) {
            r = q;
        } else if (r == null) {
            r = null;
        }
        if (r == null || (!r.mo2207h() && (this.f28746a & 1) != 0)) {
            return m5435k(jVar);
        }
        return r;
    }

    /* renamed from: i */
    private long m5437i(long j) {
        return this.f28758m + ((j * 1000000) / this.f28749d.f16117d);
    }

    /* renamed from: k */
    private AbstractC12810g m5435k(AbstractC10515j jVar) {
        jVar.mo12930n(this.f28748c.m22012d(), 0, 4);
        this.f28748c.m22017P(0);
        this.f28749d.m22563a(this.f28748c.m22002n());
        return new C12804a(jVar.getLength(), jVar.getPosition(), this.f28749d);
    }

    /* renamed from: l */
    private static long m5434l(C14576a aVar) {
        if (aVar == null) {
            return -9223372036854775807L;
        }
        int f = aVar.m183f();
        for (int i = 0; i < f; i++) {
            C14576a.AbstractC14577b e = aVar.m184e(i);
            if (e instanceof C6760m) {
                C6760m mVar = (C6760m) e;
                if (mVar.f14402k.equals("TLEN")) {
                    return C6713c.m24566c(Long.parseLong(mVar.f14414m));
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: m */
    private static int m5433m(C7570y yVar, int i) {
        if (yVar.m22010f() >= i + 4) {
            yVar.m22017P(i);
            int n = yVar.m22002n();
            if (n == 1483304551 || n == 1231971951) {
                return n;
            }
        }
        if (yVar.m22010f() < 40) {
            return 0;
        }
        yVar.m22017P(36);
        if (yVar.m22002n() == 1447187017) {
            return 1447187017;
        }
        return 0;
    }

    /* renamed from: n */
    private static boolean m5432n(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ AbstractC10514i[] m5431o() {
        return new AbstractC10514i[]{new C12809f()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ boolean m5430p(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    /* renamed from: q */
    private static C12806c m5429q(C14576a aVar, long j) {
        if (aVar == null) {
            return null;
        }
        int f = aVar.m183f();
        for (int i = 0; i < f; i++) {
            C14576a.AbstractC14577b e = aVar.m184e(i);
            if (e instanceof C6756k) {
                return C12806c.m5444a(j, (C6756k) e, m5434l(aVar));
            }
        }
        return null;
    }

    /* renamed from: r */
    private AbstractC12810g m5428r(AbstractC10515j jVar) {
        C7570y yVar = new C7570y(this.f28749d.f16116c);
        jVar.mo12930n(yVar.m22012d(), 0, this.f28749d.f16116c);
        C7466l0.C7467a aVar = this.f28749d;
        int i = 21;
        if ((aVar.f16114a & 1) != 0) {
            if (aVar.f16118e != 1) {
                i = 36;
            }
        } else if (aVar.f16118e == 1) {
            i = 13;
        }
        int m = m5433m(yVar, i);
        if (m == 1483304551 || m == 1231971951) {
            C12813i a = C12813i.m5422a(jVar.getLength(), jVar.getPosition(), this.f28749d, yVar);
            if (a != null && !this.f28750e.m12929a()) {
                jVar.mo12936f();
                jVar.mo12934i(i + 141);
                jVar.mo12930n(this.f28748c.m22012d(), 0, 3);
                this.f28748c.m22017P(0);
                this.f28750e.m12926d(this.f28748c.m22026G());
            }
            jVar.mo12932k(this.f28749d.f16116c);
            if (a == null || a.mo2207h() || m != 1231971951) {
                return a;
            }
            return m5435k(jVar);
        } else if (m == 1447187017) {
            C12812h a2 = C12812h.m5423a(jVar.getLength(), jVar.getPosition(), this.f28749d, yVar);
            jVar.mo12932k(this.f28749d.f16116c);
            return a2;
        } else {
            jVar.mo12936f();
            return null;
        }
    }

    /* renamed from: s */
    private boolean m5427s(AbstractC10515j jVar) {
        AbstractC12810g gVar = this.f28762q;
        if (gVar != null) {
            long g = gVar.mo5419g();
            if (g != -1 && jVar.mo7939h() > g - 4) {
                return true;
            }
        }
        try {
            return !jVar.mo12937d(this.f28748c.m22012d(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* renamed from: t */
    private int m5426t(AbstractC10515j jVar) {
        C14576a aVar;
        if (this.f28756k == 0) {
            try {
                m5424v(jVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f28762q == null) {
            AbstractC12810g h = m5438h(jVar);
            this.f28762q = h;
            this.f28753h.mo7936j(h);
            AbstractC10500b0 b0Var = this.f28755j;
            C6722k.C6724b N = new C6722k.C6724b().m24488e0(this.f28749d.f16115b).m24501W(4096).m24516H(this.f28749d.f16118e).m24486f0(this.f28749d.f16117d).m24511M(this.f28750e.f23283a).m24510N(this.f28750e.f23284b);
            if ((this.f28746a & 4) != 0) {
                aVar = null;
            } else {
                aVar = this.f28757l;
            }
            b0Var.mo12388d(N.m24500X(aVar).m24519E());
            this.f28760o = jVar.getPosition();
        } else if (this.f28760o != 0) {
            long position = jVar.getPosition();
            long j = this.f28760o;
            if (position < j) {
                jVar.mo12932k((int) (j - position));
            }
        }
        return m5425u(jVar);
    }

    /* renamed from: u */
    private int m5425u(AbstractC10515j jVar) {
        C7466l0.C7467a aVar;
        if (this.f28761p == 0) {
            jVar.mo12936f();
            if (m5427s(jVar)) {
                return -1;
            }
            this.f28748c.m22017P(0);
            int n = this.f28748c.m22002n();
            if (!m5432n(n, this.f28756k) || C7466l0.m22567j(n) == -1) {
                jVar.mo12932k(1);
                this.f28756k = 0;
                return 0;
            }
            this.f28749d.m22563a(n);
            if (this.f28758m == -9223372036854775807L) {
                this.f28758m = this.f28762q.mo5420c(jVar.getPosition());
                if (this.f28747b != -9223372036854775807L) {
                    this.f28758m += this.f28747b - this.f28762q.mo5420c(0L);
                }
            }
            this.f28761p = this.f28749d.f16116c;
            AbstractC12810g gVar = this.f28762q;
            if (gVar instanceof C12805b) {
                C12805b bVar = (C12805b) gVar;
                bVar.m5446b(m5437i(this.f28759n + aVar.f16120g), jVar.getPosition() + this.f28749d.f16116c);
                if (this.f28764s && bVar.m5447a(this.f28765t)) {
                    this.f28764s = false;
                    this.f28755j = this.f28754i;
                }
            }
        }
        int e = this.f28755j.mo12387e(jVar, this.f28761p, true);
        if (e == -1) {
            return -1;
        }
        int i = this.f28761p - e;
        this.f28761p = i;
        if (i > 0) {
            return 0;
        }
        this.f28755j.mo12382c(m5437i(this.f28759n), 1, this.f28749d.f16116c, 0, null);
        this.f28759n += this.f28749d.f16120g;
        this.f28761p = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
        if (r13 == false) goto L_0x00a4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
        r12.mo12932k(r1 + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a4, code lost:
        r12.mo12936f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a7, code lost:
        r11.f28756k = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a9, code lost:
        return true;
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m5424v(p228m7.AbstractC10515j r12, boolean r13) {
        /*
            r11 = this;
            if (r13 == 0) goto L_0x0006
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L_0x0008
        L_0x0006:
            r0 = 131072(0x20000, float:1.83671E-40)
        L_0x0008:
            r12.mo12936f()
            long r1 = r12.getPosition()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 4
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x0041
            int r1 = r11.f28746a
            r1 = r1 & r2
            if (r1 != 0) goto L_0x001f
            r1 = r3
            goto L_0x0020
        L_0x001f:
            r1 = r4
        L_0x0020:
            if (r1 == 0) goto L_0x0024
            r1 = 0
            goto L_0x0026
        L_0x0024:
            e8.h$a r1 = p336s7.C12809f.f28745v
        L_0x0026:
            m7.v r5 = r11.f28751f
            z7.a r1 = r5.m12925a(r12, r1)
            r11.f28757l = r1
            if (r1 == 0) goto L_0x0035
            m7.u r5 = r11.f28750e
            r5.m12927c(r1)
        L_0x0035:
            long r5 = r12.mo7939h()
            int r1 = (int) r5
            if (r13 != 0) goto L_0x003f
            r12.mo12932k(r1)
        L_0x003f:
            r5 = r4
            goto L_0x0043
        L_0x0041:
            r1 = r4
            r5 = r1
        L_0x0043:
            r6 = r5
            r7 = r6
        L_0x0045:
            boolean r8 = r11.m5427s(r12)
            if (r8 == 0) goto L_0x0054
            if (r6 <= 0) goto L_0x004e
            goto L_0x009d
        L_0x004e:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
        L_0x0054:
            g9.y r8 = r11.f28748c
            r8.m22017P(r4)
            g9.y r8 = r11.f28748c
            int r8 = r8.m22002n()
            if (r5 == 0) goto L_0x0068
            long r9 = (long) r5
            boolean r9 = m5432n(r8, r9)
            if (r9 == 0) goto L_0x006f
        L_0x0068:
            int r9 = p117g7.C7466l0.m22567j(r8)
            r10 = -1
            if (r9 != r10) goto L_0x0090
        L_0x006f:
            int r5 = r7 + 1
            if (r7 != r0) goto L_0x007e
            if (r13 == 0) goto L_0x0076
            return r4
        L_0x0076:
            e7.o r12 = new e7.o
            java.lang.String r13 = "Searched too many bytes."
            r12.<init>(r13)
            throw r12
        L_0x007e:
            if (r13 == 0) goto L_0x0089
            r12.mo12936f()
            int r6 = r1 + r5
            r12.mo12934i(r6)
            goto L_0x008c
        L_0x0089:
            r12.mo12932k(r3)
        L_0x008c:
            r6 = r4
            r7 = r5
            r5 = r6
            goto L_0x0045
        L_0x0090:
            int r6 = r6 + 1
            if (r6 != r3) goto L_0x009b
            g7.l0$a r5 = r11.f28749d
            r5.m22563a(r8)
            r5 = r8
            goto L_0x00aa
        L_0x009b:
            if (r6 != r2) goto L_0x00aa
        L_0x009d:
            if (r13 == 0) goto L_0x00a4
            int r1 = r1 + r7
            r12.mo12932k(r1)
            goto L_0x00a7
        L_0x00a4:
            r12.mo12936f()
        L_0x00a7:
            r11.f28756k = r5
            return r3
        L_0x00aa:
            int r9 = r9 + (-4)
            r12.mo12934i(r9)
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: p336s7.C12809f.m5424v(m7.j, boolean):boolean");
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: a */
    public void mo2228a(long j, long j2) {
        this.f28756k = 0;
        this.f28758m = -9223372036854775807L;
        this.f28759n = 0L;
        this.f28761p = 0;
        this.f28765t = j2;
        AbstractC12810g gVar = this.f28762q;
        if ((gVar instanceof C12805b) && !((C12805b) gVar).m5447a(j2)) {
            this.f28764s = true;
            this.f28755j = this.f28752g;
        }
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: b */
    public void mo2227b(AbstractC10516k kVar) {
        this.f28753h = kVar;
        AbstractC10500b0 e = kVar.mo7937e(0, 1);
        this.f28754i = e;
        this.f28755j = e;
        this.f28753h.mo7935s();
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: d */
    public boolean mo2225d(AbstractC10515j jVar) {
        return m5424v(jVar, true);
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: e */
    public int mo2224e(AbstractC10515j jVar, C10533x xVar) {
        m5439g();
        int t = m5426t(jVar);
        if (t == -1 && (this.f28762q instanceof C12805b)) {
            long i = m5437i(this.f28759n);
            if (this.f28762q.mo2206i() != i) {
                ((C12805b) this.f28762q).m5445d(i);
                this.f28753h.mo7936j(this.f28762q);
            }
        }
        return t;
    }

    /* renamed from: j */
    public void m5436j() {
        this.f28763r = true;
    }

    @Override // p228m7.AbstractC10514i
    public void release() {
    }

    public C12809f(int i) {
        this(i, -9223372036854775807L);
    }

    public C12809f(int i, long j) {
        this.f28746a = i;
        this.f28747b = j;
        this.f28748c = new C7570y(10);
        this.f28749d = new C7466l0.C7467a();
        this.f28750e = new C10530u();
        this.f28758m = -9223372036854775807L;
        this.f28751f = new C10531v();
        C10513h hVar = new C10513h();
        this.f28752g = hVar;
        this.f28755j = hVar;
    }
}
