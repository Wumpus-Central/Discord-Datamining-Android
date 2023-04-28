package p163j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.C2 */
/* loaded from: classes2.dex */
final class C9326C2 extends AbstractC0597q2 {

    /* renamed from: c */
    private double[] f20458c;

    /* renamed from: d */
    private int f20459d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9326C2(AbstractC0546e2 e2Var) {
        super(e2Var);
    }

    @Override // p163j$.util.stream.AbstractC0531b2, p163j$.util.function.AbstractC0494i
    public final void accept(double d) {
        double[] dArr = this.f20458c;
        int i = this.f20459d;
        this.f20459d = i + 1;
        dArr[i] = d;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        if (j < 2147483639) {
            this.f20458c = new double[(int) j];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // p163j$.util.stream.AbstractC9413X1, p163j$.util.stream.AbstractC0546e2
    public final void end() {
        int i = 0;
        Arrays.sort(this.f20458c, 0, this.f20459d);
        AbstractC0546e2 e2Var = this.f20605a;
        e2Var.mo16235c(this.f20459d);
        if (!this.f20731b) {
            while (i < this.f20459d) {
                e2Var.accept(this.f20458c[i]);
                i++;
            }
        } else {
            while (i < this.f20459d && !e2Var.mo16234e()) {
                e2Var.accept(this.f20458c[i]);
                i++;
            }
        }
        e2Var.end();
        this.f20458c = null;
    }
}
