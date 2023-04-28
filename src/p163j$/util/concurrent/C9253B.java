package p163j$.util.concurrent;

import java.util.Comparator;
import p163j$.util.AbstractC0518n;
import p163j$.util.AbstractC9234B;
import p163j$.util.Spliterator;
import p163j$.util.function.AbstractC9290M;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.concurrent.B */
/* loaded from: classes2.dex */
final class C9253B implements AbstractC9234B {

    /* renamed from: a */
    long f20313a;

    /* renamed from: b */
    final long f20314b;

    /* renamed from: c */
    final long f20315c;

    /* renamed from: d */
    final long f20316d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9253B(long j, long j2, long j3, long j4) {
        this.f20313a = j;
        this.f20314b = j2;
        this.f20315c = j3;
        this.f20316d = j4;
    }

    @Override // p163j$.util.AbstractC9234B
    /* renamed from: a */
    public final void forEachRemaining(AbstractC9290M m) {
        m.getClass();
        long j = this.f20313a;
        long j2 = this.f20314b;
        if (j < j2) {
            this.f20313a = j2;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                m.accept(current.m16576e(this.f20315c, this.f20316d));
                j++;
            } while (j < j2);
        }
    }

    @Override // p163j$.util.AbstractC9234B
    /* renamed from: b */
    public final boolean tryAdvance(AbstractC9290M m) {
        m.getClass();
        long j = this.f20313a;
        if (j >= this.f20314b) {
            return false;
        }
        m.accept(ThreadLocalRandom.current().m16576e(this.f20315c, this.f20316d));
        this.f20313a = j + 1;
        return true;
    }

    /* renamed from: c */
    public final C9253B trySplit() {
        long j = this.f20313a;
        long j2 = (this.f20314b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.f20313a = j2;
        return new C9253B(j, j2, this.f20315c, this.f20316d);
    }

    @Override // p163j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // p163j$.util.Spliterator
    public final long estimateSize() {
        return this.f20314b - this.f20313a;
    }

    @Override // p163j$.util.AbstractC9234B, p163j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0518n.m16487e(this, consumer);
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

    @Override // p163j$.util.AbstractC9234B, p163j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0518n.m16484j(this, consumer);
    }
}
