package p163j$.util.stream;

import p163j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.k1 */
/* loaded from: classes2.dex */
public final class C0572k1 extends AbstractC0588o1 implements AbstractC0531b2 {

    /* renamed from: h */
    private final double[] f20681h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0572k1(Spliterator spliterator, AbstractC0606t0 t0Var, double[] dArr) {
        super(dArr.length, spliterator, t0Var);
        this.f20681h = dArr;
    }

    C0572k1(C0572k1 k1Var, Spliterator spliterator, long j, long j2) {
        super(k1Var, spliterator, j, j2, k1Var.f20681h.length);
        this.f20681h = k1Var.f20681h;
    }

    @Override // p163j$.util.stream.AbstractC0588o1
    /* renamed from: a */
    final AbstractC0588o1 mo16332a(Spliterator spliterator, long j, long j2) {
        return new C0572k1(this, spliterator, j, j2);
    }

    @Override // p163j$.util.stream.AbstractC0588o1, p163j$.util.stream.AbstractC0546e2, p163j$.util.stream.AbstractC0531b2, p163j$.util.function.AbstractC0494i
    public final void accept(double d) {
        int i = this.f20716f;
        if (i < this.f20717g) {
            double[] dArr = this.f20681h;
            this.f20716f = i + 1;
            dArr[i] = d;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f20716f));
    }

    @Override // p163j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo16232k((Double) obj);
    }

    @Override // p163j$.util.stream.AbstractC0531b2
    /* renamed from: k */
    public final /* synthetic */ void mo16232k(Double d) {
        AbstractC0606t0.m16290P(this, d);
    }
}
