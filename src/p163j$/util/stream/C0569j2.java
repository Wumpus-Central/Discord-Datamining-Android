package p163j$.util.stream;

/* renamed from: j$.util.stream.j2 */
/* loaded from: classes2.dex */
final class C0569j2 extends AbstractC9421Z1 {

    /* renamed from: b */
    long f20678b;

    /* renamed from: c */
    long f20679c;

    /* renamed from: d */
    final /* synthetic */ C0573k2 f20680d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0569j2(C0573k2 k2Var, AbstractC0546e2 e2Var) {
        super(e2Var);
        this.f20680d = k2Var;
        this.f20678b = k2Var.f20682s;
        long j = k2Var.f20683t;
        this.f20679c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // p163j$.util.stream.AbstractC0541d2, p163j$.util.stream.AbstractC0546e2
    public final void accept(long j) {
        long j2 = this.f20678b;
        if (j2 == 0) {
            long j3 = this.f20679c;
            if (j3 > 0) {
                this.f20679c = j3 - 1;
                this.f20611a.accept(j);
                return;
            }
            return;
        }
        this.f20678b = j2 - 1;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        this.f20611a.mo16235c(AbstractC0593p2.m16314c(j, this.f20680d.f20682s, this.f20679c));
    }

    @Override // p163j$.util.stream.AbstractC9421Z1, p163j$.util.stream.AbstractC0546e2
    /* renamed from: e */
    public final boolean mo16234e() {
        return this.f20679c == 0 || this.f20611a.mo16234e();
    }
}
