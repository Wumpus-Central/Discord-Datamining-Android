package ng;

import fi.AbstractC7275h1;
import fi.AbstractC7304o0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ki.C9883a;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import p267of.C11289v;
import p268og.AbstractC11313e;
import p268og.AbstractC11319f1;

/* renamed from: ng.l */
/* loaded from: classes8.dex */
public final class C11134l {
    /* renamed from: a */
    public static final AbstractC7275h1 m10818a(AbstractC11313e from, AbstractC11313e to) {
        int t;
        int t2;
        List K0;
        Map r;
        C9971q.m14633g(from, "from");
        C9971q.m14633g(to, "to");
        from.mo6109r().size();
        to.mo6109r().size();
        AbstractC7275h1.C7276a aVar = AbstractC7275h1.f15749c;
        List<AbstractC11319f1> r2 = from.mo6109r();
        C9971q.m14634f(r2, "from.declaredTypeParameters");
        t = C9907k.m14809t(r2, 10);
        ArrayList arrayList = new ArrayList(t);
        for (AbstractC11319f1 f1Var : r2) {
            arrayList.add(f1Var.mo6111k());
        }
        List<AbstractC11319f1> r3 = to.mo6109r();
        C9971q.m14634f(r3, "to.declaredTypeParameters");
        t2 = C9907k.m14809t(r3, 10);
        ArrayList arrayList2 = new ArrayList(t2);
        for (AbstractC11319f1 f1Var2 : r3) {
            AbstractC7304o0 p = f1Var2.mo6166p();
            C9971q.m14634f(p, "it.defaultType");
            arrayList2.add(C9883a.m15104a(p));
        }
        K0 = C9914r.m14781K0(arrayList, arrayList2);
        r = C11289v.m10241r(K0);
        return AbstractC7275h1.C7276a.m23036e(aVar, r, false, 2, null);
    }
}
