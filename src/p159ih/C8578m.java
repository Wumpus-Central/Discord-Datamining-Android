package p159ih;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p159ih.C8575l;
import p159ih.C8584o;
import p159ih.C8590p;
import ph.AbstractC11686a;
import ph.AbstractC11687b;
import ph.AbstractC11691d;
import ph.AbstractC11702i;
import ph.AbstractC11727s;
import ph.C11694e;
import ph.C11695f;
import ph.C11697g;
import ph.C11713k;

/* renamed from: ih.m */
/* loaded from: classes8.dex */
public final class C8578m extends AbstractC11702i.AbstractC11706d<C8578m> {

    /* renamed from: u */
    private static final C8578m f18800u;

    /* renamed from: v */
    public static AbstractC11727s<C8578m> f18801v = new C8579a();

    /* renamed from: m */
    private final AbstractC11691d f18802m;

    /* renamed from: n */
    private int f18803n;

    /* renamed from: o */
    private C8590p f18804o;

    /* renamed from: p */
    private C8584o f18805p;

    /* renamed from: q */
    private C8575l f18806q;

    /* renamed from: r */
    private List<C8544c> f18807r;

    /* renamed from: s */
    private byte f18808s;

    /* renamed from: t */
    private int f18809t;

    /* renamed from: ih.m$a */
    /* loaded from: classes8.dex */
    static class C8579a extends AbstractC11687b<C8578m> {
        C8579a() {
        }

        /* renamed from: m */
        public C8578m mo8771d(C11694e eVar, C11697g gVar) {
            return new C8578m(eVar, gVar);
        }
    }

    /* renamed from: ih.m$b */
    /* loaded from: classes8.dex */
    public static final class C8580b extends AbstractC11702i.AbstractC11705c<C8578m, C8580b> {

        /* renamed from: n */
        private int f18810n;

        /* renamed from: o */
        private C8590p f18811o = C8590p.m18848v();

        /* renamed from: p */
        private C8584o f18812p = C8584o.m18900v();

        /* renamed from: q */
        private C8575l f18813q = C8575l.m19056L();

        /* renamed from: r */
        private List<C8544c> f18814r = Collections.emptyList();

        private C8580b() {
            m18995B();
        }

        /* renamed from: A */
        private void m18996A() {
            if ((this.f18810n & 8) != 8) {
                this.f18814r = new ArrayList(this.f18814r);
                this.f18810n |= 8;
            }
        }

        /* renamed from: B */
        private void m18995B() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public static C8580b m18985z() {
            return new C8580b();
        }

