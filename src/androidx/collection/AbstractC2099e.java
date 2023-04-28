package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p163j$.util.Iterator;
import p163j$.util.Map;
import p163j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.collection.e */
/* loaded from: classes.dex */
public abstract class AbstractC2099e<K, V> {

    /* renamed from: a */
    AbstractC2099e<K, V>.C2101b f2443a;

    /* renamed from: b */
    AbstractC2099e<K, V>.C2102c f2444b;

    /* renamed from: c */
    AbstractC2099e<K, V>.C0027e f2445c;

    /* renamed from: androidx.collection.e$a */
    /* loaded from: classes.dex */
    final class C2100a<T> implements Iterator<T>, p163j$.util.Iterator {

        /* renamed from: k */
        final int f2446k;

        /* renamed from: l */
        int f2447l;

        /* renamed from: m */
        int f2448m;

        /* renamed from: n */
        boolean f2449n = false;

        C2100a(int i) {
            this.f2446k = i;
            this.f2447l = AbstractC2099e.this.mo39003d();
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
            return this.f2448m < this.f2447l;
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public T next() {
            if (hasNext()) {
                T t = (T) AbstractC2099e.this.mo39005b(this.f2448m, this.f2446k);
                this.f2448m++;
                this.f2449n = true;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            if (this.f2449n) {
                int i = this.f2448m - 1;
                this.f2448m = i;
                this.f2447l--;
                this.f2449n = false;
                AbstractC2099e.this.mo38999h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.collection.e$b */
    /* loaded from: classes.dex */
    public final class C2101b implements Set<Map.Entry<K, V>> {
        C2101b() {
        }

        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d = AbstractC2099e.this.mo39003d();
            java.util.Iterator<? extends Map.Entry<K, V>> it = collection.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                AbstractC2099e.this.mo39000g(entry.getKey(), entry.getValue());
            }
            if (d != AbstractC2099e.this.mo39003d()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC2099e.this.mo39006a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e = AbstractC2099e.this.mo39002e(entry.getKey());
            if (e < 0) {
                return false;
            }
            return C2097c.m39024c(AbstractC2099e.this.mo39005b(e, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            java.util.Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC2099e.m38996k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            for (int d = AbstractC2099e.this.mo39003d() - 1; d >= 0; d--) {
                Object b = AbstractC2099e.this.mo39005b(d, 0);
                Object b2 = AbstractC2099e.this.mo39005b(d, 1);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                if (b2 == null) {
                    i2 = 0;
                } else {
                    i2 = b2.hashCode();
                }
                i3 += i ^ i2;
            }
            return i3;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC2099e.this.mo39003d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new C2103d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC2099e.this.mo39003d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.collection.e$c */
    /* loaded from: classes.dex */
    public final class C2102c implements Set<K> {
        C2102c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC2099e.this.mo39006a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC2099e.this.mo39002e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return AbstractC2099e.m38997j(AbstractC2099e.this.mo39004c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC2099e.m38996k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i;
            int i2 = 0;
            for (int d = AbstractC2099e.this.mo39003d() - 1; d >= 0; d--) {
                Object b = AbstractC2099e.this.mo39005b(d, 0);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                i2 += i;
            }
            return i2;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC2099e.this.mo39003d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<K> iterator() {
            return new C2100a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int e = AbstractC2099e.this.mo39002e(obj);
            if (e < 0) {
                return false;
            }
            AbstractC2099e.this.mo38999h(e);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return AbstractC2099e.m38992o(AbstractC2099e.this.mo39004c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return AbstractC2099e.m38991p(AbstractC2099e.this.mo39004c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC2099e.this.mo39003d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC2099e.this.m38990q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC2099e.this.m38989r(tArr, 0);
        }
    }

    /* renamed from: androidx.collection.e$d */
    /* loaded from: classes.dex */
    final class C2103d implements java.util.Iterator<Map.Entry<K, V>>, Map.Entry<K, V>, p163j$.util.Iterator, Map.Entry {

        /* renamed from: k */
        int f2453k;

        /* renamed from: m */
        boolean f2455m = false;

        /* renamed from: l */
        int f2454l = -1;

        C2103d() {
            this.f2453k = AbstractC2099e.this.mo39003d() - 1;
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f2454l++;
                this.f2455m = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Map.Entry, p163j$.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f2455m) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!C2097c.m39024c(entry.getKey(), AbstractC2099e.this.mo39005b(this.f2454l, 0)) || !C2097c.m39024c(entry.getValue(), AbstractC2099e.this.mo39005b(this.f2454l, 1))) {
                    return false;
                }
                return true;
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

        @Override // java.util.Map.Entry, p163j$.util.Map.Entry
        public K getKey() {
            if (this.f2455m) {
                return (K) AbstractC2099e.this.mo39005b(this.f2454l, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry, p163j$.util.Map.Entry
        public V getValue() {
            if (this.f2455m) {
                return (V) AbstractC2099e.this.mo39005b(this.f2454l, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            return this.f2454l < this.f2453k;
        }

        @Override // java.util.Map.Entry, p163j$.util.Map.Entry
        public int hashCode() {
            int i;
            if (this.f2455m) {
                int i2 = 0;
                Object b = AbstractC2099e.this.mo39005b(this.f2454l, 0);
                Object b2 = AbstractC2099e.this.mo39005b(this.f2454l, 1);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                if (b2 != null) {
                    i2 = b2.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            if (this.f2455m) {
                AbstractC2099e.this.mo38999h(this.f2454l);
                this.f2454l--;
                this.f2453k--;
                this.f2455m = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry, p163j$.util.Map.Entry
        public V setValue(V v) {
            if (this.f2455m) {
                return (V) AbstractC2099e.this.mo38998i(this.f2454l, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.collection.e$e */
    /* loaded from: classes.dex */
    public final class C0027e implements Collection<V> {
        C0027e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            AbstractC2099e.this.mo39006a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC2099e.this.mo39001f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            java.util.Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return AbstractC2099e.this.mo39003d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
            return new C2100a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int f = AbstractC2099e.this.mo39001f(obj);
            if (f < 0) {
                return false;
            }
            AbstractC2099e.this.mo38999h(f);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int d = AbstractC2099e.this.mo39003d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (collection.contains(AbstractC2099e.this.mo39005b(i, 1))) {
                    AbstractC2099e.this.mo38999h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int d = AbstractC2099e.this.mo39003d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (!collection.contains(AbstractC2099e.this.mo39005b(i, 1))) {
                    AbstractC2099e.this.mo38999h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return AbstractC2099e.this.mo39003d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC2099e.this.m38990q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC2099e.this.m38989r(tArr, 1);
        }
    }

    /* renamed from: j */
    public static <K, V> boolean m38997j(java.util.Map<K, V> map, Collection<?> collection) {
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static <T> boolean m38996k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: o */
    public static <K, V> boolean m38992o(java.util.Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static <K, V> boolean m38991p(java.util.Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        java.util.Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    protected abstract void mo39006a();

    /* renamed from: b */
    protected abstract Object mo39005b(int i, int i2);

    /* renamed from: c */
    protected abstract java.util.Map<K, V> mo39004c();

    /* renamed from: d */
    protected abstract int mo39003d();

    /* renamed from: e */
    protected abstract int mo39002e(Object obj);

    /* renamed from: f */
    protected abstract int mo39001f(Object obj);

    /* renamed from: g */
    protected abstract void mo39000g(K k, V v);

    /* renamed from: h */
    protected abstract void mo38999h(int i);

    /* renamed from: i */
    protected abstract V mo38998i(int i, V v);

    /* renamed from: l */
    public Set<Map.Entry<K, V>> m38995l() {
        if (this.f2443a == null) {
            this.f2443a = new C2101b();
        }
        return this.f2443a;
    }

    /* renamed from: m */
    public Set<K> m38994m() {
        if (this.f2444b == null) {
            this.f2444b = new C2102c();
        }
        return this.f2444b;
    }

    /* renamed from: n */
    public Collection<V> m38993n() {
        if (this.f2445c == null) {
            this.f2445c = new C0027e();
        }
        return this.f2445c;
    }

    /* renamed from: q */
    public Object[] m38990q(int i) {
        int d = mo39003d();
        Object[] objArr = new Object[d];
        for (int i2 = 0; i2 < d; i2++) {
            objArr[i2] = mo39005b(i2, i);
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public <T> T[] m38989r(T[] tArr, int i) {
        int d = mo39003d();
        if (tArr.length < d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), d));
        }
        for (int i2 = 0; i2 < d; i2++) {
            tArr[i2] = mo39005b(i2, i);
        }
        if (tArr.length > d) {
            tArr[d] = null;
        }
        return tArr;
    }
}
