package p143hj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p143hj.AbstractC8069k0;
import p143hj.C8087x;

/* renamed from: hj.h0 */
/* loaded from: classes8.dex */
public final class C8059h0<U, T extends AbstractC8069k0<U, T>> extends C8087x<T> implements AbstractC8065i0<T> {

    /* renamed from: A */
    private final AbstractC8065i0<T> f38537A;

    /* renamed from: r */
    private final Class<U> f17440r;

    /* renamed from: s */
    private final Map<U, AbstractC8074m0<T>> f17441s;

    /* renamed from: t */
    private final Map<U, Double> f17442t;

    /* renamed from: u */
    private final Map<U, Set<U>> f17443u;

    /* renamed from: v */
    private final Map<AbstractC8079p<?>, U> f17444v;

    /* renamed from: w */
    private final T f17445w;

    /* renamed from: x */
    private final T f17446x;

    /* renamed from: y */
    private final AbstractC8068k<T> f17447y;

    /* renamed from: z */
    private final AbstractC8079p<T> f17448z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hj.h0$a */
    /* loaded from: classes8.dex */
    public class C8060a implements Comparator<U> {

        /* renamed from: k */
        final /* synthetic */ Map f17449k;

        C8060a(Map map) {
            this.f17449k = map;
        }

        @Override // java.util.Comparator
        public int compare(U u, U u2) {
            return Double.compare(C8059h0.m20710N(this.f17449k, u), C8059h0.m20710N(this.f17449k, u2));
        }
    }

    /* renamed from: hj.h0$b */
    /* loaded from: classes8.dex */
    public static final class C8061b<U, T extends AbstractC8069k0<U, T>> extends C8087x.C8088a<T> {

        /* renamed from: f */
        private final Class<U> f17451f;

        /* renamed from: g */
        private final Map<U, AbstractC8074m0<T>> f17452g;

        /* renamed from: h */
        private final Map<U, Double> f17453h;

        /* renamed from: i */
        private final Map<U, Set<U>> f17454i;

        /* renamed from: j */
        private final Map<AbstractC8079p<?>, U> f17455j;

        /* renamed from: k */
        private final T f17456k;

        /* renamed from: l */
        private final T f17457l;

        /* renamed from: m */
        private final AbstractC8068k<T> f17458m;

        /* renamed from: n */
        private AbstractC8065i0<T> f17459n;

        private C8061b(Class<U> cls, Class<T> cls2, AbstractC8084u<T> uVar, T t, T t2, AbstractC8068k<T> kVar, AbstractC8065i0<T> i0Var) {
            super(cls2, uVar);
            this.f17459n = null;
            if (cls == null) {
                throw new NullPointerException("Missing unit type.");
            } else if (t == null) {
                throw new NullPointerException("Missing minimum of range.");
            } else if (t2 == null) {
                throw new NullPointerException("Missing maximum of range.");
            } else if (!AbstractC8073m.class.isAssignableFrom(cls2) || kVar != null) {
                this.f17451f = cls;
                this.f17452g = new HashMap();
                this.f17453h = new HashMap();
                this.f17454i = new HashMap();
                this.f17455j = new HashMap();
                this.f17456k = t;
                this.f17457l = t2;
                this.f17458m = kVar;
                this.f17459n = i0Var;
            } else {
                throw new NullPointerException("Missing calendar system.");
            }
        }

        /* renamed from: i */
        private void m20700i(U u) {
            if (!this.f17474b) {
                for (U u2 : this.f17452g.keySet()) {
                    if (u2.equals(u)) {
                        throw new IllegalArgumentException("Unit duplicate found: " + u.toString());
                    }
                }
                if (u instanceof Enum) {
                    String name = ((Enum) Enum.class.cast(u)).name();
                    for (U u3 : this.f17452g.keySet()) {
                        if ((u3 instanceof Enum) && ((Enum) Enum.class.cast(u3)).name().equals(name)) {
                            throw new IllegalArgumentException("Unit duplicate found: " + name);
                        }
                    }
                }
            }
        }

        /* renamed from: j */
        public static <U, D extends AbstractC8073m<U, D>> C8061b<U, D> m20699j(Class<U> cls, Class<D> cls2, AbstractC8084u<D> uVar, AbstractC8068k<D> kVar) {
            EnumC8042a0[] values;
            C8061b<U, D> bVar = new C8061b<>(cls, cls2, uVar, kVar.mo11790b(kVar.mo11788d()), kVar.mo11790b(kVar.mo11791a()), kVar, null);
            for (EnumC8042a0 a0Var : EnumC8042a0.values()) {
                bVar.m20705d(a0Var, a0Var.m20757c(kVar));
            }
            return bVar;
        }

        /* renamed from: k */
        public static <U, T extends AbstractC8069k0<U, T>> C8061b<U, T> m20698k(Class<U> cls, Class<T> cls2, AbstractC8084u<T> uVar, T t, T t2) {
            return new C8061b<>(cls, cls2, uVar, t, t2, null, null);
        }

