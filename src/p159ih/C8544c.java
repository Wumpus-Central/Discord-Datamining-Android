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
import ph.C11710j;

/* renamed from: ih.c */
/* loaded from: classes8.dex */
public final class C8544c extends AbstractC11702i.AbstractC11706d<C8544c> {

    /* renamed from: U */
    private static final C8544c f38610U;

    /* renamed from: V */
    public static AbstractC11727s<C8544c> f38611V = new C8545a();

    /* renamed from: A */
    private List<C8547d> f38612A;

    /* renamed from: B */
    private List<C8568i> f38613B;

    /* renamed from: C */
    private List<C8581n> f38614C;

    /* renamed from: D */
    private List<C8600r> f38615D;

    /* renamed from: E */
    private List<C8560g> f38616E;

    /* renamed from: F */
    private List<Integer> f38617F;

    /* renamed from: G */
    private int f38618G;

    /* renamed from: H */
    private int f38619H;

    /* renamed from: I */
    private C8593q f38620I;

    /* renamed from: J */
    private int f38621J;

    /* renamed from: K */
    private List<Integer> f38622K;

    /* renamed from: L */
    private int f38623L;

    /* renamed from: M */
    private List<C8593q> f38624M;

    /* renamed from: N */
    private List<Integer> f38625N;

    /* renamed from: O */
    private int f38626O;

    /* renamed from: P */
    private C8608t f38627P;

    /* renamed from: Q */
    private List<Integer> f38628Q;

    /* renamed from: R */
    private C8621w f38629R;

    /* renamed from: S */
    private byte f38630S;

    /* renamed from: T */
    private int f38631T;

    /* renamed from: m */
    private final AbstractC11691d f18621m;

    /* renamed from: n */
    private int f18622n;

    /* renamed from: o */
    private int f18623o;

    /* renamed from: p */
    private int f18624p;

    /* renamed from: q */
    private int f18625q;

    /* renamed from: r */
    private List<C8603s> f18626r;

    /* renamed from: s */
    private List<C8593q> f18627s;

    /* renamed from: t */
    private List<Integer> f18628t;

    /* renamed from: u */
    private int f18629u;

    /* renamed from: v */
    private List<Integer> f18630v;

    /* renamed from: w */
    private int f18631w;

    /* renamed from: x */
    private List<C8593q> f18632x;

    /* renamed from: y */
    private List<Integer> f18633y;

    /* renamed from: z */
    private int f18634z;

    /* renamed from: ih.c$a */
    /* loaded from: classes8.dex */
    static class C8545a extends AbstractC11687b<C8544c> {
        C8545a() {
        }

        /* renamed from: m */
        public C8544c mo8771d(C11694e eVar, C11697g gVar) {
            return new C8544c(eVar, gVar);
        }
    }

    /* renamed from: ih.c$b */
    /* loaded from: classes8.dex */
    public static final class C8546b extends AbstractC11702i.AbstractC11705c<C8544c, C8546b> {

        /* renamed from: D */
        private int f38635D;

        /* renamed from: F */
        private int f38637F;

        /* renamed from: n */
        private int f18635n;

        /* renamed from: p */
        private int f18637p;

        /* renamed from: q */
        private int f18638q;

        /* renamed from: o */
        private int f18636o = 6;

        /* renamed from: r */
        private List<C8603s> f18639r = Collections.emptyList();

        /* renamed from: s */
        private List<C8593q> f18640s = Collections.emptyList();

        /* renamed from: t */
        private List<Integer> f18641t = Collections.emptyList();

        /* renamed from: u */
        private List<Integer> f18642u = Collections.emptyList();

        /* renamed from: v */
        private List<C8593q> f18643v = Collections.emptyList();

        /* renamed from: w */
        private List<Integer> f18644w = Collections.emptyList();

        /* renamed from: x */
        private List<C8547d> f18645x = Collections.emptyList();

        /* renamed from: y */
        private List<C8568i> f18646y = Collections.emptyList();

        /* renamed from: z */
        private List<C8581n> f18647z = Collections.emptyList();

        /* renamed from: A */
        private List<C8600r> f38632A = Collections.emptyList();

        /* renamed from: B */
        private List<C8560g> f38633B = Collections.emptyList();

        /* renamed from: C */
        private List<Integer> f38634C = Collections.emptyList();

        /* renamed from: E */
        private C8593q f38636E = C8593q.m18808Y();

        /* renamed from: G */
        private List<Integer> f38638G = Collections.emptyList();

        /* renamed from: H */
        private List<C8593q> f38639H = Collections.emptyList();

        /* renamed from: I */
        private List<Integer> f38640I = Collections.emptyList();

        /* renamed from: J */
        private C8608t f38641J = C8608t.m18608x();

        /* renamed from: K */
        private List<Integer> f38642K = Collections.emptyList();

        /* renamed from: L */
        private C8621w f38643L = C8621w.m18501v();

        private C8546b() {
            m19331Q();
        }

        /* renamed from: A */
        private void m19347A() {
            if ((this.f18635n & 512) != 512) {
                this.f18645x = new ArrayList(this.f18645x);
                this.f18635n |= 512;
            }
        }

        /* renamed from: B */
        private void m19346B() {
            if ((this.f18635n & Spliterator.NONNULL) != 256) {
                this.f18644w = new ArrayList(this.f18644w);
                this.f18635n |= Spliterator.NONNULL;
            }
        }

