package p143hj;

import p143hj.AbstractC8080q;

/* renamed from: hj.g0 */
/* loaded from: classes8.dex */
public final class C8057g0<T extends AbstractC8080q<T>> implements AbstractC8085v<T> {

    /* renamed from: k */
    private final int f17435k;

    /* renamed from: l */
    private final AbstractC8079p<?> f17436l;

    /* renamed from: m */
    private final Object f17437m;

    private C8057g0(int i, AbstractC8079p<?> pVar) {
        this(i, pVar, null);
    }

    /* renamed from: a */
    private static <U, T extends AbstractC8069k0<U, T>> T m20736a(AbstractC8069k0<U, T> k0Var, AbstractC8079p<?> pVar, boolean z) {
        U L = k0Var.mo11639t().m20711L(pVar);
        if (z) {
            return k0Var.m20683K(1L, L);
        }
        return k0Var.m20684J(1L, L);
    }

    /* renamed from: c */
    public static <T extends AbstractC8080q<T>> AbstractC8085v<T> m20734c(AbstractC8079p<?> pVar) {
        return new C8057g0(4, pVar);
    }

    /* renamed from: d */
    public static <T extends AbstractC8080q<T>> AbstractC8085v<T> m20733d(AbstractC8079p<?> pVar) {
        return new C8057g0(3, pVar);
    }

    /* renamed from: e */
    private <V> T m20732e(AbstractC8080q<T> qVar, AbstractC8079p<V> pVar) {
        T u = qVar.mo11638u();
        while (true) {
            pVar = (AbstractC8079p<V>) u.mo11639t().m20643y(pVar).mo11086b(u);
            if (pVar == null) {
                return u;
            }
            u = m20720q(u, pVar);
        }
    }

    /* renamed from: f */
    public static <T extends AbstractC8080q<T>> AbstractC8085v<T> m20731f(AbstractC8079p<?> pVar) {
        return new C8057g0(6, pVar);
    }

    /* renamed from: g */
    private <V> T m20730g(AbstractC8080q<T> qVar, AbstractC8079p<V> pVar) {
        T u = qVar.mo11638u();
        while (true) {
            pVar = (AbstractC8079p<V>) u.mo11639t().m20643y(pVar).mo11085c(u);
            if (pVar == null) {
                return u;
            }
            u = m20719r(u, pVar);
        }
    }

    /* renamed from: h */
    public static <T extends AbstractC8080q<T>> AbstractC8085v<T> m20729h(AbstractC8079p<?> pVar) {
        return new C8057g0(7, pVar);
    }

    /* renamed from: i */
    private <V> T m20728i(AbstractC8080q<T> qVar, AbstractC8079p<V> pVar) {
        return qVar.mo15654D(pVar, qVar.mo11380b(pVar));
    }

    /* renamed from: j */
    public static <T extends AbstractC8080q<T>> AbstractC8085v<T> m20727j(AbstractC8079p<?> pVar) {
        return new C8057g0(2, pVar);
    }

    /* renamed from: k */
    private <V> T m20726k(AbstractC8080q<T> qVar, AbstractC8079p<V> pVar) {
        return qVar.mo15654D(pVar, qVar.mo11373k(pVar));
    }

    /* renamed from: l */
    public static <T extends AbstractC8080q<T>> AbstractC8085v<T> m20725l(AbstractC8079p<?> pVar) {
        return new C8057g0(1, pVar);
    }

    /* renamed from: m */
    private T m20724m(T t, boolean z) {
        if (t instanceof AbstractC8069k0) {
            return t.mo11639t().m20648q().cast(m20736a((AbstractC8069k0) AbstractC8069k0.class.cast(t), this.f17436l, z));
        }
        throw new C8081r("Base units not supported by: " + t.mo11639t().m20648q());
    }

    /* renamed from: n */
    public static <T extends AbstractC8080q<T>, V> AbstractC8085v<T> m20723n(V v, AbstractC8079p<V> pVar) {
        return new C8057g0(0, pVar, v);
    }

    /* renamed from: o */
    public static <T extends AbstractC8080q<T>, V> AbstractC8085v<T> m20722o(V v, AbstractC8079p<V> pVar) {
        return new C8057g0(5, pVar, v);
    }

    /* renamed from: p */
    private <V> T m20721p(AbstractC8080q<T> qVar, AbstractC8079p<V> pVar, Object obj, boolean z) {
        T u = qVar.mo11638u();
        return u.mo11639t().m20643y(pVar).mo11077m(u, pVar.getType().cast(obj), z);
    }

    /* renamed from: q */
    private <V> T m20720q(T t, AbstractC8079p<V> pVar) {
        AbstractC8091z<T, V> y = t.mo11639t().m20643y(pVar);
        return y.mo11077m(t, y.mo11084d(t), pVar.mo11088i());
    }

    /* renamed from: r */
    private <V> T m20719r(T t, AbstractC8079p<V> pVar) {
        AbstractC8091z<T, V> y = t.mo11639t().m20643y(pVar);
        return y.mo11077m(t, y.mo11078k(t), pVar.mo11088i());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public T apply(T t) {
        switch (this.f17435k) {
            case 0:
                return m20721p(t, this.f17436l, this.f17437m, false);
            case 1:
                return m20726k(t, this.f17436l);
            case 2:
                return m20728i(t, this.f17436l);
            case 3:
                return m20730g(t, this.f17436l);
            case 4:
                return m20732e(t, this.f17436l);
            case 5:
                return m20721p(t, this.f17436l, this.f17437m, true);
            case 6:
                return m20724m(t, false);
            case 7:
                return m20724m(t, true);
            default:
                throw new UnsupportedOperationException("Unknown mode: " + this.f17435k);
        }
    }

    private C8057g0(int i, AbstractC8079p<?> pVar, Object obj) {
        if (pVar != null) {
            this.f17435k = i;
            this.f17436l = pVar;
            this.f17437m = obj;
            return;
        }
        throw new NullPointerException("Missing chronological element.");
    }
}
