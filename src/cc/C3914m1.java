package cc;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p030bc.AbstractC3465n;
import p030bc.C3457i;

/* renamed from: cc.m1 */
/* loaded from: classes3.dex */
public final class C3914m1 {

    /* renamed from: cc.m1$a */
    /* loaded from: classes3.dex */
    private static class C3915a<K, V> extends AbstractC3832c<K, V> {

        /* renamed from: q */
        transient AbstractC3465n<? extends List<V>> f6451q;

        C3915a(Map<K, Collection<V>> map, AbstractC3465n<? extends List<V>> nVar) {
            super(map);
            this.f6451q = (AbstractC3465n) C3457i.m34352i(nVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: H */
        public List<V> mo33344v() {
            return (List) this.f6451q.get();
        }

        @Override // cc.AbstractC3889j
        /* renamed from: d */
        Map<K, Collection<V>> mo33297d() {
            return m33473x();
        }

        @Override // cc.AbstractC3889j
        /* renamed from: f */
        Set<K> mo33295f() {
            return m33472y();
        }
    }

    /* renamed from: cc.m1$b */
    /* loaded from: classes3.dex */
    static abstract class AbstractC3916b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        /* renamed from: a */
        abstract AbstractC3897k1<K, V> mo33343a();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            mo33343a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo33343a().mo33299b(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo33343a().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return mo33343a().size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m33347a(AbstractC3897k1<?, ?> k1Var, Object obj) {
        if (obj == k1Var) {
            return true;
        }
        if (obj instanceof AbstractC3897k1) {
            return k1Var.asMap().equals(((AbstractC3897k1) obj).asMap());
        }
        return false;
    }

    /* renamed from: b */
    public static <K, V> AbstractC3843e1<K, V> m33346b(Map<K, Collection<V>> map, AbstractC3465n<? extends List<V>> nVar) {
        return new C3915a(map, nVar);
    }
}
