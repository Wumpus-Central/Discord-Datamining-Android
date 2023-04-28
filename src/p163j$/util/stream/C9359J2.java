package p163j$.util.stream;

import p163j$.util.AbstractC0518n;
import p163j$.util.AbstractC9236D;
import p163j$.util.Spliterator;
import p163j$.util.Spliterators;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.J2 */
/* loaded from: classes2.dex */
final class C9359J2 extends AbstractC9375N2 implements Spliterator.OfInt {

    /* renamed from: g */
    final /* synthetic */ C9363K2 f20516g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9359J2(C9363K2 k2, int i, int i2, int i3, int i4) {
        super(k2, i, i2, i3, i4);
        this.f20516g = k2;
    }

    @Override // p163j$.util.stream.AbstractC9375N2
    /* renamed from: c */
    final void mo16459c(int i, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i]);
    }

    @Override // p163j$.util.stream.AbstractC9375N2
    /* renamed from: d */
    final AbstractC9236D mo16458d(Object obj, int i, int i2) {
        return Spliterators.spliterator((int[]) obj, i, i2 + i, 1040);
    }

    @Override // p163j$.util.stream.AbstractC9375N2
    /* renamed from: e */
    final AbstractC9236D mo16457e(int i, int i2, int i3, int i4) {
        return new C9359J2(this.f20516g, i, i2, i3, i4);
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
