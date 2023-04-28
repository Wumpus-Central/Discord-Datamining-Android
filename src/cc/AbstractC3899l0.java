package cc;

import cc.AbstractC3837d0;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import p163j$.util.Map;
import p163j$.util.Spliterator;
import p163j$.util.function.BiConsumer;
import p163j$.util.function.BiFunction;
import p163j$.util.function.Function;

/* renamed from: cc.l0 */
/* loaded from: classes3.dex */
public abstract class AbstractC3899l0<K, V> implements Map<K, V>, Serializable, p163j$.util.Map {

    /* renamed from: n */
    static final Map.Entry<?, ?>[] f6435n = new Map.Entry[0];

    /* renamed from: k */
    private transient AbstractC3960w0<Map.Entry<K, V>> f6436k;

    /* renamed from: l */
    private transient AbstractC3960w0<K> f6437l;

    /* renamed from: m */
    private transient AbstractC3837d0<V> f6438m;

    /* renamed from: cc.l0$a */
    /* loaded from: classes3.dex */
    class C3900a extends AbstractC3868g2<K> {

        /* renamed from: k */
        final /* synthetic */ AbstractC3868g2 f6439k;

        C3900a(AbstractC3899l0 l0Var, AbstractC3868g2 g2Var) {
            this.f6439k = g2Var;
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            return this.f6439k.hasNext();
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public K next() {
            return (K) ((Map.Entry) this.f6439k.next()).getKey();
        }
    }

    /* renamed from: cc.l0$b */
    /* loaded from: classes3.dex */
    public static class C3901b<K, V> {

        /* renamed from: a */
        Comparator<? super V> f6440a;

        /* renamed from: b */
        Map.Entry<K, V>[] f6441b;

        /* renamed from: c */
        int f6442c;

        /* renamed from: d */
        boolean f6443d;

        public C3901b() {
            this(4);
        }

        /* renamed from: c */
        private void m33365c(int i) {
            Map.Entry<K, V>[] entryArr = this.f6441b;
            if (i > entryArr.length) {
                this.f6441b = (Map.Entry[]) Arrays.copyOf(entryArr, AbstractC3837d0.AbstractC3838a.m33498a(entryArr.length, i));
                this.f6443d = false;
            }
        }

        /* renamed from: a */
        public AbstractC3899l0<K, V> m33367a() {
            return m33366b();
        }

        /* renamed from: b */
        public AbstractC3899l0<K, V> m33366b() {
            if (this.f6440a != null) {
                if (this.f6443d) {
                    this.f6441b = (Map.Entry[]) Arrays.copyOf(this.f6441b, this.f6442c);
                }
                Arrays.sort(this.f6441b, 0, this.f6442c, AbstractC3937r1.m33316b(this.f6440a).m33312h(C3871h1.m33425n()));
            }
            int i = this.f6442c;
            if (i == 0) {
                return AbstractC3899l0.m33370r();
            }
            if (i != 1) {
                this.f6443d = true;
                return C3956v1.m33267w(i, this.f6441b);
            }
            Map.Entry<K, V> entry = this.f6441b[0];
            Objects.requireNonNull(entry);
            Map.Entry<K, V> entry2 = entry;
            return AbstractC3899l0.m33369s(entry2.getKey(), entry2.getValue());
        }

