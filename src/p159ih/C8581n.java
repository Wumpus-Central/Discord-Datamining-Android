package p159ih;

import androidx.recyclerview.widget.RecyclerView;
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

/* renamed from: ih.n */
/* loaded from: classes8.dex */
public final class C8581n extends AbstractC11702i.AbstractC11706d<C8581n> {

    /* renamed from: F */
    private static final C8581n f38653F;

    /* renamed from: G */
    public static AbstractC11727s<C8581n> f38654G = new C8582a();

    /* renamed from: A */
    private int f38655A;

    /* renamed from: B */
    private int f38656B;

    /* renamed from: C */
    private List<Integer> f38657C;

    /* renamed from: D */
    private byte f38658D;

    /* renamed from: E */
    private int f38659E;

    /* renamed from: m */
    private final AbstractC11691d f18815m;

    /* renamed from: n */
    private int f18816n;

    /* renamed from: o */
    private int f18817o;

    /* renamed from: p */
    private int f18818p;

    /* renamed from: q */
    private int f18819q;

    /* renamed from: r */
    private C8593q f18820r;

    /* renamed from: s */
    private int f18821s;

    /* renamed from: t */
    private List<C8603s> f18822t;

    /* renamed from: u */
    private C8593q f18823u;

    /* renamed from: v */
    private int f18824v;

    /* renamed from: w */
    private List<C8593q> f18825w;

    /* renamed from: x */
    private List<Integer> f18826x;

    /* renamed from: y */
    private int f18827y;

    /* renamed from: z */
    private C8611u f18828z;

    /* renamed from: ih.n$a */
    /* loaded from: classes8.dex */
    static class C8582a extends AbstractC11687b<C8581n> {
        C8582a() {
        }

        /* renamed from: m */
        public C8581n mo8771d(C11694e eVar, C11697g gVar) {
            return new C8581n(eVar, gVar);
        }
    }

    /* renamed from: ih.n$b */
    /* loaded from: classes8.dex */
    public static final class C8583b extends AbstractC11702i.AbstractC11705c<C8581n, C8583b> {

        /* renamed from: A */
        private int f38660A;

        /* renamed from: n */
        private int f18829n;

        /* renamed from: q */
        private int f18832q;

        /* renamed from: s */
        private int f18834s;

        /* renamed from: v */
        private int f18837v;

        /* renamed from: z */
        private int f18841z;

        /* renamed from: o */
        private int f18830o = 518;

        /* renamed from: p */
        private int f18831p = 2054;

        /* renamed from: r */
        private C8593q f18833r = C8593q.m18808Y();

        /* renamed from: t */
        private List<C8603s> f18835t = Collections.emptyList();

        /* renamed from: u */
        private C8593q f18836u = C8593q.m18808Y();

        /* renamed from: w */
        private List<C8593q> f18838w = Collections.emptyList();

        /* renamed from: x */
        private List<Integer> f18839x = Collections.emptyList();

        /* renamed from: y */
        private C8611u f18840y = C8611u.m18586J();

        /* renamed from: B */
        private List<Integer> f38661B = Collections.emptyList();

        private C8583b() {
            m18924E();
        }

        /* renamed from: A */
        private void m18928A() {
            if ((this.f18829n & 512) != 512) {
                this.f18839x = new ArrayList(this.f18839x);
                this.f18829n |= 512;
            }
        }

        /* renamed from: B */
        private void m18927B() {
            if ((this.f18829n & Spliterator.NONNULL) != 256) {
                this.f18838w = new ArrayList(this.f18838w);
                this.f18829n |= Spliterator.NONNULL;
            }
        }

        /* renamed from: C */
        private void m18926C() {
            if ((this.f18829n & 32) != 32) {
                this.f18835t = new ArrayList(this.f18835t);
                this.f18829n |= 32;
            }
        }

        /* renamed from: D */
        private void m18925D() {
            if ((this.f18829n & 8192) != 8192) {
                this.f38661B = new ArrayList(this.f38661B);
                this.f18829n |= 8192;
            }
        }

        /* renamed from: E */
        private void m18924E() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public static C8583b m18907z() {
            return new C8583b();
        }

