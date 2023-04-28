package p163j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.D2 */
/* loaded from: classes2.dex */
final class C9331D2 extends AbstractC0600r2 {

    /* renamed from: c */
    private int[] f20468c;

    /* renamed from: d */
    private int f20469d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9331D2(AbstractC0546e2 e2Var) {
        super(e2Var);
    }

    @Override // p163j$.util.stream.AbstractC0536c2, p163j$.util.stream.AbstractC0546e2
    public final void accept(int i) {
        int[] iArr = this.f20468c;
        int i2 = this.f20469d;
        this.f20469d = i2 + 1;
        iArr[i2] = i;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        if (j < 2147483639) {
            this.f20468c = new int[(int) j];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // p163j$.util.stream.AbstractC9417Y1, p163j$.util.stream.AbstractC0546e2
    public final void end() {
        int i = 0;
        Arrays.sort(this.f20468c, 0, this.f20469d);
        AbstractC0546e2 e2Var = this.f20609a;
        e2Var.mo16235c(this.f20469d);
        if (!this.f20741b) {
            while (i < this.f20469d) {
                e2Var.accept(this.f20468c[i]);
                i++;
            }
        } else {
            while (i < this.f20469d && !e2Var.mo16234e()) {
                e2Var.accept(this.f20468c[i]);
                i++;
            }
        }
        e2Var.end();
        this.f20468c = null;
    }
}
