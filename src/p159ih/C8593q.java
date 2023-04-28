package p159ih;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p163j$.util.Spliterator;
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

/* renamed from: ih.q */
/* loaded from: classes8.dex */
public final class C8593q extends AbstractC11702i.AbstractC11706d<C8593q> {

    /* renamed from: E */
    private static final C8593q f38662E;

    /* renamed from: F */
    public static AbstractC11727s<C8593q> f38663F = new C8594a();

    /* renamed from: A */
    private int f38664A;

    /* renamed from: B */
    private int f38665B;

    /* renamed from: C */
    private byte f38666C;

    /* renamed from: D */
    private int f38667D;

    /* renamed from: m */
    private final AbstractC11691d f18877m;

    /* renamed from: n */
    private int f18878n;

    /* renamed from: o */
    private List<C8595b> f18879o;

    /* renamed from: p */
    private boolean f18880p;

    /* renamed from: q */
    private int f18881q;

    /* renamed from: r */
    private C8593q f18882r;

    /* renamed from: s */
    private int f18883s;

    /* renamed from: t */
    private int f18884t;

    /* renamed from: u */
    private int f18885u;

    /* renamed from: v */
    private int f18886v;

    /* renamed from: w */
    private int f18887w;

    /* renamed from: x */
    private C8593q f18888x;

    /* renamed from: y */
    private int f18889y;

    /* renamed from: z */
    private C8593q f18890z;

    /* renamed from: ih.q$a */
    /* loaded from: classes8.dex */
    static class C8594a extends AbstractC11687b<C8593q> {
        C8594a() {
        }

        /* renamed from: m */
        public C8593q mo8771d(C11694e eVar, C11697g gVar) {
            return new C8593q(eVar, gVar);
        }
    }

    /* renamed from: ih.q$c */
    /* loaded from: classes8.dex */
    public static final class C8599c extends AbstractC11702i.AbstractC11705c<C8593q, C8599c> {

        /* renamed from: A */
        private int f38668A;

        /* renamed from: B */
        private int f38669B;

        /* renamed from: n */
        private int f18911n;

        /* renamed from: p */
        private boolean f18913p;

        /* renamed from: q */
        private int f18914q;

        /* renamed from: s */
        private int f18916s;

        /* renamed from: t */
        private int f18917t;

        /* renamed from: u */
        private int f18918u;

        /* renamed from: v */
        private int f18919v;

        /* renamed from: w */
        private int f18920w;

        /* renamed from: y */
        private int f18922y;

        /* renamed from: o */
        private List<C8595b> f18912o = Collections.emptyList();

        /* renamed from: r */
        private C8593q f18915r = C8593q.m18808Y();

        /* renamed from: x */
        private C8593q f18921x = C8593q.m18808Y();

        /* renamed from: z */
        private C8593q f18923z = C8593q.m18808Y();

        private C8599c() {
            m18747B();
        }

        /* renamed from: A */
        private void m18748A() {
            if ((this.f18911n & 1) != 1) {
                this.f18912o = new ArrayList(this.f18912o);
                this.f18911n |= 1;
            }
        }

        /* renamed from: B */
        private void m18747B() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public static C8599c m18727z() {
            return new C8599c();
        }

        /* renamed from: C */
        public C8599c m18746C(C8593q qVar) {
            if ((this.f18911n & RecyclerView.ItemAnimator.FLAG_MOVED) != 2048 || this.f18923z == C8593q.m18808Y()) {
                this.f18923z = qVar;
            } else {
                this.f18923z = C8593q.m18781z0(this.f18923z).mo8844o(qVar).m18729x();
            }
            this.f18911n |= RecyclerView.ItemAnimator.FLAG_MOVED;
            return this;
        }

        /* renamed from: D */
        public C8599c m18745D(C8593q qVar) {
            if ((this.f18911n & 8) != 8 || this.f18915r == C8593q.m18808Y()) {
                this.f18915r = qVar;
            } else {
                this.f18915r = C8593q.m18781z0(this.f18915r).mo8844o(qVar).m18729x();
            }
            this.f18911n |= 8;
            return this;
        }

