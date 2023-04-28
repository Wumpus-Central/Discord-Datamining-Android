package p163j$.util.stream;

import java.util.Arrays;
import java.util.Comparator;
import p163j$.util.Comparator;
import p163j$.util.Spliterator;
import p163j$.util.function.IntFunction;

/* renamed from: j$.util.stream.A2 */
/* loaded from: classes2.dex */
final class C9316A2 extends AbstractC9401U1 {

    /* renamed from: s */
    private final boolean f20446s;

    /* renamed from: t */
    private final Comparator f20447t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9316A2(AbstractC0533c cVar) {
        super(cVar, EnumC9394S2.f20575q | EnumC9394S2.f20573o);
        this.f20446s = true;
        this.f20447t = Comparator.CC.naturalOrder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9316A2(AbstractC0533c cVar, java.util.Comparator comparator) {
        super(cVar, EnumC9394S2.f20575q | EnumC9394S2.f20574p);
        this.f20446s = false;
        comparator.getClass();
        this.f20447t = comparator;
    }

    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: U0 */
    public final AbstractC9324C0 mo16231U0(Spliterator spliterator, IntFunction intFunction, AbstractC0533c cVar) {
        if (EnumC9394S2.SORTED.m16439d(cVar.mo16302A0()) && this.f20446s) {
            return cVar.m16387L0(spliterator, false, intFunction);
        }
        Object[] m = cVar.m16387L0(spliterator, true, intFunction).mo16318m(intFunction);
        Arrays.sort(m, this.f20447t);
        return new C9339F0(m);
    }

    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: X0 */
    public final AbstractC0546e2 mo16230X0(int i, AbstractC0546e2 e2Var) {
        e2Var.getClass();
        if (EnumC9394S2.SORTED.m16439d(i) && this.f20446s) {
            return e2Var;
        }
        boolean d = EnumC9394S2.SIZED.m16439d(i);
        java.util.Comparator comparator = this.f20447t;
        return d ? new C9341F2(e2Var, comparator) : new C9321B2(e2Var, comparator);
    }
}
