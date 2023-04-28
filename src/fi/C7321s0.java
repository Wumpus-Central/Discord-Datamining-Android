package fi;

import gi.C7667i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C9907k;
import kotlin.jvm.internal.C9971q;

/* renamed from: fi.s0 */
/* loaded from: classes8.dex */
public final class C7321s0 {
    /* renamed from: a */
    public static final C7222a m22957a(AbstractC7267g0 g0Var) {
        C9971q.m14633g(g0Var, "<this>");
        AbstractC7335v1 Q0 = g0Var.mo22868Q0();
        if (Q0 instanceof C7222a) {
            return (C7222a) Q0;
        }
        return null;
    }

    /* renamed from: b */
    public static final AbstractC7304o0 m22956b(AbstractC7267g0 g0Var) {
        C9971q.m14633g(g0Var, "<this>");
        C7222a a = m22957a(g0Var);
        if (a != null) {
            return a.m23174Z0();
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m22955c(AbstractC7267g0 g0Var) {
        C9971q.m14633g(g0Var, "<this>");
        return g0Var.mo22868Q0() instanceof C7306p;
    }

    /* renamed from: d */
    private static final C7245f0 m22954d(C7245f0 f0Var) {
        int t;
        AbstractC7267g0 g0Var;
        Collection<AbstractC7267g0> m = f0Var.mo4568m();
        t = C9907k.m14809t(m, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<T> it = m.iterator();
        boolean z = false;
        while (true) {
            g0Var = null;
            if (!it.hasNext()) {
                break;
            }
            AbstractC7267g0 g0Var2 = (AbstractC7267g0) it.next();
            if (C7322s1.m22935l(g0Var2)) {
                g0Var2 = m22952f(g0Var2.mo22868Q0(), false, 1, null);
                z = true;
            }
            arrayList.add(g0Var2);
        }
        if (!z) {
            return null;
        }
        AbstractC7267g0 e = f0Var.m23107e();
        if (e != null) {
            if (C7322s1.m22935l(e)) {
                e = m22952f(e.mo22868Q0(), false, 1, null);
            }
            g0Var = e;
        }
        return new C7245f0(arrayList).m23103i(g0Var);
    }

    /* renamed from: e */
    public static final AbstractC7335v1 m22953e(AbstractC7335v1 v1Var, boolean z) {
        C9971q.m14633g(v1Var, "<this>");
        C7306p b = C7306p.f15782n.m22988b(v1Var, z);
        if (b != null) {
            return b;
        }
        AbstractC7304o0 g = m22951g(v1Var);
        if (g != null) {
            return g;
        }
        return v1Var.mo5169R0(false);
    }

    /* renamed from: f */
    public static /* synthetic */ AbstractC7335v1 m22952f(AbstractC7335v1 v1Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m22953e(v1Var, z);
    }

    /* renamed from: g */
    private static final AbstractC7304o0 m22951g(AbstractC7267g0 g0Var) {
        C7245f0 f0Var;
        C7245f0 d;
        AbstractC7268g1 N0 = g0Var.mo5172N0();
        if (N0 instanceof C7245f0) {
            f0Var = (C7245f0) N0;
        } else {
            f0Var = null;
        }
        if (f0Var == null || (d = m22954d(f0Var)) == null) {
            return null;
        }
        return d.m23108d();
    }

    /* renamed from: h */
    public static final AbstractC7304o0 m22950h(AbstractC7304o0 o0Var, boolean z) {
        C9971q.m14633g(o0Var, "<this>");
        C7306p b = C7306p.f15782n.m22988b(o0Var, z);
        if (b != null) {
            return b;
        }
        AbstractC7304o0 g = m22951g(o0Var);
        if (g == null) {
            return o0Var.mo5166U0(false);
        }
        return g;
    }

    /* renamed from: i */
    public static /* synthetic */ AbstractC7304o0 m22949i(AbstractC7304o0 o0Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m22950h(o0Var, z);
    }

    /* renamed from: j */
    public static final AbstractC7304o0 m22948j(AbstractC7304o0 o0Var, AbstractC7304o0 abbreviatedType) {
        C9971q.m14633g(o0Var, "<this>");
        C9971q.m14633g(abbreviatedType, "abbreviatedType");
        if (C7278i0.m23035a(o0Var)) {
            return o0Var;
        }
        return new C7222a(o0Var, abbreviatedType);
    }

    /* renamed from: k */
    public static final C7667i m22947k(C7667i iVar) {
        C9971q.m14633g(iVar, "<this>");
        return new C7667i(iVar.m21690W0(), iVar.mo5172N0(), iVar.m21688Y0(), iVar.mo5173M0(), iVar.mo5171O0(), true);
    }
}
