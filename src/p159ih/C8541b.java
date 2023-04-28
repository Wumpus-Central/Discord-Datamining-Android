package p159ih;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p163j$.util.Spliterator;
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

/* renamed from: ih.b */
/* loaded from: classes8.dex */
public final class C8541b extends AbstractC11702i implements AbstractC11726r {

    /* renamed from: r */
    private static final C8541b f18556r;

    /* renamed from: s */
    public static AbstractC11727s<C8541b> f18557s = new C8542a();

    /* renamed from: l */
    private final AbstractC11691d f18558l;

    /* renamed from: m */
    private int f18559m;

    /* renamed from: n */
    private int f18560n;

    /* renamed from: o */
    private List<C0266b> f18561o;

    /* renamed from: p */
    private byte f18562p;

    /* renamed from: q */
    private int f18563q;

    /* renamed from: ih.b$a */
    /* loaded from: classes8.dex */
    static class C8542a extends AbstractC11687b<C8541b> {
        C8542a() {
        }

        /* renamed from: m */
        public C8541b mo8771d(C11694e eVar, C11697g gVar) {
            return new C8541b(eVar, gVar);
        }
    }

    /* renamed from: ih.b$b */
    /* loaded from: classes8.dex */
    public static final class C0266b extends AbstractC11702i implements AbstractC11726r {

        /* renamed from: r */
        private static final C0266b f18564r;

        /* renamed from: s */
        public static AbstractC11727s<C0266b> f18565s = new a();

        /* renamed from: l */
        private final AbstractC11691d f18566l;

        /* renamed from: m */
        private int f18567m;

        /* renamed from: n */
        private int f18568n;

        /* renamed from: o */
        private c f18569o;

        /* renamed from: p */
        private byte f18570p;

        /* renamed from: q */
        private int f18571q;

        /* renamed from: ih.b$b$a */
        /* loaded from: classes8.dex */
        static class a extends AbstractC11687b<C0266b> {
            a() {
            }

            /* renamed from: m */
            public C0266b mo8771d(C11694e eVar, C11697g gVar) {
                return new C0266b(eVar, gVar);
            }
        }

        /* renamed from: ih.b$b$b */
        /* loaded from: classes8.dex */
        public static final class C0267b extends AbstractC11702i.AbstractC11704b<C0266b, C0267b> implements AbstractC11726r {

            /* renamed from: l */
            private int f18572l;

            /* renamed from: m */
            private int f18573m;

            /* renamed from: n */
            private c f18574n = c.m19513M();

