package p159ih;

import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ph.AbstractC11686a;
import ph.AbstractC11687b;
import ph.AbstractC11691d;
import ph.AbstractC11702i;
import ph.AbstractC11727s;
import ph.C11694e;
import ph.C11695f;
import ph.C11697g;
import ph.C11710j;
import ph.C11713k;

/* renamed from: ih.s */
/* loaded from: classes8.dex */
public final class C8603s extends AbstractC11702i.AbstractC11706d<C8603s> {

    /* renamed from: x */
    private static final C8603s f18948x;

    /* renamed from: y */
    public static AbstractC11727s<C8603s> f18949y = new C8604a();

    /* renamed from: m */
    private final AbstractC11691d f18950m;

    /* renamed from: n */
    private int f18951n;

    /* renamed from: o */
    private int f18952o;

    /* renamed from: p */
    private int f18953p;

    /* renamed from: q */
    private boolean f18954q;

    /* renamed from: r */
    private EnumC8606c f18955r;

    /* renamed from: s */
    private List<C8593q> f18956s;

    /* renamed from: t */
    private List<Integer> f18957t;

    /* renamed from: u */
    private int f18958u;

    /* renamed from: v */
    private byte f18959v;

    /* renamed from: w */
    private int f18960w;

    /* renamed from: ih.s$a */
    /* loaded from: classes8.dex */
    static class C8604a extends AbstractC11687b<C8603s> {
        C8604a() {
        }

        /* renamed from: m */
        public C8603s mo8771d(C11694e eVar, C11697g gVar) {
            return new C8603s(eVar, gVar);
        }
    }

    /* renamed from: ih.s$b */
    /* loaded from: classes8.dex */
    public static final class C8605b extends AbstractC11702i.AbstractC11705c<C8603s, C8605b> {

        /* renamed from: n */
        private int f18961n;

        /* renamed from: o */
        private int f18962o;

        /* renamed from: p */
        private int f18963p;

        /* renamed from: q */
        private boolean f18964q;

        /* renamed from: r */
        private EnumC8606c f18965r = EnumC8606c.INV;

        /* renamed from: s */
        private List<C8593q> f18966s = Collections.emptyList();

        /* renamed from: t */
        private List<Integer> f18967t = Collections.emptyList();

        private C8605b() {
            m18635C();
        }

        /* renamed from: A */
        private void m18637A() {
            if ((this.f18961n & 32) != 32) {
                this.f18967t = new ArrayList(this.f18967t);
                this.f18961n |= 32;
            }
        }

        /* renamed from: B */
        private void m18636B() {
            if ((this.f18961n & 16) != 16) {
                this.f18966s = new ArrayList(this.f18966s);
                this.f18961n |= 16;
            }
        }

        /* renamed from: C */
        private void m18635C() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public static C8605b m18624z() {
            return new C8605b();
        }

