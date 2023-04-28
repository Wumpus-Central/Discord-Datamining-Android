package p163j$.util.stream;

import p163j$.util.AbstractC9447y;
import p163j$.util.Spliterator;
import p163j$.util.function.AbstractC0494i;
import p163j$.util.function.C0493h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.y */
/* loaded from: classes2.dex */
public final class C0625y extends AbstractC9318B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0625y(Spliterator spliterator, int i) {
        super(spliterator, i);
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
    public final /* bridge */ /* synthetic */ AbstractC9328D parallel() {
        parallel();
        return this;
    }

    @Override // p163j$.util.stream.AbstractC0533c, p163j$.util.stream.AbstractC0558h, p163j$.util.stream.AbstractC9328D
    public final /* bridge */ /* synthetic */ AbstractC9328D sequential() {
        sequential();
        return this;
    }

    @Override // p163j$.util.stream.AbstractC9318B, p163j$.util.stream.AbstractC9328D
    /* renamed from: t */
    public final void mo16239t(AbstractC0494i iVar) {
        AbstractC9447y d1;
        if (!isParallel()) {
            d1 = AbstractC9318B.m16474d1(m16380Z0());
            d1.mo16224g(iVar);
            return;
        }
        super.mo16239t(iVar);
    }

    @Override // p163j$.util.stream.AbstractC9318B, p163j$.util.stream.AbstractC9328D
    /* renamed from: z */
    public final void mo16238z(C0493h hVar) {
        AbstractC9447y d1;
        if (!isParallel()) {
            d1 = AbstractC9318B.m16474d1(m16380Z0());
            d1.mo16224g(hVar);
            return;
        }
        super.mo16238z(hVar);
    }
}
