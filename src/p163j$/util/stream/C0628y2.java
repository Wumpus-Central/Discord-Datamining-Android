package p163j$.util.stream;

import java.util.Arrays;
import p163j$.util.Spliterator;
import p163j$.util.function.IntFunction;

/* renamed from: j$.util.stream.y2 */
/* loaded from: classes2.dex */
final class C0628y2 extends AbstractC9419Z {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0628y2(AbstractC0533c cVar) {
        super(cVar, EnumC9394S2.f20575q | EnumC9394S2.f20573o);
    }

    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: U0 */
    public final AbstractC9324C0 mo16231U0(Spliterator spliterator, IntFunction intFunction, AbstractC0533c cVar) {
        if (EnumC9394S2.SORTED.m16439d(cVar.mo16302A0())) {
            return cVar.m16387L0(spliterator, false, intFunction);
        }
        int[] iArr = (int[]) ((AbstractC0630z0) cVar.m16387L0(spliterator, true, intFunction)).mo16343b();
        Arrays.sort(iArr);
        return new C9416Y0(iArr);
    }

    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: X0 */
    public final AbstractC0546e2 mo16230X0(int i, AbstractC0546e2 e2Var) {
        e2Var.getClass();
        return EnumC9394S2.SORTED.m16439d(i) ? e2Var : EnumC9394S2.SIZED.m16439d(i) ? new C9331D2(e2Var) : new C0616v2(e2Var);
    }
}
