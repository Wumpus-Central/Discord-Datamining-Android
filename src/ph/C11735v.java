package ph;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;
import ph.C11699h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ph.v */
/* loaded from: classes8.dex */
public class C11735v<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: k */
    private final int f26201k;

    /* renamed from: l */
    private List<C11735v<K, V>.C11739c> f26202l;

    /* renamed from: m */
    private Map<K, V> f26203m;

    /* renamed from: n */
    private boolean f26204n;

    /* renamed from: o */
    private volatile C11735v<K, V>.C11741e f26205o;

    /* renamed from: ph.v$a */
    /* loaded from: classes8.dex */
    static class C11736a extends C11735v<FieldDescriptorType, Object> {
        C11736a(int i) {
            super(i, null);
        }

        @Override // ph.C11735v
        /* renamed from: n */
        public void mo8725n() {
            if (!m8729m()) {
                for (int i = 0; i < m8732j(); i++) {
                    Map.Entry<FieldDescriptorType, Object> i2 = m8733i(i);
                    if (((C11699h.AbstractC11701b) i2.getKey()).mo8820w()) {
                        i2.setValue(Collections.unmodifiableList((List) i2.getValue()));
                    }
                }
                Iterator it = m8731k().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((C11699h.AbstractC11701b) entry.getKey()).mo8820w()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            C11735v.super.mo8725n();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return C11735v.super.m8727p((C11699h.AbstractC11701b) obj, obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ph.v$b */
    /* loaded from: classes8.dex */
    public static class C11737b {

        /* renamed from: a */
        private static final Iterator<Object> f26206a = new C11738a();

        /* renamed from: b */
        private static final Iterable<Object> f26207b = new C0374b();

        /* renamed from: ph.v$b$a */
        /* loaded from: classes8.dex */
        static class C11738a implements Iterator<Object>, p163j$.util.Iterator {
            C11738a() {
            }

            @Override // p163j$.util.Iterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // java.util.Iterator
            public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super Object> consumer) {
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
            }

            @Override // java.util.Iterator, p163j$.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator, p163j$.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator, p163j$.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: ph.v$b$b */
        /* loaded from: classes8.dex */
        static class C0374b implements Iterable<Object> {
            C0374b() {
            }

            @Override // java.lang.Iterable
            public java.util.Iterator<Object> iterator() {
                return C11737b.f26206a;
            }
        }

        /* renamed from: b */
        static <T> Iterable<T> m8723b() {
            return (Iterable<T>) f26207b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ph.v$c */
    /* loaded from: classes8.dex */
    public class C11739c implements Comparable<C11735v<K, V>.C11739c>, Map.Entry<K, V> {

        /* renamed from: k */
        private final K f26208k;

        /* renamed from: l */
        private V f26209l;

        C11739c(C11735v vVar, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        /* renamed from: b */
        private boolean m8721b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        /* renamed from: a */
        public int compareTo(C11735v<K, V>.C11739c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        /* renamed from: c */
        public K getKey() {
            return this.f26208k;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!m8721b(this.f26208k, entry.getKey()) || !m8721b(this.f26209l, entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f26209l;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f26208k;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f26209l;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            C11735v.this.m8735g();
            V v2 = this.f26209l;
            this.f26209l = v;
            return v2;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f26208k);
            String valueOf2 = String.valueOf(this.f26209l);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
            sb2.append(valueOf);
            sb2.append("=");
            sb2.append(valueOf2);
            return sb2.toString();
        }

        C11739c(K k, V v) {
            this.f26208k = k;
            this.f26209l = v;
        }
    }

    /* renamed from: ph.v$e */
    /* loaded from: classes8.dex */
    private class C11741e extends AbstractSet<Map.Entry<K, V>> {
        private C11741e() {
        }

        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C11735v.this.m8727p(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C11735v.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C11735v.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 == value || (obj2 != null && obj2.equals(value))) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new C11740d(C11735v.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C11735v.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C11735v.this.size();
        }

        /* synthetic */ C11741e(C11735v vVar, C11736a aVar) {
            this();
        }
    }

    /* synthetic */ C11735v(int i, C11736a aVar) {
        this(i);
    }

    /* renamed from: f */
    private int m8736f(K k) {
        int size = this.f26202l.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f26202l.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f26202l.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m8735g() {
        if (this.f26204n) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: h */
    private void m8734h() {
        m8735g();
        if (this.f26202l.isEmpty() && !(this.f26202l instanceof ArrayList)) {
            this.f26202l = new ArrayList(this.f26201k);
        }
    }

    /* renamed from: l */
    private SortedMap<K, V> m8730l() {
        m8735g();
        if (this.f26203m.isEmpty() && !(this.f26203m instanceof TreeMap)) {
            this.f26203m = new TreeMap();
        }
        return (SortedMap) this.f26203m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static <FieldDescriptorType extends C11699h.AbstractC11701b<FieldDescriptorType>> C11735v<FieldDescriptorType, Object> m8728o(int i) {
        return new C11736a(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public V m8726q(int i) {
        m8735g();
        V value = this.f26202l.remove(i).getValue();
        if (!this.f26203m.isEmpty()) {
            java.util.Iterator<Map.Entry<K, V>> it = m8730l().entrySet().iterator();
            this.f26202l.add(new C11739c(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m8735g();
        if (!this.f26202l.isEmpty()) {
            this.f26202l.clear();
        }
        if (!this.f26203m.isEmpty()) {
            this.f26203m.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m8736f(comparable) >= 0 || this.f26203m.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f26205o == null) {
            this.f26205o = new C11741e(this, null);
        }
        return this.f26205o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f = m8736f(comparable);
        if (f >= 0) {
            return this.f26202l.get(f).getValue();
        }
        return this.f26203m.get(comparable);
    }

    /* renamed from: i */
    public Map.Entry<K, V> m8733i(int i) {
        return this.f26202l.get(i);
    }

    /* renamed from: j */
    public int m8732j() {
        return this.f26202l.size();
    }

    /* renamed from: k */
    public Iterable<Map.Entry<K, V>> m8731k() {
        return this.f26203m.isEmpty() ? C11737b.m8723b() : this.f26203m.entrySet();
    }

    /* renamed from: m */
    public boolean m8729m() {
        return this.f26204n;
    }

    /* renamed from: n */
    public void mo8725n() {
        Map<K, V> map;
        if (!this.f26204n) {
            if (this.f26203m.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f26203m);
            }
            this.f26203m = map;
            this.f26204n = true;
        }
    }

    /* renamed from: p */
    public V m8727p(K k, V v) {
        m8735g();
        int f = m8736f(k);
        if (f >= 0) {
            return this.f26202l.get(f).setValue(v);
        }
        m8734h();
        int i = -(f + 1);
        if (i >= this.f26201k) {
            return m8730l().put(k, v);
        }
        int size = this.f26202l.size();
        int i2 = this.f26201k;
        if (size == i2) {
            C11735v<K, V>.C11739c remove = this.f26202l.remove(i2 - 1);
            m8730l().put((K) remove.getKey(), remove.getValue());
        }
        this.f26202l.add(i, new C11739c(k, v));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m8735g();
        Comparable comparable = (Comparable) obj;
        int f = m8736f(comparable);
        if (f >= 0) {
            return (V) m8726q(f);
        }
        if (this.f26203m.isEmpty()) {
            return null;
        }
        return this.f26203m.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f26202l.size() + this.f26203m.size();
    }

    /* renamed from: ph.v$d */
    /* loaded from: classes8.dex */
    private class C11740d implements java.util.Iterator<Map.Entry<K, V>>, p163j$.util.Iterator {

        /* renamed from: k */
        private int f26211k;

        /* renamed from: l */
        private boolean f26212l;

        /* renamed from: m */
        private java.util.Iterator<Map.Entry<K, V>> f26213m;

        private C11740d() {
            this.f26211k = -1;
        }

        /* renamed from: b */
        private java.util.Iterator<Map.Entry<K, V>> m8719b() {
            if (this.f26213m == null) {
                this.f26213m = C11735v.this.f26203m.entrySet().iterator();
            }
            return this.f26213m;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            this.f26212l = true;
            int i = this.f26211k + 1;
            this.f26211k = i;
            if (i < C11735v.this.f26202l.size()) {
                return (Map.Entry) C11735v.this.f26202l.get(this.f26211k);
            }
            return m8719b().next();
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
            return this.f26211k + 1 < C11735v.this.f26202l.size() || m8719b().hasNext();
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            if (this.f26212l) {
                this.f26212l = false;
                C11735v.this.m8735g();
                if (this.f26211k < C11735v.this.f26202l.size()) {
                    C11735v vVar = C11735v.this;
                    int i = this.f26211k;
                    this.f26211k = i - 1;
                    vVar.m8726q(i);
                    return;
                }
                m8719b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ C11740d(C11735v vVar, C11736a aVar) {
            this();
        }
    }

    private C11735v(int i) {
        this.f26201k = i;
        this.f26202l = Collections.emptyList();
        this.f26203m = Collections.emptyMap();
    }
}
