package p163j$.util.stream;

import p163j$.util.Spliterator;
import p163j$.util.function.Predicate;
import p163j$.util.function.Supplier;

/* renamed from: j$.util.stream.E */
/* loaded from: classes2.dex */
final class C9333E implements AbstractC9332D3 {

    /* renamed from: a */
    final boolean f20470a;

    /* renamed from: b */
    final Object f20471b;

    /* renamed from: c */
    final Predicate f20472c;

    /* renamed from: d */
    final Supplier f20473d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9333E(boolean z, EnumC9398T2 t2, Object obj, C9353I0 i0, C0528b bVar) {
        this.f20470a = z;
        this.f20471b = obj;
        this.f20472c = i0;
        this.f20473d = bVar;
    }

    @Override // p163j$.util.stream.AbstractC9332D3
    /* renamed from: N */
    public final Object mo16292N(AbstractC0606t0 t0Var, Spliterator spliterator) {
        AbstractC9337E3 e3 = (AbstractC9337E3) this.f20473d.get();
        t0Var.mo16294J0(spliterator, e3);
        Object obj = e3.get();
        return obj != null ? obj : this.f20471b;
    }

    @Override // p163j$.util.stream.AbstractC9332D3
    /* renamed from: l */
    public final Object mo16268l(AbstractC0606t0 t0Var, Spliterator spliterator) {
        return new C9360K(this, t0Var, spliterator).invoke();
    }

    @Override // p163j$.util.stream.AbstractC9332D3
    /* renamed from: y */
    public final int mo16254y() {
        return EnumC9394S2.f20579u | (this.f20470a ? 0 : EnumC9394S2.f20576r);
    }
}
