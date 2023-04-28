package p163j$.util.stream;

import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntFunction;

/* renamed from: j$.util.stream.C0 */
/* loaded from: classes2.dex */
interface AbstractC9324C0 {
    /* renamed from: a */
    AbstractC9324C0 mo16321a(int i);

    long count();

    void forEach(Consumer consumer);

    /* renamed from: i */
    void mo16320i(Object[] objArr, int i);

    /* renamed from: l */
    int mo16319l();

    /* renamed from: m */
    Object[] mo16318m(IntFunction intFunction);

    /* renamed from: n */
    AbstractC9324C0 mo16317n(long j, long j2, IntFunction intFunction);

    /* renamed from: spliterator */
    Spliterator mo42181spliterator();
}
