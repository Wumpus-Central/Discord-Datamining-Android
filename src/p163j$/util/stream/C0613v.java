package p163j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.v */
/* loaded from: classes2.dex */
public final class C0613v extends AbstractC0524a0 {

    /* renamed from: s */
    public final /* synthetic */ int f20771s;

    /* renamed from: t */
    final /* synthetic */ Object f20772t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0613v(AbstractC0533c cVar, int i, Object obj, int i2) {
        super(cVar, i);
        this.f20771s = i2;
        this.f20772t = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: X0 */
    public final AbstractC0546e2 mo16230X0(int i, AbstractC0546e2 e2Var) {
        switch (this.f20771s) {
            case 0:
                return new C0601s(this, e2Var, 2);
            case 1:
                return new C9403V(this, e2Var, 1);
            case 2:
                return new C9403V(this, e2Var, 3);
            case 3:
                return new C9403V(this, e2Var, 7);
            case 4:
                return new C9403V(this, e2Var, 8);
            case 5:
                return new C0544e0(this, e2Var, 3);
            case 6:
                return new C9386Q1(this, e2Var, 3);
            default:
                return new C0586o(this, e2Var);
        }
    }
}
