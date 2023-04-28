package p163j$.util.stream;

import p163j$.util.function.Function;

/* renamed from: j$.util.stream.S1 */
/* loaded from: classes2.dex */
final class C9393S1 extends AbstractC9405V1 {

    /* renamed from: s */
    public final /* synthetic */ int f20562s;

    /* renamed from: t */
    final /* synthetic */ Function f20563t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9393S1(AbstractC0533c cVar, int i, Function function, int i2) {
        super(cVar, i);
        this.f20562s = i2;
        this.f20563t = function;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: X0 */
    public final AbstractC0546e2 mo16230X0(int i, AbstractC0546e2 e2Var) {
        switch (this.f20562s) {
            case 0:
                return new C9386Q1(this, e2Var, 2);
            default:
                return new C9386Q1(this, e2Var, 6);
        }
    }
}