        /* renamed from: C */
        public C8580b mo8844o(C8578m mVar) {
            if (mVar == C8578m.m19011L()) {
                return this;
            }
            if (mVar.m19004S()) {
                m18990G(mVar.m19007P());
            }
            if (mVar.m19005R()) {
                m18991F(mVar.m19008O());
            }
            if (mVar.m19006Q()) {
                m18992E(mVar.m19009N());
            }
            if (!mVar.f18807r.isEmpty()) {
                if (this.f18814r.isEmpty()) {
                    this.f18814r = mVar.f18807r;
                    this.f18810n &= -9;
                } else {
                    m18996A();
                    this.f18814r.addAll(mVar.f18807r);
                }
            }
            m8839u(mVar);
            m8843q(m8845n().m9017b(mVar.f18802m));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: D */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p159ih.C8578m.C8580b mo9032k(ph.C11694e r3, ph.C11697g r4) {
            /*
                r2 = this;
                r0 = 0
                ph.s<ih.m> r1 = p159ih.C8578m.f18801v     // Catch: all -> 0x000f, k -> 0x0011
                java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                ih.m r3 = (p159ih.C8578m) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                ih.m r4 = (p159ih.C8578m) r4     // Catch: all -> 0x000f
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
            throw new UnsupportedOperationException("Method not decompiled: p159ih.C8578m.C8580b.mo9032k(ph.e, ph.g):ih.m$b");
        }

        /* renamed from: E */
        public C8580b m18992E(C8575l lVar) {
            if ((this.f18810n & 4) != 4 || this.f18813q == C8575l.m19056L()) {
                this.f18813q = lVar;
            } else {
                this.f18813q = C8575l.m19039c0(this.f18813q).mo8844o(lVar).m19024x();
            }
            this.f18810n |= 4;
            return this;
        }

        /* renamed from: F */
        public C8580b m18991F(C8584o oVar) {
            if ((this.f18810n & 2) != 2 || this.f18812p == C8584o.m18900v()) {
                this.f18812p = oVar;
            } else {
                this.f18812p = C8584o.m18906A(this.f18812p).mo8844o(oVar).m18892t();
            }
            this.f18810n |= 2;
            return this;
        }

        /* renamed from: G */
        public C8580b m18990G(C8590p pVar) {
            if ((this.f18810n & 1) != 1 || this.f18811o == C8590p.m18848v()) {
                this.f18811o = pVar;
            } else {
                this.f18811o = C8590p.m18854A(this.f18811o).mo8844o(pVar).m18840t();
            }
            this.f18810n |= 1;
            return this;
        }

        /* renamed from: w */
        public C8578m build() {
            C8578m x = m18987x();
            if (x.mo8775j()) {
                return x;
            }
            throw AbstractC11686a.AbstractC0372a.m9031l(x);
        }

        /* renamed from: x */
        public C8578m m18987x() {
            C8578m mVar = new C8578m(this);
            int i = this.f18810n;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            mVar.f18804o = this.f18811o;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            mVar.f18805p = this.f18812p;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            mVar.f18806q = this.f18813q;
            if ((this.f18810n & 8) == 8) {
                this.f18814r = Collections.unmodifiableList(this.f18814r);
                this.f18810n &= -9;
            }
            mVar.f18807r = this.f18814r;
            mVar.f18803n = i2;
            return mVar;
        }

        /* renamed from: y */
        public C8580b mo8846m() {
            return m18985z().mo8844o(m18987x());
        }
    }

    static {
        C8578m mVar = new C8578m(true);
        f18800u = mVar;
        mVar.m19003T();
    }

    /* renamed from: L */
    public static C8578m m19011L() {
        return f18800u;
    }

    /* renamed from: T */
    private void m19003T() {
        this.f18804o = C8590p.m18848v();
        this.f18805p = C8584o.m18900v();
        this.f18806q = C8575l.m19056L();
        this.f18807r = Collections.emptyList();
    }

    /* renamed from: U */
    public static C8580b m19002U() {
        return C8580b.m18985z();
    }

    /* renamed from: V */
    public static C8580b m19001V(C8578m mVar) {
        return m19002U().mo8844o(mVar);
    }

    /* renamed from: X */
    public static C8578m m18999X(InputStream inputStream, C11697g gVar) {
        return f18801v.mo8772c(inputStream, gVar);
    }

    /* renamed from: I */
    public C8544c m19014I(int i) {
        return this.f18807r.get(i);
    }

    /* renamed from: J */
    public int m19013J() {
        return this.f18807r.size();
    }

    /* renamed from: K */
    public List<C8544c> m19012K() {
        return this.f18807r;
    }

    /* renamed from: M */
    public C8578m mo8776f() {
        return f18800u;
    }

    /* renamed from: N */
    public C8575l m19009N() {
        return this.f18806q;
    }

    /* renamed from: O */
    public C8584o m19008O() {
        return this.f18805p;
    }

    /* renamed from: P */
    public C8590p m19007P() {
        return this.f18804o;
    }

    /* renamed from: Q */
    public boolean m19006Q() {
        return (this.f18803n & 4) == 4;
    }

    /* renamed from: R */
    public boolean m19005R() {
        return (this.f18803n & 2) == 2;
    }

    /* renamed from: S */
    public boolean m19004S() {
        return (this.f18803n & 1) == 1;
    }

    /* renamed from: W */
    public C8580b mo8779e() {
        return m19002U();
    }

    /* renamed from: Y */
    public C8580b mo8782a() {
        return m19001V(this);
    }

    @Override // ph.AbstractC11724q
    /* renamed from: c */
    public int mo8781c() {
        int i;
        int i2 = this.f18809t;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f18803n & 1) == 1) {
            i = C11695f.m8898s(1, this.f18804o) + 0;
        } else {
            i = 0;
        }
        if ((this.f18803n & 2) == 2) {
            i += C11695f.m8898s(2, this.f18805p);
        }
        if ((this.f18803n & 4) == 4) {
            i += C11695f.m8898s(3, this.f18806q);
        }
        for (int i3 = 0; i3 < this.f18807r.size(); i3++) {
            i += C11695f.m8898s(4, this.f18807r.get(i3));
        }
        int u = i + m8833u() + this.f18802m.size();
        this.f18809t = u;
        return u;
    }

