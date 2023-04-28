package p163j$.util;

import java.util.Comparator;
import p163j$.util.Spliterator;
import p163j$.util.function.AbstractC9290M;
import p163j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.Q */
/* loaded from: classes2.dex */
public final class C9249Q implements AbstractC9234B {

    /* renamed from: a */
    private final long[] f20293a;

    /* renamed from: b */
    private int f20294b;

    /* renamed from: c */
    private final int f20295c;

    /* renamed from: d */
    private final int f20296d;

    public C9249Q(long[] jArr, int i, int i2, int i3) {
        this.f20293a = jArr;
        this.f20294b = i;
        this.f20295c = i2;
        this.f20296d = i3 | 64 | Spliterator.SUBSIZED;
    }

    @Override // p163j$.util.AbstractC9234B
    /* renamed from: a */
    public final void forEachRemaining(AbstractC9290M m) {
        int i;
        m.getClass();
        long[] jArr = this.f20293a;
        int length = jArr.length;
        int i2 = this.f20295c;
        if (length >= i2 && (i = this.f20294b) >= 0) {
            this.f20294b = i2;
            if (i < i2) {
                do {
                    m.accept(jArr[i]);
                    i++;
                } while (i < i2);
            }
        }
    }

    @Override // p163j$.util.AbstractC9234B
    /* renamed from: b */
    public final boolean tryAdvance(AbstractC9290M m) {
        m.getClass();
        int i = this.f20294b;
        if (i < 0 || i >= this.f20295c) {
            return false;
        }
        this.f20294b = i + 1;
        m.accept(this.f20293a[i]);
        return true;
    }

    @Override // p163j$.util.Spliterator
    public final int characteristics() {
        return this.f20296d;
    }

    @Override // p163j$.util.Spliterator
    public final long estimateSize() {
        return this.f20295c - this.f20294b;
    }

    @Override // p163j$.util.AbstractC9234B, p163j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0518n.m16487e(this, consumer);
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

    @Override // p163j$.util.AbstractC9234B, p163j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0518n.m16484j(this, consumer);
    }

    @Override // p163j$.util.AbstractC9234B, p163j$.util.AbstractC9236D, p163j$.util.Spliterator
    public final AbstractC9234B trySplit() {
        int i = this.f20294b;
        int i2 = (this.f20295c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f20294b = i2;
        return new C9249Q(this.f20293a, i, i2, this.f20296d);
    }
}
