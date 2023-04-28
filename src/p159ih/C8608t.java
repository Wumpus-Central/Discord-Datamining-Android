package p159ih;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ph.AbstractC11686a;
import ph.AbstractC11687b;
import ph.AbstractC11691d;
import ph.AbstractC11702i;
import ph.AbstractC11726r;
import ph.AbstractC11727s;
import ph.C11694e;
import ph.C11695f;
import ph.C11697g;
import ph.C11713k;

/* renamed from: ih.t */
/* loaded from: classes8.dex */
public final class C8608t extends AbstractC11702i implements AbstractC11726r {

    /* renamed from: r */
    private static final C8608t f18974r;

    /* renamed from: s */
    public static AbstractC11727s<C8608t> f18975s = new C8609a();

    /* renamed from: l */
    private final AbstractC11691d f18976l;

    /* renamed from: m */
    private int f18977m;

    /* renamed from: n */
    private List<C8593q> f18978n;

    /* renamed from: o */
    private int f18979o;

    /* renamed from: p */
    private byte f18980p;

    /* renamed from: q */
    private int f18981q;

    /* renamed from: ih.t$a */
    /* loaded from: classes8.dex */
    static class C8609a extends AbstractC11687b<C8608t> {
        C8609a() {
        }

        /* renamed from: m */
        public C8608t mo8771d(C11694e eVar, C11697g gVar) {
            return new C8608t(eVar, gVar);
        }
    }

    /* renamed from: ih.t$b */
    /* loaded from: classes8.dex */
    public static final class C8610b extends AbstractC11702i.AbstractC11704b<C8608t, C8610b> implements AbstractC11726r {

        /* renamed from: l */
        private int f18982l;

        /* renamed from: m */
        private List<C8593q> f18983m = Collections.emptyList();

        /* renamed from: n */
        private int f18984n = -1;

        private C8610b() {
            m18597x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public static C8610b m18599v() {
            return new C8610b();
        }

        /* renamed from: w */
        private void m18598w() {
            if ((this.f18982l & 1) != 1) {
                this.f18983m = new ArrayList(this.f18983m);
                this.f18982l |= 1;
            }
        }

        /* renamed from: x */
        private void m18597x() {
        }

        /* renamed from: A */
        public C8610b m18604A(int i) {
            this.f18982l |= 2;
            this.f18984n = i;
            return this;
        }

        /* renamed from: s */
        public C8608t build() {
            C8608t t = m18601t();
            if (t.mo8775j()) {
                return t;
            }
            throw AbstractC11686a.AbstractC0372a.m9031l(t);
        }

        /* renamed from: t */
        public C8608t m18601t() {
            C8608t tVar = new C8608t(this);
            int i = this.f18982l;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.f18983m = Collections.unmodifiableList(this.f18983m);
                this.f18982l &= -2;
            }
            tVar.f18978n = this.f18983m;
            if ((i & 2) != 2) {
                i2 = 0;
            }
            tVar.f18979o = this.f18984n;
            tVar.f18977m = i2;
            return tVar;
        }

        /* renamed from: u */
        public C8610b mo8846m() {
            return m18599v().mo8844o(m18601t());
        }

