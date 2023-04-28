package fi;

import fi.AbstractC7228b1;
import kotlin.jvm.internal.C9971q;
import pg.AbstractC11672g;

/* renamed from: fi.d1 */
/* loaded from: classes8.dex */
public final class C7236d1 {
    /* renamed from: a */
    public static final C7232c1 m23141a(C7232c1 c1Var, AbstractC11672g newAnnotations) {
        C7232c1 s;
        C9971q.m14633g(c1Var, "<this>");
        C9971q.m14633g(newAnnotations, "newAnnotations");
        if (C7288k.m23011a(c1Var) == newAnnotations) {
            return c1Var;
        }
        C7280j b = C7288k.m23010b(c1Var);
        if (!(b == null || (s = c1Var.m23152s(b)) == null)) {
            c1Var = s;
        }
        if (newAnnotations.iterator().hasNext() || !newAnnotations.isEmpty()) {
            return c1Var.m23153r(new C7280j(newAnnotations));
        }
        return c1Var;
    }

    /* renamed from: b */
    public static final C7232c1 m23140b(AbstractC11672g gVar) {
        C9971q.m14633g(gVar, "<this>");
        return AbstractC7228b1.C7229a.m23165a(C7303o.f15781a, gVar, null, null, 6, null);
    }
}
