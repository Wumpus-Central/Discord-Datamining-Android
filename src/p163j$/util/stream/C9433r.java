package p163j$.util.stream;

import p163j$.util.function.AbstractC0494i;

/* renamed from: j$.util.stream.r */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9433r implements AbstractC0494i {

    /* renamed from: a */
    public final /* synthetic */ int f20737a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0546e2 f20738b;

    public /* synthetic */ C9433r(int i, AbstractC0546e2 e2Var) {
        this.f20737a = i;
        this.f20738b = e2Var;
    }

    @Override // p163j$.util.function.AbstractC0494i
    public final void accept(double d) {
        int i = this.f20737a;
        AbstractC0546e2 e2Var = this.f20738b;
        switch (i) {
            case 0:
                e2Var.accept(d);
                return;
            default:
                ((C0601s) e2Var).f20605a.accept(d);
                return;
        }
    }
}