        /* renamed from: E */
        public C8599c mo8844o(C8593q qVar) {
            if (qVar == C8593q.m18808Y()) {
                return this;
            }
            if (!qVar.f18879o.isEmpty()) {
                if (this.f18912o.isEmpty()) {
                    this.f18912o = qVar.f18879o;
                    this.f18911n &= -2;
                } else {
                    m18748A();
                    this.f18912o.addAll(qVar.f18879o);
                }
            }
            if (qVar.m18789r0()) {
                m18736M(qVar.m18802e0());
            }
            if (qVar.m18792o0()) {
                m18738K(qVar.m18805b0());
            }
            if (qVar.m18791p0()) {
                m18745D(qVar.m18804c0());
            }
            if (qVar.m18790q0()) {
                m18737L(qVar.m18803d0());
            }
            if (qVar.m18794m0()) {
                m18740I(qVar.m18809X());
            }
            if (qVar.m18785v0()) {
                m18733P(qVar.m18798i0());
            }
            if (qVar.m18784w0()) {
                m18732Q(qVar.m18797j0());
            }
            if (qVar.m18786u0()) {
                m18734O(qVar.m18799h0());
            }
            if (qVar.m18788s0()) {
                m18742G(qVar.m18801f0());
            }
            if (qVar.m18787t0()) {
                m18735N(qVar.m18800g0());
            }
            if (qVar.m18796k0()) {
                m18746C(qVar.m18814S());
            }
            if (qVar.m18795l0()) {
                m18741H(qVar.m18813T());
            }
            if (qVar.m18793n0()) {
                m18739J(qVar.m18806a0());
            }
            m8839u(qVar);
            m8843q(m8845n().m9017b(qVar.f18877m));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: F */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p159ih.C8593q.C8599c mo9032k(ph.C11694e r3, ph.C11697g r4) {
            /*
                r2 = this;
                r0 = 0
                ph.s<ih.q> r1 = p159ih.C8593q.f38663F     // Catch: all -> 0x000f, k -> 0x0011
                java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                ih.q r3 = (p159ih.C8593q) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                ih.q r4 = (p159ih.C8593q) r4     // Catch: all -> 0x000f
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
            throw new UnsupportedOperationException("Method not decompiled: p159ih.C8593q.C8599c.mo9032k(ph.e, ph.g):ih.q$c");
        }

        /* renamed from: G */
        public C8599c m18742G(C8593q qVar) {
            if ((this.f18911n & 512) != 512 || this.f18921x == C8593q.m18808Y()) {
                this.f18921x = qVar;
            } else {
                this.f18921x = C8593q.m18781z0(this.f18921x).mo8844o(qVar).m18729x();
            }
            this.f18911n |= 512;
            return this;
        }

        /* renamed from: H */
        public C8599c m18741H(int i) {
            this.f18911n |= 4096;
            this.f38668A = i;
            return this;
        }

        /* renamed from: I */
        public C8599c m18740I(int i) {
            this.f18911n |= 32;
            this.f18917t = i;
            return this;
        }

        /* renamed from: J */
        public C8599c m18739J(int i) {
            this.f18911n |= 8192;
            this.f38669B = i;
            return this;
        }

        /* renamed from: K */
        public C8599c m18738K(int i) {
            this.f18911n |= 4;
            this.f18914q = i;
            return this;
        }

        /* renamed from: L */
        public C8599c m18737L(int i) {
            this.f18911n |= 16;
            this.f18916s = i;
            return this;
        }

        /* renamed from: M */
        public C8599c m18736M(boolean z) {
            this.f18911n |= 2;
            this.f18913p = z;
            return this;
        }

        /* renamed from: N */
        public C8599c m18735N(int i) {
            this.f18911n |= Spliterator.IMMUTABLE;
            this.f18922y = i;
            return this;
        }

        /* renamed from: O */
        public C8599c m18734O(int i) {
            this.f18911n |= Spliterator.NONNULL;
            this.f18920w = i;
            return this;
        }

        /* renamed from: P */
        public C8599c m18733P(int i) {
            this.f18911n |= 64;
            this.f18918u = i;
            return this;
        }

        /* renamed from: Q */
        public C8599c m18732Q(int i) {
            this.f18911n |= 128;
            this.f18919v = i;
            return this;
        }

        /* renamed from: w */
        public C8593q build() {
            C8593q x = m18729x();
            if (x.mo8775j()) {
                return x;
            }
            throw AbstractC11686a.AbstractC0372a.m9031l(x);
        }

        /* renamed from: x */
        public C8593q m18729x() {
            C8593q qVar = new C8593q(this);
            int i = this.f18911n;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.f18912o = Collections.unmodifiableList(this.f18912o);
                this.f18911n &= -2;
            }
            qVar.f18879o = this.f18912o;
            if ((i & 2) != 2) {
                i2 = 0;
            }
            qVar.f18880p = this.f18913p;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            qVar.f18881q = this.f18914q;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            qVar.f18882r = this.f18915r;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            qVar.f18883s = this.f18916s;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            qVar.f18884t = this.f18917t;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            qVar.f18885u = this.f18918u;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            qVar.f18886v = this.f18919v;
            if ((i & Spliterator.NONNULL) == 256) {
                i2 |= 128;
            }
            qVar.f18887w = this.f18920w;
            if ((i & 512) == 512) {
                i2 |= Spliterator.NONNULL;
            }
            qVar.f18888x = this.f18921x;
            if ((i & Spliterator.IMMUTABLE) == 1024) {
                i2 |= 512;
            }
            qVar.f18889y = this.f18922y;
            if ((i & RecyclerView.ItemAnimator.FLAG_MOVED) == 2048) {
                i2 |= Spliterator.IMMUTABLE;
            }
            qVar.f18890z = this.f18923z;
            if ((i & 4096) == 4096) {
                i2 |= RecyclerView.ItemAnimator.FLAG_MOVED;
            }
            qVar.f38664A = this.f38668A;
            if ((i & 8192) == 8192) {
                i2 |= 4096;
            }
            qVar.f38665B = this.f38669B;
            qVar.f18878n = i2;
            return qVar;
        }

        /* renamed from: y */
        public C8599c mo8846m() {
            return m18727z().mo8844o(m18729x());
        }
    }

