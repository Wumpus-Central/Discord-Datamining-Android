package p163j$.util.stream;

import java.util.Comparator;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.p3 */
/* loaded from: classes2.dex */
final class C9431p3 extends AbstractC9432q3 implements Spliterator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C9431p3(Spliterator spliterator, long j, long j2) {
        super(spliterator, j, j2, 0L, Math.min(spliterator.estimateSize(), j2));
    }

    private C9431p3(Spliterator spliterator, long j, long j2, long j3, long j4) {
        super(spliterator, j, j2, j3, j4);
    }

    @Override // p163j$.util.stream.AbstractC9432q3
    /* renamed from: c */
    protected final Spliterator mo16306c(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new C9431p3(spliterator, j, j2, j3, j4);
    }

    @Override // p163j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        long j = this.f20736e;
        long j2 = this.f20732a;
        if (j2 < j) {
            long j3 = this.f20735d;
            if (j3 < j) {
                if (j3 < j2 || this.f20734c.estimateSize() + j3 > this.f20733b) {
                    while (j2 > this.f20735d) {
                        this.f20734c.tryAdvance(new C9353I0(10));
                        this.f20735d++;
                    }
                    while (this.f20735d < this.f20736e) {
                        this.f20734c.tryAdvance(consumer);
                        this.f20735d++;
                    }
                    return;
                }
                this.f20734c.forEachRemaining(consumer);
                this.f20735d = this.f20736e;
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
        long j;
        consumer.getClass();
        long j2 = this.f20736e;
        long j3 = this.f20732a;
        if (j3 >= j2) {
            return false;
        }
        while (true) {
            j = this.f20735d;
            if (j3 <= j) {
                break;
            }
            this.f20734c.tryAdvance(new C9353I0(11));
            this.f20735d++;
        }
        if (j >= this.f20736e) {
            return false;
        }
        this.f20735d = j + 1;
        return this.f20734c.tryAdvance(consumer);
    }
}
