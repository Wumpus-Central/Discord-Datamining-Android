package p159ih;

import androidx.recyclerview.widget.RecyclerView;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p163j$.util.Spliterator;
import ph.AbstractC11686a;
import ph.AbstractC11687b;
import ph.AbstractC11691d;
import ph.AbstractC11702i;
import ph.AbstractC11727s;
import ph.C11694e;
import ph.C11695f;
import ph.C11697g;

/* renamed from: ih.i */
/* loaded from: classes8.dex */
public final class C8568i extends AbstractC11702i.AbstractC11706d<C8568i> {

    /* renamed from: F */
    private static final C8568i f38644F;

    /* renamed from: G */
    public static AbstractC11727s<C8568i> f38645G = new C8569a();

    /* renamed from: A */
    private C8608t f38646A;

    /* renamed from: B */
    private List<Integer> f38647B;

    /* renamed from: C */
    private C8550e f38648C;

    /* renamed from: D */
    private byte f38649D;

    /* renamed from: E */
    private int f38650E;

    /* renamed from: m */
    private final AbstractC11691d f18742m;

    /* renamed from: n */
    private int f18743n;

    /* renamed from: o */
    private int f18744o;

    /* renamed from: p */
    private int f18745p;

    /* renamed from: q */
    private int f18746q;

    /* renamed from: r */
    private C8593q f18747r;

    /* renamed from: s */
    private int f18748s;

    /* renamed from: t */
    private List<C8603s> f18749t;

    /* renamed from: u */
    private C8593q f18750u;

    /* renamed from: v */
    private int f18751v;

    /* renamed from: w */
    private List<C8593q> f18752w;

    /* renamed from: x */
    private List<Integer> f18753x;

    /* renamed from: y */
    private int f18754y;

    /* renamed from: z */
    private List<C8611u> f18755z;

    /* renamed from: ih.i$a */
    /* loaded from: classes8.dex */
    static class C8569a extends AbstractC11687b<C8568i> {
        C8569a() {
        }

        /* renamed from: m */
        public C8568i mo8771d(C11694e eVar, C11697g gVar) {
            return new C8568i(eVar, gVar);
        }
    }

    /* renamed from: ih.i$b */
    /* loaded from: classes8.dex */
    public static final class C8570b extends AbstractC11702i.AbstractC11705c<C8568i, C8570b> {

        /* renamed from: n */
        private int f18756n;

        /* renamed from: q */
        private int f18759q;

        /* renamed from: s */
        private int f18761s;

        /* renamed from: v */
        private int f18764v;

        /* renamed from: o */
        private int f18757o = 6;

        /* renamed from: p */
        private int f18758p = 6;

        /* renamed from: r */
        private C8593q f18760r = C8593q.m18808Y();

        /* renamed from: t */
        private List<C8603s> f18762t = Collections.emptyList();

        /* renamed from: u */
        private C8593q f18763u = C8593q.m18808Y();

        /* renamed from: w */
        private List<C8593q> f18765w = Collections.emptyList();

        /* renamed from: x */
        private List<Integer> f18766x = Collections.emptyList();

        /* renamed from: y */
        private List<C8611u> f18767y = Collections.emptyList();

        /* renamed from: z */
        private C8608t f18768z = C8608t.m18608x();

        /* renamed from: A */
        private List<Integer> f38651A = Collections.emptyList();

        /* renamed from: B */
        private C8550e f38652B = C8550e.m19275v();

        private C8570b() {
            m19087F();
        }

        /* renamed from: A */
        private void m19092A() {
            if ((this.f18756n & 512) != 512) {
                this.f18766x = new ArrayList(this.f18766x);
                this.f18756n |= 512;
            }
        }

        /* renamed from: B */
        private void m19091B() {
            if ((this.f18756n & Spliterator.NONNULL) != 256) {
                this.f18765w = new ArrayList(this.f18765w);
                this.f18756n |= Spliterator.NONNULL;
            }
        }

