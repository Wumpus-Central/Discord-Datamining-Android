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
import ph.C11710j;
import ph.C11713k;

/* renamed from: ih.o */
/* loaded from: classes8.dex */
public final class C8584o extends AbstractC11702i implements AbstractC11726r {

    /* renamed from: p */
    private static final C8584o f18842p;

    /* renamed from: q */
    public static AbstractC11727s<C8584o> f18843q = new C8585a();

    /* renamed from: l */
    private final AbstractC11691d f18844l;

    /* renamed from: m */
    private List<C8587c> f18845m;

    /* renamed from: n */
    private byte f18846n;

    /* renamed from: o */
    private int f18847o;

    /* renamed from: ih.o$a */
    /* loaded from: classes8.dex */
    static class C8585a extends AbstractC11687b<C8584o> {
        C8585a() {
        }

        /* renamed from: m */
        public C8584o mo8771d(C11694e eVar, C11697g gVar) {
            return new C8584o(eVar, gVar);
        }
    }

    /* renamed from: ih.o$b */
    /* loaded from: classes8.dex */
    public static final class C8586b extends AbstractC11702i.AbstractC11704b<C8584o, C8586b> implements AbstractC11726r {

        /* renamed from: l */
        private int f18848l;

        /* renamed from: m */
        private List<C8587c> f18849m = Collections.emptyList();

