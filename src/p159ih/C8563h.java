package p159ih;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p159ih.C8593q;
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

/* renamed from: ih.h */
/* loaded from: classes8.dex */
public final class C8563h extends AbstractC11702i implements AbstractC11726r {

    /* renamed from: w */
    private static final C8563h f18715w;

    /* renamed from: x */
    public static AbstractC11727s<C8563h> f18716x = new C8564a();

    /* renamed from: l */
    private final AbstractC11691d f18717l;

    /* renamed from: m */
    private int f18718m;

    /* renamed from: n */
    private int f18719n;

    /* renamed from: o */
    private int f18720o;

    /* renamed from: p */
    private EnumC8566c f18721p;

    /* renamed from: q */
    private C8593q f18722q;

    /* renamed from: r */
    private int f18723r;

    /* renamed from: s */
    private List<C8563h> f18724s;

    /* renamed from: t */
    private List<C8563h> f18725t;

    /* renamed from: u */
    private byte f18726u;

    /* renamed from: v */
    private int f18727v;

    /* renamed from: ih.h$a */
    /* loaded from: classes8.dex */
    static class C8564a extends AbstractC11687b<C8563h> {
        C8564a() {
        }

        /* renamed from: m */
        public C8563h mo8771d(C11694e eVar, C11697g gVar) {
            return new C8563h(eVar, gVar);
        }
    }

    /* renamed from: ih.h$b */
    /* loaded from: classes8.dex */
    public static final class C8565b extends AbstractC11702i.AbstractC11704b<C8563h, C8565b> implements AbstractC11726r {

        /* renamed from: l */
        private int f18728l;

        /* renamed from: m */
        private int f18729m;

        /* renamed from: n */
        private int f18730n;

        /* renamed from: q */
        private int f18733q;

        /* renamed from: o */
        private EnumC8566c f18731o = EnumC8566c.TRUE;

        /* renamed from: p */
        private C8593q f18732p = C8593q.m18808Y();

        /* renamed from: r */
        private List<C8563h> f18734r = Collections.emptyList();

        /* renamed from: s */
        private List<C8563h> f18735s = Collections.emptyList();