    static {
        C8593q qVar = new C8593q(true);
        f38662E = qVar;
        qVar.m18783x0();
    }

    /* renamed from: Y */
    public static C8593q m18808Y() {
        return f38662E;
    }

    /* renamed from: x0 */
    private void m18783x0() {
        this.f18879o = Collections.emptyList();
        this.f18880p = false;
        this.f18881q = 0;
        this.f18882r = m18808Y();
        this.f18883s = 0;
        this.f18884t = 0;
        this.f18885u = 0;
        this.f18886v = 0;
        this.f18887w = 0;
        this.f18888x = m18808Y();
        this.f18889y = 0;
        this.f18890z = m18808Y();
        this.f38664A = 0;
        this.f38665B = 0;
    }

    /* renamed from: y0 */
    public static C8599c m18782y0() {
        return C8599c.m18727z();
    }

    /* renamed from: z0 */
    public static C8599c m18781z0(C8593q qVar) {
        return m18782y0().mo8844o(qVar);
    }

    /* renamed from: A0 */
    public C8599c mo8779e() {
        return m18782y0();
    }

    /* renamed from: B0 */
    public C8599c mo8782a() {
        return m18781z0(this);
    }

    /* renamed from: S */
    public C8593q m18814S() {
        return this.f18890z;
    }

    /* renamed from: T */
    public int m18813T() {
        return this.f38664A;
    }

    /* renamed from: U */
    public C8595b m18812U(int i) {
        return this.f18879o.get(i);
    }

    /* renamed from: V */
    public int m18811V() {
        return this.f18879o.size();
    }

    /* renamed from: W */
    public List<C8595b> m18810W() {
        return this.f18879o;
    }

    /* renamed from: X */
    public int m18809X() {
        return this.f18884t;
    }

    /* renamed from: Z */
    public C8593q mo8776f() {
        return f38662E;
    }

    /* renamed from: a0 */
    public int m18806a0() {
        return this.f38665B;
    }

    /* renamed from: b0 */
    public int m18805b0() {
        return this.f18881q;
    }

