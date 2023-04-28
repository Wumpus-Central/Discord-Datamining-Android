package p163j$.util;

import java.util.NoSuchElementException;
import p163j$.util.function.AbstractC9290M;
import p163j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.G */
/* loaded from: classes2.dex */
public final class C9239G implements AbstractC9444v, AbstractC9290M, Iterator {

    /* renamed from: a */
    boolean f20270a = false;

    /* renamed from: b */
    long f20271b;

    /* renamed from: c */
    final /* synthetic */ AbstractC9234B f20272c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9239G(AbstractC9234B b) {
        this.f20272c = b;
    }

    /* renamed from: a */
    public final void m16597a(AbstractC9290M m) {
        m.getClass();
        while (hasNext()) {
            m.accept(nextLong());
        }
    }

    @Override // p163j$.util.function.AbstractC9290M
    public final void accept(long j) {
        this.f20270a = true;
        this.f20271b = j;
    }

    @Override // p163j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof AbstractC9290M) {
            m16597a((AbstractC9290M) consumer);
            return;
        }
        consumer.getClass();
        if (!AbstractC9251T.f20302a) {
            m16597a(new C0633t(consumer));
        } else {
            AbstractC9251T.m16583a(C9239G.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final boolean hasNext() {
        if (!this.f20270a) {
            this.f20272c.mo16361b(this);
        }
        return this.f20270a;
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final Object next() {
        if (!AbstractC9251T.f20302a) {
            return Long.valueOf(nextLong());
        }
        AbstractC9251T.m16583a(C9239G.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
        throw null;
    }

    public final long nextLong() {
        if (this.f20270a || hasNext()) {
            this.f20270a = false;
            return this.f20271b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
