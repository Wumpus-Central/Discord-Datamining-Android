package p268og;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C9971q;
import p249nh.C11137c;

/* renamed from: og.o0 */
/* loaded from: classes8.dex */
public final class C11364o0 {
    /* renamed from: a */
    public static final void m10184a(AbstractC11347m0 m0Var, C11137c fqName, Collection<AbstractC11344l0> packageFragments) {
        C9971q.m14633g(m0Var, "<this>");
        C9971q.m14633g(fqName, "fqName");
        C9971q.m14633g(packageFragments, "packageFragments");
        if (m0Var instanceof AbstractC11366p0) {
            ((AbstractC11366p0) m0Var).mo6356b(fqName, packageFragments);
        } else {
            packageFragments.addAll(m0Var.mo6357a(fqName));
        }
    }

    /* renamed from: b */
    public static final boolean m10183b(AbstractC11347m0 m0Var, C11137c fqName) {
        C9971q.m14633g(m0Var, "<this>");
        C9971q.m14633g(fqName, "fqName");
        if (m0Var instanceof AbstractC11366p0) {
            return ((AbstractC11366p0) m0Var).mo6355c(fqName);
        }
        return m10182c(m0Var, fqName).isEmpty();
    }

    /* renamed from: c */
    public static final List<AbstractC11344l0> m10182c(AbstractC11347m0 m0Var, C11137c fqName) {
        C9971q.m14633g(m0Var, "<this>");
        C9971q.m14633g(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        m10184a(m0Var, fqName, arrayList);
        return arrayList;
    }
}
