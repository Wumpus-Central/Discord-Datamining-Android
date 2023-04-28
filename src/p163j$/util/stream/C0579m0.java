package p163j$.util.stream;

import p163j$.util.function.AbstractC9280C;
import p163j$.util.function.C9279B;
import p163j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.m0 */
/* loaded from: classes2.dex */
final class C0579m0 extends AbstractC0591p0 implements AbstractC0536c2 {

    /* renamed from: c */
    final /* synthetic */ EnumC0595q0 f20695c;

    /* renamed from: d */
    final /* synthetic */ AbstractC9280C f20696d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0579m0(AbstractC9280C c, EnumC0595q0 q0Var) {
        super(q0Var);
        this.f20695c = q0Var;
        this.f20696d = c;
    }

    @Override // p163j$.util.stream.AbstractC0591p0, p163j$.util.stream.AbstractC0546e2
    public final void accept(int i) {
        boolean z;
        boolean z2;
        if (!this.f20724a) {
            boolean b = ((C9279B) this.f20696d).m16549b(i);
            EnumC0595q0 q0Var = this.f20695c;
            z = q0Var.f20729a;
            if (b == z) {
                this.f20724a = true;
                z2 = q0Var.f20730b;
                this.f20725b = z2;
            }
        }
    }

    @Override // p163j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo16334d((Integer) obj);
    }

    @Override // p163j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return intConsumer.getClass();
    }

    @Override // p163j$.util.stream.AbstractC0536c2
    /* renamed from: d */
    public final /* synthetic */ void mo16334d(Integer num) {
        AbstractC0606t0.m16288R(this, num);
    }
}