    @Override // ph.AbstractC11724q
    /* renamed from: c */
    public int mo8781c() {
        int i;
        int i2 = this.f38667D;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f18878n & 4096) == 4096) {
            i = C11695f.m8906o(1, this.f38665B) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.f18879o.size(); i3++) {
            i += C11695f.m8898s(2, this.f18879o.get(i3));
        }
        if ((this.f18878n & 1) == 1) {
            i += C11695f.m8934a(3, this.f18880p);
        }
        if ((this.f18878n & 2) == 2) {
            i += C11695f.m8906o(4, this.f18881q);
        }
        if ((this.f18878n & 4) == 4) {
            i += C11695f.m8898s(5, this.f18882r);
        }
        if ((this.f18878n & 16) == 16) {
            i += C11695f.m8906o(6, this.f18884t);
        }
        if ((this.f18878n & 32) == 32) {
            i += C11695f.m8906o(7, this.f18885u);
        }
        if ((this.f18878n & 8) == 8) {
            i += C11695f.m8906o(8, this.f18883s);
        }
        if ((this.f18878n & 64) == 64) {
            i += C11695f.m8906o(9, this.f18886v);
        }
        if ((this.f18878n & Spliterator.NONNULL) == 256) {
            i += C11695f.m8898s(10, this.f18888x);
        }
        if ((this.f18878n & 512) == 512) {
            i += C11695f.m8906o(11, this.f18889y);
        }
        if ((this.f18878n & 128) == 128) {
            i += C11695f.m8906o(12, this.f18887w);
        }
        if ((this.f18878n & Spliterator.IMMUTABLE) == 1024) {
            i += C11695f.m8898s(13, this.f18890z);
        }
        if ((this.f18878n & RecyclerView.ItemAnimator.FLAG_MOVED) == 2048) {
            i += C11695f.m8906o(14, this.f38664A);
        }
        int u = i + m8833u() + this.f18877m.size();
        this.f38667D = u;
        return u;
    }

    /* renamed from: c0 */
    public C8593q m18804c0() {
        return this.f18882r;
    }

    @Override // ph.AbstractC11724q
    /* renamed from: d */
    public void mo8780d(C11695f fVar) {
        mo8781c();
        AbstractC11702i.AbstractC11706d<MessageType>.C11707a z = m8828z();
        if ((this.f18878n & 4096) == 4096) {
            fVar.m8933a0(1, this.f38665B);
        }
        for (int i = 0; i < this.f18879o.size(); i++) {
            fVar.m8927d0(2, this.f18879o.get(i));
        }
        if ((this.f18878n & 1) == 1) {
            fVar.m8949L(3, this.f18880p);
        }
        if ((this.f18878n & 2) == 2) {
            fVar.m8933a0(4, this.f18881q);
        }
        if ((this.f18878n & 4) == 4) {
            fVar.m8927d0(5, this.f18882r);
        }
        if ((this.f18878n & 16) == 16) {
            fVar.m8933a0(6, this.f18884t);
        }
        if ((this.f18878n & 32) == 32) {
            fVar.m8933a0(7, this.f18885u);
        }
        if ((this.f18878n & 8) == 8) {
            fVar.m8933a0(8, this.f18883s);
        }
        if ((this.f18878n & 64) == 64) {
            fVar.m8933a0(9, this.f18886v);
        }
        if ((this.f18878n & Spliterator.NONNULL) == 256) {
            fVar.m8927d0(10, this.f18888x);
        }
        if ((this.f18878n & 512) == 512) {
            fVar.m8933a0(11, this.f18889y);
        }
        if ((this.f18878n & 128) == 128) {
            fVar.m8933a0(12, this.f18887w);
        }
        if ((this.f18878n & Spliterator.IMMUTABLE) == 1024) {
            fVar.m8927d0(13, this.f18890z);
        }
        if ((this.f18878n & RecyclerView.ItemAnimator.FLAG_MOVED) == 2048) {
            fVar.m8933a0(14, this.f38664A);
        }
        z.m8827a(ItemTouchHelper.AbstractC3083c.DEFAULT_DRAG_ANIMATION_DURATION, fVar);
        fVar.m8917i0(this.f18877m);
    }

    /* renamed from: d0 */
    public int m18803d0() {
        return this.f18883s;
    }

    /* renamed from: e0 */
    public boolean m18802e0() {
        return this.f18880p;
    }

    /* renamed from: f0 */
    public C8593q m18801f0() {
        return this.f18888x;
    }

    /* renamed from: g0 */
    public int m18800g0() {
        return this.f18889y;
    }

    @Override // ph.AbstractC11702i, ph.AbstractC11724q
    /* renamed from: h */
    public AbstractC11727s<C8593q> mo8778h() {
        return f38663F;
    }

    /* renamed from: h0 */
    public int m18799h0() {
        return this.f18887w;
    }

    /* renamed from: i0 */
    public int m18798i0() {
        return this.f18885u;
    }

    @Override // ph.AbstractC11726r
    /* renamed from: j */
    public final boolean mo8775j() {
        byte b = this.f38666C;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < m18811V(); i++) {
            if (!m18812U(i).mo8775j()) {
                this.f38666C = (byte) 0;
                return false;
            }
        }
        if (m18791p0() && !m18804c0().mo8775j()) {
            this.f38666C = (byte) 0;
            return false;
        } else if (m18788s0() && !m18801f0().mo8775j()) {
            this.f38666C = (byte) 0;
            return false;
        } else if (m18796k0() && !m18814S().mo8775j()) {
            this.f38666C = (byte) 0;
            return false;
        } else if (!m8834t()) {
            this.f38666C = (byte) 0;
            return false;
        } else {
            this.f38666C = (byte) 1;
            return true;
        }
    }

    /* renamed from: j0 */
    public int m18797j0() {
        return this.f18886v;
    }

    /* renamed from: k0 */
    public boolean m18796k0() {
        return (this.f18878n & Spliterator.IMMUTABLE) == 1024;
    }

    /* renamed from: l0 */
    public boolean m18795l0() {
        return (this.f18878n & RecyclerView.ItemAnimator.FLAG_MOVED) == 2048;
    }

    /* renamed from: m0 */
    public boolean m18794m0() {
        return (this.f18878n & 16) == 16;
    }

    /* renamed from: n0 */
    public boolean m18793n0() {
        return (this.f18878n & 4096) == 4096;
    }

    /* renamed from: o0 */
    public boolean m18792o0() {
        return (this.f18878n & 2) == 2;
    }

    /* renamed from: p0 */
    public boolean m18791p0() {
        return (this.f18878n & 4) == 4;
    }

    /* renamed from: q0 */
    public boolean m18790q0() {
        return (this.f18878n & 8) == 8;
    }

    /* renamed from: r0 */
    public boolean m18789r0() {
        return (this.f18878n & 1) == 1;
    }

    /* renamed from: s0 */
    public boolean m18788s0() {
        return (this.f18878n & Spliterator.NONNULL) == 256;
    }

    /* renamed from: t0 */
    public boolean m18787t0() {
        return (this.f18878n & 512) == 512;
    }

    /* renamed from: u0 */
    public boolean m18786u0() {
        return (this.f18878n & 128) == 128;
    }

    /* renamed from: v0 */
    public boolean m18785v0() {
        return (this.f18878n & 32) == 32;
    }

    /* renamed from: w0 */
    public boolean m18784w0() {
        return (this.f18878n & 64) == 64;
    }

    /* renamed from: ih.q$b */
    /* loaded from: classes8.dex */
    public static final class C8595b extends AbstractC11702i implements AbstractC11726r {

        /* renamed from: s */
        private static final C8595b f18891s;

        /* renamed from: t */
        public static AbstractC11727s<C8595b> f18892t = new C8596a();

        /* renamed from: l */
        private final AbstractC11691d f18893l;

        /* renamed from: m */
        private int f18894m;

        /* renamed from: n */
        private EnumC8597c f18895n;

        /* renamed from: o */
        private C8593q f18896o;

        /* renamed from: p */
        private int f18897p;

        /* renamed from: q */
        private byte f18898q;

        /* renamed from: r */
        private int f18899r;

        /* renamed from: ih.q$b$a */
        /* loaded from: classes8.dex */
        static class C8596a extends AbstractC11687b<C8595b> {
            C8596a() {
            }

            /* renamed from: m */
            public C8595b mo8771d(C11694e eVar, C11697g gVar) {
                return new C8595b(eVar, gVar);
            }
        }

        /* renamed from: ih.q$b$b */
        /* loaded from: classes8.dex */
        public static final class C0272b extends AbstractC11702i.AbstractC11704b<C8595b, C0272b> implements AbstractC11726r {

            /* renamed from: l */
            private int f18900l;

            /* renamed from: m */
            private EnumC8597c f18901m = EnumC8597c.INV;

            /* renamed from: n */
            private C8593q f18902n = C8593q.m18808Y();

            /* renamed from: o */
            private int f18903o;

            private C0272b() {
                m18754w();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: v */
            public static C0272b m18755v() {
                return new C0272b();
            }

            /* renamed from: w */
            private void m18754w() {
            }

            /* renamed from: A */
            public C0272b m18761A(EnumC8597c cVar) {
                cVar.getClass();
                this.f18900l |= 1;
                this.f18901m = cVar;
                return this;
            }

            /* renamed from: B */
            public C0272b m18760B(int i) {
                this.f18900l |= 4;
                this.f18903o = i;
                return this;
            }

            /* renamed from: s */
            public C8595b build() {
                C8595b t = m18757t();
                if (t.mo8775j()) {
                    return t;
                }
                throw AbstractC11686a.AbstractC0372a.m9031l(t);
            }

            /* renamed from: t */
            public C8595b m18757t() {
                C8595b bVar = new C8595b(this);
                int i = this.f18900l;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                bVar.f18895n = this.f18901m;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                bVar.f18896o = this.f18902n;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                bVar.f18897p = this.f18903o;
                bVar.f18894m = i2;
                return bVar;
            }

            /* renamed from: u */
            public C0272b mo8846m() {
                return m18755v().mo8844o(m18757t());
            }

            /* renamed from: x */
            public C0272b mo8844o(C8595b bVar) {
                if (bVar == C8595b.m18765x()) {
                    return this;
                }
                if (bVar.m18778B()) {
                    m18761A(bVar.m18764y());
                }
                if (bVar.m18777C()) {
                    m18751z(bVar.m18763z());
                }
                if (bVar.m18776D()) {
                    m18760B(bVar.m18779A());
                }
                m8843q(m8845n().m9017b(bVar.f18893l));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /* renamed from: y */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public p159ih.C8593q.C8595b.C0272b mo9032k(ph.C11694e r3, ph.C11697g r4) {
                /*
                    r2 = this;
                    r0 = 0
                    ph.s<ih.q$b> r1 = p159ih.C8593q.C8595b.f18892t     // Catch: all -> 0x000f, k -> 0x0011
                    java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                    ih.q$b r3 = (p159ih.C8593q.C8595b) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                    ih.q$b r4 = (p159ih.C8593q.C8595b) r4     // Catch: all -> 0x000f
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
                throw new UnsupportedOperationException("Method not decompiled: p159ih.C8593q.C8595b.C0272b.mo9032k(ph.e, ph.g):ih.q$b$b");
            }

            /* renamed from: z */
            public C0272b m18751z(C8593q qVar) {
                if ((this.f18900l & 2) != 2 || this.f18902n == C8593q.m18808Y()) {
                    this.f18902n = qVar;
                } else {
                    this.f18902n = C8593q.m18781z0(this.f18902n).mo8844o(qVar).m18729x();
                }
                this.f18900l |= 2;
                return this;
            }
        }

        /* renamed from: ih.q$b$c */
        /* loaded from: classes8.dex */
        public enum EnumC8597c implements C11710j.AbstractC11711a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);
            

            /* renamed from: p */
            private static C11710j.AbstractC11712b<EnumC8597c> f18908p = new C8598a();

            /* renamed from: k */
            private final int f18910k;

            /* renamed from: ih.q$b$c$a */
            /* loaded from: classes8.dex */
            static class C8598a implements C11710j.AbstractC11712b<EnumC8597c> {
                C8598a() {
                }

                /* renamed from: b */
                public EnumC8597c mo8811a(int i) {
                    return EnumC8597c.m18750a(i);
                }
            }

            EnumC8597c(int i, int i2) {
                this.f18910k = i2;
            }

            /* renamed from: a */
            public static EnumC8597c m18750a(int i) {
                if (i == 0) {
                    return IN;
                }
                if (i == 1) {
                    return OUT;
                }
                if (i == 2) {
                    return INV;
                }
                if (i != 3) {
                    return null;
                }
                return STAR;
            }

            @Override // ph.C11710j.AbstractC11711a
            public final int getNumber() {
                return this.f18910k;
            }
        }

        static {
            C8595b bVar = new C8595b(true);
            f18891s = bVar;
            bVar.m18775E();
        }

        /* renamed from: E */
        private void m18775E() {
            this.f18895n = EnumC8597c.INV;
            this.f18896o = C8593q.m18808Y();
            this.f18897p = 0;
        }

        /* renamed from: F */
        public static C0272b m18774F() {
            return C0272b.m18755v();
        }

        /* renamed from: G */
        public static C0272b m18773G(C8595b bVar) {
            return m18774F().mo8844o(bVar);
        }

        /* renamed from: x */
        public static C8595b m18765x() {
            return f18891s;
        }

        /* renamed from: A */
        public int m18779A() {
            return this.f18897p;
        }

        /* renamed from: B */
        public boolean m18778B() {
            return (this.f18894m & 1) == 1;
        }

        /* renamed from: C */
        public boolean m18777C() {
            return (this.f18894m & 2) == 2;
        }

        /* renamed from: D */
        public boolean m18776D() {
            return (this.f18894m & 4) == 4;
        }

        /* renamed from: H */
        public C0272b mo8779e() {
            return m18774F();
        }

        /* renamed from: I */
        public C0272b mo8782a() {
            return m18773G(this);
        }

        @Override // ph.AbstractC11724q
        /* renamed from: c */
        public int mo8781c() {
            int i = this.f18899r;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f18894m & 1) == 1) {
                i2 = 0 + C11695f.m8920h(1, this.f18895n.getNumber());
            }
            if ((this.f18894m & 2) == 2) {
                i2 += C11695f.m8898s(2, this.f18896o);
            }
            if ((this.f18894m & 4) == 4) {
                i2 += C11695f.m8906o(3, this.f18897p);
            }
            int size = i2 + this.f18893l.size();
            this.f18899r = size;
            return size;
        }

        @Override // ph.AbstractC11724q
        /* renamed from: d */
        public void mo8780d(C11695f fVar) {
            mo8781c();
            if ((this.f18894m & 1) == 1) {
                fVar.m8942S(1, this.f18895n.getNumber());
            }
            if ((this.f18894m & 2) == 2) {
                fVar.m8927d0(2, this.f18896o);
            }
            if ((this.f18894m & 4) == 4) {
                fVar.m8933a0(3, this.f18897p);
            }
            fVar.m8917i0(this.f18893l);
        }

        @Override // ph.AbstractC11702i, ph.AbstractC11724q
        /* renamed from: h */
        public AbstractC11727s<C8595b> mo8778h() {
            return f18892t;
        }

        @Override // ph.AbstractC11726r
        /* renamed from: j */
        public final boolean mo8775j() {
            byte b = this.f18898q;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!m18777C() || m18763z().mo8775j()) {
                this.f18898q = (byte) 1;
                return true;
            }
            this.f18898q = (byte) 0;
            return false;
        }

        /* renamed from: y */
        public EnumC8597c m18764y() {
            return this.f18895n;
        }

        /* renamed from: z */
        public C8593q m18763z() {
            return this.f18896o;
        }

        private C8595b(AbstractC11702i.AbstractC11704b bVar) {
            super(bVar);
            this.f18898q = (byte) -1;
            this.f18899r = -1;
            this.f18893l = bVar.m8845n();
        }

        private C8595b(boolean z) {
            this.f18898q = (byte) -1;
            this.f18899r = -1;
            this.f18893l = AbstractC11691d.f26108k;
        }

        private C8595b(C11694e eVar, C11697g gVar) {
            this.f18898q = (byte) -1;
            this.f18899r = -1;
            m18775E();
            AbstractC11691d.C11693b w = AbstractC11691d.m9011w();
            C11695f J = C11695f.m8951J(w, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int K = eVar.m8996K();
                            if (K != 0) {
                                if (K == 8) {
                                    int n = eVar.m8973n();
                                    EnumC8597c a = EnumC8597c.m18750a(n);
                                    if (a == null) {
                                        J.m8905o0(K);
                                        J.m8905o0(n);
                                    } else {
                                        this.f18894m |= 1;
                                        this.f18895n = a;
                                    }
                                } else if (K == 18) {
                                    C8599c B0 = (this.f18894m & 2) == 2 ? this.f18896o.mo8782a() : null;
                                    C8593q qVar = (C8593q) eVar.m8966u(C8593q.f38663F, gVar);
                                    this.f18896o = qVar;
                                    if (B0 != null) {
                                        B0.mo8844o(qVar);
                                        this.f18896o = B0.m18729x();
                                    }
                                    this.f18894m |= 2;
                                } else if (K == 24) {
                                    this.f18894m |= 4;
                                    this.f18897p = eVar.m8968s();
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
                    try {
                        J.m8952I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f18893l = w.m9007i();
                        throw th3;
                    }
                    this.f18893l = w.m9007i();
                    mo8837n();
                    throw th2;
                }
            }
            try {
                J.m8952I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f18893l = w.m9007i();
                throw th4;
            }
            this.f18893l = w.m9007i();
            mo8837n();
        }
    }

    private C8593q(AbstractC11702i.AbstractC11705c<C8593q, ?> cVar) {
        super(cVar);
        this.f38666C = (byte) -1;
        this.f38667D = -1;
        this.f18877m = cVar.m8845n();
    }

    private C8593q(boolean z) {
        this.f38666C = (byte) -1;
        this.f38667D = -1;
        this.f18877m = AbstractC11691d.f26108k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C8593q(C11694e eVar, C11697g gVar) {
        this.f38666C = (byte) -1;
        this.f38667D = -1;
        m18783x0();
        AbstractC11691d.C11693b w = AbstractC11691d.m9011w();
        C11695f J = C11695f.m8951J(w, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int K = eVar.m8996K();
                    C8599c cVar = null;
                    switch (K) {
                        case 0:
                            break;
                        case 8:
                            this.f18878n |= 4096;
                            this.f38665B = eVar.m8968s();
                            continue;
                        case 18:
                            if (!z2 || !true) {
                                this.f18879o = new ArrayList();
                                z2 |= true;
                            }
                            this.f18879o.add(eVar.m8966u(C8595b.f18892t, gVar));
                            continue;
                        case 24:
                            this.f18878n |= 1;
                            this.f18880p = eVar.m8976k();
                            continue;
                        case 32:
                            this.f18878n |= 2;
                            this.f18881q = eVar.m8968s();
                            continue;
                        case 42:
                            cVar = (this.f18878n & 4) == 4 ? this.f18882r.mo8782a() : cVar;
                            C8593q qVar = (C8593q) eVar.m8966u(f38663F, gVar);
                            this.f18882r = qVar;
                            if (cVar != null) {
                                cVar.mo8844o(qVar);
                                this.f18882r = cVar.m18729x();
                            }
                            this.f18878n |= 4;
                            continue;
                        case 48:
                            this.f18878n |= 16;
                            this.f18884t = eVar.m8968s();
                            continue;
                        case 56:
                            this.f18878n |= 32;
                            this.f18885u = eVar.m8968s();
                            continue;
                        case 64:
                            this.f18878n |= 8;
                            this.f18883s = eVar.m8968s();
                            continue;
                        case 72:
                            this.f18878n |= 64;
                            this.f18886v = eVar.m8968s();
                            continue;
                        case 82:
                            cVar = (this.f18878n & Spliterator.NONNULL) == 256 ? this.f18888x.mo8782a() : cVar;
                            C8593q qVar2 = (C8593q) eVar.m8966u(f38663F, gVar);
                            this.f18888x = qVar2;
                            if (cVar != null) {
                                cVar.mo8844o(qVar2);
                                this.f18888x = cVar.m18729x();
                            }
                            this.f18878n |= Spliterator.NONNULL;
                            continue;
                        case 88:
                            this.f18878n |= 512;
                            this.f18889y = eVar.m8968s();
                            continue;
                        case 96:
                            this.f18878n |= 128;
                            this.f18887w = eVar.m8968s();
                            continue;
                        case 106:
                            cVar = (this.f18878n & Spliterator.IMMUTABLE) == 1024 ? this.f18890z.mo8782a() : cVar;
                            C8593q qVar3 = (C8593q) eVar.m8966u(f38663F, gVar);
                            this.f18890z = qVar3;
                            if (cVar != null) {
                                cVar.mo8844o(qVar3);
                                this.f18890z = cVar.m18729x();
                            }
                            this.f18878n |= Spliterator.IMMUTABLE;
                            continue;
                        case 112:
                            this.f18878n |= RecyclerView.ItemAnimator.FLAG_MOVED;
                            this.f38664A = eVar.m8968s();
                            continue;
                        default:
                            if (!mo8836q(eVar, J, gVar, K)) {
                                break;
                            } else {
                                continue;
                            }
                    }
                    z = true;
                } catch (C11713k e) {
                    throw e.m8802i(this);
                } catch (IOException e2) {
                    throw new C11713k(e2.getMessage()).m8802i(this);
                }
            } catch (Throwable th2) {
                if (z2 && true) {
                    this.f18879o = Collections.unmodifiableList(this.f18879o);
                }
                try {
                    J.m8952I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f18877m = w.m9007i();
                    throw th3;
                }
                this.f18877m = w.m9007i();
                mo8837n();
                throw th2;
            }
        }
        if (z2 && true) {
            this.f18879o = Collections.unmodifiableList(this.f18879o);
        }
        try {
            J.m8952I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f18877m = w.m9007i();
            throw th4;
        }
        this.f18877m = w.m9007i();
        mo8837n();
    }
}
