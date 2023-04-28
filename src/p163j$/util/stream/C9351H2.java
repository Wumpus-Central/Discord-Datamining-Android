package p163j$.util.stream;

import p163j$.util.AbstractC0518n;
import p163j$.util.AbstractC9236D;
import p163j$.util.AbstractC9447y;
import p163j$.util.Spliterators;
import p163j$.util.function.AbstractC0494i;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.H2 */
/* loaded from: classes2.dex */
final class C9351H2 extends AbstractC9375N2 implements AbstractC9447y {

    /* renamed from: g */
    final /* synthetic */ C9355I2 f20503g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9351H2(C9355I2 i2, int i, int i3, int i4, int i5) {
        super(i2, i, i3, i4, i5);
        this.f20503g = i2;
    }

    @Override // p163j$.util.stream.AbstractC9375N2
    /* renamed from: c */
    final void mo16459c(int i, Object obj, Object obj2) {
        ((AbstractC0494i) obj2).accept(((double[]) obj)[i]);
    }

    @Override // p163j$.util.stream.AbstractC9375N2
    /* renamed from: d */
    final AbstractC9236D mo16458d(Object obj, int i, int i2) {
        return Spliterators.m16586j((double[]) obj, i, i2 + i);
    }

    @Override // p163j$.util.stream.AbstractC9375N2
    /* renamed from: e */
    final AbstractC9236D mo16457e(int i, int i2, int i3, int i4) {
        return new C9351H2(this.f20503g, i, i2, i3, i4);
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0518n.m16489c(this, consumer);
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0518n.m16486h(this, consumer);
    }
}
