package gi;

import fi.AbstractC7267g0;
import fi.AbstractC7275h1;
import fi.AbstractC7290k1;
import fi.AbstractC7304o0;
import fi.AbstractC7335v1;
import fi.C7270h0;
import fi.C7309p1;
import fi.EnumC7338w1;
import gi.AbstractC7661f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ki.C9883a;
import kotlin.Pair;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import p182ji.EnumC9611b;
import p268og.AbstractC11319f1;

/* renamed from: gi.k */
/* loaded from: classes8.dex */
public final class C7673k {
    /* renamed from: a */
    private static final List<AbstractC7290k1> m21679a(AbstractC7335v1 v1Var, EnumC9611b bVar) {
        List<Pair> K0;
        int t;
        AbstractC7335v1 v1Var2;
        boolean z;
        if (v1Var.mo5174L0().size() != v1Var.mo5172N0().getParameters().size()) {
            return null;
        }
        List<AbstractC7290k1> L0 = v1Var.mo5174L0();
        boolean z2 = true;
        if (!(L0 instanceof Collection) || !L0.isEmpty()) {
            Iterator<T> it = L0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((AbstractC7290k1) it.next()).mo22906b() == EnumC7338w1.INVARIANT) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    z2 = false;
                    break;
                }
            }
        }
        if (z2) {
            return null;
        }
        List<AbstractC11319f1> parameters = v1Var.mo5172N0().getParameters();
        C9971q.m14634f(parameters, "type.constructor.parameters");
        K0 = C9914r.m14781K0(L0, parameters);
        t = C9907k.m14809t(K0, 10);
        ArrayList arrayList = new ArrayList(t);
        for (Pair pair : K0) {
            AbstractC7290k1 k1Var = (AbstractC7290k1) pair.m15067a();
            AbstractC11319f1 parameter = (AbstractC11319f1) pair.m15066b();
            if (k1Var.mo22906b() != EnumC7338w1.INVARIANT) {
                if (k1Var.mo22907a() || k1Var.mo22906b() != EnumC7338w1.IN_VARIANCE) {
                    v1Var2 = null;
                } else {
                    v1Var2 = k1Var.getType().mo22868Q0();
                }
                C9971q.m14634f(parameter, "parameter");
                k1Var = C9883a.m15104a(new C7667i(bVar, v1Var2, k1Var, parameter));
            }
            arrayList.add(k1Var);
        }
        C7309p1 c = AbstractC7275h1.f15749c.m23039b(v1Var.mo5172N0(), arrayList).m23003c();
        int size = L0.size();
        for (int i = 0; i < size; i++) {
            AbstractC7290k1 k1Var2 = L0.get(i);
            AbstractC7290k1 k1Var3 = (AbstractC7290k1) arrayList.get(i);
            if (k1Var2.mo22906b() != EnumC7338w1.INVARIANT) {
                List<AbstractC7267g0> upperBounds = v1Var.mo5172N0().getParameters().get(i).getUpperBounds();
                C9971q.m14634f(upperBounds, "type.constructor.parameters[index].upperBounds");
                ArrayList arrayList2 = new ArrayList();
                for (AbstractC7267g0 g0Var : upperBounds) {
                    arrayList2.add(AbstractC7661f.C7662a.f16660a.mo21705a(c.m22972n(g0Var, EnumC7338w1.INVARIANT).mo22868Q0()));
                }
                if (!k1Var2.mo22907a() && k1Var2.mo22906b() == EnumC7338w1.OUT_VARIANCE) {
                    arrayList2.add(AbstractC7661f.C7662a.f16660a.mo21705a(k1Var2.getType().mo22868Q0()));
                }
                AbstractC7267g0 type = k1Var3.getType();
                C9971q.m14635e(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                ((C7667i) type).mo5172N0().m21681f(arrayList2);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final AbstractC7304o0 m21678b(AbstractC7304o0 type, EnumC9611b status) {
        C9971q.m14633g(type, "type");
        C9971q.m14633g(status, "status");
        List<AbstractC7290k1> a = m21679a(type, status);
        if (a != null) {
            return m21677c(type, a);
        }
        return null;
    }

    /* renamed from: c */
    private static final AbstractC7304o0 m21677c(AbstractC7335v1 v1Var, List<? extends AbstractC7290k1> list) {
        return C7270h0.m23050j(v1Var.mo5173M0(), v1Var.mo5172N0(), list, v1Var.mo5171O0(), null, 16, null);
    }
}
