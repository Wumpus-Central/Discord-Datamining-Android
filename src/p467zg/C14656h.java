package p467zg;

import bh.C3548l;
import fi.AbstractC7267g0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import p249nh.C11142f;
import p268og.AbstractC11297a;
import p268og.AbstractC11299a1;
import p268og.AbstractC11313e;
import p268og.AbstractC11335j1;
import p324rg.C12619l0;
import p388vh.C13508c;
import p448yh.AbstractC14411h;
import pg.AbstractC11672g;

/* renamed from: zg.h */
/* loaded from: classes8.dex */
public final class C14656h {
    /* renamed from: a */
    public static final List<AbstractC11335j1> m53a(Collection<? extends AbstractC7267g0> newValueParameterTypes, Collection<? extends AbstractC11335j1> oldValueParameters, AbstractC11297a newOwner) {
        List<Pair> K0;
        int t;
        AbstractC7267g0 g0Var;
        C9971q.m14633g(newValueParameterTypes, "newValueParameterTypes");
        C9971q.m14633g(oldValueParameters, "oldValueParameters");
        C9971q.m14633g(newOwner, "newOwner");
        newValueParameterTypes.size();
        oldValueParameters.size();
        K0 = C9914r.m14781K0(newValueParameterTypes, oldValueParameters);
        t = C9907k.m14809t(K0, 10);
        ArrayList arrayList = new ArrayList(t);
        for (Pair pair : K0) {
            AbstractC7267g0 g0Var2 = (AbstractC7267g0) pair.m15067a();
            AbstractC11335j1 j1Var = (AbstractC11335j1) pair.m15066b();
            int index = j1Var.getIndex();
            AbstractC11672g annotations = j1Var.getAnnotations();
            C11142f name = j1Var.getName();
            C9971q.m14634f(name, "oldParameter.name");
            boolean y0 = j1Var.mo6303y0();
            boolean o0 = j1Var.mo6305o0();
            boolean l0 = j1Var.mo6306l0();
            if (j1Var.mo6304r0() != null) {
                g0Var = C13508c.m3525p(newOwner).mo6136n().m13383k(g0Var2);
            } else {
                g0Var = null;
            }
            AbstractC11299a1 j = j1Var.mo6102j();
            C9971q.m14634f(j, "oldParameter.source");
            arrayList.add(new C12619l0(newOwner, null, index, annotations, name, g0Var2, y0, o0, l0, g0Var, j));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final C3548l m52b(AbstractC11313e eVar) {
        C9971q.m14633g(eVar, "<this>");
        AbstractC11313e t = C13508c.m3521t(eVar);
        C3548l lVar = null;
        if (t == null) {
            return null;
        }
        AbstractC14411h i0 = t.mo6113i0();
        if (i0 instanceof C3548l) {
            lVar = (C3548l) i0;
        }
        if (lVar == null) {
            return m52b(t);
        }
        return lVar;
    }
}
