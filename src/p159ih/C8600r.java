package p159ih;

import androidx.recyclerview.widget.ItemTouchHelper;
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

/* renamed from: ih.r */
/* loaded from: classes8.dex */
public final class C8600r extends AbstractC11702i.AbstractC11706d<C8600r> {

    /* renamed from: A */
    public static AbstractC11727s<C8600r> f38670A = new C8601a();

    /* renamed from: z */
    private static final C8600r f18924z;

    /* renamed from: m */
    private final AbstractC11691d f18925m;

    /* renamed from: n */
    private int f18926n;

    /* renamed from: o */
    private int f18927o;

    /* renamed from: p */
    private int f18928p;

    /* renamed from: q */
    private List<C8603s> f18929q;

    /* renamed from: r */
    private C8593q f18930r;

    /* renamed from: s */
    private int f18931s;

    /* renamed from: t */
    private C8593q f18932t;

    /* renamed from: u */
    private int f18933u;

    /* renamed from: v */
    private List<C8541b> f18934v;

    /* renamed from: w */
    private List<Integer> f18935w;

    /* renamed from: x */
    private byte f18936x;

    /* renamed from: y */
    private int f18937y;

    /* renamed from: ih.r$a */
    /* loaded from: classes8.dex */
    static class C8601a extends AbstractC11687b<C8600r> {
        C8601a() {
        }

        /* renamed from: m */
        public C8600r mo8771d(C11694e eVar, C11697g gVar) {
            return new C8600r(eVar, gVar);
        }
    }

    /* renamed from: ih.r$b */
    /* loaded from: classes8.dex */
    public static final class C8602b extends AbstractC11702i.AbstractC11705c<C8600r, C8602b> {

        /* renamed from: n */
        private int f18938n;

        /* renamed from: p */
        private int f18940p;

        /* renamed from: s */
        private int f18943s;

        /* renamed from: u */
        private int f18945u;

        /* renamed from: o */
        private int f18939o = 6;

        /* renamed from: q */
        private List<C8603s> f18941q = Collections.emptyList();

        /* renamed from: r */
        private C8593q f18942r = C8593q.m18808Y();

        /* renamed from: t */
        private C8593q f18944t = C8593q.m18808Y();

        /* renamed from: v */
        private List<C8541b> f18946v = Collections.emptyList();

        /* renamed from: w */
        private List<Integer> f18947w = Collections.emptyList();

        private C8602b() {
            m18681D();
        }

        /* renamed from: A */
        private void m18684A() {
            if ((this.f18938n & 128) != 128) {
                this.f18946v = new ArrayList(this.f18946v);
                this.f18938n |= 128;
            }
        }

        /* renamed from: B */
        private void m18683B() {
            if ((this.f18938n & 4) != 4) {
                this.f18941q = new ArrayList(this.f18941q);
                this.f18938n |= 4;
            }
        }

        /* renamed from: C */
        private void m18682C() {
            if ((this.f18938n & Spliterator.NONNULL) != 256) {
                this.f18947w = new ArrayList(this.f18947w);
                this.f18938n |= Spliterator.NONNULL;
            }
        }

        /* renamed from: D */
        private void m18681D() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public static C8602b m18668z() {
            return new C8602b();
        }

        /* renamed from: E */
        public C8602b m18680E(C8593q qVar) {
            if ((this.f18938n & 32) != 32 || this.f18944t == C8593q.m18808Y()) {
                this.f18944t = qVar;
            } else {
                this.f18944t = C8593q.m18781z0(this.f18944t).mo8844o(qVar).m18729x();
            }
            this.f18938n |= 32;
            return this;
        }

