package cc;

import p030bc.C3457i;
import p163j$.util.Map;
import p163j$.util.Spliterator;
import p163j$.util.function.BiConsumer;
import p163j$.util.function.Consumer;

/* renamed from: cc.p0 */
/* loaded from: classes3.dex */
final class C3930p0<K, V> extends AbstractC3972y0<K> {

    /* renamed from: m */
    private final AbstractC3899l0<K, V> f6472m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3930p0(AbstractC3899l0<K, V> l0Var) {
        this.f6472m = l0Var;
    }

    @Override // cc.AbstractC3837d0, java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
    public boolean contains(Object obj) {
        return this.f6472m.containsKey(obj);
    }

    @Override // cc.AbstractC3972y0, cc.AbstractC3837d0, p163j$.util.Collection, p163j$.lang.AbstractC9165a
    public void forEach(final Consumer<? super K> consumer) {
        C3457i.m34352i(consumer);
        Map.EL.forEach(this.f6472m, new BiConsumer() { // from class: cc.o0
            @Override // p163j$.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Consumer.this.accept(obj);
            }

            @Override // p163j$.util.function.BiConsumer
            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return biConsumer.getClass();
            }
        });
    }

    @Override // cc.AbstractC3972y0, cc.AbstractC3837d0, java.lang.Iterable
    public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // cc.AbstractC3972y0
    K get(int i) {
        return this.f6472m.entrySet().mo33253a().get(i).getKey();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3837d0
    /* renamed from: i */
    public boolean mo33222i() {
        return true;
    }

    @Override // cc.AbstractC3972y0, cc.AbstractC3960w0, cc.AbstractC3837d0
    /* renamed from: j */
    public AbstractC3868g2<K> iterator() {
        return this.f6472m.mo33373o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
    public int size() {
        return this.f6472m.size();
    }

    @Override // cc.AbstractC3972y0, cc.AbstractC3837d0, java.util.Collection, java.lang.Iterable, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public Spliterator<K> spliterator() {
        return this.f6472m.mo33371q();
    }
}
