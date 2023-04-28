package cc;

import cc.AbstractC3960w0;
import p030bc.C3457i;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cc.y0 */
/* loaded from: classes3.dex */
public abstract class AbstractC3972y0<E> extends AbstractC3960w0.AbstractC3961a<E> {

    /* renamed from: cc.y0$a */
    /* loaded from: classes3.dex */
    class C3973a extends AbstractC3817a0<E> {
        C3973a() {
        }

        @Override // cc.AbstractC3817a0
        /* renamed from: E */
        AbstractC3837d0<E> mo33223E() {
            return AbstractC3972y0.this;
        }

        @Override // java.util.List, p163j$.util.List
        public E get(int i) {
            return (E) AbstractC3972y0.this.get(i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // cc.AbstractC3817a0, cc.AbstractC3837d0
        /* renamed from: i */
        public boolean mo33222i() {
            return AbstractC3972y0.this.mo33222i();
        }

        @Override // cc.AbstractC3817a0, java.util.AbstractCollection, java.util.Collection, p163j$.util.Collection, java.util.List, p163j$.util.List
        public int size() {
            return AbstractC3972y0.this.size();
        }
    }

    @Override // cc.AbstractC3960w0.AbstractC3961a
    /* renamed from: B */
    AbstractC3884i0<E> mo33226B() {
        return new C3973a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // cc.AbstractC3837d0
    /* renamed from: b */
    public int mo33225b(Object[] objArr, int i) {
        return mo33253a().mo33225b(objArr, i);
    }

    @Override // cc.AbstractC3837d0, p163j$.util.Collection, p163j$.lang.AbstractC9165a
    public void forEach(Consumer<? super E> consumer) {
        C3457i.m34352i(consumer);
        int size = size();
        for (int i = 0; i < size; i++) {
            consumer.accept(get(i));
        }
    }

    @Override // cc.AbstractC3837d0, java.lang.Iterable
    public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract E get(int i);

    @Override // cc.AbstractC3960w0, cc.AbstractC3837d0
    /* renamed from: j */
    public AbstractC3868g2<E> iterator() {
        return mo33253a().iterator();
    }

    @Override // cc.AbstractC3837d0, java.util.Collection, java.lang.Iterable, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public Spliterator<E> spliterator() {
        return C3924p.m33338b(size(), 1297, new IntFunction() { // from class: cc.x0
            @Override // p163j$.util.function.IntFunction
            public final Object apply(int i) {
                return AbstractC3972y0.this.get(i);
            }
        });
    }
}
