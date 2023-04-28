package p159ih;

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
import ph.C11713k;

/* renamed from: ih.d */
/* loaded from: classes8.dex */
public final class C8547d extends AbstractC11702i.AbstractC11706d<C8547d> {

    /* renamed from: t */
    private static final C8547d f18658t;

    /* renamed from: u */
    public static AbstractC11727s<C8547d> f18659u = new C8548a();

    /* renamed from: m */
    private final AbstractC11691d f18660m;

    /* renamed from: n */
    private int f18661n;

    /* renamed from: o */
    private int f18662o;

    /* renamed from: p */
    private List<C8611u> f18663p;

    /* renamed from: q */
    private List<Integer> f18664q;

    /* renamed from: r */
    private byte f18665r;

    /* renamed from: s */
    private int f18666s;

    /* renamed from: ih.d$a */
    /* loaded from: classes8.dex */
    static class C8548a extends AbstractC11687b<C8547d> {
        C8548a() {
        }

        /* renamed from: m */
        public C8547d mo8771d(C11694e eVar, C11697g gVar) {
            return new C8547d(eVar, gVar);
        }
    }

    /* renamed from: ih.d$b */
    /* loaded from: classes8.dex */
    public static final class C8549b extends AbstractC11702i.AbstractC11705c<C8547d, C8549b> {

        /* renamed from: n */
        private int f18667n;

        /* renamed from: o */
        private int f18668o = 6;

        /* renamed from: p */
        private List<C8611u> f18669p = Collections.emptyList();

        /* renamed from: q */
        private List<Integer> f18670q = Collections.emptyList();

        private C8549b() {
            m19290C();
        }

        /* renamed from: A */
        private void m19292A() {
            if ((this.f18667n & 2) != 2) {
                this.f18669p = new ArrayList(this.f18669p);
                this.f18667n |= 2;
            }
        }

        /* renamed from: B */
        private void m19291B() {
            if ((this.f18667n & 4) != 4) {
                this.f18670q = new ArrayList(this.f18670q);
                this.f18667n |= 4;
            }
        }

        /* renamed from: C */
        private void m19290C() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public static C8549b m19282z() {
            return new C8549b();
        }

        /* renamed from: D */
        public C8549b mo8844o(C8547d dVar) {
            if (dVar == C8547d.m19306I()) {
                return this;
            }
            if (dVar.m19299P()) {
                m19287F(dVar.m19304K());
            }
            if (!dVar.f18663p.isEmpty()) {
                if (this.f18669p.isEmpty()) {
                    this.f18669p = dVar.f18663p;
                    this.f18667n &= -3;
                } else {
                    m19292A();
                    this.f18669p.addAll(dVar.f18663p);
                }
            }
            if (!dVar.f18664q.isEmpty()) {
                if (this.f18670q.isEmpty()) {
                    this.f18670q = dVar.f18664q;
                    this.f18667n &= -5;
                } else {
                    m19291B();
                    this.f18670q.addAll(dVar.f18664q);
                }
            }
            m8839u(dVar);
            m8843q(m8845n().m9017b(dVar.f18660m));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: E */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p159ih.C8547d.C8549b mo9032k(ph.C11694e r3, ph.C11697g r4) {
            /*
                r2 = this;
                r0 = 0
                ph.s<ih.d> r1 = p159ih.C8547d.f18659u     // Catch: all -> 0x000f, k -> 0x0011
                java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                ih.d r3 = (p159ih.C8547d) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                ih.d r4 = (p159ih.C8547d) r4     // Catch: all -> 0x000f
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
            throw new UnsupportedOperationException("Method not decompiled: p159ih.C8547d.C8549b.mo9032k(ph.e, ph.g):ih.d$b");
        }

        /* renamed from: F */
        public C8549b m19287F(int i) {
            this.f18667n |= 1;
            this.f18668o = i;
            return this;
        }

        /* renamed from: w */
        public C8547d build() {
            C8547d x = m19284x();
            if (x.mo8775j()) {
                return x;
            }
            throw AbstractC11686a.AbstractC0372a.m9031l(x);
        }

        /* renamed from: x */
        public C8547d m19284x() {
            C8547d dVar = new C8547d(this);
            int i = 1;
            if ((this.f18667n & 1) != 1) {
                i = 0;
            }
            dVar.f18662o = this.f18668o;
            if ((this.f18667n & 2) == 2) {
                this.f18669p = Collections.unmodifiableList(this.f18669p);
                this.f18667n &= -3;
            }
            dVar.f18663p = this.f18669p;
            if ((this.f18667n & 4) == 4) {
                this.f18670q = Collections.unmodifiableList(this.f18670q);
                this.f18667n &= -5;
            }
            dVar.f18664q = this.f18670q;
            dVar.f18661n = i;
            return dVar;
        }

        /* renamed from: y */
        public C8549b mo8846m() {
            return m19282z().mo8844o(m19284x());
        }
    }

    static {
        C8547d dVar = new C8547d(true);
        f18658t = dVar;
        dVar.m19298Q();
    }

    /* renamed from: I */
    public static C8547d m19306I() {
        return f18658t;
    }

    /* renamed from: Q */
    private void m19298Q() {
        this.f18662o = 6;
        this.f18663p = Collections.emptyList();
        this.f18664q = Collections.emptyList();
    }

    /* renamed from: R */
    public static C8549b m19297R() {
        return C8549b.m19282z();
    }

    /* renamed from: S */
    public static C8549b m19296S(C8547d dVar) {
        return m19297R().mo8844o(dVar);
    }

    /* renamed from: J */
    public C8547d mo8776f() {
        return f18658t;
    }

    /* renamed from: K */
    public int m19304K() {
        return this.f18662o;
    }

    /* renamed from: L */
    public C8611u m19303L(int i) {
        return this.f18663p.get(i);
    }

    /* renamed from: M */
    public int m19302M() {
        return this.f18663p.size();
    }

    /* renamed from: N */
    public List<C8611u> m19301N() {
        return this.f18663p;
    }

    /* renamed from: O */
    public List<Integer> m19300O() {
        return this.f18664q;
    }

    /* renamed from: P */
    public boolean m19299P() {
        return (this.f18661n & 1) == 1;
    }

    /* renamed from: T */
    public C8549b mo8779e() {
        return m19297R();
    }

    /* renamed from: U */
    public C8549b mo8782a() {
        return m19296S(this);
    }

    @Override // ph.AbstractC11724q
    /* renamed from: c */
    public int mo8781c() {
        int i;
        int i2 = this.f18666s;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f18661n & 1) == 1) {
            i = C11695f.m8906o(1, this.f18662o) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.f18663p.size(); i3++) {
            i += C11695f.m8898s(2, this.f18663p.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f18664q.size(); i5++) {
            i4 += C11695f.m8904p(this.f18664q.get(i5).intValue());
        }
        int size = i + i4 + (m19300O().size() * 2) + m8833u() + this.f18660m.size();
        this.f18666s = size;
        return size;
    }