        /* renamed from: C */
        private void m19090C() {
            if ((this.f18756n & 32) != 32) {
                this.f18762t = new ArrayList(this.f18762t);
                this.f18756n |= 32;
            }
        }

        /* renamed from: D */
        private void m19089D() {
            if ((this.f18756n & Spliterator.IMMUTABLE) != 1024) {
                this.f18767y = new ArrayList(this.f18767y);
                this.f18756n |= Spliterator.IMMUTABLE;
            }
        }

        /* renamed from: E */
        private void m19088E() {
            if ((this.f18756n & 4096) != 4096) {
                this.f38651A = new ArrayList(this.f38651A);
                this.f18756n |= 4096;
            }
        }

        /* renamed from: F */
        private void m19087F() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public static C8570b m19071z() {
            return new C8570b();
        }

        /* renamed from: G */
        public C8570b m19086G(C8550e eVar) {
            if ((this.f18756n & 8192) != 8192 || this.f38652B == C8550e.m19275v()) {
                this.f38652B = eVar;
            } else {
                this.f38652B = C8550e.m19281A(this.f38652B).mo8844o(eVar).m19267t();
            }
            this.f18756n |= 8192;
            return this;
        }

        /* renamed from: H */
        public C8570b mo8844o(C8568i iVar) {
            if (iVar == C8568i.m19118b0()) {
                return this;
            }
            if (iVar.m19100t0()) {
                m19080M(iVar.m19116d0());
            }
            if (iVar.m19098v0()) {
                m19078O(iVar.m19114f0());
            }
            if (iVar.m19099u0()) {
                m19079N(iVar.m19115e0());
            }
            if (iVar.m19095y0()) {
                m19082K(iVar.m19111i0());
            }
            if (iVar.m19094z0()) {
                m19076Q(iVar.m19110j0());
            }
            if (!iVar.f18749t.isEmpty()) {
                if (this.f18762t.isEmpty()) {
                    this.f18762t = iVar.f18749t;
                    this.f18756n &= -33;
                } else {
                    m19090C();
                    this.f18762t.addAll(iVar.f18749t);
                }
            }
            if (iVar.m19097w0()) {
                m19083J(iVar.m19113g0());
            }
            if (iVar.m19096x0()) {
                m19077P(iVar.m19112h0());
            }
            if (!iVar.f18752w.isEmpty()) {
                if (this.f18765w.isEmpty()) {
                    this.f18765w = iVar.f18752w;
                    this.f18756n &= -257;
                } else {
                    m19091B();
                    this.f18765w.addAll(iVar.f18752w);
                }
            }
            if (!iVar.f18753x.isEmpty()) {
                if (this.f18766x.isEmpty()) {
                    this.f18766x = iVar.f18753x;
                    this.f18756n &= -513;
                } else {
                    m19092A();
                    this.f18766x.addAll(iVar.f18753x);
                }
            }
            if (!iVar.f18755z.isEmpty()) {
                if (this.f18767y.isEmpty()) {
                    this.f18767y = iVar.f18755z;
                    this.f18756n &= -1025;
                } else {
                    m19089D();
                    this.f18767y.addAll(iVar.f18755z);
                }
            }
            if (iVar.m19151A0()) {
                m19081L(iVar.m19106n0());
            }
            if (!iVar.f38647B.isEmpty()) {
                if (this.f38651A.isEmpty()) {
                    this.f38651A = iVar.f38647B;
                    this.f18756n &= -4097;
                } else {
                    m19088E();
                    this.f38651A.addAll(iVar.f38647B);
                }
            }
            if (iVar.m19101s0()) {
                m19086G(iVar.m19119a0());
            }
            m8839u(iVar);
            m8843q(m8845n().m9017b(iVar.f18742m));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: I */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p159ih.C8568i.C8570b mo9032k(ph.C11694e r3, ph.C11697g r4) {
            /*
                r2 = this;
                r0 = 0
                ph.s<ih.i> r1 = p159ih.C8568i.f38645G     // Catch: all -> 0x000f, k -> 0x0011
                java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                ih.i r3 = (p159ih.C8568i) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                ih.i r4 = (p159ih.C8568i) r4     // Catch: all -> 0x000f
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
            throw new UnsupportedOperationException("Method not decompiled: p159ih.C8568i.C8570b.mo9032k(ph.e, ph.g):ih.i$b");
        }

        /* renamed from: J */
        public C8570b m19083J(C8593q qVar) {
            if ((this.f18756n & 64) != 64 || this.f18763u == C8593q.m18808Y()) {
                this.f18763u = qVar;
            } else {
                this.f18763u = C8593q.m18781z0(this.f18763u).mo8844o(qVar).m18729x();
            }
            this.f18756n |= 64;
            return this;
        }

        /* renamed from: K */
        public C8570b m19082K(C8593q qVar) {
            if ((this.f18756n & 8) != 8 || this.f18760r == C8593q.m18808Y()) {
                this.f18760r = qVar;
            } else {
                this.f18760r = C8593q.m18781z0(this.f18760r).mo8844o(qVar).m18729x();
            }
            this.f18756n |= 8;
            return this;
        }

        /* renamed from: L */
        public C8570b m19081L(C8608t tVar) {
            if ((this.f18756n & RecyclerView.ItemAnimator.FLAG_MOVED) != 2048 || this.f18768z == C8608t.m18608x()) {
                this.f18768z = tVar;
            } else {
                this.f18768z = C8608t.m18616F(this.f18768z).mo8844o(tVar).m18601t();
            }
            this.f18756n |= RecyclerView.ItemAnimator.FLAG_MOVED;
            return this;
        }

        /* renamed from: M */
        public C8570b m19080M(int i) {
            this.f18756n |= 1;
            this.f18757o = i;
            return this;
        }

        /* renamed from: N */
        public C8570b m19079N(int i) {
            this.f18756n |= 4;
            this.f18759q = i;
            return this;
        }

        /* renamed from: O */
        public C8570b m19078O(int i) {
            this.f18756n |= 2;
            this.f18758p = i;
            return this;
        }

        /* renamed from: P */
        public C8570b m19077P(int i) {
            this.f18756n |= 128;
            this.f18764v = i;
            return this;
        }

        /* renamed from: Q */
        public C8570b m19076Q(int i) {
            this.f18756n |= 16;
            this.f18761s = i;
            return this;
        }

        /* renamed from: w */
        public C8568i build() {
            C8568i x = m19073x();
            if (x.mo8775j()) {
                return x;
            }
            throw AbstractC11686a.AbstractC0372a.m9031l(x);
        }

        /* renamed from: x */
        public C8568i m19073x() {
            C8568i iVar = new C8568i(this);
            int i = this.f18756n;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            iVar.f18744o = this.f18757o;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            iVar.f18745p = this.f18758p;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            iVar.f18746q = this.f18759q;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            iVar.f18747r = this.f18760r;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            iVar.f18748s = this.f18761s;
            if ((this.f18756n & 32) == 32) {
                this.f18762t = Collections.unmodifiableList(this.f18762t);
                this.f18756n &= -33;
            }
            iVar.f18749t = this.f18762t;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            iVar.f18750u = this.f18763u;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            iVar.f18751v = this.f18764v;
            if ((this.f18756n & Spliterator.NONNULL) == 256) {
                this.f18765w = Collections.unmodifiableList(this.f18765w);
                this.f18756n &= -257;
            }
            iVar.f18752w = this.f18765w;
            if ((this.f18756n & 512) == 512) {
                this.f18766x = Collections.unmodifiableList(this.f18766x);
                this.f18756n &= -513;
            }
            iVar.f18753x = this.f18766x;
            if ((this.f18756n & Spliterator.IMMUTABLE) == 1024) {
                this.f18767y = Collections.unmodifiableList(this.f18767y);
                this.f18756n &= -1025;
            }
            iVar.f18755z = this.f18767y;
            if ((i & RecyclerView.ItemAnimator.FLAG_MOVED) == 2048) {
                i2 |= 128;
            }
            iVar.f38646A = this.f18768z;
            if ((this.f18756n & 4096) == 4096) {
                this.f38651A = Collections.unmodifiableList(this.f38651A);
                this.f18756n &= -4097;
            }
            iVar.f38647B = this.f38651A;
            if ((i & 8192) == 8192) {
                i2 |= Spliterator.NONNULL;
            }
            iVar.f38648C = this.f38652B;
            iVar.f18743n = i2;
            return iVar;
        }

        /* renamed from: y */
        public C8570b mo8846m() {
            return m19071z().mo8844o(m19073x());
        }
    }

    static {
        C8568i iVar = new C8568i(true);
        f38644F = iVar;
        iVar.m19149B0();
    }

    /* renamed from: B0 */
    private void m19149B0() {
        this.f18744o = 6;
        this.f18745p = 6;
        this.f18746q = 0;
        this.f18747r = C8593q.m18808Y();
        this.f18748s = 0;
        this.f18749t = Collections.emptyList();
        this.f18750u = C8593q.m18808Y();
        this.f18751v = 0;
        this.f18752w = Collections.emptyList();
        this.f18753x = Collections.emptyList();
        this.f18755z = Collections.emptyList();
        this.f38646A = C8608t.m18608x();
        this.f38647B = Collections.emptyList();
        this.f38648C = C8550e.m19275v();
    }

    /* renamed from: C0 */
    public static C8570b m19147C0() {
        return C8570b.m19071z();
    }

    /* renamed from: D0 */
    public static C8570b m19145D0(C8568i iVar) {
        return m19147C0().mo8844o(iVar);
    }

    /* renamed from: F0 */
    public static C8568i m19141F0(InputStream inputStream, C11697g gVar) {
        return f38645G.mo8772c(inputStream, gVar);
    }

    /* renamed from: b0 */
    public static C8568i m19118b0() {
        return f38644F;
    }

    /* renamed from: A0 */
    public boolean m19151A0() {
        return (this.f18743n & 128) == 128;
    }

    /* renamed from: E0 */
    public C8570b mo8779e() {
        return m19147C0();
    }

    /* renamed from: G0 */
    public C8570b mo8782a() {
        return m19145D0(this);
    }

    /* renamed from: W */
    public C8593q m19123W(int i) {
        return this.f18752w.get(i);
    }

    /* renamed from: X */
    public int m19122X() {
        return this.f18752w.size();
    }

    /* renamed from: Y */
    public List<Integer> m19121Y() {
        return this.f18753x;
    }

    /* renamed from: Z */
    public List<C8593q> m19120Z() {
        return this.f18752w;
    }

    /* renamed from: a0 */
    public C8550e m19119a0() {
        return this.f38648C;
    }

    @Override // ph.AbstractC11724q
    /* renamed from: c */
    public int mo8781c() {
        int i;
        int i2 = this.f38650E;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f18743n & 2) == 2) {
            i = C11695f.m8906o(1, this.f18745p) + 0;
        } else {
            i = 0;
        }
        if ((this.f18743n & 4) == 4) {
            i += C11695f.m8906o(2, this.f18746q);
        }
        if ((this.f18743n & 8) == 8) {
            i += C11695f.m8898s(3, this.f18747r);
        }
        for (int i3 = 0; i3 < this.f18749t.size(); i3++) {
            i += C11695f.m8898s(4, this.f18749t.get(i3));
        }
        if ((this.f18743n & 32) == 32) {
            i += C11695f.m8898s(5, this.f18750u);
        }
        for (int i4 = 0; i4 < this.f18755z.size(); i4++) {
            i += C11695f.m8898s(6, this.f18755z.get(i4));
        }
        if ((this.f18743n & 16) == 16) {
            i += C11695f.m8906o(7, this.f18748s);
        }
        if ((this.f18743n & 64) == 64) {
            i += C11695f.m8906o(8, this.f18751v);
        }
        if ((this.f18743n & 1) == 1) {
            i += C11695f.m8906o(9, this.f18744o);
        }
        for (int i5 = 0; i5 < this.f18752w.size(); i5++) {
            i += C11695f.m8898s(10, this.f18752w.get(i5));
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.f18753x.size(); i7++) {
            i6 += C11695f.m8904p(this.f18753x.get(i7).intValue());
        }
        int i8 = i + i6;
        if (!m19121Y().isEmpty()) {
            i8 = i8 + 1 + C11695f.m8904p(i6);
        }
        this.f18754y = i6;
        if ((this.f18743n & 128) == 128) {
            i8 += C11695f.m8898s(30, this.f38646A);
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f38647B.size(); i10++) {
            i9 += C11695f.m8904p(this.f38647B.get(i10).intValue());
        }
        int size = i8 + i9 + (m19102r0().size() * 2);
        if ((this.f18743n & Spliterator.NONNULL) == 256) {
            size += C11695f.m8898s(32, this.f38648C);
        }
        int u = size + m8833u() + this.f18742m.size();
        this.f38650E = u;
        return u;
    }

