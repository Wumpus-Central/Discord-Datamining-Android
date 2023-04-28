package p163j$.util;

import p163j$.util.function.AbstractC0494i;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.y */
/* loaded from: classes2.dex */
public interface AbstractC9447y extends AbstractC9236D {
    /* renamed from: f */
    boolean mo16225f(AbstractC0494i iVar);

    @Override // p163j$.util.Spliterator
    void forEachRemaining(Consumer consumer);

    /* renamed from: g */
    void mo16224g(AbstractC0494i iVar);

    @Override // p163j$.util.Spliterator
    boolean tryAdvance(Consumer consumer);

    @Override // p163j$.util.AbstractC9236D, p163j$.util.Spliterator
    AbstractC9447y trySplit();
}
