package p163j$.util.stream;

import p163j$.util.AbstractC0518n;
import p163j$.util.Spliterator;
import p163j$.util.function.Consumer;
import p163j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.f3 */
/* loaded from: classes2.dex */
final class C0552f3 extends AbstractC9402U2 implements Spliterator.OfInt {
    C0552f3(AbstractC0606t0 t0Var, Spliterator spliterator, boolean z) {
        super(t0Var, spliterator, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0552f3(AbstractC0606t0 t0Var, C0523a aVar, boolean z) {
        super(t0Var, aVar, z);
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0518n.m16488d(this, consumer);
    }

    @Override // p163j$.util.Spliterator.OfInt
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.f20598h != null || this.f20599i) {
            do {
            } while (tryAdvance(intConsumer));
            return;
        }
        intConsumer.getClass();
        m16431e();
        C0547e3 e3Var = new C0547e3(intConsumer, 1);
        this.f20592b.mo16294J0(this.f20594d, e3Var);
        this.f20599i = true;
    }

    @Override // p163j$.util.stream.AbstractC9402U2
    /* renamed from: h */
    final void mo16229h() {
        C9363K2 k2 = new C9363K2();
        this.f20598h = k2;
        this.f20595e = this.f20592b.mo16293K0(new C0547e3(k2, 0));
        this.f20596f = new C0523a(5, this);
    }

    @Override // p163j$.util.stream.AbstractC9402U2
    /* renamed from: i */
    final AbstractC9402U2 mo16228i(Spliterator spliterator) {
        return new C0552f3(this.f20592b, spliterator, this.f20591a);
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0518n.m16485i(this, consumer);
    }

    @Override // p163j$.util.Spliterator.OfInt
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        boolean c = m16433c();
        if (c) {
            C9363K2 k2 = (C9363K2) this.f20598h;
            long j = this.f20597g;
            int q = k2.m16452q(j);
            intConsumer.accept((k2.f20642c == 0 && q == 0) ? ((int[]) k2.f20538e)[(int) j] : ((int[][]) k2.f20539f)[q][(int) (j - k2.f20643d[q])]);
        }
        return c;
    }

    @Override // p163j$.util.stream.AbstractC9402U2, p163j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }
}
