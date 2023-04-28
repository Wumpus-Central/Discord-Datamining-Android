package p163j$.util.stream;

import java.util.concurrent.atomic.AtomicLong;
import p163j$.util.Spliterator;

/* renamed from: j$.util.stream.x3 */
/* loaded from: classes2.dex */
abstract class AbstractC9440x3 {

    /* renamed from: a */
    protected final Spliterator f20788a;

    /* renamed from: b */
    protected final boolean f20789b;

    /* renamed from: c */
    private final long f20790c;

    /* renamed from: d */
    private final AtomicLong f20791d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9440x3(Spliterator spliterator, long j, long j2) {
        this.f20788a = spliterator;
        long j3 = 0;
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        this.f20789b = i < 0;
        this.f20790c = i >= 0 ? j2 : j3;
        this.f20791d = new AtomicLong(i >= 0 ? j + j2 : j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9440x3(Spliterator spliterator, AbstractC9440x3 x3Var) {
        this.f20788a = spliterator;
        this.f20789b = x3Var.f20789b;
        this.f20791d = x3Var.f20791d;
        this.f20790c = x3Var.f20790c;
    }

    public final int characteristics() {
        return this.f20788a.characteristics() & (-16465);
    }

    public final long estimateSize() {
        return this.f20788a.estimateSize();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final long m16242i(long j) {
        AtomicLong atomicLong;
        long j2;
        boolean z;
        long min;
        do {
            atomicLong = this.f20791d;
            j2 = atomicLong.get();
            int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            z = this.f20789b;
            if (i != 0) {
                min = Math.min(j2, j);
                if (min <= 0) {
                    break;
                }
            } else if (z) {
                return j;
            } else {
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j2, j2 - min));
        if (z) {
            return Math.max(j - min, 0L);
        }
        long j3 = this.f20790c;
        return j2 > j3 ? Math.max(min - (j2 - j3), 0L) : min;
    }

    /* renamed from: l */
    protected abstract Spliterator mo16241l(Spliterator spliterator);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final EnumC9439w3 m16240m() {
        return this.f20791d.get() > 0 ? EnumC9439w3.MAYBE_MORE : this.f20789b ? EnumC9439w3.UNLIMITED : EnumC9439w3.NO_MORE;
    }

    public final Spliterator trySplit() {
        Spliterator trySplit;
        if (this.f20791d.get() == 0 || (trySplit = this.f20788a.trySplit()) == null) {
            return null;
        }
        return mo16241l(trySplit);
    }
}
