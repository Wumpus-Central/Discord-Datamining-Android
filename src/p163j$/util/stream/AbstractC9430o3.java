package p163j$.util.stream;

import java.util.Comparator;
import p163j$.util.AbstractC9236D;
import p163j$.util.Spliterator;
import p163j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.o3 */
/* loaded from: classes2.dex */
abstract class AbstractC9430o3 extends AbstractC9432q3 implements AbstractC9236D {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9430o3(AbstractC9236D d, long j, long j2) {
        super(d, j, j2, 0L, Math.min(d.estimateSize(), j2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9430o3(AbstractC9236D d, long j, long j2, long j3, long j4) {
        super(d, j, j2, j3, j4);
    }

    /* renamed from: d */
    protected abstract Object mo16326d();

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        m16324g((Object) intConsumer);
    }

    @Override // p163j$.util.AbstractC9236D
    /* renamed from: forEachRemaining */
    public final void m16324g(Object obj) {
        obj.getClass();
        long j = this.f20736e;
        long j2 = this.f20732a;
        if (j2 < j) {
            long j3 = this.f20735d;
            if (j3 < j) {
                if (j3 < j2 || ((AbstractC9236D) this.f20734c).estimateSize() + j3 > this.f20733b) {
                    while (j2 > this.f20735d) {
                        ((AbstractC9236D) this.f20734c).tryAdvance(mo16326d());
                        this.f20735d++;
                    }
                    while (this.f20735d < this.f20736e) {
                        ((AbstractC9236D) this.f20734c).tryAdvance(obj);
                        this.f20735d++;
                    }
                    return;
                }
                ((AbstractC9236D) this.f20734c).forEachRemaining(obj);
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

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return m16325f((Object) intConsumer);
    }

    @Override // p163j$.util.AbstractC9236D
    /* renamed from: tryAdvance */
    public final boolean m16325f(Object obj) {
        long j;
        obj.getClass();
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
            ((AbstractC9236D) this.f20734c).tryAdvance(mo16326d());
            this.f20735d++;
        }
        if (j >= this.f20736e) {
            return false;
        }
        this.f20735d = j + 1;
        return ((AbstractC9236D) this.f20734c).tryAdvance(obj);
    }
}
