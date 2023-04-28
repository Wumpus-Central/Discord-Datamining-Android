package p163j$.util.stream;

import p163j$.util.function.AbstractC0498m;
import p163j$.util.function.C0497l;

/* renamed from: j$.util.stream.o0 */
/* loaded from: classes2.dex */
final class C0587o0 extends AbstractC0591p0 implements AbstractC0531b2 {

    /* renamed from: c */
    final /* synthetic */ EnumC0595q0 f20709c;

    /* renamed from: d */
    final /* synthetic */ AbstractC0498m f20710d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0587o0(AbstractC0498m mVar, EnumC0595q0 q0Var) {
        super(q0Var);
        this.f20709c = q0Var;
        this.f20710d = mVar;
    }

    @Override // p163j$.util.stream.AbstractC0591p0, p163j$.util.stream.AbstractC0546e2, p163j$.util.stream.AbstractC0531b2, p163j$.util.function.AbstractC0494i
    public final void accept(double d) {
        boolean z;
        boolean z2;
        if (!this.f20724a) {
            boolean b = ((C0497l) this.f20710d).m16520b(d);
            EnumC0595q0 q0Var = this.f20709c;
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
        mo16232k((Double) obj);
    }

    @Override // p163j$.util.stream.AbstractC0531b2
    /* renamed from: k */
    public final /* synthetic */ void mo16232k(Double d) {
        AbstractC0606t0.m16290P(this, d);
    }
}
