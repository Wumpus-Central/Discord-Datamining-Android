package cc;

import java.util.Comparator;
import java.util.Map;
import p030bc.AbstractC3454f;

/* renamed from: cc.r1 */
/* loaded from: classes3.dex */
public abstract class AbstractC3937r1<T> implements Comparator<T> {
    /* renamed from: b */
    public static <T> AbstractC3937r1<T> m33316b(Comparator<T> comparator) {
        if (comparator instanceof AbstractC3937r1) {
            return (AbstractC3937r1) comparator;
        }
        return new C3959w(comparator);
    }

    /* renamed from: d */
    public static <C extends Comparable> AbstractC3937r1<C> m33314d() {
        return C3923o1.f6459k;
    }

    /* renamed from: c */
    public <E extends T> AbstractC3884i0<E> m33315c(Iterable<E> iterable) {
        return AbstractC3884i0.m33407B(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t, T t2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public <T2 extends T> AbstractC3937r1<Map.Entry<T2, ?>> m33313g() {
        return (AbstractC3937r1<Map.Entry<T2, ?>>) m33312h(C3871h1.m33435d());
    }

    /* renamed from: h */
    public <F> AbstractC3937r1<F> m33312h(AbstractC3454f<F, ? extends T> fVar) {
        return new C3898l(fVar, this);
    }

    /* renamed from: k */
    public <S extends T> AbstractC3937r1<S> mo33221k() {
        return new C3974y1(this);
    }
}