    @Override // ph.AbstractC11724q
    /* renamed from: d */
    public void mo8780d(C11695f fVar) {
        mo8781c();
        AbstractC11702i.AbstractC11706d<MessageType>.C11707a z = m8828z();
        if ((this.f18803n & 1) == 1) {
            fVar.m8927d0(1, this.f18804o);
        }
        if ((this.f18803n & 2) == 2) {
            fVar.m8927d0(2, this.f18805p);
        }
        if ((this.f18803n & 4) == 4) {
            fVar.m8927d0(3, this.f18806q);
        }
        for (int i = 0; i < this.f18807r.size(); i++) {
            fVar.m8927d0(4, this.f18807r.get(i));
        }
        z.m8827a(ItemTouchHelper.AbstractC3083c.DEFAULT_DRAG_ANIMATION_DURATION, fVar);
        fVar.m8917i0(this.f18802m);
    }

    @Override // ph.AbstractC11702i, ph.AbstractC11724q
    /* renamed from: h */
    public AbstractC11727s<C8578m> mo8778h() {
        return f18801v;
    }

    @Override // ph.AbstractC11726r
    /* renamed from: j */
    public final boolean mo8775j() {
        byte b = this.f18808s;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m19005R() && !m19008O().mo8775j()) {
            this.f18808s = (byte) 0;
            return false;
        } else if (!m19006Q() || m19009N().mo8775j()) {
            for (int i = 0; i < m19013J(); i++) {
                if (!m19014I(i).mo8775j()) {
                    this.f18808s = (byte) 0;
                    return false;
                }
            }
            if (!m8834t()) {
                this.f18808s = (byte) 0;
                return false;
            }
            this.f18808s = (byte) 1;
            return true;
        } else {
            this.f18808s = (byte) 0;
            return false;
        }
    }

    private C8578m(AbstractC11702i.AbstractC11705c<C8578m, ?> cVar) {
        super(cVar);
        this.f18808s = (byte) -1;
        this.f18809t = -1;
        this.f18802m = cVar.m8845n();
    }

    private C8578m(boolean z) {
        this.f18808s = (byte) -1;
        this.f18809t = -1;
        this.f18802m = AbstractC11691d.f26108k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C8578m(C11694e eVar, C11697g gVar) {
        this.f18808s = (byte) -1;
        this.f18809t = -1;
        m19003T();
        AbstractC11691d.C11693b w = AbstractC11691d.m9011w();
        C11695f J = C11695f.m8951J(w, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int K = eVar.m8996K();
                    if (K != 0) {
                        C8575l.C8577b bVar = null;
                        C8590p.C8592b C = null;
                        C8584o.C8586b C2 = null;
                        if (K == 10) {
                            C = (this.f18803n & 1) == 1 ? this.f18804o.mo8782a() : C;
                            C8590p pVar = (C8590p) eVar.m8966u(C8590p.f18870q, gVar);
                            this.f18804o = pVar;
                            if (C != null) {
                                C.mo8844o(pVar);
                                this.f18804o = C.m18840t();
                            }
                            this.f18803n |= 1;
                        } else if (K == 18) {
                            C2 = (this.f18803n & 2) == 2 ? this.f18805p.mo8782a() : C2;
                            C8584o oVar = (C8584o) eVar.m8966u(C8584o.f18843q, gVar);
                            this.f18805p = oVar;
                            if (C2 != null) {
                                C2.mo8844o(oVar);
                                this.f18805p = C2.m18892t();
                            }
                            this.f18803n |= 2;
                        } else if (K == 26) {
                            bVar = (this.f18803n & 4) == 4 ? this.f18806q.mo8782a() : bVar;
                            C8575l lVar = (C8575l) eVar.m8966u(C8575l.f18784w, gVar);
                            this.f18806q = lVar;
                            if (bVar != null) {
                                bVar.mo8844o(lVar);
                                this.f18806q = bVar.m19024x();
                            }
                            this.f18803n |= 4;
                        } else if (K == 34) {
                            boolean z3 = z2 & true;
                            z2 = z2;
                            if (!z3) {
                                this.f18807r = new ArrayList();
                                z2 |= true;
                            }
                            this.f18807r.add(eVar.m8966u(C8544c.f38611V, gVar));
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
                if (z2 & true) {
                    this.f18807r = Collections.unmodifiableList(this.f18807r);
                }
                try {
                    J.m8952I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f18802m = w.m9007i();
                    throw th3;
                }
                this.f18802m = w.m9007i();
                mo8837n();
                throw th2;
            }
        }
        boolean z4 = z2 ? 1 : 0;
        boolean z5 = z2 ? 1 : 0;
        boolean z6 = z2 ? 1 : 0;
        boolean z7 = z2 ? 1 : 0;
        boolean z8 = z2 ? 1 : 0;
        if (z4 & true) {
            this.f18807r = Collections.unmodifiableList(this.f18807r);
        }
        try {
            J.m8952I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f18802m = w.m9007i();
            throw th4;
        }
        this.f18802m = w.m9007i();
        mo8837n();
    }
}