        private C8586b() {
            m18888x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public static C8586b m18890v() {
            return new C8586b();
        }

        /* renamed from: w */
        private void m18889w() {
            if ((this.f18848l & 1) != 1) {
                this.f18849m = new ArrayList(this.f18849m);
                this.f18848l |= 1;
            }
        }

        /* renamed from: x */
        private void m18888x() {
        }

        /* renamed from: s */
        public C8584o build() {
            C8584o t = m18892t();
            if (t.mo8775j()) {
                return t;
            }
            throw AbstractC11686a.AbstractC0372a.m9031l(t);
        }

        /* renamed from: t */
        public C8584o m18892t() {
            C8584o oVar = new C8584o(this);
            if ((this.f18848l & 1) == 1) {
                this.f18849m = Collections.unmodifiableList(this.f18849m);
                this.f18848l &= -2;
            }
            oVar.f18845m = this.f18849m;
            return oVar;
        }

        /* renamed from: u */
        public C8586b mo8846m() {
            return m18890v().mo8844o(m18892t());
        }

        /* renamed from: y */
        public C8586b mo8844o(C8584o oVar) {
            if (oVar == C8584o.m18900v()) {
                return this;
            }
            if (!oVar.f18845m.isEmpty()) {
                if (this.f18849m.isEmpty()) {
                    this.f18849m = oVar.f18845m;
                    this.f18848l &= -2;
                } else {
                    m18889w();
                    this.f18849m.addAll(oVar.f18845m);
                }
            }
            m8843q(m8845n().m9017b(oVar.f18844l));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: z */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p159ih.C8584o.C8586b mo9032k(ph.C11694e r3, ph.C11697g r4) {
            /*
                r2 = this;
                r0 = 0
                ph.s<ih.o> r1 = p159ih.C8584o.f18843q     // Catch: all -> 0x000f, k -> 0x0011
                java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                ih.o r3 = (p159ih.C8584o) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                ih.o r4 = (p159ih.C8584o) r4     // Catch: all -> 0x000f
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
            throw new UnsupportedOperationException("Method not decompiled: p159ih.C8584o.C8586b.mo9032k(ph.e, ph.g):ih.o$b");
        }
    }

    static {
        C8584o oVar = new C8584o(true);
        f18842p = oVar;
        oVar.m18897y();
    }

    /* renamed from: A */
    public static C8586b m18906A(C8584o oVar) {
        return m18896z().mo8844o(oVar);
    }

    /* renamed from: v */
    public static C8584o m18900v() {
        return f18842p;
    }

    /* renamed from: y */
    private void m18897y() {
        this.f18845m = Collections.emptyList();
    }

    /* renamed from: z */
    public static C8586b m18896z() {
        return C8586b.m18890v();
    }

    /* renamed from: B */
    public C8586b mo8779e() {
        return m18896z();
    }

    /* renamed from: C */
    public C8586b mo8782a() {
        return m18906A(this);
    }

    @Override // ph.AbstractC11724q
    /* renamed from: c */
    public int mo8781c() {
        int i = this.f18847o;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f18845m.size(); i3++) {
            i2 += C11695f.m8898s(1, this.f18845m.get(i3));
        }
        int size = i2 + this.f18844l.size();
        this.f18847o = size;
        return size;
    }

    @Override // ph.AbstractC11724q
    /* renamed from: d */
    public void mo8780d(C11695f fVar) {
        mo8781c();
        for (int i = 0; i < this.f18845m.size(); i++) {
            fVar.m8927d0(1, this.f18845m.get(i));
        }
        fVar.m8917i0(this.f18844l);
    }

    @Override // ph.AbstractC11702i, ph.AbstractC11724q
    /* renamed from: h */
    public AbstractC11727s<C8584o> mo8778h() {
        return f18843q;
    }

    @Override // ph.AbstractC11726r
    /* renamed from: j */
    public final boolean mo8775j() {
        byte b = this.f18846n;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < m18898x(); i++) {
            if (!m18899w(i).mo8775j()) {
                this.f18846n = (byte) 0;
                return false;
            }
        }
        this.f18846n = (byte) 1;
        return true;
    }

    /* renamed from: w */
    public C8587c m18899w(int i) {
        return this.f18845m.get(i);
    }

    /* renamed from: x */
    public int m18898x() {
        return this.f18845m.size();
    }

    /* renamed from: ih.o$c */
    /* loaded from: classes8.dex */
    public static final class C8587c extends AbstractC11702i implements AbstractC11726r {

        /* renamed from: s */
        private static final C8587c f18850s;

        /* renamed from: t */
        public static AbstractC11727s<C8587c> f18851t = new C8588a();

        /* renamed from: l */
        private final AbstractC11691d f18852l;

        /* renamed from: m */
        private int f18853m;

        /* renamed from: n */
        private int f18854n;

        /* renamed from: o */
        private int f18855o;

        /* renamed from: p */
        private EnumC0271c f18856p;

        /* renamed from: q */
        private byte f18857q;

        /* renamed from: r */
        private int f18858r;

        /* renamed from: ih.o$c$a */
        /* loaded from: classes8.dex */
        static class C8588a extends AbstractC11687b<C8587c> {
            C8588a() {
            }

            /* renamed from: m */
            public C8587c mo8771d(C11694e eVar, C11697g gVar) {
                return new C8587c(eVar, gVar);
            }
        }

        /* renamed from: ih.o$c$b */
        /* loaded from: classes8.dex */
        public static final class C8589b extends AbstractC11702i.AbstractC11704b<C8587c, C8589b> implements AbstractC11726r {

            /* renamed from: l */
            private int f18859l;

            /* renamed from: n */
            private int f18861n;

            /* renamed from: m */
            private int f18860m = -1;

            /* renamed from: o */
            private EnumC0271c f18862o = EnumC0271c.PACKAGE;

            private C8589b() {
                m18860w();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: v */
            public static C8589b m18861v() {
                return new C8589b();
            }

            /* renamed from: w */
            private void m18860w() {
            }

            /* renamed from: A */
            public C8589b m18867A(int i) {
                this.f18859l |= 1;
                this.f18860m = i;
                return this;
            }

            /* renamed from: B */
            public C8589b m18866B(int i) {
                this.f18859l |= 2;
                this.f18861n = i;
                return this;
            }

            /* renamed from: s */
            public C8587c build() {
                C8587c t = m18863t();
                if (t.mo8775j()) {
                    return t;
                }
                throw AbstractC11686a.AbstractC0372a.m9031l(t);
            }

            /* renamed from: t */
            public C8587c m18863t() {
                C8587c cVar = new C8587c(this);
                int i = this.f18859l;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                cVar.f18854n = this.f18860m;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                cVar.f18855o = this.f18861n;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                cVar.f18856p = this.f18862o;
                cVar.f18853m = i2;
                return cVar;
            }

            /* renamed from: u */
            public C8589b mo8846m() {
                return m18861v().mo8844o(m18863t());
            }

            /* renamed from: x */
            public C8589b mo8844o(C8587c cVar) {
                if (cVar == C8587c.m18871x()) {
                    return this;
                }
                if (cVar.m18883C()) {
                    m18867A(cVar.m18869z());
                }
                if (cVar.m18882D()) {
                    m18866B(cVar.m18885A());
                }
                if (cVar.m18884B()) {
                    m18857z(cVar.m18870y());
                }
                m8843q(m8845n().m9017b(cVar.f18852l));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* renamed from: y */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public p159ih.C8584o.C8587c.C8589b mo9032k(ph.C11694e r3, ph.C11697g r4) {
                /*
                    r2 = this;
                    r0 = 0
                    ph.s<ih.o$c> r1 = p159ih.C8584o.C8587c.f18851t     // Catch: all -> 0x000f, k -> 0x0011
                    java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                    ih.o$c r3 = (p159ih.C8584o.C8587c) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                    ih.o$c r4 = (p159ih.C8584o.C8587c) r4     // Catch: all -> 0x000f
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
                throw new UnsupportedOperationException("Method not decompiled: p159ih.C8584o.C8587c.C8589b.mo9032k(ph.e, ph.g):ih.o$c$b");
            }

            /* renamed from: z */
            public C8589b m18857z(EnumC0271c cVar) {
                cVar.getClass();
                this.f18859l |= 4;
                this.f18862o = cVar;
                return this;
            }
        }

        /* renamed from: ih.o$c$c */
        /* loaded from: classes8.dex */
        public enum EnumC0271c implements C11710j.AbstractC11711a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);
            

            /* renamed from: o */
            private static C11710j.AbstractC11712b<EnumC0271c> f18866o = new a();

            /* renamed from: k */
            private final int f18868k;

            /* renamed from: ih.o$c$c$a */
            /* loaded from: classes8.dex */
            static class a implements C11710j.AbstractC11712b<EnumC0271c> {
                a() {
                }

                /* renamed from: b */
                public EnumC0271c mo8811a(int i) {
                    return EnumC0271c.m18856a(i);
                }
            }

            EnumC0271c(int i, int i2) {
                this.f18868k = i2;
            }

            /* renamed from: a */
            public static EnumC0271c m18856a(int i) {
                if (i == 0) {
                    return CLASS;
                }
                if (i == 1) {
                    return PACKAGE;
                }
                if (i != 2) {
                    return null;
                }
                return LOCAL;
            }

            @Override // ph.C11710j.AbstractC11711a
            public final int getNumber() {
                return this.f18868k;
            }
        }

        static {
            C8587c cVar = new C8587c(true);
            f18850s = cVar;
            cVar.m18881E();
        }

        /* renamed from: E */
        private void m18881E() {
            this.f18854n = -1;
            this.f18855o = 0;
            this.f18856p = EnumC0271c.PACKAGE;
        }

        /* renamed from: F */
        public static C8589b m18880F() {
            return C8589b.m18861v();
        }

        /* renamed from: G */
        public static C8589b m18879G(C8587c cVar) {
            return m18880F().mo8844o(cVar);
        }

        /* renamed from: x */
        public static C8587c m18871x() {
            return f18850s;
        }

        /* renamed from: A */
        public int m18885A() {
            return this.f18855o;
        }

        /* renamed from: B */
        public boolean m18884B() {
            return (this.f18853m & 4) == 4;
        }

        /* renamed from: C */
        public boolean m18883C() {
            return (this.f18853m & 1) == 1;
        }

        /* renamed from: D */
        public boolean m18882D() {
            return (this.f18853m & 2) == 2;
        }

        /* renamed from: H */
        public C8589b mo8779e() {
            return m18880F();
        }

        /* renamed from: I */
        public C8589b mo8782a() {
            return m18879G(this);
        }

        @Override // ph.AbstractC11724q
        /* renamed from: c */
        public int mo8781c() {
            int i = this.f18858r;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f18853m & 1) == 1) {
                i2 = 0 + C11695f.m8906o(1, this.f18854n);
            }
            if ((this.f18853m & 2) == 2) {
                i2 += C11695f.m8906o(2, this.f18855o);
            }
            if ((this.f18853m & 4) == 4) {
                i2 += C11695f.m8920h(3, this.f18856p.getNumber());
            }
            int size = i2 + this.f18852l.size();
            this.f18858r = size;
            return size;
        }

        @Override // ph.AbstractC11724q
        /* renamed from: d */
        public void mo8780d(C11695f fVar) {
            mo8781c();
            if ((this.f18853m & 1) == 1) {
                fVar.m8933a0(1, this.f18854n);
            }
            if ((this.f18853m & 2) == 2) {
                fVar.m8933a0(2, this.f18855o);
            }
            if ((this.f18853m & 4) == 4) {
                fVar.m8942S(3, this.f18856p.getNumber());
            }
            fVar.m8917i0(this.f18852l);
        }

        @Override // ph.AbstractC11702i, ph.AbstractC11724q
        /* renamed from: h */
        public AbstractC11727s<C8587c> mo8778h() {
            return f18851t;
        }

        @Override // ph.AbstractC11726r
        /* renamed from: j */
        public final boolean mo8775j() {
            byte b = this.f18857q;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!m18882D()) {
                this.f18857q = (byte) 0;
                return false;
            }
            this.f18857q = (byte) 1;
            return true;
        }

