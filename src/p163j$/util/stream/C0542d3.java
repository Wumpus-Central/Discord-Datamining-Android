package p163j$.util.stream;

import p163j$.util.AbstractC0518n;
import p163j$.util.AbstractC9447y;
import p163j$.util.Spliterator;
import p163j$.util.function.AbstractC0494i;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.d3 */
/* loaded from: classes2.dex */
final class C0542d3 extends AbstractC9402U2 implements AbstractC9447y {
    C0542d3(AbstractC0606t0 t0Var, Spliterator spliterator, boolean z) {
        super(t0Var, spliterator, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0542d3(AbstractC0606t0 t0Var, C0523a aVar, boolean z) {
        super(t0Var, aVar, z);
    }

    @Override // p163j$.util.AbstractC9447y
    /* renamed from: f */
    public final boolean tryAdvance(AbstractC0494i iVar) {
        iVar.getClass();
        boolean c = m16433c();
        if (c) {
            C9355I2 i2 = (C9355I2) this.f20598h;
            long j = this.f20597g;
            int q = i2.m16452q(j);
            iVar.accept((i2.f20642c == 0 && q == 0) ? ((double[]) i2.f20538e)[(int) j] : ((double[][]) i2.f20539f)[q][(int) (j - i2.f20643d[q])]);
        }
        return c;
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0518n.m16489c(this, consumer);
    }

    @Override // p163j$.util.AbstractC9447y
    /* renamed from: g */
    public final void forEachRemaining(AbstractC0494i iVar) {
        if (this.f20598h != null || this.f20599i) {
            do {
            } while (tryAdvance(iVar));
            return;
        }
        iVar.getClass();
        m16431e();
        C0537c3 c3Var = new C0537c3(iVar, 1);
        this.f20592b.mo16294J0(this.f20594d, c3Var);
        this.f20599i = true;
    }

    @Override // p163j$.util.stream.AbstractC9402U2
    /* renamed from: h */
    final void mo16229h() {
        C9355I2 i2 = new C9355I2();
        this.f20598h = i2;
        this.f20595e = this.f20592b.mo16293K0(new C0537c3(i2, 0));
        this.f20596f = new C0523a(4, this);
    }

    @Override // p163j$.util.stream.AbstractC9402U2
    /* renamed from: i */
    final AbstractC9402U2 mo16228i(Spliterator spliterator) {
        return new C0542d3(this.f20592b, spliterator, this.f20591a);
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0518n.m16486h(this, consumer);
    }

    @Override // p163j$.util.stream.AbstractC9402U2, p163j$.util.Spliterator
    public final AbstractC9447y trySplit() {
        return (AbstractC9447y) super.trySplit();
    }
}