        /* renamed from: C */
        private void m19345C() {
            if ((this.f18635n & 128) != 128) {
                this.f18643v = new ArrayList(this.f18643v);
                this.f18635n |= 128;
            }
        }

        /* renamed from: D */
        private void m19344D() {
            if ((this.f18635n & 8192) != 8192) {
                this.f38633B = new ArrayList(this.f38633B);
                this.f18635n |= 8192;
            }
        }

        /* renamed from: E */
        private void m19343E() {
            if ((this.f18635n & Spliterator.IMMUTABLE) != 1024) {
                this.f18646y = new ArrayList(this.f18646y);
                this.f18635n |= Spliterator.IMMUTABLE;
            }
        }

        /* renamed from: F */
        private void m19342F() {
            if ((this.f18635n & 262144) != 262144) {
                this.f38638G = new ArrayList(this.f38638G);
                this.f18635n |= 262144;
            }
        }

        /* renamed from: G */
        private void m19341G() {
            if ((this.f18635n & 1048576) != 1048576) {
                this.f38640I = new ArrayList(this.f38640I);
                this.f18635n |= 1048576;
            }
        }

        /* renamed from: H */
        private void m19340H() {
            if ((this.f18635n & 524288) != 524288) {
                this.f38639H = new ArrayList(this.f38639H);
                this.f18635n |= 524288;
            }
        }

        /* renamed from: I */
        private void m19339I() {
            if ((this.f18635n & 64) != 64) {
                this.f18642u = new ArrayList(this.f18642u);
                this.f18635n |= 64;
            }
        }

        /* renamed from: J */
        private void m19338J() {
            if ((this.f18635n & RecyclerView.ItemAnimator.FLAG_MOVED) != 2048) {
                this.f18647z = new ArrayList(this.f18647z);
                this.f18635n |= RecyclerView.ItemAnimator.FLAG_MOVED;
            }
        }

        /* renamed from: K */
        private void m19337K() {
            if ((this.f18635n & Spliterator.SUBSIZED) != 16384) {
                this.f38634C = new ArrayList(this.f38634C);
                this.f18635n |= Spliterator.SUBSIZED;
            }
        }

        /* renamed from: L */
        private void m19336L() {
            if ((this.f18635n & 32) != 32) {
                this.f18641t = new ArrayList(this.f18641t);
                this.f18635n |= 32;
            }
        }

        /* renamed from: M */
        private void m19335M() {
            if ((this.f18635n & 16) != 16) {
                this.f18640s = new ArrayList(this.f18640s);
                this.f18635n |= 16;
            }
        }

        /* renamed from: N */
        private void m19334N() {
            if ((this.f18635n & 4096) != 4096) {
                this.f38632A = new ArrayList(this.f38632A);
                this.f18635n |= 4096;
            }
        }

        /* renamed from: O */
        private void m19333O() {
            if ((this.f18635n & 8) != 8) {
                this.f18639r = new ArrayList(this.f18639r);
                this.f18635n |= 8;
            }
        }

        /* renamed from: P */
        private void m19332P() {
            if ((this.f18635n & 4194304) != 4194304) {
                this.f38642K = new ArrayList(this.f38642K);
                this.f18635n |= 4194304;
            }
        }

        /* renamed from: Q */
        private void m19331Q() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public static C8546b m19316z() {
            return new C8546b();
        }

