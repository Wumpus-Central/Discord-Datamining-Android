package p163j$.util.stream;

import p163j$.util.function.Consumer;
import p163j$.util.function.Predicate;
import p163j$.util.function.ToDoubleFunction;
import p163j$.util.function.ToIntFunction;
import p163j$.util.function.ToLongFunction;

/* renamed from: j$.util.stream.Q1 */
/* loaded from: classes2.dex */
final class C9386Q1 extends AbstractC0526a2 {

    /* renamed from: b */
    public final /* synthetic */ int f20554b;

    /* renamed from: c */
    final /* synthetic */ AbstractC0533c f20555c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9386Q1(AbstractC0533c cVar, AbstractC0546e2 e2Var, int i) {
        super(e2Var);
        this.f20554b = i;
        this.f20555c = cVar;
    }

    @Override // p163j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f20554b;
        AbstractC0546e2 e2Var = this.f20615a;
        AbstractC0533c cVar = this.f20555c;
        switch (i) {
            case 0:
                ((Consumer) ((C0609u) cVar).f20765t).accept(obj);
                e2Var.accept((AbstractC0546e2) obj);
                return;
            case 1:
                if (((Predicate) ((C0609u) cVar).f20765t).test(obj)) {
                    e2Var.accept((AbstractC0546e2) obj);
                    return;
                }
                return;
            case 2:
                e2Var.accept((AbstractC0546e2) ((C9393S1) cVar).f20563t.apply(obj));
                return;
            case 3:
                e2Var.accept(((ToIntFunction) ((C0613v) cVar).f20772t).applyAsInt(obj));
                return;
            case 4:
                e2Var.accept(((ToLongFunction) ((C0617w) cVar).f20779t).applyAsLong(obj));
                return;
            case 5:
                e2Var.accept(((ToDoubleFunction) ((C0605t) cVar).f20751t).applyAsDouble(obj));
                return;
            default:
                Stream stream = (Stream) ((C9393S1) cVar).f20563t.apply(obj);
                if (stream != null) {
                    try {
                        ((Stream) stream.sequential()).forEach(e2Var);
                    } catch (Throwable th2) {
                        try {
                            stream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
        }
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        int i = this.f20554b;
        AbstractC0546e2 e2Var = this.f20615a;
        switch (i) {
            case 1:
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
