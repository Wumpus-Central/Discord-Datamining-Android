package p390w;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import p390w.AbstractC13662r0;

/* renamed from: w.x1 */
/* loaded from: classes.dex */
public final class C13696x1 extends C13582c2 implements AbstractC13692w1 {

    /* renamed from: z */
    private static final AbstractC13662r0.EnumC13665c f30584z = AbstractC13662r0.EnumC13665c.OPTIONAL;

    private C13696x1(TreeMap<AbstractC13662r0.AbstractC13663a<?>, Map<AbstractC13662r0.EnumC13665c, Object>> treeMap) {
        super(treeMap);
    }

    /* renamed from: J */
    public static C13696x1 m3002J() {
        return new C13696x1(new TreeMap(C13582c2.f30372x));
    }

    /* renamed from: K */
    public static C13696x1 m3001K(AbstractC13662r0 r0Var) {
        TreeMap treeMap = new TreeMap(C13582c2.f30372x);
        for (AbstractC13662r0.AbstractC13663a<?> aVar : r0Var.mo2975c()) {
            Set<AbstractC13662r0.EnumC13665c> x = r0Var.mo2959x(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (AbstractC13662r0.EnumC13665c cVar : x) {
                arrayMap.put(cVar, r0Var.mo2987A(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new C13696x1(treeMap);
    }

    @Override // p390w.AbstractC13692w1
    /* renamed from: E */
    public <ValueT> void mo3003E(AbstractC13662r0.AbstractC13663a<ValueT> aVar, AbstractC13662r0.EnumC13665c cVar, ValueT valuet) {
        Map<AbstractC13662r0.EnumC13665c, Object> map = this.f30374w.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f30374w.put(aVar, arrayMap);
            arrayMap.put(cVar, valuet);
            return;
        }
        AbstractC13662r0.EnumC13665c cVar2 = (AbstractC13662r0.EnumC13665c) Collections.min(map.keySet());
        if (Objects.equals(map.get(cVar2), valuet) || !C13656q0.m3109a(cVar2, cVar)) {
            map.put(cVar, valuet);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + aVar.mo3100c() + ", existing value (" + cVar2 + ")=" + map.get(cVar2) + ", conflicting (" + cVar + ")=" + valuet);
    }

    /* renamed from: L */
    public <ValueT> ValueT m3000L(AbstractC13662r0.AbstractC13663a<ValueT> aVar) {
        return (ValueT) this.f30374w.remove(aVar);
    }

    @Override // p390w.AbstractC13692w1
    /* renamed from: u */
    public <ValueT> void mo2999u(AbstractC13662r0.AbstractC13663a<ValueT> aVar, ValueT valuet) {
        mo3003E(aVar, f30584z, valuet);
    }
}