        /* renamed from: F */
        public C8583b mo8844o(C8581n nVar) {
            if (nVar == C8581n.m18956Z()) {
                return this;
            }
            if (nVar.m18940p0()) {
                m18918K(nVar.m18954b0());
            }
            if (nVar.m18937s0()) {
                m18915N(nVar.m18951e0());
            }
            if (nVar.m18938r0()) {
                m18916M(nVar.m18952d0());
            }
            if (nVar.m18934v0()) {
                m18920I(nVar.m18948h0());
            }
            if (nVar.m18933w0()) {
                m18913P(nVar.m18947i0());
            }
            if (!nVar.f18822t.isEmpty()) {
                if (this.f18835t.isEmpty()) {
                    this.f18835t = nVar.f18822t;
                    this.f18829n &= -33;
                } else {
                    m18926C();
                    this.f18835t.addAll(nVar.f18822t);
                }
            }
            if (nVar.m18936t0()) {
                m18921H(nVar.m18950f0());
            }
            if (nVar.m18935u0()) {
                m18914O(nVar.m18949g0());
            }
            if (!nVar.f18825w.isEmpty()) {
                if (this.f18838w.isEmpty()) {
                    this.f18838w = nVar.f18825w;
                    this.f18829n &= -257;
                } else {
                    m18927B();
                    this.f18838w.addAll(nVar.f18825w);
                }
            }
            if (!nVar.f18826x.isEmpty()) {
                if (this.f18839x.isEmpty()) {
                    this.f18839x = nVar.f18826x;
                    this.f18829n &= -513;
                } else {
                    m18928A();
                    this.f18839x.addAll(nVar.f18826x);
                }
            }
            if (nVar.m18931y0()) {
                m18919J(nVar.m18945k0());
            }
            if (nVar.m18939q0()) {
                m18917L(nVar.m18953c0());
            }
            if (nVar.m18932x0()) {
                m18912Q(nVar.m18946j0());
            }
            if (!nVar.f38657C.isEmpty()) {
                if (this.f38661B.isEmpty()) {
                    this.f38661B = nVar.f38657C;
                    this.f18829n &= -8193;
                } else {
                    m18925D();
                    this.f38661B.addAll(nVar.f38657C);
                }
            }
            m8839u(nVar);
            m8843q(m8845n().m9017b(nVar.f18815m));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: G */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p159ih.C8581n.C8583b mo9032k(ph.C11694e r3, ph.C11697g r4) {
            /*
                r2 = this;
                r0 = 0
                ph.s<ih.n> r1 = p159ih.C8581n.f38654G     // Catch: all -> 0x000f, k -> 0x0011
                java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                ih.n r3 = (p159ih.C8581n) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                ih.n r4 = (p159ih.C8581n) r4     // Catch: all -> 0x000f
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
            throw new UnsupportedOperationException("Method not decompiled: p159ih.C8581n.C8583b.mo9032k(ph.e, ph.g):ih.n$b");
        }

        /* renamed from: H */
        public C8583b m18921H(C8593q qVar) {
            if ((this.f18829n & 64) != 64 || this.f18836u == C8593q.m18808Y()) {
                this.f18836u = qVar;
            } else {
                this.f18836u = C8593q.m18781z0(this.f18836u).mo8844o(qVar).m18729x();
            }
            this.f18829n |= 64;
            return this;
        }

        /* renamed from: I */
        public C8583b m18920I(C8593q qVar) {
            if ((this.f18829n & 8) != 8 || this.f18833r == C8593q.m18808Y()) {
                this.f18833r = qVar;
            } else {
                this.f18833r = C8593q.m18781z0(this.f18833r).mo8844o(qVar).m18729x();
            }
            this.f18829n |= 8;
            return this;
        }

        /* renamed from: J */
        public C8583b m18919J(C8611u uVar) {
            if ((this.f18829n & Spliterator.IMMUTABLE) != 1024 || this.f18840y == C8611u.m18586J()) {
                this.f18840y = uVar;
            } else {
                this.f18840y = C8611u.m18570Z(this.f18840y).mo8844o(uVar).m18555x();
            }
            this.f18829n |= Spliterator.IMMUTABLE;
            return this;
        }

        /* renamed from: K */
        public C8583b m18918K(int i) {
            this.f18829n |= 1;
            this.f18830o = i;
            return this;
        }

        /* renamed from: L */
        public C8583b m18917L(int i) {
            this.f18829n |= RecyclerView.ItemAnimator.FLAG_MOVED;
            this.f18841z = i;
            return this;
        }

        /* renamed from: M */
        public C8583b m18916M(int i) {
            this.f18829n |= 4;
            this.f18832q = i;
            return this;
        }

        /* renamed from: N */
        public C8583b m18915N(int i) {
            this.f18829n |= 2;
            this.f18831p = i;
            return this;
        }

        /* renamed from: O */
        public C8583b m18914O(int i) {
            this.f18829n |= 128;
            this.f18837v = i;
            return this;
        }

        /* renamed from: P */
        public C8583b m18913P(int i) {
            this.f18829n |= 16;
            this.f18834s = i;
            return this;
        }

        /* renamed from: Q */
        public C8583b m18912Q(int i) {
            this.f18829n |= 4096;
            this.f38660A = i;
            return this;
        }

        /* renamed from: w */
        public C8581n build() {
            C8581n x = m18909x();
            if (x.mo8775j()) {
                return x;
            }
            throw AbstractC11686a.AbstractC0372a.m9031l(x);
        }

        /* renamed from: x */
        public C8581n m18909x() {
            C8581n nVar = new C8581n(this);
            int i = this.f18829n;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            nVar.f18817o = this.f18830o;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            nVar.f18818p = this.f18831p;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            nVar.f18819q = this.f18832q;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            nVar.f18820r = this.f18833r;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            nVar.f18821s = this.f18834s;
            if ((this.f18829n & 32) == 32) {
                this.f18835t = Collections.unmodifiableList(this.f18835t);
                this.f18829n &= -33;
            }
            nVar.f18822t = this.f18835t;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            nVar.f18823u = this.f18836u;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            nVar.f18824v = this.f18837v;
            if ((this.f18829n & Spliterator.NONNULL) == 256) {
                this.f18838w = Collections.unmodifiableList(this.f18838w);
                this.f18829n &= -257;
            }
            nVar.f18825w = this.f18838w;
            if ((this.f18829n & 512) == 512) {
                this.f18839x = Collections.unmodifiableList(this.f18839x);
                this.f18829n &= -513;
            }
            nVar.f18826x = this.f18839x;
            if ((i & Spliterator.IMMUTABLE) == 1024) {
                i2 |= 128;
            }
            nVar.f18828z = this.f18840y;
            if ((i & RecyclerView.ItemAnimator.FLAG_MOVED) == 2048) {
                i2 |= Spliterator.NONNULL;
            }
            nVar.f38655A = this.f18841z;
            if ((i & 4096) == 4096) {
                i2 |= 512;
            }
            nVar.f38656B = this.f38660A;
            if ((this.f18829n & 8192) == 8192) {
                this.f38661B = Collections.unmodifiableList(this.f38661B);
                this.f18829n &= -8193;
            }
            nVar.f38657C = this.f38661B;
            nVar.f18816n = i2;
            return nVar;
        }

        /* renamed from: y */
        public C8583b mo8846m() {
            return m18907z().mo8844o(m18909x());
        }
    }

    static {
        C8581n nVar = new C8581n(true);
        f38653F = nVar;
        nVar.m18930z0();
    }

    /* renamed from: A0 */
    public static C8583b m18984A0() {
        return C8583b.m18907z();
    }

    /* renamed from: B0 */
    public static C8583b m18982B0(C8581n nVar) {
        return m18984A0().mo8844o(nVar);
    }

    /* renamed from: Z */
    public static C8581n m18956Z() {
        return f38653F;
    }

    /* renamed from: z0 */
    private void m18930z0() {
        this.f18817o = 518;
        this.f18818p = 2054;
        this.f18819q = 0;
        this.f18820r = C8593q.m18808Y();
        this.f18821s = 0;
        this.f18822t = Collections.emptyList();
        this.f18823u = C8593q.m18808Y();
        this.f18824v = 0;
        this.f18825w = Collections.emptyList();
        this.f18826x = Collections.emptyList();
        this.f18828z = C8611u.m18586J();
        this.f38655A = 0;
        this.f38656B = 0;
        this.f38657C = Collections.emptyList();
    }

    /* renamed from: C0 */
    public C8583b mo8779e() {
        return m18984A0();
    }

    /* renamed from: D0 */
    public C8583b mo8782a() {
        return m18982B0(this);
    }

    /* renamed from: V */
    public C8593q m18960V(int i) {
        return this.f18825w.get(i);
    }

    /* renamed from: W */
    public int m18959W() {
        return this.f18825w.size();
    }

    /* renamed from: X */
    public List<Integer> m18958X() {
        return this.f18826x;
    }

    /* renamed from: Y */
    public List<C8593q> m18957Y() {
        return this.f18825w;
    }

    /* renamed from: a0 */
    public C8581n mo8776f() {
        return f38653F;
    }

    /* renamed from: b0 */
    public int m18954b0() {
        return this.f18817o;
    }

    @Override // ph.AbstractC11724q
    /* renamed from: c */
    public int mo8781c() {
        int i;
        int i2 = this.f38659E;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f18816n & 2) == 2) {
            i = C11695f.m8906o(1, this.f18818p) + 0;
        } else {
            i = 0;
        }
        if ((this.f18816n & 4) == 4) {
            i += C11695f.m8906o(2, this.f18819q);
        }
        if ((this.f18816n & 8) == 8) {
            i += C11695f.m8898s(3, this.f18820r);
        }
        for (int i3 = 0; i3 < this.f18822t.size(); i3++) {
            i += C11695f.m8898s(4, this.f18822t.get(i3));
        }
        if ((this.f18816n & 32) == 32) {
            i += C11695f.m8898s(5, this.f18823u);
        }
        if ((this.f18816n & 128) == 128) {
            i += C11695f.m8898s(6, this.f18828z);
        }
        if ((this.f18816n & Spliterator.NONNULL) == 256) {
            i += C11695f.m8906o(7, this.f38655A);
        }
        if ((this.f18816n & 512) == 512) {
            i += C11695f.m8906o(8, this.f38656B);
        }
        if ((this.f18816n & 16) == 16) {
            i += C11695f.m8906o(9, this.f18821s);
        }
        if ((this.f18816n & 64) == 64) {
            i += C11695f.m8906o(10, this.f18824v);
        }
        if ((this.f18816n & 1) == 1) {
            i += C11695f.m8906o(11, this.f18817o);
        }
        for (int i4 = 0; i4 < this.f18825w.size(); i4++) {
            i += C11695f.m8898s(12, this.f18825w.get(i4));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f18826x.size(); i6++) {
            i5 += C11695f.m8904p(this.f18826x.get(i6).intValue());
        }
        int i7 = i + i5;
        if (!m18958X().isEmpty()) {
            i7 = i7 + 1 + C11695f.m8904p(i5);
        }
        this.f18827y = i5;
        int i8 = 0;
        for (int i9 = 0; i9 < this.f38657C.size(); i9++) {
            i8 += C11695f.m8904p(this.f38657C.get(i9).intValue());
        }
        int size = i7 + i8 + (m18941o0().size() * 2) + m8833u() + this.f18815m.size();
        this.f38659E = size;
        return size;
    }