        /* renamed from: R */
        public C8546b mo8844o(C8544c cVar) {
            if (cVar == C8544c.m19349z0()) {
                return this;
            }
            if (cVar.m19374m1()) {
                m19324X(cVar.m19442E0());
            }
            if (cVar.m19372n1()) {
                m19323Y(cVar.m19440F0());
            }
            if (cVar.m19376l1()) {
                m19325W(cVar.m19365r0());
            }
            if (!cVar.f18626r.isEmpty()) {
                if (this.f18639r.isEmpty()) {
                    this.f18639r = cVar.f18626r;
                    this.f18635n &= -9;
                } else {
                    m19333O();
                    this.f18639r.addAll(cVar.f18626r);
                }
            }
            if (!cVar.f18627s.isEmpty()) {
                if (this.f18640s.isEmpty()) {
                    this.f18640s = cVar.f18627s;
                    this.f18635n &= -17;
                } else {
                    m19335M();
                    this.f18640s.addAll(cVar.f18627s);
                }
            }
            if (!cVar.f18628t.isEmpty()) {
                if (this.f18641t.isEmpty()) {
                    this.f18641t = cVar.f18628t;
                    this.f18635n &= -33;
                } else {
                    m19336L();
                    this.f18641t.addAll(cVar.f18628t);
                }
            }
            if (!cVar.f18630v.isEmpty()) {
                if (this.f18642u.isEmpty()) {
                    this.f18642u = cVar.f18630v;
                    this.f18635n &= -65;
                } else {
                    m19339I();
                    this.f18642u.addAll(cVar.f18630v);
                }
            }
            if (!cVar.f18632x.isEmpty()) {
                if (this.f18643v.isEmpty()) {
                    this.f18643v = cVar.f18632x;
                    this.f18635n &= -129;
                } else {
                    m19345C();
                    this.f18643v.addAll(cVar.f18632x);
                }
            }
            if (!cVar.f18633y.isEmpty()) {
                if (this.f18644w.isEmpty()) {
                    this.f18644w = cVar.f18633y;
                    this.f18635n &= -257;
                } else {
                    m19346B();
                    this.f18644w.addAll(cVar.f18633y);
                }
            }
            if (!cVar.f38612A.isEmpty()) {
                if (this.f18645x.isEmpty()) {
                    this.f18645x = cVar.f38612A;
                    this.f18635n &= -513;
                } else {
                    m19347A();
                    this.f18645x.addAll(cVar.f38612A);
                }
            }
            if (!cVar.f38613B.isEmpty()) {
                if (this.f18646y.isEmpty()) {
                    this.f18646y = cVar.f38613B;
                    this.f18635n &= -1025;
                } else {
                    m19343E();
                    this.f18646y.addAll(cVar.f38613B);
                }
            }
            if (!cVar.f38614C.isEmpty()) {
                if (this.f18647z.isEmpty()) {
                    this.f18647z = cVar.f38614C;
                    this.f18635n &= -2049;
                } else {
                    m19338J();
                    this.f18647z.addAll(cVar.f38614C);
                }
            }
            if (!cVar.f38615D.isEmpty()) {
                if (this.f38632A.isEmpty()) {
                    this.f38632A = cVar.f38615D;
                    this.f18635n &= -4097;
                } else {
                    m19334N();
                    this.f38632A.addAll(cVar.f38615D);
                }
            }
            if (!cVar.f38616E.isEmpty()) {
                if (this.f38633B.isEmpty()) {
                    this.f38633B = cVar.f38616E;
                    this.f18635n &= -8193;
                } else {
                    m19344D();
                    this.f38633B.addAll(cVar.f38616E);
                }
            }
            if (!cVar.f38617F.isEmpty()) {
                if (this.f38634C.isEmpty()) {
                    this.f38634C = cVar.f38617F;
                    this.f18635n &= -16385;
                } else {
                    m19337K();
                    this.f38634C.addAll(cVar.f38617F);
                }
            }
            if (cVar.m19370o1()) {
                m19322Z(cVar.m19432J0());
            }
            if (cVar.m19368p1()) {
                m19328T(cVar.m19430K0());
            }
            if (cVar.m19366q1()) {
                m19321a0(cVar.m19428L0());
            }
            if (!cVar.f38622K.isEmpty()) {
                if (this.f38638G.isEmpty()) {
                    this.f38638G = cVar.f38622K;
                    this.f18635n &= -262145;
                } else {
                    m19342F();
                    this.f38638G.addAll(cVar.f38622K);
                }
            }
            if (!cVar.f38624M.isEmpty()) {
                if (this.f38639H.isEmpty()) {
                    this.f38639H = cVar.f38624M;
                    this.f18635n &= -524289;
                } else {
                    m19340H();
                    this.f38639H.addAll(cVar.f38624M);
                }
            }
            if (!cVar.f38625N.isEmpty()) {
                if (this.f38640I.isEmpty()) {
                    this.f38640I = cVar.f38625N;
                    this.f18635n &= -1048577;
                } else {
                    m19341G();
                    this.f38640I.addAll(cVar.f38625N);
                }
            }
            if (cVar.m19364r1()) {
                m19327U(cVar.m19382i1());
            }
            if (!cVar.f38628Q.isEmpty()) {
                if (this.f38642K.isEmpty()) {
                    this.f38642K = cVar.f38628Q;
                    this.f18635n &= -4194305;
                } else {
                    m19332P();
                    this.f38642K.addAll(cVar.f38628Q);
                }
            }
            if (cVar.m19362s1()) {
                m19326V(cVar.m19378k1());
            }
            m8839u(cVar);
            m8843q(m8845n().m9017b(cVar.f18621m));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: S */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p159ih.C8544c.C8546b mo9032k(ph.C11694e r3, ph.C11697g r4) {
            /*
                r2 = this;
                r0 = 0
                ph.s<ih.c> r1 = p159ih.C8544c.f38611V     // Catch: all -> 0x000f, k -> 0x0011
                java.lang.Object r3 = r1.mo8771d(r3, r4)     // Catch: all -> 0x000f, k -> 0x0011
                ih.c r3 = (p159ih.C8544c) r3     // Catch: all -> 0x000f, k -> 0x0011
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
                ih.c r4 = (p159ih.C8544c) r4     // Catch: all -> 0x000f
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
            throw new UnsupportedOperationException("Method not decompiled: p159ih.C8544c.C8546b.mo9032k(ph.e, ph.g):ih.c$b");
        }

        /* renamed from: T */
        public C8546b m19328T(C8593q qVar) {
            if ((this.f18635n & 65536) != 65536 || this.f38636E == C8593q.m18808Y()) {
                this.f38636E = qVar;
            } else {
                this.f38636E = C8593q.m18781z0(this.f38636E).mo8844o(qVar).m18729x();
            }
            this.f18635n |= 65536;
            return this;
        }

        /* renamed from: U */
        public C8546b m19327U(C8608t tVar) {
            if ((this.f18635n & 2097152) != 2097152 || this.f38641J == C8608t.m18608x()) {
                this.f38641J = tVar;
            } else {
                this.f38641J = C8608t.m18616F(this.f38641J).mo8844o(tVar).m18601t();
            }
            this.f18635n |= 2097152;
            return this;
        }

        /* renamed from: V */
        public C8546b m19326V(C8621w wVar) {
            if ((this.f18635n & 8388608) != 8388608 || this.f38643L == C8621w.m18501v()) {
                this.f38643L = wVar;
            } else {
                this.f38643L = C8621w.m18507A(this.f38643L).mo8844o(wVar).m18493t();
            }
            this.f18635n |= 8388608;
            return this;
        }

        /* renamed from: W */
        public C8546b m19325W(int i) {
            this.f18635n |= 4;
            this.f18638q = i;
            return this;
        }

        /* renamed from: X */
        public C8546b m19324X(int i) {
            this.f18635n |= 1;
            this.f18636o = i;
            return this;
        }

        /* renamed from: Y */
        public C8546b m19323Y(int i) {
            this.f18635n |= 2;
            this.f18637p = i;
            return this;
        }

        /* renamed from: Z */
        public C8546b m19322Z(int i) {
            this.f18635n |= 32768;
            this.f38635D = i;
            return this;
        }

        /* renamed from: a0 */
        public C8546b m19321a0(int i) {
            this.f18635n |= 131072;
            this.f38637F = i;
            return this;
        }

        /* renamed from: w */
        public C8544c build() {
            C8544c x = m19318x();
            if (x.mo8775j()) {
                return x;
            }
            throw AbstractC11686a.AbstractC0372a.m9031l(x);
        }

        /* renamed from: x */
        public C8544c m19318x() {
            C8544c cVar = new C8544c(this);
            int i = this.f18635n;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            cVar.f18623o = this.f18636o;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            cVar.f18624p = this.f18637p;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            cVar.f18625q = this.f18638q;
            if ((this.f18635n & 8) == 8) {
                this.f18639r = Collections.unmodifiableList(this.f18639r);
                this.f18635n &= -9;
            }
            cVar.f18626r = this.f18639r;
            if ((this.f18635n & 16) == 16) {
                this.f18640s = Collections.unmodifiableList(this.f18640s);
                this.f18635n &= -17;
            }
            cVar.f18627s = this.f18640s;
            if ((this.f18635n & 32) == 32) {
                this.f18641t = Collections.unmodifiableList(this.f18641t);
                this.f18635n &= -33;
            }
            cVar.f18628t = this.f18641t;
            if ((this.f18635n & 64) == 64) {
                this.f18642u = Collections.unmodifiableList(this.f18642u);
                this.f18635n &= -65;
            }
            cVar.f18630v = this.f18642u;
            if ((this.f18635n & 128) == 128) {
                this.f18643v = Collections.unmodifiableList(this.f18643v);
                this.f18635n &= -129;
            }
            cVar.f18632x = this.f18643v;
            if ((this.f18635n & Spliterator.NONNULL) == 256) {
                this.f18644w = Collections.unmodifiableList(this.f18644w);
                this.f18635n &= -257;
            }
            cVar.f18633y = this.f18644w;
            if ((this.f18635n & 512) == 512) {
                this.f18645x = Collections.unmodifiableList(this.f18645x);
                this.f18635n &= -513;
            }
            cVar.f38612A = this.f18645x;
            if ((this.f18635n & Spliterator.IMMUTABLE) == 1024) {
                this.f18646y = Collections.unmodifiableList(this.f18646y);
                this.f18635n &= -1025;
            }
            cVar.f38613B = this.f18646y;
            if ((this.f18635n & RecyclerView.ItemAnimator.FLAG_MOVED) == 2048) {
                this.f18647z = Collections.unmodifiableList(this.f18647z);
                this.f18635n &= -2049;
            }
            cVar.f38614C = this.f18647z;
            if ((this.f18635n & 4096) == 4096) {
                this.f38632A = Collections.unmodifiableList(this.f38632A);
                this.f18635n &= -4097;
            }
            cVar.f38615D = this.f38632A;
            if ((this.f18635n & 8192) == 8192) {
                this.f38633B = Collections.unmodifiableList(this.f38633B);
                this.f18635n &= -8193;
            }
            cVar.f38616E = this.f38633B;
            if ((this.f18635n & Spliterator.SUBSIZED) == 16384) {
                this.f38634C = Collections.unmodifiableList(this.f38634C);
                this.f18635n &= -16385;
            }
            cVar.f38617F = this.f38634C;
            if ((i & 32768) == 32768) {
                i2 |= 8;
            }
            cVar.f38619H = this.f38635D;
            if ((i & 65536) == 65536) {
                i2 |= 16;
            }
            cVar.f38620I = this.f38636E;
            if ((i & 131072) == 131072) {
                i2 |= 32;
            }
            cVar.f38621J = this.f38637F;
            if ((this.f18635n & 262144) == 262144) {
                this.f38638G = Collections.unmodifiableList(this.f38638G);
                this.f18635n &= -262145;
            }
            cVar.f38622K = this.f38638G;
            if ((this.f18635n & 524288) == 524288) {
                this.f38639H = Collections.unmodifiableList(this.f38639H);
                this.f18635n &= -524289;
            }
            cVar.f38624M = this.f38639H;
            if ((this.f18635n & 1048576) == 1048576) {
                this.f38640I = Collections.unmodifiableList(this.f38640I);
                this.f18635n &= -1048577;
            }
            cVar.f38625N = this.f38640I;
            if ((i & 2097152) == 2097152) {
                i2 |= 64;
            }
            cVar.f38627P = this.f38641J;
            if ((this.f18635n & 4194304) == 4194304) {
                this.f38642K = Collections.unmodifiableList(this.f38642K);
                this.f18635n &= -4194305;
            }
            cVar.f38628Q = this.f38642K;
            if ((i & 8388608) == 8388608) {
                i2 |= 128;
            }
            cVar.f38629R = this.f38643L;
            cVar.f18622n = i2;
            return cVar;
        }

        /* renamed from: y */
        public C8546b mo8846m() {
            return m19316z().mo8844o(m19318x());
        }
    }

    /* renamed from: ih.c$c */
    /* loaded from: classes8.dex */
    public enum EnumC0270c implements C11710j.AbstractC11711a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);
        

