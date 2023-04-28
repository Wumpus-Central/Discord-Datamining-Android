package p159ih;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p159ih.C8563h;
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

/* renamed from: ih.f */
/* loaded from: classes8.dex */
public final class C8553f extends AbstractC11702i implements AbstractC11726r {

    /* renamed from: t */
    private static final C8553f f18679t;

    /* renamed from: u */
    public static AbstractC11727s<C8553f> f18680u = new C8554a();

    /* renamed from: l */
    private final AbstractC11691d f18681l;

    /* renamed from: m */
    private int f18682m;

    /* renamed from: n */
    private EnumC8556c f18683n;

    /* renamed from: o */
    private List<C8563h> f18684o;

    /* renamed from: p */
    private C8563h f18685p;

    /* renamed from: q */
    private EnumC8558d f18686q;

    /* renamed from: r */
    private byte f18687r;

    /* renamed from: s */
    private int f18688s;

    /* renamed from: ih.f$a */
    /* loaded from: classes8.dex */
    static class C8554a extends AbstractC11687b<C8553f> {
        C8554a() {
        }

        /* renamed from: m */
        public C8553f mo8771d(C11694e eVar, C11697g gVar) {
            return new C8553f(eVar, gVar);
        }
    }

    /* renamed from: ih.f$b */
    /* loaded from: classes8.dex */
    public static final class C8555b extends AbstractC11702i.AbstractC11704b<C8553f, C8555b> implements AbstractC11726r {

        /* renamed from: l */
        private int f18689l;

        /* renamed from: m */
        private EnumC8556c f18690m = EnumC8556c.RETURNS_CONSTANT;

        /* renamed from: n */
        private List<C8563h> f18691n = Collections.emptyList();

        /* renamed from: o */
        private C8563h f18692o = C8563h.m19194G();

        /* renamed from: p */
        private EnumC8558d f18693p = EnumC8558d.AT_MOST_ONCE;

        private C8555b() {
            m19229x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public static C8555b m19231v() {
            return new C8555b();
        }

        /* renamed from: w */
        private void m19230w() {
            if ((this.f18689l & 2) != 2) {
                this.f18691n = new ArrayList(this.f18691n);
                this.f18689l |= 2;
            }
        }

        /* renamed from: x */
        private void m19229x() {
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: A */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p159ih.C8553f.C8555b mo9032k(ph.C11694e r3, ph.C11697g r4) {
            /*
                r2 = this;
                r0 = 0
                ph.s<ih.f> r1 = p159ih.C8553f.f18680u     // Catch: all -> 0x000f, k -> 0x0011
                java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                ih.f r3 = (p159ih.C8553f) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                ih.f r4 = (p159ih.C8553f) r4     // Catch: all -> 0x000f
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
            throw new UnsupportedOperationException("Method not decompiled: p159ih.C8553f.C8555b.mo9032k(ph.e, ph.g):ih.f$b");
        }

        /* renamed from: B */
        public C8555b m19237B(EnumC8556c cVar) {
            cVar.getClass();
            this.f18689l |= 1;
            this.f18690m = cVar;
            return this;
        }

        /* renamed from: C */
        public C8555b m19236C(EnumC8558d dVar) {
            dVar.getClass();
            this.f18689l |= 8;
            this.f18693p = dVar;
            return this;
        }

        /* renamed from: s */
        public C8553f build() {
            C8553f t = m19233t();
            if (t.mo8775j()) {
                return t;
            }
            throw AbstractC11686a.AbstractC0372a.m9031l(t);
        }

        /* renamed from: t */
        public C8553f m19233t() {
            C8553f fVar = new C8553f(this);
            int i = this.f18689l;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            fVar.f18683n = this.f18690m;
            if ((this.f18689l & 2) == 2) {
                this.f18691n = Collections.unmodifiableList(this.f18691n);
                this.f18689l &= -3;
            }
            fVar.f18684o = this.f18691n;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            fVar.f18685p = this.f18692o;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            fVar.f18686q = this.f18693p;
            fVar.f18682m = i2;
            return fVar;
        }

        /* renamed from: u */
        public C8555b mo8846m() {
            return m19231v().mo8844o(m19233t());
        }

        /* renamed from: y */
        public C8555b m19228y(C8563h hVar) {
            if ((this.f18689l & 4) != 4 || this.f18692o == C8563h.m19194G()) {
                this.f18692o = hVar;
            } else {
                this.f18692o = C8563h.m19180U(this.f18692o).mo8844o(hVar).m19160t();
            }
            this.f18689l |= 4;
            return this;
        }

        /* renamed from: z */
        public C8555b mo8844o(C8553f fVar) {
            if (fVar == C8553f.m19260A()) {
                return this;
            }
            if (fVar.m19254G()) {
                m19237B(fVar.m19257D());
            }
            if (!fVar.f18684o.isEmpty()) {
                if (this.f18691n.isEmpty()) {
                    this.f18691n = fVar.f18684o;
                    this.f18689l &= -3;
                } else {
                    m19230w();
                    this.f18691n.addAll(fVar.f18684o);
                }
            }
            if (fVar.m19255F()) {
                m19228y(fVar.m19240z());
            }
            if (fVar.m19253H()) {
                m19236C(fVar.m19256E());
            }
            m8843q(m8845n().m9017b(fVar.f18681l));
            return this;
        }
    }

    /* renamed from: ih.f$c */
    /* loaded from: classes8.dex */
    public enum EnumC8556c implements C11710j.AbstractC11711a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);
        

        /* renamed from: o */
        private static C11710j.AbstractC11712b<EnumC8556c> f18697o = new C8557a();

        /* renamed from: k */
        private final int f18699k;

        /* renamed from: ih.f$c$a */
        /* loaded from: classes8.dex */
        static class C8557a implements C11710j.AbstractC11712b<EnumC8556c> {
            C8557a() {
            }

            /* renamed from: b */
            public EnumC8556c mo8811a(int i) {
                return EnumC8556c.m19226a(i);
            }
        }

        EnumC8556c(int i, int i2) {
            this.f18699k = i2;
        }

        /* renamed from: a */
        public static EnumC8556c m19226a(int i) {
            if (i == 0) {
                return RETURNS_CONSTANT;
            }
            if (i == 1) {
                return CALLS;
            }
            if (i != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }

        @Override // ph.C11710j.AbstractC11711a
        public final int getNumber() {
            return this.f18699k;
        }
    }

    /* renamed from: ih.f$d */
    /* loaded from: classes8.dex */
    public enum EnumC8558d implements C11710j.AbstractC11711a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);
        

