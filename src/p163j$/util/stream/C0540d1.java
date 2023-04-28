package p163j$.util.stream;

import p163j$.util.AbstractC0518n;
import p163j$.util.AbstractC9234B;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.d1 */
/* loaded from: classes2.dex */
final class C0540d1 extends AbstractC0545e1 implements AbstractC9234B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0540d1(AbstractC9314A0 a0) {
        super(a0);
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0518n.m16487e(this, consumer);
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0518n.m16484j(this, consumer);
    }
}