        /* renamed from: D */
        public C8605b mo8844o(C8603s sVar) {
            if (sVar == C8603s.m18657L()) {
                return this;
            }
            if (sVar.m18647V()) {
                m18632F(sVar.m18655N());
            }
            if (sVar.m18646W()) {
                m18631G(sVar.m18654O());
            }
            if (sVar.m18645X()) {
                m18630H(sVar.m18653P());
            }
            if (sVar.m18644Y()) {
                m18629I(sVar.m18648U());
            }
            if (!sVar.f18956s.isEmpty()) {
                if (this.f18966s.isEmpty()) {
                    this.f18966s = sVar.f18956s;
                    this.f18961n &= -17;
                } else {
                    m18636B();
                    this.f18966s.addAll(sVar.f18956s);
                }
            }
            if (!sVar.f18957t.isEmpty()) {
                if (this.f18967t.isEmpty()) {
                    this.f18967t = sVar.f18957t;
                    this.f18961n &= -33;
                } else {
                    m18637A();
                    this.f18967t.addAll(sVar.f18957t);
                }
            }
            m8839u(sVar);
            m8843q(m8845n().m9017b(sVar.f18950m));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: E */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p159ih.C8603s.C8605b mo9032k(ph.C11694e r3, ph.C11697g r4) {
            /*
                r2 = this;
                r0 = 0
                ph.s<ih.s> r1 = p159ih.C8603s.f18949y     // Catch: all -> 0x000f, k -> 0x0011
                java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                ih.s r3 = (p159ih.C8603s) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                ih.s r4 = (p159ih.C8603s) r4     // Catch: all -> 0x000f
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
            throw new UnsupportedOperationException("Method not decompiled: p159ih.C8603s.C8605b.mo9032k(ph.e, ph.g):ih.s$b");
        }

        /* renamed from: F */
        public C8605b m18632F(int i) {
            this.f18961n |= 1;
            this.f18962o = i;
            return this;
        }

        /* renamed from: G */
        public C8605b m18631G(int i) {
            this.f18961n |= 2;
            this.f18963p = i;
            return this;
        }

        /* renamed from: H */
        public C8605b m18630H(boolean z) {
            this.f18961n |= 4;
            this.f18964q = z;
            return this;
        }

        /* renamed from: I */
        public C8605b m18629I(EnumC8606c cVar) {
            cVar.getClass();
            this.f18961n |= 8;
            this.f18965r = cVar;
            return this;
        }

        /* renamed from: w */
        public C8603s build() {
            C8603s x = m18626x();
            if (x.mo8775j()) {
                return x;
            }
            throw AbstractC11686a.AbstractC0372a.m9031l(x);
        }

        /* renamed from: x */
        public C8603s m18626x() {
            C8603s sVar = new C8603s(this);
            int i = this.f18961n;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            sVar.f18952o = this.f18962o;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            sVar.f18953p = this.f18963p;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            sVar.f18954q = this.f18964q;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            sVar.f18955r = this.f18965r;
            if ((this.f18961n & 16) == 16) {
                this.f18966s = Collections.unmodifiableList(this.f18966s);
                this.f18961n &= -17;
            }
            sVar.f18956s = this.f18966s;
            if ((this.f18961n & 32) == 32) {
                this.f18967t = Collections.unmodifiableList(this.f18967t);
                this.f18961n &= -33;
            }
            sVar.f18957t = this.f18967t;
            sVar.f18951n = i2;
            return sVar;
        }

        /* renamed from: y */
        public C8605b mo8846m() {
            return m18624z().mo8844o(m18626x());
        }
    }

    /* renamed from: ih.s$c */
    /* loaded from: classes8.dex */
    public enum EnumC8606c implements C11710j.AbstractC11711a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);
        

        /* renamed from: o */
        private static C11710j.AbstractC11712b<EnumC8606c> f18971o = new C8607a();

        /* renamed from: k */
        private final int f18973k;

        /* renamed from: ih.s$c$a */
        /* loaded from: classes8.dex */
        static class C8607a implements C11710j.AbstractC11712b<EnumC8606c> {
            C8607a() {
            }

            /* renamed from: b */
            public EnumC8606c mo8811a(int i) {
                return EnumC8606c.m18623a(i);
            }
        }

        EnumC8606c(int i, int i2) {
            this.f18973k = i2;
        }

        /* renamed from: a */
        public static EnumC8606c m18623a(int i) {
            if (i == 0) {
                return IN;
            }
            if (i == 1) {
                return OUT;
            }
            if (i != 2) {
                return null;
            }
            return INV;
        }

        @Override // ph.C11710j.AbstractC11711a
        public final int getNumber() {
            return this.f18973k;
        }
    }

    static {
        C8603s sVar = new C8603s(true);
        f18948x = sVar;
        sVar.m18643Z();
    }

    /* renamed from: L */
    public static C8603s m18657L() {
        return f18948x;
    }

    /* renamed from: Z */
    private void m18643Z() {
        this.f18952o = 0;
        this.f18953p = 0;
        this.f18954q = false;
        this.f18955r = EnumC8606c.INV;
        this.f18956s = Collections.emptyList();
        this.f18957t = Collections.emptyList();
    }