        /* renamed from: o */
        private static C11710j.AbstractC11712b<EnumC8558d> f18703o = new C8559a();

        /* renamed from: k */
        private final int f18705k;

        /* renamed from: ih.f$d$a */
        /* loaded from: classes8.dex */
        static class C8559a implements C11710j.AbstractC11712b<EnumC8558d> {
            C8559a() {
            }

            /* renamed from: b */
            public EnumC8558d mo8811a(int i) {
                return EnumC8558d.m19224a(i);
            }
        }

        EnumC8558d(int i, int i2) {
            this.f18705k = i2;
        }

        /* renamed from: a */
        public static EnumC8558d m19224a(int i) {
            if (i == 0) {
                return AT_MOST_ONCE;
            }
            if (i == 1) {
                return EXACTLY_ONCE;
            }
            if (i != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }

        @Override // ph.C11710j.AbstractC11711a
        public final int getNumber() {
            return this.f18705k;
        }
    }

    static {
        C8553f fVar = new C8553f(true);
        f18679t = fVar;
        fVar.m19252I();
    }

    /* renamed from: A */
    public static C8553f m19260A() {
        return f18679t;
    }

    /* renamed from: I */
    private void m19252I() {
        this.f18683n = EnumC8556c.RETURNS_CONSTANT;
        this.f18684o = Collections.emptyList();
        this.f18685p = C8563h.m19194G();
        this.f18686q = EnumC8558d.AT_MOST_ONCE;
    }

    /* renamed from: J */
    public static C8555b m19251J() {
        return C8555b.m19231v();
    }

    /* renamed from: K */
    public static C8555b m19250K(C8553f fVar) {
        return m19251J().mo8844o(fVar);
    }

    /* renamed from: B */
    public C8563h m19259B(int i) {
        return this.f18684o.get(i);
    }

    /* renamed from: C */
    public int m19258C() {
        return this.f18684o.size();
    }

    /* renamed from: D */
    public EnumC8556c m19257D() {
        return this.f18683n;
    }

    /* renamed from: E */
    public EnumC8558d m19256E() {
        return this.f18686q;
    }

    /* renamed from: F */
    public boolean m19255F() {
        return (this.f18682m & 2) == 2;
    }

    /* renamed from: G */
    public boolean m19254G() {
        return (this.f18682m & 1) == 1;
    }

    /* renamed from: H */
    public boolean m19253H() {
        return (this.f18682m & 4) == 4;
    }

    /* renamed from: L */
    public C8555b mo8779e() {
        return m19251J();
    }

    /* renamed from: M */
    public C8555b mo8782a() {
        return m19250K(this);
    }

