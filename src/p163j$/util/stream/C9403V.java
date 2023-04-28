package p163j$.util.stream;

import p163j$.util.function.AbstractC9280C;
import p163j$.util.function.AbstractC9282E;
import p163j$.util.function.AbstractC9284G;
import p163j$.util.function.AbstractC9286I;
import p163j$.util.function.C9279B;
import p163j$.util.function.C9281D;
import p163j$.util.function.C9285H;
import p163j$.util.function.IntConsumer;
import p163j$.util.function.IntFunction;

/* renamed from: j$.util.stream.V */
/* loaded from: classes2.dex */
final class C9403V extends AbstractC9417Y1 {

    /* renamed from: b */
    public final /* synthetic */ int f20600b;

    /* renamed from: c */
    final /* synthetic */ AbstractC0533c f20601c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9403V(AbstractC0533c cVar, AbstractC0546e2 e2Var, int i) {
        super(e2Var);
        this.f20600b = i;
        this.f20601c = cVar;
    }

    @Override // p163j$.util.stream.AbstractC0536c2, p163j$.util.stream.AbstractC0546e2
    public final void accept(int i) {
        int i2 = this.f20600b;
        AbstractC0533c cVar = this.f20601c;
        AbstractC0546e2 e2Var = this.f20609a;
        switch (i2) {
            case 0:
                e2Var.accept(i);
                return;
            case 1:
                ((IntConsumer) ((C0613v) cVar).f20772t).accept(i);
                e2Var.accept(i);
                return;
            case 2:
                e2Var.accept(i);
                return;
            case 3:
                e2Var.accept(((C9285H) ((AbstractC9286I) ((C0613v) cVar).f20772t)).m16545a(i));
                return;
            case 4:
                e2Var.accept((AbstractC0546e2) ((IntFunction) ((C0609u) cVar).f20765t).apply(i));
                return;
            case 5:
                e2Var.accept(((AbstractC9284G) ((C0617w) cVar).f20779t).applyAsLong(i));
                return;
            case 6:
                e2Var.accept(((C9281D) ((AbstractC9282E) ((C0605t) cVar).f20751t)).m16548a(i));
                return;
            case 7:
                IntStream intStream = (IntStream) ((IntFunction) ((C0613v) cVar).f20772t).apply(i);
                if (intStream != null) {
                    try {
                        intStream.sequential().mo16403C(new C9395T(1, this));
                    } catch (Throwable th2) {
                        try {
                            intStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                if (((C9279B) ((AbstractC9280C) ((C0613v) cVar).f20772t)).m16549b(i)) {
                    e2Var.accept(i);
                    return;
                }
                return;
        }
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        int i = this.f20600b;
        AbstractC0546e2 e2Var = this.f20609a;
        switch (i) {
            case 7:
                e2Var.mo16235c(-1L);
                return;
            case 8:
                e2Var.mo16235c(-1L);
                return;
            default:
                e2Var.mo16235c(j);
                return;
        }
    }
}
