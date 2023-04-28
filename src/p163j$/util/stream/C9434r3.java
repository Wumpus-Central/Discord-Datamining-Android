package p163j$.util.stream;

import p163j$.util.AbstractC0518n;
import p163j$.util.AbstractC9447y;
import p163j$.util.Spliterator;
import p163j$.util.function.AbstractC0494i;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.r3 */
/* loaded from: classes2.dex */
final class C9434r3 extends AbstractC9437u3 implements AbstractC9447y, AbstractC0494i {

    /* renamed from: e */
    double f20742e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9434r3(AbstractC9447y yVar, long j, long j2) {
        super(yVar, j, j2);
    }

    C9434r3(AbstractC9447y yVar, C9434r3 r3Var) {
        super(yVar, r3Var);
    }

    @Override // p163j$.util.function.AbstractC0494i
    public final void accept(double d) {
        this.f20742e = d;
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0518n.m16489c(this, consumer);
    }

    @Override // p163j$.util.stream.AbstractC9440x3
    /* renamed from: l */
    protected final Spliterator mo16241l(Spliterator spliterator) {
        return new C9434r3((AbstractC9447y) spliterator, this);
    }

    @Override // p163j$.util.stream.AbstractC9437u3
    /* renamed from: n */
    protected final void mo16245n(Object obj) {
        ((AbstractC0494i) obj).accept(this.f20742e);
    }

    @Override // p163j$.util.stream.AbstractC9437u3
    /* renamed from: o */
    protected final AbstractC9418Y2 mo16244o() {
        return new C9406V2();
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0518n.m16486h(this, consumer);
    }
}
