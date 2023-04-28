package fi;

import java.util.List;
import kotlin.jvm.internal.C9971q;
import nf.C11088q;
import pg.AbstractC11672g;
import pg.C11682l;

/* renamed from: fi.o1 */
/* loaded from: classes8.dex */
public final class C7305o1 {
    /* renamed from: a */
    public static final AbstractC7304o0 m22999a(AbstractC7267g0 g0Var) {
        AbstractC7304o0 o0Var;
        C9971q.m14633g(g0Var, "<this>");
        AbstractC7335v1 Q0 = g0Var.mo22868Q0();
        if (Q0 instanceof AbstractC7304o0) {
            o0Var = (AbstractC7304o0) Q0;
        } else {
            o0Var = null;
        }
        if (o0Var != null) {
            return o0Var;
        }
        throw new IllegalStateException(("This is should be simple type: " + g0Var).toString());
    }

    /* renamed from: b */
    public static final AbstractC7267g0 m22998b(AbstractC7267g0 g0Var, List<? extends AbstractC7290k1> newArguments, AbstractC11672g newAnnotations) {
        C9971q.m14633g(g0Var, "<this>");
        C9971q.m14633g(newArguments, "newArguments");
        C9971q.m14633g(newAnnotations, "newAnnotations");
        return m22995e(g0Var, newArguments, newAnnotations, null, 4, null);
    }

    /* renamed from: c */
    public static final AbstractC7267g0 m22997c(AbstractC7267g0 g0Var, List<? extends AbstractC7290k1> newArguments, AbstractC11672g newAnnotations, List<? extends AbstractC7290k1> newArgumentsForUpperBound) {
        C9971q.m14633g(g0Var, "<this>");
        C9971q.m14633g(newArguments, "newArguments");
        C9971q.m14633g(newAnnotations, "newAnnotations");
        C9971q.m14633g(newArgumentsForUpperBound, "newArgumentsForUpperBound");
        if ((newArguments.isEmpty() || newArguments == g0Var.mo5174L0()) && newAnnotations == g0Var.getAnnotations()) {
            return g0Var;
        }
        C7232c1 M0 = g0Var.mo5173M0();
        if ((newAnnotations instanceof C11682l) && newAnnotations.isEmpty()) {
            newAnnotations = AbstractC11672g.f26044g.m9048b();
        }
        C7232c1 a = C7236d1.m23141a(M0, newAnnotations);
        AbstractC7335v1 Q0 = g0Var.mo22868Q0();
        if (Q0 instanceof AbstractC7223a0) {
            AbstractC7223a0 a0Var = (AbstractC7223a0) Q0;
            return C7270h0.m23056d(m22996d(a0Var.m23170V0(), newArguments, a), m22996d(a0Var.m23169W0(), newArgumentsForUpperBound, a));
        } else if (Q0 instanceof AbstractC7304o0) {
            return m22996d((AbstractC7304o0) Q0, newArguments, a);
        } else {
            throw new C11088q();
        }
    }

    /* renamed from: d */
    public static final AbstractC7304o0 m22996d(AbstractC7304o0 o0Var, List<? extends AbstractC7290k1> newArguments, C7232c1 newAttributes) {
        C9971q.m14633g(o0Var, "<this>");
        C9971q.m14633g(newArguments, "newArguments");
        C9971q.m14633g(newAttributes, "newAttributes");
        if (newArguments.isEmpty() && newAttributes == o0Var.mo5173M0()) {
            return o0Var;
        }
        if (newArguments.isEmpty()) {
            return o0Var.mo5165V0(newAttributes);
        }
        return C7270h0.m23050j(newAttributes, o0Var.mo5172N0(), newArguments, o0Var.mo5171O0(), null, 16, null);
    }

    /* renamed from: e */
    public static /* synthetic */ AbstractC7267g0 m22995e(AbstractC7267g0 g0Var, List list, AbstractC11672g gVar, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = g0Var.mo5174L0();
        }
        if ((i & 2) != 0) {
            gVar = g0Var.getAnnotations();
        }
        if ((i & 4) != 0) {
            list2 = list;
        }
        return m22997c(g0Var, list, gVar, list2);
    }

    /* renamed from: f */
    public static /* synthetic */ AbstractC7304o0 m22994f(AbstractC7304o0 o0Var, List list, C7232c1 c1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            list = o0Var.mo5174L0();
        }
        if ((i & 2) != 0) {
            c1Var = o0Var.mo5173M0();
        }
        return m22996d(o0Var, list, c1Var);
    }
}
