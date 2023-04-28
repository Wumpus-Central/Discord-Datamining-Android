package p163j$.util.stream;

import p163j$.util.function.AbstractC0494i;
import p163j$.util.function.AbstractC0496k;
import p163j$.util.function.AbstractC0498m;
import p163j$.util.function.AbstractC0500o;
import p163j$.util.function.AbstractC0502q;
import p163j$.util.function.AbstractC0503s;
import p163j$.util.function.C0497l;
import p163j$.util.function.C0499n;
import p163j$.util.function.C9311r;

/* renamed from: j$.util.stream.s */
/* loaded from: classes2.dex */
final class C0601s extends AbstractC9413X1 {

    /* renamed from: b */
    public final /* synthetic */ int f20743b;

    /* renamed from: c */
    final /* synthetic */ AbstractC0533c f20744c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0601s(AbstractC0533c cVar, AbstractC0546e2 e2Var, int i) {
        super(e2Var);
        this.f20743b = i;
        this.f20744c = cVar;
    }

    @Override // p163j$.util.stream.AbstractC0531b2, p163j$.util.function.AbstractC0494i
    public final void accept(double d) {
        int i = this.f20743b;
        AbstractC0546e2 e2Var = this.f20605a;
        AbstractC0533c cVar = this.f20744c;
        switch (i) {
            case 0:
                e2Var.accept(((C9311r) ((AbstractC0503s) ((C0605t) cVar).f20751t)).m16516a(d));
                return;
            case 1:
                e2Var.accept((AbstractC0546e2) ((AbstractC0496k) ((C0609u) cVar).f20765t).apply(d));
                return;
            case 2:
                e2Var.accept(((C0499n) ((AbstractC0500o) ((C0613v) cVar).f20772t)).m16519a(d));
                return;
            case 3:
                e2Var.accept(((AbstractC0502q) ((C0617w) cVar).f20779t).applyAsLong(d));
                return;
            case 4:
                AbstractC9328D d2 = (AbstractC9328D) ((AbstractC0496k) ((C0605t) cVar).f20751t).apply(d);
                if (d2 != null) {
                    try {
                        d2.sequential().mo16239t(new C9433r(1, this));
                    } catch (Throwable th2) {
                        try {
                            ((AbstractC0533c) d2).close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                if (d2 != null) {
                    ((AbstractC0533c) d2).close();
                    return;
                }
                return;
            case 5:
                if (((C0497l) ((AbstractC0498m) ((C0605t) cVar).f20751t)).m16520b(d)) {
                    e2Var.accept(d);
                    return;
                }
                return;
            default:
                ((AbstractC0494i) ((C0605t) cVar).f20751t).accept(d);
                e2Var.accept(d);
                return;
        }
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        int i = this.f20743b;
        AbstractC0546e2 e2Var = this.f20605a;
        switch (i) {
            case 4:
                e2Var.mo16235c(-1L);
                return;
            case 5:
                e2Var.mo16235c(-1L);
                return;
            default:
                e2Var.mo16235c(j);
                return;
        }
    }
}
