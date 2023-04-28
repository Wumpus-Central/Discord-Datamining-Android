package p218lh;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p159ih.C8541b;
import p159ih.C8544c;
import p159ih.C8547d;
import p159ih.C8568i;
import p159ih.C8575l;
import p159ih.C8581n;
import p159ih.C8593q;
import p159ih.C8603s;
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
import ph.C11747z;

/* renamed from: lh.a */
/* loaded from: classes8.dex */
public final class C10440a {

    /* renamed from: a */
    public static final AbstractC11702i.C11709f<C8547d, C10442c> f22975a;

    /* renamed from: b */
    public static final AbstractC11702i.C11709f<C8568i, C10442c> f22976b;

    /* renamed from: c */
    public static final AbstractC11702i.C11709f<C8568i, Integer> f22977c;

    /* renamed from: d */
    public static final AbstractC11702i.C11709f<C8581n, C10444d> f22978d;

    /* renamed from: e */
    public static final AbstractC11702i.C11709f<C8581n, Integer> f22979e;

    /* renamed from: f */
    public static final AbstractC11702i.C11709f<C8593q, List<C8541b>> f22980f;

    /* renamed from: g */
    public static final AbstractC11702i.C11709f<C8593q, Boolean> f22981g = AbstractC11702i.m8848p(C8593q.m18808Y(), Boolean.FALSE, null, null, 101, C11747z.EnumC11749b.f26234t, Boolean.class);

    /* renamed from: h */
    public static final AbstractC11702i.C11709f<C8603s, List<C8541b>> f22982h;

    /* renamed from: i */
    public static final AbstractC11702i.C11709f<C8544c, Integer> f22983i;

    /* renamed from: j */
    public static final AbstractC11702i.C11709f<C8544c, List<C8581n>> f22984j;

    /* renamed from: k */
    public static final AbstractC11702i.C11709f<C8544c, Integer> f22985k;

    /* renamed from: l */
    public static final AbstractC11702i.C11709f<C8544c, Integer> f22986l;

    /* renamed from: m */
    public static final AbstractC11702i.C11709f<C8575l, Integer> f22987m;

    /* renamed from: n */
    public static final AbstractC11702i.C11709f<C8575l, List<C8581n>> f22988n;

    /* renamed from: lh.a$e */
    /* loaded from: classes8.dex */
    public static final class C10446e extends AbstractC11702i implements AbstractC11726r {

        /* renamed from: r */
        private static final C10446e f23028r;

        /* renamed from: s */
        public static AbstractC11727s<C10446e> f23029s = new C0332a();

        /* renamed from: l */
        private final AbstractC11691d f23030l;

        /* renamed from: m */
        private List<C10448c> f23031m;

        /* renamed from: n */
        private List<Integer> f23032n;

        /* renamed from: o */
        private int f23033o;

        /* renamed from: p */
        private byte f23034p;

        /* renamed from: q */
        private int f23035q;

        /* renamed from: lh.a$e$a */
        /* loaded from: classes8.dex */
        static class C0332a extends AbstractC11687b<C10446e> {
            C0332a() {
            }

            /* renamed from: m */
            public C10446e mo8771d(C11694e eVar, C11697g gVar) {
                return new C10446e(eVar, gVar);
            }
        }

        /* renamed from: lh.a$e$b */
        /* loaded from: classes8.dex */
        public static final class C10447b extends AbstractC11702i.AbstractC11704b<C10446e, C10447b> implements AbstractC11726r {

            /* renamed from: l */
            private int f23036l;

            /* renamed from: m */
            private List<C10448c> f23037m = Collections.emptyList();

            /* renamed from: n */
            private List<Integer> f23038n = Collections.emptyList();

