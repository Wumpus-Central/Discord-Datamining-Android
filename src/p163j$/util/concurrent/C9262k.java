package p163j$.util.concurrent;

import java.util.Comparator;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.concurrent.k */
/* loaded from: classes2.dex */
final class C9262k extends C9268q implements Spliterator {

    /* renamed from: i */
    public final /* synthetic */ int f20331i;

    /* renamed from: j */
    long f20332j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9262k(C9264m[] mVarArr, int i, int i2, int i3, long j, int i4) {
        super(mVarArr, i, i2, i3);
        this.f20331i = i4;
        this.f20332j = j;
    }

    @Override // p163j$.util.Spliterator
    public final int characteristics() {
        switch (this.f20331i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // p163j$.util.Spliterator
    public final long estimateSize() {
        switch (this.f20331i) {
            case 0:
                return this.f20332j;
            default:
                return this.f20332j;
        }
    }

    @Override // p163j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f20331i) {
            case 0:
                consumer.getClass();
                while (true) {
                    C9264m c = m16570c();
                    if (c != null) {
                        consumer.accept(c.f20337b);
                    } else {
                        return;
                    }
                }
            default:
                consumer.getClass();
                while (true) {
                    C9264m c2 = m16570c();
                    if (c2 != null) {
                        consumer.accept(c2.f20338c);
                    } else {
                        return;
                    }
                }
        }
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        switch (this.f20331i) {
            case 0:
                return Spliterator.CC.$default$getComparator(this);
            default:
                return Spliterator.CC.$default$getComparator(this);
        }
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f20331i) {
            case 0:
                return Spliterator.CC.$default$getExactSizeIfKnown(this);
            default:
                return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        switch (this.f20331i) {
            case 0:
                return Spliterator.CC.$default$hasCharacteristics(this, i);
            default:
                return Spliterator.CC.$default$hasCharacteristics(this, i);
        }
    }

    @Override // p163j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.f20331i) {
            case 0:
                consumer.getClass();
                C9264m c = m16570c();
                if (c == null) {
                    return false;
                }
                consumer.accept(c.f20337b);
                return true;
            default:
                consumer.getClass();
                C9264m c2 = m16570c();
                if (c2 == null) {
                    return false;
                }
                consumer.accept(c2.f20338c);
                return true;
        }
    }

    @Override // p163j$.util.Spliterator
    public final Spliterator trySplit() {
        switch (this.f20331i) {
            case 0:
                int i = this.f20349f;
                int i2 = this.f20350g;
                int i3 = (i + i2) >>> 1;
                if (i3 <= i) {
                    return null;
                }
                C9264m[] mVarArr = this.f20344a;
                int i4 = this.f20351h;
                this.f20350g = i3;
                long j = this.f20332j >>> 1;
                this.f20332j = j;
                return new C9262k(mVarArr, i4, i3, i2, j, 0);
            default:
                int i5 = this.f20349f;
                int i6 = this.f20350g;
                int i7 = (i5 + i6) >>> 1;
                if (i7 <= i5) {
                    return null;
                }
                C9264m[] mVarArr2 = this.f20344a;
                int i8 = this.f20351h;
                this.f20350g = i7;
                long j2 = this.f20332j >>> 1;
                this.f20332j = j2;
                return new C9262k(mVarArr2, i8, i7, i6, j2, 1);
        }
    }
}
