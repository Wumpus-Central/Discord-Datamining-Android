package p163j$.util.stream;

import p163j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.m1 */
/* loaded from: classes2.dex */
public final class C0580m1 extends AbstractC0588o1 implements AbstractC0541d2 {

    /* renamed from: h */
    private final long[] f20697h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0580m1(Spliterator spliterator, AbstractC0606t0 t0Var, long[] jArr) {
        super(jArr.length, spliterator, t0Var);
        this.f20697h = jArr;
    }

    C0580m1(C0580m1 m1Var, Spliterator spliterator, long j, long j2) {
        super(m1Var, spliterator, j, j2, m1Var.f20697h.length);
        this.f20697h = m1Var.f20697h;
    }

    @Override // p163j$.util.stream.AbstractC0588o1
    /* renamed from: a */
    final AbstractC0588o1 mo16332a(Spliterator spliterator, long j, long j2) {
        return new C0580m1(this, spliterator, j, j2);
    }

    @Override // p163j$.util.stream.AbstractC0588o1, p163j$.util.stream.AbstractC0546e2
    public final void accept(long j) {
        int i = this.f20716f;
        if (i < this.f20717g) {
            long[] jArr = this.f20697h;
            this.f20716f = i + 1;
            jArr[i] = j;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f20716f));
    }

    @Override // p163j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo16243j((Long) obj);
    }

    @Override // p163j$.util.stream.AbstractC0541d2
    /* renamed from: j */
    public final /* synthetic */ void mo16243j(Long l) {
        AbstractC0606t0.m16286T(this, l);
    }
}