    @Override // ph.AbstractC11724q
    /* renamed from: c */
    public int mo8781c() {
        int i;
        int i2 = this.f18688s;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f18682m & 1) == 1) {
            i = C11695f.m8920h(1, this.f18683n.getNumber()) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.f18684o.size(); i3++) {
            i += C11695f.m8898s(2, this.f18684o.get(i3));
        }
        if ((this.f18682m & 2) == 2) {
            i += C11695f.m8898s(3, this.f18685p);
        }
        if ((this.f18682m & 4) == 4) {
            i += C11695f.m8920h(4, this.f18686q.getNumber());
        }
        int size = i + this.f18681l.size();
        this.f18688s = size;
        return size;
    }

    @Override // ph.AbstractC11724q
    /* renamed from: d */
    public void mo8780d(C11695f fVar) {
        mo8781c();
        if ((this.f18682m & 1) == 1) {
            fVar.m8942S(1, this.f18683n.getNumber());
        }
        for (int i = 0; i < this.f18684o.size(); i++) {
            fVar.m8927d0(2, this.f18684o.get(i));
        }
        if ((this.f18682m & 2) == 2) {
            fVar.m8927d0(3, this.f18685p);
        }
        if ((this.f18682m & 4) == 4) {
            fVar.m8942S(4, this.f18686q.getNumber());
        }
        fVar.m8917i0(this.f18681l);
    }

    @Override // ph.AbstractC11702i, ph.AbstractC11724q
    /* renamed from: h */
    public AbstractC11727s<C8553f> mo8778h() {
        return f18680u;
    }

    @Override // ph.AbstractC11726r
    /* renamed from: j */
    public final boolean mo8775j() {
        byte b = this.f18687r;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < m19258C(); i++) {
            if (!m19259B(i).mo8775j()) {
                this.f18687r = (byte) 0;
                return false;
            }
        }
        if (!m19255F() || m19240z().mo8775j()) {
            this.f18687r = (byte) 1;
            return true;
        }
        this.f18687r = (byte) 0;
        return false;
    }

    /* renamed from: z */
    public C8563h m19240z() {
        return this.f18685p;
    }

    private C8553f(AbstractC11702i.AbstractC11704b bVar) {
        super(bVar);
        this.f18687r = (byte) -1;
        this.f18688s = -1;
        this.f18681l = bVar.m8845n();
    }

    private C8553f(boolean z) {
        this.f18687r = (byte) -1;
        this.f18688s = -1;
        this.f18681l = AbstractC11691d.f26108k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C8553f(C11694e eVar, C11697g gVar) {
        this.f18687r = (byte) -1;
        this.f18688s = -1;
        m19252I();
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
                            if (K == 8) {
                                int n = eVar.m8973n();
                                EnumC8556c a = EnumC8556c.m19226a(n);
                                if (a == null) {
                                    J.m8905o0(K);
                                    J.m8905o0(n);
                                } else {
                                    this.f18682m |= 1;
                                    this.f18683n = a;
                                }
                            } else if (K == 18) {
                                if (!(z2 & true)) {
                                    this.f18684o = new ArrayList();
                                    z2 |= true;
                                }
                                this.f18684o.add(eVar.m8966u(C8563h.f18716x, gVar));
                            } else if (K == 26) {
                                C8563h.C8565b W = (this.f18682m & 2) == 2 ? this.f18685p.mo8782a() : null;
                                C8563h hVar = (C8563h) eVar.m8966u(C8563h.f18716x, gVar);
                                this.f18685p = hVar;
                                if (W != null) {
                                    W.mo8844o(hVar);
                                    this.f18685p = W.m19160t();
                                }
                                this.f18682m |= 2;
                            } else if (K == 32) {
                                int n2 = eVar.m8973n();
                                EnumC8558d a2 = EnumC8558d.m19224a(n2);
                                if (a2 == null) {
                                    J.m8905o0(K);
                                    J.m8905o0(n2);
                                } else {
                                    this.f18682m |= 4;
                                    this.f18686q = a2;
                                }
                            } else if (!mo8836q(eVar, J, gVar, K)) {
                            }
                        }
                        z = true;
                    } catch (C11713k e) {
                        throw e.m8802i(this);
                    }
                } catch (IOException e2) {
                    throw new C11713k(e2.getMessage()).m8802i(this);
                }
            } catch (Throwable th2) {
                if (z2 & true) {
                    this.f18684o = Collections.unmodifiableList(this.f18684o);
                }
                try {
                    J.m8952I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f18681l = w.m9007i();
                    throw th3;
                }
                this.f18681l = w.m9007i();
                mo8837n();
                throw th2;
            }
        }
        if (z2 & true) {
            this.f18684o = Collections.unmodifiableList(this.f18684o);
        }
        try {
            J.m8952I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f18681l = w.m9007i();
            throw th4;
        }
        this.f18681l = w.m9007i();
        mo8837n();
    }
}