        /* renamed from: d */
        public <V> C8061b<U, T> m20705d(AbstractC8079p<V> pVar, AbstractC8091z<T, V> zVar) {
            super.m20642a(pVar, zVar);
            return this;
        }

        /* renamed from: e */
        public <V> C8061b<U, T> m20704e(AbstractC8079p<V> pVar, AbstractC8091z<T, V> zVar, U u) {
            if (u != null) {
                super.m20642a(pVar, zVar);
                this.f17455j.put(pVar, u);
                return this;
            }
            throw new NullPointerException("Missing base unit.");
        }

        /* renamed from: f */
        public C8061b<U, T> m20703f(AbstractC8082s sVar) {
            super.m20641b(sVar);
            return this;
        }

        /* renamed from: g */
        public C8061b<U, T> m20702g(U u, AbstractC8074m0<T> m0Var, double d, Set<? extends U> set) {
            if (u == null) {
                throw new NullPointerException("Missing time unit.");
            } else if (m0Var != null) {
                m20700i(u);
                Iterator<? extends U> it = set.iterator();
                while (it.hasNext()) {
                    if (it.next() == null) {
                        throw new NullPointerException("Found convertible unit which is null.");
                    }
                }
                if (Double.isNaN(d)) {
                    throw new IllegalArgumentException("Not a number: " + d);
                } else if (!Double.isInfinite(d)) {
                    this.f17452g.put(u, m0Var);
                    this.f17453h.put(u, Double.valueOf(d));
                    HashSet hashSet = new HashSet(set);
                    hashSet.remove(u);
                    this.f17454i.put(u, hashSet);
                    return this;
                } else {
                    throw new IllegalArgumentException("Infinite: " + d);
                }
            } else {
                throw new NullPointerException("Missing unit rule.");
            }
        }

        /* renamed from: h */
        public C8059h0<U, T> m20701h() {
            if (!this.f17452g.isEmpty()) {
                C8059h0<U, T> h0Var = new C8059h0<>(this.f17473a, this.f17451f, this.f17475c, this.f17476d, this.f17452g, this.f17453h, this.f17454i, this.f17477e, this.f17455j, this.f17456k, this.f17457l, this.f17458m, this.f17459n, null);
                C8087x.m20653G(h0Var);
                return h0Var;
            }
            throw new IllegalStateException("No time unit was registered.");
        }

        /* renamed from: l */
        public C8061b<U, T> m20697l(AbstractC8065i0<T> i0Var) {
            if (i0Var != null) {
                this.f17459n = i0Var;
                return this;
            }
            throw new NullPointerException("Missing time line.");
        }
    }

    /* renamed from: hj.h0$c */
    /* loaded from: classes8.dex */
    private static class C8062c<U, T extends AbstractC8069k0<U, T>> implements AbstractC8065i0<T> {

        /* renamed from: k */
        private final U f17460k;

        /* renamed from: l */
        private final T f17461l;

        /* renamed from: m */
        private final T f17462m;

        C8062c(U u, T t, T t2) {
            this.f17460k = u;
            this.f17461l = t;
            this.f17462m = t2;
        }

        /* renamed from: b */
        public int compare(T t, T t2) {
            return t.compareTo(t2);
        }
    }

    /* renamed from: hj.h0$d */
    /* loaded from: classes8.dex */
    private static class C8063d<T extends AbstractC8069k0<?, T>> extends AbstractC8050e<T> implements AbstractC8091z<T, T> {
        private static final long serialVersionUID = 4777240530511579802L;
        private final T max;
        private final T min;
        private final Class<T> type;

        /* synthetic */ C8063d(Class cls, AbstractC8069k0 k0Var, AbstractC8069k0 k0Var2, C8060a aVar) {
            this(cls, k0Var, k0Var2);
        }

        /* renamed from: A */
        public AbstractC8079p<?> mo11086b(T t) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: D */
        public AbstractC8079p<?> mo11085c(T t) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: E */
        public T mo11059f() {
            return this.max;
        }

        /* renamed from: F */
        public T mo11062T() {
            return this.min;
        }

        /* renamed from: G */
        public T mo11084d(T t) {
            return mo11059f();
        }

        /* renamed from: H */
        public T mo11078k(T t) {
            return mo11062T();
        }

        /* renamed from: I */
        public T mo11076n(T t) {
            return t;
        }

        /* renamed from: J */
        public boolean mo11081h(T t, T t2) {
            return t2 != null;
        }

        /* renamed from: K */
        public T mo11077m(T t, T t2, boolean z) {
            if (t2 != null) {
                return t2;
            }
            throw new IllegalArgumentException("Missing value.");
        }

        @Override // p143hj.AbstractC8079p
        /* renamed from: M */
        public boolean mo11063M() {
            return false;
        }

        @Override // p143hj.AbstractC8079p
        /* renamed from: U */
        public boolean mo11061U() {
            return false;
        }

