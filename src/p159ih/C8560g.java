package p159ih;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.IOException;
import ph.AbstractC11686a;
import ph.AbstractC11687b;
import ph.AbstractC11691d;
import ph.AbstractC11702i;
import ph.AbstractC11727s;
import ph.C11694e;
import ph.C11695f;
import ph.C11697g;
import ph.C11713k;

/* renamed from: ih.g */
/* loaded from: classes8.dex */
public final class C8560g extends AbstractC11702i.AbstractC11706d<C8560g> {

    /* renamed from: r */
    private static final C8560g f18706r;

    /* renamed from: s */
    public static AbstractC11727s<C8560g> f18707s = new C8561a();

    /* renamed from: m */
    private final AbstractC11691d f18708m;

    /* renamed from: n */
    private int f18709n;

    /* renamed from: o */
    private int f18710o;

    /* renamed from: p */
    private byte f18711p;

    /* renamed from: q */
    private int f18712q;

    /* renamed from: ih.g$a */
    /* loaded from: classes8.dex */
    static class C8561a extends AbstractC11687b<C8560g> {
        C8561a() {
        }

        /* renamed from: m */
        public C8560g mo8771d(C11694e eVar, C11697g gVar) {
            return new C8560g(eVar, gVar);
        }
    }

    /* renamed from: ih.g$b */
    /* loaded from: classes8.dex */
    public static final class C8562b extends AbstractC11702i.AbstractC11705c<C8560g, C8562b> {

        /* renamed from: n */
        private int f18713n;

        /* renamed from: o */
        private int f18714o;

        private C8562b() {
            m19209A();
        }

        /* renamed from: A */
        private void m19209A() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public static C8562b m19201z() {
            return new C8562b();
        }

        /* renamed from: B */
        public C8562b mo8844o(C8560g gVar) {
            if (gVar == C8560g.m19219E()) {
                return this;
            }
            if (gVar.m19216H()) {
                m19206D(gVar.m19217G());
            }
            m8839u(gVar);
            m8843q(m8845n().m9017b(gVar.f18708m));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: C */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p159ih.C8560g.C8562b mo9032k(ph.C11694e r3, ph.C11697g r4) {
            /*
                r2 = this;
                r0 = 0
                ph.s<ih.g> r1 = p159ih.C8560g.f18707s     // Catch: all -> 0x000f, k -> 0x0011
                java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                ih.g r3 = (p159ih.C8560g) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                ih.g r4 = (p159ih.C8560g) r4     // Catch: all -> 0x000f
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
            throw new UnsupportedOperationException("Method not decompiled: p159ih.C8560g.C8562b.mo9032k(ph.e, ph.g):ih.g$b");
        }

        /* renamed from: D */
        public C8562b m19206D(int i) {
            this.f18713n |= 1;
            this.f18714o = i;
            return this;
        }

        /* renamed from: w */
        public C8560g build() {
            C8560g x = m19203x();
            if (x.mo8775j()) {
                return x;
            }
            throw AbstractC11686a.AbstractC0372a.m9031l(x);
        }

        /* renamed from: x */
        public C8560g m19203x() {
            C8560g gVar = new C8560g(this);
            int i = 1;
            if ((this.f18713n & 1) != 1) {
                i = 0;
            }
            gVar.f18710o = this.f18714o;
            gVar.f18709n = i;
            return gVar;
        }

        /* renamed from: y */
        public C8562b mo8846m() {
            return m19201z().mo8844o(m19203x());
        }
    }

    static {
        C8560g gVar = new C8560g(true);
        f18706r = gVar;
        gVar.m19215I();
    }

    /* renamed from: E */
    public static C8560g m19219E() {
        return f18706r;
    }

    /* renamed from: I */
    private void m19215I() {
        this.f18710o = 0;
    }

    /* renamed from: J */
    public static C8562b m19214J() {
        return C8562b.m19201z();
    }

    /* renamed from: K */
    public static C8562b m19213K(C8560g gVar) {
        return m19214J().mo8844o(gVar);
    }

    /* renamed from: F */
    public C8560g mo8776f() {
        return f18706r;
    }

    /* renamed from: G */
    public int m19217G() {
        return this.f18710o;
    }

    /* renamed from: H */
    public boolean m19216H() {
        return (this.f18709n & 1) == 1;
    }

    /* renamed from: L */
    public C8562b mo8779e() {
        return m19214J();
    }

    /* renamed from: M */
    public C8562b mo8782a() {
        return m19213K(this);
    }

    @Override // ph.AbstractC11724q
    /* renamed from: c */
    public int mo8781c() {
        int i = this.f18712q;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.f18709n & 1) == 1) {
            i2 = 0 + C11695f.m8906o(1, this.f18710o);
        }
        int u = i2 + m8833u() + this.f18708m.size();
        this.f18712q = u;
        return u;
    }

    @Override // ph.AbstractC11724q
    /* renamed from: d */
    public void mo8780d(C11695f fVar) {
        mo8781c();
        AbstractC11702i.AbstractC11706d<MessageType>.C11707a z = m8828z();
        if ((this.f18709n & 1) == 1) {
            fVar.m8933a0(1, this.f18710o);
        }
        z.m8827a(ItemTouchHelper.AbstractC3083c.DEFAULT_DRAG_ANIMATION_DURATION, fVar);
        fVar.m8917i0(this.f18708m);
    }

    @Override // ph.AbstractC11702i, ph.AbstractC11724q
    /* renamed from: h */
    public AbstractC11727s<C8560g> mo8778h() {
        return f18707s;
    }

    @Override // ph.AbstractC11726r
    /* renamed from: j */
    public final boolean mo8775j() {
        byte b = this.f18711p;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m8834t()) {
            this.f18711p = (byte) 0;
            return false;
        }
        this.f18711p = (byte) 1;
        return true;
    }

    private C8560g(AbstractC11702i.AbstractC11705c<C8560g, ?> cVar) {
        super(cVar);
        this.f18711p = (byte) -1;
        this.f18712q = -1;
        this.f18708m = cVar.m8845n();
    }

    private C8560g(boolean z) {
        this.f18711p = (byte) -1;
        this.f18712q = -1;
        this.f18708m = AbstractC11691d.f26108k;
    }

    private C8560g(C11694e eVar, C11697g gVar) {
        this.f18711p = (byte) -1;
        this.f18712q = -1;
        m19215I();
        AbstractC11691d.C11693b w = AbstractC11691d.m9011w();
        C11695f J = C11695f.m8951J(w, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int K = eVar.m8996K();
                    if (K != 0) {
                        if (K == 8) {
                            this.f18709n |= 1;
                            this.f18710o = eVar.m8968s();
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
                    this.f18708m = w.m9007i();
                    throw th3;
                }
                this.f18708m = w.m9007i();
                mo8837n();
                throw th2;
            }
        }
        try {
            J.m8952I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f18708m = w.m9007i();
            throw th4;
        }
        this.f18708m = w.m9007i();
        mo8837n();
    }
}
