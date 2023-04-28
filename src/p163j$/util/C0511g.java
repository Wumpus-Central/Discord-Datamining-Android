package p163j$.util;

import p163j$.util.function.AbstractC9290M;
import p163j$.util.function.IntConsumer;

/* renamed from: j$.util.g */
/* loaded from: classes2.dex */
public final class C0511g implements AbstractC9290M, IntConsumer {
    private long count;
    private long sum;
    private long min = Long.MAX_VALUE;
    private long max = Long.MIN_VALUE;

    /* renamed from: a */
    public final void m16510a(C0511g gVar) {
        this.count += gVar.count;
        this.sum += gVar.sum;
        this.min = Math.min(this.min, gVar.min);
        this.max = Math.max(this.max, gVar.max);
    }

    @Override // p163j$.util.function.IntConsumer
    public final void accept(int i) {
        accept(i);
    }

    @Override // p163j$.util.function.AbstractC9290M
    public final void accept(long j) {
        this.count++;
        this.sum += j;
        this.min = Math.min(this.min, j);
        this.max = Math.max(this.max, j);
    }

    @Override // p163j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return intConsumer.getClass();
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C0511g.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Long.valueOf(this.sum);
        objArr[3] = Long.valueOf(this.min);
        long j = this.count;
        objArr[4] = Double.valueOf(j > 0 ? this.sum / j : 0.0d);
        objArr[5] = Long.valueOf(this.max);
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", objArr);
    }
}