    /* renamed from: c0 */
    public C8568i mo8776f() {
        return f38644F;
    }

    @Override // ph.AbstractC11724q
    /* renamed from: d */
    public void mo8780d(C11695f fVar) {
        mo8781c();
        AbstractC11702i.AbstractC11706d<MessageType>.C11707a z = m8828z();
        if ((this.f18743n & 2) == 2) {
            fVar.m8933a0(1, this.f18745p);
        }
        if ((this.f18743n & 4) == 4) {
            fVar.m8933a0(2, this.f18746q);
        }
        if ((this.f18743n & 8) == 8) {
            fVar.m8927d0(3, this.f18747r);
        }
        for (int i = 0; i < this.f18749t.size(); i++) {
            fVar.m8927d0(4, this.f18749t.get(i));
        }
        if ((this.f18743n & 32) == 32) {
            fVar.m8927d0(5, this.f18750u);
        }
        for (int i2 = 0; i2 < this.f18755z.size(); i2++) {
            fVar.m8927d0(6, this.f18755z.get(i2));
        }
        if ((this.f18743n & 16) == 16) {
            fVar.m8933a0(7, this.f18748s);
        }
        if ((this.f18743n & 64) == 64) {
            fVar.m8933a0(8, this.f18751v);
        }
        if ((this.f18743n & 1) == 1) {
            fVar.m8933a0(9, this.f18744o);
        }
        for (int i3 = 0; i3 < this.f18752w.size(); i3++) {
            fVar.m8927d0(10, this.f18752w.get(i3));
        }
        if (m19121Y().size() > 0) {
            fVar.m8905o0(90);
            fVar.m8905o0(this.f18754y);
        }
        for (int i4 = 0; i4 < this.f18753x.size(); i4++) {
            fVar.m8931b0(this.f18753x.get(i4).intValue());
        }
        if ((this.f18743n & 128) == 128) {
            fVar.m8927d0(30, this.f38646A);
        }
        for (int i5 = 0; i5 < this.f38647B.size(); i5++) {
            fVar.m8933a0(31, this.f38647B.get(i5).intValue());
        }
        if ((this.f18743n & Spliterator.NONNULL) == 256) {
            fVar.m8927d0(32, this.f38648C);
        }
        z.m8827a(19000, fVar);
        fVar.m8917i0(this.f18742m);
    }

