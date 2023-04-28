package p163j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.W */
/* loaded from: classes2.dex */
public final class C9407W extends AbstractC0559h0 {

    /* renamed from: s */
    public final /* synthetic */ int f20603s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9407W(AbstractC0533c cVar, int i, int i2) {
        super(cVar, i);
        this.f20603s = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: X0 */
    public final AbstractC0546e2 mo16230X0(int i, AbstractC0546e2 e2Var) {
        switch (this.f20603s) {
            case 0:
                return new C9403V(this, e2Var, 0);
            default:
                return e2Var;
        }
    }
}
