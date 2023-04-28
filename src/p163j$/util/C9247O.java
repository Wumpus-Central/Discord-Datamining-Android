package p163j$.util;

import java.util.Comparator;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.O */
/* loaded from: classes2.dex */
public final class C9247O implements Spliterator.OfInt {

    /* renamed from: a */
    private final int[] f20284a;

    /* renamed from: b */
    private int f20285b;

    /* renamed from: c */
    private final int f20286c;

    /* renamed from: d */
    private final int f20287d;

    public C9247O(int[] iArr, int i, int i2, int i3) {
        this.f20284a = iArr;
        this.f20285b = i;
        this.f20286c = i2;
        this.f20287d = i3 | 64 | Spliterator.SUBSIZED;
    }

    @Override // p163j$.util.Spliterator
    public final int characteristics() {
        return this.f20287d;
    }

    @Override // p163j$.util.Spliterator
    public final long estimateSize() {
        return this.f20286c - this.f20285b;
    }

    @Override // p163j$.util.Spliterator.OfInt, p163j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0518n.m16488d(this, consumer);
    }

    @Override // p163j$.util.Spliterator.OfInt
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i;
        intConsumer.getClass();
        int[] iArr = this.f20284a;
        int length = iArr.length;
        int i2 = this.f20286c;
        if (length >= i2 && (i = this.f20285b) >= 0) {
            this.f20285b = i2;
            if (i < i2) {
                do {
                    intConsumer.accept(iArr[i]);
                    i++;
                } while (i < i2);
            }
        }
    }

    @Override // p163j$.util.Spliterator
    public final Comparator getComparator() {
        if (Spliterator.CC.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
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
        int i = this.f20285b;
        if (i < 0 || i >= this.f20286c) {
            return false;
        }
        this.f20285b = i + 1;
        intConsumer.accept(this.f20284a[i]);
        return true;
    }

    @Override // p163j$.util.Spliterator.OfInt, p163j$.util.AbstractC9236D, p163j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        int i = this.f20285b;
        int i2 = (this.f20286c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f20285b = i2;
        return new C9247O(this.f20284a, i, i2, this.f20287d);
    }
}
