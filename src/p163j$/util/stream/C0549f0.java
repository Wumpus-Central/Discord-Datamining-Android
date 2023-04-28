package p163j$.util.stream;

import p163j$.util.AbstractC9234B;
import p163j$.util.Spliterator;
import p163j$.util.function.AbstractC9290M;
import p163j$.util.function.C9289L;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.f0 */
/* loaded from: classes2.dex */
public final class C0549f0 extends AbstractC0563i0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0549f0(Spliterator spliterator, int i) {
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

    @Override // p163j$.util.stream.AbstractC0563i0, p163j$.util.stream.AbstractC0571k0
    /* renamed from: o */
    public final void mo16338o(C9289L l) {
        AbstractC9234B d1;
        if (!isParallel()) {
            d1 = AbstractC0563i0.m16355d1(m16380Z0());
            d1.mo16362a(l);
            return;
        }
        super.mo16338o(l);
    }

    @Override // p163j$.util.stream.AbstractC0533c, p163j$.util.stream.AbstractC0558h, p163j$.util.stream.AbstractC9328D
    public final /* bridge */ /* synthetic */ AbstractC0571k0 parallel() {
        parallel();
        return this;
    }

    @Override // p163j$.util.stream.AbstractC0563i0, p163j$.util.stream.AbstractC0571k0
    /* renamed from: q */
    public final void mo16337q(AbstractC9290M m) {
        AbstractC9234B d1;
        if (!isParallel()) {
            d1 = AbstractC0563i0.m16355d1(m16380Z0());
            d1.mo16362a(m);
            return;
        }
        super.mo16337q(m);
    }

    @Override // p163j$.util.stream.AbstractC0533c, p163j$.util.stream.AbstractC0558h, p163j$.util.stream.AbstractC9328D
    public final /* bridge */ /* synthetic */ AbstractC0571k0 sequential() {
        sequential();
        return this;
    }
}