            private C10447b() {
                m13200y();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: v */
            public static C10447b m13203v() {
                return new C10447b();
            }

            /* renamed from: w */
            private void m13202w() {
                if ((this.f23036l & 2) != 2) {
                    this.f23038n = new ArrayList(this.f23038n);
                    this.f23036l |= 2;
                }
            }

            /* renamed from: x */
            private void m13201x() {
                if ((this.f23036l & 1) != 1) {
                    this.f23037m = new ArrayList(this.f23037m);
                    this.f23036l |= 1;
                }
            }

            /* renamed from: y */
            private void m13200y() {
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* renamed from: A */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public p218lh.C10440a.C10446e.C10447b mo9032k(ph.C11694e r3, ph.C11697g r4) {
                /*
                    r2 = this;
                    r0 = 0
                    ph.s<lh.a$e> r1 = p218lh.C10440a.C10446e.f23029s     // Catch: all -> 0x000f, k -> 0x0011
                    java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                    lh.a$e r3 = (p218lh.C10440a.C10446e) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                    lh.a$e r4 = (p218lh.C10440a.C10446e) r4     // Catch: all -> 0x000f
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
                throw new UnsupportedOperationException("Method not decompiled: p218lh.C10440a.C10446e.C10447b.mo9032k(ph.e, ph.g):lh.a$e$b");
            }

            /* renamed from: s */
            public C10446e build() {
                C10446e t = m13205t();
                if (t.mo8775j()) {
                    return t;
                }
                throw AbstractC11686a.AbstractC0372a.m9031l(t);
            }

            /* renamed from: t */
            public C10446e m13205t() {
                C10446e eVar = new C10446e(this);
                if ((this.f23036l & 1) == 1) {
                    this.f23037m = Collections.unmodifiableList(this.f23037m);
                    this.f23036l &= -2;
                }
                eVar.f23031m = this.f23037m;
                if ((this.f23036l & 2) == 2) {
                    this.f23038n = Collections.unmodifiableList(this.f23038n);
                    this.f23036l &= -3;
                }
                eVar.f23032n = this.f23038n;
                return eVar;
            }

            /* renamed from: u */
            public C10447b mo8846m() {
                return m13203v().mo8844o(m13205t());
            }

            /* renamed from: z */
            public C10447b mo8844o(C10446e eVar) {
                if (eVar == C10446e.m13212x()) {
                    return this;
                }
                if (!eVar.f23031m.isEmpty()) {
                    if (this.f23037m.isEmpty()) {
                        this.f23037m = eVar.f23031m;
                        this.f23036l &= -2;
                    } else {
                        m13201x();
                        this.f23037m.addAll(eVar.f23031m);
                    }
                }
                if (!eVar.f23032n.isEmpty()) {
                    if (this.f23038n.isEmpty()) {
                        this.f23038n = eVar.f23032n;
                        this.f23036l &= -3;
                    } else {
                        m13202w();
                        this.f23038n.addAll(eVar.f23032n);
                    }
                }
                m8843q(m8845n().m9017b(eVar.f23030l));
                return this;
            }
        }

        static {
            C10446e eVar = new C10446e(true);
            f23028r = eVar;
            eVar.m13223A();
        }

        /* renamed from: A */
        private void m13223A() {
            this.f23031m = Collections.emptyList();
            this.f23032n = Collections.emptyList();
        }

        /* renamed from: B */
        public static C10447b m13222B() {
            return C10447b.m13203v();
        }

        /* renamed from: C */
        public static C10447b m13221C(C10446e eVar) {
            return m13222B().mo8844o(eVar);
        }

        /* renamed from: E */
        public static C10446e m13219E(InputStream inputStream, C11697g gVar) {
            return f23029s.mo8774a(inputStream, gVar);
        }

        /* renamed from: x */
        public static C10446e m13212x() {
            return f23028r;
        }

        /* renamed from: D */
        public C10447b mo8779e() {
            return m13222B();
        }

        /* renamed from: F */
        public C10447b mo8782a() {
            return m13221C(this);
        }

        @Override // ph.AbstractC11724q
        /* renamed from: c */
        public int mo8781c() {
            int i = this.f23035q;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f23031m.size(); i3++) {
                i2 += C11695f.m8898s(1, this.f23031m.get(i3));
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.f23032n.size(); i5++) {
                i4 += C11695f.m8904p(this.f23032n.get(i5).intValue());
            }
            int i6 = i2 + i4;
            if (!m13211y().isEmpty()) {
                i6 = i6 + 1 + C11695f.m8904p(i4);
            }
            this.f23033o = i4;
            int size = i6 + this.f23030l.size();
            this.f23035q = size;
            return size;
        }

        @Override // ph.AbstractC11724q
        /* renamed from: d */
        public void mo8780d(C11695f fVar) {
            mo8781c();
            for (int i = 0; i < this.f23031m.size(); i++) {
                fVar.m8927d0(1, this.f23031m.get(i));
            }
            if (m13211y().size() > 0) {
                fVar.m8905o0(42);
                fVar.m8905o0(this.f23033o);
            }
            for (int i2 = 0; i2 < this.f23032n.size(); i2++) {
                fVar.m8931b0(this.f23032n.get(i2).intValue());
            }
            fVar.m8917i0(this.f23030l);
        }

        @Override // ph.AbstractC11702i, ph.AbstractC11724q
        /* renamed from: h */
        public AbstractC11727s<C10446e> mo8778h() {
            return f23029s;
        }

        @Override // ph.AbstractC11726r
        /* renamed from: j */
        public final boolean mo8775j() {
            byte b = this.f23034p;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f23034p = (byte) 1;
            return true;
        }

        /* renamed from: y */
        public List<Integer> m13211y() {
            return this.f23032n;
        }

        /* renamed from: z */
        public List<C10448c> m13210z() {
            return this.f23031m;
        }

        /* renamed from: lh.a$e$c */
        /* loaded from: classes8.dex */
        public static final class C10448c extends AbstractC11702i implements AbstractC11726r {

            /* renamed from: x */
            private static final C10448c f23039x;

            /* renamed from: y */
            public static AbstractC11727s<C10448c> f23040y = new C0333a();

            /* renamed from: l */
            private final AbstractC11691d f23041l;

            /* renamed from: m */
            private int f23042m;

            /* renamed from: n */
            private int f23043n;

            /* renamed from: o */
            private int f23044o;

            /* renamed from: p */
            private Object f23045p;

            /* renamed from: q */
            private EnumC0334c f23046q;

            /* renamed from: r */
            private List<Integer> f23047r;

            /* renamed from: s */
            private int f23048s;

            /* renamed from: t */
            private List<Integer> f23049t;

            /* renamed from: u */
            private int f23050u;

            /* renamed from: v */
            private byte f23051v;

            /* renamed from: w */
            private int f23052w;

            /* renamed from: lh.a$e$c$a */
            /* loaded from: classes8.dex */
            static class C0333a extends AbstractC11687b<C10448c> {
                C0333a() {
                }

                /* renamed from: m */
                public C10448c mo8771d(C11694e eVar, C11697g gVar) {
                    return new C10448c(eVar, gVar);
                }
            }

            /* renamed from: lh.a$e$c$b */
            /* loaded from: classes8.dex */
            public static final class C10449b extends AbstractC11702i.AbstractC11704b<C10448c, C10449b> implements AbstractC11726r {

                /* renamed from: l */
                private int f23053l;

                /* renamed from: n */
                private int f23055n;

                /* renamed from: m */
                private int f23054m = 1;

                /* renamed from: o */
                private Object f23056o = "";

                /* renamed from: p */
                private EnumC0334c f23057p = EnumC0334c.NONE;

                /* renamed from: q */
                private List<Integer> f23058q = Collections.emptyList();

                /* renamed from: r */
                private List<Integer> f23059r = Collections.emptyList();

                private C10449b() {
                    m13156y();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* renamed from: v */
                public static C10449b m13159v() {
                    return new C10449b();
                }

                /* renamed from: w */
                private void m13158w() {
                    if ((this.f23053l & 32) != 32) {
                        this.f23059r = new ArrayList(this.f23059r);
                        this.f23053l |= 32;
                    }
                }

                /* renamed from: x */
                private void m13157x() {
                    if ((this.f23053l & 16) != 16) {
                        this.f23058q = new ArrayList(this.f23058q);
                        this.f23053l |= 16;
                    }
                }

                /* renamed from: y */
                private void m13156y() {
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
                /* renamed from: A */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public p218lh.C10440a.C10446e.C10448c.C10449b mo9032k(ph.C11694e r3, ph.C11697g r4) {
                    /*
                        r2 = this;
                        r0 = 0
                        ph.s<lh.a$e$c> r1 = p218lh.C10440a.C10446e.C10448c.f23040y     // Catch: all -> 0x000f, k -> 0x0011
                        java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                        lh.a$e$c r3 = (p218lh.C10440a.C10446e.C10448c) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                        lh.a$e$c r4 = (p218lh.C10440a.C10446e.C10448c) r4     // Catch: all -> 0x000f
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
                    throw new UnsupportedOperationException("Method not decompiled: p218lh.C10440a.C10446e.C10448c.C10449b.mo9032k(ph.e, ph.g):lh.a$e$c$b");
                }

                /* renamed from: B */
                public C10449b m13166B(EnumC0334c cVar) {
                    cVar.getClass();
                    this.f23053l |= 8;
                    this.f23057p = cVar;
                    return this;
                }

                /* renamed from: C */
                public C10449b m13165C(int i) {
                    this.f23053l |= 2;
                    this.f23055n = i;
                    return this;
                }

                /* renamed from: D */
                public C10449b m13164D(int i) {
                    this.f23053l |= 1;
                    this.f23054m = i;
                    return this;
                }

                /* renamed from: s */
                public C10448c build() {
                    C10448c t = m13161t();
                    if (t.mo8775j()) {
                        return t;
                    }
                    throw AbstractC11686a.AbstractC0372a.m9031l(t);
                }

                /* renamed from: t */
                public C10448c m13161t() {
                    C10448c cVar = new C10448c(this);
                    int i = this.f23053l;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    cVar.f23043n = this.f23054m;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    cVar.f23044o = this.f23055n;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    cVar.f23045p = this.f23056o;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    cVar.f23046q = this.f23057p;
                    if ((this.f23053l & 16) == 16) {
                        this.f23058q = Collections.unmodifiableList(this.f23058q);
                        this.f23053l &= -17;
                    }
                    cVar.f23047r = this.f23058q;
                    if ((this.f23053l & 32) == 32) {
                        this.f23059r = Collections.unmodifiableList(this.f23059r);
                        this.f23053l &= -33;
                    }
                    cVar.f23049t = this.f23059r;
                    cVar.f23042m = i2;
                    return cVar;
                }

                /* renamed from: u */
                public C10449b mo8846m() {
                    return m13159v().mo8844o(m13161t());
                }

                /* renamed from: z */
                public C10449b mo8844o(C10448c cVar) {
                    if (cVar == C10448c.m13195D()) {
                        return this;
                    }
                    if (cVar.m13183P()) {
                        m13164D(cVar.m13192G());
                    }
                    if (cVar.m13184O()) {
                        m13165C(cVar.m13193F());
                    }
                    if (cVar.m13182Q()) {
                        this.f23053l |= 4;
                        this.f23056o = cVar.f23045p;
                    }
                    if (cVar.m13185N()) {
                        m13166B(cVar.m13194E());
                    }
                    if (!cVar.f23047r.isEmpty()) {
                        if (this.f23058q.isEmpty()) {
                            this.f23058q = cVar.f23047r;
                            this.f23053l &= -17;
                        } else {
                            m13157x();
                            this.f23058q.addAll(cVar.f23047r);
                        }
                    }
                    if (!cVar.f23049t.isEmpty()) {
                        if (this.f23059r.isEmpty()) {
                            this.f23059r = cVar.f23049t;
                            this.f23053l &= -33;
                        } else {
                            m13158w();
                            this.f23059r.addAll(cVar.f23049t);
                        }
                    }
                    m8843q(m8845n().m9017b(cVar.f23041l));
                    return this;
                }
            }

            /* renamed from: lh.a$e$c$c */
            /* loaded from: classes8.dex */
            public enum EnumC0334c implements C11710j.AbstractC11711a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);
                

                /* renamed from: o */
                private static C11710j.AbstractC11712b<EnumC0334c> f23063o = new C0335a();

                /* renamed from: k */
                private final int f23065k;

                /* renamed from: lh.a$e$c$c$a */
                /* loaded from: classes8.dex */
                static class C0335a implements C11710j.AbstractC11712b<EnumC0334c> {
                    C0335a() {
                    }

                    /* renamed from: b */
                    public EnumC0334c mo8811a(int i) {
                        return EnumC0334c.m13154a(i);
                    }
                }

                EnumC0334c(int i, int i2) {
                    this.f23065k = i2;
                }

                /* renamed from: a */
                public static EnumC0334c m13154a(int i) {
                    if (i == 0) {
                        return NONE;
                    }
                    if (i == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }

                @Override // ph.C11710j.AbstractC11711a
                public final int getNumber() {
                    return this.f23065k;
                }
            }

            static {
                C10448c cVar = new C10448c(true);
                f23039x = cVar;
                cVar.m13181R();
            }

            /* renamed from: D */
            public static C10448c m13195D() {
                return f23039x;
            }

            /* renamed from: R */
            private void m13181R() {
                this.f23043n = 1;
                this.f23044o = 0;
                this.f23045p = "";
                this.f23046q = EnumC0334c.NONE;
                this.f23047r = Collections.emptyList();
                this.f23049t = Collections.emptyList();
            }

            /* renamed from: S */
            public static C10449b m13180S() {
                return C10449b.m13159v();
            }

            /* renamed from: T */
            public static C10449b m13179T(C10448c cVar) {
                return m13180S().mo8844o(cVar);
            }

            /* renamed from: E */
            public EnumC0334c m13194E() {
                return this.f23046q;
            }

            /* renamed from: F */
            public int m13193F() {
                return this.f23044o;
            }

            /* renamed from: G */
            public int m13192G() {
                return this.f23043n;
            }

            /* renamed from: H */
            public int m13191H() {
                return this.f23049t.size();
            }

            /* renamed from: I */
            public List<Integer> m13190I() {
                return this.f23049t;
            }

            /* renamed from: J */
            public String m13189J() {
                Object obj = this.f23045p;
                if (obj instanceof String) {
                    return (String) obj;
                }
                AbstractC11691d dVar = (AbstractC11691d) obj;
                String C = dVar.m9020C();
                if (dVar.mo8759t()) {
                    this.f23045p = C;
                }
                return C;
            }

            /* renamed from: K */
            public AbstractC11691d m13188K() {
                Object obj = this.f23045p;
                if (!(obj instanceof String)) {
                    return (AbstractC11691d) obj;
                }
                AbstractC11691d i = AbstractC11691d.m9013i((String) obj);
                this.f23045p = i;
                return i;
            }

            /* renamed from: L */
            public int m13187L() {
                return this.f23047r.size();
            }

            /* renamed from: M */
            public List<Integer> m13186M() {
                return this.f23047r;
            }

            /* renamed from: N */
            public boolean m13185N() {
                return (this.f23042m & 8) == 8;
            }

            /* renamed from: O */
            public boolean m13184O() {
                return (this.f23042m & 2) == 2;
            }

            /* renamed from: P */
            public boolean m13183P() {
                return (this.f23042m & 1) == 1;
            }

            /* renamed from: Q */
            public boolean m13182Q() {
                return (this.f23042m & 4) == 4;
            }

            /* renamed from: U */
            public C10449b mo8779e() {
                return m13180S();
            }

            /* renamed from: V */
            public C10449b mo8782a() {
                return m13179T(this);
            }

            @Override // ph.AbstractC11724q
            /* renamed from: c */
            public int mo8781c() {
                int i;
                int i2 = this.f23052w;
                if (i2 != -1) {
                    return i2;
                }
                if ((this.f23042m & 1) == 1) {
                    i = C11695f.m8906o(1, this.f23043n) + 0;
                } else {
                    i = 0;
                }
                if ((this.f23042m & 2) == 2) {
                    i += C11695f.m8906o(2, this.f23044o);
                }
                if ((this.f23042m & 8) == 8) {
                    i += C11695f.m8920h(3, this.f23046q.getNumber());
                }
                int i3 = 0;
                for (int i4 = 0; i4 < this.f23047r.size(); i4++) {
                    i3 += C11695f.m8904p(this.f23047r.get(i4).intValue());
                }
                int i5 = i + i3;
                if (!m13186M().isEmpty()) {
                    i5 = i5 + 1 + C11695f.m8904p(i3);
                }
                this.f23048s = i3;
                int i6 = 0;
                for (int i7 = 0; i7 < this.f23049t.size(); i7++) {
                    i6 += C11695f.m8904p(this.f23049t.get(i7).intValue());
                }
                int i8 = i5 + i6;
                if (!m13190I().isEmpty()) {
                    i8 = i8 + 1 + C11695f.m8904p(i6);
                }
                this.f23050u = i6;
                if ((this.f23042m & 4) == 4) {
                    i8 += C11695f.m8928d(6, m13188K());
                }
                int size = i8 + this.f23041l.size();
                this.f23052w = size;
                return size;
            }

            @Override // ph.AbstractC11724q
            /* renamed from: d */
            public void mo8780d(C11695f fVar) {
                mo8781c();
                if ((this.f23042m & 1) == 1) {
                    fVar.m8933a0(1, this.f23043n);
                }
                if ((this.f23042m & 2) == 2) {
                    fVar.m8933a0(2, this.f23044o);
                }
                if ((this.f23042m & 8) == 8) {
                    fVar.m8942S(3, this.f23046q.getNumber());
                }
                if (m13186M().size() > 0) {
                    fVar.m8905o0(34);
                    fVar.m8905o0(this.f23048s);
                }
                for (int i = 0; i < this.f23047r.size(); i++) {
                    fVar.m8931b0(this.f23047r.get(i).intValue());
                }
                if (m13190I().size() > 0) {
                    fVar.m8905o0(42);
                    fVar.m8905o0(this.f23050u);
                }
                for (int i2 = 0; i2 < this.f23049t.size(); i2++) {
                    fVar.m8931b0(this.f23049t.get(i2).intValue());
                }
                if ((this.f23042m & 4) == 4) {
                    fVar.m8946O(6, m13188K());
                }
                fVar.m8917i0(this.f23041l);
            }

            @Override // ph.AbstractC11702i, ph.AbstractC11724q
            /* renamed from: h */
            public AbstractC11727s<C10448c> mo8778h() {
                return f23040y;
            }

            @Override // ph.AbstractC11726r
            /* renamed from: j */
            public final boolean mo8775j() {
                byte b = this.f23051v;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.f23051v = (byte) 1;
                return true;
            }

            private C10448c(AbstractC11702i.AbstractC11704b bVar) {
                super(bVar);
                this.f23048s = -1;
                this.f23050u = -1;
                this.f23051v = (byte) -1;
                this.f23052w = -1;
                this.f23041l = bVar.m8845n();
            }

            private C10448c(boolean z) {
                this.f23048s = -1;
                this.f23050u = -1;
                this.f23051v = (byte) -1;
                this.f23052w = -1;
                this.f23041l = AbstractC11691d.f26108k;
            }

            private C10448c(C11694e eVar, C11697g gVar) {
                this.f23048s = -1;
                this.f23050u = -1;
                this.f23051v = (byte) -1;
                this.f23052w = -1;
                m13181R();
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
                                    this.f23042m |= 1;
                                    this.f23043n = eVar.m8968s();
                                } else if (K == 16) {
                                    this.f23042m |= 2;
                                    this.f23044o = eVar.m8968s();
                                } else if (K == 24) {
                                    int n = eVar.m8973n();
                                    EnumC0334c a = EnumC0334c.m13154a(n);
                                    if (a == null) {
                                        J.m8905o0(K);
                                        J.m8905o0(n);
                                    } else {
                                        this.f23042m |= 8;
                                        this.f23046q = a;
                                    }
                                } else if (K == 32) {
                                    if (!(z2 & true)) {
                                        this.f23047r = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.f23047r.add(Integer.valueOf(eVar.m8968s()));
                                } else if (K == 34) {
                                    int j = eVar.m8977j(eVar.m9006A());
                                    if (!(z2 & true) && eVar.m8982e() > 0) {
                                        this.f23047r = new ArrayList();
                                        z2 |= true;
                                    }
                                    while (eVar.m8982e() > 0) {
                                        this.f23047r.add(Integer.valueOf(eVar.m8968s()));
                                    }
                                    eVar.m8978i(j);
                                } else if (K == 40) {
                                    if (!(z2 & true)) {
                                        this.f23049t = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.f23049t.add(Integer.valueOf(eVar.m8968s()));
                                } else if (K == 42) {
                                    int j2 = eVar.m8977j(eVar.m9006A());
                                    if (!(z2 & true) && eVar.m8982e() > 0) {
                                        this.f23049t = new ArrayList();
                                        z2 |= true;
                                    }
                                    while (eVar.m8982e() > 0) {
                                        this.f23049t.add(Integer.valueOf(eVar.m8968s()));
                                    }
                                    eVar.m8978i(j2);
                                } else if (K == 50) {
                                    AbstractC11691d l = eVar.m8975l();
                                    this.f23042m |= 4;
                                    this.f23045p = l;
                                } else if (!mo8836q(eVar, J, gVar, K)) {
                                }
                            }
                            z = true;
                        } catch (Throwable th2) {
                            if (z2 & true) {
                                this.f23047r = Collections.unmodifiableList(this.f23047r);
                            }
                            if (z2 & true) {
                                this.f23049t = Collections.unmodifiableList(this.f23049t);
                            }
                            try {
                                J.m8952I();
                            } catch (IOException unused) {
                            } catch (Throwable th3) {
                                this.f23041l = w.m9007i();
                                throw th3;
                            }
                            this.f23041l = w.m9007i();
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
                    this.f23047r = Collections.unmodifiableList(this.f23047r);
                }
                if (z2 & true) {
                    this.f23049t = Collections.unmodifiableList(this.f23049t);
                }
                try {
                    J.m8952I();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f23041l = w.m9007i();
                    throw th4;
                }
                this.f23041l = w.m9007i();
                mo8837n();
            }
        }

        private C10446e(AbstractC11702i.AbstractC11704b bVar) {
            super(bVar);
            this.f23033o = -1;
            this.f23034p = (byte) -1;
            this.f23035q = -1;
            this.f23030l = bVar.m8845n();
        }

        private C10446e(boolean z) {
            this.f23033o = -1;
            this.f23034p = (byte) -1;
            this.f23035q = -1;
            this.f23030l = AbstractC11691d.f26108k;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private C10446e(C11694e eVar, C11697g gVar) {
            this.f23033o = -1;
            this.f23034p = (byte) -1;
            this.f23035q = -1;
            m13223A();
            AbstractC11691d.C11693b w = AbstractC11691d.m9011w();
            C11695f J = C11695f.m8951J(w, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int K = eVar.m8996K();
                        if (K != 0) {
                            if (K == 10) {
                                if (!z2 || !true) {
                                    this.f23031m = new ArrayList();
                                    z2 |= true;
                                }
                                this.f23031m.add(eVar.m8966u(C10448c.f23040y, gVar));
                            } else if (K == 40) {
                                if (!(z2 & true)) {
                                    this.f23032n = new ArrayList();
                                    z2 |= true;
                                }
                                this.f23032n.add(Integer.valueOf(eVar.m8968s()));
                            } else if (K == 42) {
                                int j = eVar.m8977j(eVar.m9006A());
                                if (!(z2 & true) && eVar.m8982e() > 0) {
                                    this.f23032n = new ArrayList();
                                    z2 |= true;
                                }
                                while (eVar.m8982e() > 0) {
                                    this.f23032n.add(Integer.valueOf(eVar.m8968s()));
                                }
                                eVar.m8978i(j);
                            } else if (!mo8836q(eVar, J, gVar, K)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th2) {
                        if (z2 && true) {
                            this.f23031m = Collections.unmodifiableList(this.f23031m);
                        }
                        if (z2 & true) {
                            this.f23032n = Collections.unmodifiableList(this.f23032n);
                        }
                        try {
                            J.m8952I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f23030l = w.m9007i();
                            throw th3;
                        }
                        this.f23030l = w.m9007i();
                        mo8837n();
                        throw th2;
                    }
                } catch (C11713k e) {
                    throw e.m8802i(this);
                } catch (IOException e2) {
                    throw new C11713k(e2.getMessage()).m8802i(this);
                }
            }
            if (z2 && true) {
                this.f23031m = Collections.unmodifiableList(this.f23031m);
            }
            if (z2 & true) {
                this.f23032n = Collections.unmodifiableList(this.f23032n);
            }
            try {
                J.m8952I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f23030l = w.m9007i();
                throw th4;
            }
            this.f23030l = w.m9007i();
            mo8837n();
        }
    }

    static {
        C8547d I = C8547d.m19306I();
        C10442c w = C10442c.m13275w();
        C10442c w2 = C10442c.m13275w();
        C11747z.EnumC11749b bVar = C11747z.EnumC11749b.f26237w;
        f22975a = AbstractC11702i.m8848p(I, w, w2, null, 100, bVar, C10442c.class);
        f22976b = AbstractC11702i.m8848p(C8568i.m19118b0(), C10442c.m13275w(), C10442c.m13275w(), null, 100, bVar, C10442c.class);
        C8568i b0 = C8568i.m19118b0();
        C11747z.EnumC11749b bVar2 = C11747z.EnumC11749b.f26231q;
        f22977c = AbstractC11702i.m8848p(b0, 0, null, null, 101, bVar2, Integer.class);
        f22978d = AbstractC11702i.m8848p(C8581n.m18956Z(), C10444d.m13238z(), C10444d.m13238z(), null, 100, bVar, C10444d.class);
        f22979e = AbstractC11702i.m8848p(C8581n.m18956Z(), 0, null, null, 101, bVar2, Integer.class);
        f22980f = AbstractC11702i.m8849o(C8593q.m18808Y(), C8541b.m19567A(), null, 100, bVar, false, C8541b.class);
        f22982h = AbstractC11702i.m8849o(C8603s.m18657L(), C8541b.m19567A(), null, 100, bVar, false, C8541b.class);
        f22983i = AbstractC11702i.m8848p(C8544c.m19349z0(), 0, null, null, 101, bVar2, Integer.class);
        f22984j = AbstractC11702i.m8849o(C8544c.m19349z0(), C8581n.m18956Z(), null, 102, bVar, false, C8581n.class);
        f22985k = AbstractC11702i.m8848p(C8544c.m19349z0(), 0, null, null, 103, bVar2, Integer.class);
        f22986l = AbstractC11702i.m8848p(C8544c.m19349z0(), 0, null, null, 104, bVar2, Integer.class);
        f22987m = AbstractC11702i.m8848p(C8575l.m19056L(), 0, null, null, 101, bVar2, Integer.class);
        f22988n = AbstractC11702i.m8849o(C8575l.m19056L(), C8581n.m18956Z(), null, 102, bVar, false, C8581n.class);
    }

    /* renamed from: a */
    public static void m13311a(C11697g gVar) {
        gVar.m8882a(f22975a);
        gVar.m8882a(f22976b);
        gVar.m8882a(f22977c);
        gVar.m8882a(f22978d);
        gVar.m8882a(f22979e);
        gVar.m8882a(f22980f);
        gVar.m8882a(f22981g);
        gVar.m8882a(f22982h);
        gVar.m8882a(f22983i);
        gVar.m8882a(f22984j);
        gVar.m8882a(f22985k);
        gVar.m8882a(f22986l);
        gVar.m8882a(f22987m);
        gVar.m8882a(f22988n);
    }

    /* renamed from: lh.a$b */
    /* loaded from: classes8.dex */
    public static final class C10441b extends AbstractC11702i implements AbstractC11726r {

        /* renamed from: r */
        private static final C10441b f22989r;

        /* renamed from: s */
        public static AbstractC11727s<C10441b> f22990s = new C0328a();

        /* renamed from: l */
        private final AbstractC11691d f22991l;

        /* renamed from: m */
        private int f22992m;

        /* renamed from: n */
        private int f22993n;

        /* renamed from: o */
        private int f22994o;

        /* renamed from: p */
        private byte f22995p;

        /* renamed from: q */
        private int f22996q;

        /* renamed from: lh.a$b$a */
        /* loaded from: classes8.dex */
        static class C0328a extends AbstractC11687b<C10441b> {
            C0328a() {
            }

            /* renamed from: m */
            public C10441b mo8771d(C11694e eVar, C11697g gVar) {
                return new C10441b(eVar, gVar);
            }
        }

        /* renamed from: lh.a$b$b */
        /* loaded from: classes8.dex */
        public static final class C0329b extends AbstractC11702i.AbstractC11704b<C10441b, C0329b> implements AbstractC11726r {

            /* renamed from: l */
            private int f22997l;

            /* renamed from: m */
            private int f22998m;

            /* renamed from: n */
            private int f22999n;

            private C0329b() {
                m13289w();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: v */
            public static C0329b m13290v() {
                return new C0329b();
            }

            /* renamed from: w */
            private void m13289w() {
            }

            /* renamed from: A */
            public C0329b m13295A(int i) {
                this.f22997l |= 1;
                this.f22998m = i;
                return this;
            }

            /* renamed from: s */
            public C10441b build() {
                C10441b t = m13292t();
                if (t.mo8775j()) {
                    return t;
                }
                throw AbstractC11686a.AbstractC0372a.m9031l(t);
            }

            /* renamed from: t */
            public C10441b m13292t() {
                C10441b bVar = new C10441b(this);
                int i = this.f22997l;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                bVar.f22993n = this.f22998m;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                bVar.f22994o = this.f22999n;
                bVar.f22992m = i2;
                return bVar;
            }

            /* renamed from: u */
            public C0329b mo8846m() {
                return m13290v().mo8844o(m13292t());
            }

            /* renamed from: x */
            public C0329b mo8844o(C10441b bVar) {
                if (bVar == C10441b.m13300w()) {
                    return this;
                }
                if (bVar.m13310A()) {
                    m13295A(bVar.m13298y());
                }
                if (bVar.m13297z()) {
                    m13286z(bVar.m13299x());
                }
                m8843q(m8845n().m9017b(bVar.f22991l));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* renamed from: y */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public p218lh.C10440a.C10441b.C0329b mo9032k(ph.C11694e r3, ph.C11697g r4) {
                /*
                    r2 = this;
                    r0 = 0
                    ph.s<lh.a$b> r1 = p218lh.C10440a.C10441b.f22990s     // Catch: all -> 0x000f, k -> 0x0011
                    java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                    lh.a$b r3 = (p218lh.C10440a.C10441b) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                    lh.a$b r4 = (p218lh.C10440a.C10441b) r4     // Catch: all -> 0x000f
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
                throw new UnsupportedOperationException("Method not decompiled: p218lh.C10440a.C10441b.C0329b.mo9032k(ph.e, ph.g):lh.a$b$b");
            }

            /* renamed from: z */
            public C0329b m13286z(int i) {
                this.f22997l |= 2;
                this.f22999n = i;
                return this;
            }
        }

        static {
            C10441b bVar = new C10441b(true);
            f22989r = bVar;
            bVar.m13309B();
        }

        /* renamed from: B */
        private void m13309B() {
            this.f22993n = 0;
            this.f22994o = 0;
        }

        /* renamed from: C */
        public static C0329b m13308C() {
            return C0329b.m13290v();
        }

        /* renamed from: D */
        public static C0329b m13307D(C10441b bVar) {
            return m13308C().mo8844o(bVar);
        }

        /* renamed from: w */
        public static C10441b m13300w() {
            return f22989r;
        }

        /* renamed from: A */
        public boolean m13310A() {
            return (this.f22992m & 1) == 1;
        }

        /* renamed from: E */
        public C0329b mo8779e() {
            return m13308C();
        }

        /* renamed from: F */
        public C0329b mo8782a() {
            return m13307D(this);
        }

        @Override // ph.AbstractC11724q
        /* renamed from: c */
        public int mo8781c() {
            int i = this.f22996q;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f22992m & 1) == 1) {
                i2 = 0 + C11695f.m8906o(1, this.f22993n);
            }
            if ((this.f22992m & 2) == 2) {
                i2 += C11695f.m8906o(2, this.f22994o);
            }
            int size = i2 + this.f22991l.size();
            this.f22996q = size;
            return size;
        }

        @Override // ph.AbstractC11724q
        /* renamed from: d */
        public void mo8780d(C11695f fVar) {
            mo8781c();
            if ((this.f22992m & 1) == 1) {
                fVar.m8933a0(1, this.f22993n);
            }
            if ((this.f22992m & 2) == 2) {
                fVar.m8933a0(2, this.f22994o);
            }
            fVar.m8917i0(this.f22991l);
        }

        @Override // ph.AbstractC11702i, ph.AbstractC11724q
        /* renamed from: h */
        public AbstractC11727s<C10441b> mo8778h() {
            return f22990s;
        }

        @Override // ph.AbstractC11726r
        /* renamed from: j */
        public final boolean mo8775j() {
            byte b = this.f22995p;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f22995p = (byte) 1;
            return true;
        }

        /* renamed from: x */
        public int m13299x() {
            return this.f22994o;
        }

        /* renamed from: y */
        public int m13298y() {
            return this.f22993n;
        }

        /* renamed from: z */
        public boolean m13297z() {
            return (this.f22992m & 2) == 2;
        }

        private C10441b(AbstractC11702i.AbstractC11704b bVar) {
            super(bVar);
            this.f22995p = (byte) -1;
            this.f22996q = -1;
            this.f22991l = bVar.m8845n();
        }

        private C10441b(boolean z) {
            this.f22995p = (byte) -1;
            this.f22996q = -1;
            this.f22991l = AbstractC11691d.f26108k;
        }

        private C10441b(C11694e eVar, C11697g gVar) {
            this.f22995p = (byte) -1;
            this.f22996q = -1;
            m13309B();
            AbstractC11691d.C11693b w = AbstractC11691d.m9011w();
            C11695f J = C11695f.m8951J(w, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int K = eVar.m8996K();
                        if (K != 0) {
                            if (K == 8) {
                                this.f22992m |= 1;
                                this.f22993n = eVar.m8968s();
                            } else if (K == 16) {
                                this.f22992m |= 2;
                                this.f22994o = eVar.m8968s();
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
                        this.f22991l = w.m9007i();
                        throw th3;
                    }
                    this.f22991l = w.m9007i();
                    mo8837n();
                    throw th2;
                }
            }
            try {
                J.m8952I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f22991l = w.m9007i();
                throw th4;
            }
            this.f22991l = w.m9007i();
            mo8837n();
        }
    }

    /* renamed from: lh.a$c */
    /* loaded from: classes8.dex */
    public static final class C10442c extends AbstractC11702i implements AbstractC11726r {

        /* renamed from: r */
        private static final C10442c f23000r;

        /* renamed from: s */
        public static AbstractC11727s<C10442c> f23001s = new C0330a();

        /* renamed from: l */
        private final AbstractC11691d f23002l;

        /* renamed from: m */
        private int f23003m;

        /* renamed from: n */
        private int f23004n;

        /* renamed from: o */
        private int f23005o;

        /* renamed from: p */
        private byte f23006p;

        /* renamed from: q */
        private int f23007q;

        /* renamed from: lh.a$c$a */
        /* loaded from: classes8.dex */
        static class C0330a extends AbstractC11687b<C10442c> {
            C0330a() {
            }

            /* renamed from: m */
            public C10442c mo8771d(C11694e eVar, C11697g gVar) {
                return new C10442c(eVar, gVar);
            }
        }

        /* renamed from: lh.a$c$b */
        /* loaded from: classes8.dex */
        public static final class C10443b extends AbstractC11702i.AbstractC11704b<C10442c, C10443b> implements AbstractC11726r {

            /* renamed from: l */
            private int f23008l;

            /* renamed from: m */
            private int f23009m;

            /* renamed from: n */
            private int f23010n;

            private C10443b() {
                m13264w();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: v */
            public static C10443b m13265v() {
                return new C10443b();
            }

            /* renamed from: w */
            private void m13264w() {
            }

            /* renamed from: A */
            public C10443b m13270A(int i) {
                this.f23008l |= 1;
                this.f23009m = i;
                return this;
            }

            /* renamed from: s */
            public C10442c build() {
                C10442c t = m13267t();
                if (t.mo8775j()) {
                    return t;
                }
                throw AbstractC11686a.AbstractC0372a.m9031l(t);
            }

            /* renamed from: t */
            public C10442c m13267t() {
                C10442c cVar = new C10442c(this);
                int i = this.f23008l;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                cVar.f23004n = this.f23009m;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                cVar.f23005o = this.f23010n;
                cVar.f23003m = i2;
                return cVar;
            }

            /* renamed from: u */
            public C10443b mo8846m() {
                return m13265v().mo8844o(m13267t());
            }

            /* renamed from: x */
            public C10443b mo8844o(C10442c cVar) {
                if (cVar == C10442c.m13275w()) {
                    return this;
                }
                if (cVar.m13285A()) {
                    m13270A(cVar.m13273y());
                }
                if (cVar.m13272z()) {
                    m13261z(cVar.m13274x());
                }
                m8843q(m8845n().m9017b(cVar.f23002l));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* renamed from: y */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public p218lh.C10440a.C10442c.C10443b mo9032k(ph.C11694e r3, ph.C11697g r4) {
                /*
                    r2 = this;
                    r0 = 0
                    ph.s<lh.a$c> r1 = p218lh.C10440a.C10442c.f23001s     // Catch: all -> 0x000f, k -> 0x0011
                    java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                    lh.a$c r3 = (p218lh.C10440a.C10442c) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                    lh.a$c r4 = (p218lh.C10440a.C10442c) r4     // Catch: all -> 0x000f
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
                throw new UnsupportedOperationException("Method not decompiled: p218lh.C10440a.C10442c.C10443b.mo9032k(ph.e, ph.g):lh.a$c$b");
            }

            /* renamed from: z */
            public C10443b m13261z(int i) {
                this.f23008l |= 2;
                this.f23010n = i;
                return this;
            }
        }

        static {
            C10442c cVar = new C10442c(true);
            f23000r = cVar;
            cVar.m13284B();
        }

        /* renamed from: B */
        private void m13284B() {
            this.f23004n = 0;
            this.f23005o = 0;
        }

        /* renamed from: C */
        public static C10443b m13283C() {
            return C10443b.m13265v();
        }

        /* renamed from: D */
        public static C10443b m13282D(C10442c cVar) {
            return m13283C().mo8844o(cVar);
        }

        /* renamed from: w */
        public static C10442c m13275w() {
            return f23000r;
        }

        /* renamed from: A */
        public boolean m13285A() {
            return (this.f23003m & 1) == 1;
        }

        /* renamed from: E */
        public C10443b mo8779e() {
            return m13283C();
        }

        /* renamed from: F */
        public C10443b mo8782a() {
            return m13282D(this);
        }

        @Override // ph.AbstractC11724q
        /* renamed from: c */
        public int mo8781c() {
            int i = this.f23007q;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f23003m & 1) == 1) {
                i2 = 0 + C11695f.m8906o(1, this.f23004n);
            }
            if ((this.f23003m & 2) == 2) {
                i2 += C11695f.m8906o(2, this.f23005o);
            }
            int size = i2 + this.f23002l.size();
            this.f23007q = size;
            return size;
        }

        @Override // ph.AbstractC11724q
        /* renamed from: d */
        public void mo8780d(C11695f fVar) {
            mo8781c();
            if ((this.f23003m & 1) == 1) {
                fVar.m8933a0(1, this.f23004n);
            }
            if ((this.f23003m & 2) == 2) {
                fVar.m8933a0(2, this.f23005o);
            }
            fVar.m8917i0(this.f23002l);
        }

        @Override // ph.AbstractC11702i, ph.AbstractC11724q
        /* renamed from: h */
        public AbstractC11727s<C10442c> mo8778h() {
            return f23001s;
        }

        @Override // ph.AbstractC11726r
        /* renamed from: j */
        public final boolean mo8775j() {
            byte b = this.f23006p;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f23006p = (byte) 1;
            return true;
        }

        /* renamed from: x */
        public int m13274x() {
            return this.f23005o;
        }

        /* renamed from: y */
        public int m13273y() {
            return this.f23004n;
        }

        /* renamed from: z */
        public boolean m13272z() {
            return (this.f23003m & 2) == 2;
        }

        private C10442c(AbstractC11702i.AbstractC11704b bVar) {
            super(bVar);
            this.f23006p = (byte) -1;
            this.f23007q = -1;
            this.f23002l = bVar.m8845n();
        }

        private C10442c(boolean z) {
            this.f23006p = (byte) -1;
            this.f23007q = -1;
            this.f23002l = AbstractC11691d.f26108k;
        }

        private C10442c(C11694e eVar, C11697g gVar) {
            this.f23006p = (byte) -1;
            this.f23007q = -1;
            m13284B();
            AbstractC11691d.C11693b w = AbstractC11691d.m9011w();
            C11695f J = C11695f.m8951J(w, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int K = eVar.m8996K();
                        if (K != 0) {
                            if (K == 8) {
                                this.f23003m |= 1;
                                this.f23004n = eVar.m8968s();
                            } else if (K == 16) {
                                this.f23003m |= 2;
                                this.f23005o = eVar.m8968s();
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
                        this.f23002l = w.m9007i();
                        throw th3;
                    }
                    this.f23002l = w.m9007i();
                    mo8837n();
                    throw th2;
                }
            }
            try {
                J.m8952I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f23002l = w.m9007i();
                throw th4;
            }
            this.f23002l = w.m9007i();
            mo8837n();
        }
    }

    /* renamed from: lh.a$d */
    /* loaded from: classes8.dex */
    public static final class C10444d extends AbstractC11702i implements AbstractC11726r {

        /* renamed from: u */
        private static final C10444d f23011u;

        /* renamed from: v */
        public static AbstractC11727s<C10444d> f23012v = new C0331a();

        /* renamed from: l */
        private final AbstractC11691d f23013l;

        /* renamed from: m */
        private int f23014m;

        /* renamed from: n */
        private C10441b f23015n;

        /* renamed from: o */
        private C10442c f23016o;

        /* renamed from: p */
        private C10442c f23017p;

        /* renamed from: q */
        private C10442c f23018q;

        /* renamed from: r */
        private C10442c f23019r;

        /* renamed from: s */
        private byte f23020s;

        /* renamed from: t */
        private int f23021t;

        /* renamed from: lh.a$d$a */
        /* loaded from: classes8.dex */
        static class C0331a extends AbstractC11687b<C10444d> {
            C0331a() {
            }

            /* renamed from: m */
            public C10444d mo8771d(C11694e eVar, C11697g gVar) {
                return new C10444d(eVar, gVar);
            }
        }

        /* renamed from: lh.a$d$b */
        /* loaded from: classes8.dex */
        public static final class C10445b extends AbstractC11702i.AbstractC11704b<C10444d, C10445b> implements AbstractC11726r {

            /* renamed from: l */
            private int f23022l;

            /* renamed from: m */
            private C10441b f23023m = C10441b.m13300w();

            /* renamed from: n */
            private C10442c f23024n = C10442c.m13275w();

            /* renamed from: o */
            private C10442c f23025o = C10442c.m13275w();

            /* renamed from: p */
            private C10442c f23026p = C10442c.m13275w();

            /* renamed from: q */
            private C10442c f23027q = C10442c.m13275w();

            private C10445b() {
                m13227w();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: v */
            public static C10445b m13228v() {
                return new C10445b();
            }

            /* renamed from: w */
            private void m13227w() {
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* renamed from: A */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public p218lh.C10440a.C10444d.C10445b mo9032k(ph.C11694e r3, ph.C11697g r4) {
                /*
                    r2 = this;
                    r0 = 0
                    ph.s<lh.a$d> r1 = p218lh.C10440a.C10444d.f23012v     // Catch: all -> 0x000f, k -> 0x0011
                    java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                    lh.a$d r3 = (p218lh.C10440a.C10444d) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                    lh.a$d r4 = (p218lh.C10440a.C10444d) r4     // Catch: all -> 0x000f
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
                throw new UnsupportedOperationException("Method not decompiled: p218lh.C10440a.C10444d.C10445b.mo9032k(ph.e, ph.g):lh.a$d$b");
            }

            /* renamed from: B */
            public C10445b m13235B(C10442c cVar) {
                if ((this.f23022l & 4) != 4 || this.f23025o == C10442c.m13275w()) {
                    this.f23025o = cVar;
                } else {
                    this.f23025o = C10442c.m13282D(this.f23025o).mo8844o(cVar).m13267t();
                }
                this.f23022l |= 4;
                return this;
            }

            /* renamed from: C */
            public C10445b m13234C(C10442c cVar) {
                if ((this.f23022l & 8) != 8 || this.f23026p == C10442c.m13275w()) {
                    this.f23026p = cVar;
                } else {
                    this.f23026p = C10442c.m13282D(this.f23026p).mo8844o(cVar).m13267t();
                }
                this.f23022l |= 8;
                return this;
            }

            /* renamed from: D */
            public C10445b m13233D(C10442c cVar) {
                if ((this.f23022l & 2) != 2 || this.f23024n == C10442c.m13275w()) {
                    this.f23024n = cVar;
                } else {
                    this.f23024n = C10442c.m13282D(this.f23024n).mo8844o(cVar).m13267t();
                }
                this.f23022l |= 2;
                return this;
            }

            /* renamed from: s */
            public C10444d build() {
                C10444d t = m13230t();
                if (t.mo8775j()) {
                    return t;
                }
                throw AbstractC11686a.AbstractC0372a.m9031l(t);
            }

            /* renamed from: t */
            public C10444d m13230t() {
                C10444d dVar = new C10444d(this);
                int i = this.f23022l;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                dVar.f23015n = this.f23023m;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                dVar.f23016o = this.f23024n;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                dVar.f23017p = this.f23025o;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                dVar.f23018q = this.f23026p;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                dVar.f23019r = this.f23027q;
                dVar.f23014m = i2;
                return dVar;
            }

            /* renamed from: u */
            public C10445b mo8846m() {
                return m13228v().mo8844o(m13230t());
            }

            /* renamed from: x */
            public C10445b m13226x(C10442c cVar) {
                if ((this.f23022l & 16) != 16 || this.f23027q == C10442c.m13275w()) {
                    this.f23027q = cVar;
                } else {
                    this.f23027q = C10442c.m13282D(this.f23027q).mo8844o(cVar).m13267t();
                }
                this.f23022l |= 16;
                return this;
            }

            /* renamed from: y */
            public C10445b m13225y(C10441b bVar) {
                if ((this.f23022l & 1) != 1 || this.f23023m == C10441b.m13300w()) {
                    this.f23023m = bVar;
                } else {
                    this.f23023m = C10441b.m13307D(this.f23023m).mo8844o(bVar).m13292t();
                }
                this.f23022l |= 1;
                return this;
            }

            /* renamed from: z */
            public C10445b mo8844o(C10444d dVar) {
                if (dVar == C10444d.m13238z()) {
                    return this;
                }
                if (dVar.m13254G()) {
                    m13225y(dVar.m13259B());
                }
                if (dVar.m13251J()) {
                    m13233D(dVar.m13256E());
                }
                if (dVar.m13253H()) {
                    m13235B(dVar.m13258C());
                }
                if (dVar.m13252I()) {
                    m13234C(dVar.m13257D());
                }
                if (dVar.m13255F()) {
                    m13226x(dVar.m13260A());
                }
                m8843q(m8845n().m9017b(dVar.f23013l));
                return this;
            }
        }

        static {
            C10444d dVar = new C10444d(true);
            f23011u = dVar;
            dVar.m13250K();
        }

        /* renamed from: K */
        private void m13250K() {
            this.f23015n = C10441b.m13300w();
            this.f23016o = C10442c.m13275w();
            this.f23017p = C10442c.m13275w();
            this.f23018q = C10442c.m13275w();
            this.f23019r = C10442c.m13275w();
        }

        /* renamed from: L */
        public static C10445b m13249L() {
            return C10445b.m13228v();
        }

        /* renamed from: M */
        public static C10445b m13248M(C10444d dVar) {
            return m13249L().mo8844o(dVar);
        }

        /* renamed from: z */
        public static C10444d m13238z() {
            return f23011u;
        }

        /* renamed from: A */
        public C10442c m13260A() {
            return this.f23019r;
        }

        /* renamed from: B */
        public C10441b m13259B() {
            return this.f23015n;
        }

        /* renamed from: C */
        public C10442c m13258C() {
            return this.f23017p;
        }

        /* renamed from: D */
        public C10442c m13257D() {
            return this.f23018q;
        }

        /* renamed from: E */
        public C10442c m13256E() {
            return this.f23016o;
        }

        /* renamed from: F */
        public boolean m13255F() {
            return (this.f23014m & 16) == 16;
        }

        /* renamed from: G */
        public boolean m13254G() {
            return (this.f23014m & 1) == 1;
        }

        /* renamed from: H */
        public boolean m13253H() {
            return (this.f23014m & 4) == 4;
        }

        /* renamed from: I */
        public boolean m13252I() {
            return (this.f23014m & 8) == 8;
        }

        /* renamed from: J */
        public boolean m13251J() {
            return (this.f23014m & 2) == 2;
        }

        /* renamed from: N */
        public C10445b mo8779e() {
            return m13249L();
        }

        /* renamed from: O */
        public C10445b mo8782a() {
            return m13248M(this);
        }

        @Override // ph.AbstractC11724q
        /* renamed from: c */
        public int mo8781c() {
            int i = this.f23021t;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f23014m & 1) == 1) {
                i2 = 0 + C11695f.m8898s(1, this.f23015n);
            }
            if ((this.f23014m & 2) == 2) {
                i2 += C11695f.m8898s(2, this.f23016o);
            }
            if ((this.f23014m & 4) == 4) {
                i2 += C11695f.m8898s(3, this.f23017p);
            }
            if ((this.f23014m & 8) == 8) {
                i2 += C11695f.m8898s(4, this.f23018q);
            }
            if ((this.f23014m & 16) == 16) {
                i2 += C11695f.m8898s(5, this.f23019r);
            }
            int size = i2 + this.f23013l.size();
            this.f23021t = size;
            return size;
        }

        @Override // ph.AbstractC11724q
        /* renamed from: d */
        public void mo8780d(C11695f fVar) {
            mo8781c();
            if ((this.f23014m & 1) == 1) {
                fVar.m8927d0(1, this.f23015n);
            }
            if ((this.f23014m & 2) == 2) {
                fVar.m8927d0(2, this.f23016o);
            }
            if ((this.f23014m & 4) == 4) {
                fVar.m8927d0(3, this.f23017p);
            }
            if ((this.f23014m & 8) == 8) {
                fVar.m8927d0(4, this.f23018q);
            }
            if ((this.f23014m & 16) == 16) {
                fVar.m8927d0(5, this.f23019r);
            }
            fVar.m8917i0(this.f23013l);
        }

        @Override // ph.AbstractC11702i, ph.AbstractC11724q
        /* renamed from: h */
        public AbstractC11727s<C10444d> mo8778h() {
            return f23012v;
        }

        @Override // ph.AbstractC11726r
        /* renamed from: j */
        public final boolean mo8775j() {
            byte b = this.f23020s;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f23020s = (byte) 1;
            return true;
        }

        private C10444d(AbstractC11702i.AbstractC11704b bVar) {
            super(bVar);
            this.f23020s = (byte) -1;
            this.f23021t = -1;
            this.f23013l = bVar.m8845n();
        }

        private C10444d(boolean z) {
            this.f23020s = (byte) -1;
            this.f23021t = -1;
            this.f23013l = AbstractC11691d.f26108k;
        }

        private C10444d(C11694e eVar, C11697g gVar) {
            this.f23020s = (byte) -1;
            this.f23021t = -1;
            m13250K();
            AbstractC11691d.C11693b w = AbstractC11691d.m9011w();
            C11695f J = C11695f.m8951J(w, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int K = eVar.m8996K();
                            if (K != 0) {
                                C10442c.C10443b bVar = null;
                                C10441b.C0329b F = null;
                                C10442c.C10443b F2 = null;
                                C10442c.C10443b F3 = null;
                                C10442c.C10443b F4 = null;
                                if (K == 10) {
                                    F = (this.f23014m & 1) == 1 ? this.f23015n.mo8782a() : F;
                                    C10441b bVar2 = (C10441b) eVar.m8966u(C10441b.f22990s, gVar);
                                    this.f23015n = bVar2;
                                    if (F != null) {
                                        F.mo8844o(bVar2);
                                        this.f23015n = F.m13292t();
                                    }
                                    this.f23014m |= 1;
                                } else if (K == 18) {
                                    F2 = (this.f23014m & 2) == 2 ? this.f23016o.mo8782a() : F2;
                                    C10442c cVar = (C10442c) eVar.m8966u(C10442c.f23001s, gVar);
                                    this.f23016o = cVar;
                                    if (F2 != null) {
                                        F2.mo8844o(cVar);
                                        this.f23016o = F2.m13267t();
                                    }
                                    this.f23014m |= 2;
                                } else if (K == 26) {
                                    F3 = (this.f23014m & 4) == 4 ? this.f23017p.mo8782a() : F3;
                                    C10442c cVar2 = (C10442c) eVar.m8966u(C10442c.f23001s, gVar);
                                    this.f23017p = cVar2;
                                    if (F3 != null) {
                                        F3.mo8844o(cVar2);
                                        this.f23017p = F3.m13267t();
                                    }
                                    this.f23014m |= 4;
                                } else if (K == 34) {
                                    F4 = (this.f23014m & 8) == 8 ? this.f23018q.mo8782a() : F4;
                                    C10442c cVar3 = (C10442c) eVar.m8966u(C10442c.f23001s, gVar);
                                    this.f23018q = cVar3;
                                    if (F4 != null) {
                                        F4.mo8844o(cVar3);
                                        this.f23018q = F4.m13267t();
                                    }
                                    this.f23014m |= 8;
                                } else if (K == 42) {
                                    bVar = (this.f23014m & 16) == 16 ? this.f23019r.mo8782a() : bVar;
                                    C10442c cVar4 = (C10442c) eVar.m8966u(C10442c.f23001s, gVar);
                                    this.f23019r = cVar4;
                                    if (bVar != null) {
                                        bVar.mo8844o(cVar4);
                                        this.f23019r = bVar.m13267t();
                                    }
                                    this.f23014m |= 16;
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
                        this.f23013l = w.m9007i();
                        throw th3;
                    }
                    this.f23013l = w.m9007i();
                    mo8837n();
                    throw th2;
                }
            }
            try {
                J.m8952I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f23013l = w.m9007i();
                throw th4;
            }
            this.f23013l = w.m9007i();
            mo8837n();
        }
    }
}
