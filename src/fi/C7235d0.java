package fi;

import kotlin.jvm.internal.C9971q;
import nf.C11088q;

/* renamed from: fi.d0 */
/* loaded from: classes8.dex */
public final class C7235d0 {
    /* renamed from: a */
    public static final AbstractC7223a0 m23145a(AbstractC7267g0 g0Var) {
        C9971q.m14633g(g0Var, "<this>");
        AbstractC7335v1 Q0 = g0Var.mo22868Q0();
        C9971q.m14635e(Q0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (AbstractC7223a0) Q0;
    }

    /* renamed from: b */
    public static final boolean m23144b(AbstractC7267g0 g0Var) {
        C9971q.m14633g(g0Var, "<this>");
        return g0Var.mo22868Q0() instanceof AbstractC7223a0;
    }

    /* renamed from: c */
    public static final AbstractC7304o0 m23143c(AbstractC7267g0 g0Var) {
        C9971q.m14633g(g0Var, "<this>");
        AbstractC7335v1 Q0 = g0Var.mo22868Q0();
        if (Q0 instanceof AbstractC7223a0) {
            return ((AbstractC7223a0) Q0).m23170V0();
        }
        if (Q0 instanceof AbstractC7304o0) {
            return (AbstractC7304o0) Q0;
        }
        throw new C11088q();
    }

    /* renamed from: d */
    public static final AbstractC7304o0 m23142d(AbstractC7267g0 g0Var) {
        C9971q.m14633g(g0Var, "<this>");
        AbstractC7335v1 Q0 = g0Var.mo22868Q0();
        if (Q0 instanceof AbstractC7223a0) {
            return ((AbstractC7223a0) Q0).m23169W0();
        }
        if (Q0 instanceof AbstractC7304o0) {
            return (AbstractC7304o0) Q0;
        }
        throw new C11088q();
    }
}