            private C0267b() {
                m19529w();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: v */
            public static C0267b m19530v() {
                return new C0267b();
            }

            /* renamed from: w */
            private void m19529w() {
            }

            /* renamed from: A */
            public C0267b m19535A(int i) {
                this.f18572l |= 1;
                this.f18573m = i;
                return this;
            }

            /* renamed from: s */
            public C0266b build() {
                C0266b t = m19532t();
                if (t.mo8775j()) {
                    return t;
                }
                throw AbstractC11686a.AbstractC0372a.m9031l(t);
            }

            /* renamed from: t */
            public C0266b m19532t() {
                C0266b bVar = new C0266b(this);
                int i = this.f18572l;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                bVar.f18568n = this.f18573m;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                bVar.f18569o = this.f18574n;
                bVar.f18567m = i2;
                return bVar;
            }

            /* renamed from: u */
            public C0267b mo8846m() {
                return m19530v().mo8844o(m19532t());
            }

            /* renamed from: x */
            public C0267b mo8844o(C0266b bVar) {
                if (bVar == C0266b.m19540w()) {
                    return this;
                }
                if (bVar.m19537z()) {
                    m19535A(bVar.m19539x());
                }
                if (bVar.m19550A()) {
                    m19526z(bVar.m19538y());
                }
                m8843q(m8845n().m9017b(bVar.f18566l));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* renamed from: y */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public p159ih.C8541b.C0266b.C0267b mo9032k(ph.C11694e r3, ph.C11697g r4) {
                /*
                    r2 = this;
                    r0 = 0
                    ph.s<ih.b$b> r1 = p159ih.C8541b.C0266b.f18565s     // Catch: all -> 0x000f, k -> 0x0011
                    java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                    ih.b$b r3 = (p159ih.C8541b.C0266b) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                    ih.b$b r4 = (p159ih.C8541b.C0266b) r4     // Catch: all -> 0x000f
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
                throw new UnsupportedOperationException("Method not decompiled: p159ih.C8541b.C0266b.C0267b.mo9032k(ph.e, ph.g):ih.b$b$b");
            }

            /* renamed from: z */
            public C0267b m19526z(c cVar) {
                if ((this.f18572l & 2) != 2 || this.f18574n == c.m19513M()) {
                    this.f18574n = cVar;
                } else {
                    this.f18574n = c.m19493g0(this.f18574n).mo8844o(cVar).m19469t();
                }
                this.f18572l |= 2;
                return this;
            }
        }

        static {
            C0266b bVar = new C0266b(true);
            f18564r = bVar;
            bVar.m19549B();
        }

        /* renamed from: B */
        private void m19549B() {
            this.f18568n = 0;
            this.f18569o = c.m19513M();
        }

        /* renamed from: C */
        public static C0267b m19548C() {
            return C0267b.m19530v();
        }

        /* renamed from: D */
        public static C0267b m19547D(C0266b bVar) {
            return m19548C().mo8844o(bVar);
        }

        /* renamed from: w */
        public static C0266b m19540w() {
            return f18564r;
        }

        /* renamed from: A */
        public boolean m19550A() {
            return (this.f18567m & 2) == 2;
        }

        /* renamed from: E */
        public C0267b mo8779e() {
            return m19548C();
        }

        /* renamed from: F */
        public C0267b mo8782a() {
            return m19547D(this);
        }

        @Override // ph.AbstractC11724q
        /* renamed from: c */
        public int mo8781c() {
            int i = this.f18571q;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f18567m & 1) == 1) {
                i2 = 0 + C11695f.m8906o(1, this.f18568n);
            }
            if ((this.f18567m & 2) == 2) {
                i2 += C11695f.m8898s(2, this.f18569o);
            }
            int size = i2 + this.f18566l.size();
            this.f18571q = size;
            return size;
        }

        @Override // ph.AbstractC11724q
        /* renamed from: d */
        public void mo8780d(C11695f fVar) {
            mo8781c();
            if ((this.f18567m & 1) == 1) {
                fVar.m8933a0(1, this.f18568n);
            }
            if ((this.f18567m & 2) == 2) {
                fVar.m8927d0(2, this.f18569o);
            }
            fVar.m8917i0(this.f18566l);
        }

        @Override // ph.AbstractC11702i, ph.AbstractC11724q
        /* renamed from: h */
        public AbstractC11727s<C0266b> mo8778h() {
            return f18565s;
        }

        @Override // ph.AbstractC11726r
        /* renamed from: j */
        public final boolean mo8775j() {
            byte b = this.f18570p;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!m19537z()) {
                this.f18570p = (byte) 0;
                return false;
            } else if (!m19550A()) {
                this.f18570p = (byte) 0;
                return false;
            } else if (!m19538y().mo8775j()) {
                this.f18570p = (byte) 0;
                return false;
            } else {
                this.f18570p = (byte) 1;
                return true;
            }
        }

        /* renamed from: x */
        public int m19539x() {
            return this.f18568n;
        }

        /* renamed from: y */
        public c m19538y() {
            return this.f18569o;
        }

        /* renamed from: z */
        public boolean m19537z() {
            return (this.f18567m & 1) == 1;
        }

        /* renamed from: ih.b$b$c */
        /* loaded from: classes8.dex */
        public static final class c extends AbstractC11702i implements AbstractC11726r {

            /* renamed from: A */
            private static final c f38608A;

            /* renamed from: B */
            public static AbstractC11727s<c> f38609B = new a();

            /* renamed from: l */
            private final AbstractC11691d f18575l;

            /* renamed from: m */
            private int f18576m;

            /* renamed from: n */
            private EnumC0269c f18577n;

            /* renamed from: o */
            private long f18578o;

            /* renamed from: p */
            private float f18579p;

            /* renamed from: q */
            private double f18580q;

            /* renamed from: r */
            private int f18581r;

            /* renamed from: s */
            private int f18582s;

            /* renamed from: t */
            private int f18583t;

            /* renamed from: u */
            private C8541b f18584u;

            /* renamed from: v */
            private List<c> f18585v;

            /* renamed from: w */
            private int f18586w;

