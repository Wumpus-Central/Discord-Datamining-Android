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

/* renamed from: ih.w */
/* loaded from: classes8.dex */
public final class C8621w extends AbstractC11702i implements AbstractC11726r {

    /* renamed from: p */
    private static final C8621w f19035p;

    /* renamed from: q */
    public static AbstractC11727s<C8621w> f19036q = new C8622a();

    /* renamed from: l */
    private final AbstractC11691d f19037l;

    /* renamed from: m */
    private List<C8614v> f19038m;

    /* renamed from: n */
    private byte f19039n;

    /* renamed from: o */
    private int f19040o;

    /* renamed from: ih.w$a */
    /* loaded from: classes8.dex */
    static class C8622a extends AbstractC11687b<C8621w> {
        C8622a() {
        }

        /* renamed from: m */
        public C8621w mo8771d(C11694e eVar, C11697g gVar) {
            return new C8621w(eVar, gVar);
        }
    }

    /* renamed from: ih.w$b */
    /* loaded from: classes8.dex */
    public static final class C8623b extends AbstractC11702i.AbstractC11704b<C8621w, C8623b> implements AbstractC11726r {

        /* renamed from: l */
        private int f19041l;

        /* renamed from: m */
        private List<C8614v> f19042m = Collections.emptyList();

        private C8623b() {
            m18489x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public static C8623b m18491v() {
            return new C8623b();
        }

        /* renamed from: w */
        private void m18490w() {
            if ((this.f19041l & 1) != 1) {
                this.f19042m = new ArrayList(this.f19042m);
                this.f19041l |= 1;
            }
        }

        /* renamed from: x */
        private void m18489x() {
        }

        /* renamed from: s */
        public C8621w build() {
            C8621w t = m18493t();
            if (t.mo8775j()) {
                return t;
            }
            throw AbstractC11686a.AbstractC0372a.m9031l(t);
        }

        /* renamed from: t */
        public C8621w m18493t() {
            C8621w wVar = new C8621w(this);
            if ((this.f19041l & 1) == 1) {
                this.f19042m = Collections.unmodifiableList(this.f19042m);
                this.f19041l &= -2;
            }
            wVar.f19038m = this.f19042m;
            return wVar;
        }

        /* renamed from: u */
        public C8623b mo8846m() {
            return m18491v().mo8844o(m18493t());
        }

        /* renamed from: y */
        public C8623b mo8844o(C8621w wVar) {
            if (wVar == C8621w.m18501v()) {
                return this;
            }
            if (!wVar.f19038m.isEmpty()) {
                if (this.f19042m.isEmpty()) {
                    this.f19042m = wVar.f19038m;
                    this.f19041l &= -2;
                } else {
                    m18490w();
                    this.f19042m.addAll(wVar.f19038m);
                }
            }
            m8843q(m8845n().m9017b(wVar.f19037l));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: z */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p159ih.C8621w.C8623b mo9032k(ph.C11694e r3, ph.C11697g r4) {
            /*
                r2 = this;
                r0 = 0
                ph.s<ih.w> r1 = p159ih.C8621w.f19036q     // Catch: all -> 0x000f, k -> 0x0011
                java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                ih.w r3 = (p159ih.C8621w) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                ih.w r4 = (p159ih.C8621w) r4     // Catch: all -> 0x000f
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
            throw new UnsupportedOperationException("Method not decompiled: p159ih.C8621w.C8623b.mo9032k(ph.e, ph.g):ih.w$b");
        }
    }

    static {
        C8621w wVar = new C8621w(true);
        f19035p = wVar;
        wVar.m18498y();
    }

    /* renamed from: A */
    public static C8623b m18507A(C8621w wVar) {
        return m18497z().mo8844o(wVar);
    }

    /* renamed from: v */
    public static C8621w m18501v() {
        return f19035p;
    }

    /* renamed from: y */
    private void m18498y() {
        this.f19038m = Collections.emptyList();
    }

    /* renamed from: z */
    public static C8623b m18497z() {
        return C8623b.m18491v();
    }

    /* renamed from: B */
    public C8623b mo8779e() {
        return m18497z();
    }

    /* renamed from: C */
    public C8623b mo8782a() {
        return m18507A(this);
    }

    @Override // ph.AbstractC11724q
    /* renamed from: c */
    public int mo8781c() {
        int i = this.f19040o;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f19038m.size(); i3++) {
            i2 += C11695f.m8898s(1, this.f19038m.get(i3));
        }
        int size = i2 + this.f19037l.size();
        this.f19040o = size;
        return size;
    }

    @Override // ph.AbstractC11724q
    /* renamed from: d */
    public void mo8780d(C11695f fVar) {
        mo8781c();
        for (int i = 0; i < this.f19038m.size(); i++) {
            fVar.m8927d0(1, this.f19038m.get(i));
        }
        fVar.m8917i0(this.f19037l);
    }

    @Override // ph.AbstractC11702i, ph.AbstractC11724q
    /* renamed from: h */
    public AbstractC11727s<C8621w> mo8778h() {
        return f19036q;
    }

    @Override // ph.AbstractC11726r
    /* renamed from: j */
    public final boolean mo8775j() {
        byte b = this.f19039n;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f19039n = (byte) 1;
        return true;
    }

    /* renamed from: w */
    public int m18500w() {
        return this.f19038m.size();
    }

    /* renamed from: x */
    public List<C8614v> m18499x() {
        return this.f19038m;
    }

    private C8621w(AbstractC11702i.AbstractC11704b bVar) {
        super(bVar);
        this.f19039n = (byte) -1;
        this.f19040o = -1;
        this.f19037l = bVar.m8845n();
    }

    private C8621w(boolean z) {
        this.f19039n = (byte) -1;
        this.f19040o = -1;
        this.f19037l = AbstractC11691d.f26108k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C8621w(C11694e eVar, C11697g gVar) {
        this.f19039n = (byte) -1;
        this.f19040o = -1;
        m18498y();
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
                                    this.f19038m = new ArrayList();
                                    z2 |= true;
                                }
                                this.f19038m.add(eVar.m8966u(C8614v.f19005w, gVar));
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
                    this.f19038m = Collections.unmodifiableList(this.f19038m);
                }
                try {
                    J.m8952I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f19037l = w.m9007i();
                    throw th3;
                }
                this.f19037l = w.m9007i();
                mo8837n();
                throw th2;
            }
        }
        if (z2 && true) {
            this.f19038m = Collections.unmodifiableList(this.f19038m);
        }
        try {
            J.m8952I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f19037l = w.m9007i();
            throw th4;
        }
        this.f19037l = w.m9007i();
        mo8837n();
    }
}