        private C8565b() {
            m19155y();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public static C8565b m19158v() {
            return new C8565b();
        }

        /* renamed from: w */
        private void m19157w() {
            if ((this.f18728l & 32) != 32) {
                this.f18734r = new ArrayList(this.f18734r);
                this.f18728l |= 32;
            }
        }

        /* renamed from: x */
        private void m19156x() {
            if ((this.f18728l & 64) != 64) {
                this.f18735s = new ArrayList(this.f18735s);
                this.f18728l |= 64;
            }
        }

        /* renamed from: y */
        private void m19155y() {
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: A */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p159ih.C8563h.C8565b mo9032k(ph.C11694e r3, ph.C11697g r4) {
            /*
                r2 = this;
                r0 = 0
                ph.s<ih.h> r1 = p159ih.C8563h.f18716x     // Catch: all -> 0x000f, k -> 0x0011
                java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                ih.h r3 = (p159ih.C8563h) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                ih.h r4 = (p159ih.C8563h) r4     // Catch: all -> 0x000f
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
            throw new UnsupportedOperationException("Method not decompiled: p159ih.C8563h.C8565b.mo9032k(ph.e, ph.g):ih.h$b");
        }

        /* renamed from: B */
        public C8565b m19167B(C8593q qVar) {
            if ((this.f18728l & 8) != 8 || this.f18732p == C8593q.m18808Y()) {
                this.f18732p = qVar;
            } else {
                this.f18732p = C8593q.m18781z0(this.f18732p).mo8844o(qVar).m18729x();
            }
            this.f18728l |= 8;
            return this;
        }

        /* renamed from: C */
        public C8565b m19166C(EnumC8566c cVar) {
            cVar.getClass();
            this.f18728l |= 4;
            this.f18731o = cVar;
            return this;
        }

        /* renamed from: D */
        public C8565b m19165D(int i) {
            this.f18728l |= 1;
            this.f18729m = i;
            return this;
        }

        /* renamed from: E */
        public C8565b m19164E(int i) {
            this.f18728l |= 16;
            this.f18733q = i;
            return this;
        }

        /* renamed from: F */
        public C8565b m19163F(int i) {
            this.f18728l |= 2;
            this.f18730n = i;
            return this;
        }

        /* renamed from: s */
        public C8563h build() {
            C8563h t = m19160t();
            if (t.mo8775j()) {
                return t;
            }
            throw AbstractC11686a.AbstractC0372a.m9031l(t);
        }

        /* renamed from: t */
        public C8563h m19160t() {
            C8563h hVar = new C8563h(this);
            int i = this.f18728l;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            hVar.f18719n = this.f18729m;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            hVar.f18720o = this.f18730n;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            hVar.f18721p = this.f18731o;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            hVar.f18722q = this.f18732p;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            hVar.f18723r = this.f18733q;
            if ((this.f18728l & 32) == 32) {
                this.f18734r = Collections.unmodifiableList(this.f18734r);
                this.f18728l &= -33;
            }
            hVar.f18724s = this.f18734r;
            if ((this.f18728l & 64) == 64) {
                this.f18735s = Collections.unmodifiableList(this.f18735s);
                this.f18728l &= -65;
            }
            hVar.f18725t = this.f18735s;
            hVar.f18718m = i2;
            return hVar;
        }

        /* renamed from: u */
        public C8565b mo8846m() {
            return m19158v().mo8844o(m19160t());
        }

        /* renamed from: z */
        public C8565b mo8844o(C8563h hVar) {
            if (hVar == C8563h.m19194G()) {
                return this;
            }
            if (hVar.m19186O()) {
                m19165D(hVar.m19193H());
            }
            if (hVar.m19183R()) {
                m19163F(hVar.m19188M());
            }
            if (hVar.m19187N()) {
                m19166C(hVar.m19195F());
            }
            if (hVar.m19185P()) {
                m19167B(hVar.m19192I());
            }
            if (hVar.m19184Q()) {
                m19164E(hVar.m19191J());
            }
            if (!hVar.f18724s.isEmpty()) {
                if (this.f18734r.isEmpty()) {
                    this.f18734r = hVar.f18724s;
                    this.f18728l &= -33;
                } else {
                    m19157w();
                    this.f18734r.addAll(hVar.f18724s);
                }
            }
            if (!hVar.f18725t.isEmpty()) {
                if (this.f18735s.isEmpty()) {
                    this.f18735s = hVar.f18725t;
                    this.f18728l &= -65;
                } else {
                    m19156x();
                    this.f18735s.addAll(hVar.f18725t);
                }
            }
            m8843q(m8845n().m9017b(hVar.f18717l));
            return this;
        }
    }

    /* renamed from: ih.h$c */
    /* loaded from: classes8.dex */
    public enum EnumC8566c implements C11710j.AbstractC11711a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);
        

        /* renamed from: o */
        private static C11710j.AbstractC11712b<EnumC8566c> f18739o = new C8567a();

        /* renamed from: k */
        private final int f18741k;

        /* renamed from: ih.h$c$a */
        /* loaded from: classes8.dex */
        static class C8567a implements C11710j.AbstractC11712b<EnumC8566c> {
            C8567a() {
            }

            /* renamed from: b */
            public EnumC8566c mo8811a(int i) {
                return EnumC8566c.m19153a(i);
            }
        }

        EnumC8566c(int i, int i2) {
            this.f18741k = i2;
        }

        /* renamed from: a */
        public static EnumC8566c m19153a(int i) {
            if (i == 0) {
                return TRUE;
            }
            if (i == 1) {
                return FALSE;
            }
            if (i != 2) {
                return null;
            }
            return NULL;
        }

        @Override // ph.C11710j.AbstractC11711a
        public final int getNumber() {
            return this.f18741k;
        }
    }

    static {
        C8563h hVar = new C8563h(true);
        f18715w = hVar;
        hVar.m19182S();
    }

    /* renamed from: G */
    public static C8563h m19194G() {
        return f18715w;
    }

