package p163j$.util.stream;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: j$.util.stream.F2 */
/* loaded from: classes2.dex */
final class C9341F2 extends AbstractC0608t2 {

    /* renamed from: d */
    private Object[] f20487d;

    /* renamed from: e */
    private int f20488e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9341F2(AbstractC0546e2 e2Var, Comparator comparator) {
        super(e2Var, comparator);
    }

    @Override // p163j$.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.f20487d;
        int i = this.f20488e;
        this.f20488e = i + 1;
        objArr[i] = obj;
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        if (j < 2147483639) {
            this.f20487d = new Object[(int) j];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // p163j$.util.stream.AbstractC0526a2, p163j$.util.stream.AbstractC0546e2
    public final void end() {
        int i = 0;
        Arrays.sort(this.f20487d, 0, this.f20488e, this.f20761b);
        AbstractC0546e2 e2Var = this.f20615a;
        e2Var.mo16235c(this.f20488e);
        if (!this.f20762c) {
            while (i < this.f20488e) {
                e2Var.accept((AbstractC0546e2) this.f20487d[i]);
                i++;
            }
        } else {
            while (i < this.f20488e && !e2Var.mo16234e()) {
                e2Var.accept((AbstractC0546e2) this.f20487d[i]);
                i++;
            }
        }
        e2Var.end();
        this.f20487d = null;
    }
}
