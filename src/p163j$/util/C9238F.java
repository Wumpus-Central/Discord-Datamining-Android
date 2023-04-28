package p163j$.util;

import java.util.NoSuchElementException;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.F */
/* loaded from: classes2.dex */
public final class C9238F implements AbstractC0522s, IntConsumer, Iterator {

    /* renamed from: a */
    boolean f20267a = false;

    /* renamed from: b */
    int f20268b;

    /* renamed from: c */
    final /* synthetic */ Spliterator.OfInt f20269c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9238F(Spliterator.OfInt ofInt) {
        this.f20269c = ofInt;
    }

    /* renamed from: a */
    public final void m16598a(IntConsumer intConsumer) {
        intConsumer.getClass();
        while (hasNext()) {
            intConsumer.accept(nextInt());
        }
    }

    @Override // p163j$.util.function.IntConsumer
    public final void accept(int i) {
        this.f20267a = true;
        this.f20268b = i;
    }

    @Override // p163j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return intConsumer.getClass();
    }

    @Override // p163j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            m16598a((IntConsumer) consumer);
            return;
        }
        consumer.getClass();
        if (!AbstractC9251T.f20302a) {
            m16598a(new C0521q(consumer));
        } else {
            AbstractC9251T.m16583a(C9238F.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final boolean hasNext() {
        if (!this.f20267a) {
            this.f20269c.tryAdvance((IntConsumer) this);
        }
        return this.f20267a;
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final Object next() {
        if (!AbstractC9251T.f20302a) {
            return Integer.valueOf(nextInt());
        }
        AbstractC9251T.m16583a(C9238F.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
        throw null;
    }

    public final int nextInt() {
        if (this.f20267a || hasNext()) {
            this.f20267a = false;
            return this.f20268b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