    @Override // ph.AbstractC11724q
    /* renamed from: d */
    public void mo8780d(C11695f fVar) {
        mo8781c();
        AbstractC11702i.AbstractC11706d<MessageType>.C11707a z = m8828z();
        if ((this.f18661n & 1) == 1) {
            fVar.m8933a0(1, this.f18662o);
        }
        for (int i = 0; i < this.f18663p.size(); i++) {
            fVar.m8927d0(2, this.f18663p.get(i));
        }
        for (int i2 = 0; i2 < this.f18664q.size(); i2++) {
            fVar.m8933a0(31, this.f18664q.get(i2).intValue());
        }
        z.m8827a(19000, fVar);
        fVar.m8917i0(this.f18660m);
    }

    @Override // ph.AbstractC11702i, ph.AbstractC11724q
    /* renamed from: h */
    public AbstractC11727s<C8547d> mo8778h() {
        return f18659u;
    }

    @Override // ph.AbstractC11726r
    /* renamed from: j */
    public final boolean mo8775j() {
        byte b = this.f18665r;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < m19302M(); i++) {
            if (!m19303L(i).mo8775j()) {
                this.f18665r = (byte) 0;
                return false;
            }
        }
        if (!m8834t()) {
            this.f18665r = (byte) 0;
            return false;
        }
        this.f18665r = (byte) 1;
        return true;
    }

    private C8547d(AbstractC11702i.AbstractC11705c<C8547d, ?> cVar) {
        super(cVar);
        this.f18665r = (byte) -1;
        this.f18666s = -1;
        this.f18660m = cVar.m8845n();
    }

    private C8547d(boolean z) {
        this.f18665r = (byte) -1;
        this.f18666s = -1;
        this.f18660m = AbstractC11691d.f26108k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C8547d(C11694e eVar, C11697g gVar) {
        this.f18665r = (byte) -1;
        this.f18666s = -1;
        m19298Q();
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
                                this.f18661n |= 1;
                                this.f18662o = eVar.m8968s();
                            } else if (K == 18) {
                                if (!(z2 & true)) {
                                    this.f18663p = new ArrayList();
                                    z2 |= true;
                                }
                                this.f18663p.add(eVar.m8966u(C8611u.f18986x, gVar));
                            } else if (K == 248) {
                                if (!(z2 & true)) {
                                    this.f18664q = new ArrayList();
                                    z2 |= true;
                                }
                                this.f18664q.add(Integer.valueOf(eVar.m8968s()));
                            } else if (K == 250) {
                                int j = eVar.m8977j(eVar.m9006A());
                                if (!(z2 & true) && eVar.m8982e() > 0) {
                                    this.f18664q = new ArrayList();
                                    z2 |= true;
                                }
                                while (eVar.m8982e() > 0) {
                                    this.f18664q.add(Integer.valueOf(eVar.m8968s()));
                                }
                                eVar.m8978i(j);
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
                    this.f18663p = Collections.unmodifiableList(this.f18663p);
                }
                if (z2 & true) {
                    this.f18664q = Collections.unmodifiableList(this.f18664q);
                }
                try {
                    J.m8952I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f18660m = w.m9007i();
                    throw th3;
                }
                this.f18660m = w.m9007i();
                mo8837n();
                throw th2;
            }
        }
        if (z2 & true) {
            this.f18663p = Collections.unmodifiableList(this.f18663p);
        }
        if (z2 & true) {
            this.f18664q = Collections.unmodifiableList(this.f18664q);
        }
        try {
            J.m8952I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f18660m = w.m9007i();
            throw th4;
        }
        this.f18660m = w.m9007i();
        mo8837n();
    }
}
