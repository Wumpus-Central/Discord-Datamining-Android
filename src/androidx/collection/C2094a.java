package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p163j$.util.Map;
import p163j$.util.function.BiConsumer;
import p163j$.util.function.BiFunction;
import p163j$.util.function.Function;

/* renamed from: androidx.collection.a */
/* loaded from: classes.dex */
public class C2094a<K, V> extends SimpleArrayMap<K, V> implements Map<K, V>, p163j$.util.Map {

    /* renamed from: r */
    AbstractC2099e<K, V> f2422r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.collection.a$a */
    /* loaded from: classes.dex */
    public class C0026a extends AbstractC2099e<K, V> {
        C0026a() {
        }

        @Override // androidx.collection.AbstractC2099e
        /* renamed from: a */
        protected void mo39006a() {
            C2094a.this.clear();
        }

        @Override // androidx.collection.AbstractC2099e
        /* renamed from: b */
        protected Object mo39005b(int i, int i2) {
            return C2094a.this.f2415l[(i << 1) + i2];
        }

        @Override // androidx.collection.AbstractC2099e
        /* renamed from: c */
        protected Map<K, V> mo39004c() {
            return C2094a.this;
        }

        @Override // androidx.collection.AbstractC2099e
        /* renamed from: d */
        protected int mo39003d() {
            return C2094a.this.f2416m;
        }

        @Override // androidx.collection.AbstractC2099e
        /* renamed from: e */
        protected int mo39002e(Object obj) {
            return C2094a.this.m39055g(obj);
        }

        @Override // androidx.collection.AbstractC2099e
        /* renamed from: f */
        protected int mo39001f(Object obj) {
            return C2094a.this.m39053i(obj);
        }

        @Override // androidx.collection.AbstractC2099e
        /* renamed from: g */
        protected void mo39000g(K k, V v) {
            C2094a.this.put(k, v);
        }

        @Override // androidx.collection.AbstractC2099e
        /* renamed from: h */
        protected void mo38999h(int i) {
            C2094a.this.m39050l(i);
        }

        @Override // androidx.collection.AbstractC2099e
        /* renamed from: i */
        protected V mo38998i(int i, V v) {
            return C2094a.this.m39049m(i, v);
        }
    }

    public C2094a() {
    }

    /* renamed from: o */
    private AbstractC2099e<K, V> m39036o() {
        if (this.f2422r == null) {
            this.f2422r = new C0026a();
        }
        return this.f2422r;
    }

    @Override // p163j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map
    public /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // p163j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    @Override // p163j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, p163j$.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m39036o().m38995l();
    }

    @Override // p163j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.Map, p163j$.util.Map
    public Set<K> keySet() {
        return m39036o().m38994m();
    }

    @Override // p163j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    /* renamed from: p */
    public boolean m39035p(Collection<?> collection) {
        return AbstractC2099e.m38991p(this, collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, p163j$.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        m39058c(this.f2416m + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // p163j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, p163j$.util.Map
    public Collection<V> values() {
        return m39036o().m38993n();
    }

    public C2094a(int i) {
        super(i);
    }

    public C2094a(SimpleArrayMap simpleArrayMap) {
        super(simpleArrayMap);
    }
}
