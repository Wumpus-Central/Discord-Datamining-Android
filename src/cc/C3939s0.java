package cc;

import java.util.Map;
import p030bc.C3457i;
import p163j$.util.Map;
import p163j$.util.Spliterator;
import p163j$.util.function.BiConsumer;
import p163j$.util.function.Consumer;
import p163j$.util.function.Function;

/* renamed from: cc.s0 */
/* loaded from: classes3.dex */
final class C3939s0<K, V> extends AbstractC3837d0<V> {

    /* renamed from: l */
    private final AbstractC3899l0<K, V> f6480l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cc.s0$a */
    /* loaded from: classes3.dex */
    public class C3940a extends AbstractC3868g2<V> {

        /* renamed from: k */
        final AbstractC3868g2<Map.Entry<K, V>> f6481k;

        C3940a() {
            this.f6481k = C3939s0.this.f6480l.entrySet().iterator();
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            return this.f6481k.hasNext();
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public V next() {
            return this.f6481k.next().getValue();
        }
    }

    /* renamed from: cc.s0$b */
    /* loaded from: classes3.dex */
    class C3941b extends AbstractC3817a0<V> {

        /* renamed from: l */
        final /* synthetic */ AbstractC3884i0 f6483l;

        C3941b(AbstractC3884i0 i0Var) {
            this.f6483l = i0Var;
        }

        @Override // cc.AbstractC3817a0
        /* renamed from: E */
        AbstractC3837d0<V> mo33223E() {
            return C3939s0.this;
        }

        @Override // java.util.List, p163j$.util.List
        public V get(int i) {
            return (V) ((Map.Entry) this.f6483l.get(i)).getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3939s0(AbstractC3899l0<K, V> l0Var) {
        this.f6480l = l0Var;
    }

    @Override // cc.AbstractC3837d0
    /* renamed from: a */
    public AbstractC3884i0<V> mo33253a() {
        return new C3941b(this.f6480l.entrySet().mo33253a());
    }

    @Override // cc.AbstractC3837d0, java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
    public boolean contains(Object obj) {
        return obj != null && C3818a1.m33535c(iterator(), obj);
    }

    @Override // cc.AbstractC3837d0, p163j$.util.Collection, p163j$.lang.AbstractC9165a
    public void forEach(final Consumer<? super V> consumer) {
        C3457i.m34352i(consumer);
        Map.EL.forEach(this.f6480l, new BiConsumer() { // from class: cc.r0
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

    @Override // cc.AbstractC3837d0, java.lang.Iterable
    public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
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
        return new C3940a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
    public int size() {
        return this.f6480l.size();
    }

    @Override // cc.AbstractC3837d0, java.util.Collection, java.lang.Iterable, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public Spliterator<V> spliterator() {
        return C3924p.m33336d(this.f6480l.entrySet().spliterator(), new Function() { // from class: cc.q0
            @Override // p163j$.util.function.Function
            public /* synthetic */ Function andThen(Function function) {
                return function.getClass();
            }

            @Override // p163j$.util.function.Function
            public final Object apply(Object obj) {
                return ((Map.Entry) obj).getValue();
            }

            @Override // p163j$.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return function.getClass();
            }
        });
    }
}