        /* renamed from: s */
        private static C11710j.AbstractC11712b<EnumC0270c> f18655s = new a();

        /* renamed from: k */
        private final int f18657k;

        /* renamed from: ih.c$c$a */
        /* loaded from: classes8.dex */
        static class a implements C11710j.AbstractC11712b<EnumC0270c> {
            a() {
            }

            /* renamed from: b */
            public EnumC0270c mo8811a(int i) {
                return EnumC0270c.m19315a(i);
            }
        }

        EnumC0270c(int i, int i2) {
            this.f18657k = i2;
        }

        /* renamed from: a */
        public static EnumC0270c m19315a(int i) {
            switch (i) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }

        @Override // ph.C11710j.AbstractC11711a
        public final int getNumber() {
            return this.f18657k;
        }
    }

    static {
        C8544c cVar = new C8544c(true);
        f38610U = cVar;
        cVar.m19360t1();
    }

    /* renamed from: t1 */
    private void m19360t1() {
        this.f18623o = 6;
        this.f18624p = 0;
        this.f18625q = 0;
        this.f18626r = Collections.emptyList();
        this.f18627s = Collections.emptyList();
        this.f18628t = Collections.emptyList();
        this.f18630v = Collections.emptyList();
        this.f18632x = Collections.emptyList();
        this.f18633y = Collections.emptyList();
        this.f38612A = Collections.emptyList();
        this.f38613B = Collections.emptyList();
        this.f38614C = Collections.emptyList();
        this.f38615D = Collections.emptyList();
        this.f38616E = Collections.emptyList();
        this.f38617F = Collections.emptyList();
        this.f38619H = 0;
        this.f38620I = C8593q.m18808Y();
        this.f38621J = 0;
        this.f38622K = Collections.emptyList();
        this.f38624M = Collections.emptyList();
        this.f38625N = Collections.emptyList();
        this.f38627P = C8608t.m18608x();
        this.f38628Q = Collections.emptyList();
        this.f38629R = C8621w.m18501v();
    }

