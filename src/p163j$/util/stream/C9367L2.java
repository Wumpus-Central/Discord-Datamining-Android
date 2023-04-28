package p163j$.util.stream;

import p163j$.util.AbstractC0518n;
import p163j$.util.AbstractC9234B;
import p163j$.util.AbstractC9236D;
import p163j$.util.Spliterators;
import p163j$.util.function.AbstractC9290M;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.L2 */
/* loaded from: classes2.dex */
final class C9367L2 extends AbstractC9375N2 implements AbstractC9234B {

    /* renamed from: g */
    final /* synthetic */ C9371M2 f20524g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9367L2(C9371M2 m2, int i, int i2, int i3, int i4) {
        super(m2, i, i2, i3, i4);
        this.f20524g = m2;
    }

    @Override // p163j$.util.stream.AbstractC9375N2
    /* renamed from: c */
    final void mo16459c(int i, Object obj, Object obj2) {
        ((AbstractC9290M) obj2).accept(((long[]) obj)[i]);
    }

    @Override // p163j$.util.stream.AbstractC9375N2
    /* renamed from: d */
    final AbstractC9236D mo16458d(Object obj, int i, int i2) {
        return Spliterators.m16585k((long[]) obj, i, i2 + i);
    }

    @Override // p163j$.util.stream.AbstractC9375N2
    /* renamed from: e */
    final AbstractC9236D mo16457e(int i, int i2, int i3, int i4) {
        return new C9367L2(this.f20524g, i, i2, i3, i4);
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