        /* renamed from: F */
        public C8602b mo8844o(C8600r rVar) {
            if (rVar == C8600r.m18709S()) {
                return this;
            }
            if (rVar.m18695g0()) {
                m18675J(rVar.m18705W());
            }
            if (rVar.m18694h0()) {
                m18674K(rVar.m18704X());
            }
            if (!rVar.f18929q.isEmpty()) {
                if (this.f18941q.isEmpty()) {
                    this.f18941q = rVar.f18929q;
                    this.f18938n &= -5;
                } else {
                    m18683B();
                    this.f18941q.addAll(rVar.f18929q);
                }
            }
            if (rVar.m18693i0()) {
                m18677H(rVar.m18700b0());
            }
            if (rVar.m18692j0()) {
                m18673L(rVar.m18699c0());
            }
            if (rVar.m18697e0()) {
                m18680E(rVar.m18707U());
            }
            if (rVar.m18696f0()) {
                m18676I(rVar.m18706V());
            }
            if (!rVar.f18934v.isEmpty()) {
                if (this.f18946v.isEmpty()) {
                    this.f18946v = rVar.f18934v;
                    this.f18938n &= -129;
                } else {
                    m18684A();
                    this.f18946v.addAll(rVar.f18934v);
                }
            }
            if (!rVar.f18935w.isEmpty()) {
                if (this.f18947w.isEmpty()) {
                    this.f18947w = rVar.f18935w;
                    this.f18938n &= -257;
                } else {
                    m18682C();
                    this.f18947w.addAll(rVar.f18935w);
                }
            }
            m8839u(rVar);
            m8843q(m8845n().m9017b(rVar.f18925m));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: G */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p159ih.C8600r.C8602b mo9032k(ph.C11694e r3, ph.C11697g r4) {
            /*
                r2 = this;
                r0 = 0
                ph.s<ih.r> r1 = p159ih.C8600r.f38670A     // Catch: all -> 0x000f, k -> 0x0011
                java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                ih.r r3 = (p159ih.C8600r) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                ih.r r4 = (p159ih.C8600r) r4     // Catch: all -> 0x000f
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
            throw new UnsupportedOperationException("Method not decompiled: p159ih.C8600r.C8602b.mo9032k(ph.e, ph.g):ih.r$b");
        }

        /* renamed from: H */
        public C8602b m18677H(C8593q qVar) {
            if ((this.f18938n & 8) != 8 || this.f18942r == C8593q.m18808Y()) {
                this.f18942r = qVar;
            } else {
                this.f18942r = C8593q.m18781z0(this.f18942r).mo8844o(qVar).m18729x();
            }
            this.f18938n |= 8;
            return this;
        }

        /* renamed from: I */
        public C8602b m18676I(int i) {
            this.f18938n |= 64;
            this.f18945u = i;
            return this;
        }

        /* renamed from: J */
        public C8602b m18675J(int i) {
            this.f18938n |= 1;
            this.f18939o = i;
            return this;
        }

        /* renamed from: K */
        public C8602b m18674K(int i) {
            this.f18938n |= 2;
            this.f18940p = i;
            return this;
        }

        /* renamed from: L */
        public C8602b m18673L(int i) {
            this.f18938n |= 16;
            this.f18943s = i;
            return this;
        }

        /* renamed from: w */
        public C8600r build() {
            C8600r x = m18670x();
            if (x.mo8775j()) {
                return x;
            }
            throw AbstractC11686a.AbstractC0372a.m9031l(x);
        }

        /* renamed from: x */
        public C8600r m18670x() {
            C8600r rVar = new C8600r(this);
            int i = this.f18938n;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            rVar.f18927o = this.f18939o;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            rVar.f18928p = this.f18940p;
            if ((this.f18938n & 4) == 4) {
                this.f18941q = Collections.unmodifiableList(this.f18941q);
                this.f18938n &= -5;
            }
            rVar.f18929q = this.f18941q;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            rVar.f18930r = this.f18942r;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            rVar.f18931s = this.f18943s;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            rVar.f18932t = this.f18944t;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            rVar.f18933u = this.f18945u;
            if ((this.f18938n & 128) == 128) {
                this.f18946v = Collections.unmodifiableList(this.f18946v);
                this.f18938n &= -129;
            }
            rVar.f18934v = this.f18946v;
            if ((this.f18938n & Spliterator.NONNULL) == 256) {
                this.f18947w = Collections.unmodifiableList(this.f18947w);
                this.f18938n &= -257;
            }
            rVar.f18935w = this.f18947w;
            rVar.f18926n = i2;
            return rVar;
        }

        /* renamed from: y */
        public C8602b mo8846m() {
            return m18668z().mo8844o(m18670x());
        }
    }

    static {
        C8600r rVar = new C8600r(true);
        f18924z = rVar;
        rVar.m18691k0();
    }

    /* renamed from: S */
    public static C8600r m18709S() {
        return f18924z;
    }

    /* renamed from: k0 */
    private void m18691k0() {
        this.f18927o = 6;
        this.f18928p = 0;
        this.f18929q = Collections.emptyList();
        this.f18930r = C8593q.m18808Y();
        this.f18931s = 0;
        this.f18932t = C8593q.m18808Y();
        this.f18933u = 0;
        this.f18934v = Collections.emptyList();
        this.f18935w = Collections.emptyList();
    }

    /* renamed from: l0 */
    public static C8602b m18690l0() {
        return C8602b.m18668z();
    }

    /* renamed from: m0 */
    public static C8602b m18689m0(C8600r rVar) {
        return m18690l0().mo8844o(rVar);
    }

    /* renamed from: o0 */
    public static C8600r m18687o0(InputStream inputStream, C11697g gVar) {
        return f38670A.mo8774a(inputStream, gVar);
    }

    /* renamed from: P */
    public C8541b m18712P(int i) {
        return this.f18934v.get(i);
    }

    /* renamed from: Q */
    public int m18711Q() {
        return this.f18934v.size();
    }

    /* renamed from: R */
    public List<C8541b> m18710R() {
        return this.f18934v;
    }

    /* renamed from: T */
    public C8600r mo8776f() {
        return f18924z;
    }

    /* renamed from: U */
    public C8593q m18707U() {
        return this.f18932t;
    }

    /* renamed from: V */
    public int m18706V() {
        return this.f18933u;
    }

    /* renamed from: W */
    public int m18705W() {
        return this.f18927o;
    }

    /* renamed from: X */
    public int m18704X() {
        return this.f18928p;
    }

    /* renamed from: Y */
    public C8603s m18703Y(int i) {
        return this.f18929q.get(i);
    }

    /* renamed from: Z */
    public int m18702Z() {
        return this.f18929q.size();
    }

    /* renamed from: a0 */
    public List<C8603s> m18701a0() {
        return this.f18929q;
    }

    /* renamed from: b0 */
    public C8593q m18700b0() {
        return this.f18930r;
    }

    @Override // ph.AbstractC11724q
    /* renamed from: c */
    public int mo8781c() {
        int i;
        int i2 = this.f18937y;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f18926n & 1) == 1) {
            i = C11695f.m8906o(1, this.f18927o) + 0;
        } else {
            i = 0;
        }
        if ((this.f18926n & 2) == 2) {
            i += C11695f.m8906o(2, this.f18928p);
        }
        for (int i3 = 0; i3 < this.f18929q.size(); i3++) {
            i += C11695f.m8898s(3, this.f18929q.get(i3));
        }
        if ((this.f18926n & 4) == 4) {
            i += C11695f.m8898s(4, this.f18930r);
        }
        if ((this.f18926n & 8) == 8) {
            i += C11695f.m8906o(5, this.f18931s);
        }
        if ((this.f18926n & 16) == 16) {
            i += C11695f.m8898s(6, this.f18932t);
        }
        if ((this.f18926n & 32) == 32) {
            i += C11695f.m8906o(7, this.f18933u);
        }
        for (int i4 = 0; i4 < this.f18934v.size(); i4++) {
            i += C11695f.m8898s(8, this.f18934v.get(i4));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f18935w.size(); i6++) {
            i5 += C11695f.m8904p(this.f18935w.get(i6).intValue());
        }
        int size = i + i5 + (m18698d0().size() * 2) + m8833u() + this.f18925m.size();
        this.f18937y = size;
        return size;
    }

