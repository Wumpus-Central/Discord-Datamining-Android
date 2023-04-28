package p163j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p163j$.util.function.C9289L;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.A */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9233A implements Spliterator.OfLong {

    /* renamed from: a */
    public final /* synthetic */ AbstractC9234B f20256a;

    private /* synthetic */ C9233A(AbstractC9234B b) {
        this.f20256a = b;
    }

    /* renamed from: a */
    public static /* synthetic */ C9233A m16607a(AbstractC9234B b) {
        if (b == null) {
            return null;
        }
        return new C9233A(b);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f20256a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC9234B b = this.f20256a;
        if (obj instanceof C9233A) {
            obj = ((C9233A) obj).f20256a;
        }
        return b.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f20256a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f20256a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f20256a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator.OfLong
    /* renamed from: forEachRemaining  reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        this.f20256a.mo16362a(C9289L.m16542a(longConsumer));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f20256a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f20256a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f20256a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20256a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f20256a.tryAdvance(longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f20256a.tryAdvance(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator.OfLong
    /* renamed from: tryAdvance  reason: avoid collision after fix types in other method */
    public final /* synthetic */ boolean tryAdvance2(LongConsumer longConsumer) {
        return this.f20256a.mo16361b(C9289L.m16542a(longConsumer));
    }
}
