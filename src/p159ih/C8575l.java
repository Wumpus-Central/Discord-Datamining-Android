package p159ih;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p159ih.C8608t;
import p159ih.C8621w;
import ph.AbstractC11686a;
import ph.AbstractC11687b;
import ph.AbstractC11691d;
import ph.AbstractC11702i;
import ph.AbstractC11727s;
import ph.C11694e;
import ph.C11695f;
import ph.C11697g;
import ph.C11713k;

/* renamed from: ih.l */
/* loaded from: classes8.dex */
public final class C8575l extends AbstractC11702i.AbstractC11706d<C8575l> {

    /* renamed from: v */
    private static final C8575l f18783v;

    /* renamed from: w */
    public static AbstractC11727s<C8575l> f18784w = new C8576a();

    /* renamed from: m */
    private final AbstractC11691d f18785m;

    /* renamed from: n */
    private int f18786n;

    /* renamed from: o */
    private List<C8568i> f18787o;

    /* renamed from: p */
    private List<C8581n> f18788p;

    /* renamed from: q */
    private List<C8600r> f18789q;

    /* renamed from: r */
    private C8608t f18790r;

    /* renamed from: s */
    private C8621w f18791s;

    /* renamed from: t */
    private byte f18792t;

    /* renamed from: u */
    private int f18793u;

    /* renamed from: ih.l$a */
    /* loaded from: classes8.dex */
    static class C8576a extends AbstractC11687b<C8575l> {
        C8576a() {
        }

        /* renamed from: m */
        public C8575l mo8771d(C11694e eVar, C11697g gVar) {
            return new C8575l(eVar, gVar);
        }
    }

    /* renamed from: ih.l$b */
    /* loaded from: classes8.dex */
    public static final class C8577b extends AbstractC11702i.AbstractC11705c<C8575l, C8577b> {

        /* renamed from: n */
        private int f18794n;

        /* renamed from: o */
        private List<C8568i> f18795o = Collections.emptyList();

        /* renamed from: p */
        private List<C8581n> f18796p = Collections.emptyList();

        /* renamed from: q */
        private List<C8600r> f18797q = Collections.emptyList();

        /* renamed from: r */
        private C8608t f18798r = C8608t.m18608x();

        /* renamed from: s */
        private C8621w f18799s = C8621w.m18501v();

        private C8577b() {
            m19031D();
        }

        /* renamed from: A */
        private void m19034A() {
            if ((this.f18794n & 1) != 1) {
                this.f18795o = new ArrayList(this.f18795o);
                this.f18794n |= 1;
            }
        }

        /* renamed from: B */
        private void m19033B() {
            if ((this.f18794n & 2) != 2) {
                this.f18796p = new ArrayList(this.f18796p);
                this.f18794n |= 2;
            }
        }

        /* renamed from: C */
        private void m19032C() {
            if ((this.f18794n & 4) != 4) {
                this.f18797q = new ArrayList(this.f18797q);
                this.f18794n |= 4;
            }
        }

        /* renamed from: D */
        private void m19031D() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public static C8577b m19022z() {
            return new C8577b();
        }

