package p163j$.util.stream;

import p163j$.util.AbstractC0518n;
import p163j$.util.AbstractC9234B;
import p163j$.util.Spliterator;
import p163j$.util.function.AbstractC9290M;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.h3 */
/* loaded from: classes2.dex */
final class C9423h3 extends AbstractC9402U2 implements AbstractC9234B {
    C9423h3(AbstractC0606t0 t0Var, Spliterator spliterator, boolean z) {
        super(t0Var, spliterator, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9423h3(AbstractC0606t0 t0Var, C0523a aVar, boolean z) {
        super(t0Var, aVar, z);
    }

    @Override // p163j$.util.AbstractC9234B
    /* renamed from: a */
    public final void forEachRemaining(AbstractC9290M m) {
        if (this.f20598h != null || this.f20599i) {
            do {
            } while (tryAdvance(m));
            return;
        }
        m.getClass();
        m16431e();
        C0557g3 g3Var = new C0557g3(m, 1);
        this.f20592b.mo16294J0(this.f20594d, g3Var);
        this.f20599i = true;
    }

    @Override // p163j$.util.AbstractC9234B
    /* renamed from: b */
    public final boolean tryAdvance(AbstractC9290M m) {
        m.getClass();
        boolean c = m16433c();
        if (c) {
            C9371M2 m2 = (C9371M2) this.f20598h;
            long j = this.f20597g;
            int q = m2.m16452q(j);
            m.accept((m2.f20642c == 0 && q == 0) ? ((long[]) m2.f20538e)[(int) j] : ((long[][]) m2.f20539f)[q][(int) (j - m2.f20643d[q])]);
        }
        return c;
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0518n.m16487e(this, consumer);
    }

    @Override // p163j$.util.stream.AbstractC9402U2
    /* renamed from: h */
    final void mo16229h() {
        C9371M2 m2 = new C9371M2();
        this.f20598h = m2;
        this.f20595e = this.f20592b.mo16293K0(new C0557g3(m2, 0));
        this.f20596f = new C0523a(6, this);
    }

    @Override // p163j$.util.stream.AbstractC9402U2
    /* renamed from: i */
    final AbstractC9402U2 mo16228i(Spliterator spliterator) {
        return new C9423h3(this.f20592b, spliterator, this.f20591a);
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0518n.m16484j(this, consumer);
    }

    @Override // p163j$.util.stream.AbstractC9402U2, p163j$.util.Spliterator
    public final AbstractC9234B trySplit() {
        return (AbstractC9234B) super.trySplit();
    }
}
