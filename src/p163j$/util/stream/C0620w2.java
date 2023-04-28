package p163j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.w2 */
/* loaded from: classes2.dex */
final class C0620w2 extends AbstractC0604s2 {

    /* renamed from: c */
    private C9371M2 f20782c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0620w2(AbstractC0546e2 e2Var) {
        super(e2Var);
    }

    @Override // p163j$.util.stream.AbstractC0541d2, p163j$.util.stream.AbstractC0546e2
    public final void accept(long j) {
        this.f20782c.accept(j);
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        if (j < 2147483639) {
            this.f20782c = j > 0 ? new C9371M2((int) j) : new C9371M2();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // p163j$.util.stream.AbstractC9421Z1, p163j$.util.stream.AbstractC0546e2
    public final void end() {
        long[] jArr = (long[]) this.f20782c.mo16343b();
        Arrays.sort(jArr);
        AbstractC0546e2 e2Var = this.f20611a;
        e2Var.mo16235c(jArr.length);
        int i = 0;
        if (!this.f20748b) {
            int length = jArr.length;
            while (i < length) {
                e2Var.accept(jArr[i]);
                i++;
            }
        } else {
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                if (e2Var.mo16234e()) {
                    break;
                }
                e2Var.accept(j);
                i++;
            }
        }
        e2Var.end();
    }
}