        /* renamed from: E */
        public C8577b mo8844o(C8575l lVar) {
            if (lVar == C8575l.m19056L()) {
                return this;
            }
            if (!lVar.f18787o.isEmpty()) {
                if (this.f18795o.isEmpty()) {
                    this.f18795o = lVar.f18787o;
                    this.f18794n &= -2;
                } else {
                    m19034A();
                    this.f18795o.addAll(lVar.f18787o);
                }
            }
            if (!lVar.f18788p.isEmpty()) {
                if (this.f18796p.isEmpty()) {
                    this.f18796p = lVar.f18788p;
                    this.f18794n &= -3;
                } else {
                    m19033B();
                    this.f18796p.addAll(lVar.f18788p);
                }
            }
            if (!lVar.f18789q.isEmpty()) {
                if (this.f18797q.isEmpty()) {
                    this.f18797q = lVar.f18789q;
                    this.f18794n &= -5;
                } else {
                    m19032C();
                    this.f18797q.addAll(lVar.f18789q);
                }
            }
            if (lVar.m19043Y()) {
                m19028G(lVar.m19045W());
            }
            if (lVar.m19042Z()) {
                m19027H(lVar.m19044X());
            }
            m8839u(lVar);
            m8843q(m8845n().m9017b(lVar.f18785m));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: F */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p159ih.C8575l.C8577b mo9032k(ph.C11694e r3, ph.C11697g r4) {
            /*
                r2 = this;
                r0 = 0
                ph.s<ih.l> r1 = p159ih.C8575l.f18784w     // Catch: all -> 0x000f, k -> 0x0011
                java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                ih.l r3 = (p159ih.C8575l) r3     // Catch: all -> 0x000f, k -> 0x0011
                if (r3 == 0) goto L_0x000e
                r2.mo8844o(r3)
            L_0x000e:
                return r2
            L_0x000f:
                r3 = move-exception
                goto L_0x001b
            L_0x0011:
                r3 = move-exception
                ph.q r4 = r3.m8810a()     // Catch: all -> 0x000f
                ih.l r4 = (p159ih.C8575l) r4     // Catch: all -> 0x000f
                throw r3     // Catch: all -> 0x0019
            L_0x0019:
                r3 = move-exception
                r0 = r4
            L_0x001b:
                if (r0 == 0) goto L_0x0020
                r2.mo8844o(r0)
            L_0x0020:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p159ih.C8575l.C8577b.mo9032k(ph.e, ph.g):ih.l$b");
        }

        /* renamed from: G */
        public C8577b m19028G(C8608t tVar) {
            if ((this.f18794n & 8) != 8 || this.f18798r == C8608t.m18608x()) {
                this.f18798r = tVar;
            } else {
                this.f18798r = C8608t.m18616F(this.f18798r).mo8844o(tVar).m18601t();
            }
            this.f18794n |= 8;
            return this;
        }

        /* renamed from: H */
        public C8577b m19027H(C8621w wVar) {
            if ((this.f18794n & 16) != 16 || this.f18799s == C8621w.m18501v()) {
                this.f18799s = wVar;
            } else {
                this.f18799s = C8621w.m18507A(this.f18799s).mo8844o(wVar).m18493t();
            }
            this.f18794n |= 16;
            return this;
        }

        /* renamed from: w */
        public C8575l build() {
            C8575l x = m19024x();
            if (x.mo8775j()) {
                return x;
            }
            throw AbstractC11686a.AbstractC0372a.m9031l(x);
        }

        /* renamed from: x */
        public C8575l m19024x() {
            C8575l lVar = new C8575l(this);
            int i = this.f18794n;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.f18795o = Collections.unmodifiableList(this.f18795o);
                this.f18794n &= -2;
            }
            lVar.f18787o = this.f18795o;
            if ((this.f18794n & 2) == 2) {
                this.f18796p = Collections.unmodifiableList(this.f18796p);
                this.f18794n &= -3;
            }
            lVar.f18788p = this.f18796p;
            if ((this.f18794n & 4) == 4) {
                this.f18797q = Collections.unmodifiableList(this.f18797q);
                this.f18794n &= -5;
            }
            lVar.f18789q = this.f18797q;
            if ((i & 8) != 8) {
                i2 = 0;
            }
            lVar.f18790r = this.f18798r;
            if ((i & 16) == 16) {
                i2 |= 2;
            }
            lVar.f18791s = this.f18799s;
            lVar.f18786n = i2;
            return lVar;
        }

        /* renamed from: y */
        public C8577b mo8846m() {
            return m19022z().mo8844o(m19024x());
        }
    }

    static {
        C8575l lVar = new C8575l(true);
        f18783v = lVar;
        lVar.m19041a0();
    }

    /* renamed from: L */
    public static C8575l m19056L() {
        return f18783v;
    }

    /* renamed from: a0 */
    private void m19041a0() {
        this.f18787o = Collections.emptyList();
        this.f18788p = Collections.emptyList();
        this.f18789q = Collections.emptyList();
        this.f18790r = C8608t.m18608x();
        this.f18791s = C8621w.m18501v();
    }

    /* renamed from: b0 */
    public static C8577b m19040b0() {
        return C8577b.m19022z();
    }

    /* renamed from: c0 */
    public static C8577b m19039c0(C8575l lVar) {
        return m19040b0().mo8844o(lVar);
    }

    /* renamed from: e0 */
    public static C8575l m19037e0(InputStream inputStream, C11697g gVar) {
        return f18784w.mo8772c(inputStream, gVar);
    }

    /* renamed from: M */
    public C8575l mo8776f() {
        return f18783v;
    }

    /* renamed from: N */
    public C8568i m19054N(int i) {
        return this.f18787o.get(i);
    }