            /* renamed from: x */
            private int f18587x;

            /* renamed from: y */
            private byte f18588y;

            /* renamed from: z */
            private int f18589z;

            /* renamed from: ih.b$b$c$a */
            /* loaded from: classes8.dex */
            static class a extends AbstractC11687b<c> {
                a() {
                }

                /* renamed from: m */
                public c mo8771d(C11694e eVar, C11697g gVar) {
                    return new c(eVar, gVar);
                }
            }

            /* renamed from: ih.b$b$c$b */
            /* loaded from: classes8.dex */
            public static final class C0268b extends AbstractC11702i.AbstractC11704b<c, C0268b> implements AbstractC11726r {

                /* renamed from: l */
                private int f18590l;

                /* renamed from: n */
                private long f18592n;

                /* renamed from: o */
                private float f18593o;

                /* renamed from: p */
                private double f18594p;

                /* renamed from: q */
                private int f18595q;

                /* renamed from: r */
                private int f18596r;

                /* renamed from: s */
                private int f18597s;

                /* renamed from: v */
                private int f18600v;

                /* renamed from: w */
                private int f18601w;

                /* renamed from: m */
                private EnumC0269c f18591m = EnumC0269c.BYTE;

                /* renamed from: t */
                private C8541b f18598t = C8541b.m19567A();

                /* renamed from: u */
                private List<c> f18599u = Collections.emptyList();

