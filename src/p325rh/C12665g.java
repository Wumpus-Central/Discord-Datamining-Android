package p325rh;

import fi.AbstractC7267g0;
import fi.AbstractC7304o0;
import kotlin.jvm.internal.C9971q;
import p249nh.C11136b;
import p249nh.C11137c;
import p249nh.C11142f;
import p268og.AbstractC11297a;
import p268og.AbstractC11313e;
import p268og.AbstractC11326h;
import p268og.AbstractC11342k1;
import p268og.AbstractC11346m;
import p268og.AbstractC11388u0;
import p268og.AbstractC11390v0;
import p268og.C11403z;
import p388vh.C13508c;

/* renamed from: rh.g */
/* loaded from: classes8.dex */
public final class C12665g {

    /* renamed from: a */
    private static final C11137c f28503a;

    /* renamed from: b */
    private static final C11136b f28504b;

    static {
        C11137c cVar = new C11137c("kotlin.jvm.JvmInline");
        f28503a = cVar;
        C11136b m = C11136b.m10805m(cVar);
        C9971q.m14634f(m, "topLevel(JVM_INLINE_ANNOTATION_FQ_NAME)");
        f28504b = m;
    }

    /* renamed from: a */
    public static final boolean m6027a(AbstractC11297a aVar) {
        C9971q.m14633g(aVar, "<this>");
        if (aVar instanceof AbstractC11390v0) {
            AbstractC11388u0 correspondingProperty = ((AbstractC11390v0) aVar).mo6459T();
            C9971q.m14634f(correspondingProperty, "correspondingProperty");
            if (m6024d(correspondingProperty)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m6026b(AbstractC11346m mVar) {
        C9971q.m14633g(mVar, "<this>");
        if (!(mVar instanceof AbstractC11313e) || !(((AbstractC11313e) mVar).mo6121S() instanceof C11403z)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m6025c(AbstractC7267g0 g0Var) {
        C9971q.m14633g(g0Var, "<this>");
        AbstractC11326h p = g0Var.mo5172N0().mo4565p();
        if (p != null) {
            return m6026b(p);
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m6024d(AbstractC11342k1 k1Var) {
        AbstractC11313e eVar;
        C11403z<AbstractC7304o0> n;
        C9971q.m14633g(k1Var, "<this>");
        if (k1Var.mo6264M() == null) {
            AbstractC11346m b = k1Var.mo6104b();
            C11142f fVar = null;
            if (b instanceof AbstractC11313e) {
                eVar = (AbstractC11313e) b;
            } else {
                eVar = null;
            }
            if (!(eVar == null || (n = C13508c.m3527n(eVar)) == null)) {
                fVar = n.m10135c();
            }
            if (C9971q.m14638b(fVar, k1Var.getName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static final AbstractC7267g0 m6023e(AbstractC7267g0 g0Var) {
        C11403z<AbstractC7304o0> n;
        C9971q.m14633g(g0Var, "<this>");
        AbstractC11326h p = g0Var.mo5172N0().mo4565p();
        if (!(p instanceof AbstractC11313e)) {
            p = null;
        }
        AbstractC11313e eVar = (AbstractC11313e) p;
        if (eVar == null || (n = C13508c.m3527n(eVar)) == null) {
            return null;
        }
        return n.m10134d();
    }
}
