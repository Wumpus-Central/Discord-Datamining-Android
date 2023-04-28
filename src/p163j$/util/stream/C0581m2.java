package p163j$.util.stream;

import p163j$.util.AbstractC9447y;
import p163j$.util.Spliterator;
import p163j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.m2 */
/* loaded from: classes2.dex */
public final class C0581m2 extends AbstractC0629z {

    /* renamed from: s */
    final /* synthetic */ long f20698s;

    /* renamed from: t */
    final /* synthetic */ long f20699t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0581m2(AbstractC9318B b, int i, long j, long j2) {
        super(b, i);
        this.f20698s = j;
        this.f20699t = j2;
    }

    /* renamed from: h1 */
    static AbstractC9447y m16333h1(AbstractC9447y yVar, long j, long j2, long j3) {
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
        return new C9434r3(yVar, j5, j4);
    }

    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: U0 */
    final AbstractC9324C0 mo16231U0(Spliterator spliterator, IntFunction intFunction, AbstractC0533c cVar) {
        long v0 = cVar.mo16257v0(spliterator);
        return (v0 <= 0 || !spliterator.hasCharacteristics(Spliterator.SUBSIZED)) ? !EnumC9394S2.ORDERED.m16439d(cVar.mo16302A0()) ? AbstractC0606t0.m16265n0(this, m16333h1((AbstractC9447y) cVar.m16379b1(spliterator), this.f20698s, this.f20699t, v0), true) : (AbstractC9324C0) new C0589o2(this, cVar, spliterator, intFunction, this.f20698s, this.f20699t).invoke() : AbstractC0606t0.m16265n0(cVar, AbstractC0593p2.m16315b(cVar.m16384R0(), spliterator, this.f20698s, this.f20699t), true);
    }

    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: V0 */
    final Spliterator mo16323V0(AbstractC0533c cVar, Spliterator spliterator) {
        long v0 = cVar.mo16257v0(spliterator);
        if (v0 <= 0 || !spliterator.hasCharacteristics(Spliterator.SUBSIZED)) {
            return !EnumC9394S2.ORDERED.m16439d(cVar.mo16302A0()) ? m16333h1((AbstractC9447y) cVar.m16379b1(spliterator), this.f20698s, this.f20699t, v0) : ((AbstractC9324C0) new C0589o2(this, cVar, spliterator, new C9353I0(9), this.f20698s, this.f20699t).invoke()).mo42181spliterator();
        }
        long j = this.f20698s;
        return new C9425j3((AbstractC9447y) cVar.m16379b1(spliterator), j, AbstractC0593p2.m16316a(j, this.f20699t));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: X0 */
    public final AbstractC0546e2 mo16230X0(int i, AbstractC0546e2 e2Var) {
        return new C0577l2(this, e2Var);
    }
}
