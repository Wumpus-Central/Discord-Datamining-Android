package p163j$.util.stream;

import p163j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.n1 */
/* loaded from: classes2.dex */
public final class C0584n1 extends AbstractC0588o1 {

    /* renamed from: h */
    private final Object[] f20704h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0584n1(Spliterator spliterator, AbstractC0606t0 t0Var, Object[] objArr) {
        super(objArr.length, spliterator, t0Var);
        this.f20704h = objArr;
    }

    C0584n1(C0584n1 n1Var, Spliterator spliterator, long j, long j2) {
        super(n1Var, spliterator, j, j2, n1Var.f20704h.length);
        this.f20704h = n1Var.f20704h;
    }

    @Override // p163j$.util.stream.AbstractC0588o1
    /* renamed from: a */
    final AbstractC0588o1 mo16332a(Spliterator spliterator, long j, long j2) {
        return new C0584n1(this, spliterator, j, j2);
    }

    @Override // p163j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f20716f;
        if (i < this.f20717g) {
            Object[] objArr = this.f20704h;
            this.f20716f = i + 1;
            objArr[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f20716f));
    }
}