    /* renamed from: a0 */
    public static C8605b m18642a0() {
        return C8605b.m18624z();
    }

    /* renamed from: b0 */
    public static C8605b m18641b0(C8603s sVar) {
        return m18642a0().mo8844o(sVar);
    }

    /* renamed from: M */
    public C8603s mo8776f() {
        return f18948x;
    }

    /* renamed from: N */
    public int m18655N() {
        return this.f18952o;
    }

    /* renamed from: O */
    public int m18654O() {
        return this.f18953p;
    }

    /* renamed from: P */
    public boolean m18653P() {
        return this.f18954q;
    }

    /* renamed from: Q */
    public C8593q m18652Q(int i) {
        return this.f18956s.get(i);
    }

    /* renamed from: R */
    public int m18651R() {
        return this.f18956s.size();
    }

    /* renamed from: S */
    public List<Integer> m18650S() {
        return this.f18957t;
    }

    /* renamed from: T */
    public List<C8593q> m18649T() {
        return this.f18956s;
    }

    /* renamed from: U */
    public EnumC8606c m18648U() {
        return this.f18955r;
    }

    /* renamed from: V */
    public boolean m18647V() {
        return (this.f18951n & 1) == 1;
    }

    /* renamed from: W */
    public boolean m18646W() {
        return (this.f18951n & 2) == 2;
    }

    /* renamed from: X */
    public boolean m18645X() {
        return (this.f18951n & 4) == 4;
    }

    /* renamed from: Y */
    public boolean m18644Y() {
        return (this.f18951n & 8) == 8;
    }

