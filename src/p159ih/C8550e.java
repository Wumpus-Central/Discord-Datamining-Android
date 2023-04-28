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

/* renamed from: ih.e */
/* loaded from: classes8.dex */
public final class C8550e extends AbstractC11702i implements AbstractC11726r {

    /* renamed from: p */
    private static final C8550e f18671p;

    /* renamed from: q */
    public static AbstractC11727s<C8550e> f18672q = new C8551a();

    /* renamed from: l */
    private final AbstractC11691d f18673l;

    /* renamed from: m */
    private List<C8553f> f18674m;

    /* renamed from: n */
    private byte f18675n;

    /* renamed from: o */
    private int f18676o;

    /* renamed from: ih.e$a */
    /* loaded from: classes8.dex */
    static class C8551a extends AbstractC11687b<C8550e> {
        C8551a() {
        }

        /* renamed from: m */
        public C8550e mo8771d(C11694e eVar, C11697g gVar) {
            return new C8550e(eVar, gVar);
        }
    }

    /* renamed from: ih.e$b */
    /* loaded from: classes8.dex */
    public static final class C8552b extends AbstractC11702i.AbstractC11704b<C8550e, C8552b> implements AbstractC11726r {

        /* renamed from: l */
        private int f18677l;

        /* renamed from: m */
        private List<C8553f> f18678m = Collections.emptyList();

        private C8552b() {
            m19263x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public static C8552b m19265v() {
            return new C8552b();
        }

        /* renamed from: w */
        private void m19264w() {
            if ((this.f18677l & 1) != 1) {
                this.f18678m = new ArrayList(this.f18678m);
                this.f18677l |= 1;
            }
        }

        /* renamed from: x */
        private void m19263x() {
        }

        /* renamed from: s */
        public C8550e build() {
            C8550e t = m19267t();
            if (t.mo8775j()) {
                return t;
            }
            throw AbstractC11686a.AbstractC0372a.m9031l(t);
        }

        /* renamed from: t */
        public C8550e m19267t() {
            C8550e eVar = new C8550e(this);
            if ((this.f18677l & 1) == 1) {
                this.f18678m = Collections.unmodifiableList(this.f18678m);
                this.f18677l &= -2;
            }
            eVar.f18674m = this.f18678m;
            return eVar;
        }

        /* renamed from: u */
        public C8552b mo8846m() {
            return m19265v().mo8844o(m19267t());
        }

        /* renamed from: y */
        public C8552b mo8844o(C8550e eVar) {
            if (eVar == C8550e.m19275v()) {
                return this;
            }
            if (!eVar.f18674m.isEmpty()) {
                if (this.f18678m.isEmpty()) {
                    this.f18678m = eVar.f18674m;
                    this.f18677l &= -2;
                } else {
                    m19264w();
                    this.f18678m.addAll(eVar.f18674m);
                }
            }
            m8843q(m8845n().m9017b(eVar.f18673l));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: z */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p159ih.C8550e.C8552b mo9032k(ph.C11694e r3, ph.C11697g r4) {
            /*
                r2 = this;
                r0 = 0
                ph.s<ih.e> r1 = p159ih.C8550e.f18672q     // Catch: all -> 0x000f, k -> 0x0011
                java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                ih.e r3 = (p159ih.C8550e) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                ih.e r4 = (p159ih.C8550e) r4     // Catch: all -> 0x000f
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
            throw new UnsupportedOperationException("Method not decompiled: p159ih.C8550e.C8552b.mo9032k(ph.e, ph.g):ih.e$b");
        }
    }

    static {
        C8550e eVar = new C8550e(true);
        f18671p = eVar;
        eVar.m19272y();
    }

    /* renamed from: A */
    public static C8552b m19281A(C8550e eVar) {
        return m19271z().mo8844o(eVar);
    }

    /* renamed from: v */
    public static C8550e m19275v() {
        return f18671p;
    }

    /* renamed from: y */
    private void m19272y() {
        this.f18674m = Collections.emptyList();
    }

    /* renamed from: z */
    public static C8552b m19271z() {
        return C8552b.m19265v();
    }

    /* renamed from: B */
    public C8552b mo8779e() {
        return m19271z();
    }

    /* renamed from: C */
    public C8552b mo8782a() {
        return m19281A(this);
    }

    @Override // ph.AbstractC11724q
    /* renamed from: c */
    public int mo8781c() {
        int i = this.f18676o;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f18674m.size(); i3++) {
            i2 += C11695f.m8898s(1, this.f18674m.get(i3));
        }
        int size = i2 + this.f18673l.size();
        this.f18676o = size;
        return size;
    }

    @Override // ph.AbstractC11724q
    /* renamed from: d */
    public void mo8780d(C11695f fVar) {
        mo8781c();
        for (int i = 0; i < this.f18674m.size(); i++) {
            fVar.m8927d0(1, this.f18674m.get(i));
        }
        fVar.m8917i0(this.f18673l);
    }

    @Override // ph.AbstractC11702i, ph.AbstractC11724q
    /* renamed from: h */
    public AbstractC11727s<C8550e> mo8778h() {
        return f18672q;
    }

    @Override // ph.AbstractC11726r
    /* renamed from: j */
    public final boolean mo8775j() {
        byte b = this.f18675n;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < m19273x(); i++) {
            if (!m19274w(i).mo8775j()) {
                this.f18675n = (byte) 0;
                return false;
            }
        }
        this.f18675n = (byte) 1;
        return true;
    }

    /* renamed from: w */
    public C8553f m19274w(int i) {
        return this.f18674m.get(i);
    }

    /* renamed from: x */
    public int m19273x() {
        return this.f18674m.size();
    }

    private C8550e(AbstractC11702i.AbstractC11704b bVar) {
        super(bVar);
        this.f18675n = (byte) -1;
        this.f18676o = -1;
        this.f18673l = bVar.m8845n();
    }

    private C8550e(boolean z) {
        this.f18675n = (byte) -1;
        this.f18676o = -1;
        this.f18673l = AbstractC11691d.f26108k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C8550e(C11694e eVar, C11697g gVar) {
        this.f18675n = (byte) -1;
        this.f18676o = -1;
        m19272y();
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
                                    this.f18674m = new ArrayList();
                                    z2 |= true;
                                }
                                this.f18674m.add(eVar.m8966u(C8553f.f18680u, gVar));
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
                    this.f18674m = Collections.unmodifiableList(this.f18674m);
                }
                try {
                    J.m8952I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f18673l = w.m9007i();
                    throw th3;
                }
                this.f18673l = w.m9007i();
                mo8837n();
                throw th2;
            }
        }
        if (z2 && true) {
            this.f18674m = Collections.unmodifiableList(this.f18674m);
        }
        try {
            J.m8952I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f18673l = w.m9007i();
            throw th4;
        }
        this.f18673l = w.m9007i();
        mo8837n();
    }
}
