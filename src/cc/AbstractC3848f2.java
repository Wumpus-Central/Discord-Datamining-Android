package cc;

import java.util.Iterator;
import p030bc.C3457i;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cc.f2 */
/* loaded from: classes3.dex */
public abstract class AbstractC3848f2<F, T> implements Iterator<T>, p163j$.util.Iterator {

    /* renamed from: k */
    final Iterator<? extends F> f6372k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3848f2(Iterator<? extends F> it) {
        this.f6372k = (Iterator) C3457i.m34352i(it);
    }

    /* renamed from: b */
    abstract T mo33423b(F f);

    @Override // p163j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final boolean hasNext() {
        return this.f6372k.hasNext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator, p163j$.util.Iterator
    public final T next() {
        return (T) mo33423b(this.f6372k.next());
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final void remove() {
        this.f6372k.remove();
    }
}
