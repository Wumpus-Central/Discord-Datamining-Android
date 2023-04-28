package p159ih;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.IOException;
import p159ih.C8593q;
import ph.AbstractC11686a;
import ph.AbstractC11687b;
import ph.AbstractC11691d;
import ph.AbstractC11702i;
import ph.AbstractC11727s;
import ph.C11694e;
import ph.C11695f;
import ph.C11697g;
import ph.C11713k;

/* renamed from: ih.u */
/* loaded from: classes8.dex */
public final class C8611u extends AbstractC11702i.AbstractC11706d<C8611u> {

    /* renamed from: w */
    private static final C8611u f18985w;

    /* renamed from: x */
    public static AbstractC11727s<C8611u> f18986x = new C8612a();

    /* renamed from: m */
    private final AbstractC11691d f18987m;

    /* renamed from: n */
    private int f18988n;

    /* renamed from: o */
    private int f18989o;

    /* renamed from: p */
    private int f18990p;

    /* renamed from: q */
    private C8593q f18991q;

    /* renamed from: r */
    private int f18992r;

    /* renamed from: s */
    private C8593q f18993s;

    /* renamed from: t */
    private int f18994t;

    /* renamed from: u */
    private byte f18995u;

    /* renamed from: v */
    private int f18996v;

    /* renamed from: ih.u$a */
    /* loaded from: classes8.dex */
    static class C8612a extends AbstractC11687b<C8611u> {
        C8612a() {
        }

        /* renamed from: m */
        public C8611u mo8771d(C11694e eVar, C11697g gVar) {
            return new C8611u(eVar, gVar);
        }
    }

    /* renamed from: ih.u$b */
    /* loaded from: classes8.dex */
    public static final class C8613b extends AbstractC11702i.AbstractC11705c<C8611u, C8613b> {

        /* renamed from: n */
        private int f18997n;

        /* renamed from: o */
        private int f18998o;

        /* renamed from: p */
        private int f18999p;

        /* renamed from: r */
        private int f19001r;

        /* renamed from: t */
        private int f19003t;

        /* renamed from: q */
        private C8593q f19000q = C8593q.m18808Y();

        /* renamed from: s */
        private C8593q f19002s = C8593q.m18808Y();

        private C8613b() {
            m18566A();
        }

        /* renamed from: A */
        private void m18566A() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public static C8613b m18553z() {
            return new C8613b();
        }