    /* renamed from: c0 */
    public int m18699c0() {
        return this.f18931s;
    }

    @Override // ph.AbstractC11724q
    /* renamed from: d */
    public void mo8780d(C11695f fVar) {
        mo8781c();
        AbstractC11702i.AbstractC11706d<MessageType>.C11707a z = m8828z();
        if ((this.f18926n & 1) == 1) {
            fVar.m8933a0(1, this.f18927o);
        }
        if ((this.f18926n & 2) == 2) {
            fVar.m8933a0(2, this.f18928p);
        }
        for (int i = 0; i < this.f18929q.size(); i++) {
            fVar.m8927d0(3, this.f18929q.get(i));
        }
        if ((this.f18926n & 4) == 4) {
            fVar.m8927d0(4, this.f18930r);
        }
        if ((this.f18926n & 8) == 8) {
            fVar.m8933a0(5, this.f18931s);
        }
        if ((this.f18926n & 16) == 16) {
            fVar.m8927d0(6, this.f18932t);
        }
        if ((this.f18926n & 32) == 32) {
            fVar.m8933a0(7, this.f18933u);
        }
        for (int i2 = 0; i2 < this.f18934v.size(); i2++) {
            fVar.m8927d0(8, this.f18934v.get(i2));
        }
        for (int i3 = 0; i3 < this.f18935w.size(); i3++) {
            fVar.m8933a0(31, this.f18935w.get(i3).intValue());
        }
        z.m8827a(ItemTouchHelper.AbstractC3083c.DEFAULT_DRAG_ANIMATION_DURATION, fVar);
        fVar.m8917i0(this.f18925m);
    }

