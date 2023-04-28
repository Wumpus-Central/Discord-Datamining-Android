package p163j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.u2 */
/* loaded from: classes2.dex */
final class C0612u2 extends AbstractC0597q2 {

    /* renamed from: c */
    private C9355I2 f20770c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0612u2(AbstractC0546e2 e2Var) {
        super(e2Var);
    }

    @Override // p163j$.util.stream.AbstractC0531b2, p163j$.util.function.AbstractC0494i
    public final void accept(double d) {
        this.f20770c.accept(d);
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        if (j < 2147483639) {
            this.f20770c = j > 0 ? new C9355I2((int) j) : new C9355I2();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // p163j$.util.stream.AbstractC9413X1, p163j$.util.stream.AbstractC0546e2
    public final void end() {
        double[] dArr = (double[]) this.f20770c.mo16343b();
        Arrays.sort(dArr);
        AbstractC0546e2 e2Var = this.f20605a;
        e2Var.mo16235c(dArr.length);
        int i = 0;
        if (!this.f20731b) {
            int length = dArr.length;
            while (i < length) {
                e2Var.accept(dArr[i]);
                i++;
            }
        } else {
            int length2 = dArr.length;
            while (i < length2) {
                double d = dArr[i];
                if (e2Var.mo16234e()) {
                    break;
                }
                e2Var.accept(d);
                i++;
            }
        }
        e2Var.end();
    }
}