                private C0268b() {
                    m19465x();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* renamed from: v */
                public static C0268b m19467v() {
                    return new C0268b();
                }

                /* renamed from: w */
                private void m19466w() {
                    if ((this.f18590l & Spliterator.NONNULL) != 256) {
                        this.f18599u = new ArrayList(this.f18599u);
                        this.f18590l |= Spliterator.NONNULL;
                    }
                }

                /* renamed from: x */
                private void m19465x() {
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
                /* renamed from: A */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public p159ih.C8541b.C0266b.c.C0268b mo9032k(ph.C11694e r3, ph.C11697g r4) {
                    /*
                        r2 = this;
                        r0 = 0
                        ph.s<ih.b$b$c> r1 = p159ih.C8541b.C0266b.c.f38609B     // Catch: all -> 0x000f, k -> 0x0011
                        java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                        ih.b$b$c r3 = (p159ih.C8541b.C0266b.c) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                        ih.b$b$c r4 = (p159ih.C8541b.C0266b.c) r4     // Catch: all -> 0x000f
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
                    throw new UnsupportedOperationException("Method not decompiled: p159ih.C8541b.C0266b.c.C0268b.mo9032k(ph.e, ph.g):ih.b$b$c$b");
                }

                /* renamed from: B */
                public C0268b m19480B(int i) {
                    this.f18590l |= 512;
                    this.f18600v = i;
                    return this;
                }

                /* renamed from: C */
                public C0268b m19479C(int i) {
                    this.f18590l |= 32;
                    this.f18596r = i;
                    return this;
                }

                /* renamed from: D */
                public C0268b m19478D(double d) {
                    this.f18590l |= 8;
                    this.f18594p = d;
                    return this;
                }

                /* renamed from: E */
                public C0268b m19477E(int i) {
                    this.f18590l |= 64;
                    this.f18597s = i;
                    return this;
                }

                /* renamed from: F */
                public C0268b m19476F(int i) {
                    this.f18590l |= Spliterator.IMMUTABLE;
                    this.f18601w = i;
                    return this;
                }

                /* renamed from: G */
                public C0268b m19475G(float f) {
                    this.f18590l |= 4;
                    this.f18593o = f;
                    return this;
                }

                /* renamed from: H */
                public C0268b m19474H(long j) {
                    this.f18590l |= 2;
                    this.f18592n = j;
                    return this;
                }

                /* renamed from: I */
                public C0268b m19473I(int i) {
                    this.f18590l |= 16;
                    this.f18595q = i;
                    return this;
                }

                /* renamed from: J */
                public C0268b m19472J(EnumC0269c cVar) {
                    cVar.getClass();
                    this.f18590l |= 1;
                    this.f18591m = cVar;
                    return this;
                }

                /* renamed from: s */
                public c build() {
                    c t = m19469t();
                    if (t.mo8775j()) {
                        return t;
                    }
                    throw AbstractC11686a.AbstractC0372a.m9031l(t);
                }

                /* renamed from: t */
                public c m19469t() {
                    c cVar = new c(this);
                    int i = this.f18590l;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    cVar.f18577n = this.f18591m;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    cVar.f18578o = this.f18592n;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    cVar.f18579p = this.f18593o;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    cVar.f18580q = this.f18594p;
                    if ((i & 16) == 16) {
                        i2 |= 16;
                    }
                    cVar.f18581r = this.f18595q;
                    if ((i & 32) == 32) {
                        i2 |= 32;
                    }
                    cVar.f18582s = this.f18596r;
                    if ((i & 64) == 64) {
                        i2 |= 64;
                    }
                    cVar.f18583t = this.f18597s;
                    if ((i & 128) == 128) {
                        i2 |= 128;
                    }
                    cVar.f18584u = this.f18598t;
                    if ((this.f18590l & Spliterator.NONNULL) == 256) {
                        this.f18599u = Collections.unmodifiableList(this.f18599u);
                        this.f18590l &= -257;
                    }
                    cVar.f18585v = this.f18599u;
                    if ((i & 512) == 512) {
                        i2 |= Spliterator.NONNULL;
                    }
                    cVar.f18586w = this.f18600v;
                    if ((i & Spliterator.IMMUTABLE) == 1024) {
                        i2 |= 512;
                    }
                    cVar.f18587x = this.f18601w;
                    cVar.f18576m = i2;
                    return cVar;
                }

                /* renamed from: u */
                public C0268b mo8846m() {
                    return m19467v().mo8844o(m19469t());
                }

                /* renamed from: y */
                public C0268b m19464y(C8541b bVar) {
                    if ((this.f18590l & 128) != 128 || this.f18598t == C8541b.m19567A()) {
                        this.f18598t = bVar;
                    } else {
                        this.f18598t = C8541b.m19562F(this.f18598t).mo8844o(bVar).m19457t();
                    }
                    this.f18590l |= 128;
                    return this;
                }

                /* renamed from: z */
                public C0268b mo8844o(c cVar) {
                    if (cVar == c.m19513M()) {
                        return this;
                    }
                    if (cVar.m19496d0()) {
                        m19472J(cVar.m19506T());
                    }
                    if (cVar.m19498b0()) {
                        m19474H(cVar.m19508R());
                    }
                    if (cVar.m19499a0()) {
                        m19475G(cVar.m19509Q());
                    }
                    if (cVar.m19502X()) {
                        m19478D(cVar.m19512N());
                    }
                    if (cVar.m19497c0()) {
                        m19473I(cVar.m19507S());
                    }
                    if (cVar.m19503W()) {
                        m19479C(cVar.m19514L());
                    }
                    if (cVar.m19501Y()) {
                        m19477E(cVar.m19511O());
                    }
                    if (cVar.m19505U()) {
                        m19464y(cVar.m19519G());
                    }
                    if (!cVar.f18585v.isEmpty()) {
                        if (this.f18599u.isEmpty()) {
                            this.f18599u = cVar.f18585v;
                            this.f18590l &= -257;
                        } else {
                            m19466w();
                            this.f18599u.addAll(cVar.f18585v);
                        }
                    }
                    if (cVar.m19504V()) {
                        m19480B(cVar.m19518H());
                    }
                    if (cVar.m19500Z()) {
                        m19476F(cVar.m19510P());
                    }
                    m8843q(m8845n().m9017b(cVar.f18575l));
                    return this;
                }
            }

            /* renamed from: ih.b$b$c$c */
            /* loaded from: classes8.dex */
            public enum EnumC0269c implements C11710j.AbstractC11711a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);
                

                /* renamed from: y */
                private static C11710j.AbstractC11712b<EnumC0269c> f18615y = new a();

                /* renamed from: k */
                private final int f18617k;

                /* renamed from: ih.b$b$c$c$a */
                /* loaded from: classes8.dex */
                static class a implements C11710j.AbstractC11712b<EnumC0269c> {
                    a() {
                    }

                    /* renamed from: b */
                    public EnumC0269c mo8811a(int i) {
                        return EnumC0269c.m19462a(i);
                    }
                }

                EnumC0269c(int i, int i2) {
                    this.f18617k = i2;
                }

                /* renamed from: a */
                public static EnumC0269c m19462a(int i) {
                    switch (i) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                @Override // ph.C11710j.AbstractC11711a
                public final int getNumber() {
                    return this.f18617k;
                }
            }

            static {
                c cVar = new c(true);
                f38608A = cVar;
                cVar.m19495e0();
            }

            /* renamed from: M */
            public static c m19513M() {
                return f38608A;
            }

            /* renamed from: e0 */
            private void m19495e0() {
                this.f18577n = EnumC0269c.BYTE;
                this.f18578o = 0L;
                this.f18579p = 0.0f;
                this.f18580q = 0.0d;
                this.f18581r = 0;
                this.f18582s = 0;
                this.f18583t = 0;
                this.f18584u = C8541b.m19567A();
                this.f18585v = Collections.emptyList();
                this.f18586w = 0;
                this.f18587x = 0;
            }

            /* renamed from: f0 */
            public static C0268b m19494f0() {
                return C0268b.m19467v();
            }

            /* renamed from: g0 */
            public static C0268b m19493g0(c cVar) {
                return m19494f0().mo8844o(cVar);
            }

            /* renamed from: G */
            public C8541b m19519G() {
                return this.f18584u;
            }

            /* renamed from: H */
            public int m19518H() {
                return this.f18586w;
            }

            /* renamed from: I */
            public c m19517I(int i) {
                return this.f18585v.get(i);
            }

            /* renamed from: J */
            public int m19516J() {
                return this.f18585v.size();
            }

            /* renamed from: K */
            public List<c> m19515K() {
                return this.f18585v;
            }

            /* renamed from: L */
            public int m19514L() {
                return this.f18582s;
            }

            /* renamed from: N */
            public double m19512N() {
                return this.f18580q;
            }

            /* renamed from: O */
            public int m19511O() {
                return this.f18583t;
            }

            /* renamed from: P */
            public int m19510P() {
                return this.f18587x;
            }

            /* renamed from: Q */
            public float m19509Q() {
                return this.f18579p;
            }

            /* renamed from: R */
            public long m19508R() {
                return this.f18578o;
            }

            /* renamed from: S */
            public int m19507S() {
                return this.f18581r;
            }

            /* renamed from: T */
            public EnumC0269c m19506T() {
                return this.f18577n;
            }

            /* renamed from: U */
            public boolean m19505U() {
                return (this.f18576m & 128) == 128;
            }

            /* renamed from: V */
            public boolean m19504V() {
                return (this.f18576m & Spliterator.NONNULL) == 256;
            }

            /* renamed from: W */
            public boolean m19503W() {
                return (this.f18576m & 32) == 32;
            }

            /* renamed from: X */
            public boolean m19502X() {
                return (this.f18576m & 8) == 8;
            }

            /* renamed from: Y */
            public boolean m19501Y() {
                return (this.f18576m & 64) == 64;
            }

            /* renamed from: Z */
            public boolean m19500Z() {
                return (this.f18576m & 512) == 512;
            }

            /* renamed from: a0 */
            public boolean m19499a0() {
                return (this.f18576m & 4) == 4;
            }

            /* renamed from: b0 */
            public boolean m19498b0() {
                return (this.f18576m & 2) == 2;
            }

            @Override // ph.AbstractC11724q
            /* renamed from: c */
            public int mo8781c() {
                int i;
                int i2 = this.f18589z;
                if (i2 != -1) {
                    return i2;
                }
                if ((this.f18576m & 1) == 1) {
                    i = C11695f.m8920h(1, this.f18577n.getNumber()) + 0;
                } else {
                    i = 0;
                }
                if ((this.f18576m & 2) == 2) {
                    i += C11695f.m8960A(2, this.f18578o);
                }
                if ((this.f18576m & 4) == 4) {
                    i += C11695f.m8912l(3, this.f18579p);
                }
                if ((this.f18576m & 8) == 8) {
                    i += C11695f.m8924f(4, this.f18580q);
                }
                if ((this.f18576m & 16) == 16) {
                    i += C11695f.m8906o(5, this.f18581r);
                }
                if ((this.f18576m & 32) == 32) {
                    i += C11695f.m8906o(6, this.f18582s);
                }
                if ((this.f18576m & 64) == 64) {
                    i += C11695f.m8906o(7, this.f18583t);
                }
                if ((this.f18576m & 128) == 128) {
                    i += C11695f.m8898s(8, this.f18584u);
                }
                for (int i3 = 0; i3 < this.f18585v.size(); i3++) {
                    i += C11695f.m8898s(9, this.f18585v.get(i3));
                }
                if ((this.f18576m & 512) == 512) {
                    i += C11695f.m8906o(10, this.f18587x);
                }
                if ((this.f18576m & Spliterator.NONNULL) == 256) {
                    i += C11695f.m8906o(11, this.f18586w);
                }
                int size = i + this.f18575l.size();
                this.f18589z = size;
                return size;
            }

            /* renamed from: c0 */
            public boolean m19497c0() {
                return (this.f18576m & 16) == 16;
            }

            @Override // ph.AbstractC11724q
            /* renamed from: d */
            public void mo8780d(C11695f fVar) {
                mo8781c();
                if ((this.f18576m & 1) == 1) {
                    fVar.m8942S(1, this.f18577n.getNumber());
                }
                if ((this.f18576m & 2) == 2) {
                    fVar.m8895t0(2, this.f18578o);
                }
                if ((this.f18576m & 4) == 4) {
                    fVar.m8938W(3, this.f18579p);
                }
                if ((this.f18576m & 8) == 8) {
                    fVar.m8944Q(4, this.f18580q);
                }
                if ((this.f18576m & 16) == 16) {
                    fVar.m8933a0(5, this.f18581r);
                }
                if ((this.f18576m & 32) == 32) {
                    fVar.m8933a0(6, this.f18582s);
                }
                if ((this.f18576m & 64) == 64) {
                    fVar.m8933a0(7, this.f18583t);
                }
                if ((this.f18576m & 128) == 128) {
                    fVar.m8927d0(8, this.f18584u);
                }
                for (int i = 0; i < this.f18585v.size(); i++) {
                    fVar.m8927d0(9, this.f18585v.get(i));
                }
                if ((this.f18576m & 512) == 512) {
                    fVar.m8933a0(10, this.f18587x);
                }
                if ((this.f18576m & Spliterator.NONNULL) == 256) {
                    fVar.m8933a0(11, this.f18586w);
                }
                fVar.m8917i0(this.f18575l);
            }

            /* renamed from: d0 */
            public boolean m19496d0() {
                return (this.f18576m & 1) == 1;
            }

            @Override // ph.AbstractC11702i, ph.AbstractC11724q
            /* renamed from: h */
            public AbstractC11727s<c> mo8778h() {
                return f38609B;
            }

            /* renamed from: h0 */
            public C0268b mo8779e() {
                return m19494f0();
            }

            /* renamed from: i0 */
            public C0268b mo8782a() {
                return m19493g0(this);
            }

            @Override // ph.AbstractC11726r
            /* renamed from: j */
            public final boolean mo8775j() {
                byte b = this.f18588y;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!m19505U() || m19519G().mo8775j()) {
                    for (int i = 0; i < m19516J(); i++) {
                        if (!m19517I(i).mo8775j()) {
                            this.f18588y = (byte) 0;
                            return false;
                        }
                    }
                    this.f18588y = (byte) 1;
                    return true;
                }
                this.f18588y = (byte) 0;
                return false;
            }

