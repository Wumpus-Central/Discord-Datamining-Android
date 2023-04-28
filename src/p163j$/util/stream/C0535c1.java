package p163j$.util.stream;

import p163j$.util.AbstractC0518n;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.c1 */
/* loaded from: classes2.dex */
final class C0535c1 extends AbstractC0545e1 implements Spliterator.OfInt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0535c1(AbstractC0630z0 z0Var) {
        super(z0Var);
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0518n.m16488d(this, consumer);
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0518n.m16485i(this, consumer);
    }
}
