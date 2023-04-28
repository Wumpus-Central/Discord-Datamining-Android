package p163j$.util.stream;

import p163j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.T */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9395T implements IntConsumer {

    /* renamed from: a */
    public final /* synthetic */ int f20587a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0546e2 f20588b;

    public /* synthetic */ C9395T(int i, AbstractC0546e2 e2Var) {
        this.f20587a = i;
        this.f20588b = e2Var;
    }

    @Override // p163j$.util.function.IntConsumer
    public final void accept(int i) {
        int i2 = this.f20587a;
        AbstractC0546e2 e2Var = this.f20588b;
        switch (i2) {
            case 0:
                e2Var.accept(i);
                return;
            default:
                ((C9403V) e2Var).f20609a.accept(i);
                return;
        }
    }

    @Override // p163j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f20587a) {
            case 0:
                return intConsumer.getClass();
            default:
                return intConsumer.getClass();
        }
    }
}