        /* renamed from: B */
        public C8613b mo8844o(C8611u uVar) {
            if (uVar == C8611u.m18586J()) {
                return this;
            }
            if (uVar.m18578R()) {
                m18561F(uVar.m18584L());
            }
            if (uVar.m18577S()) {
                m18560G(uVar.m18583M());
            }
            if (uVar.m18576T()) {
                m18563D(uVar.m18582N());
            }
            if (uVar.m18575U()) {
                m18559H(uVar.m18581O());
            }
            if (uVar.m18574V()) {
                m18562E(uVar.m18580P());
            }
            if (uVar.m18573W()) {
                m18558I(uVar.m18579Q());
            }
            m8839u(uVar);
            m8843q(m8845n().m9017b(uVar.f18987m));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: C */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p159ih.C8611u.C8613b mo9032k(ph.C11694e r3, ph.C11697g r4) {
            /*
                r2 = this;
                r0 = 0
                ph.s<ih.u> r1 = p159ih.C8611u.f18986x     // Catch: all -> 0x000f, k -> 0x0011
                java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                ih.u r3 = (p159ih.C8611u) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                ih.u r4 = (p159ih.C8611u) r4     // Catch: all -> 0x000f
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
            throw new UnsupportedOperationException("Method not decompiled: p159ih.C8611u.C8613b.mo9032k(ph.e, ph.g):ih.u$b");
        }

        /* renamed from: D */
        public C8613b m18563D(C8593q qVar) {
            if ((this.f18997n & 4) != 4 || this.f19000q == C8593q.m18808Y()) {
                this.f19000q = qVar;
            } else {
                this.f19000q = C8593q.m18781z0(this.f19000q).mo8844o(qVar).m18729x();
            }
            this.f18997n |= 4;
            return this;
        }

        /* renamed from: E */
        public C8613b m18562E(C8593q qVar) {
            if ((this.f18997n & 16) != 16 || this.f19002s == C8593q.m18808Y()) {
                this.f19002s = qVar;
            } else {
                this.f19002s = C8593q.m18781z0(this.f19002s).mo8844o(qVar).m18729x();
            }
            this.f18997n |= 16;
            return this;
        }

        /* renamed from: F */
        public C8613b m18561F(int i) {
            this.f18997n |= 1;
            this.f18998o = i;
            return this;
        }

        /* renamed from: G */
        public C8613b m18560G(int i) {
            this.f18997n |= 2;
            this.f18999p = i;
            return this;
        }

        /* renamed from: H */
        public C8613b m18559H(int i) {
            this.f18997n |= 8;
            this.f19001r = i;
            return this;
        }

        /* renamed from: I */
        public C8613b m18558I(int i) {
            this.f18997n |= 32;
            this.f19003t = i;
            return this;
        }

        /* renamed from: w */
        public C8611u build() {
            C8611u x = m18555x();
            if (x.mo8775j()) {
                return x;
            }
            throw AbstractC11686a.AbstractC0372a.m9031l(x);
        }

        /* renamed from: x */
        public C8611u m18555x() {
            C8611u uVar = new C8611u(this);
            int i = this.f18997n;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            uVar.f18989o = this.f18998o;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            uVar.f18990p = this.f18999p;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            uVar.f18991q = this.f19000q;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            uVar.f18992r = this.f19001r;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            uVar.f18993s = this.f19002s;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            uVar.f18994t = this.f19003t;
            uVar.f18988n = i2;
            return uVar;
        }

        /* renamed from: y */
        public C8613b mo8846m() {
            return m18553z().mo8844o(m18555x());
        }
    }

    static {
        C8611u uVar = new C8611u(true);
        f18985w = uVar;
        uVar.m18572X();
    }

    /* renamed from: J */
    public static C8611u m18586J() {
        return f18985w;
    }

    /* renamed from: X */
    private void m18572X() {
        this.f18989o = 0;
        this.f18990p = 0;
        this.f18991q = C8593q.m18808Y();
        this.f18992r = 0;
        this.f18993s = C8593q.m18808Y();
        this.f18994t = 0;
    }

    /* renamed from: Y */
    public static C8613b m18571Y() {
        return C8613b.m18553z();
    }

    /* renamed from: Z */
    public static C8613b m18570Z(C8611u uVar) {
        return m18571Y().mo8844o(uVar);
    }

    /* renamed from: K */
    public C8611u mo8776f() {
        return f18985w;
    }

    /* renamed from: L */
    public int m18584L() {
        return this.f18989o;
    }

    /* renamed from: M */
    public int m18583M() {
        return this.f18990p;
    }

    /* renamed from: N */
    public C8593q m18582N() {
        return this.f18991q;
    }

    /* renamed from: O */
    public int m18581O() {
        return this.f18992r;
    }

    /* renamed from: P */
    public C8593q m18580P() {
        return this.f18993s;
    }

    /* renamed from: Q */
    public int m18579Q() {
        return this.f18994t;
    }

    /* renamed from: R */
    public boolean m18578R() {
        return (this.f18988n & 1) == 1;
    }

    /* renamed from: S */
    public boolean m18577S() {
        return (this.f18988n & 2) == 2;
    }

    /* renamed from: T */
    public boolean m18576T() {
        return (this.f18988n & 4) == 4;
    }

    /* renamed from: U */
    public boolean m18575U() {
        return (this.f18988n & 8) == 8;
    }

    /* renamed from: V */
    public boolean m18574V() {
        return (this.f18988n & 16) == 16;
    }

    /* renamed from: W */
    public boolean m18573W() {
        return (this.f18988n & 32) == 32;
    }

    /* renamed from: a0 */
    public C8613b mo8779e() {
        return m18571Y();
    }

    /* renamed from: b0 */
    public C8613b mo8782a() {
        return m18570Z(this);
    }

    @Override // ph.AbstractC11724q
    /* renamed from: c */
    public int mo8781c() {
        int i = this.f18996v;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.f18988n & 1) == 1) {
            i2 = 0 + C11695f.m8906o(1, this.f18989o);
        }
        if ((this.f18988n & 2) == 2) {
            i2 += C11695f.m8906o(2, this.f18990p);
        }
        if ((this.f18988n & 4) == 4) {
            i2 += C11695f.m8898s(3, this.f18991q);
        }
        if ((this.f18988n & 16) == 16) {
            i2 += C11695f.m8898s(4, this.f18993s);
        }
        if ((this.f18988n & 8) == 8) {
            i2 += C11695f.m8906o(5, this.f18992r);
        }
        if ((this.f18988n & 32) == 32) {
            i2 += C11695f.m8906o(6, this.f18994t);
        }
        int u = i2 + m8833u() + this.f18987m.size();
        this.f18996v = u;
        return u;
    }

