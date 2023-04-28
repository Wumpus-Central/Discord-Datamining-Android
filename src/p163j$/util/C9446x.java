package p163j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p163j$.util.function.C0493h;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.x */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9446x implements Spliterator.OfDouble {

    /* renamed from: a */
    public final /* synthetic */ AbstractC9447y f20802a;

    private /* synthetic */ C9446x(AbstractC9447y yVar) {
        this.f20802a = yVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C9446x m16226a(AbstractC9447y yVar) {
        if (yVar == null) {
            return null;
        }
        return new C9446x(yVar);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f20802a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC9447y yVar = this.f20802a;
        if (obj instanceof C9446x) {
            obj = ((C9446x) obj).f20802a;
        }
        return yVar.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f20802a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f20802a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f20802a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator.OfDouble
    /* renamed from: forEachRemaining  reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.f20802a.mo16224g(C0493h.m16524a(doubleConsumer));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f20802a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f20802a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f20802a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20802a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f20802a.tryAdvance(doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f20802a.tryAdvance(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator.OfDouble
    /* renamed from: tryAdvance  reason: avoid collision after fix types in other method */
    public final /* synthetic */ boolean tryAdvance2(DoubleConsumer doubleConsumer) {
        return this.f20802a.mo16225f(C0493h.m16524a(doubleConsumer));
    }
}
