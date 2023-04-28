package p163j$.util.stream;

import java.util.Arrays;
import p163j$.util.Spliterator;
import p163j$.util.function.IntFunction;

/* renamed from: j$.util.stream.z2 */
/* loaded from: classes2.dex */
final class C0632z2 extends AbstractC0554g0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0632z2(AbstractC0563i0 i0Var) {
        super(i0Var, EnumC9394S2.f20575q | EnumC9394S2.f20573o);
    }

    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: U0 */
    public final AbstractC9324C0 mo16231U0(Spliterator spliterator, IntFunction intFunction, AbstractC0533c cVar) {
        if (EnumC9394S2.SORTED.m16439d(cVar.mo16302A0())) {
            return cVar.m16387L0(spliterator, false, intFunction);
        }
        long[] jArr = (long[]) ((AbstractC9314A0) cVar.m16387L0(spliterator, true, intFunction)).mo16343b();
        Arrays.sort(jArr);
        return new C0560h1(jArr);
    }

    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: X0 */
    public final AbstractC0546e2 mo16230X0(int i, AbstractC0546e2 e2Var) {
        e2Var.getClass();
        return EnumC9394S2.SORTED.m16439d(i) ? e2Var : EnumC9394S2.SIZED.m16439d(i) ? new C9336E2(e2Var) : new C0620w2(e2Var);
    }
}
