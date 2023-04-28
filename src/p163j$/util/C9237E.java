package p163j$.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.E */
/* loaded from: classes2.dex */
final class C9237E implements Iterator, Consumer {

    /* renamed from: a */
    boolean f20264a = false;

    /* renamed from: b */
    Object f20265b;

    /* renamed from: c */
    final /* synthetic */ Spliterator f20266c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9237E(Spliterator spliterator) {
        this.f20266c = spliterator;
    }

    @Override // p163j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f20264a = true;
        this.f20265b = obj;
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return consumer.getClass();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f20264a) {
            this.f20266c.tryAdvance(this);
        }
        return this.f20264a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f20264a || hasNext()) {
            this.f20264a = false;
            return this.f20265b;
        }
        throw new NoSuchElementException();
    }
}
