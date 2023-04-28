package p163j$.util.stream;

import p163j$.util.AbstractC0518n;
import p163j$.util.AbstractC9234B;
import p163j$.util.Spliterator;
import p163j$.util.function.AbstractC9290M;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.t3 */
/* loaded from: classes2.dex */
final class C9436t3 extends AbstractC9437u3 implements AbstractC9234B, AbstractC9290M {

    /* renamed from: e */
    long f20763e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9436t3(AbstractC9234B b, long j, long j2) {
        super(b, j, j2);
    }

    C9436t3(AbstractC9234B b, C9436t3 t3Var) {
        super(b, t3Var);
    }

    @Override // p163j$.util.function.AbstractC9290M
    public final void accept(long j) {
        this.f20763e = j;
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0518n.m16487e(this, consumer);
    }

    @Override // p163j$.util.stream.AbstractC9440x3
    /* renamed from: l */
    protected final Spliterator mo16241l(Spliterator spliterator) {
        return new C9436t3((AbstractC9234B) spliterator, this);
    }

    @Override // p163j$.util.stream.AbstractC9437u3
    /* renamed from: n */
    protected final void mo16245n(Object obj) {
        ((AbstractC9290M) obj).accept(this.f20763e);
    }

    @Override // p163j$.util.stream.AbstractC9437u3
    /* renamed from: o */
    protected final AbstractC9418Y2 mo16244o() {
        return new C9414X2();
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0518n.m16484j(this, consumer);
    }
}
