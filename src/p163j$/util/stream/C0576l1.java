package p163j$.util.stream;

import p163j$.util.Spliterator;
import p163j$.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.l1 */
/* loaded from: classes2.dex */
public final class C0576l1 extends AbstractC0588o1 implements AbstractC0536c2 {

    /* renamed from: h */
    private final int[] f20688h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0576l1(Spliterator spliterator, AbstractC0606t0 t0Var, int[] iArr) {
        super(iArr.length, spliterator, t0Var);
        this.f20688h = iArr;
    }

    C0576l1(C0576l1 l1Var, Spliterator spliterator, long j, long j2) {
        super(l1Var, spliterator, j, j2, l1Var.f20688h.length);
        this.f20688h = l1Var.f20688h;
    }

    @Override // p163j$.util.stream.AbstractC0588o1
    /* renamed from: a */
    final AbstractC0588o1 mo16332a(Spliterator spliterator, long j, long j2) {
        return new C0576l1(this, spliterator, j, j2);
    }

    @Override // p163j$.util.stream.AbstractC0588o1, p163j$.util.stream.AbstractC0546e2
    public final void accept(int i) {
        int i2 = this.f20716f;
        if (i2 < this.f20717g) {
            int[] iArr = this.f20688h;
            this.f20716f = i2 + 1;
            iArr[i2] = i;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f20716f));
    }

    @Override // p163j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo16334d((Integer) obj);
    }

    @Override // p163j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return intConsumer.getClass();
    }

    @Override // p163j$.util.stream.AbstractC0536c2
    /* renamed from: d */
    public final /* synthetic */ void mo16334d(Integer num) {
        AbstractC0606t0.m16288R(this, num);
    }
}
