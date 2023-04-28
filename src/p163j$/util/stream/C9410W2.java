package p163j$.util.stream;

import p163j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.W2 */
/* loaded from: classes2.dex */
final class C9410W2 extends AbstractC9418Y2 implements IntConsumer {

    /* renamed from: c */
    final int[] f20604c = new int[128];

    @Override // p163j$.util.stream.AbstractC9418Y2
    /* renamed from: a */
    public final void mo16409a(Object obj, long j) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; i < j; i++) {
            intConsumer.accept(this.f20604c[i]);
        }
    }

    @Override // p163j$.util.function.IntConsumer
    public final void accept(int i) {
        int i2 = this.f20610b;
        this.f20610b = i2 + 1;
        this.f20604c[i2] = i;
    }

    @Override // p163j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return intConsumer.getClass();
    }
}
