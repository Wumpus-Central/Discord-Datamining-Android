package p163j$.util.concurrent;

import java.util.Comparator;
import p163j$.util.AbstractC0518n;
import p163j$.util.AbstractC9447y;
import p163j$.util.Spliterator;
import p163j$.util.function.AbstractC0494i;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.concurrent.z */
/* loaded from: classes2.dex */
final class C9277z implements AbstractC9447y {

    /* renamed from: a */
    long f20366a;

    /* renamed from: b */
    final long f20367b;

    /* renamed from: c */
    final double f20368c;

    /* renamed from: d */
    final double f20369d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9277z(long j, long j2, double d, double d2) {
        this.f20366a = j;
        this.f20367b = j2;
        this.f20368c = d;
        this.f20369d = d2;
    }

    /* renamed from: c */
    public final C9277z trySplit() {
        long j = this.f20366a;
        long j2 = (this.f20367b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.f20366a = j2;
        return new C9277z(j, j2, this.f20368c, this.f20369d);
    }

    @Override // p163j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // p163j$.util.Spliterator
    public final long estimateSize() {
        return this.f20367b - this.f20366a;
    }

    @Override // p163j$.util.AbstractC9447y
    /* renamed from: f */
    public final boolean tryAdvance(AbstractC0494i iVar) {
        iVar.getClass();
        long j = this.f20366a;
        if (j >= this.f20367b) {
            return false;
        }
        iVar.accept(ThreadLocalRandom.current().m16578c(this.f20368c, this.f20369d));
        this.f20366a = j + 1;
        return true;
    }

    @Override // p163j$.util.AbstractC9447y, p163j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0518n.m16489c(this, consumer);
    }

    @Override // p163j$.util.AbstractC9447y
    /* renamed from: g */
    public final void forEachRemaining(AbstractC0494i iVar) {
        iVar.getClass();
        long j = this.f20366a;
        long j2 = this.f20367b;
        if (j < j2) {
            this.f20366a = j2;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                iVar.accept(current.m16578c(this.f20368c, this.f20369d));
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

    @Override // p163j$.util.AbstractC9447y, p163j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0518n.m16486h(this, consumer);
    }
}
