package p163j$.util.stream;

import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.T1 */
/* loaded from: classes2.dex */
public final class C9397T1 extends AbstractC9409W1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C9397T1(Spliterator spliterator, int i, boolean z) {
        super(spliterator, i, z);
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

    @Override // p163j$.util.stream.AbstractC9409W1, p163j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (!isParallel()) {
            m16380Z0().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override // p163j$.util.stream.AbstractC9409W1, p163j$.util.stream.Stream
    /* renamed from: s */
    public final void mo16415s(Consumer consumer) {
        if (!isParallel()) {
            m16380Z0().forEachRemaining(consumer);
        } else {
            super.mo16415s(consumer);
        }
    }
}
