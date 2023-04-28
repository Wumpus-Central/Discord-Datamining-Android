package p163j$.util.stream;

import p163j$.util.function.AbstractC9290M;

/* renamed from: j$.util.stream.d0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0539d0 implements AbstractC9290M {

    /* renamed from: a */
    public final /* synthetic */ int f20638a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0546e2 f20639b;

    public /* synthetic */ C0539d0(int i, AbstractC0546e2 e2Var) {
        this.f20638a = i;
        this.f20639b = e2Var;
    }

    @Override // p163j$.util.function.AbstractC9290M
    public final void accept(long j) {
        int i = this.f20638a;
        AbstractC0546e2 e2Var = this.f20639b;
        switch (i) {
            case 0:
                e2Var.accept(j);
                return;
            default:
                ((C0544e0) e2Var).f20611a.accept(j);
                return;
        }
    }
}