        /* renamed from: y */
        public EnumC0271c m18870y() {
            return this.f18856p;
        }

        /* renamed from: z */
        public int m18869z() {
            return this.f18854n;
        }

        private C8587c(AbstractC11702i.AbstractC11704b bVar) {
            super(bVar);
            this.f18857q = (byte) -1;
            this.f18858r = -1;
            this.f18852l = bVar.m8845n();
        }

        private C8587c(boolean z) {
            this.f18857q = (byte) -1;
            this.f18858r = -1;
            this.f18852l = AbstractC11691d.f26108k;
        }

        private C8587c(C11694e eVar, C11697g gVar) {
            this.f18857q = (byte) -1;
            this.f18858r = -1;
            m18881E();
            AbstractC11691d.C11693b w = AbstractC11691d.m9011w();
            C11695f J = C11695f.m8951J(w, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int K = eVar.m8996K();
                        if (K != 0) {
                            if (K == 8) {
                                this.f18853m |= 1;
                                this.f18854n = eVar.m8968s();
                            } else if (K == 16) {
                                this.f18853m |= 2;
                                this.f18855o = eVar.m8968s();
                            } else if (K == 24) {
                                int n = eVar.m8973n();
                                EnumC0271c a = EnumC0271c.m18856a(n);
                                if (a == null) {
                                    J.m8905o0(K);
                                    J.m8905o0(n);
                                } else {
                                    this.f18853m |= 4;
                                    this.f18856p = a;
                                }
                            } else if (!mo8836q(eVar, J, gVar, K)) {
                            }
                        }
                        z = true;
                    } catch (C11713k e) {
                        throw e.m8802i(this);
                    } catch (IOException e2) {
                        throw new C11713k(e2.getMessage()).m8802i(this);
                    }
                } catch (Throwable th2) {
                    try {
                        J.m8952I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f18852l = w.m9007i();
                        throw th3;
                    }
                    this.f18852l = w.m9007i();
                    mo8837n();
                    throw th2;
                }
            }
            try {
                J.m8952I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f18852l = w.m9007i();
                throw th4;
            }
            this.f18852l = w.m9007i();
            mo8837n();
        }
    }

    private C8584o(AbstractC11702i.AbstractC11704b bVar) {
        super(bVar);
        this.f18846n = (byte) -1;
        this.f18847o = -1;
        this.f18844l = bVar.m8845n();
    }

    private C8584o(boolean z) {
        this.f18846n = (byte) -1;
        this.f18847o = -1;
        this.f18844l = AbstractC11691d.f26108k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C8584o(C11694e eVar, C11697g gVar) {
        this.f18846n = (byte) -1;
        this.f18847o = -1;
        m18897y();
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
                                    this.f18845m = new ArrayList();
                                    z2 |= true;
                                }
                                this.f18845m.add(eVar.m8966u(C8587c.f18851t, gVar));
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
                    this.f18845m = Collections.unmodifiableList(this.f18845m);
                }
                try {
                    J.m8952I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f18844l = w.m9007i();
                    throw th3;
                }
                this.f18844l = w.m9007i();
                mo8837n();
                throw th2;
            }
        }
        if (z2 && true) {
            this.f18845m = Collections.unmodifiableList(this.f18845m);
        }
        try {
            J.m8952I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f18844l = w.m9007i();
            throw th4;
        }
        this.f18844l = w.m9007i();
        mo8837n();
    }
}
