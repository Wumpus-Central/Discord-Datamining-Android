package fi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;
import p163j$.util.concurrent.ConcurrentHashMap;
import p233mi.AbstractC10623c;
import p233mi.AbstractC10627e;
import p233mi.AbstractC10661s;
import p286pi.C11754a;

/* renamed from: fi.c1 */
/* loaded from: classes8.dex */
public final class C7232c1 extends AbstractC10627e<AbstractC7224a1<?>, AbstractC7224a1<?>> {

    /* renamed from: l */
    public static final C7233a f15671l = new C7233a(null);

    /* renamed from: m */
    private static final C7232c1 f15672m;

    /* renamed from: fi.c1$a */
    /* loaded from: classes8.dex */
    public static final class C7233a extends AbstractC10661s<AbstractC7224a1<?>, AbstractC7224a1<?>> {
        private C7233a() {
        }

        public /* synthetic */ C7233a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // p233mi.AbstractC10661s
        /* renamed from: b */
        public <T extends AbstractC7224a1<?>> int mo12680b(ConcurrentHashMap<KClass<? extends AbstractC7224a1<?>>, Integer> concurrentHashMap, KClass<T> kClass, Function1<? super KClass<? extends AbstractC7224a1<?>>, Integer> compute) {
            int intValue;
            C9971q.m14633g(concurrentHashMap, "<this>");
            C9971q.m14633g(kClass, "kClass");
            C9971q.m14633g(compute, "compute");
            Integer num = concurrentHashMap.get(kClass);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                Integer num2 = concurrentHashMap.get(kClass);
                if (num2 == null) {
                    Integer invoke = compute.invoke(kClass);
                    concurrentHashMap.putIfAbsent(kClass, Integer.valueOf(invoke.intValue()));
                    num2 = invoke;
                }
                C9971q.m14634f(num2, "this[kClass] ?: compute(…putIfAbsent(kClass, it) }");
                intValue = num2.intValue();
            }
            return intValue;
        }

        /* renamed from: g */
        public final C7232c1 m23150g(List<? extends AbstractC7224a1<?>> attributes) {
            C9971q.m14633g(attributes, "attributes");
            if (attributes.isEmpty()) {
                return m23149h();
            }
            return new C7232c1(attributes, null);
        }

        /* renamed from: h */
        public final C7232c1 m23149h() {
            return C7232c1.f15672m;
        }
    }

    static {
        List i;
        i = C9906j.m14820i();
        f15672m = new C7232c1(i);
    }

    private C7232c1(List<? extends AbstractC7224a1<?>> list) {
        Iterator<? extends AbstractC7224a1<?>> it = list.iterator();
        while (it.hasNext()) {
            AbstractC7224a1 a1Var = (AbstractC7224a1) it.next();
            m12708f(a1Var.mo23030b(), a1Var);
        }
    }

    public /* synthetic */ C7232c1(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    @Override // p233mi.AbstractC10621a
    /* renamed from: b */
    protected AbstractC10661s<AbstractC7224a1<?>, AbstractC7224a1<?>> mo12714b() {
        return f15671l;
    }

    /* renamed from: i */
    public final C7232c1 m23156i(C7232c1 other) {
        AbstractC7224a1 a1Var;
        C9971q.m14633g(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        for (Number number : f15671l.m12677e()) {
            int intValue = number.intValue();
            AbstractC7224a1<?> a1Var2 = mo12709a().get(intValue);
            AbstractC7224a1<?> a1Var3 = other.mo12709a().get(intValue);
            if (a1Var2 != null) {
                a1Var = a1Var2.mo23031a(a1Var3);
            } else if (a1Var3 != null) {
                a1Var = a1Var3.mo23031a(a1Var2);
            } else {
                a1Var = null;
            }
            C11754a.m8689a(arrayList, a1Var);
        }
        return f15671l.m23150g(arrayList);
    }

    /* renamed from: j */
    public final boolean m23155j(AbstractC7224a1<?> attribute) {
        C9971q.m14633g(attribute, "attribute");
        if (mo12709a().get(f15671l.m12678d(attribute.mo23030b())) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final C7232c1 m23154p(C7232c1 other) {
        AbstractC7224a1 a1Var;
        C9971q.m14633g(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        for (Number number : f15671l.m12677e()) {
            int intValue = number.intValue();
            AbstractC7224a1<?> a1Var2 = mo12709a().get(intValue);
            AbstractC7224a1<?> a1Var3 = other.mo12709a().get(intValue);
            if (a1Var2 != null) {
                a1Var = a1Var2.mo23029c(a1Var3);
            } else if (a1Var3 != null) {
                a1Var = a1Var3.mo23029c(a1Var2);
            } else {
                a1Var = null;
            }
            C11754a.m8689a(arrayList, a1Var);
        }
        return f15671l.m23150g(arrayList);
    }

    /* renamed from: r */
    public final C7232c1 m23153r(AbstractC7224a1<?> attribute) {
        List D0;
        List<? extends AbstractC7224a1<?>> p0;
        C9971q.m14633g(attribute, "attribute");
        if (m23155j(attribute)) {
            return this;
        }
        if (isEmpty()) {
            return new C7232c1(attribute);
        }
        D0 = C9914r.m14790D0(this);
        p0 = C9914r.m14749p0(D0, attribute);
        return f15671l.m23150g(p0);
    }

    /* renamed from: s */
    public final C7232c1 m23152s(AbstractC7224a1<?> attribute) {
        C9971q.m14633g(attribute, "attribute");
        if (isEmpty()) {
            return this;
        }
        AbstractC10623c<AbstractC7224a1<?>> a = mo12709a();
        ArrayList arrayList = new ArrayList();
        for (AbstractC7224a1<?> a1Var : a) {
            if (!C9971q.m14638b(a1Var, attribute)) {
                arrayList.add(a1Var);
            }
        }
        if (arrayList.size() == mo12709a().mo12695a()) {
            return this;
        }
        return f15671l.m23150g(arrayList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C7232c1(fi.AbstractC7224a1<?> r1) {
        /*
            r0 = this;
            java.util.List r1 = kotlin.collections.C9904h.m14869d(r1)
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fi.C7232c1.<init>(fi.a1):void");
    }
}