    @Override // ph.AbstractC11724q
    /* renamed from: c */
    public int mo8781c() {
        int i;
        int i2 = this.f18960w;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f18951n & 1) == 1) {
            i = C11695f.m8906o(1, this.f18952o) + 0;
        } else {
            i = 0;
        }
        if ((this.f18951n & 2) == 2) {
            i += C11695f.m8906o(2, this.f18953p);
        }
        if ((this.f18951n & 4) == 4) {
            i += C11695f.m8934a(3, this.f18954q);
        }
        if ((this.f18951n & 8) == 8) {
            i += C11695f.m8920h(4, this.f18955r.getNumber());
        }
        for (int i3 = 0; i3 < this.f18956s.size(); i3++) {
            i += C11695f.m8898s(5, this.f18956s.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f18957t.size(); i5++) {
            i4 += C11695f.m8904p(this.f18957t.get(i5).intValue());
        }
        int i6 = i + i4;
        if (!m18650S().isEmpty()) {
            i6 = i6 + 1 + C11695f.m8904p(i4);
        }
        this.f18958u = i4;
        int u = i6 + m8833u() + this.f18950m.size();
        this.f18960w = u;
        return u;
    }

    /* renamed from: c0 */
    public C8605b mo8779e() {
        return m18642a0();
    }

    @Override // ph.AbstractC11724q
    /* renamed from: d */
    public void mo8780d(C11695f fVar) {
        mo8781c();
        AbstractC11702i.AbstractC11706d<MessageType>.C11707a z = m8828z();
        if ((this.f18951n & 1) == 1) {
            fVar.m8933a0(1, this.f18952o);
        }
        if ((this.f18951n & 2) == 2) {
            fVar.m8933a0(2, this.f18953p);
        }
        if ((this.f18951n & 4) == 4) {
            fVar.m8949L(3, this.f18954q);
        }
        if ((this.f18951n & 8) == 8) {
            fVar.m8942S(4, this.f18955r.getNumber());
        }
        for (int i = 0; i < this.f18956s.size(); i++) {
            fVar.m8927d0(5, this.f18956s.get(i));
        }
        if (m18650S().size() > 0) {
            fVar.m8905o0(50);
            fVar.m8905o0(this.f18958u);
        }
        for (int i2 = 0; i2 < this.f18957t.size(); i2++) {
            fVar.m8931b0(this.f18957t.get(i2).intValue());
        }
        z.m8827a(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, fVar);
        fVar.m8917i0(this.f18950m);
    }

    /* renamed from: d0 */
    public C8605b mo8782a() {
        return m18641b0(this);
    }

    @Override // ph.AbstractC11702i, ph.AbstractC11724q
    /* renamed from: h */
    public AbstractC11727s<C8603s> mo8778h() {
        return f18949y;
    }

    @Override // ph.AbstractC11726r
    /* renamed from: j */
    public final boolean mo8775j() {
        byte b = this.f18959v;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m18647V()) {
            this.f18959v = (byte) 0;
            return false;
        } else if (!m18646W()) {
            this.f18959v = (byte) 0;
            return false;
        } else {
            for (int i = 0; i < m18651R(); i++) {
                if (!m18652Q(i).mo8775j()) {
                    this.f18959v = (byte) 0;
                    return false;
                }
            }
            if (!m8834t()) {
                this.f18959v = (byte) 0;
                return false;
            }
            this.f18959v = (byte) 1;
            return true;
        }
    }

    private C8603s(AbstractC11702i.AbstractC11705c<C8603s, ?> cVar) {
        super(cVar);
        this.f18958u = -1;
        this.f18959v = (byte) -1;
        this.f18960w = -1;
        this.f18950m = cVar.m8845n();
    }

    private C8603s(boolean z) {
        this.f18958u = -1;
        this.f18959v = (byte) -1;
        this.f18960w = -1;
        this.f18950m = AbstractC11691d.f26108k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C8603s(C11694e eVar, C11697g gVar) {
        this.f18958u = -1;
        this.f18959v = (byte) -1;
        this.f18960w = -1;
        m18643Z();
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
                                this.f18951n |= 1;
                                this.f18952o = eVar.m8968s();
                            } else if (K == 16) {
                                this.f18951n |= 2;
                                this.f18953p = eVar.m8968s();
                            } else if (K == 24) {
                                this.f18951n |= 4;
                                this.f18954q = eVar.m8976k();
                            } else if (K == 32) {
                                int n = eVar.m8973n();
                                EnumC8606c a = EnumC8606c.m18623a(n);
                                if (a == null) {
                                    J.m8905o0(K);
                                    J.m8905o0(n);
                                } else {
                                    this.f18951n |= 8;
                                    this.f18955r = a;
                                }
                            } else if (K == 42) {
                                if (!(z2 & true)) {
                                    this.f18956s = new ArrayList();
                                    z2 |= true;
                                }
                                this.f18956s.add(eVar.m8966u(C8593q.f38663F, gVar));
                            } else if (K == 48) {
                                if (!(z2 & true)) {
                                    this.f18957t = new ArrayList();
                                    z2 |= true;
                                }
                                this.f18957t.add(Integer.valueOf(eVar.m8968s()));
                            } else if (K == 50) {
                                int j = eVar.m8977j(eVar.m9006A());
                                if (!(z2 & true) && eVar.m8982e() > 0) {
                                    this.f18957t = new ArrayList();
                                    z2 |= true;
                                }
                                while (eVar.m8982e() > 0) {
                                    this.f18957t.add(Integer.valueOf(eVar.m8968s()));
                                }
                                eVar.m8978i(j);
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
                if (z2 & true) {
                    this.f18956s = Collections.unmodifiableList(this.f18956s);
                }
                if (z2 & true) {
                    this.f18957t = Collections.unmodifiableList(this.f18957t);
                }
                try {
                    J.m8952I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f18950m = w.m9007i();
                    throw th3;
                }
                this.f18950m = w.m9007i();
                mo8837n();
                throw th2;
            }
        }
        if (z2 & true) {
            this.f18956s = Collections.unmodifiableList(this.f18956s);
        }
        if (z2 & true) {
            this.f18957t = Collections.unmodifiableList(this.f18957t);
        }
        try {
            J.m8952I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f18950m = w.m9007i();
            throw th4;
        }
        this.f18950m = w.m9007i();
        mo8837n();
    }
}