    /* renamed from: u1 */
    public static C8546b m19358u1() {
        return C8546b.m19316z();
    }

    /* renamed from: v1 */
    public static C8546b m19356v1(C8544c cVar) {
        return m19358u1().mo8844o(cVar);
    }

    /* renamed from: x1 */
    public static C8544c m19352x1(InputStream inputStream, C11697g gVar) {
        return f38611V.mo8772c(inputStream, gVar);
    }

    /* renamed from: z0 */
    public static C8544c m19349z0() {
        return f38610U;
    }

    /* renamed from: A0 */
    public C8544c mo8776f() {
        return f38610U;
    }

    /* renamed from: B0 */
    public C8560g m19448B0(int i) {
        return this.f38616E.get(i);
    }

    /* renamed from: C0 */
    public int m19446C0() {
        return this.f38616E.size();
    }

    /* renamed from: D0 */
    public List<C8560g> m19444D0() {
        return this.f38616E;
    }

    /* renamed from: E0 */
    public int m19442E0() {
        return this.f18623o;
    }

    /* renamed from: F0 */
    public int m19440F0() {
        return this.f18624p;
    }

    /* renamed from: G0 */
    public C8568i m19438G0(int i) {
        return this.f38613B.get(i);
    }

    /* renamed from: H0 */
    public int m19436H0() {
        return this.f38613B.size();
    }

    /* renamed from: I0 */
    public List<C8568i> m19434I0() {
        return this.f38613B;
    }

    /* renamed from: J0 */
    public int m19432J0() {
        return this.f38619H;
    }

    /* renamed from: K0 */
    public C8593q m19430K0() {
        return this.f38620I;
    }

    /* renamed from: L0 */
    public int m19428L0() {
        return this.f38621J;
    }

    /* renamed from: M0 */
    public int m19426M0() {
        return this.f38622K.size();
    }

    /* renamed from: N0 */
    public List<Integer> m19424N0() {
        return this.f38622K;
    }

    /* renamed from: O0 */
    public C8593q m19422O0(int i) {
        return this.f38624M.get(i);
    }

    /* renamed from: P0 */
    public int m19420P0() {
        return this.f38624M.size();
    }

    /* renamed from: Q0 */
    public int m19418Q0() {
        return this.f38625N.size();
    }

    /* renamed from: R0 */
    public List<Integer> m19416R0() {
        return this.f38625N;
    }

    /* renamed from: S0 */
    public List<C8593q> m19414S0() {
        return this.f38624M;
    }

    /* renamed from: T0 */
    public List<Integer> m19412T0() {
        return this.f18630v;
    }

    /* renamed from: U0 */
    public C8581n m19410U0(int i) {
        return this.f38614C.get(i);
    }

    /* renamed from: V0 */
    public int m19408V0() {
        return this.f38614C.size();
    }

