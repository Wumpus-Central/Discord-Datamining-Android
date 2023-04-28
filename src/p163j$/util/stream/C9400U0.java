package p163j$.util.stream;

import p163j$.util.AbstractC9236D;
import p163j$.util.Spliterator;
import p163j$.util.Spliterators;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntFunction;

/* renamed from: j$.util.stream.U0 */
/* loaded from: classes2.dex */
final class C9400U0 extends AbstractC9408W0 implements AbstractC9314A0 {
    @Override // p163j$.util.stream.AbstractC9408W0, p163j$.util.stream.AbstractC9324C0
    /* renamed from: a */
    public final AbstractC9319B0 mo16321a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p163j$.util.stream.AbstractC9319B0
    /* renamed from: b */
    public final Object mo16343b() {
        long[] jArr;
        jArr = AbstractC0606t0.f20757f;
        return jArr;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo16320i(Long[] lArr, int i) {
        AbstractC0606t0.m16279a0(this, lArr, i);
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0606t0.m16276d0(this, consumer);
    }

    @Override // p163j$.util.stream.AbstractC9408W0, p163j$.util.stream.AbstractC9324C0
    /* renamed from: n */
    public final /* synthetic */ AbstractC9324C0 mo16317n(long j, long j2, IntFunction intFunction) {
        return AbstractC0606t0.m16273g0(this, j, j2);
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: spliterator */
    public final AbstractC9236D mo42181spliterator() {
        return Spliterators.m16592d();
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator mo42181spliterator() {
        return Spliterators.m16592d();
    }
}
