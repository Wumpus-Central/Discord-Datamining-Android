package p163j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.v2 */
/* loaded from: classes2.dex */
final class C0616v2 extends AbstractC0600r2 {

    /* renamed from: c */
    private C9363K2 f20776c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0616v2(AbstractC0546e2 e2Var) {
        super(e2Var);
    }

    @Override // p163j$.util.stream.AbstractC0536c2, p163j$.util.stream.AbstractC0546e2
    public final void accept(int i) {
        this.f20776c.accept(i);
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        if (j < 2147483639) {
            this.f20776c = j > 0 ? new C9363K2((int) j) : new C9363K2();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // p163j$.util.stream.AbstractC9417Y1, p163j$.util.stream.AbstractC0546e2
    public final void end() {
        int[] iArr = (int[]) this.f20776c.mo16343b();
        Arrays.sort(iArr);
        AbstractC0546e2 e2Var = this.f20609a;
        e2Var.mo16235c(iArr.length);
        int i = 0;
        if (!this.f20741b) {
            int length = iArr.length;
            while (i < length) {
                e2Var.accept(iArr[i]);
                i++;
            }
        } else {
            int length2 = iArr.length;
            while (i < length2) {
                int i2 = iArr[i];
                if (e2Var.mo16234e()) {
                    break;
                }
                e2Var.accept(i2);
                i++;
            }
        }
        e2Var.end();
    }
}
