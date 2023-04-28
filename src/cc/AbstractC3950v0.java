package cc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p163j$.util.Collection;
import p163j$.util.Spliterator;
import p163j$.util.function.Function;

/* renamed from: cc.v0 */
/* loaded from: classes3.dex */
public abstract class AbstractC3950v0<K, V> extends AbstractC3895k<K, V> implements Serializable {

    /* renamed from: o */
    final transient AbstractC3899l0<K, ? extends AbstractC3837d0<V>> f6492o;

    /* renamed from: p */
    final transient int f6493p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cc.v0$a */
    /* loaded from: classes3.dex */
    public class C3951a extends AbstractC3868g2<Map.Entry<K, V>> {

        /* renamed from: k */
        final Iterator<? extends Map.Entry<K, ? extends AbstractC3837d0<V>>> f6494k;

        /* renamed from: l */
        K f6495l = null;

        /* renamed from: m */
        Iterator<V> f6496m = C3818a1.m33533e();

        C3951a() {
            this.f6494k = AbstractC3950v0.this.f6492o.entrySet().iterator();
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (!this.f6496m.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f6494k.next();
                this.f6495l = (K) entry.getKey();
                this.f6496m = ((AbstractC3837d0) entry.getValue()).iterator();
            }
            K k = this.f6495l;
            Objects.requireNonNull(k);
            return C3871h1.m33436c(k, this.f6496m.next());
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            return this.f6496m.hasNext() || this.f6494k.hasNext();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cc.v0$b */
    /* loaded from: classes3.dex */
    public class C3952b extends AbstractC3868g2<V> {

        /* renamed from: k */
        Iterator<? extends AbstractC3837d0<V>> f6498k;

        /* renamed from: l */
        Iterator<V> f6499l = C3818a1.m33533e();

        C3952b() {
            this.f6498k = AbstractC3950v0.this.f6492o.values().iterator();
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            return this.f6499l.hasNext() || this.f6498k.hasNext();
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public V next() {
            if (!this.f6499l.hasNext()) {
                this.f6499l = ((AbstractC3837d0) this.f6498k.next()).iterator();
            }
            return this.f6499l.next();
        }
    }

    /* renamed from: cc.v0$c */
    /* loaded from: classes3.dex */
    public static class C3953c<K, V> {

        /* renamed from: a */
        final Map<K, Collection<V>> f6501a = C3942s1.m33305d();

        /* renamed from: b */
        Comparator<? super K> f6502b;

        /* renamed from: c */
        Comparator<? super V> f6503c;

        /* renamed from: a */
        public AbstractC3950v0<K, V> m33277a() {
            Collection entrySet = this.f6501a.entrySet();
            Comparator<? super K> comparator = this.f6502b;
            if (comparator != null) {
                entrySet = AbstractC3937r1.m33316b(comparator).m33313g().m33315c(entrySet);
            }
            return C3892j0.m33386z(entrySet, this.f6503c);
        }

        /* renamed from: b */
        Collection<V> m33276b() {
            return new ArrayList();
        }

        /* renamed from: c */
        public C3953c<K, V> mo33275c(K k, Iterable<? extends V> iterable) {
            String str;
            if (k == null) {
                String valueOf = String.valueOf(C3976z0.m33210h(iterable));
                if (valueOf.length() != 0) {
                    str = "null key in entry: null=".concat(valueOf);
                } else {
                    str = new String("null key in entry: null=");
                }
                throw new NullPointerException(str);
            }
            Collection<V> collection = this.f6501a.get(k);
            if (collection != null) {
                for (V v : iterable) {
                    C3911m.m33353a(k, v);
                    collection.add(v);
                }
                return this;
            }
            Iterator<? extends V> it = iterable.iterator();
            if (!it.hasNext()) {
                return this;
            }
            Collection<V> b = m33276b();
            while (it.hasNext()) {
                V v2 = (V) it.next();
                C3911m.m33353a(k, v2);
                b.add(v2);
            }
            this.f6501a.put(k, b);
            return this;
        }

        /* renamed from: d */
        public C3953c<K, V> m33274d(K k, V... vArr) {
            return mo33275c(k, Arrays.asList(vArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cc.v0$d */
    /* loaded from: classes3.dex */
    public static class C3954d<K, V> extends AbstractC3837d0<Map.Entry<K, V>> {

        /* renamed from: l */
        final AbstractC3950v0<K, V> f6504l;

        C3954d(AbstractC3950v0<K, V> v0Var) {
            this.f6504l = v0Var;
        }

        @Override // cc.AbstractC3837d0, java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f6504l.mo33299b(entry.getKey(), entry.getValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // cc.AbstractC3837d0
        /* renamed from: i */
        public boolean mo33222i() {
            return this.f6504l.m33283t();
        }

        @Override // cc.AbstractC3837d0
        /* renamed from: j */
        public AbstractC3868g2<Map.Entry<K, V>> iterator() {
            return this.f6504l.mo33293h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
        public int size() {
            return this.f6504l.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cc.v0$e */
    /* loaded from: classes3.dex */
    public static final class C3955e<K, V> extends AbstractC3837d0<V> {

        /* renamed from: l */
        private final transient AbstractC3950v0<K, V> f6505l;

        C3955e(AbstractC3950v0<K, V> v0Var) {
            this.f6505l = v0Var;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // cc.AbstractC3837d0
        /* renamed from: b */
        public int mo33225b(Object[] objArr, int i) {
            AbstractC3868g2<? extends AbstractC3837d0<V>> j = this.f6505l.f6492o.values().iterator();
            while (j.hasNext()) {
                i = ((AbstractC3837d0) j.next()).mo33225b(objArr, i);
            }
            return i;
        }

        @Override // cc.AbstractC3837d0, java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
        public boolean contains(Object obj) {
            return this.f6505l.mo33298c(obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // cc.AbstractC3837d0
        /* renamed from: i */
        public boolean mo33222i() {
            return true;
        }

        @Override // cc.AbstractC3837d0
        /* renamed from: j */
        public AbstractC3868g2<V> iterator() {
            return this.f6505l.mo33291k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
        public int size() {
            return this.f6505l.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3950v0(AbstractC3899l0<K, ? extends AbstractC3837d0<V>> l0Var, int i) {
        this.f6492o = l0Var;
        this.f6493p = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static /* synthetic */ Spliterator m33281v(Map.Entry entry) {
        final Object key = entry.getKey();
        return C3924p.m33336d(Collection.EL.spliterator((java.util.Collection) entry.getValue()), new Function() { // from class: cc.u0
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

    @Override // cc.AbstractC3889j, cc.AbstractC3897k1
    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo33299b(Object obj, Object obj2) {
        return super.mo33299b(obj, obj2);
    }

    @Override // cc.AbstractC3889j
    /* renamed from: c */
    public boolean mo33298c(Object obj) {
        return obj != null && super.mo33298c(obj);
    }

    @Override // cc.AbstractC3897k1
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // cc.AbstractC3889j
    /* renamed from: d */
    Map<K, java.util.Collection<V>> mo33297d() {
        throw new AssertionError("should never be called");
    }

    @Override // cc.AbstractC3889j
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // cc.AbstractC3889j
    /* renamed from: f */
    Set<K> mo33295f() {
        throw new AssertionError("unreachable");
    }

    @Override // cc.AbstractC3889j
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // cc.AbstractC3889j
    /* renamed from: i */
    Spliterator<Map.Entry<K, V>> mo33292i() {
        return C3924p.m33339a(asMap().entrySet().spliterator(), new Function() { // from class: cc.t0
            @Override // p163j$.util.function.Function
            public /* synthetic */ Function andThen(Function function) {
                return function.getClass();
            }

            @Override // p163j$.util.function.Function
            public final Object apply(Object obj) {
                Spliterator v;
                v = AbstractC3950v0.m33281v((Map.Entry) obj);
                return v;
            }

            @Override // p163j$.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return function.getClass();
            }
        }, 64, size());
    }

    /* renamed from: o */
    public AbstractC3899l0<K, java.util.Collection<V>> asMap() {
        return (AbstractC3899l0<K, ? extends AbstractC3837d0<V>>) this.f6492o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public AbstractC3837d0<Map.Entry<K, V>> mo33296e() {
        return new C3954d(this);
    }

    @Override // cc.AbstractC3897k1
    @Deprecated
    public final boolean put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public AbstractC3837d0<V> mo33294g() {
        return new C3955e(this);
    }

    /* renamed from: r */
    public AbstractC3837d0<Map.Entry<K, V>> mo33300a() {
        return (AbstractC3837d0) super.mo33300a();
    }

    @Override // cc.AbstractC3889j, cc.AbstractC3897k1
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public AbstractC3868g2<Map.Entry<K, V>> mo33293h() {
        return new C3951a();
    }

    @Override // cc.AbstractC3897k1
    public int size() {
        return this.f6493p;
    }

    /* renamed from: t */
    boolean m33283t() {
        return this.f6492o.mo33270n();
    }

    @Override // cc.AbstractC3889j
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public AbstractC3868g2<V> mo33291k() {
        return new C3952b();
    }

    /* renamed from: x */
    public AbstractC3837d0<V> values() {
        return (AbstractC3837d0) super.values();
    }
}
