package p163j$.util.stream;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import p163j$.util.Spliterator;
import p163j$.util.concurrent.ConcurrentHashMap;
import p163j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.p */
/* loaded from: classes2.dex */
public final class C0590p extends AbstractC9401U1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0590p(AbstractC0533c cVar, int i) {
        super(cVar, i);
    }

    /* renamed from: c1 */
    static C9344G0 m16322c1(AbstractC0533c cVar, Spliterator spliterator) {
        C9353I0 i0 = new C9353I0(15);
        C9353I0 i02 = new C9353I0(16);
        return new C9344G0((Collection) new C0611u1(EnumC9398T2.REFERENCE, new C9353I0(17), i02, i0, 3).mo16268l(cVar, spliterator));
    }

    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: U0 */
    final AbstractC9324C0 mo16231U0(Spliterator spliterator, IntFunction intFunction, AbstractC0533c cVar) {
        if (EnumC9394S2.DISTINCT.m16439d(cVar.mo16302A0())) {
            return cVar.m16387L0(spliterator, false, intFunction);
        }
        if (EnumC9394S2.ORDERED.m16439d(cVar.mo16302A0())) {
            return m16322c1(cVar, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        new C9376O(new C0578m(0, atomicBoolean, concurrentHashMap), false).mo16268l(cVar, spliterator);
        Collection keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new C9344G0(keySet);
    }

    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: V0 */
    final Spliterator mo16323V0(AbstractC0533c cVar, Spliterator spliterator) {
        return EnumC9394S2.DISTINCT.m16439d(cVar.mo16302A0()) ? cVar.m16379b1(spliterator) : EnumC9394S2.ORDERED.m16439d(cVar.mo16302A0()) ? m16322c1(cVar, spliterator).mo42181spliterator() : new C0532b3(cVar.m16379b1(spliterator));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p163j$.util.stream.AbstractC0533c
    /* renamed from: X0 */
    public final AbstractC0546e2 mo16230X0(int i, AbstractC0546e2 e2Var) {
        e2Var.getClass();
        return EnumC9394S2.DISTINCT.m16439d(i) ? e2Var : EnumC9394S2.SORTED.m16439d(i) ? new C0582n(e2Var) : new C0586o(this, e2Var);
    }
}
