package p163j$.util.stream;

import java.util.Comparator;
import p163j$.util.AbstractC0518n;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.C3 */
/* loaded from: classes2.dex */
public final class C9327C3 implements Spliterator.OfInt {

    /* renamed from: a */
    private int f20460a;

    /* renamed from: b */
    private final int f20461b;

    /* renamed from: c */
    private int f20462c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9327C3(int i, int i2) {
        this(i, i2, 0);
    }

    private C9327C3(int i, int i2, int i3) {
        this.f20460a = i;
        this.f20461b = i2;
        this.f20462c = 0;
    }

    @Override // p163j$.util.Spliterator
    public final int characteristics() {
        return 17749;
    }

    @Override // p163j$.util.Spliterator
    public final long estimateSize() {
        return (this.f20461b - this.f20460a) + this.f20462c;
    }

    @Override // p163j$.util.Spliterator.OfInt, p163j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0518n.m16488d(this, consumer);
    }

    @Override // p163j$.util.Spliterator.OfInt
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i = this.f20460a;
        int i2 = this.f20462c;
        int i3 = this.f20461b;
        this.f20460a = i3;
        this.f20462c = 0;
        while (i < i3) {
            i++;
            intConsumer.accept(i);
        }
        if (i2 > 0) {
            intConsumer.accept(i);
        }
    }

    @Override // p163j$.util.Spliterator
    public final Comparator getComparator() {
        return null;
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // p163j$.util.Spliterator.OfInt, p163j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0518n.m16485i(this, consumer);
    }

    @Override // p163j$.util.Spliterator.OfInt
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i = this.f20460a;
        if (i < this.f20461b) {
            this.f20460a = i + 1;
        } else if (this.f20462c <= 0) {
            return false;
        } else {
            this.f20462c = 0;
        }
        intConsumer.accept(i);
        return true;
    }

    @Override // p163j$.util.Spliterator.OfInt, p163j$.util.AbstractC9236D, p163j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        long estimateSize = estimateSize();
        if (estimateSize <= 1) {
            return null;
        }
        int i = this.f20460a;
        int i2 = ((int) (estimateSize / (estimateSize < 16777216 ? 2 : 8))) + i;
        this.f20460a = i2;
        return new C9327C3(i, i2, 0);
    }
}