            private c(AbstractC11702i.AbstractC11704b bVar) {
                super(bVar);
                this.f18588y = (byte) -1;
                this.f18589z = -1;
                this.f18575l = bVar.m8845n();
            }

            private c(boolean z) {
                this.f18588y = (byte) -1;
                this.f18589z = -1;
                this.f18575l = AbstractC11691d.f26108k;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
            /* JADX WARN: Unknown variable types count: 1 */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private c(ph.C11694e r10, ph.C11697g r11) {
                /*
                    Method dump skipped, instructions count: 388
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p159ih.C8541b.C0266b.c.<init>(ph.e, ph.g):void");
            }
        }

        private C0266b(AbstractC11702i.AbstractC11704b bVar) {
            super(bVar);
            this.f18570p = (byte) -1;
            this.f18571q = -1;
            this.f18566l = bVar.m8845n();
        }

        private C0266b(boolean z) {
            this.f18570p = (byte) -1;
            this.f18571q = -1;
            this.f18566l = AbstractC11691d.f26108k;
        }

        private C0266b(C11694e eVar, C11697g gVar) {
            this.f18570p = (byte) -1;
            this.f18571q = -1;
            m19549B();
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
                                    this.f18567m |= 1;
                                    this.f18568n = eVar.m8968s();
                                } else if (K == 18) {
                                    c.C0268b i0 = (this.f18567m & 2) == 2 ? this.f18569o.mo8782a() : null;
                                    c cVar = (c) eVar.m8966u(c.f38609B, gVar);
                                    this.f18569o = cVar;
                                    if (i0 != null) {
                                        i0.mo8844o(cVar);
                                        this.f18569o = i0.m19469t();
                                    }
                                    this.f18567m |= 2;
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
                    try {
                        J.m8952I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f18566l = w.m9007i();
                        throw th3;
                    }
                    this.f18566l = w.m9007i();
                    mo8837n();
                    throw th2;
                }
            }
            try {
                J.m8952I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f18566l = w.m9007i();
                throw th4;
            }
            this.f18566l = w.m9007i();
            mo8837n();
        }
    }

    /* renamed from: ih.b$c */
    /* loaded from: classes8.dex */
    public static final class C8543c extends AbstractC11702i.AbstractC11704b<C8541b, C8543c> implements AbstractC11726r {

        /* renamed from: l */
        private int f18618l;

        /* renamed from: m */
        private int f18619m;

        /* renamed from: n */
        private List<C0266b> f18620n = Collections.emptyList();

        private C8543c() {
            m19453x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public static C8543c m19455v() {
            return new C8543c();
        }

        /* renamed from: w */
        private void m19454w() {
            if ((this.f18618l & 2) != 2) {
                this.f18620n = new ArrayList(this.f18620n);
                this.f18618l |= 2;
            }
        }

        /* renamed from: x */
        private void m19453x() {
        }

        /* renamed from: A */
        public C8543c m19460A(int i) {
            this.f18618l |= 1;
            this.f18619m = i;
            return this;
        }

        /* renamed from: s */
        public C8541b build() {
            C8541b t = m19457t();
            if (t.mo8775j()) {
                return t;
            }
            throw AbstractC11686a.AbstractC0372a.m9031l(t);
        }

        /* renamed from: t */
        public C8541b m19457t() {
            C8541b bVar = new C8541b(this);
            int i = 1;
            if ((this.f18618l & 1) != 1) {
                i = 0;
            }
            bVar.f18560n = this.f18619m;
            if ((this.f18618l & 2) == 2) {
                this.f18620n = Collections.unmodifiableList(this.f18620n);
                this.f18618l &= -3;
            }
            bVar.f18561o = this.f18620n;
            bVar.f18559m = i;
            return bVar;
        }

        /* renamed from: u */
        public C8543c mo8846m() {
            return m19455v().mo8844o(m19457t());
        }

        /* renamed from: y */
        public C8543c mo8844o(C8541b bVar) {
            if (bVar == C8541b.m19567A()) {
                return this;
            }
            if (bVar.m19565C()) {
                m19460A(bVar.m19566B());
            }
            if (!bVar.f18561o.isEmpty()) {
                if (this.f18620n.isEmpty()) {
                    this.f18620n = bVar.f18561o;
                    this.f18618l &= -3;
                } else {
                    m19454w();
                    this.f18620n.addAll(bVar.f18561o);
                }
            }
            m8843q(m8845n().m9017b(bVar.f18558l));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: z */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p159ih.C8541b.C8543c mo9032k(ph.C11694e r3, ph.C11697g r4) {
            /*
                r2 = this;
                r0 = 0
                ph.s<ih.b> r1 = p159ih.C8541b.f18557s     // Catch: all -> 0x000f, k -> 0x0011
                java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                ih.b r3 = (p159ih.C8541b) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                ih.b r4 = (p159ih.C8541b) r4     // Catch: all -> 0x000f
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
            throw new UnsupportedOperationException("Method not decompiled: p159ih.C8541b.C8543c.mo9032k(ph.e, ph.g):ih.b$c");
        }
    }

    static {
        C8541b bVar = new C8541b(true);
        f18556r = bVar;
        bVar.m19564D();
    }

    /* renamed from: A */
    public static C8541b m19567A() {
        return f18556r;
    }

    /* renamed from: D */
    private void m19564D() {
        this.f18560n = 0;
        this.f18561o = Collections.emptyList();
    }

    /* renamed from: E */
    public static C8543c m19563E() {
        return C8543c.m19455v();
    }

    /* renamed from: F */
    public static C8543c m19562F(C8541b bVar) {
        return m19563E().mo8844o(bVar);
    }

    /* renamed from: B */
    public int m19566B() {
        return this.f18560n;
    }

    /* renamed from: C */
    public boolean m19565C() {
        return (this.f18559m & 1) == 1;
    }

    /* renamed from: G */
    public C8543c mo8779e() {
        return m19563E();
    }

    /* renamed from: H */
    public C8543c mo8782a() {
        return m19562F(this);
    }

    @Override // ph.AbstractC11724q
    /* renamed from: c */
    public int mo8781c() {
        int i;
        int i2 = this.f18563q;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f18559m & 1) == 1) {
            i = C11695f.m8906o(1, this.f18560n) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.f18561o.size(); i3++) {
            i += C11695f.m8898s(2, this.f18561o.get(i3));
        }
        int size = i + this.f18558l.size();
        this.f18563q = size;
        return size;
    }

    @Override // ph.AbstractC11724q
    /* renamed from: d */
    public void mo8780d(C11695f fVar) {
        mo8781c();
        if ((this.f18559m & 1) == 1) {
            fVar.m8933a0(1, this.f18560n);
        }
        for (int i = 0; i < this.f18561o.size(); i++) {
            fVar.m8927d0(2, this.f18561o.get(i));
        }
        fVar.m8917i0(this.f18558l);
    }

    @Override // ph.AbstractC11702i, ph.AbstractC11724q
    /* renamed from: h */
    public AbstractC11727s<C8541b> mo8778h() {
        return f18557s;
    }

    @Override // ph.AbstractC11726r
    /* renamed from: j */
    public final boolean mo8775j() {
        byte b = this.f18562p;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m19565C()) {
            this.f18562p = (byte) 0;
            return false;
        }
        for (int i = 0; i < m19553y(); i++) {
            if (!m19554x(i).mo8775j()) {
                this.f18562p = (byte) 0;
                return false;
            }
        }
        this.f18562p = (byte) 1;
        return true;
    }

    /* renamed from: x */
    public C0266b m19554x(int i) {
        return this.f18561o.get(i);
    }

    /* renamed from: y */
    public int m19553y() {
        return this.f18561o.size();
    }

    /* renamed from: z */
    public List<C0266b> m19552z() {
        return this.f18561o;
    }

    private C8541b(AbstractC11702i.AbstractC11704b bVar) {
        super(bVar);
        this.f18562p = (byte) -1;
        this.f18563q = -1;
        this.f18558l = bVar.m8845n();
    }

    private C8541b(boolean z) {
        this.f18562p = (byte) -1;
        this.f18563q = -1;
        this.f18558l = AbstractC11691d.f26108k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C8541b(C11694e eVar, C11697g gVar) {
        this.f18562p = (byte) -1;
        this.f18563q = -1;
        m19564D();
        AbstractC11691d.C11693b w = AbstractC11691d.m9011w();
        C11695f J = C11695f.m8951J(w, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int K = eVar.m8996K();
                    if (K != 0) {
                        if (K == 8) {
                            this.f18559m |= 1;
                            this.f18560n = eVar.m8968s();
                        } else if (K == 18) {
                            if (!(z2 & true)) {
                                this.f18561o = new ArrayList();
                                z2 |= true;
                            }
                            this.f18561o.add(eVar.m8966u(C0266b.f18565s, gVar));
                        } else if (!mo8836q(eVar, J, gVar, K)) {
                        }
                    }
                    z = true;
                } catch (Throwable th2) {
                    if (z2 & true) {
                        this.f18561o = Collections.unmodifiableList(this.f18561o);
                    }
                    try {
                        J.m8952I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f18558l = w.m9007i();
                        throw th3;
                    }
                    this.f18558l = w.m9007i();
                    mo8837n();
                    throw th2;
                }
            } catch (C11713k e) {
                throw e.m8802i(this);
            } catch (IOException e2) {
                throw new C11713k(e2.getMessage()).m8802i(this);
            }
        }
        if (z2 & true) {
            this.f18561o = Collections.unmodifiableList(this.f18561o);
        }
        try {
            J.m8952I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f18558l = w.m9007i();
            throw th4;
        }
        this.f18558l = w.m9007i();
        mo8837n();
    }
}