    /* renamed from: c0 */
    public int m18953c0() {
        return this.f38655A;
    }

    @Override // ph.AbstractC11724q
    /* renamed from: d */
    public void mo8780d(C11695f fVar) {
        mo8781c();
        AbstractC11702i.AbstractC11706d<MessageType>.C11707a z = m8828z();
        if ((this.f18816n & 2) == 2) {
            fVar.m8933a0(1, this.f18818p);
        }
        if ((this.f18816n & 4) == 4) {
            fVar.m8933a0(2, this.f18819q);
        }
        if ((this.f18816n & 8) == 8) {
            fVar.m8927d0(3, this.f18820r);
        }
        for (int i = 0; i < this.f18822t.size(); i++) {
            fVar.m8927d0(4, this.f18822t.get(i));
        }
        if ((this.f18816n & 32) == 32) {
            fVar.m8927d0(5, this.f18823u);
        }
        if ((this.f18816n & 128) == 128) {
            fVar.m8927d0(6, this.f18828z);
        }
        if ((this.f18816n & Spliterator.NONNULL) == 256) {
            fVar.m8933a0(7, this.f38655A);
        }
        if ((this.f18816n & 512) == 512) {
            fVar.m8933a0(8, this.f38656B);
        }
        if ((this.f18816n & 16) == 16) {
            fVar.m8933a0(9, this.f18821s);
        }
        if ((this.f18816n & 64) == 64) {
            fVar.m8933a0(10, this.f18824v);
        }
        if ((this.f18816n & 1) == 1) {
            fVar.m8933a0(11, this.f18817o);
        }
        for (int i2 = 0; i2 < this.f18825w.size(); i2++) {
            fVar.m8927d0(12, this.f18825w.get(i2));
        }
        if (m18958X().size() > 0) {
            fVar.m8905o0(106);
            fVar.m8905o0(this.f18827y);
        }
        for (int i3 = 0; i3 < this.f18826x.size(); i3++) {
            fVar.m8931b0(this.f18826x.get(i3).intValue());
        }
        for (int i4 = 0; i4 < this.f38657C.size(); i4++) {
            fVar.m8933a0(31, this.f38657C.get(i4).intValue());
        }
        z.m8827a(19000, fVar);
        fVar.m8917i0(this.f18815m);
    }