    /* renamed from: S */
    private void m19182S() {
        this.f18719n = 0;
        this.f18720o = 0;
        this.f18721p = EnumC8566c.TRUE;
        this.f18722q = C8593q.m18808Y();
        this.f18723r = 0;
        this.f18724s = Collections.emptyList();
        this.f18725t = Collections.emptyList();
    }

    /* renamed from: T */
    public static C8565b m19181T() {
        return C8565b.m19158v();
    }

    /* renamed from: U */
    public static C8565b m19180U(C8563h hVar) {
        return m19181T().mo8844o(hVar);
    }

    /* renamed from: D */
    public C8563h m19197D(int i) {
        return this.f18724s.get(i);
    }

    /* renamed from: E */
    public int m19196E() {
        return this.f18724s.size();
    }

    /* renamed from: F */
    public EnumC8566c m19195F() {
        return this.f18721p;
    }

    /* renamed from: H */
    public int m19193H() {
        return this.f18719n;
    }

    /* renamed from: I */
    public C8593q m19192I() {
        return this.f18722q;
    }

    /* renamed from: J */
    public int m19191J() {
        return this.f18723r;
    }

    /* renamed from: K */
    public C8563h m19190K(int i) {
        return this.f18725t.get(i);
    }

    /* renamed from: L */
    public int m19189L() {
        return this.f18725t.size();
    }

    /* renamed from: M */
    public int m19188M() {
        return this.f18720o;
    }

    /* renamed from: N */
    public boolean m19187N() {
        return (this.f18718m & 4) == 4;
    }

    /* renamed from: O */
    public boolean m19186O() {
        return (this.f18718m & 1) == 1;
    }

    /* renamed from: P */
    public boolean m19185P() {
        return (this.f18718m & 8) == 8;
    }

    /* renamed from: Q */
    public boolean m19184Q() {
        return (this.f18718m & 16) == 16;
    }

    /* renamed from: R */
    public boolean m19183R() {
        return (this.f18718m & 2) == 2;
    }

    /* renamed from: V */
    public C8565b mo8779e() {
        return m19181T();
    }

    /* renamed from: W */
    public C8565b mo8782a() {
        return m19180U(this);
    }

