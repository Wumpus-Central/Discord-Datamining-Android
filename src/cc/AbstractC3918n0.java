package cc;

import cc.AbstractC3960w0;
import java.util.Map;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cc.n0 */
/* loaded from: classes3.dex */
public abstract class AbstractC3918n0<K, V> extends AbstractC3960w0.AbstractC3961a<Map.Entry<K, V>> {

    /* renamed from: cc.n0$a */
    /* loaded from: classes3.dex */
    static final class C3919a<K, V> extends AbstractC3918n0<K, V> {

        /* renamed from: m */
        private final transient AbstractC3899l0<K, V> f6454m;

        /* renamed from: n */
        private final transient AbstractC3884i0<Map.Entry<K, V>> f6455n;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C3919a(AbstractC3899l0<K, V> l0Var, Map.Entry<K, V>[] entryArr) {
            this(l0Var, AbstractC3884i0.m33405p(entryArr));
        }

        @Override // cc.AbstractC3960w0.AbstractC3961a
        /* renamed from: B */
        AbstractC3884i0<Map.Entry<K, V>> mo33226B() {
            return new C3945t1(this, this.f6455n);
        }

        @Override // cc.AbstractC3918n0
        /* renamed from: C */
        AbstractC3899l0<K, V> mo33342C() {
            return this.f6454m;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // cc.AbstractC3837d0
        /* renamed from: b */
        public int mo33225b(Object[] objArr, int i) {
            return this.f6455n.mo33225b(objArr, i);
        }

        @Override // cc.AbstractC3837d0, p163j$.util.Collection, p163j$.lang.AbstractC9165a
        public void forEach(Consumer<? super Map.Entry<K, V>> consumer) {
            this.f6455n.forEach(consumer);
        }

        @Override // cc.AbstractC3837d0, java.lang.Iterable
        public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            forEach(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // cc.AbstractC3960w0, cc.AbstractC3837d0
        /* renamed from: j */
        public AbstractC3868g2<Map.Entry<K, V>> iterator() {
            return this.f6455n.iterator();
        }

        @Override // cc.AbstractC3837d0, java.util.Collection, java.lang.Iterable, p163j$.util.Collection, java.util.Set, p163j$.util.Set
        public Spliterator<Map.Entry<K, V>> spliterator() {
            return this.f6455n.spliterator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C3919a(AbstractC3899l0<K, V> l0Var, AbstractC3884i0<Map.Entry<K, V>> i0Var) {
            this.f6454m = l0Var;
            this.f6455n = i0Var;
        }
    }

    /* renamed from: C */
    abstract AbstractC3899l0<K, V> mo33342C();

    @Override // cc.AbstractC3837d0, java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        V v = mo33342C().get(entry.getKey());
        if (v == null || !v.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // cc.AbstractC3960w0, java.util.Collection, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public int hashCode() {
        return mo33342C().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3837d0
    /* renamed from: i */
    public boolean mo33222i() {
        return mo33342C().mo33270n();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
    public int size() {
        return mo33342C().size();
    }

    @Override // cc.AbstractC3960w0
    /* renamed from: w */
    boolean mo33239w() {
        return mo33342C().m33374m();
    }
}
