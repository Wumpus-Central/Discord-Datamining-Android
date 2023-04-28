package p163j$.util.stream;

import p163j$.util.AbstractC9236D;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.M0 */
/* loaded from: classes2.dex */
public final class C9369M0 extends AbstractC9373N0 implements AbstractC9314A0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C9369M0(AbstractC9314A0 a0, AbstractC9314A0 a02) {
        super(a0, a02);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo16320i(Long[] lArr, int i) {
        AbstractC0606t0.m16279a0(this, lArr, i);
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0606t0.m16276d0(this, consumer);
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: n */
    public final /* synthetic */ AbstractC9324C0 mo16317n(long j, long j2, IntFunction intFunction) {
        return AbstractC0606t0.m16273g0(this, j, j2);
    }

    @Override // p163j$.util.stream.AbstractC9319B0
    public final Object newArray(int i) {
        return new long[i];
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: spliterator */
    public final AbstractC9236D mo42181spliterator() {
        return new C0540d1(this);
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator mo42181spliterator() {
        return new C0540d1(this);
    }
}