    /* renamed from: O */
    public int m19053O() {
        return this.f18787o.size();
    }

    /* renamed from: P */
    public List<C8568i> m19052P() {
        return this.f18787o;
    }

    /* renamed from: Q */
    public C8581n m19051Q(int i) {
        return this.f18788p.get(i);
    }

    /* renamed from: R */
    public int m19050R() {
        return this.f18788p.size();
    }

    /* renamed from: S */
    public List<C8581n> m19049S() {
        return this.f18788p;
    }

    /* renamed from: T */
    public C8600r m19048T(int i) {
        return this.f18789q.get(i);
    }

    /* renamed from: U */
    public int m19047U() {
        return this.f18789q.size();
    }

    /* renamed from: V */
    public List<C8600r> m19046V() {
        return this.f18789q;
    }

    /* renamed from: W */
    public C8608t m19045W() {
        return this.f18790r;
    }

    /* renamed from: X */
    public C8621w m19044X() {
        return this.f18791s;
    }

    /* renamed from: Y */
    public boolean m19043Y() {
        return (this.f18786n & 1) == 1;
    }

    /* renamed from: Z */
    public boolean m19042Z() {
        return (this.f18786n & 2) == 2;
    }

    @Override // ph.AbstractC11724q
    /* renamed from: c */
    public int mo8781c() {
        int i = this.f18793u;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f18787o.size(); i3++) {
            i2 += C11695f.m8898s(3, this.f18787o.get(i3));
        }
        for (int i4 = 0; i4 < this.f18788p.size(); i4++) {
            i2 += C11695f.m8898s(4, this.f18788p.get(i4));
        }
        for (int i5 = 0; i5 < this.f18789q.size(); i5++) {
            i2 += C11695f.m8898s(5, this.f18789q.get(i5));
        }
        if ((this.f18786n & 1) == 1) {
            i2 += C11695f.m8898s(30, this.f18790r);
        }
        if ((this.f18786n & 2) == 2) {
            i2 += C11695f.m8898s(32, this.f18791s);
        }
        int u = i2 + m8833u() + this.f18785m.size();
        this.f18793u = u;
        return u;
    }

    @Override // ph.AbstractC11724q
    /* renamed from: d */
    public void mo8780d(C11695f fVar) {
        mo8781c();
        AbstractC11702i.AbstractC11706d<MessageType>.C11707a z = m8828z();
        for (int i = 0; i < this.f18787o.size(); i++) {
            fVar.m8927d0(3, this.f18787o.get(i));
        }
        for (int i2 = 0; i2 < this.f18788p.size(); i2++) {
            fVar.m8927d0(4, this.f18788p.get(i2));
        }
        for (int i3 = 0; i3 < this.f18789q.size(); i3++) {
            fVar.m8927d0(5, this.f18789q.get(i3));
        }
        if ((this.f18786n & 1) == 1) {
            fVar.m8927d0(30, this.f18790r);
        }
        if ((this.f18786n & 2) == 2) {
            fVar.m8927d0(32, this.f18791s);
        }
        z.m8827a(ItemTouchHelper.AbstractC3083c.DEFAULT_DRAG_ANIMATION_DURATION, fVar);
        fVar.m8917i0(this.f18785m);
    }

    /* renamed from: d0 */
    public C8577b mo8779e() {
        return m19040b0();
    }

    /* renamed from: f0 */
    public C8577b mo8782a() {
        return m19039c0(this);
    }

    @Override // ph.AbstractC11702i, ph.AbstractC11724q
    /* renamed from: h */
    public AbstractC11727s<C8575l> mo8778h() {
        return f18784w;
    }

