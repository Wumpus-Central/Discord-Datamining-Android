package p163j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p163j$.util.function.AbstractC0494i;
import p163j$.util.function.C0493h;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.o */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0519o implements PrimitiveIterator.OfDouble {

    /* renamed from: a */
    public final /* synthetic */ AbstractC0520p f20440a;

    private /* synthetic */ C0519o(AbstractC0520p pVar) {
        this.f20440a = pVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C0519o m16481a(AbstractC0520p pVar) {
        return new C0519o(pVar);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC0520p pVar = this.f20440a;
        if (obj instanceof C0519o) {
            obj = ((C0519o) obj).f20440a;
        }
        return pVar.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        C9240H h = (C9240H) this.f20440a;
        h.getClass();
        h.m16596a((AbstractC0494i) doubleConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        ((C9240H) this.f20440a).forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    /* renamed from: forEachRemaining  reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        ((C9240H) this.f20440a).m16596a(C0493h.m16524a(doubleConsumer));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return ((C9240H) this.f20440a).hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f20440a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final Double next() {
        C9240H h = (C9240H) this.f20440a;
        h.getClass();
        if (!AbstractC9251T.f20302a) {
            return Double.valueOf(h.nextDouble());
        }
        AbstractC9251T.m16583a(C9240H.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
        throw null;
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    public final /* synthetic */ double nextDouble() {
        return ((C9240H) this.f20440a).nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        ((C9240H) this.f20440a).remove();
        throw null;
    }
}
