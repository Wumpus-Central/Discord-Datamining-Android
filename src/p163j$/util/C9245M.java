package p163j$.util;

import java.util.Comparator;
import p163j$.util.Spliterator;
import p163j$.util.function.AbstractC9290M;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.M */
/* loaded from: classes2.dex */
final class C9245M extends AbstractC0518n implements AbstractC9234B {
    @Override // p163j$.util.AbstractC9234B
    /* renamed from: a */
    public final void mo16362a(AbstractC9290M m) {
        m.getClass();
    }

    @Override // p163j$.util.AbstractC9234B
    /* renamed from: b */
    public final boolean mo16361b(AbstractC9290M m) {
        m.getClass();
        return false;
    }

    @Override // p163j$.util.AbstractC9234B, p163j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0518n.m16487e(this, consumer);
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // p163j$.util.AbstractC9234B, p163j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0518n.m16484j(this, consumer);
    }
}
