package p163j$.util.stream;

import p163j$.util.Spliterator;
import p163j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.g2 */
/* loaded from: classes2.dex */
public final class C0556g2 extends AbstractC9401U1 {

    /* renamed from: s */
    final /* synthetic */ long f20664s;

    /* renamed from: t */
    final /* synthetic */ long f20665t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0556g2(AbstractC0533c cVar, int i, long j, long j2) {
        super(cVar, i);
        this.f20664s = j;
        this.f20665t = j2;
    }

    /* renamed from: c1 */
    static Spliterator m16364c1(Spliterator spliterator, long j, long j2, long j3) {
        long j4;
        long j5;
        if (j <= j3) {
            long j6 = j3 - j;
            j4 = j2 >= 0 ? Math.min(j2, j6) : j6;
            j5 = 0;
        } else {
            j5 = j;
            j4 = j2;
        }
        return new C9438v3(spliterator, j5, j4);
    }

    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: U0 */
    final AbstractC9324C0 mo16231U0(Spliterator spliterator, IntFunction intFunction, AbstractC0533c cVar) {
        long v0 = cVar.mo16257v0(spliterator);
        return (v0 <= 0 || !spliterator.hasCharacteristics(Spliterator.SUBSIZED)) ? !EnumC9394S2.ORDERED.m16439d(cVar.mo16302A0()) ? AbstractC0606t0.m16266m0(this, m16364c1(cVar.m16379b1(spliterator), this.f20664s, this.f20665t, v0), true, intFunction) : (AbstractC9324C0) new C0589o2(this, cVar, spliterator, intFunction, this.f20664s, this.f20665t).invoke() : AbstractC0606t0.m16266m0(cVar, AbstractC0593p2.m16315b(cVar.m16384R0(), spliterator, this.f20664s, this.f20665t), true, intFunction);
    }

    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: V0 */
    final Spliterator mo16323V0(AbstractC0533c cVar, Spliterator spliterator) {
        long v0 = cVar.mo16257v0(spliterator);
        if (v0 <= 0 || !spliterator.hasCharacteristics(Spliterator.SUBSIZED)) {
            return !EnumC9394S2.ORDERED.m16439d(cVar.mo16302A0()) ? m16364c1(cVar.m16379b1(spliterator), this.f20664s, this.f20665t, v0) : ((AbstractC9324C0) new C0589o2(this, cVar, spliterator, new C9353I0(6), this.f20664s, this.f20665t).invoke()).mo42181spliterator();
        }
        Spliterator b1 = cVar.m16379b1(spliterator);
        long j = this.f20664s;
        return new C9431p3(b1, j, AbstractC0593p2.m16316a(j, this.f20665t));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: X0 */
    public final AbstractC0546e2 mo16230X0(int i, AbstractC0546e2 e2Var) {
        return new C0551f2(this, e2Var);
    }
}
