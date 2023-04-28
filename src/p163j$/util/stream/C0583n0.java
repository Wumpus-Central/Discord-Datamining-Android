package p163j$.util.stream;

import p163j$.util.function.AbstractC9294Q;
import p163j$.util.function.C9293P;

/* renamed from: j$.util.stream.n0 */
/* loaded from: classes2.dex */
final class C0583n0 extends AbstractC0591p0 implements AbstractC0541d2 {

    /* renamed from: c */
    final /* synthetic */ EnumC0595q0 f20702c;

    /* renamed from: d */
    final /* synthetic */ AbstractC9294Q f20703d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0583n0(AbstractC9294Q q, EnumC0595q0 q0Var) {
        super(q0Var);
        this.f20702c = q0Var;
        this.f20703d = q;
    }

    @Override // p163j$.util.stream.AbstractC0591p0, p163j$.util.stream.AbstractC0546e2
    public final void accept(long j) {
        boolean z;
        boolean z2;
        if (!this.f20724a) {
            boolean b = ((C9293P) this.f20703d).m16539b(j);
            EnumC0595q0 q0Var = this.f20702c;
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
        mo16243j((Long) obj);
    }

    @Override // p163j$.util.stream.AbstractC0541d2
    /* renamed from: j */
    public final /* synthetic */ void mo16243j(Long l) {
        AbstractC0606t0.m16286T(this, l);
    }
}
