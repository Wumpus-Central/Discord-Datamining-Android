package cc;

import cc.C3914m1;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p163j$.lang.Iterable$CC;
import p163j$.util.Collection;
import p163j$.util.Spliterator;
import p163j$.util.Spliterators;
import p163j$.util.function.Consumer;
import p163j$.util.function.Predicate;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cc.j */
/* loaded from: classes3.dex */
public abstract class AbstractC3889j<K, V> implements AbstractC3897k1<K, V> {

    /* renamed from: k */
    private transient Collection<Map.Entry<K, V>> f6426k;

    /* renamed from: l */
    private transient Set<K> f6427l;

    /* renamed from: m */
    private transient Collection<V> f6428m;

    /* renamed from: n */
    private transient Map<K, Collection<V>> f6429n;

    /* renamed from: cc.j$a */
    /* loaded from: classes3.dex */
    class C3890a extends C3914m1.AbstractC3916b<K, V> implements p163j$.util.Collection {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C3890a() {
        }

        @Override // cc.C3914m1.AbstractC3916b
        /* renamed from: a */
        AbstractC3897k1<K, V> mo33343a() {
            return AbstractC3889j.this;
        }

        @Override // p163j$.util.Collection, p163j$.lang.AbstractC9165a
        public /* synthetic */ void forEach(Consumer consumer) {
            Iterable$CC.$default$forEach(this, consumer);
        }

        @Override // java.lang.Iterable
        public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            forEach(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, p163j$.util.Collection, java.util.Set, p163j$.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractC3889j.this.mo33293h();
        }

        @Override // p163j$.util.Collection
        public /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.Collection
        public /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
            return removeIf(Predicate.VivifiedWrapper.convert(predicate));
        }

        @Override // java.util.Collection, java.lang.Iterable, p163j$.util.Collection, java.util.Set, p163j$.util.Set
        public Spliterator<Map.Entry<K, V>> spliterator() {
            return AbstractC3889j.this.mo33292i();
        }
    }

    /* renamed from: cc.j$b */
    /* loaded from: classes3.dex */
    class C3891b extends AbstractCollection<V> implements p163j$.util.Collection {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C3891b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
        public void clear() {
            AbstractC3889j.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
        public boolean contains(Object obj) {
            return AbstractC3889j.this.mo33298c(obj);
        }

        @Override // p163j$.util.Collection, p163j$.lang.AbstractC9165a
        public /* synthetic */ void forEach(Consumer consumer) {
            Iterable$CC.$default$forEach(this, consumer);
        }

        @Override // java.lang.Iterable
        public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            forEach(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, p163j$.util.Collection, java.util.Set, p163j$.util.Set
        public Iterator<V> iterator() {
            return AbstractC3889j.this.mo33291k();
        }

        @Override // p163j$.util.Collection
        public /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.Collection
        public /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
            return removeIf(Predicate.VivifiedWrapper.convert(predicate));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
        public int size() {
            return AbstractC3889j.this.size();
        }

        @Override // java.util.Collection, java.lang.Iterable, p163j$.util.Collection, java.util.Set, p163j$.util.Set
        public Spliterator<V> spliterator() {
            return AbstractC3889j.this.mo33390l();
        }
    }

    @Override // cc.AbstractC3897k1
    /* renamed from: a */
    public java.util.Collection<Map.Entry<K, V>> mo33300a() {
        java.util.Collection<Map.Entry<K, V>> collection = this.f6426k;
        if (collection != null) {
            return collection;
        }
        java.util.Collection<Map.Entry<K, V>> e = mo33296e();
        this.f6426k = e;
        return e;
    }

    @Override // cc.AbstractC3897k1
    public Map<K, java.util.Collection<V>> asMap() {
        Map<K, java.util.Collection<V>> map = this.f6429n;
        if (map != null) {
            return map;
        }
        Map<K, java.util.Collection<V>> d = mo33297d();
        this.f6429n = d;
        return d;
    }

    @Override // cc.AbstractC3897k1
    /* renamed from: b */
    public boolean mo33299b(Object obj, Object obj2) {
        java.util.Collection<V> collection = asMap().get(obj);
        if (collection == null || !collection.contains(obj2)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo33298c(Object obj) {
        for (java.util.Collection<V> collection : asMap().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    abstract Map<K, java.util.Collection<V>> mo33297d();

    /* renamed from: e */
    abstract java.util.Collection<Map.Entry<K, V>> mo33296e();

    public boolean equals(Object obj) {
        return C3914m1.m33347a(this, obj);
    }

    /* renamed from: f */
    abstract Set<K> mo33295f();

    /* renamed from: g */
    abstract java.util.Collection<V> mo33294g();

    /* renamed from: h */
    abstract Iterator<Map.Entry<K, V>> mo33293h();

    public int hashCode() {
        return asMap().hashCode();
    }

    /* renamed from: i */
    abstract Spliterator<Map.Entry<K, V>> mo33292i();

    /* renamed from: j */
    public Set<K> m33391j() {
        Set<K> set = this.f6427l;
        if (set != null) {
            return set;
        }
        Set<K> f = mo33295f();
        this.f6427l = f;
        return f;
    }

    /* renamed from: k */
    abstract Iterator<V> mo33291k();

    /* renamed from: l */
    Spliterator<V> mo33390l() {
        return Spliterators.spliterator(mo33291k(), size(), 0);
    }

    @Override // cc.AbstractC3897k1
    public boolean remove(Object obj, Object obj2) {
        java.util.Collection<V> collection = asMap().get(obj);
        if (collection == null || !collection.remove(obj2)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return asMap().toString();
    }

    @Override // cc.AbstractC3897k1
    public java.util.Collection<V> values() {
        java.util.Collection<V> collection = this.f6428m;
        if (collection != null) {
            return collection;
        }
        java.util.Collection<V> g = mo33294g();
        this.f6428m = g;
        return g;
    }
}