    /* renamed from: d0 */
    public int m18952d0() {
        return this.f18819q;
    }

    /* renamed from: e0 */
    public int m18951e0() {
        return this.f18818p;
    }

    /* renamed from: f0 */
    public C8593q m18950f0() {
        return this.f18823u;
    }

    /* renamed from: g0 */
    public int m18949g0() {
        return this.f18824v;
    }

    @Override // ph.AbstractC11702i, ph.AbstractC11724q
    /* renamed from: h */
    public AbstractC11727s<C8581n> mo8778h() {
        return f38654G;
    }

    /* renamed from: h0 */
    public C8593q m18948h0() {
        return this.f18820r;
    }

    /* renamed from: i0 */
    public int m18947i0() {
        return this.f18821s;
    }

    @Override // ph.AbstractC11726r
    /* renamed from: j */
    public final boolean mo8775j() {
        byte b = this.f38658D;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m18938r0()) {
            this.f38658D = (byte) 0;
            return false;
        } else if (!m18934v0() || m18948h0().mo8775j()) {
            for (int i = 0; i < m18943m0(); i++) {
                if (!m18944l0(i).mo8775j()) {
                    this.f38658D = (byte) 0;
                    return false;
                }
            }
            if (!m18936t0() || m18950f0().mo8775j()) {
                for (int i2 = 0; i2 < m18959W(); i2++) {
                    if (!m18960V(i2).mo8775j()) {
                        this.f38658D = (byte) 0;
                        return false;
                    }
                }
                if (m18931y0() && !m18945k0().mo8775j()) {
                    this.f38658D = (byte) 0;
                    return false;
                } else if (!m8834t()) {
                    this.f38658D = (byte) 0;
                    return false;
                } else {
                    this.f38658D = (byte) 1;
                    return true;
                }
            } else {
                this.f38658D = (byte) 0;
                return false;
            }
        } else {
            this.f38658D = (byte) 0;
            return false;
        }
    }

    /* renamed from: j0 */
    public int m18946j0() {
        return this.f38656B;
    }

    /* renamed from: k0 */
    public C8611u m18945k0() {
        return this.f18828z;
    }

    /* renamed from: l0 */
    public C8603s m18944l0(int i) {
        return this.f18822t.get(i);
    }

    /* renamed from: m0 */
    public int m18943m0() {
        return this.f18822t.size();
    }

    /* renamed from: n0 */
    public List<C8603s> m18942n0() {
        return this.f18822t;
    }

    /* renamed from: o0 */
    public List<Integer> m18941o0() {
        return this.f38657C;
    }

    /* renamed from: p0 */
    public boolean m18940p0() {
        return (this.f18816n & 1) == 1;
    }

    /* renamed from: q0 */
    public boolean m18939q0() {
        return (this.f18816n & Spliterator.NONNULL) == 256;
    }

    /* renamed from: r0 */
    public boolean m18938r0() {
        return (this.f18816n & 4) == 4;
    }

    /* renamed from: s0 */
    public boolean m18937s0() {
        return (this.f18816n & 2) == 2;
    }

    /* renamed from: t0 */
    public boolean m18936t0() {
        return (this.f18816n & 32) == 32;
    }

    /* renamed from: u0 */
    public boolean m18935u0() {
        return (this.f18816n & 64) == 64;
    }

    /* renamed from: v0 */
    public boolean m18934v0() {
        return (this.f18816n & 8) == 8;
    }

    /* renamed from: w0 */
    public boolean m18933w0() {
        return (this.f18816n & 16) == 16;
    }

    /* renamed from: x0 */
    public boolean m18932x0() {
        return (this.f18816n & 512) == 512;
    }

    /* renamed from: y0 */
    public boolean m18931y0() {
        return (this.f18816n & 128) == 128;
    }

    private C8581n(AbstractC11702i.AbstractC11705c<C8581n, ?> cVar) {
        super(cVar);
        this.f18827y = -1;
        this.f38658D = (byte) -1;
        this.f38659E = -1;
        this.f18815m = cVar.m8845n();
    }

    private C8581n(boolean z) {
        this.f18827y = -1;
        this.f38658D = (byte) -1;
        this.f38659E = -1;
        this.f18815m = AbstractC11691d.f26108k;
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
    private C8581n(ph.C11694e r13, ph.C11697g r14) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p159ih.C8581n.<init>(ph.e, ph.g):void");
    }
}