    /* renamed from: W0 */
    public List<C8581n> m19406W0() {
        return this.f38614C;
    }

    /* renamed from: X0 */
    public List<Integer> m19404X0() {
        return this.f38617F;
    }

    /* renamed from: Y0 */
    public C8593q m19402Y0(int i) {
        return this.f18627s.get(i);
    }

    /* renamed from: Z0 */
    public int m19400Z0() {
        return this.f18627s.size();
    }

    /* renamed from: a1 */
    public List<Integer> m19398a1() {
        return this.f18628t;
    }

    /* renamed from: b1 */
    public List<C8593q> m19396b1() {
        return this.f18627s;
    }

    @Override // ph.AbstractC11724q
    /* renamed from: c */
    public int mo8781c() {
        int i;
        int i2 = this.f38631T;
        if (i2 != -1) {
            return i2;
        }
        if ((this.f18622n & 1) == 1) {
            i = C11695f.m8906o(1, this.f18623o) + 0;
        } else {
            i = 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f18628t.size(); i4++) {
            i3 += C11695f.m8904p(this.f18628t.get(i4).intValue());
        }
        int i5 = i + i3;
        if (!m19398a1().isEmpty()) {
            i5 = i5 + 1 + C11695f.m8904p(i3);
        }
        this.f18629u = i3;
        if ((this.f18622n & 2) == 2) {
            i5 += C11695f.m8906o(3, this.f18624p);
        }
        if ((this.f18622n & 4) == 4) {
            i5 += C11695f.m8906o(4, this.f18625q);
        }
        for (int i6 = 0; i6 < this.f18626r.size(); i6++) {
            i5 += C11695f.m8898s(5, this.f18626r.get(i6));
        }
        for (int i7 = 0; i7 < this.f18627s.size(); i7++) {
            i5 += C11695f.m8898s(6, this.f18627s.get(i7));
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f18630v.size(); i9++) {
            i8 += C11695f.m8904p(this.f18630v.get(i9).intValue());
        }
        int i10 = i5 + i8;
        if (!m19412T0().isEmpty()) {
            i10 = i10 + 1 + C11695f.m8904p(i8);
        }
        this.f18631w = i8;
        for (int i11 = 0; i11 < this.f38612A.size(); i11++) {
            i10 += C11695f.m8898s(8, this.f38612A.get(i11));
        }
        for (int i12 = 0; i12 < this.f38613B.size(); i12++) {
            i10 += C11695f.m8898s(9, this.f38613B.get(i12));
        }
        for (int i13 = 0; i13 < this.f38614C.size(); i13++) {
            i10 += C11695f.m8898s(10, this.f38614C.get(i13));
        }
        for (int i14 = 0; i14 < this.f38615D.size(); i14++) {
            i10 += C11695f.m8898s(11, this.f38615D.get(i14));
        }
        for (int i15 = 0; i15 < this.f38616E.size(); i15++) {
            i10 += C11695f.m8898s(13, this.f38616E.get(i15));
        }
        int i16 = 0;
        for (int i17 = 0; i17 < this.f38617F.size(); i17++) {
            i16 += C11695f.m8904p(this.f38617F.get(i17).intValue());
        }
        int i18 = i10 + i16;
        if (!m19404X0().isEmpty()) {
            i18 = i18 + 2 + C11695f.m8904p(i16);
        }
        this.f38618G = i16;
        if ((this.f18622n & 8) == 8) {
            i18 += C11695f.m8906o(17, this.f38619H);
        }
        if ((this.f18622n & 16) == 16) {
            i18 += C11695f.m8898s(18, this.f38620I);
        }
        if ((this.f18622n & 32) == 32) {
            i18 += C11695f.m8906o(19, this.f38621J);
        }
        for (int i19 = 0; i19 < this.f18632x.size(); i19++) {
            i18 += C11695f.m8898s(20, this.f18632x.get(i19));
        }
        int i20 = 0;
        for (int i21 = 0; i21 < this.f18633y.size(); i21++) {
            i20 += C11695f.m8904p(this.f18633y.get(i21).intValue());
        }
        int i22 = i18 + i20;
        if (!m19353x0().isEmpty()) {
            i22 = i22 + 2 + C11695f.m8904p(i20);
        }
        this.f18634z = i20;
        int i23 = 0;
        for (int i24 = 0; i24 < this.f38622K.size(); i24++) {
            i23 += C11695f.m8904p(this.f38622K.get(i24).intValue());
        }
        int i25 = i22 + i23;
        if (!m19424N0().isEmpty()) {
            i25 = i25 + 2 + C11695f.m8904p(i23);
        }
        this.f38623L = i23;
        for (int i26 = 0; i26 < this.f38624M.size(); i26++) {
            i25 += C11695f.m8898s(23, this.f38624M.get(i26));
        }
        int i27 = 0;
        for (int i28 = 0; i28 < this.f38625N.size(); i28++) {
            i27 += C11695f.m8904p(this.f38625N.get(i28).intValue());
        }
        int i29 = i25 + i27;
        if (!m19416R0().isEmpty()) {
            i29 = i29 + 2 + C11695f.m8904p(i27);
        }
        this.f38626O = i27;
        if ((this.f18622n & 64) == 64) {
            i29 += C11695f.m8898s(30, this.f38627P);
        }
        int i30 = 0;
        for (int i31 = 0; i31 < this.f38628Q.size(); i31++) {
            i30 += C11695f.m8904p(this.f38628Q.get(i31).intValue());
        }
        int size = i29 + i30 + (m19380j1().size() * 2);
        if ((this.f18622n & 128) == 128) {
            size += C11695f.m8898s(32, this.f38629R);
        }
        int u = size + m8833u() + this.f18621m.size();
        this.f38631T = u;
        return u;
    }

