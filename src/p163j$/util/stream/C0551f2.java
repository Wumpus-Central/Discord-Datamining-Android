package p163j$.util.stream;

/* renamed from: j$.util.stream.f2 */
/* loaded from: classes2.dex */
final class C0551f2 extends AbstractC0526a2 {

    /* renamed from: b */
    long f20655b;

    /* renamed from: c */
    long f20656c;

    /* renamed from: d */
    final /* synthetic */ C0556g2 f20657d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0551f2(C0556g2 g2Var, AbstractC0546e2 e2Var) {
        super(e2Var);
        this.f20657d = g2Var;
        this.f20655b = g2Var.f20664s;
        long j = g2Var.f20665t;
        this.f20656c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // p163j$.util.function.Consumer
    public final void accept(Object obj) {
        long j = this.f20655b;
        if (j == 0) {
            long j2 = this.f20656c;
            if (j2 > 0) {
                this.f20656c = j2 - 1;
                this.f20615a.accept((AbstractC0546e2) obj);
                return;
            }
            return;
        }
        this.f20655b = j - 1;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        this.f20615a.mo16235c(AbstractC0593p2.m16314c(j, this.f20657d.f20664s, this.f20656c));
    }

    @Override // p163j$.util.stream.AbstractC0526a2, p163j$.util.stream.AbstractC0546e2
    /* renamed from: e */
    public final boolean mo16234e() {
        return this.f20656c == 0 || this.f20615a.mo16234e();
    }
}
