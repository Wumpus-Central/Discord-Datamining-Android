package p163j$.util.stream;

import p163j$.util.Spliterator;
import p163j$.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.r0 */
/* loaded from: classes2.dex */
public final class C0598r0 implements AbstractC9332D3 {

    /* renamed from: a */
    final EnumC0595q0 f20739a;

    /* renamed from: b */
    final Supplier f20740b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0598r0(EnumC9398T2 t2, EnumC0595q0 q0Var, C0578m mVar) {
        this.f20739a = q0Var;
        this.f20740b = mVar;
    }

    @Override // p163j$.util.stream.AbstractC9332D3
    /* renamed from: N */
    public final Object mo16292N(AbstractC0606t0 t0Var, Spliterator spliterator) {
        AbstractC0591p0 p0Var = (AbstractC0591p0) this.f20740b.get();
        t0Var.mo16294J0(spliterator, p0Var);
        return Boolean.valueOf(p0Var.f20725b);
    }

    @Override // p163j$.util.stream.AbstractC9332D3
    /* renamed from: l */
    public final Object mo16268l(AbstractC0606t0 t0Var, Spliterator spliterator) {
        return (Boolean) new C0602s0(this, t0Var, spliterator).invoke();
    }

    @Override // p163j$.util.stream.AbstractC9332D3
    /* renamed from: y */
    public final int mo16254y() {
        return EnumC9394S2.f20579u | EnumC9394S2.f20576r;
    }
}