    /* renamed from: c1 */
    public C8600r m19394c1(int i) {
        return this.f38615D.get(i);
    }

    @Override // ph.AbstractC11724q
    /* renamed from: d */
    public void mo8780d(C11695f fVar) {
        mo8781c();
        AbstractC11702i.AbstractC11706d<MessageType>.C11707a z = m8828z();
        if ((this.f18622n & 1) == 1) {
            fVar.m8933a0(1, this.f18623o);
        }
        if (m19398a1().size() > 0) {
            fVar.m8905o0(18);
            fVar.m8905o0(this.f18629u);
        }
        for (int i = 0; i < this.f18628t.size(); i++) {
            fVar.m8931b0(this.f18628t.get(i).intValue());
        }
        if ((this.f18622n & 2) == 2) {
            fVar.m8933a0(3, this.f18624p);
        }
        if ((this.f18622n & 4) == 4) {
            fVar.m8933a0(4, this.f18625q);
        }
        for (int i2 = 0; i2 < this.f18626r.size(); i2++) {
            fVar.m8927d0(5, this.f18626r.get(i2));
        }
        for (int i3 = 0; i3 < this.f18627s.size(); i3++) {
            fVar.m8927d0(6, this.f18627s.get(i3));
        }
        if (m19412T0().size() > 0) {
            fVar.m8905o0(58);
            fVar.m8905o0(this.f18631w);
        }
        for (int i4 = 0; i4 < this.f18630v.size(); i4++) {
            fVar.m8931b0(this.f18630v.get(i4).intValue());
        }
        for (int i5 = 0; i5 < this.f38612A.size(); i5++) {
            fVar.m8927d0(8, this.f38612A.get(i5));
        }
        for (int i6 = 0; i6 < this.f38613B.size(); i6++) {
            fVar.m8927d0(9, this.f38613B.get(i6));
        }
        for (int i7 = 0; i7 < this.f38614C.size(); i7++) {
            fVar.m8927d0(10, this.f38614C.get(i7));
        }
        for (int i8 = 0; i8 < this.f38615D.size(); i8++) {
            fVar.m8927d0(11, this.f38615D.get(i8));
        }
        for (int i9 = 0; i9 < this.f38616E.size(); i9++) {
            fVar.m8927d0(13, this.f38616E.get(i9));
        }
        if (m19404X0().size() > 0) {
            fVar.m8905o0(130);
            fVar.m8905o0(this.f38618G);
        }
        for (int i10 = 0; i10 < this.f38617F.size(); i10++) {
            fVar.m8931b0(this.f38617F.get(i10).intValue());
        }
        if ((this.f18622n & 8) == 8) {
            fVar.m8933a0(17, this.f38619H);
        }
        if ((this.f18622n & 16) == 16) {
            fVar.m8927d0(18, this.f38620I);
        }
        if ((this.f18622n & 32) == 32) {
            fVar.m8933a0(19, this.f38621J);
        }
        for (int i11 = 0; i11 < this.f18632x.size(); i11++) {
            fVar.m8927d0(20, this.f18632x.get(i11));
        }
        if (m19353x0().size() > 0) {
            fVar.m8905o0(170);
            fVar.m8905o0(this.f18634z);
        }
        for (int i12 = 0; i12 < this.f18633y.size(); i12++) {
            fVar.m8931b0(this.f18633y.get(i12).intValue());
        }
        if (m19424N0().size() > 0) {
            fVar.m8905o0(178);
            fVar.m8905o0(this.f38623L);
        }
        for (int i13 = 0; i13 < this.f38622K.size(); i13++) {
            fVar.m8931b0(this.f38622K.get(i13).intValue());
        }
        for (int i14 = 0; i14 < this.f38624M.size(); i14++) {
            fVar.m8927d0(23, this.f38624M.get(i14));
        }
        if (m19416R0().size() > 0) {
            fVar.m8905o0(194);
            fVar.m8905o0(this.f38626O);
        }
        for (int i15 = 0; i15 < this.f38625N.size(); i15++) {
            fVar.m8931b0(this.f38625N.get(i15).intValue());
        }
        if ((this.f18622n & 64) == 64) {
            fVar.m8927d0(30, this.f38627P);
        }
        for (int i16 = 0; i16 < this.f38628Q.size(); i16++) {
            fVar.m8933a0(31, this.f38628Q.get(i16).intValue());
        }
        if ((this.f18622n & 128) == 128) {
            fVar.m8927d0(32, this.f38629R);
        }
        z.m8827a(19000, fVar);
        fVar.m8917i0(this.f18621m);
    }

    /* renamed from: d1 */
    public int m19392d1() {
        return this.f38615D.size();
    }

    /* renamed from: e1 */
    public List<C8600r> m19390e1() {
        return this.f38615D;
    }

    /* renamed from: f1 */
    public C8603s m19388f1(int i) {
        return this.f18626r.get(i);
    }

    /* renamed from: g1 */
    public int m19386g1() {
        return this.f18626r.size();
    }

