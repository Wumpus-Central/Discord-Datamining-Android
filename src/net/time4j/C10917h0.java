package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.base.AbstractC10811a;
import net.time4j.base.AbstractC10817f;
import net.time4j.base.AbstractC10818g;
import net.time4j.base.C10813c;
import net.time4j.p248tz.AbstractC11001k;
import net.time4j.p248tz.AbstractC11002l;
import net.time4j.p248tz.AbstractC11027o;
import net.time4j.p248tz.C11028p;
import p143hj.AbstractC8046c;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8049d0;
import p143hj.AbstractC8053f0;
import p143hj.AbstractC8067j0;
import p143hj.AbstractC8069k0;
import p143hj.AbstractC8074m0;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8082s;
import p143hj.AbstractC8084u;
import p143hj.AbstractC8090y;
import p143hj.AbstractC8091z;
import p143hj.C8059h0;
import p143hj.C8081r;
import p143hj.C8087x;
import p143hj.EnumC8042a0;
import p143hj.EnumC8045b0;
import p161ij.AbstractC8633c;
import p161ij.AbstractC8638h;
import p161ij.C8627a;
import p161ij.C8629b;
import p161ij.EnumC8635e;
import p271oj.EnumC11413f;

@AbstractC8633c("iso8601")
/* renamed from: net.time4j.h0 */
/* loaded from: classes8.dex */
public final class C10917h0 extends AbstractC8069k0<AbstractC11036w, C10917h0> implements AbstractC10811a, AbstractC10818g, AbstractC8049d0<AbstractC11036w>, AbstractC8638h {

    /* renamed from: m */
    private static final C10917h0 f24225m;

    /* renamed from: n */
    private static final C10917h0 f24226n;

    /* renamed from: o */
    private static final Map<Object, AbstractC8079p<?>> f24227o;

    /* renamed from: p */
    private static final C8059h0<AbstractC11036w, C10917h0> f24228p;

    /* renamed from: q */
    private static final AbstractC8067j0<AbstractC11036w, C10971n<AbstractC11036w>> f24229q;
    private static final long serialVersionUID = 7458380065762437714L;

    /* renamed from: k */
    private final transient C10892f0 f24230k;

    /* renamed from: l */
    private final transient C10906g0 f24231l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.h0$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C10918a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24232a;

