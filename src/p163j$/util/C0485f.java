package p163j$.util;

import com.facebook.react.uimanager.ViewDefaults;
import p163j$.util.function.IntConsumer;

/* renamed from: j$.util.f */
/* loaded from: classes2.dex */
public final class C0485f implements IntConsumer {
    private long count;
    private long sum;
    private int min = ViewDefaults.NUMBER_OF_LINES;
    private int max = Integer.MIN_VALUE;

    /* renamed from: a */
    public final void m16552a(C0485f fVar) {
        this.count += fVar.count;
        this.sum += fVar.sum;
        this.min = Math.min(this.min, fVar.min);
        this.max = Math.max(this.max, fVar.max);
    }

    @Override // p163j$.util.function.IntConsumer
    public final void accept(int i) {
        this.count++;
        this.sum += i;
        this.min = Math.min(this.min, i);
        this.max = Math.max(this.max, i);
    }

    @Override // p163j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return intConsumer.getClass();
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C0485f.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Long.valueOf(this.sum);
        objArr[3] = Integer.valueOf(this.min);
        long j = this.count;
        objArr[4] = Double.valueOf(j > 0 ? this.sum / j : 0.0d);
        objArr[5] = Integer.valueOf(this.max);
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", objArr);
    }
}
