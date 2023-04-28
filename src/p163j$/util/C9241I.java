package p163j$.util;

import java.util.Comparator;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.I */
/* loaded from: classes2.dex */
final class C9241I implements Spliterator {

    /* renamed from: a */
    private final Object[] f20276a;

    /* renamed from: b */
    private int f20277b;

    /* renamed from: c */
    private final int f20278c;

    /* renamed from: d */
    private final int f20279d;

    public C9241I(Object[] objArr, int i, int i2, int i3) {
        this.f20276a = objArr;
        this.f20277b = i;
        this.f20278c = i2;
        this.f20279d = i3 | 64 | Spliterator.SUBSIZED;
    }

    @Override // p163j$.util.Spliterator
    public final int characteristics() {
        return this.f20279d;
    }

    @Override // p163j$.util.Spliterator
    public final long estimateSize() {
        return this.f20278c - this.f20277b;
    }

    @Override // p163j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        int i;
        consumer.getClass();
        Object[] objArr = this.f20276a;
        int length = objArr.length;
        int i2 = this.f20278c;
        if (length >= i2 && (i = this.f20277b) >= 0) {
            this.f20277b = i2;
            if (i < i2) {
                do {
                    consumer.accept(objArr[i]);
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

    @Override // p163j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i = this.f20277b;
        if (i < 0 || i >= this.f20278c) {
            return false;
        }
        this.f20277b = i + 1;
        consumer.accept(this.f20276a[i]);
        return true;
    }

    @Override // p163j$.util.Spliterator
    public final Spliterator trySplit() {
        int i = this.f20277b;
        int i2 = (this.f20278c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f20277b = i2;
        return new C9241I(this.f20276a, i, i2, this.f20279d);
    }
}
