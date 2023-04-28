package p163j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.x */
/* loaded from: classes2.dex */
public final class C0621x extends AbstractC9313A {

    /* renamed from: s */
    public final /* synthetic */ int f20784s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0621x(AbstractC0533c cVar, int i, int i2) {
        super(cVar, i);
        this.f20784s = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: X0 */
    public final AbstractC0546e2 mo16230X0(int i, AbstractC0546e2 e2Var) {
        switch (this.f20784s) {
            case 0:
                return e2Var;
            case 1:
                return new C9403V(this, e2Var, 2);
            default:
                return new C0544e0(this, e2Var, 0);
        }
    }
}
