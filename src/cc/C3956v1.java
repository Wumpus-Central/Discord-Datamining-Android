package cc;

import cc.AbstractC3918n0;
import cc.C3912m0;
import java.util.Map;
import java.util.Objects;
import p030bc.C3457i;
import p163j$.util.function.BiConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cc.v1 */
/* loaded from: classes3.dex */
public final class C3956v1<K, V> extends AbstractC3899l0<K, V> {

    /* renamed from: r */
    static final AbstractC3899l0<Object, Object> f6506r = new C3956v1(AbstractC3899l0.f6435n, null, 0);

    /* renamed from: o */
    final transient Map.Entry<K, V>[] f6507o;

    /* renamed from: p */
    private final transient C3912m0<K, V>[] f6508p;

    /* renamed from: q */
    private final transient int f6509q;

    /* renamed from: cc.v1$a */
    /* loaded from: classes3.dex */
    private static final class C3957a<K> extends AbstractC3972y0<K> {

        /* renamed from: m */
        private final C3956v1<K, ?> f6510m;

        C3957a(C3956v1<K, ?> v1Var) {
            this.f6510m = v1Var;
        }

        @Override // cc.AbstractC3837d0, java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
        public boolean contains(Object obj) {
            return this.f6510m.containsKey(obj);
        }

        @Override // cc.AbstractC3972y0
        K get(int i) {
            return this.f6510m.f6507o[i].getKey();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // cc.AbstractC3837d0
        /* renamed from: i */
        public boolean mo33222i() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
        public int size() {
            return this.f6510m.size();
        }
    }

    /* renamed from: cc.v1$b */
    /* loaded from: classes3.dex */
    private static final class C3958b<K, V> extends AbstractC3884i0<V> {

        /* renamed from: l */
        final C3956v1<K, V> f6511l;

        C3958b(C3956v1<K, V> v1Var) {
            this.f6511l = v1Var;
        }

        @Override // java.util.List, p163j$.util.List
        public V get(int i) {
            return this.f6511l.f6507o[i].getValue();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // cc.AbstractC3837d0
        /* renamed from: i */
        public boolean mo33222i() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
        public int size() {
            return this.f6511l.size();
        }
    }

    private C3956v1(Map.Entry<K, V>[] entryArr, C3912m0<K, V>[] m0VarArr, int i) {
        this.f6507o = entryArr;
        this.f6508p = m0VarArr;
        this.f6509q = i;
    }

    /* renamed from: u */
    static int m33269u(Object obj, Map.Entry<?, ?> entry, C3912m0<?, ?> m0Var) {
        int i = 0;
        while (m0Var != null) {
            AbstractC3899l0.m33381b(!obj.equals(m0Var.getKey()), "key", entry, m0Var);
            i++;
            m0Var = m0Var.mo33349b();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static <K, V> AbstractC3899l0<K, V> m33268v(Map.Entry<K, V>... entryArr) {
        return m33267w(entryArr.length, entryArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static <K, V> AbstractC3899l0<K, V> m33267w(int i, Map.Entry<K, V>[] entryArr) {
        Map.Entry<K, V>[] entryArr2;
        C3912m0 m0Var;
        C3457i.m34350k(i, entryArr.length);
        if (i == 0) {
            return (C3956v1) f6506r;
        }
        if (i == entryArr.length) {
            entryArr2 = entryArr;
        } else {
            entryArr2 = C3912m0.m33350a(i);
        }
        int a = C3975z.m33220a(i, 1.2d);
        C3912m0[] a2 = C3912m0.m33350a(a);
        int i2 = a - 1;
        for (int i3 = 0; i3 < i; i3++) {
            Map.Entry<K, V> entry = entryArr[i3];
            Objects.requireNonNull(entry);
            Map.Entry<K, V> entry2 = entry;
            K key = entry2.getKey();
            V value = entry2.getValue();
            C3911m.m33353a(key, value);
            int b = C3975z.m33219b(key.hashCode()) & i2;
            C3912m0 m0Var2 = a2[b];
            if (m0Var2 == null) {
                m0Var = m33264z(entry2, key, value);
            } else {
                m0Var = new C3912m0.C3913a(key, value, m0Var2);
            }
            a2[b] = m0Var;
            entryArr2[i3] = m0Var;
            if (m33269u(key, m0Var, m0Var2) > 8) {
                return C3834c1.m33501v(i, entryArr);
            }
        }
        return new C3956v1(entryArr2, a2, i2);
    }

    /* renamed from: x */
    static <V> V m33266x(Object obj, C3912m0<?, V>[] m0VarArr, int i) {
        if (!(obj == null || m0VarArr == null)) {
            for (C3912m0<?, V> m0Var = m0VarArr[i & C3975z.m33219b(obj.hashCode())]; m0Var != null; m0Var = m0Var.mo33349b()) {
                if (obj.equals(m0Var.getKey())) {
                    return m0Var.getValue();
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static <K, V> C3912m0<K, V> m33265y(Map.Entry<K, V> entry) {
        return m33264z(entry, entry.getKey(), entry.getValue());
    }

    /* renamed from: z */
    static <K, V> C3912m0<K, V> m33264z(Map.Entry<K, V> entry, K k, V v) {
        boolean z;
        if (!(entry instanceof C3912m0) || !((C3912m0) entry).mo33348c()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return (C3912m0) entry;
        }
        return new C3912m0<>(k, v);
    }

    @Override // cc.AbstractC3899l0, p163j$.util.Map
    public void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        Map.Entry<K, V>[] entryArr;
        C3457i.m34352i(biConsumer);
        for (Map.Entry<K, V> entry : this.f6507o) {
            biConsumer.accept((K) entry.getKey(), (V) entry.getValue());
        }
    }

    @Override // cc.AbstractC3899l0, java.util.Map
    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // cc.AbstractC3899l0, java.util.Map, p163j$.util.Map
    public V get(Object obj) {
        return (V) m33266x(obj, this.f6508p, this.f6509q);
    }

    @Override // cc.AbstractC3899l0
    /* renamed from: h */
    AbstractC3960w0<Map.Entry<K, V>> mo33273h() {
        return new AbstractC3918n0.C3919a(this, this.f6507o);
    }

    @Override // cc.AbstractC3899l0
    /* renamed from: i */
    AbstractC3960w0<K> mo33272i() {
        return new C3957a(this);
    }

    @Override // cc.AbstractC3899l0
    /* renamed from: j */
    AbstractC3837d0<V> mo33271j() {
        return new C3958b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3899l0
    /* renamed from: n */
    public boolean mo33270n() {
        return false;
    }

    @Override // java.util.Map, p163j$.util.Map
    public int size() {
        return this.f6507o.length;
    }
}