    /* renamed from: d0 */
    public List<Integer> m18698d0() {
        return this.f18935w;
    }

    /* renamed from: e0 */
    public boolean m18697e0() {
        return (this.f18926n & 16) == 16;
    }

    /* renamed from: f0 */
    public boolean m18696f0() {
        return (this.f18926n & 32) == 32;
    }

    /* renamed from: g0 */
    public boolean m18695g0() {
        return (this.f18926n & 1) == 1;
    }

    @Override // ph.AbstractC11702i, ph.AbstractC11724q
    /* renamed from: h */
    public AbstractC11727s<C8600r> mo8778h() {
        return f38670A;
    }

    /* renamed from: h0 */
    public boolean m18694h0() {
        return (this.f18926n & 2) == 2;
    }

    /* renamed from: i0 */
    public boolean m18693i0() {
        return (this.f18926n & 4) == 4;
    }

    @Override // ph.AbstractC11726r
    /* renamed from: j */
    public final boolean mo8775j() {
        byte b = this.f18936x;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m18694h0()) {
            this.f18936x = (byte) 0;
            return false;
        }
        for (int i = 0; i < m18702Z(); i++) {
            if (!m18703Y(i).mo8775j()) {
                this.f18936x = (byte) 0;
                return false;
            }
        }
        if (m18693i0() && !m18700b0().mo8775j()) {
            this.f18936x = (byte) 0;
            return false;
        } else if (!m18697e0() || m18707U().mo8775j()) {
            for (int i2 = 0; i2 < m18711Q(); i2++) {
                if (!m18712P(i2).mo8775j()) {
                    this.f18936x = (byte) 0;
                    return false;
                }
            }
            if (!m8834t()) {
                this.f18936x = (byte) 0;
                return false;
            }
            this.f18936x = (byte) 1;
            return true;
        } else {
            this.f18936x = (byte) 0;
            return false;
        }
    }

    /* renamed from: j0 */
    public boolean m18692j0() {
        return (this.f18926n & 8) == 8;
    }

    /* renamed from: n0 */
    public C8602b mo8779e() {
        return m18690l0();
    }

    /* renamed from: p0 */
    public C8602b mo8782a() {
        return m18689m0(this);
    }

    private C8600r(AbstractC11702i.AbstractC11705c<C8600r, ?> cVar) {
        super(cVar);
        this.f18936x = (byte) -1;
        this.f18937y = -1;
        this.f18925m = cVar.m8845n();
    }

    private C8600r(boolean z) {
        this.f18936x = (byte) -1;
        this.f18937y = -1;
        this.f18925m = AbstractC11691d.f26108k;
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
    private C8600r(ph.C11694e r12, ph.C11697g r13) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p159ih.C8600r.<init>(ph.e, ph.g):void");
    }
}
