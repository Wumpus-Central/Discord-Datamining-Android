package cc;

import cc.AbstractC3899l0;
import cc.AbstractC3950v0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* renamed from: cc.j0 */
/* loaded from: classes3.dex */
public class C3892j0<K, V> extends AbstractC3950v0<K, V> implements AbstractC3843e1<K, V> {

    /* renamed from: cc.j0$a */
    /* loaded from: classes3.dex */
    public static final class C3893a<K, V> extends AbstractC3950v0.C3953c<K, V> {
        /* renamed from: e */
        public C3892j0<K, V> m33385e() {
            return (C3892j0) super.m33277a();
        }

        /* renamed from: f */
        public C3893a<K, V> mo33275c(K k, Iterable<? extends V> iterable) {
            super.mo33275c(k, iterable);
            return this;
        }

        /* renamed from: g */
        public C3893a<K, V> m33383g(K k, V... vArr) {
            super.m33274d(k, vArr);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3892j0(AbstractC3899l0<K, AbstractC3884i0<V>> l0Var, int i) {
        super(l0Var, i);
    }

    /* renamed from: B */
    public static <K, V> C3892j0<K, V> m33388B() {
        return C3971y.f6533q;
    }

    /* renamed from: y */
    public static <K, V> C3893a<K, V> m33387y() {
        return new C3893a<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    public static <K, V> C3892j0<K, V> m33386z(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        AbstractC3884i0 i0Var;
        if (collection.isEmpty()) {
            return m33388B();
        }
        AbstractC3899l0.C3901b bVar = new AbstractC3899l0.C3901b(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            if (comparator == null) {
                i0Var = AbstractC3884i0.m33401u(collection2);
            } else {
                i0Var = AbstractC3884i0.m33407B(comparator, collection2);
            }
            if (!i0Var.isEmpty()) {
                bVar.m33364d(key, i0Var);
                i += i0Var.size();
            }
        }
        return new C3892j0<>(bVar.m33367a(), i);
    }

    /* renamed from: A */
    public AbstractC3884i0<V> get(K k) {
        AbstractC3884i0<V> i0Var = (AbstractC3884i0) this.f6492o.get(k);
        if (i0Var == null) {
            return AbstractC3884i0.m33399x();
        }
        return i0Var;
    }
}
