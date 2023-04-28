package p163j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.E2 */
/* loaded from: classes2.dex */
final class C9336E2 extends AbstractC0604s2 {

    /* renamed from: c */
    private long[] f20480c;

    /* renamed from: d */
    private int f20481d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9336E2(AbstractC0546e2 e2Var) {
        super(e2Var);
    }

    @Override // p163j$.util.stream.AbstractC0541d2, p163j$.util.stream.AbstractC0546e2
    public final void accept(long j) {
        long[] jArr = this.f20480c;
        int i = this.f20481d;
        this.f20481d = i + 1;
        jArr[i] = j;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        if (j < 2147483639) {
            this.f20480c = new long[(int) j];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // p163j$.util.stream.AbstractC9421Z1, p163j$.util.stream.AbstractC0546e2
    public final void end() {
        int i = 0;
        Arrays.sort(this.f20480c, 0, this.f20481d);
        AbstractC0546e2 e2Var = this.f20611a;
        e2Var.mo16235c(this.f20481d);
        if (!this.f20748b) {
            while (i < this.f20481d) {
                e2Var.accept(this.f20480c[i]);
                i++;
            }
        } else {
            while (i < this.f20481d && !e2Var.mo16234e()) {
                e2Var.accept(this.f20480c[i]);
                i++;
            }
        }
        e2Var.end();
        this.f20480c = null;
    }
}
