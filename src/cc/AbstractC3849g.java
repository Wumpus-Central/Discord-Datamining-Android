package cc;

import cc.AbstractC3849g;
import cc.AbstractC3889j;
import cc.C3871h1;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.SortedMap;
import java.util.SortedSet;
import p030bc.C3457i;
import p163j$.lang.Iterable$CC;
import p163j$.util.Collection;
import p163j$.util.Iterator;
import p163j$.util.List;
import p163j$.util.Set;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;
import p163j$.util.function.Function;
import p163j$.util.function.Predicate;
import p163j$.util.function.UnaryOperator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cc.g */
/* loaded from: classes3.dex */
public abstract class AbstractC3849g<K, V> extends AbstractC3889j<K, V> implements Serializable {

    /* renamed from: o */
    private transient Map<K, Collection<V>> f6373o;

    /* renamed from: p */
    private transient int f6374p;

    /* renamed from: cc.g$a */
    /* loaded from: classes3.dex */
    class C3850a extends AbstractC3849g<K, V>.AbstractC3855d<V> {
        C3850a(AbstractC3849g gVar) {
            super();
        }

        @Override // cc.AbstractC3849g.AbstractC3855d
        /* renamed from: b */
        V mo33465b(K k, V v) {
            return v;
        }
    }

    /* renamed from: cc.g$b */
    /* loaded from: classes3.dex */
    class C3851b extends AbstractC3849g<K, V>.AbstractC3855d<Map.Entry<K, V>> {
        C3851b(AbstractC3849g gVar) {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public Map.Entry<K, V> mo33465b(K k, V v) {
            return C3871h1.m33436c(k, v);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cc.g$c */
    /* loaded from: classes3.dex */
    public class C3852c extends C3871h1.AbstractC3881h<K, Collection<V>> {

        /* renamed from: m */
        final transient Map<K, Collection<V>> f6375m;

        /* renamed from: cc.g$c$a */
        /* loaded from: classes3.dex */
        class C3853a extends C3871h1.AbstractC3878e<K, Collection<V>> implements Set {
            C3853a() {
            }

            @Override // cc.C3871h1.AbstractC3878e
            /* renamed from: a */
            Map<K, Collection<V>> mo33417a() {
                return C3852c.this;
            }

            @Override // cc.C3871h1.AbstractC3878e, java.util.AbstractCollection, java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection, java.util.List, p163j$.util.List
            public boolean contains(Object obj) {
                return C3949v.m33301b(C3852c.this.f6375m.entrySet(), obj);
            }

            @Override // p163j$.util.Collection, p163j$.lang.AbstractC9165a
            public /* synthetic */ void forEach(Consumer consumer) {
                Iterable$CC.$default$forEach(this, consumer);
            }

            @Override // java.lang.Iterable
            public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
                forEach(Consumer.VivifiedWrapper.convert(consumer));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, p163j$.util.Set, p163j$.util.Collection
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C3854b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractC3849g.this.m33487C(entry.getKey());
                return true;
            }

            @Override // p163j$.util.Collection
            public /* synthetic */ boolean removeIf(Predicate predicate) {
                return Collection.CC.$default$removeIf(this, predicate);
            }

            @Override // java.util.Collection
            public /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
                return removeIf(Predicate.VivifiedWrapper.convert(predicate));
            }

            @Override // java.util.Collection, java.lang.Iterable, java.util.Set, p163j$.util.Set, p163j$.util.Collection
            public Spliterator<Map.Entry<K, java.util.Collection<V>>> spliterator() {
                Spliterator spliterator = Set.EL.spliterator(C3852c.this.f6375m.entrySet());
                final C3852c cVar = C3852c.this;
                return C3924p.m33336d(spliterator, new Function() { // from class: cc.h
                    @Override // p163j$.util.function.Function
                    public /* synthetic */ Function andThen(Function function) {
                        return function.getClass();
                    }

                    @Override // p163j$.util.function.Function
                    public final Object apply(Object obj) {
                        return AbstractC3849g.C3852c.this.m33467f((Map.Entry) obj);
                    }

                    @Override // p163j$.util.function.Function
                    public /* synthetic */ Function compose(Function function) {
                        return function.getClass();
                    }
                });
            }
        }

        /* renamed from: cc.g$c$b */
        /* loaded from: classes3.dex */
        class C3854b implements Iterator<Map.Entry<K, java.util.Collection<V>>>, p163j$.util.Iterator {

            /* renamed from: k */
            final Iterator<Map.Entry<K, java.util.Collection<V>>> f6378k;

            /* renamed from: l */
            java.util.Collection<V> f6379l;

            C3854b() {
                this.f6378k = C3852c.this.f6375m.entrySet().iterator();
            }

            /* renamed from: b */
            public Map.Entry<K, java.util.Collection<V>> next() {
                Map.Entry<K, java.util.Collection<V>> next = this.f6378k.next();
                this.f6379l = next.getValue();
                return C3852c.this.m33467f(next);
            }

            @Override // p163j$.util.Iterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // java.util.Iterator
            public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
            }

            @Override // java.util.Iterator, p163j$.util.Iterator
            public boolean hasNext() {
                return this.f6378k.hasNext();
            }

            @Override // java.util.Iterator, p163j$.util.Iterator
            public void remove() {
                boolean z;
                if (this.f6379l != null) {
                    z = true;
                } else {
                    z = false;
                }
                C3457i.m34346o(z, "no calls to next() since the last call to remove()");
                this.f6378k.remove();
                AbstractC3849g.m33476t(AbstractC3849g.this, this.f6379l.size());
                this.f6379l.clear();
                this.f6379l = null;
            }
        }