        static {
            int[] iArr = new int[EnumC10899g.values().length];
            f24232a = iArr;
            try {
                iArr[EnumC10899g.f24189k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24232a[EnumC10899g.f24190l.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24232a[EnumC10899g.f24191m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24232a[EnumC10899g.f24192n.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24232a[EnumC10899g.f24193o.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24232a[EnumC10899g.f24194p.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: net.time4j.h0$c */
    /* loaded from: classes8.dex */
    private static class C10920c extends C10921d<BigDecimal> {
        C10920c(AbstractC8079p<BigDecimal> pVar) {
            super(pVar, null);
        }

        /* renamed from: t */
        public boolean mo11625p(C10917h0 h0Var, BigDecimal bigDecimal) {
            if (bigDecimal == null) {
                return false;
            }
            BigDecimal bigDecimal2 = (BigDecimal) ((C10921d) this).f24235k.mo11059f();
            if (((BigDecimal) ((C10921d) this).f24235k.mo11062T()).compareTo(bigDecimal) > 0 || bigDecimal.compareTo(bigDecimal2) > 0) {
                return false;
            }
            return true;
        }

        /* renamed from: u */
        public C10917h0 mo11622s(C10917h0 h0Var, BigDecimal bigDecimal, boolean z) {
            if (mo11625p(h0Var, bigDecimal)) {
                return C10917h0.m11650e0(h0Var.f24230k, (C10906g0) h0Var.f24231l.mo15654D(((C10921d) this).f24235k, bigDecimal));
            }
            throw new IllegalArgumentException("Out of range: " + bigDecimal);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.h0$d */
    /* loaded from: classes8.dex */
    public static class C10921d<V> implements AbstractC8091z<C10917h0, V> {

        /* renamed from: k */
        private final AbstractC8079p<V> f24235k;

        /* synthetic */ C10921d(AbstractC8079p pVar, C10918a aVar) {
            this(pVar);
        }

        /* renamed from: q */
        static <V> C10921d<V> m11624q(AbstractC8079p<V> pVar) {
            return new C10921d<>(pVar);
        }

        /* renamed from: r */
        private long m11623r(V v) {
            return ((Number) Number.class.cast(v)).longValue();
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11086b(C10917h0 h0Var) {
            return (AbstractC8079p) C10917h0.f24227o.get(this.f24235k);
        }

        /* renamed from: f */
        public AbstractC8079p<?> mo11085c(C10917h0 h0Var) {
            return (AbstractC8079p) C10917h0.f24227o.get(this.f24235k);
        }

        /* renamed from: i */
        public V mo11084d(C10917h0 h0Var) {
            if (this.f24235k.mo11063M()) {
                return (V) h0Var.f24230k.mo11380b(this.f24235k);
            }
            if (this.f24235k.mo11061U()) {
                return this.f24235k.mo11059f();
            }
            throw new C8081r("Missing rule for: " + this.f24235k.name());
        }

        /* renamed from: j */
        public V mo11078k(C10917h0 h0Var) {
            if (this.f24235k.mo11063M()) {
                return (V) h0Var.f24230k.mo11373k(this.f24235k);
            }
            if (this.f24235k.mo11061U()) {
                return this.f24235k.mo11062T();
            }
            throw new C8081r("Missing rule for: " + this.f24235k.name());
        }

        /* renamed from: o */
        public V mo11076n(C10917h0 h0Var) {
            if (this.f24235k.mo11063M()) {
                return (V) h0Var.f24230k.mo11371r(this.f24235k);
            }
            if (this.f24235k.mo11061U()) {
                return (V) h0Var.f24231l.mo11371r(this.f24235k);
            }
            throw new C8081r("Missing rule for: " + this.f24235k.name());
        }

        /* renamed from: p */
        public boolean mo11081h(C10917h0 h0Var, V v) {
            if (v == null) {
                return false;
            }
            if (this.f24235k.mo11063M()) {
                return h0Var.f24230k.mo15651z(this.f24235k, v);
            }
            if (!this.f24235k.mo11061U()) {
                throw new C8081r("Missing rule for: " + this.f24235k.name());
            } else if (Number.class.isAssignableFrom(this.f24235k.getType())) {
                long r = m11623r(this.f24235k.mo11062T());
                long r2 = m11623r(this.f24235k.mo11059f());
                long r3 = m11623r(v);
                if (r > r3 || r2 < r3) {
                    return false;
                }
                return true;
            } else if (!this.f24235k.equals(C10906g0.f24207y) || !C10906g0.f24206x.equals(v)) {
                return h0Var.f24231l.mo15651z(this.f24235k, v);
            } else {
                return false;
            }
        }

        /* renamed from: s */
        public C10917h0 mo11077m(C10917h0 h0Var, V v, boolean z) {
            if (v == null) {
                throw new IllegalArgumentException("Missing element value.");
            } else if (v.equals(mo11076n(h0Var))) {
                return h0Var;
            } else {
                if (z) {
                    return h0Var.m20683K(C10813c.m12190m(m11623r(v), m11623r(mo11076n(h0Var))), (AbstractC11036w) C10917h0.f24228p.m20711L(this.f24235k));
                } else if (this.f24235k.mo11063M()) {
                    return C10917h0.m11650e0((C10892f0) h0Var.f24230k.mo15654D(this.f24235k, v), h0Var.f24231l);
                } else {
                    if (this.f24235k.mo11061U()) {
                        if (Number.class.isAssignableFrom(this.f24235k.getType())) {
                            long r = m11623r(this.f24235k.mo11062T());
                            long r2 = m11623r(this.f24235k.mo11059f());
                            long r3 = m11623r(v);
                            if (r > r3 || r2 < r3) {
                                throw new IllegalArgumentException("Out of range: " + v);
                            }
                        } else if (this.f24235k.equals(C10906g0.f24207y) && v.equals(C10906g0.f24206x)) {
                            throw new IllegalArgumentException("Out of range: " + v);
                        }
                        return C10917h0.m11650e0(h0Var.f24230k, (C10906g0) h0Var.f24231l.mo15654D(this.f24235k, v));
                    }
                    throw new C8081r("Missing rule for: " + this.f24235k.name());
                }
            }
        }

        private C10921d(AbstractC8079p<V> pVar) {
            this.f24235k = pVar;
        }
    }

    /* renamed from: net.time4j.h0$e */
    /* loaded from: classes8.dex */
    private static class C10922e implements AbstractC8084u<C10917h0> {
        private C10922e() {
        }

        /* synthetic */ C10922e(C10918a aVar) {
            this();
        }

        /* renamed from: a */
        public C10917h0 mo11614k(AbstractC8080q<?> qVar, AbstractC8048d dVar, boolean z, boolean z2) {
            boolean z3;
            C10892f0 f0Var;
            C10906g0 g0Var;
            AbstractC11001k kVar;
            if (qVar instanceof AbstractC10817f) {
                AbstractC8046c<AbstractC11001k> cVar = C8627a.f19055d;
                if (dVar.mo15676a(cVar)) {
                    kVar = (AbstractC11001k) dVar.mo15675b(cVar);
                } else if (z) {
                    kVar = C11028p.f24516u;
                } else {
                    throw new IllegalArgumentException("Missing timezone attribute for type conversion.");
                }
                return C10779a0.m12319d0((AbstractC10817f) AbstractC10817f.class.cast(qVar)).m12300w0(kVar);
            }
            if (!z2 || qVar.mo11370s(C10906g0.f38916I) != 60) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                qVar.mo15655B(C10906g0.f38916I, 59);
            }
            AbstractC8079p<?> pVar = C10892f0.f24172x;
            if (qVar.mo11377e(pVar)) {
                f0Var = (C10892f0) qVar.mo11371r(pVar);
            } else {
                f0Var = C10892f0.m11835v0().mo11614k(qVar, dVar, z, false);
            }
            if (f0Var == null) {
                return null;
            }
            AbstractC8079p<?> pVar2 = C10906g0.f24207y;
            if (qVar.mo11377e(pVar2)) {
                g0Var = (C10906g0) qVar.mo11371r(pVar2);
            } else {
                g0Var = C10906g0.m11743l0().mo11614k(qVar, dVar, z, false);
                if (g0Var == null && z) {
                    g0Var = C10906g0.f24205w;
                }
            }
            if (g0Var == null) {
                return null;
            }
            AbstractC8079p<?> pVar3 = C11038x.f24521q;
            if (qVar.mo11377e(pVar3)) {
                f0Var = (C10892f0) f0Var.m20683K(((Long) qVar.mo11371r(pVar3)).longValue(), EnumC10882f.f24155r);
            }
            if (z3) {
                EnumC8045b0 b0Var = EnumC8045b0.LEAP_SECOND;
                Boolean bool = Boolean.TRUE;
                if (qVar.mo15651z(b0Var, bool)) {
                    qVar.mo15654D(b0Var, bool);
                }
            }
            return C10917h0.m11650e0(f0Var, g0Var);
        }

        @Override // p143hj.AbstractC8084u
        /* renamed from: b */
        public AbstractC8053f0 mo11620b() {
            return AbstractC8053f0.f17431a;
        }

        @Override // p143hj.AbstractC8084u
        /* renamed from: c */
        public C8087x<?> mo11619c() {
            return null;
        }

        @Override // p143hj.AbstractC8084u
        /* renamed from: d */
        public int mo11618d() {
            return C10892f0.m11835v0().mo11618d();
        }

        /* renamed from: e */
        public AbstractC8077o mo11615h(C10917h0 h0Var, AbstractC8048d dVar) {
            return h0Var;
        }

        @Override // p143hj.AbstractC8084u
        /* renamed from: g */
        public String mo11616g(AbstractC8090y yVar, Locale locale) {
            EnumC8635e b = EnumC8635e.m18444b(yVar.mo18445a());
            return C8629b.m18451u(b, b, locale);
        }
    }

    static {
        C10917h0 h0Var = new C10917h0(C10892f0.f24162n, C10906g0.f24205w);
        f24225m = h0Var;
        C10892f0 f0Var = C10892f0.f24163o;
        AbstractC8079p<C10906g0> pVar = C10906g0.f24207y;
        C10917h0 h0Var2 = new C10917h0(f0Var, pVar.mo11059f());
        f24226n = h0Var2;
        HashMap hashMap = new HashMap();
        AbstractC8079p<C10892f0> pVar2 = C10892f0.f24172x;
        hashMap.put(pVar2, pVar);
        AbstractC10819c<Integer, C10892f0> cVar = C10892f0.f24174z;
        AbstractC10966k0<Integer, C10892f0> k0Var = C10892f0.f38899D;
        hashMap.put(cVar, k0Var);
        AbstractC10819c<Integer, C10892f0> cVar2 = C10892f0.f38896A;
        hashMap.put(cVar2, C11045z0.f24547w.m11125n());
        AbstractC10820c0<EnumC10970m0> c0Var = C10892f0.f38897B;
        AbstractC10966k0<Integer, C10892f0> k0Var2 = C10892f0.f38903H;
        hashMap.put(c0Var, k0Var2);
        AbstractC10820c0<EnumC10809b0> c0Var2 = C10892f0.f38898C;
        AbstractC10966k0<Integer, C10892f0> k0Var3 = C10892f0.f38900E;
        hashMap.put(c0Var2, k0Var3);
        hashMap.put(k0Var, k0Var3);
        hashMap.put(k0Var3, pVar);
        AbstractC10820c0<EnumC11039x0> c0Var3 = C10892f0.f38901F;
        hashMap.put(c0Var3, pVar);
        AbstractC10966k0<Integer, C10892f0> k0Var4 = C10892f0.f38902G;
        hashMap.put(k0Var4, pVar);
        hashMap.put(k0Var2, pVar);
        AbstractC10879d0 d0Var = C10892f0.f38904I;
        hashMap.put(d0Var, pVar);
        AbstractC10821c1<EnumC11044z> c1Var = C10906g0.f38908A;
        AbstractC10966k0<Integer, C10906g0> k0Var5 = C10906g0.f38911D;
        hashMap.put(c1Var, k0Var5);
        AbstractC10819c<Integer, C10906g0> cVar3 = C10906g0.f38909B;
        AbstractC10966k0<Integer, C10906g0> k0Var6 = C10906g0.f38914G;
        hashMap.put(cVar3, k0Var6);
        AbstractC10819c<Integer, C10906g0> cVar4 = C10906g0.f38910C;
        hashMap.put(cVar4, k0Var6);
        hashMap.put(k0Var5, k0Var6);
        AbstractC10966k0<Integer, C10906g0> k0Var7 = C10906g0.f38912E;
        hashMap.put(k0Var7, k0Var6);
        AbstractC10966k0<Integer, C10906g0> k0Var8 = C10906g0.f38913F;
        hashMap.put(k0Var8, k0Var6);
        AbstractC10966k0<Integer, C10906g0> k0Var9 = C10906g0.f38916I;
        hashMap.put(k0Var6, k0Var9);
        AbstractC10966k0<Integer, C10906g0> k0Var10 = C10906g0.f38915H;
        hashMap.put(k0Var10, k0Var9);
        AbstractC10966k0<Integer, C10906g0> k0Var11 = C10906g0.f38920M;
        hashMap.put(k0Var9, k0Var11);
        AbstractC10966k0<Integer, C10906g0> k0Var12 = C10906g0.f38917J;
        hashMap.put(k0Var12, k0Var11);
        f24227o = Collections.unmodifiableMap(hashMap);
        C8059h0.C8061b k = C8059h0.C8061b.m20698k(AbstractC11036w.class, C10917h0.class, new C10922e(null), h0Var, h0Var2);
        C10921d q = C10921d.m11624q(pVar2);
        EnumC10882f fVar = EnumC10882f.f24155r;
        C8059h0.C8061b e = k.m20704e(pVar2, q, fVar);
        C10921d q2 = C10921d.m11624q(cVar);
        EnumC10882f fVar2 = EnumC10882f.f24151n;
        C8059h0.C8061b e2 = e.m20704e(cVar, q2, fVar2).m20704e(cVar2, C10921d.m11624q(cVar2), C11037w0.f24520k).m20704e(c0Var, C10921d.m11624q(c0Var), EnumC10882f.f24152o);
        C10921d q3 = C10921d.m11624q(c0Var2);
        EnumC10882f fVar3 = EnumC10882f.f24153p;
        C8059h0.C8061b d = e2.m20704e(c0Var2, q3, fVar3).m20704e(k0Var, C10921d.m11624q(k0Var), fVar3).m20704e(k0Var3, C10921d.m11624q(k0Var3), fVar).m20704e(c0Var3, C10921d.m11624q(c0Var3), fVar).m20704e(k0Var4, C10921d.m11624q(k0Var4), fVar).m20704e(k0Var2, C10921d.m11624q(k0Var2), fVar).m20704e(d0Var, C10921d.m11624q(d0Var), EnumC10882f.f24154q).m20705d(pVar, C10921d.m11624q(pVar)).m20705d(c1Var, C10921d.m11624q(c1Var));
        C10921d q4 = C10921d.m11624q(cVar3);
        EnumC10899g gVar = EnumC10899g.f24189k;
        C8059h0.C8061b e3 = d.m20704e(cVar3, q4, gVar).m20704e(cVar4, C10921d.m11624q(cVar4), gVar).m20704e(k0Var5, C10921d.m11624q(k0Var5), gVar).m20704e(k0Var7, C10921d.m11624q(k0Var7), gVar).m20704e(k0Var8, C10921d.m11624q(k0Var8), gVar);
        C10921d q5 = C10921d.m11624q(k0Var6);
        EnumC10899g gVar2 = EnumC10899g.f24190l;
        C8059h0.C8061b e4 = e3.m20704e(k0Var6, q5, gVar2).m20704e(k0Var10, C10921d.m11624q(k0Var10), gVar2);
        C10921d q6 = C10921d.m11624q(k0Var9);
        EnumC10899g gVar3 = EnumC10899g.f24191m;
        C8059h0.C8061b e5 = e4.m20704e(k0Var9, q6, gVar3).m20704e(k0Var12, C10921d.m11624q(k0Var12), gVar3);
        AbstractC10966k0<Integer, C10906g0> k0Var13 = C10906g0.f38918K;
        C10921d q7 = C10921d.m11624q(k0Var13);
        EnumC10899g gVar4 = EnumC10899g.f24192n;
        C8059h0.C8061b e6 = e5.m20704e(k0Var13, q7, gVar4);
        AbstractC10966k0<Integer, C10906g0> k0Var14 = C10906g0.f38919L;
        C10921d q8 = C10921d.m11624q(k0Var14);
        EnumC10899g gVar5 = EnumC10899g.f24193o;
        C8059h0.C8061b e7 = e6.m20704e(k0Var14, q8, gVar5);
        C10921d q9 = C10921d.m11624q(k0Var11);
        EnumC10899g gVar6 = EnumC10899g.f24194p;
        C8059h0.C8061b e8 = e7.m20704e(k0Var11, q9, gVar6);
        AbstractC10966k0<Integer, C10906g0> k0Var15 = C10906g0.f38921N;
        C8059h0.C8061b e9 = e8.m20704e(k0Var15, C10921d.m11624q(k0Var15), gVar4);
        AbstractC10966k0<Long, C10906g0> k0Var16 = C10906g0.f38922O;
        C8059h0.C8061b e10 = e9.m20704e(k0Var16, C10921d.m11624q(k0Var16), gVar5);
        AbstractC10966k0<Long, C10906g0> k0Var17 = C10906g0.f38923P;
        C8059h0.C8061b e11 = e10.m20704e(k0Var17, C10921d.m11624q(k0Var17), gVar6);
        AbstractC10821c1<BigDecimal> c1Var2 = C10906g0.f38924Q;
        C8059h0.C8061b d2 = e11.m20705d(c1Var2, new C10920c(c1Var2));
        AbstractC10821c1<BigDecimal> c1Var3 = C10906g0.f38925R;
        C8059h0.C8061b d3 = d2.m20705d(c1Var3, new C10920c(c1Var3));
        AbstractC10821c1<BigDecimal> c1Var4 = C10906g0.f38926S;
        C8059h0.C8061b d4 = d3.m20705d(c1Var4, new C10920c(c1Var4));
        AbstractC8079p<EnumC10899g> pVar3 = C10906g0.f38927T;
        C8059h0.C8061b d5 = d4.m20705d(pVar3, C10921d.m11624q(pVar3));
        m11649f0(d5);
        m11647g0(d5);
        m11646h0(d5);
        f24228p = d5.m20701h();
        f24229q = C10971n.m11413g(fVar2, fVar3, fVar, gVar, gVar2, gVar3, gVar6);
    }

    private C10917h0(C10892f0 f0Var, C10906g0 g0Var) {
        if (g0Var.mo11640p() == 24) {
            this.f24230k = (C10892f0) f0Var.m20683K(1L, EnumC10882f.f24155r);
            this.f24231l = C10906g0.f24205w;
        } else if (f0Var != null) {
            this.f24230k = f0Var;
            this.f24231l = g0Var;
        } else {
            throw new NullPointerException("Missing date.");
        }
    }

    /* renamed from: V */
    public static C8059h0<AbstractC11036w, C10917h0> m11660V() {
        return f24228p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public static C10917h0 m11658X(AbstractC10817f fVar, C11028p pVar) {
        long h = fVar.mo11325h() + pVar.m11187j();
        int a = fVar.mo11327a() + pVar.m11188i();
        if (a < 0) {
            a += 1000000000;
            h--;
        } else if (a >= 1000000000) {
            a -= 1000000000;
            h++;
        }
        C10892f0 Q0 = C10892f0.m11869Q0(C10813c.m12201b(h, 86400), EnumC8042a0.UNIX);
        int d = C10813c.m12199d(h, 86400);
        int i = d % 60;
        int i2 = d / 60;
        return m11650e0(Q0, C10906g0.m11771M0(i2 / 60, i2 % 60, i, a));
    }

    /* renamed from: d0 */
    public static C10917h0 m11651d0(int i, int i2, int i3, int i4, int i5, int i6) {
        return m11650e0(C10892f0.m11875L0(i, i2, i3), C10906g0.m11773L0(i4, i5, i6));
    }

    /* renamed from: e0 */
    public static C10917h0 m11650e0(C10892f0 f0Var, C10906g0 g0Var) {
        return new C10917h0(f0Var, g0Var);
    }

    /* renamed from: f0 */
    private static void m11649f0(C8059h0.C8061b<AbstractC11036w, C10917h0> bVar) {
        EnumC10882f[] values;
        Set<? extends AbstractC11036w> set;
        Set<? extends AbstractC11036w> range = EnumSet.range(EnumC10882f.f24148k, EnumC10882f.f24153p);
        Set<? extends AbstractC11036w> range2 = EnumSet.range(EnumC10882f.f24154q, EnumC10882f.f24155r);
        for (EnumC10882f fVar : EnumC10882f.values()) {
            AbstractC8074m0<C10917h0> bVar2 = new C10919b(fVar);
            double length = fVar.getLength();
            if (fVar.compareTo(EnumC10882f.f24154q) < 0) {
                set = range;
            } else {
                set = range2;
            }
            bVar.m20702g(fVar, bVar2, length, set);
        }
    }

    /* renamed from: g0 */
    private static void m11647g0(C8059h0.C8061b<AbstractC11036w, C10917h0> bVar) {
        EnumC10899g[] values;
        for (EnumC10899g gVar : EnumC10899g.values()) {
            bVar.m20702g(gVar, new C10919b(gVar), gVar.getLength(), EnumSet.allOf(EnumC10899g.class));
        }
    }

    /* renamed from: h0 */
    private static void m11646h0(C8059h0.C8061b<AbstractC11036w, C10917h0> bVar) {
        for (AbstractC8082s sVar : C10892f0.m11835v0().m20646v()) {
            bVar.m20703f(sVar);
        }
        for (AbstractC8082s sVar2 : C10906g0.m11743l0().m20646v()) {
            bVar.m20703f(sVar2);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p143hj.AbstractC8069k0
    /* renamed from: G */
    public C8059h0<AbstractC11036w, C10917h0> mo11639t() {
        return f24228p;
    }

    /* renamed from: T */
    public C10779a0 m11662T(C11028p pVar) {
        long i = C10813c.m12194i(this.f24230k.m11880G0() + 730, 86400L) + (this.f24231l.mo11640p() * 3600) + (this.f24231l.mo11644j() * 60) + this.f24231l.mo11648g();
        int a = this.f24231l.mo11655a();
        long j = i - pVar.m11187j();
        int i2 = a - pVar.m11188i();
        if (i2 < 0) {
            i2 += 1000000000;
            j--;
        } else if (i2 >= 1000000000) {
            i2 -= 1000000000;
            j++;
        }
        return C10779a0.m12308o0(j, i2, EnumC11413f.POSIX);
    }

    /* renamed from: U */
    public C10779a0 m11661U() {
        return m11662T(C11028p.f24516u);
    }

    /* renamed from: W */
    public int compareTo(C10917h0 h0Var) {
        if (this.f24230k.m20670R(h0Var.f24230k)) {
            return 1;
        }
        if (this.f24230k.m20669T(h0Var.f24230k)) {
            return -1;
        }
        return this.f24231l.compareTo(h0Var.f24231l);
    }

    /* renamed from: Y */
    public C10892f0 m11657Y() {
        return this.f24230k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Z */
    public C10917h0 mo11638u() {
        return this;
    }

    @Override // net.time4j.base.AbstractC10818g
    /* renamed from: a */
    public int mo11655a() {
        return this.f24231l.mo11655a();
    }

    /* renamed from: a0 */
    public C10906g0 m11654a0() {
        return this.f24231l;
    }

    /* renamed from: b0 */
    public C10779a0 m11653b0(AbstractC11002l lVar) {
        if (lVar.mo11314J()) {
            return m11662T(lVar.mo11323A(this.f24230k, this.f24231l));
        }
        AbstractC11027o E = lVar.mo11319E();
        long b = E.mo11197b(this.f24230k, this.f24231l, lVar);
        C10779a0 o0 = C10779a0.m12308o0(b, this.f24231l.mo11655a(), EnumC11413f.POSIX);
        if (E == AbstractC11002l.f24454o) {
            C10779a0.m12323Z(b, this);
        }
        return o0;
    }

    /* renamed from: c0 */
    public C10779a0 m11652c0(AbstractC11001k kVar) {
        return m11653b0(AbstractC11002l.m11310N(kVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10917h0)) {
            return false;
        }
        C10917h0 h0Var = (C10917h0) obj;
        if (!this.f24230k.equals(h0Var.f24230k) || !this.f24231l.equals(h0Var.f24231l)) {
            return false;
        }
        return true;
    }

    @Override // net.time4j.base.AbstractC10818g
    /* renamed from: g */
    public int mo11648g() {
        return this.f24231l.mo11648g();
    }

    public int hashCode() {
        return (this.f24230k.hashCode() * 13) + (this.f24231l.hashCode() * 37);
    }

    /* renamed from: i0 */
    public C10892f0 m11645i0() {
        return this.f24230k;
    }

    @Override // net.time4j.base.AbstractC10818g
    /* renamed from: j */
    public int mo11644j() {
        return this.f24231l.mo11644j();
    }

    @Override // net.time4j.base.AbstractC10811a
    /* renamed from: m */
    public int mo11643m() {
        return this.f24230k.mo11643m();
    }

    @Override // net.time4j.base.AbstractC10811a
    /* renamed from: n */
    public int mo11642n() {
        return this.f24230k.mo11642n();
    }

    @Override // net.time4j.base.AbstractC10811a
    /* renamed from: o */
    public int mo11641o() {
        return this.f24230k.mo11641o();
    }

    @Override // net.time4j.base.AbstractC10818g
    /* renamed from: p */
    public int mo11640p() {
        return this.f24231l.mo11640p();
    }

    @Override // net.time4j.base.AbstractC10811a
    public String toString() {
        return this.f24230k.toString() + this.f24231l.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.h0$b */
    /* loaded from: classes8.dex */
    public static class C10919b implements AbstractC8074m0<C10917h0> {

        /* renamed from: a */
        private final EnumC10882f f24233a;

        /* renamed from: b */
        private final EnumC10899g f24234b;

        C10919b(EnumC10882f fVar) {
            this.f24233a = fVar;
            this.f24234b = null;
        }

        /* renamed from: c */
        public C10917h0 mo11636b(C10917h0 h0Var, long j) {
            C10892f0 f0Var;
            C10906g0 g0Var;
            if (this.f24233a != null) {
                f0Var = (C10892f0) h0Var.f24230k.m20683K(j, this.f24233a);
                g0Var = h0Var.f24231l;
            } else {
                C10959j S0 = h0Var.f24231l.m11762S0(j, this.f24234b);
                C10906g0 b = S0.m11468b();
                f0Var = (C10892f0) h0Var.f24230k.m20683K(S0.m11469a(), EnumC10882f.f24155r);
                g0Var = b;
            }
            return C10917h0.m11650e0(f0Var, g0Var);
        }

        /* renamed from: d */
        public long mo11637a(C10917h0 h0Var, C10917h0 h0Var2) {
            long j;
            EnumC10882f fVar = this.f24233a;
            if (fVar != null) {
                long c = fVar.m11892c(h0Var.f24230k, h0Var2.f24230k);
                int i = (c > 0L ? 1 : (c == 0L ? 0 : -1));
                if (i == 0) {
                    return c;
                }
                boolean z = true;
                if (!(this.f24233a == EnumC10882f.f24155r || ((C10892f0) h0Var.f24230k.m20683K(c, this.f24233a)).mo11874M(h0Var2.f24230k) == 0)) {
                    z = false;
                }
                if (!z) {
                    return c;
                }
                C10906g0 g0Var = h0Var.f24231l;
                C10906g0 g0Var2 = h0Var2.f24231l;
                if (i > 0 && g0Var.m11784A0(g0Var2)) {
                    return c - 1;
                }
                if (i >= 0 || !g0Var.m11783B0(g0Var2)) {
                    return c;
                }
                return c + 1;
            } else if (h0Var.f24230k.m20670R(h0Var2.f24230k)) {
                return -mo11637a(h0Var2, h0Var);
            } else {
                long L = h0Var.f24230k.m20682L(h0Var2.f24230k, EnumC10882f.f24155r);
                if (L == 0) {
                    return this.f24234b.m11785c(h0Var.f24231l, h0Var2.f24231l);
                }
                if (this.f24234b.compareTo(EnumC10899g.f24191m) <= 0) {
                    long i2 = C10813c.m12194i(L, 86400L);
                    C10906g0 g0Var3 = h0Var2.f24231l;
                    AbstractC10966k0<Integer, C10906g0> k0Var = C10906g0.f38917J;
                    long f = C10813c.m12197f(i2, C10813c.m12190m(((Integer) g0Var3.mo11371r(k0Var)).longValue(), ((Integer) h0Var.f24231l.mo11371r(k0Var)).longValue()));
                    if (h0Var.f24231l.mo11655a() > h0Var2.f24231l.mo11655a()) {
                        f--;
                    }
                    j = f;
                } else {
                    long i3 = C10813c.m12194i(L, 86400000000000L);
                    C10906g0 g0Var4 = h0Var2.f24231l;
                    AbstractC10966k0<Long, C10906g0> k0Var2 = C10906g0.f38923P;
                    j = C10813c.m12197f(i3, C10813c.m12190m(((Long) g0Var4.mo11371r(k0Var2)).longValue(), ((Long) h0Var.f24231l.mo11371r(k0Var2)).longValue()));
                }
                switch (C10918a.f24232a[this.f24234b.ordinal()]) {
                    case 1:
                        return j / 3600;
                    case 2:
                        return j / 60;
                    case 3:
                    case 6:
                        return j;
                    case 4:
                        return j / 1000000;
                    case 5:
                        return j / 1000;
                    default:
                        throw new UnsupportedOperationException(this.f24234b.name());
                }
            }
        }

        C10919b(EnumC10899g gVar) {
            this.f24233a = null;
            this.f24234b = gVar;
        }
    }
}
