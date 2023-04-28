package sa;

import java.util.Iterator;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

/* renamed from: sa.i */
/* loaded from: classes3.dex */
public abstract class AbstractC12842i implements Iterator, p163j$.util.Iterator {
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
