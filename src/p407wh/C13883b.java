package p407wh;

import fi.AbstractC7267g0;
import java.util.Collection;
import java.util.List;
import ki.C9883a;
import kotlin.jvm.internal.C9971q;
import p217lg.C10434k;
import p268og.AbstractC11301b;
import p268og.AbstractC11309d;
import p268og.AbstractC11313e;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import p268og.AbstractC11335j1;
import p268og.AbstractC11346m;
import p268og.C11373t;
import p325rh.C12661e;
import p325rh.C12665g;
import p388vh.C13508c;

/* renamed from: wh.b */
/* loaded from: classes8.dex */
public final class C13883b {
    /* renamed from: a */
    private static final boolean m2410a(AbstractC11313e eVar) {
        return C9971q.m14638b(C13508c.m3529l(eVar), C10434k.f22890q);
    }

    /* renamed from: b */
    public static final boolean m2409b(AbstractC7267g0 g0Var) {
        C9971q.m14633g(g0Var, "<this>");
        AbstractC11326h p = g0Var.mo5172N0().mo4565p();
        if (p == null || !m2408c(p)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m2408c(AbstractC11346m mVar) {
        C9971q.m14633g(mVar, "<this>");
        if (!C12665g.m6026b(mVar) || m2410a((AbstractC11313e) mVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static final boolean m2407d(AbstractC7267g0 g0Var) {
        AbstractC11319f1 f1Var;
        AbstractC11326h p = g0Var.mo5172N0().mo4565p();
        if (p instanceof AbstractC11319f1) {
            f1Var = (AbstractC11319f1) p;
        } else {
            f1Var = null;
        }
        if (f1Var == null) {
            return false;
        }
        return m2406e(C9883a.m15095j(f1Var));
    }

    /* renamed from: e */
    private static final boolean m2406e(AbstractC7267g0 g0Var) {
        return m2409b(g0Var) || m2407d(g0Var);
    }

    /* renamed from: f */
    public static final boolean m2405f(AbstractC11301b descriptor) {
        AbstractC11309d dVar;
        C9971q.m14633g(descriptor, "descriptor");
        if (descriptor instanceof AbstractC11309d) {
            dVar = (AbstractC11309d) descriptor;
        } else {
            dVar = null;
        }
        if (dVar == null || C11373t.m10169g(dVar.getVisibility())) {
            return false;
        }
        AbstractC11313e a0 = dVar.mo6348a0();
        C9971q.m14634f(a0, "constructorDescriptor.constructedClass");
        if (C12665g.m6026b(a0) || C12661e.m6060G(dVar.mo6348a0())) {
            return false;
        }
        List<AbstractC11335j1> i = dVar.mo6242i();
        C9971q.m14634f(i, "constructorDescriptor.valueParameters");
        if ((i instanceof Collection) && i.isEmpty()) {
            return false;
        }
        for (AbstractC11335j1 j1Var : i) {
            AbstractC7267g0 type = j1Var.getType();
            C9971q.m14634f(type, "it.type");
            if (m2406e(type)) {
                return true;
            }
        }
        return false;
    }
}
