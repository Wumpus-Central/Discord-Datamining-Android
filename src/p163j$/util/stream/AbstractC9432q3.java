package p163j$.util.stream;

import p163j$.util.Spliterator;

/* renamed from: j$.util.stream.q3 */
/* loaded from: classes2.dex */
abstract class AbstractC9432q3 {

    /* renamed from: a */
    final long f20732a;

    /* renamed from: b */
    final long f20733b;

    /* renamed from: c */
    Spliterator f20734c;

    /* renamed from: d */
    long f20735d;

    /* renamed from: e */
    long f20736e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9432q3(Spliterator spliterator, long j, long j2, long j3, long j4) {
        this.f20734c = spliterator;
        this.f20732a = j;
        this.f20733b = j2;
        this.f20735d = j3;
        this.f20736e = j4;
    }

    /* renamed from: c */
    protected abstract Spliterator mo16306c(Spliterator spliterator, long j, long j2, long j3, long j4);

    public final int characteristics() {
        return this.f20734c.characteristics();
    }

    public final long estimateSize() {
        long j = this.f20736e;
        long j2 = this.f20732a;
        if (j2 < j) {
            return j - Math.max(j2, this.f20735d);
        }
        return 0L;
    }

    public final Spliterator trySplit() {
        long j = this.f20736e;
        if (this.f20732a >= j || this.f20735d >= j) {
            return null;
        }
        while (true) {
            Spliterator trySplit = this.f20734c.trySplit();
            if (trySplit == null) {
                return null;
            }
            long estimateSize = trySplit.estimateSize() + this.f20735d;
            long min = Math.min(estimateSize, this.f20733b);
            long j2 = this.f20732a;
            if (j2 >= min) {
                this.f20735d = min;
            } else {
                long j3 = this.f20733b;
                if (min >= j3) {
                    this.f20734c = trySplit;
                    this.f20736e = min;
                } else {
                    long j4 = this.f20735d;
                    if (j4 < j2 || estimateSize > j3) {
                        this.f20735d = min;
                        return mo16306c(trySplit, j2, j3, j4, min);
                    }
                    this.f20735d = min;
                    return trySplit;
                }
            }
        }
    }
}