    /* renamed from: d0 */
    public int m19116d0() {
        return this.f18744o;
    }

    /* renamed from: e0 */
    public int m19115e0() {
        return this.f18746q;
    }

    /* renamed from: f0 */
    public int m19114f0() {
        return this.f18745p;
    }

    /* renamed from: g0 */
    public C8593q m19113g0() {
        return this.f18750u;
    }

    @Override // ph.AbstractC11702i, ph.AbstractC11724q
    /* renamed from: h */
    public AbstractC11727s<C8568i> mo8778h() {
        return f38645G;
    }

    /* renamed from: h0 */
    public int m19112h0() {
        return this.f18751v;
    }

    /* renamed from: i0 */
    public C8593q m19111i0() {
        return this.f18747r;
    }

    @Override // ph.AbstractC11726r
    /* renamed from: j */
    public final boolean mo8775j() {
        byte b = this.f38649D;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m19099u0()) {
            this.f38649D = (byte) 0;
            return false;
        } else if (!m19095y0() || m19111i0().mo8775j()) {
            for (int i = 0; i < m19108l0(); i++) {
                if (!m19109k0(i).mo8775j()) {
                    this.f38649D = (byte) 0;
                    return false;
                }
            }
            if (!m19097w0() || m19113g0().mo8775j()) {
                for (int i2 = 0; i2 < m19122X(); i2++) {
                    if (!m19123W(i2).mo8775j()) {
                        this.f38649D = (byte) 0;
                        return false;
                    }
                }
                for (int i3 = 0; i3 < m19104p0(); i3++) {
                    if (!m19105o0(i3).mo8775j()) {
                        this.f38649D = (byte) 0;
                        return false;
                    }
                }
                if (m19151A0() && !m19106n0().mo8775j()) {
                    this.f38649D = (byte) 0;
                    return false;
                } else if (m19101s0() && !m19119a0().mo8775j()) {
                    this.f38649D = (byte) 0;
                    return false;
                } else if (!m8834t()) {
                    this.f38649D = (byte) 0;
                    return false;
                } else {
                    this.f38649D = (byte) 1;
                    return true;
                }
            } else {
                this.f38649D = (byte) 0;
                return false;
            }
        } else {
            this.f38649D = (byte) 0;
            return false;
        }
    }

    /* renamed from: j0 */
    public int m19110j0() {
        return this.f18748s;
    }

    /* renamed from: k0 */
    public C8603s m19109k0(int i) {
        return this.f18749t.get(i);
    }

    /* renamed from: l0 */
    public int m19108l0() {
        return this.f18749t.size();
    }

    /* renamed from: m0 */
    public List<C8603s> m19107m0() {
        return this.f18749t;
    }

    /* renamed from: n0 */
    public C8608t m19106n0() {
        return this.f38646A;
    }

    /* renamed from: o0 */
    public C8611u m19105o0(int i) {
        return this.f18755z.get(i);
    }

    /* renamed from: p0 */
    public int m19104p0() {
        return this.f18755z.size();
    }

    /* renamed from: q0 */
    public List<C8611u> m19103q0() {
        return this.f18755z;
    }

    /* renamed from: r0 */
    public List<Integer> m19102r0() {
        return this.f38647B;
    }

    /* renamed from: s0 */
    public boolean m19101s0() {
        return (this.f18743n & Spliterator.NONNULL) == 256;
    }

    /* renamed from: t0 */
    public boolean m19100t0() {
        return (this.f18743n & 1) == 1;
    }

    /* renamed from: u0 */
    public boolean m19099u0() {
        return (this.f18743n & 4) == 4;
    }

    /* renamed from: v0 */
    public boolean m19098v0() {
        return (this.f18743n & 2) == 2;
    }

    /* renamed from: w0 */
    public boolean m19097w0() {
        return (this.f18743n & 32) == 32;
    }

    /* renamed from: x0 */
    public boolean m19096x0() {
        return (this.f18743n & 64) == 64;
    }

    /* renamed from: y0 */
    public boolean m19095y0() {
        return (this.f18743n & 8) == 8;
    }

    /* renamed from: z0 */
    public boolean m19094z0() {
        return (this.f18743n & 16) == 16;
    }

    private C8568i(AbstractC11702i.AbstractC11705c<C8568i, ?> cVar) {
        super(cVar);
        this.f18754y = -1;
        this.f38649D = (byte) -1;
        this.f38650E = -1;
        this.f18742m = cVar.m8845n();
    }

    private C8568i(boolean z) {
        this.f18754y = -1;
        this.f38649D = (byte) -1;
        this.f38650E = -1;
        this.f18742m = AbstractC11691d.f26108k;
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
    private C8568i(ph.C11694e r14, ph.C11697g r15) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p159ih.C8568i.<init>(ph.e, ph.g):void");
    }
}
