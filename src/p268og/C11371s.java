package p268og;

import kotlin.jvm.internal.C9971q;
import p249nh.C11137c;
import p249nh.C11142f;
import p406wg.AbstractC13878b;
import p448yh.AbstractC14411h;

/* renamed from: og.s */
/* loaded from: classes8.dex */
public final class C11371s {
    /* renamed from: a */
    public static final AbstractC11326h m10181a(AbstractC11346m mVar) {
        C9971q.m14633g(mVar, "<this>");
        AbstractC11346m b = mVar.mo6104b();
        if (b == null || (mVar instanceof AbstractC11344l0)) {
            return null;
        }
        if (!m10180b(b)) {
            return m10181a(b);
        }
        if (b instanceof AbstractC11326h) {
            return (AbstractC11326h) b;
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m10180b(AbstractC11346m mVar) {
        C9971q.m14633g(mVar, "<this>");
        return mVar.mo6104b() instanceof AbstractC11344l0;
    }

    /* renamed from: c */
    public static final AbstractC11313e m10179c(AbstractC11327h0 h0Var, C11137c fqName, AbstractC13878b lookupLocation) {
        AbstractC11313e eVar;
        AbstractC11326h hVar;
        AbstractC14411h R;
        C9971q.m14633g(h0Var, "<this>");
        C9971q.m14633g(fqName, "fqName");
        C9971q.m14633g(lookupLocation, "lookupLocation");
        if (fqName.m10801d()) {
            return null;
        }
        C11137c e = fqName.m10800e();
        C9971q.m14634f(e, "fqName.parent()");
        AbstractC14411h o = h0Var.mo6135n0(e).mo6180o();
        C11142f g = fqName.m10798g();
        C9971q.m14634f(g, "fqName.shortName()");
        AbstractC11326h e2 = o.mo636e(g, lookupLocation);
        if (e2 instanceof AbstractC11313e) {
            eVar = (AbstractC11313e) e2;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            return eVar;
        }
        C11137c e3 = fqName.m10800e();
        C9971q.m14634f(e3, "fqName.parent()");
        AbstractC11313e c = m10179c(h0Var, e3, lookupLocation);
        if (c == null || (R = c.mo6170R()) == null) {
            hVar = null;
        } else {
            C11142f g2 = fqName.m10798g();
            C9971q.m14634f(g2, "fqName.shortName()");
            hVar = R.mo636e(g2, lookupLocation);
        }
        if (hVar instanceof AbstractC11313e) {
            return (AbstractC11313e) hVar;
        }
        return null;
    }
}