    @Override // ph.AbstractC11726r
    /* renamed from: j */
    public final boolean mo8775j() {
        byte b = this.f18792t;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < m19053O(); i++) {
            if (!m19054N(i).mo8775j()) {
                this.f18792t = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < m19050R(); i2++) {
            if (!m19051Q(i2).mo8775j()) {
                this.f18792t = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < m19047U(); i3++) {
            if (!m19048T(i3).mo8775j()) {
                this.f18792t = (byte) 0;
                return false;
            }
        }
        if (m19043Y() && !m19045W().mo8775j()) {
            this.f18792t = (byte) 0;
            return false;
        } else if (!m8834t()) {
            this.f18792t = (byte) 0;
            return false;
        } else {
            this.f18792t = (byte) 1;
            return true;
        }
    }

    private C8575l(AbstractC11702i.AbstractC11705c<C8575l, ?> cVar) {
        super(cVar);
        this.f18792t = (byte) -1;
        this.f18793u = -1;
        this.f18785m = cVar.m8845n();
    }

    private C8575l(boolean z) {
        this.f18792t = (byte) -1;
        this.f18793u = -1;
        this.f18785m = AbstractC11691d.f26108k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C8575l(C11694e eVar, C11697g gVar) {
        this.f18792t = (byte) -1;
        this.f18793u = -1;
        m19041a0();
        AbstractC11691d.C11693b w = AbstractC11691d.m9011w();
        C11695f J = C11695f.m8951J(w, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int K = eVar.m8996K();
                    if (K != 0) {
                        if (K == 26) {
                            boolean z3 = z2 & true;
                            z2 = z2;
                            if (!z3) {
                                this.f18787o = new ArrayList();
                                z2 |= true;
                            }
                            this.f18787o.add(eVar.m8966u(C8568i.f38645G, gVar));
                        } else if (K == 34) {
                            boolean z4 = z2 & true;
                            z2 = z2;
                            if (!z4) {
                                this.f18788p = new ArrayList();
                                z2 |= true;
                            }
                            this.f18788p.add(eVar.m8966u(C8581n.f38654G, gVar));
                        } else if (K != 42) {
                            C8621w.C8623b bVar = null;
                            C8608t.C8610b H = null;
                            if (K == 242) {
                                H = (this.f18786n & 1) == 1 ? this.f18790r.mo8782a() : H;
                                C8608t tVar = (C8608t) eVar.m8966u(C8608t.f18975s, gVar);
                                this.f18790r = tVar;
                                if (H != null) {
                                    H.mo8844o(tVar);
                                    this.f18790r = H.m18601t();
                                }
                                this.f18786n |= 1;
                            } else if (K == 258) {
                                bVar = (this.f18786n & 2) == 2 ? this.f18791s.mo8782a() : bVar;
                                C8621w wVar = (C8621w) eVar.m8966u(C8621w.f19036q, gVar);
                                this.f18791s = wVar;
                                if (bVar != null) {
                                    bVar.mo8844o(wVar);
                                    this.f18791s = bVar.m18493t();
                                }
                                this.f18786n |= 2;
                            } else if (!mo8836q(eVar, J, gVar, K)) {
                            }
                        } else {
                            boolean z5 = z2 & true;
                            z2 = z2;
                            if (!z5) {
                                this.f18789q = new ArrayList();
                                z2 |= true;
                            }
                            this.f18789q.add(eVar.m8966u(C8600r.f38670A, gVar));
                        }
                    }
                    z = true;
                } catch (C11713k e) {
                    throw e.m8802i(this);
                } catch (IOException e2) {
                    throw new C11713k(e2.getMessage()).m8802i(this);
                }
            } catch (Throwable th2) {
                if (z2 && true) {
                    this.f18787o = Collections.unmodifiableList(this.f18787o);
                }
                if (z2 & true) {
                    this.f18788p = Collections.unmodifiableList(this.f18788p);
                }
                if (z2 & true) {
                    this.f18789q = Collections.unmodifiableList(this.f18789q);
                }
                try {
                    J.m8952I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f18785m = w.m9007i();
                    throw th3;
                }
                this.f18785m = w.m9007i();
                mo8837n();
                throw th2;
            }
        }
        boolean z6 = z2 ? 1 : 0;
        boolean z7 = z2 ? 1 : 0;
        boolean z8 = z2 ? 1 : 0;
        boolean z9 = z2 ? 1 : 0;
        boolean z10 = z2 ? 1 : 0;
        boolean z11 = z2 ? 1 : 0;
        boolean z12 = z2 ? 1 : 0;
        boolean z13 = z2 ? 1 : 0;
        boolean z14 = z2 ? 1 : 0;
        if (z6 && true) {
            this.f18787o = Collections.unmodifiableList(this.f18787o);
        }
        if (z2 & true) {
            this.f18788p = Collections.unmodifiableList(this.f18788p);
        }
        if (z2 & true) {
            this.f18789q = Collections.unmodifiableList(this.f18789q);
        }
        try {
            J.m8952I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f18785m = w.m9007i();
            throw th4;
        }
        this.f18785m = w.m9007i();
        mo8837n();
    }
}
