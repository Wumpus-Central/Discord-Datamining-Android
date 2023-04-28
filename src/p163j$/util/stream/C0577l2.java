package p163j$.util.stream;

/* renamed from: j$.util.stream.l2 */
/* loaded from: classes2.dex */
final class C0577l2 extends AbstractC9413X1 {

    /* renamed from: b */
    long f20689b;

    /* renamed from: c */
    long f20690c;

    /* renamed from: d */
    final /* synthetic */ C0581m2 f20691d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0577l2(C0581m2 m2Var, AbstractC0546e2 e2Var) {
        super(e2Var);
        this.f20691d = m2Var;
        this.f20689b = m2Var.f20698s;
        long j = m2Var.f20699t;
        this.f20690c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // p163j$.util.stream.AbstractC0531b2, p163j$.util.function.AbstractC0494i
    public final void accept(double d) {
        long j = this.f20689b;
        if (j == 0) {
            long j2 = this.f20690c;
            if (j2 > 0) {
                this.f20690c = j2 - 1;
                this.f20605a.accept(d);
                return;
            }
            return;
        }
        this.f20689b = j - 1;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        this.f20605a.mo16235c(AbstractC0593p2.m16314c(j, this.f20691d.f20698s, this.f20690c));
    }

    @Override // p163j$.util.stream.AbstractC9413X1, p163j$.util.stream.AbstractC0546e2
    /* renamed from: e */
    public final boolean mo16234e() {
        return this.f20690c == 0 || this.f20605a.mo16234e();
    }
}
