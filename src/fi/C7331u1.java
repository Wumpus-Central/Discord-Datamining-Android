package fi;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import nf.C11088q;

/* renamed from: fi.u1 */
/* loaded from: classes8.dex */
public final class C7331u1 {
    /* renamed from: a */
    public static final AbstractC7267g0 m22901a(AbstractC7267g0 g0Var) {
        C9971q.m14633g(g0Var, "<this>");
        if (g0Var instanceof AbstractC7326t1) {
            return ((AbstractC7326t1) g0Var).mo22914e0();
        }
        return null;
    }

    /* renamed from: b */
    public static final AbstractC7335v1 m22900b(AbstractC7335v1 v1Var, AbstractC7267g0 origin) {
        C9971q.m14633g(v1Var, "<this>");
        C9971q.m14633g(origin, "origin");
        return m22898d(v1Var, m22901a(origin));
    }

    /* renamed from: c */
    public static final AbstractC7335v1 m22899c(AbstractC7335v1 v1Var, AbstractC7267g0 origin, Function1<? super AbstractC7267g0, ? extends AbstractC7267g0> transform) {
        AbstractC7267g0 g0Var;
        C9971q.m14633g(v1Var, "<this>");
        C9971q.m14633g(origin, "origin");
        C9971q.m14633g(transform, "transform");
        AbstractC7267g0 a = m22901a(origin);
        if (a != null) {
            g0Var = (AbstractC7267g0) transform.invoke(a);
        } else {
            g0Var = null;
        }
        return m22898d(v1Var, g0Var);
    }

    /* renamed from: d */
    public static final AbstractC7335v1 m22898d(AbstractC7335v1 v1Var, AbstractC7267g0 g0Var) {
        C9971q.m14633g(v1Var, "<this>");
        if (v1Var instanceof AbstractC7326t1) {
            return m22898d(((AbstractC7326t1) v1Var).mo22915G0(), g0Var);
        }
        if (g0Var == null || C9971q.m14638b(g0Var, v1Var)) {
            return v1Var;
        }
        if (v1Var instanceof AbstractC7304o0) {
            return new C7318r0((AbstractC7304o0) v1Var, g0Var);
        }
        if (v1Var instanceof AbstractC7223a0) {
            return new C7231c0((AbstractC7223a0) v1Var, g0Var);
        }
        throw new C11088q();
    }
}