        /* renamed from: y */
        public C8610b mo8844o(C8608t tVar) {
            if (tVar == C8608t.m18608x()) {
                return this;
            }
            if (!tVar.f18978n.isEmpty()) {
                if (this.f18983m.isEmpty()) {
                    this.f18983m = tVar.f18978n;
                    this.f18982l &= -2;
                } else {
                    m18598w();
                    this.f18983m.addAll(tVar.f18978n);
                }
            }
            if (tVar.m18619C()) {
                m18604A(tVar.m18607y());
            }
            m8843q(m8845n().m9017b(tVar.f18976l));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: z */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p159ih.C8608t.C8610b mo9032k(ph.C11694e r3, ph.C11697g r4) {
            /*
                r2 = this;
                r0 = 0
                ph.s<ih.t> r1 = p159ih.C8608t.f18975s     // Catch: all -> 0x000f, k -> 0x0011
                java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                ih.t r3 = (p159ih.C8608t) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                ih.t r4 = (p159ih.C8608t) r4     // Catch: all -> 0x000f
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
            throw new UnsupportedOperationException("Method not decompiled: p159ih.C8608t.C8610b.mo9032k(ph.e, ph.g):ih.t$b");
        }
    }

    static {
        C8608t tVar = new C8608t(true);
        f18974r = tVar;
        tVar.m18618D();
    }

    /* renamed from: D */
    private void m18618D() {
        this.f18978n = Collections.emptyList();
        this.f18979o = -1;
    }

    /* renamed from: E */
    public static C8610b m18617E() {
        return C8610b.m18599v();
    }

    /* renamed from: F */
    public static C8610b m18616F(C8608t tVar) {
        return m18617E().mo8844o(tVar);
    }

    /* renamed from: x */
    public static C8608t m18608x() {
        return f18974r;
    }

    /* renamed from: A */
    public int m18621A() {
        return this.f18978n.size();
    }

    /* renamed from: B */
    public List<C8593q> m18620B() {
        return this.f18978n;
    }

    /* renamed from: C */
    public boolean m18619C() {
        return (this.f18977m & 1) == 1;
    }

    /* renamed from: G */
    public C8610b mo8779e() {
        return m18617E();
    }

    /* renamed from: H */
    public C8610b mo8782a() {
        return m18616F(this);
    }

    @Override // ph.AbstractC11724q
    /* renamed from: c */
    public int mo8781c() {
        int i = this.f18981q;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f18978n.size(); i3++) {
            i2 += C11695f.m8898s(1, this.f18978n.get(i3));
        }
        if ((this.f18977m & 1) == 1) {
            i2 += C11695f.m8906o(2, this.f18979o);
        }
        int size = i2 + this.f18976l.size();
        this.f18981q = size;
        return size;
    }

    @Override // ph.AbstractC11724q
    /* renamed from: d */
    public void mo8780d(C11695f fVar) {
        mo8781c();
        for (int i = 0; i < this.f18978n.size(); i++) {
            fVar.m8927d0(1, this.f18978n.get(i));
        }
        if ((this.f18977m & 1) == 1) {
            fVar.m8933a0(2, this.f18979o);
        }
        fVar.m8917i0(this.f18976l);
    }

    @Override // ph.AbstractC11702i, ph.AbstractC11724q
    /* renamed from: h */
    public AbstractC11727s<C8608t> mo8778h() {
        return f18975s;
    }

    @Override // ph.AbstractC11726r
    /* renamed from: j */
    public final boolean mo8775j() {
        byte b = this.f18980p;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < m18621A(); i++) {
            if (!m18606z(i).mo8775j()) {
                this.f18980p = (byte) 0;
                return false;
            }
        }
        this.f18980p = (byte) 1;
        return true;
    }

    /* renamed from: y */
    public int m18607y() {
        return this.f18979o;
    }

    /* renamed from: z */
    public C8593q m18606z(int i) {
        return this.f18978n.get(i);
    }

    private C8608t(AbstractC11702i.AbstractC11704b bVar) {
        super(bVar);
        this.f18980p = (byte) -1;
        this.f18981q = -1;
        this.f18976l = bVar.m8845n();
    }

    private C8608t(boolean z) {
        this.f18980p = (byte) -1;
        this.f18981q = -1;
        this.f18976l = AbstractC11691d.f26108k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C8608t(C11694e eVar, C11697g gVar) {
        this.f18980p = (byte) -1;
        this.f18981q = -1;
        m18618D();
        AbstractC11691d.C11693b w = AbstractC11691d.m9011w();
        C11695f J = C11695f.m8951J(w, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int K = eVar.m8996K();
                        if (K != 0) {
                            if (K == 10) {
                                if (!z2 || !true) {
                                    this.f18978n = new ArrayList();
                                    z2 |= true;
                                }
                                this.f18978n.add(eVar.m8966u(C8593q.f38663F, gVar));
                            } else if (K == 16) {
                                this.f18977m |= 1;
                                this.f18979o = eVar.m8968s();
                            } else if (!mo8836q(eVar, J, gVar, K)) {
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
                if (z2 && true) {
                    this.f18978n = Collections.unmodifiableList(this.f18978n);
                }
                try {
                    J.m8952I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f18976l = w.m9007i();
                    throw th3;
                }
                this.f18976l = w.m9007i();
                mo8837n();
                throw th2;
            }
        }
        if (z2 && true) {
            this.f18978n = Collections.unmodifiableList(this.f18978n);
        }
        try {
            J.m8952I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f18976l = w.m9007i();
            throw th4;
        }
        this.f18976l = w.m9007i();
        mo8837n();
    }
}