        @Override // p143hj.AbstractC8079p
        public Class<T> getType() {
            return this.type;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p143hj.AbstractC8050e
        /* renamed from: q */
        public <X extends AbstractC8080q<X>> AbstractC8091z<X, T> mo11057q(C8087x<X> xVar) {
            if (xVar.m20648q().equals(this.type)) {
                return this;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p143hj.AbstractC8050e
        /* renamed from: w */
        public String mo20686w(C8087x<?> xVar) {
            return null;
        }

        @Override // p143hj.AbstractC8050e
        /* renamed from: y */
        protected boolean mo11143y() {
            return true;
        }

        private C8063d(Class<T> cls, T t, T t2) {
            super(cls.getName() + "-AXIS");
            this.type = cls;
            this.min = t;
            this.max = t2;
        }
    }

    /* synthetic */ C8059h0(Class cls, Class cls2, AbstractC8084u uVar, Map map, Map map2, Map map3, Map map4, List list, Map map5, AbstractC8069k0 k0Var, AbstractC8069k0 k0Var2, AbstractC8068k kVar, AbstractC8065i0 i0Var, C8060a aVar) {
        this(cls, cls2, uVar, map, map2, map3, map4, list, map5, k0Var, k0Var2, kVar, i0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static <U> double m20710N(Map<U, Double> map, U u) {
        Double d = map.get(u);
        if (d != null) {
            return d.doubleValue();
        }
        if (u instanceof AbstractC8086w) {
            return ((AbstractC8086w) AbstractC8086w.class.cast(u)).getLength();
        }
        return Double.NaN;
    }

    /* renamed from: I */
    public int compare(T t, T t2) {
        return t.compareTo(t2);
    }

    /* renamed from: J */
    public T mo11614k(AbstractC8080q<?> qVar, AbstractC8048d dVar, boolean z, boolean z2) {
        if (qVar.mo11377e(this.f17448z)) {
            return (T) ((AbstractC8069k0) qVar.mo11371r(this.f17448z));
        }
        return (T) ((AbstractC8069k0) super.mo11614k(qVar, dVar, z, z2));
    }

    /* renamed from: K */
    public AbstractC8079p<T> m20712K() {
        return this.f17448z;
    }

    /* renamed from: L */
    public U m20711L(AbstractC8079p<?> pVar) {
        if (pVar != null) {
            U u = this.f17444v.get(pVar);
            if (u == null && (pVar instanceof AbstractC8050e)) {
                u = this.f17444v.get(((AbstractC8050e) pVar).mo11053v());
            }
            if (u != null) {
                return u;
            }
            throw new C8081r("Base unit not found for: " + pVar.name());
        }
        throw new NullPointerException("Missing element.");
    }

    /* renamed from: O */
    public T m20709O() {
        return this.f17446x;
    }

    /* renamed from: P */
    public T m20708P() {
        return this.f17445w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public AbstractC8074m0<T> m20707Q(U u) {
        AbstractC8074m0<T> c;
        if (u == null) {
            throw new NullPointerException("Missing chronological unit.");
        } else if (m20706R(u)) {
            return this.f17441s.get(u);
        } else {
            if ((u instanceof AbstractC8052f) && (c = ((AbstractC8052f) AbstractC8052f.class.cast(u)).mo11164c(this)) != null) {
                return c;
            }
            throw new C8051e0(this, u);
        }
    }

    /* renamed from: R */
    public boolean m20706R(U u) {
        return this.f17441s.containsKey(u);
    }

    @Override // p143hj.C8087x
    /* renamed from: n */
    public AbstractC8068k<T> mo20650n() {
        AbstractC8068k<T> kVar = this.f17447y;
        if (kVar == null) {
            return super.mo20650n();
        }
        return kVar;
    }

    @Override // p143hj.C8087x
    /* renamed from: o */
    public AbstractC8068k<T> mo20649o(String str) {
        if (str.isEmpty()) {
            return mo20650n();
        }
        return super.mo20649o(str);
    }

    private C8059h0(Class<T> cls, Class<U> cls2, AbstractC8084u<T> uVar, Map<AbstractC8079p<?>, AbstractC8091z<T, ?>> map, Map<U, AbstractC8074m0<T>> map2, Map<U, Double> map3, Map<U, Set<U>> map4, List<AbstractC8082s> list, Map<AbstractC8079p<?>, U> map5, T t, T t2, AbstractC8068k<T> kVar, AbstractC8065i0<T> i0Var) {
        super(cls, uVar, map, list);
        this.f17440r = cls2;
        this.f17441s = Collections.unmodifiableMap(map2);
        this.f17442t = Collections.unmodifiableMap(map3);
        this.f17443u = Collections.unmodifiableMap(map4);
        this.f17444v = Collections.unmodifiableMap(map5);
        this.f17445w = t;
        this.f17446x = t2;
        this.f17447y = kVar;
        this.f17448z = new C8063d(cls, t, t2, null);
        if (i0Var == null) {
            ArrayList arrayList = new ArrayList(map2.keySet());
            Collections.sort(arrayList, new C8060a(map3));
            this.f38537A = new C8062c(arrayList.get(0), t, t2);
            return;
        }
        this.f38537A = i0Var;
    }
}
