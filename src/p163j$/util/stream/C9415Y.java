package p163j$.util.stream;

import p163j$.util.Spliterator;
import p163j$.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.Y */
/* loaded from: classes2.dex */
public final class C9415Y extends AbstractC0529b0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C9415Y(Spliterator.OfInt ofInt, int i) {
        super(ofInt, i);
    }

    @Override // p163j$.util.stream.AbstractC0529b0, p163j$.util.stream.IntStream
    /* renamed from: A */
    public final void mo16405A(IntConsumer intConsumer) {
        Spliterator.OfInt d1;
        if (!isParallel()) {
            d1 = AbstractC0529b0.m16395d1(m16380Z0());
            d1.forEachRemaining(intConsumer);
            return;
        }
        super.mo16405A(intConsumer);
    }

    @Override // p163j$.util.stream.AbstractC0529b0, p163j$.util.stream.IntStream
    /* renamed from: C */
    public final void mo16403C(IntConsumer intConsumer) {
        Spliterator.OfInt d1;
        if (!isParallel()) {
            d1 = AbstractC0529b0.m16395d1(m16380Z0());
            d1.forEachRemaining(intConsumer);
            return;
        }
        super.mo16403C(intConsumer);
    }

    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: W0 */
    final boolean mo16236W0() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: X0 */
    public final AbstractC0546e2 mo16230X0(int i, AbstractC0546e2 e2Var) {
        throw new UnsupportedOperationException();
    }

    @Override // p163j$.util.stream.AbstractC0533c, p163j$.util.stream.AbstractC0558h, p163j$.util.stream.AbstractC9328D
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // p163j$.util.stream.AbstractC0533c, p163j$.util.stream.AbstractC0558h, p163j$.util.stream.AbstractC9328D
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }
}
