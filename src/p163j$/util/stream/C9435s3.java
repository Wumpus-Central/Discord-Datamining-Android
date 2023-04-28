package p163j$.util.stream;

import p163j$.util.AbstractC0518n;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.s3 */
/* loaded from: classes2.dex */
final class C9435s3 extends AbstractC9437u3 implements Spliterator.OfInt, IntConsumer {

    /* renamed from: e */
    int f20749e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9435s3(Spliterator.OfInt ofInt, long j, long j2) {
        super(ofInt, j, j2);
    }

    C9435s3(Spliterator.OfInt ofInt, C9435s3 s3Var) {
        super(ofInt, s3Var);
    }

    @Override // p163j$.util.function.IntConsumer
    public final void accept(int i) {
        this.f20749e = i;
    }

    @Override // p163j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return intConsumer.getClass();
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0518n.m16488d(this, consumer);
    }

    @Override // p163j$.util.stream.AbstractC9440x3
    /* renamed from: l */
    protected final Spliterator mo16241l(Spliterator spliterator) {
        return new C9435s3((Spliterator.OfInt) spliterator, this);
    }

    @Override // p163j$.util.stream.AbstractC9437u3
    /* renamed from: n */
    protected final void mo16245n(Object obj) {
        ((IntConsumer) obj).accept(this.f20749e);
    }

    @Override // p163j$.util.stream.AbstractC9437u3
    /* renamed from: o */
    protected final AbstractC9418Y2 mo16244o() {
        return new C9410W2();
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0518n.m16485i(this, consumer);
    }
}