        C3852c(Map<K, java.util.Collection<V>> map) {
            this.f6375m = map;
        }

        @Override // cc.C3871h1.AbstractC3881h
        /* renamed from: a */
        protected java.util.Set<Map.Entry<K, java.util.Collection<V>>> mo33410a() {
            return new C3853a();
        }

        /* renamed from: c */
        public java.util.Collection<V> get(Object obj) {
            java.util.Collection<V> collection = (java.util.Collection) C3871h1.m33430i(this.f6375m, obj);
            if (collection == null) {
                return null;
            }
            return AbstractC3849g.this.mo33485E(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f6375m == AbstractC3849g.this.f6373o) {
                AbstractC3849g.this.clear();
            } else {
                C3818a1.m33536b(new C3854b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return C3871h1.m33431h(this.f6375m, obj);
        }

        /* renamed from: d */
        public java.util.Collection<V> remove(Object obj) {
            java.util.Collection<V> remove = this.f6375m.remove(obj);
            if (remove == null) {
                return null;
            }
            java.util.Collection<V> v = AbstractC3849g.this.mo33344v();
            v.addAll(remove);
            AbstractC3849g.m33476t(AbstractC3849g.this, remove.size());
            remove.clear();
            return v;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f6375m.equals(obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public Map.Entry<K, java.util.Collection<V>> m33467f(Map.Entry<K, java.util.Collection<V>> entry) {
            K key = entry.getKey();
            return C3871h1.m33436c(key, AbstractC3849g.this.mo33485E(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f6375m.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<K> keySet() {
            return AbstractC3849g.this.m33391j();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f6375m.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f6375m.toString();
        }
    }

    /* renamed from: cc.g$d */
    /* loaded from: classes3.dex */
    private abstract class AbstractC3855d<T> implements java.util.Iterator<T>, p163j$.util.Iterator {

        /* renamed from: k */
        final java.util.Iterator<Map.Entry<K, java.util.Collection<V>>> f6381k;

        /* renamed from: l */
        K f6382l = null;

        /* renamed from: m */
        java.util.Collection<V> f6383m = null;

        /* renamed from: n */
        java.util.Iterator<V> f6384n = C3818a1.m33531g();

        AbstractC3855d() {
            this.f6381k = (java.util.Iterator<Map.Entry<K, V>>) AbstractC3849g.this.f6373o.entrySet().iterator();
        }

        /* renamed from: b */
        abstract T mo33465b(K k, V v);

        @Override // p163j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            return this.f6381k.hasNext() || this.f6384n.hasNext();
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public T next() {
            if (!this.f6384n.hasNext()) {
                Map.Entry<K, java.util.Collection<V>> next = this.f6381k.next();
                this.f6382l = next.getKey();
                java.util.Collection<V> value = next.getValue();
                this.f6383m = value;
                this.f6384n = value.iterator();
            }
            return mo33465b(C3931p1.m33321a(this.f6382l), this.f6384n.next());
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            this.f6384n.remove();
            java.util.Collection<V> collection = this.f6383m;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f6381k.remove();
            }
            AbstractC3849g.m33478r(AbstractC3849g.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cc.g$e */
    /* loaded from: classes3.dex */
    public class C3856e extends C3871h1.C3879f<K, java.util.Collection<V>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: cc.g$e$a */
        /* loaded from: classes3.dex */
        public class C3857a implements java.util.Iterator<K>, p163j$.util.Iterator {

            /* renamed from: k */
            Map.Entry<K, java.util.Collection<V>> f6387k;

            /* renamed from: l */
            final /* synthetic */ java.util.Iterator f6388l;

            C3857a(java.util.Iterator it) {
                this.f6388l = it;
            }

            @Override // p163j$.util.Iterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // java.util.Iterator
            public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
            }

            @Override // java.util.Iterator, p163j$.util.Iterator
            public boolean hasNext() {
                return this.f6388l.hasNext();
            }

            @Override // java.util.Iterator, p163j$.util.Iterator
            public K next() {
                Map.Entry<K, java.util.Collection<V>> entry = (Map.Entry) this.f6388l.next();
                this.f6387k = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator, p163j$.util.Iterator
            public void remove() {
                boolean z;
                if (this.f6387k != null) {
                    z = true;
                } else {
                    z = false;
                }
                C3457i.m34346o(z, "no calls to next() since the last call to remove()");
                java.util.Collection<V> value = this.f6387k.getValue();
                this.f6388l.remove();
                AbstractC3849g.m33476t(AbstractC3849g.this, value.size());
                value.clear();
                this.f6387k = null;
            }
        }

        C3856e(Map<K, java.util.Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection
        public void clear() {
            C3818a1.m33536b(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection
        public boolean containsAll(java.util.Collection<?> collection) {
            return m33414e().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection
        public boolean equals(Object obj) {
            return this == obj || m33414e().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set, p163j$.util.Set
        public int hashCode() {
            return m33414e().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, p163j$.util.Set, p163j$.util.Collection
        public java.util.Iterator<K> iterator() {
            return new C3857a(m33414e().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, p163j$.util.Set, p163j$.util.Collection
        public boolean remove(Object obj) {
            int i;
            java.util.Collection<V> remove = m33414e().remove(obj);
            if (remove != null) {
                i = remove.size();
                remove.clear();
                AbstractC3849g.m33476t(AbstractC3849g.this, i);
            } else {
                i = 0;
            }
            if (i > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set, p163j$.util.Set, p163j$.util.Collection
        public Spliterator<K> spliterator() {
            return Set.EL.spliterator(m33414e().keySet());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cc.g$f */
    /* loaded from: classes3.dex */
    public class C3858f extends AbstractC3849g<K, V>.C3860i implements NavigableMap<K, java.util.Collection<V>> {
        C3858f(NavigableMap<K, java.util.Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, java.util.Collection<V>> ceilingEntry(K k) {
            Map.Entry<K, java.util.Collection<V>> ceilingEntry = mo33451i().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return m33467f(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k) {
            return mo33451i().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, java.util.Collection<V>> descendingMap() {
            return new C3858f(mo33451i().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, java.util.Collection<V>> firstEntry() {
            Map.Entry<K, java.util.Collection<V>> firstEntry = mo33451i().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return m33467f(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, java.util.Collection<V>> floorEntry(K k) {
            Map.Entry<K, java.util.Collection<V>> floorEntry = mo33451i().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return m33467f(floorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k) {
            return mo33451i().floorKey(k);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, java.util.Collection<V>> higherEntry(K k) {
            Map.Entry<K, java.util.Collection<V>> higherEntry = mo33451i().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return m33467f(higherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k) {
            return mo33451i().higherKey(k);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: j */
        public NavigableSet<K> mo33453g() {
            return new C0100g(mo33451i());
        }

        /* renamed from: k */
        public NavigableMap<K, java.util.Collection<V>> headMap(K k) {
            return headMap(k, false);
        }

        /* renamed from: l */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, java.util.Collection<V>> lastEntry() {
            Map.Entry<K, java.util.Collection<V>> lastEntry = mo33451i().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return m33467f(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, java.util.Collection<V>> lowerEntry(K k) {
            Map.Entry<K, java.util.Collection<V>> lowerEntry = mo33451i().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return m33467f(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k) {
            return mo33451i().lowerKey(k);
        }

        /* renamed from: m */
        Map.Entry<K, java.util.Collection<V>> m33461m(java.util.Iterator<Map.Entry<K, java.util.Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, java.util.Collection<V>> next = it.next();
            java.util.Collection<V> v = AbstractC3849g.this.mo33344v();
            v.addAll(next.getValue());
            it.remove();
            return C3871h1.m33436c(next.getKey(), AbstractC3849g.this.mo33486D(v));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: n */
        public NavigableMap<K, java.util.Collection<V>> mo33451i() {
            return (NavigableMap) super.mo33451i();
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        /* renamed from: o */
        public NavigableMap<K, java.util.Collection<V>> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        /* renamed from: p */
        public NavigableMap<K, java.util.Collection<V>> tailMap(K k) {
            return tailMap(k, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, java.util.Collection<V>> pollFirstEntry() {
            return m33461m(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, java.util.Collection<V>> pollLastEntry() {
            return m33461m(descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, java.util.Collection<V>> headMap(K k, boolean z) {
            return new C3858f(mo33451i().headMap(k, z));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, java.util.Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new C3858f(mo33451i().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, java.util.Collection<V>> tailMap(K k, boolean z) {
            return new C3858f(mo33451i().tailMap(k, z));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cc.g$g */
    /* loaded from: classes3.dex */
    public class C0100g extends AbstractC3849g<K, V>.C3861j implements NavigableSet<K> {
        C0100g(NavigableMap<K, java.util.Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k) {
            return mo33450f().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public java.util.Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new C0100g(mo33450f().descendingMap());
        }

        @Override // java.util.NavigableSet
        public K floor(K k) {
            return mo33450f().floorKey(k);
        }

        /* renamed from: g */
        public NavigableSet<K> headSet(K k) {
            return headSet(k, false);
        }

        @Override // java.util.NavigableSet
        public K higher(K k) {
            return mo33450f().higherKey(k);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: i */
        public NavigableMap<K, java.util.Collection<V>> mo33450f() {
            return (NavigableMap) super.mo33450f();
        }

        /* renamed from: j */
        public NavigableSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        @Override // java.util.NavigableSet
        public K lower(K k) {
            return mo33450f().lowerKey(k);
        }

        /* renamed from: p */
        public NavigableSet<K> tailSet(K k) {
            return tailSet(k, true);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) C3818a1.m33525m(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) C3818a1.m33525m(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k, boolean z) {
            return new C0100g(mo33450f().headMap(k, z));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new C0100g(mo33450f().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k, boolean z) {
            return new C0100g(mo33450f().tailMap(k, z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cc.g$h */
    /* loaded from: classes3.dex */
    public class C3859h extends AbstractC3849g<K, V>.C3864l implements RandomAccess {
        C3859h(AbstractC3849g gVar, K k, List<V> list, AbstractC3849g<K, V>.C3862k kVar) {
            super(k, list, kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cc.g$i */
    /* loaded from: classes3.dex */
    public class C3860i extends AbstractC3849g<K, V>.C3852c implements SortedMap<K, java.util.Collection<V>> {

        /* renamed from: o */
        SortedSet<K> f6392o;

        C3860i(SortedMap<K, java.util.Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return mo33451i().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return mo33451i().firstKey();
        }

        /* renamed from: g */
        SortedSet<K> mo33453g() {
            return new C3861j(mo33451i());
        }

        /* renamed from: h */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f6392o;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> g = mo33453g();
            this.f6392o = g;
            return g;
        }

        public SortedMap<K, java.util.Collection<V>> headMap(K k) {
            return new C3860i(mo33451i().headMap(k));
        }

        /* renamed from: i */
        SortedMap<K, java.util.Collection<V>> mo33451i() {
            return (SortedMap) this.f6375m;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return mo33451i().lastKey();
        }

        public SortedMap<K, java.util.Collection<V>> subMap(K k, K k2) {
            return new C3860i(mo33451i().subMap(k, k2));
        }

        public SortedMap<K, java.util.Collection<V>> tailMap(K k) {
            return new C3860i(mo33451i().tailMap(k));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cc.g$j */
    /* loaded from: classes3.dex */
    public class C3861j extends AbstractC3849g<K, V>.C3856e implements SortedSet<K>, p163j$.util.SortedSet {
        C3861j(SortedMap<K, java.util.Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet, p163j$.util.SortedSet
        public Comparator<? super K> comparator() {
            return mo33450f().comparator();
        }

        /* renamed from: f */
        SortedMap<K, java.util.Collection<V>> mo33450f() {
            return (SortedMap) super.m33414e();
        }

        @Override // java.util.SortedSet, p163j$.util.SortedSet
        public K first() {
            return mo33450f().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new C3861j(mo33450f().headMap(k));
        }

        @Override // java.util.SortedSet, p163j$.util.SortedSet
        public K last() {
            return mo33450f().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new C3861j(mo33450f().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new C3861j(mo33450f().tailMap(k));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3849g(Map<K, java.util.Collection<V>> map) {
        C3457i.m34357d(map.isEmpty());
        this.f6373o = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static /* synthetic */ Spliterator m33488B(Map.Entry entry) {
        final Object key = entry.getKey();
        return C3924p.m33336d(Collection.EL.spliterator((java.util.Collection) entry.getValue()), new Function() { // from class: cc.f
            @Override // p163j$.util.function.Function
            public /* synthetic */ Function andThen(Function function) {
                return function.getClass();
            }

            @Override // p163j$.util.function.Function
            public final Object apply(Object obj) {
                Map.Entry c;
                c = C3871h1.m33436c(key, obj);
                return c;
            }

            @Override // p163j$.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return function.getClass();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public void m33487C(Object obj) {
        java.util.Collection collection = (java.util.Collection) C3871h1.m33429j(this.f6373o, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f6374p -= size;
        }
    }

    /* renamed from: q */
    static /* synthetic */ int m33479q(AbstractC3849g gVar) {
        int i = gVar.f6374p;
        gVar.f6374p = i + 1;
        return i;
    }

    /* renamed from: r */
    static /* synthetic */ int m33478r(AbstractC3849g gVar) {
        int i = gVar.f6374p;
        gVar.f6374p = i - 1;
        return i;
    }

    /* renamed from: s */
    static /* synthetic */ int m33477s(AbstractC3849g gVar, int i) {
        int i2 = gVar.f6374p + i;
        gVar.f6374p = i2;
        return i2;
    }

    /* renamed from: t */
    static /* synthetic */ int m33476t(AbstractC3849g gVar, int i) {
        int i2 = gVar.f6374p - i;
        gVar.f6374p = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static <E> java.util.Iterator<E> m33471z(java.util.Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* renamed from: D */
    abstract <E> java.util.Collection<E> mo33486D(java.util.Collection<E> collection);

    /* renamed from: E */
    abstract java.util.Collection<V> mo33485E(K k, java.util.Collection<V> collection);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public final List<V> m33484F(K k, List<V> list, AbstractC3849g<K, V>.C3862k kVar) {
        if (list instanceof RandomAccess) {
            return new C3859h(this, k, list, kVar);
        }
        return new C3864l(k, list, kVar);
    }

    @Override // cc.AbstractC3889j, cc.AbstractC3897k1
    /* renamed from: a */
    public java.util.Collection<Map.Entry<K, V>> mo33300a() {
        return super.mo33300a();
    }

    @Override // cc.AbstractC3897k1
    public void clear() {
        for (java.util.Collection<V> collection : this.f6373o.values()) {
            collection.clear();
        }
        this.f6373o.clear();
        this.f6374p = 0;
    }

    @Override // cc.AbstractC3889j
    /* renamed from: e */
    java.util.Collection<Map.Entry<K, V>> mo33296e() {
        return new AbstractC3889j.C3890a();
    }

    @Override // cc.AbstractC3889j
    /* renamed from: g */
    java.util.Collection<V> mo33294g() {
        return new AbstractC3889j.C3891b();
    }

    @Override // cc.AbstractC3897k1
    public java.util.Collection<V> get(K k) {
        java.util.Collection<V> collection = this.f6373o.get(k);
        if (collection == null) {
            collection = m33474w(k);
        }
        return mo33485E(k, collection);
    }

    @Override // cc.AbstractC3889j
    /* renamed from: h */
    java.util.Iterator<Map.Entry<K, V>> mo33293h() {
        return new C3851b(this);
    }

    @Override // cc.AbstractC3889j
    /* renamed from: i */
    Spliterator<Map.Entry<K, V>> mo33292i() {
        return C3924p.m33339a(Set.EL.spliterator(this.f6373o.entrySet()), new Function() { // from class: cc.d
            @Override // p163j$.util.function.Function
            public /* synthetic */ Function andThen(Function function) {
                return function.getClass();
            }

            @Override // p163j$.util.function.Function
            public final Object apply(Object obj) {
                Spliterator B;
                B = AbstractC3849g.m33488B((Map.Entry) obj);
                return B;
            }

            @Override // p163j$.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return function.getClass();
            }
        }, 64, size());
    }

    @Override // cc.AbstractC3889j
    /* renamed from: k */
    java.util.Iterator<V> mo33291k() {
        return new C3850a(this);
    }

    @Override // cc.AbstractC3889j
    /* renamed from: l */
    Spliterator<V> mo33390l() {
        return C3924p.m33339a(Collection.EL.spliterator(this.f6373o.values()), new Function() { // from class: cc.e
            @Override // p163j$.util.function.Function
            public /* synthetic */ Function andThen(Function function) {
                return function.getClass();
            }

            @Override // p163j$.util.function.Function
            public final Object apply(Object obj) {
                return Collection.EL.spliterator((java.util.Collection) obj);
            }

            @Override // p163j$.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return function.getClass();
            }
        }, 64, size());
    }

    @Override // cc.AbstractC3897k1
    public boolean put(K k, V v) {
        java.util.Collection<V> collection = this.f6373o.get(k);
        if (collection == null) {
            java.util.Collection<V> w = m33474w(k);
            if (w.add(v)) {
                this.f6374p++;
                this.f6373o.put(k, w);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.f6374p++;
            return true;
        }
    }

    @Override // cc.AbstractC3897k1
    public int size() {
        return this.f6374p;
    }

    /* renamed from: v */
    abstract java.util.Collection<V> mo33344v();

    @Override // cc.AbstractC3889j, cc.AbstractC3897k1
    public java.util.Collection<V> values() {
        return super.values();
    }

    /* renamed from: w */
    java.util.Collection<V> m33474w(K k) {
        return mo33344v();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final Map<K, java.util.Collection<V>> m33473x() {
        Map<K, java.util.Collection<V>> map = this.f6373o;
        if (map instanceof NavigableMap) {
            return new C3858f((NavigableMap) this.f6373o);
        }
        if (map instanceof SortedMap) {
            return new C3860i((SortedMap) this.f6373o);
        }
        return new C3852c(this.f6373o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public final java.util.Set<K> m33472y() {
        Map<K, java.util.Collection<V>> map = this.f6373o;
        if (map instanceof NavigableMap) {
            return new C0100g((NavigableMap) this.f6373o);
        }
        if (map instanceof SortedMap) {
            return new C3861j((SortedMap) this.f6373o);
        }
        return new C3856e(this.f6373o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cc.g$k */
    /* loaded from: classes3.dex */
    public class C3862k extends AbstractCollection<V> implements p163j$.util.Collection {

        /* renamed from: k */
        final K f6395k;

        /* renamed from: l */
        java.util.Collection<V> f6396l;

        /* renamed from: m */
        final AbstractC3849g<K, V>.C3862k f6397m;

        /* renamed from: n */
        final java.util.Collection<V> f6398n;

        C3862k(K k, java.util.Collection<V> collection, AbstractC3849g<K, V>.C3862k kVar) {
            java.util.Collection<V> collection2;
            this.f6395k = k;
            this.f6396l = collection;
            this.f6397m = kVar;
            if (kVar == null) {
                collection2 = null;
            } else {
                collection2 = kVar.m33447e();
            }
            this.f6398n = collection2;
        }

        /* renamed from: a */
        void m33449a() {
            AbstractC3849g<K, V>.C3862k kVar = this.f6397m;
            if (kVar != null) {
                kVar.m33449a();
            } else {
                AbstractC3849g.this.f6373o.put(this.f6395k, this.f6396l);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
        public boolean add(V v) {
            m33445g();
            boolean isEmpty = this.f6396l.isEmpty();
            boolean add = this.f6396l.add(v);
            if (add) {
                AbstractC3849g.m33479q(AbstractC3849g.this);
                if (isEmpty) {
                    m33449a();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
        public boolean addAll(java.util.Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f6396l.addAll(collection);
            if (addAll) {
                AbstractC3849g.m33477s(AbstractC3849g.this, this.f6396l.size() - size);
                if (size == 0) {
                    m33449a();
                }
            }
            return addAll;
        }

        /* renamed from: b */
        AbstractC3849g<K, V>.C3862k m33448b() {
            return this.f6397m;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
        public void clear() {
            int size = size();
            if (size != 0) {
                this.f6396l.clear();
                AbstractC3849g.m33476t(AbstractC3849g.this, size);
                m33444i();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
        public boolean contains(Object obj) {
            m33445g();
            return this.f6396l.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
        public boolean containsAll(java.util.Collection<?> collection) {
            m33445g();
            return this.f6396l.containsAll(collection);
        }

        /* renamed from: e */
        java.util.Collection<V> m33447e() {
            return this.f6396l;
        }

        @Override // java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            m33445g();
            return this.f6396l.equals(obj);
        }

        /* renamed from: f */
        K m33446f() {
            return this.f6395k;
        }

        @Override // p163j$.util.Collection, p163j$.lang.AbstractC9165a
        public /* synthetic */ void forEach(Consumer consumer) {
            Iterable$CC.$default$forEach(this, consumer);
        }

        @Override // java.lang.Iterable
        public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            forEach(Consumer.VivifiedWrapper.convert(consumer));
        }

        /* renamed from: g */
        void m33445g() {
            java.util.Collection<V> collection;
            AbstractC3849g<K, V>.C3862k kVar = this.f6397m;
            if (kVar != null) {
                kVar.m33445g();
                if (this.f6397m.m33447e() != this.f6398n) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f6396l.isEmpty() && (collection = (java.util.Collection) AbstractC3849g.this.f6373o.get(this.f6395k)) != null) {
                this.f6396l = collection;
            }
        }

        @Override // java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
        public int hashCode() {
            m33445g();
            return this.f6396l.hashCode();
        }

        /* renamed from: i */
        void m33444i() {
            AbstractC3849g<K, V>.C3862k kVar = this.f6397m;
            if (kVar != null) {
                kVar.m33444i();
            } else if (this.f6396l.isEmpty()) {
                AbstractC3849g.this.f6373o.remove(this.f6395k);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, p163j$.util.Collection, java.util.Set, p163j$.util.Set
        public java.util.Iterator<V> iterator() {
            m33445g();
            return new C3863a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
        public boolean remove(Object obj) {
            m33445g();
            boolean remove = this.f6396l.remove(obj);
            if (remove) {
                AbstractC3849g.m33478r(AbstractC3849g.this);
                m33444i();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
        public boolean removeAll(java.util.Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f6396l.removeAll(collection);
            if (removeAll) {
                AbstractC3849g.m33477s(AbstractC3849g.this, this.f6396l.size() - size);
                m33444i();
            }
            return removeAll;
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
            C3457i.m34352i(collection);
            int size = size();
            boolean retainAll = this.f6396l.retainAll(collection);
            if (retainAll) {
                AbstractC3849g.m33477s(AbstractC3849g.this, this.f6396l.size() - size);
                m33444i();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
        public int size() {
            m33445g();
            return this.f6396l.size();
        }

        @Override // java.util.Collection, java.lang.Iterable, p163j$.util.Collection, java.util.Set, p163j$.util.Set
        public Spliterator<V> spliterator() {
            m33445g();
            return Collection.EL.spliterator(this.f6396l);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            m33445g();
            return this.f6396l.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: cc.g$k$a */
        /* loaded from: classes3.dex */
        public class C3863a implements java.util.Iterator<V>, p163j$.util.Iterator {

            /* renamed from: k */
            final java.util.Iterator<V> f6400k;

            /* renamed from: l */
            final java.util.Collection<V> f6401l;

            C3863a() {
                java.util.Collection<V> collection = C3862k.this.f6396l;
                this.f6401l = collection;
                this.f6400k = AbstractC3849g.m33471z(collection);
            }

            /* renamed from: b */
            java.util.Iterator<V> m33443b() {
                m33442c();
                return this.f6400k;
            }

            /* renamed from: c */
            void m33442c() {
                C3862k.this.m33445g();
                if (C3862k.this.f6396l != this.f6401l) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // p163j$.util.Iterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // java.util.Iterator
            public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
            }

            @Override // java.util.Iterator, p163j$.util.Iterator
            public boolean hasNext() {
                m33442c();
                return this.f6400k.hasNext();
            }

            @Override // java.util.Iterator, p163j$.util.Iterator
            public V next() {
                m33442c();
                return this.f6400k.next();
            }

            @Override // java.util.Iterator, p163j$.util.Iterator
            public void remove() {
                this.f6400k.remove();
                AbstractC3849g.m33478r(AbstractC3849g.this);
                C3862k.this.m33444i();
            }

            C3863a(java.util.Iterator<V> it) {
                this.f6401l = C3862k.this.f6396l;
                this.f6400k = it;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cc.g$l */
    /* loaded from: classes3.dex */
    public class C3864l extends AbstractC3849g<K, V>.C3862k implements List<V>, p163j$.util.List {

        /* renamed from: cc.g$l$a */
        /* loaded from: classes3.dex */
        private class C3865a extends AbstractC3849g<K, V>.C3862k.C3863a implements ListIterator<V> {
            C3865a() {
                super();
            }

            /* renamed from: d */
            private ListIterator<V> m33440d() {
                return (ListIterator) m33443b();
            }

            @Override // java.util.ListIterator
            public void add(V v) {
                boolean isEmpty = C3864l.this.isEmpty();
                m33440d().add(v);
                AbstractC3849g.m33479q(AbstractC3849g.this);
                if (isEmpty) {
                    C3864l.this.m33449a();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return m33440d().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return m33440d().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return m33440d().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return m33440d().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v) {
                m33440d().set(v);
            }

            public C3865a(int i) {
                super(C3864l.this.m33441j().listIterator(i));
            }
        }

        C3864l(K k, List<V> list, AbstractC3849g<K, V>.C3862k kVar) {
            super(k, list, kVar);
        }

        @Override // java.util.List, p163j$.util.List
        public void add(int i, V v) {
            m33445g();
            boolean isEmpty = m33447e().isEmpty();
            m33441j().add(i, v);
            AbstractC3849g.m33479q(AbstractC3849g.this);
            if (isEmpty) {
                m33449a();
            }
        }

        @Override // java.util.List, p163j$.util.List
        public boolean addAll(int i, java.util.Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = m33441j().addAll(i, collection);
            if (addAll) {
                AbstractC3849g.m33477s(AbstractC3849g.this, m33447e().size() - size);
                if (size == 0) {
                    m33449a();
                }
            }
            return addAll;
        }

        @Override // java.util.List, p163j$.util.List
        public V get(int i) {
            m33445g();
            return m33441j().get(i);
        }

        @Override // java.util.List, p163j$.util.List
        public int indexOf(Object obj) {
            m33445g();
            return m33441j().indexOf(obj);
        }

        /* renamed from: j */
        List<V> m33441j() {
            return (List) m33447e();
        }

        @Override // java.util.List, p163j$.util.List
        public int lastIndexOf(Object obj) {
            m33445g();
            return m33441j().lastIndexOf(obj);
        }

        @Override // java.util.List, p163j$.util.List
        public ListIterator<V> listIterator() {
            m33445g();
            return new C3865a();
        }

        @Override // java.util.List, p163j$.util.List
        public V remove(int i) {
            m33445g();
            V remove = m33441j().remove(i);
            AbstractC3849g.m33478r(AbstractC3849g.this);
            m33444i();
            return remove;
        }

        @Override // p163j$.util.List
        public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
            List.CC.$default$replaceAll(this, unaryOperator);
        }

        @Override // java.util.List
        public /* synthetic */ void replaceAll(java.util.function.UnaryOperator unaryOperator) {
            replaceAll(UnaryOperator.VivifiedWrapper.convert(unaryOperator));
        }

        @Override // java.util.List, p163j$.util.List
        public V set(int i, V v) {
            m33445g();
            return m33441j().set(i, v);
        }

        @Override // java.util.List, p163j$.util.List
        public /* synthetic */ void sort(Comparator comparator) {
            List.CC.$default$sort(this, comparator);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List, p163j$.util.List
        public java.util.List<V> subList(int i, int i2) {
            AbstractC3849g<K, V>.C3862k kVar;
            m33445g();
            AbstractC3849g gVar = AbstractC3849g.this;
            Object f = m33446f();
            java.util.List<V> subList = m33441j().subList(i, i2);
            if (m33448b() == null) {
                kVar = this;
            } else {
                kVar = m33448b();
            }
            return gVar.m33484F(f, subList, kVar);
        }

        @Override // java.util.List, p163j$.util.List
        public ListIterator<V> listIterator(int i) {
            m33445g();
            return new C3865a(i);
        }
    }
}