        /* renamed from: d */
        public C3901b<K, V> m33364d(K k, V v) {
            m33365c(this.f6442c + 1);
            Map.Entry<K, V> k2 = AbstractC3899l0.m33376k(k, v);
            Map.Entry<K, V>[] entryArr = this.f6441b;
            int i = this.f6442c;
            this.f6442c = i + 1;
            entryArr[i] = k2;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C3901b(int i) {
            this.f6441b = new Map.Entry[i];
            this.f6442c = 0;
            this.f6443d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cc.l0$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC3902c<K, V> extends AbstractC3899l0<K, V> {

        /* renamed from: cc.l0$c$a */
        /* loaded from: classes3.dex */
        class C3903a extends AbstractC3918n0<K, V> {
            C3903a() {
            }

            @Override // cc.AbstractC3918n0
            /* renamed from: C */
            AbstractC3899l0<K, V> mo33342C() {
                return AbstractC3902c.this;
            }

            @Override // cc.AbstractC3960w0, cc.AbstractC3837d0
            /* renamed from: j */
            public AbstractC3868g2<Map.Entry<K, V>> iterator() {
                return AbstractC3902c.this.mo33363u();
            }
        }

        @Override // cc.AbstractC3899l0, java.util.Map, p163j$.util.Map
        public /* bridge */ /* synthetic */ Set entrySet() {
            return AbstractC3899l0.super.entrySet();
        }

        @Override // cc.AbstractC3899l0
        /* renamed from: h */
        AbstractC3960w0<Map.Entry<K, V>> mo33273h() {
            return new C3903a();
        }

        @Override // cc.AbstractC3899l0
        /* renamed from: i */
        AbstractC3960w0<K> mo33272i() {
            return new C3930p0(this);
        }

        @Override // cc.AbstractC3899l0
        /* renamed from: j */
        AbstractC3837d0<V> mo33271j() {
            return new C3939s0(this);
        }

        @Override // cc.AbstractC3899l0, java.util.Map, p163j$.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
            return AbstractC3899l0.super.keySet();
        }

        /* renamed from: u */
        abstract AbstractC3868g2<Map.Entry<K, V>> mo33363u();

        @Override // cc.AbstractC3899l0, java.util.Map, p163j$.util.Map
        public /* bridge */ /* synthetic */ Collection values() {
            return AbstractC3899l0.super.values();
        }
    }

    /* renamed from: a */
    public static <K, V> C3901b<K, V> m33382a() {
        return new C3901b<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m33381b(boolean z, String str, Map.Entry<?, ?> entry, Map.Entry<?, ?> entry2) {
        if (!z) {
            throw m33380c(str, entry, entry2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static IllegalArgumentException m33380c(String str, Object obj, Object obj2) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 34 + valueOf.length() + valueOf2.length());
        sb2.append("Multiple entries with same ");
        sb2.append(str);
        sb2.append(": ");
        sb2.append(valueOf);
        sb2.append(" and ");
        sb2.append(valueOf2);
        return new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: d */
    public static <K, V> AbstractC3899l0<K, V> m33379d(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        Map.Entry[] entryArr = (Map.Entry[]) C3976z0.m33211g(iterable, f6435n);
        int length = entryArr.length;
        if (length == 0) {
            return m33370r();
        }
        if (length != 1) {
            return C3956v1.m33268v(entryArr);
        }
        Map.Entry entry = entryArr[0];
        Objects.requireNonNull(entry);
        Map.Entry entry2 = entry;
        return m33369s(entry2.getKey(), entry2.getValue());
    }

    /* renamed from: f */
    public static <K, V> AbstractC3899l0<K, V> m33378f(Map<? extends K, ? extends V> map) {
        if ((map instanceof AbstractC3899l0) && !(map instanceof SortedMap)) {
            AbstractC3899l0<K, V> l0Var = (AbstractC3899l0) map;
            if (!l0Var.mo33270n()) {
                return l0Var;
            }
        } else if (map instanceof EnumMap) {
            return m33377g((EnumMap) map);
        }
        return m33379d(map.entrySet());
    }

    /* renamed from: g */
    private static <K extends Enum<K>, V> AbstractC3899l0<K, V> m33377g(EnumMap<K, ? extends V> enumMap) {
        EnumMap enumMap2 = new EnumMap((EnumMap) enumMap);
        for (Map.Entry<K, V> entry : enumMap2.entrySet()) {
            C3911m.m33353a(entry.getKey(), entry.getValue());
        }
        return C3846f0.m33497v(enumMap2);
    }

    /* renamed from: k */
    static <K, V> Map.Entry<K, V> m33376k(K k, V v) {
        C3911m.m33353a(k, v);
        return new AbstractMap.SimpleImmutableEntry(k, v);
    }

    /* renamed from: r */
    public static <K, V> AbstractC3899l0<K, V> m33370r() {
        return (AbstractC3899l0<K, V>) C3956v1.f6506r;
    }

    /* renamed from: s */
    public static <K, V> AbstractC3899l0<K, V> m33369s(K k, V v) {
        return AbstractC3826b0.m33515w(k, v);
    }

    @Override // java.util.Map, p163j$.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // p163j$.util.Map
    @Deprecated
    public final V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute((AbstractC3899l0<K, V>) obj, (BiFunction<? super AbstractC3899l0<K, V>, ? super V, ? extends V>) BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // p163j$.util.Map
    @Deprecated
    public final V computeIfAbsent(K k, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent((AbstractC3899l0<K, V>) obj, (Function<? super AbstractC3899l0<K, V>, ? extends V>) Function.VivifiedWrapper.convert(function));
    }

    @Override // p163j$.util.Map
    @Deprecated
    public final V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent((AbstractC3899l0<K, V>) obj, (BiFunction<? super AbstractC3899l0<K, V>, ? super V, ? extends V>) BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, p163j$.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map, p163j$.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map, p163j$.util.Map
    public boolean equals(Object obj) {
        return C3871h1.m33437b(this, obj);
    }

    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.Map, p163j$.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map, p163j$.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    /* renamed from: h */
    abstract AbstractC3960w0<Map.Entry<K, V>> mo33273h();

    @Override // java.util.Map, p163j$.util.Map
    public int hashCode() {
        return C3828b2.m33512b(entrySet());
    }

    /* renamed from: i */
    abstract AbstractC3960w0<K> mo33272i();

    @Override // java.util.Map, p163j$.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    abstract AbstractC3837d0<V> mo33271j();

    /* renamed from: l */
    public AbstractC3960w0<Map.Entry<K, V>> entrySet() {
        AbstractC3960w0<Map.Entry<K, V>> w0Var = this.f6436k;
        if (w0Var != null) {
            return w0Var;
        }
        AbstractC3960w0<Map.Entry<K, V>> h = mo33273h();
        this.f6436k = h;
        return h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean m33374m() {
        return false;
    }

    @Override // p163j$.util.Map
    @Deprecated
    public final V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge((AbstractC3899l0<K, V>) obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public abstract boolean mo33270n();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public AbstractC3868g2<K> mo33373o() {
        return new C3900a(this, entrySet().iterator());
    }

    /* renamed from: p */
    public AbstractC3960w0<K> keySet() {
        AbstractC3960w0<K> w0Var = this.f6437l;
        if (w0Var != null) {
            return w0Var;
        }
        AbstractC3960w0<K> i = mo33272i();
        this.f6437l = i;
        return i;
    }

    @Override // java.util.Map, p163j$.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p163j$.util.Map
    @Deprecated
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p163j$.util.Map
    @Deprecated
    public final V putIfAbsent(K k, V v) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public Spliterator<K> mo33371q() {
        return C3924p.m33336d(entrySet().spliterator(), new Function() { // from class: cc.k0
            @Override // p163j$.util.function.Function
            public /* synthetic */ Function andThen(Function function) {
                return function.getClass();
            }

            @Override // p163j$.util.function.Function
            public final Object apply(Object obj) {
                return ((Map.Entry) obj).getKey();
            }

            @Override // p163j$.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return function.getClass();
            }
        });
    }

    @Override // java.util.Map, p163j$.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p163j$.util.Map
    @Deprecated
    public final boolean replace(K k, V v, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override // p163j$.util.Map
    @Deprecated
    public final void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    /* renamed from: t */
    public AbstractC3837d0<V> values() {
        AbstractC3837d0<V> d0Var = this.f6438m;
        if (d0Var != null) {
            return d0Var;
        }
        AbstractC3837d0<V> j = mo33271j();
        this.f6438m = j;
        return j;
    }

    public String toString() {
        return C3871h1.m33428k(this);
    }

    @Override // java.util.Map, p163j$.util.Map
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p163j$.util.Map
    @Deprecated
    public final V replace(K k, V v) {
        throw new UnsupportedOperationException();
    }
}
