package p163j$.util.stream;

/* renamed from: j$.util.stream.h2 */
/* loaded from: classes2.dex */
final class C0561h2 extends AbstractC9417Y1 {

    /* renamed from: b */
    long f20670b;

    /* renamed from: c */
    long f20671c;

    /* renamed from: d */
    final /* synthetic */ C0565i2 f20672d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0561h2(C0565i2 i2Var, AbstractC0546e2 e2Var) {
        super(e2Var);
        this.f20672d = i2Var;
        this.f20670b = i2Var.f20674s;
        long j = i2Var.f20675t;
        this.f20671c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // p163j$.util.stream.AbstractC0536c2, p163j$.util.stream.AbstractC0546e2
    public final void accept(int i) {
        long j = this.f20670b;
        if (j == 0) {
            long j2 = this.f20671c;
            if (j2 > 0) {
                this.f20671c = j2 - 1;
                this.f20609a.accept(i);
                return;
            }
            return;
        }
        this.f20670b = j - 1;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        this.f20609a.mo16235c(AbstractC0593p2.m16314c(j, this.f20672d.f20674s, this.f20671c));
    }

    @Override // p163j$.util.stream.AbstractC9417Y1, p163j$.util.stream.AbstractC0546e2
    /* renamed from: e */
    public final boolean mo16234e() {
        return this.f20671c == 0 || this.f20609a.mo16234e();
    }
}
