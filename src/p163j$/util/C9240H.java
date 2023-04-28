package p163j$.util;

import java.util.NoSuchElementException;
import p163j$.util.function.AbstractC0494i;
import p163j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.H */
/* loaded from: classes2.dex */
public final class C9240H implements AbstractC0520p, AbstractC0494i, Iterator {

    /* renamed from: a */
    boolean f20273a = false;

    /* renamed from: b */
    double f20274b;

    /* renamed from: c */
    final /* synthetic */ AbstractC9447y f20275c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9240H(AbstractC9447y yVar) {
        this.f20275c = yVar;
    }

    /* renamed from: a */
    public final void m16596a(AbstractC0494i iVar) {
        iVar.getClass();
        while (hasNext()) {
            iVar.accept(nextDouble());
        }
    }

    @Override // p163j$.util.function.AbstractC0494i
    public final void accept(double d) {
        this.f20273a = true;
        this.f20274b = d;
    }

    @Override // p163j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof AbstractC0494i) {
            m16596a((AbstractC0494i) consumer);
            return;
        }
        consumer.getClass();
        if (!AbstractC9251T.f20302a) {
            m16596a(new C0517m(consumer));
        } else {
            AbstractC9251T.m16583a(C9240H.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final boolean hasNext() {
        if (!this.f20273a) {
            this.f20275c.mo16225f(this);
        }
        return this.f20273a;
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final Object next() {
        if (!AbstractC9251T.f20302a) {
            return Double.valueOf(nextDouble());
        }
        AbstractC9251T.m16583a(C9240H.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
        throw null;
    }

    public final double nextDouble() {
        if (this.f20273a || hasNext()) {
            this.f20273a = false;
            return this.f20274b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
