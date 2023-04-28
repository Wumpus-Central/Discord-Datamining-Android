package p163j$.util.stream;

import p163j$.util.AbstractC9236D;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.L0 */
/* loaded from: classes2.dex */
public final class C9365L0 extends AbstractC9373N0 implements AbstractC0630z0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C9365L0(AbstractC0630z0 z0Var, AbstractC0630z0 z0Var2) {
        super(z0Var, z0Var2);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo16320i(Integer[] numArr, int i) {
        AbstractC0606t0.m16280Z(this, numArr, i);
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0606t0.m16277c0(this, consumer);
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: n */
    public final /* synthetic */ AbstractC9324C0 mo16317n(long j, long j2, IntFunction intFunction) {
        return AbstractC0606t0.m16274f0(this, j, j2);
    }

    @Override // p163j$.util.stream.AbstractC9319B0
    public final Object newArray(int i) {
        return new int[i];
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: spliterator */
    public final AbstractC9236D mo42181spliterator() {
        return new C0535c1(this);
    }

    @Override // p163j$.util.stream.AbstractC9324C0
    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator mo42181spliterator() {
        return new C0535c1(this);
    }
}
