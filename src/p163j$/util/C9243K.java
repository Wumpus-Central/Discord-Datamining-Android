package p163j$.util;

import java.util.Comparator;
import p163j$.util.Spliterator;
import p163j$.util.function.AbstractC0494i;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.K */
/* loaded from: classes2.dex */
final class C9243K extends AbstractC0518n implements AbstractC9447y {
    @Override // p163j$.util.AbstractC9447y
    /* renamed from: f */
    public final boolean mo16225f(AbstractC0494i iVar) {
        iVar.getClass();
        return false;
    }

    @Override // p163j$.util.AbstractC9447y, p163j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0518n.m16489c(this, consumer);
    }

    @Override // p163j$.util.AbstractC9447y
    /* renamed from: g */
    public final void mo16224g(AbstractC0494i iVar) {
        iVar.getClass();
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

    @Override // p163j$.util.AbstractC9447y, p163j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0518n.m16486h(this, consumer);
    }
}
