package p163j$.util.concurrent;

import java.util.Comparator;
import p163j$.util.AbstractC0518n;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntConsumer;

/* renamed from: j$.util.concurrent.A */
/* loaded from: classes2.dex */
final class C9252A implements Spliterator.OfInt {

    /* renamed from: a */
    long f20309a;

    /* renamed from: b */
    final long f20310b;

    /* renamed from: c */
    final int f20311c;

    /* renamed from: d */
    final int f20312d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9252A(long j, long j2, int i, int i2) {
        this.f20309a = j;
        this.f20310b = j2;
        this.f20311c = i;
        this.f20312d = i2;
    }

    /* renamed from: c */
    public final C9252A trySplit() {
        long j = this.f20309a;
        long j2 = (this.f20310b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.f20309a = j2;
        return new C9252A(j, j2, this.f20311c, this.f20312d);
    }

    @Override // p163j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // p163j$.util.Spliterator
    public final long estimateSize() {
        return this.f20310b - this.f20309a;
    }

    @Override // p163j$.util.Spliterator.OfInt, p163j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0518n.m16488d(this, consumer);
    }

    @Override // p163j$.util.Spliterator.OfInt
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j = this.f20309a;
        long j2 = this.f20310b;
        if (j < j2) {
            this.f20309a = j2;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                intConsumer.accept(current.m16577d(this.f20311c, this.f20312d));
                j++;
            } while (j < j2);
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

    @Override // p163j$.util.Spliterator.OfInt, p163j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0518n.m16485i(this, consumer);
    }

    @Override // p163j$.util.Spliterator.OfInt
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j = this.f20309a;
        if (j >= this.f20310b) {
            return false;
        }
        intConsumer.accept(ThreadLocalRandom.current().m16577d(this.f20311c, this.f20312d));
        this.f20309a = j + 1;
        return true;
    }
}
