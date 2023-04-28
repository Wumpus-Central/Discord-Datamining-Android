package cc;

import java.util.Iterator;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

/* renamed from: cc.g2 */
/* loaded from: classes3.dex */
public abstract class AbstractC3868g2<E> implements Iterator<E>, p163j$.util.Iterator {
    @Override // p163j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
