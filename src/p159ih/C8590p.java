package p159ih;

import java.io.IOException;
import ph.AbstractC11686a;
import ph.AbstractC11687b;
import ph.AbstractC11691d;
import ph.AbstractC11702i;
import ph.AbstractC11720o;
import ph.AbstractC11726r;
import ph.AbstractC11727s;
import ph.AbstractC11728t;
import ph.C11694e;
import ph.C11695f;
import ph.C11697g;
import ph.C11713k;
import ph.C11719n;

/* renamed from: ih.p */
/* loaded from: classes8.dex */
public final class C8590p extends AbstractC11702i implements AbstractC11726r {

    /* renamed from: p */
    private static final C8590p f18869p;

    /* renamed from: q */
    public static AbstractC11727s<C8590p> f18870q = new C8591a();

    /* renamed from: l */
    private final AbstractC11691d f18871l;

    /* renamed from: m */
    private AbstractC11720o f18872m;

    /* renamed from: n */
    private byte f18873n;

    /* renamed from: o */
    private int f18874o;

    /* renamed from: ih.p$a */
    /* loaded from: classes8.dex */
    static class C8591a extends AbstractC11687b<C8590p> {
        C8591a() {
        }

        /* renamed from: m */
        public C8590p mo8771d(C11694e eVar, C11697g gVar) {
            return new C8590p(eVar, gVar);
        }
    }

    /* renamed from: ih.p$b */
    /* loaded from: classes8.dex */
    public static final class C8592b extends AbstractC11702i.AbstractC11704b<C8590p, C8592b> implements AbstractC11726r {

        /* renamed from: l */
        private int f18875l;

        /* renamed from: m */
        private AbstractC11720o f18876m = C11719n.f26173l;

        private C8592b() {
            m18836x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public static C8592b m18838v() {
            return new C8592b();
        }

        /* renamed from: w */
        private void m18837w() {
            if ((this.f18875l & 1) != 1) {
                this.f18876m = new C11719n(this.f18876m);
                this.f18875l |= 1;
            }
        }

        /* renamed from: x */
        private void m18836x() {
        }

        /* renamed from: s */
        public C8590p build() {
            C8590p t = m18840t();
            if (t.mo8775j()) {
                return t;
            }
            throw AbstractC11686a.AbstractC0372a.m9031l(t);
        }

        /* renamed from: t */
        public C8590p m18840t() {
            C8590p pVar = new C8590p(this);
            if ((this.f18875l & 1) == 1) {
                this.f18876m = this.f18876m.mo8710q();
                this.f18875l &= -2;
            }
            pVar.f18872m = this.f18876m;
            return pVar;
        }

        /* renamed from: u */
        public C8592b mo8846m() {
            return m18838v().mo8844o(m18840t());
        }

        /* renamed from: y */
        public C8592b mo8844o(C8590p pVar) {
            if (pVar == C8590p.m18848v()) {
                return this;
            }
            if (!pVar.f18872m.isEmpty()) {
                if (this.f18876m.isEmpty()) {
                    this.f18876m = pVar.f18872m;
                    this.f18875l &= -2;
                } else {
                    m18837w();
                    this.f18876m.addAll(pVar.f18872m);
                }
            }
            m8843q(m8845n().m9017b(pVar.f18871l));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: z */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p159ih.C8590p.C8592b mo9032k(ph.C11694e r3, ph.C11697g r4) {
            /*
                r2 = this;
                r0 = 0
                ph.s<ih.p> r1 = p159ih.C8590p.f18870q     // Catch: all -> 0x000f, k -> 0x0011
                java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                ih.p r3 = (p159ih.C8590p) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                ih.p r4 = (p159ih.C8590p) r4     // Catch: all -> 0x000f
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
            throw new UnsupportedOperationException("Method not decompiled: p159ih.C8590p.C8592b.mo9032k(ph.e, ph.g):ih.p$b");
        }
    }

    static {
        C8590p pVar = new C8590p(true);
        f18869p = pVar;
        pVar.m18845y();
    }

    /* renamed from: A */
    public static C8592b m18854A(C8590p pVar) {
        return m18844z().mo8844o(pVar);
    }

    /* renamed from: v */
    public static C8590p m18848v() {
        return f18869p;
    }

    /* renamed from: y */
    private void m18845y() {
        this.f18872m = C11719n.f26173l;
    }

    /* renamed from: z */
    public static C8592b m18844z() {
        return C8592b.m18838v();
    }

    /* renamed from: B */
    public C8592b mo8779e() {
        return m18844z();
    }

    /* renamed from: C */
    public C8592b mo8782a() {
        return m18854A(this);
    }

    @Override // ph.AbstractC11724q
    /* renamed from: c */
    public int mo8781c() {
        int i = this.f18874o;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f18872m.size(); i3++) {
            i2 += C11695f.m8926e(this.f18872m.mo8712k(i3));
        }
        int size = 0 + i2 + (m18846x().size() * 1) + this.f18871l.size();
        this.f18874o = size;
        return size;
    }

    @Override // ph.AbstractC11724q
    /* renamed from: d */
    public void mo8780d(C11695f fVar) {
        mo8781c();
        for (int i = 0; i < this.f18872m.size(); i++) {
            fVar.m8946O(1, this.f18872m.mo8712k(i));
        }
        fVar.m8917i0(this.f18871l);
    }

    @Override // ph.AbstractC11702i, ph.AbstractC11724q
    /* renamed from: h */
    public AbstractC11727s<C8590p> mo8778h() {
        return f18870q;
    }

    @Override // ph.AbstractC11726r
    /* renamed from: j */
    public final boolean mo8775j() {
        byte b = this.f18873n;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f18873n = (byte) 1;
        return true;
    }

    /* renamed from: w */
    public String m18847w(int i) {
        return this.f18872m.get(i);
    }

    /* renamed from: x */
    public AbstractC11728t m18846x() {
        return this.f18872m;
    }

    private C8590p(AbstractC11702i.AbstractC11704b bVar) {
        super(bVar);
        this.f18873n = (byte) -1;
        this.f18874o = -1;
        this.f18871l = bVar.m8845n();
    }

    private C8590p(boolean z) {
        this.f18873n = (byte) -1;
        this.f18874o = -1;
        this.f18871l = AbstractC11691d.f26108k;
    }

    private C8590p(C11694e eVar, C11697g gVar) {
        this.f18873n = (byte) -1;
        this.f18874o = -1;
        m18845y();
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
                                AbstractC11691d l = eVar.m8975l();
                                if (!z2 || !true) {
                                    this.f18872m = new C11719n();
                                    z2 |= true;
                                }
                                this.f18872m.mo8711m(l);
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
                    this.f18872m = this.f18872m.mo8710q();
                }
                try {
                    J.m8952I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f18871l = w.m9007i();
                    throw th3;
                }
                this.f18871l = w.m9007i();
                mo8837n();
                throw th2;
            }
        }
        if (z2 && true) {
            this.f18872m = this.f18872m.mo8710q();
        }
        try {
            J.m8952I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f18871l = w.m9007i();
            throw th4;
        }
        this.f18871l = w.m9007i();
        mo8837n();
    }
}
