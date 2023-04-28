package p163j$.util.concurrent;

import java.util.Comparator;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.g */
/* loaded from: classes2.dex */
public final class C9258g extends C9268q implements Spliterator {

    /* renamed from: i */
    final ConcurrentHashMap f20327i;

    /* renamed from: j */
    long f20328j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9258g(C9264m[] mVarArr, int i, int i2, int i3, long j, ConcurrentHashMap concurrentHashMap) {
        super(mVarArr, i, i2, i3);
        this.f20327i = concurrentHashMap;
        this.f20328j = j;
    }

    @Override // p163j$.util.Spliterator
    public final int characteristics() {
        return 4353;
    }

    @Override // p163j$.util.Spliterator
    public final long estimateSize() {
        return this.f20328j;
    }

    @Override // p163j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            C9264m c = m16570c();
            if (c != null) {
                consumer.accept(new C9263l(c.f20337b, c.f20338c, this.f20327i));
            } else {
                return;
            }
        }
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
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
        C9264m c = m16570c();
        if (c == null) {
            return false;
        }
        consumer.accept(new C9263l(c.f20337b, c.f20338c, this.f20327i));
        return true;
    }

    @Override // p163j$.util.Spliterator
    public final Spliterator trySplit() {
        int i = this.f20349f;
        int i2 = this.f20350g;
        int i3 = (i + i2) >>> 1;
        if (i3 <= i) {
            return null;
        }
        C9264m[] mVarArr = this.f20344a;
        int i4 = this.f20351h;
        this.f20350g = i3;
        long j = this.f20328j >>> 1;
        this.f20328j = j;
        return new C9258g(mVarArr, i4, i3, i2, j, this.f20327i);
    }
}
