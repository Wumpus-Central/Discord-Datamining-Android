package p163j$.util;

import p163j$.util.function.AbstractC9290M;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.B */
/* loaded from: classes2.dex */
public interface AbstractC9234B extends AbstractC9236D {
    /* renamed from: a */
    void mo16362a(AbstractC9290M m);

    /* renamed from: b */
    boolean mo16361b(AbstractC9290M m);

    @Override // p163j$.util.Spliterator
    void forEachRemaining(Consumer consumer);

    @Override // p163j$.util.Spliterator
    boolean tryAdvance(Consumer consumer);

    @Override // p163j$.util.AbstractC9236D, p163j$.util.Spliterator
    AbstractC9234B trySplit();
}