    @Override // ph.AbstractC11702i, ph.AbstractC11724q
    /* renamed from: h */
    public AbstractC11727s<C8544c> mo8778h() {
        return f38611V;
    }

    /* renamed from: h1 */
    public List<C8603s> m19384h1() {
        return this.f18626r;
    }

    /* renamed from: i1 */
    public C8608t m19382i1() {
        return this.f38627P;
    }

    @Override // ph.AbstractC11726r
    /* renamed from: j */
    public final boolean mo8775j() {
        byte b = this.f38630S;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m19372n1()) {
            this.f38630S = (byte) 0;
            return false;
        }
        for (int i = 0; i < m19386g1(); i++) {
            if (!m19388f1(i).mo8775j()) {
                this.f38630S = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < m19400Z0(); i2++) {
            if (!m19402Y0(i2).mo8775j()) {
                this.f38630S = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < m19355w0(); i3++) {
            if (!m19357v0(i3).mo8775j()) {
                this.f38630S = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < m19361t0(); i4++) {
            if (!m19363s0(i4).mo8775j()) {
                this.f38630S = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < m19436H0(); i5++) {
            if (!m19438G0(i5).mo8775j()) {
                this.f38630S = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < m19408V0(); i6++) {
            if (!m19410U0(i6).mo8775j()) {
                this.f38630S = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < m19392d1(); i7++) {
            if (!m19394c1(i7).mo8775j()) {
                this.f38630S = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < m19446C0(); i8++) {
            if (!m19448B0(i8).mo8775j()) {
                this.f38630S = (byte) 0;
                return false;
            }
        }
        if (!m19368p1() || m19430K0().mo8775j()) {
            for (int i9 = 0; i9 < m19420P0(); i9++) {
                if (!m19422O0(i9).mo8775j()) {
                    this.f38630S = (byte) 0;
                    return false;
                }
            }
            if (m19364r1() && !m19382i1().mo8775j()) {
                this.f38630S = (byte) 0;
                return false;
            } else if (!m8834t()) {
                this.f38630S = (byte) 0;
                return false;
            } else {
                this.f38630S = (byte) 1;
                return true;
            }
        } else {
            this.f38630S = (byte) 0;
            return false;
        }
    }

    /* renamed from: j1 */
    public List<Integer> m19380j1() {
        return this.f38628Q;
    }

    /* renamed from: k1 */
    public C8621w m19378k1() {
        return this.f38629R;
    }

    /* renamed from: l1 */
    public boolean m19376l1() {
        return (this.f18622n & 4) == 4;
    }

    /* renamed from: m1 */
    public boolean m19374m1() {
        return (this.f18622n & 1) == 1;
    }

    /* renamed from: n1 */
    public boolean m19372n1() {
        return (this.f18622n & 2) == 2;
    }

    /* renamed from: o1 */
    public boolean m19370o1() {
        return (this.f18622n & 8) == 8;
    }

    /* renamed from: p1 */
    public boolean m19368p1() {
        return (this.f18622n & 16) == 16;
    }

    /* renamed from: q1 */
    public boolean m19366q1() {
        return (this.f18622n & 32) == 32;
    }

    /* renamed from: r0 */
    public int m19365r0() {
        return this.f18625q;
    }

    /* renamed from: r1 */
    public boolean m19364r1() {
        return (this.f18622n & 64) == 64;
    }

    /* renamed from: s0 */
    public C8547d m19363s0(int i) {
        return this.f38612A.get(i);
    }

    /* renamed from: s1 */
    public boolean m19362s1() {
        return (this.f18622n & 128) == 128;
    }

    /* renamed from: t0 */
    public int m19361t0() {
        return this.f38612A.size();
    }

    /* renamed from: u0 */
    public List<C8547d> m19359u0() {
        return this.f38612A;
    }

    /* renamed from: v0 */
    public C8593q m19357v0(int i) {
        return this.f18632x.get(i);
    }

    /* renamed from: w0 */
    public int m19355w0() {
        return this.f18632x.size();
    }

    /* renamed from: w1 */
    public C8546b mo8779e() {
        return m19358u1();
    }

    /* renamed from: x0 */
    public List<Integer> m19353x0() {
        return this.f18633y;
    }

    /* renamed from: y0 */
    public List<C8593q> m19351y0() {
        return this.f18632x;
    }

    /* renamed from: y1 */
    public C8546b mo8782a() {
        return m19356v1(this);
    }

    private C8544c(AbstractC11702i.AbstractC11705c<C8544c, ?> cVar) {
        super(cVar);
        this.f18629u = -1;
        this.f18631w = -1;
        this.f18634z = -1;
        this.f38618G = -1;
        this.f38623L = -1;
        this.f38626O = -1;
        this.f38630S = (byte) -1;
        this.f38631T = -1;
        this.f18621m = cVar.m8845n();
    }

    private C8544c(boolean z) {
        this.f18629u = -1;
        this.f18631w = -1;
        this.f18634z = -1;
        this.f38618G = -1;
        this.f38623L = -1;
        this.f38626O = -1;
        this.f38630S = (byte) -1;
        this.f38631T = -1;
        this.f18621m = AbstractC11691d.f26108k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C8544c(ph.C11694e r18, ph.C11697g r19) {
        /*
            Method dump skipped, instructions count: 1720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p159ih.C8544c.<init>(ph.e, ph.g):void");
    }
}