    @Override // ph.AbstractC11724q
    /* renamed from: c */
    public int mo8781c() {
        int i;
        int i2 = this.f18727v;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f18718m & 1) == 1) {
            i = C11695f.m8906o(1, this.f18719n) + 0;
        } else {
            i = 0;
        }
        if ((this.f18718m & 2) == 2) {
            i += C11695f.m8906o(2, this.f18720o);
        }
        if ((this.f18718m & 4) == 4) {
            i += C11695f.m8920h(3, this.f18721p.getNumber());
        }
        if ((this.f18718m & 8) == 8) {
            i += C11695f.m8898s(4, this.f18722q);
        }
        if ((this.f18718m & 16) == 16) {
            i += C11695f.m8906o(5, this.f18723r);
        }
        for (int i3 = 0; i3 < this.f18724s.size(); i3++) {
            i += C11695f.m8898s(6, this.f18724s.get(i3));
        }
        for (int i4 = 0; i4 < this.f18725t.size(); i4++) {
            i += C11695f.m8898s(7, this.f18725t.get(i4));
        }
        int size = i + this.f18717l.size();
        this.f18727v = size;
        return size;
    }

    @Override // ph.AbstractC11724q
    /* renamed from: d */
    public void mo8780d(C11695f fVar) {
        mo8781c();
        if ((this.f18718m & 1) == 1) {
            fVar.m8933a0(1, this.f18719n);
        }
        if ((this.f18718m & 2) == 2) {
            fVar.m8933a0(2, this.f18720o);
        }
        if ((this.f18718m & 4) == 4) {
            fVar.m8942S(3, this.f18721p.getNumber());
        }
        if ((this.f18718m & 8) == 8) {
            fVar.m8927d0(4, this.f18722q);
        }
        if ((this.f18718m & 16) == 16) {
            fVar.m8933a0(5, this.f18723r);
        }
        for (int i = 0; i < this.f18724s.size(); i++) {
            fVar.m8927d0(6, this.f18724s.get(i));
        }
        for (int i2 = 0; i2 < this.f18725t.size(); i2++) {
            fVar.m8927d0(7, this.f18725t.get(i2));
        }
        fVar.m8917i0(this.f18717l);
    }

    @Override // ph.AbstractC11702i, ph.AbstractC11724q
    /* renamed from: h */
    public AbstractC11727s<C8563h> mo8778h() {
        return f18716x;
    }

    @Override // ph.AbstractC11726r
    /* renamed from: j */
    public final boolean mo8775j() {
        byte b = this.f18726u;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m19185P() || m19192I().mo8775j()) {
            for (int i = 0; i < m19196E(); i++) {
                if (!m19197D(i).mo8775j()) {
                    this.f18726u = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < m19189L(); i2++) {
                if (!m19190K(i2).mo8775j()) {
                    this.f18726u = (byte) 0;
                    return false;
                }
            }
            this.f18726u = (byte) 1;
            return true;
        }
        this.f18726u = (byte) 0;
        return false;
    }

    private C8563h(AbstractC11702i.AbstractC11704b bVar) {
        super(bVar);
        this.f18726u = (byte) -1;
        this.f18727v = -1;
        this.f18717l = bVar.m8845n();
    }

    private C8563h(boolean z) {
        this.f18726u = (byte) -1;
        this.f18727v = -1;
        this.f18717l = AbstractC11691d.f26108k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C8563h(C11694e eVar, C11697g gVar) {
        this.f18726u = (byte) -1;
        this.f18727v = -1;
        m19182S();
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
                            this.f18718m |= 1;
                            this.f18719n = eVar.m8968s();
                        } else if (K == 16) {
                            this.f18718m |= 2;
                            this.f18720o = eVar.m8968s();
                        } else if (K == 24) {
                            int n = eVar.m8973n();
                            EnumC8566c a = EnumC8566c.m19153a(n);
                            if (a == null) {
                                J.m8905o0(K);
                                J.m8905o0(n);
                            } else {
                                this.f18718m |= 4;
                                this.f18721p = a;
                            }
                        } else if (K == 34) {
                            C8593q.C8599c B0 = (this.f18718m & 8) == 8 ? this.f18722q.mo8782a() : null;
                            C8593q qVar = (C8593q) eVar.m8966u(C8593q.f38663F, gVar);
                            this.f18722q = qVar;
                            if (B0 != null) {
                                B0.mo8844o(qVar);
                                this.f18722q = B0.m18729x();
                            }
                            this.f18718m |= 8;
                        } else if (K == 40) {
                            this.f18718m |= 16;
                            this.f18723r = eVar.m8968s();
                        } else if (K == 50) {
                            if (!(z2 & true)) {
                                this.f18724s = new ArrayList();
                                z2 |= true;
                            }
                            this.f18724s.add(eVar.m8966u(f18716x, gVar));
                        } else if (K == 58) {
                            if (!(z2 & true)) {
                                this.f18725t = new ArrayList();
                                z2 |= true;
                            }
                            this.f18725t.add(eVar.m8966u(f18716x, gVar));
                        } else if (!mo8836q(eVar, J, gVar, K)) {
                        }
                    }
                    z = true;
                } catch (Throwable th2) {
                    if (z2 & true) {
                        this.f18724s = Collections.unmodifiableList(this.f18724s);
                    }
                    if (z2 & true) {
                        this.f18725t = Collections.unmodifiableList(this.f18725t);
                    }
                    try {
                        J.m8952I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f18717l = w.m9007i();
                        throw th3;
                    }
                    this.f18717l = w.m9007i();
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
            this.f18724s = Collections.unmodifiableList(this.f18724s);
        }
        if (z2 & true) {
            this.f18725t = Collections.unmodifiableList(this.f18725t);
        }
        try {
            J.m8952I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f18717l = w.m9007i();
            throw th4;
        }
        this.f18717l = w.m9007i();
        mo8837n();
    }
}
