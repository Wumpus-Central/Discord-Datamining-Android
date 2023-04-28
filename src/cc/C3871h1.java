package cc;

import cc.C3828b2;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p030bc.AbstractC3454f;
import p030bc.C3456h;
import p030bc.C3457i;
import p163j$.util.Collection;
import p163j$.util.Map;
import p163j$.util.Set;
import p163j$.util.function.BiConsumer;
import p163j$.util.function.Consumer;
import p163j$.util.function.Function;
import p163j$.util.function.Predicate;

/* renamed from: cc.h1 */
/* loaded from: classes3.dex */
public final class C3871h1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cc.h1$a */
    /* loaded from: classes3.dex */
    public class C3872a extends AbstractC3848f2<Map.Entry<K, V>, V> {
        C3872a(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Type inference failed for: r1v1, types: [V, java.lang.Object] */
        /* renamed from: c */
        public V mo33423b(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cc.h1$b */
    /* loaded from: classes3.dex */
    public class C3873b extends AbstractC3883i<K, V> {

        /* renamed from: k */
        final /* synthetic */ Map.Entry f6409k;

        C3873b(Map.Entry entry) {
            this.f6409k = entry;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, K] */
        @Override // cc.AbstractC3883i, java.util.Map.Entry
        public K getKey() {
            return this.f6409k.getKey();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [V, java.lang.Object] */
        @Override // cc.AbstractC3883i, java.util.Map.Entry
        public V getValue() {
            return this.f6409k.getValue();
        }
    }

    /* renamed from: cc.h1$c */
    /* loaded from: classes3.dex */
    class C3874c extends AbstractC3868g2<Map.Entry<K, V>> {

        /* renamed from: k */
        final /* synthetic */ Iterator f6410k;

        C3874c(Iterator it) {
            this.f6410k = it;
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            return C3871h1.m33427l((Map.Entry) this.f6410k.next());
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            return this.f6410k.hasNext();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: cc.h1$d */
    /* loaded from: classes3.dex */
    private static abstract class EnumC3875d extends Enum<EnumC3875d> implements AbstractC3454f<Map.Entry<?, ?>, Object> {

        /* renamed from: k */
        public static final EnumC3875d f6411k = new C3876a("KEY", 0);

        /* renamed from: l */
        public static final EnumC3875d f6412l = new C3877b("VALUE", 1);

        /* renamed from: m */
        private static final /* synthetic */ EnumC3875d[] f6413m = m33420a();

        /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
        /* renamed from: cc.h1$d$a */
        /* loaded from: classes3.dex */
        final class C3876a extends EnumC3875d {
            C3876a(String str, int i) {
                super(str, i, null);
            }

            /* renamed from: b */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
        /* renamed from: cc.h1$d$b */
        /* loaded from: classes3.dex */
        final class C3877b extends EnumC3875d {
            C3877b(String str, int i) {
                super(str, i, null);
            }

            /* renamed from: b */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        private EnumC3875d(String str, int i) {
        }

        /* renamed from: a */
        private static /* synthetic */ EnumC3875d[] m33420a() {
            return new EnumC3875d[]{f6411k, f6412l};
        }

        public static EnumC3875d valueOf(String str) {
            return (EnumC3875d) Enum.valueOf(EnumC3875d.class, str);
        }

        public static EnumC3875d[] values() {
            return (EnumC3875d[]) f6413m.clone();
        }

        @Override // p163j$.util.function.Function
        public /* synthetic */ Function andThen(Function function) {
            return function.getClass();
        }

        @Override // p163j$.util.function.Function
        public /* synthetic */ Function compose(Function function) {
            return function.getClass();
        }

        /* synthetic */ EnumC3875d(String str, int i, C3867g1 g1Var) {
            this(str, i);
        }
    }

    /* renamed from: cc.h1$e */
    /* loaded from: classes3.dex */
    static abstract class AbstractC3878e<K, V> extends C3828b2.AbstractC3830b<Map.Entry<K, V>> {
        /* renamed from: a */
        abstract Map<K, V> mo33417a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo33417a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection, java.util.List, p163j$.util.List
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo33417a().isEmpty();
        }

        @Override // cc.C3828b2.AbstractC3830b, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C3457i.m34352i(collection));
            } catch (UnsupportedOperationException unused) {
                return C3828b2.m33506h(this, collection.iterator());
            }
        }

        @Override // cc.C3828b2.AbstractC3830b, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) C3457i.m34352i(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet e = C3828b2.m33509e(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        e.add(((Map.Entry) obj).getKey());
                    }
                }
                return mo33417a().keySet().retainAll(e);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo33417a().size();
        }
    }

    /* renamed from: cc.h1$f */
    /* loaded from: classes3.dex */
    static class C3879f<K, V> extends C3828b2.AbstractC3830b<K> implements Set {

        /* renamed from: k */
        final Map<K, V> f6414k;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C3879f(Map<K, V> map) {
            this.f6414k = (Map) C3457i.m34352i(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection, java.util.List, p163j$.util.List
        public boolean contains(Object obj) {
            return m33414e().containsKey(obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public Map<K, V> m33414e() {
            return this.f6414k;
        }

        @Override // p163j$.util.Collection, p163j$.lang.AbstractC9165a
        public void forEach(final Consumer<? super K> consumer) {
            C3457i.m34352i(consumer);
            Map.EL.forEach(this.f6414k, new BiConsumer() { // from class: cc.i1
                @Override // p163j$.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    Consumer.this.accept(obj);
                }

                @Override // p163j$.util.function.BiConsumer
                public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return biConsumer.getClass();
                }
            });
        }

        @Override // java.lang.Iterable
        public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            forEach(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection, java.util.List, p163j$.util.List
        public boolean isEmpty() {
            return m33414e().isEmpty();
        }

        @Override // p163j$.util.Collection
        public /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.Collection
        public /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
            return removeIf(Predicate.VivifiedWrapper.convert(predicate));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection, java.util.List, p163j$.util.List
        public int size() {
            return m33414e().size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cc.h1$g */
    /* loaded from: classes3.dex */
    public static class C3880g<K, V> extends AbstractCollection<V> implements p163j$.util.Collection {

        /* renamed from: k */
        final java.util.Map<K, V> f6415k;

        C3880g(java.util.Map<K, V> map) {
            this.f6415k = (java.util.Map) C3457i.m34352i(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
        public void clear() {
            m33411e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
        public boolean contains(Object obj) {
            return m33411e().containsValue(obj);
        }

        /* renamed from: e */
        final java.util.Map<K, V> m33411e() {
            return this.f6415k;
        }

        @Override // p163j$.util.Collection, p163j$.lang.AbstractC9165a
        public void forEach(final Consumer<? super V> consumer) {
            C3457i.m34352i(consumer);
            Map.EL.forEach(this.f6415k, new BiConsumer() { // from class: cc.j1
                @Override // p163j$.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    Consumer.this.accept(obj2);
                }

                @Override // p163j$.util.function.BiConsumer
                public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return biConsumer.getClass();
                }
            });
        }

        @Override // java.lang.Iterable
        public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            forEach(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
        public boolean isEmpty() {
            return m33411e().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, p163j$.util.Collection, java.util.Set, p163j$.util.Set
        public Iterator<V> iterator() {
            return C3871h1.m33424o(m33411e().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : m33411e().entrySet()) {
                    if (C3456h.m34362a(obj, entry.getValue())) {
                        m33411e().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
        public boolean removeAll(java.util.Collection<?> collection) {
            try {
                return super.removeAll((java.util.Collection) C3457i.m34352i(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet d = C3828b2.m33510d();
                for (Map.Entry<K, V> entry : m33411e().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        d.add(entry.getKey());
                    }
                }
                return m33411e().keySet().removeAll(d);
            }
        }

        @Override // p163j$.util.Collection
        public /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.Collection
        public /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
            return removeIf(Predicate.VivifiedWrapper.convert(predicate));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
        public boolean retainAll(java.util.Collection<?> collection) {
            try {
                return super.retainAll((java.util.Collection) C3457i.m34352i(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet d = C3828b2.m33510d();
                for (Map.Entry<K, V> entry : m33411e().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        d.add(entry.getKey());
                    }
                }
                return m33411e().keySet().retainAll(d);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
        public int size() {
            return m33411e().size();
        }
    }

    /* renamed from: cc.h1$h */
    /* loaded from: classes3.dex */
    static abstract class AbstractC3881h<K, V> extends AbstractMap<K, V> {

        /* renamed from: k */
        private transient java.util.Set<Map.Entry<K, V>> f6416k;

        /* renamed from: l */
        private transient java.util.Collection<V> f6417l;

        /* renamed from: a */
        abstract java.util.Set<Map.Entry<K, V>> mo33410a();

        /* renamed from: b */
        java.util.Collection<V> m33409b() {
            return new C3880g(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<Map.Entry<K, V>> entrySet() {
            java.util.Set<Map.Entry<K, V>> set = this.f6416k;
            if (set != null) {
                return set;
            }
            java.util.Set<Map.Entry<K, V>> a = mo33410a();
            this.f6416k = a;
            return a;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Collection<V> values() {
            java.util.Collection<V> collection = this.f6417l;
            if (collection != null) {
                return collection;
            }
            java.util.Collection<V> b = m33409b();
            this.f6417l = b;
            return b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m33438a(int i) {
        if (i < 3) {
            C3911m.m33352b(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        } else {
            return ViewDefaults.NUMBER_OF_LINES;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m33437b(java.util.Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return map.entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    /* renamed from: c */
    public static <K, V> Map.Entry<K, V> m33436c(K k, V v) {
        return new C3842e0(k, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static <K> AbstractC3454f<Map.Entry<K, ?>, K> m33435d() {
        return EnumC3875d.f6411k;
    }

    /* renamed from: e */
    public static <K, V> HashMap<K, V> m33434e(int i) {
        return new HashMap<>(m33438a(i));
    }

    /* renamed from: f */
    public static <K, V> IdentityHashMap<K, V> m33433f() {
        return new IdentityHashMap<>();
    }

    /* renamed from: g */
    public static <K, V> LinkedHashMap<K, V> m33432g() {
        return new LinkedHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static boolean m33431h(java.util.Map<?, ?> map, Object obj) {
        C3457i.m34352i(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static <V> V m33430i(java.util.Map<?, V> map, Object obj) {
        C3457i.m34352i(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static <V> V m33429j(java.util.Map<?, V> map, Object obj) {
        C3457i.m34352i(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static String m33428k(java.util.Map<?, ?> map) {
        StringBuilder a = C3949v.m33302a(map.size());
        a.append('{');
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                a.append(", ");
            }
            a.append(entry.getKey());
            a.append('=');
            a.append(entry.getValue());
            z = false;
        }
        a.append('}');
        return a.toString();
    }

    /* renamed from: l */
    static <K, V> Map.Entry<K, V> m33427l(Map.Entry<? extends K, ? extends V> entry) {
        C3457i.m34352i(entry);
        return new C3873b(entry);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static <K, V> AbstractC3868g2<Map.Entry<K, V>> m33426m(Iterator<Map.Entry<K, V>> it) {
        return new C3874c(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static <V> AbstractC3454f<Map.Entry<?, V>, V> m33425n() {
        return EnumC3875d.f6412l;
    }

    /* renamed from: o */
    static <K, V> Iterator<V> m33424o(Iterator<Map.Entry<K, V>> it) {
        return new C3872a(it);
    }
}
