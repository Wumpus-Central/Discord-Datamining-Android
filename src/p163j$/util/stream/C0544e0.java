package p163j$.util.stream;

import p163j$.util.function.AbstractC9290M;
import p163j$.util.function.AbstractC9292O;
import p163j$.util.function.AbstractC9294Q;
import p163j$.util.function.AbstractC9296T;
import p163j$.util.function.AbstractC9298V;
import p163j$.util.function.AbstractC9300X;
import p163j$.util.function.C9293P;
import p163j$.util.function.C9295S;
import p163j$.util.function.C9297U;

/* renamed from: j$.util.stream.e0 */
/* loaded from: classes2.dex */
final class C0544e0 extends AbstractC9421Z1 {

    /* renamed from: b */
    public final /* synthetic */ int f20644b;

    /* renamed from: c */
    final /* synthetic */ AbstractC0533c f20645c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0544e0(AbstractC0533c cVar, AbstractC0546e2 e2Var, int i) {
        super(e2Var);
        this.f20644b = i;
        this.f20645c = cVar;
    }

    @Override // p163j$.util.stream.AbstractC0541d2, p163j$.util.stream.AbstractC0546e2
    public final void accept(long j) {
        int i = this.f20644b;
        AbstractC0533c cVar = this.f20645c;
        AbstractC0546e2 e2Var = this.f20611a;
        switch (i) {
            case 0:
                e2Var.accept(j);
                return;
            case 1:
                e2Var.accept(((AbstractC9300X) ((C0617w) cVar).f20779t).applyAsLong(j));
                return;
            case 2:
                e2Var.accept((AbstractC0546e2) ((AbstractC9292O) ((C0609u) cVar).f20765t).apply(j));
                return;
            case 3:
                e2Var.accept(((C9297U) ((AbstractC9298V) ((C0613v) cVar).f20772t)).m16536a(j));
                return;
            case 4:
                e2Var.accept(((C9295S) ((AbstractC9296T) ((C0605t) cVar).f20751t)).m16538a(j));
                return;
            case 5:
                AbstractC0571k0 k0Var = (AbstractC0571k0) ((AbstractC9292O) ((C0617w) cVar).f20779t).apply(j);
                if (k0Var != null) {
                    try {
                        k0Var.sequential().mo16337q(new C0539d0(1, this));
                    } catch (Throwable th2) {
                        try {
                            ((AbstractC0533c) k0Var).close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                if (k0Var != null) {
                    ((AbstractC0533c) k0Var).close();
                    return;
                }
                return;
            case 6:
                if (((C9293P) ((AbstractC9294Q) ((C0617w) cVar).f20779t)).m16539b(j)) {
                    e2Var.accept(j);
                    return;
                }
                return;
            default:
                ((AbstractC9290M) ((C0617w) cVar).f20779t).accept(j);
                e2Var.accept(j);
                return;
        }
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        int i = this.f20644b;
        AbstractC0546e2 e2Var = this.f20611a;
        switch (i) {
            case 5:
                e2Var.mo16235c(-1L);
                return;
            case 6:
                e2Var.mo16235c(-1L);
                return;
            default:
                e2Var.mo16235c(j);
                return;
        }
    }
}