    @Override // ph.AbstractC11724q
    /* renamed from: d */
    public void mo8780d(C11695f fVar) {
        mo8781c();
        AbstractC11702i.AbstractC11706d<MessageType>.C11707a z = m8828z();
        if ((this.f18988n & 1) == 1) {
            fVar.m8933a0(1, this.f18989o);
        }
        if ((this.f18988n & 2) == 2) {
            fVar.m8933a0(2, this.f18990p);
        }
        if ((this.f18988n & 4) == 4) {
            fVar.m8927d0(3, this.f18991q);
        }
        if ((this.f18988n & 16) == 16) {
            fVar.m8927d0(4, this.f18993s);
        }
        if ((this.f18988n & 8) == 8) {
            fVar.m8933a0(5, this.f18992r);
        }
        if ((this.f18988n & 32) == 32) {
            fVar.m8933a0(6, this.f18994t);
        }
        z.m8827a(ItemTouchHelper.AbstractC3083c.DEFAULT_DRAG_ANIMATION_DURATION, fVar);
        fVar.m8917i0(this.f18987m);
    }

    @Override // ph.AbstractC11702i, ph.AbstractC11724q
    /* renamed from: h */
    public AbstractC11727s<C8611u> mo8778h() {
        return f18986x;
    }

    @Override // ph.AbstractC11726r
    /* renamed from: j */
    public final boolean mo8775j() {
        byte b = this.f18995u;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m18577S()) {
            this.f18995u = (byte) 0;
            return false;
        } else if (m18576T() && !m18582N().mo8775j()) {
            this.f18995u = (byte) 0;
            return false;
        } else if (m18574V() && !m18580P().mo8775j()) {
            this.f18995u = (byte) 0;
            return false;
        } else if (!m8834t()) {
            this.f18995u = (byte) 0;
            return false;
        } else {
            this.f18995u = (byte) 1;
            return true;
        }
    }

    private C8611u(AbstractC11702i.AbstractC11705c<C8611u, ?> cVar) {
        super(cVar);
        this.f18995u = (byte) -1;
        this.f18996v = -1;
        this.f18987m = cVar.m8845n();
    }

    private C8611u(boolean z) {
        this.f18995u = (byte) -1;
        this.f18996v = -1;
        this.f18987m = AbstractC11691d.f26108k;
    }

    private C8611u(C11694e eVar, C11697g gVar) {
        this.f18995u = (byte) -1;
        this.f18996v = -1;
        m18572X();
        AbstractC11691d.C11693b w = AbstractC11691d.m9011w();
        C11695f J = C11695f.m8951J(w, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    try {
                        int K = eVar.m8996K();
                        if (K != 0) {
                            if (K == 8) {
                                this.f18988n |= 1;
                                this.f18989o = eVar.m8968s();
                            } else if (K != 16) {
                                C8593q.C8599c cVar = null;
                                if (K == 26) {
                                    cVar = (this.f18988n & 4) == 4 ? this.f18991q.mo8782a() : cVar;
                                    C8593q qVar = (C8593q) eVar.m8966u(C8593q.f38663F, gVar);
                                    this.f18991q = qVar;
                                    if (cVar != null) {
                                        cVar.mo8844o(qVar);
                                        this.f18991q = cVar.m18729x();
                                    }
                                    this.f18988n |= 4;
                                } else if (K == 34) {
                                    cVar = (this.f18988n & 16) == 16 ? this.f18993s.mo8782a() : cVar;
                                    C8593q qVar2 = (C8593q) eVar.m8966u(C8593q.f38663F, gVar);
                                    this.f18993s = qVar2;
                                    if (cVar != null) {
                                        cVar.mo8844o(qVar2);
                                        this.f18993s = cVar.m18729x();
                                    }
                                    this.f18988n |= 16;
                                } else if (K == 40) {
                                    this.f18988n |= 8;
                                    this.f18992r = eVar.m8968s();
                                } else if (K == 48) {
                                    this.f18988n |= 32;
                                    this.f18994t = eVar.m8968s();
                                } else if (!mo8836q(eVar, J, gVar, K)) {
                                }
                            } else {
                                this.f18988n |= 2;
                                this.f18990p = eVar.m8968s();
                            }
                        }
                        z = true;
                    } catch (IOException e) {
                        throw new C11713k(e.getMessage()).m8802i(this);
                    }
                } catch (C11713k e2) {
                    throw e2.m8802i(this);
                }
            } catch (Throwable th2) {
                try {
                    J.m8952I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f18987m = w.m9007i();
                    throw th3;
                }
                this.f18987m = w.m9007i();
                mo8837n();
                throw th2;
            }
        }
        try {
            J.m8952I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f18987m = w.m9007i();
            throw th4;
        }
        this.f18987m = w.m9007i();
        mo8837n();
    }
}
