package p163j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.C */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9235C implements Spliterator.OfPrimitive {

    /* renamed from: a */
    public final /* synthetic */ AbstractC9236D f20257a;

    private /* synthetic */ C9235C(AbstractC9236D d) {
        this.f20257a = d;
    }

    /* renamed from: a */
    public static /* synthetic */ Spliterator.OfPrimitive m16606a(AbstractC9236D d) {
        if (d == null) {
            return null;
        }
        return d instanceof AbstractC9447y ? C9446x.m16226a((AbstractC9447y) d) : d instanceof Spliterator.OfInt ? C9448z.m16223a((Spliterator.OfInt) d) : d instanceof AbstractC9234B ? C9233A.m16607a((AbstractC9234B) d) : new C9235C(d);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f20257a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC9236D d = this.f20257a;
        if (obj instanceof C9235C) {
            obj = ((C9235C) obj).f20257a;
        }
        return d.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f20257a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f20257a.forEachRemaining(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f20257a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f20257a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f20257a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f20257a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20257a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f20257a.tryAdvance(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f20257a.tryAdvance(Consumer.VivifiedWrapper.convert(consumer));
    }
}
