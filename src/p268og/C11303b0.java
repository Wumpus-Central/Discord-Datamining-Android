package p268og;

import kotlin.Unit;
import kotlin.jvm.internal.C9971q;

/* renamed from: og.b0 */
/* loaded from: classes8.dex */
public final class C11303b0 {

    /* renamed from: a */
    private static final C11321g0<AbstractC11307c0> f25236a = new C11321g0<>("InvalidModuleNotifier");

    /* renamed from: a */
    public static final void m10223a(AbstractC11327h0 h0Var) {
        Unit unit;
        C9971q.m14633g(h0Var, "<this>");
        AbstractC11307c0 c0Var = (AbstractC11307c0) h0Var.mo6133v0(f25236a);
        if (c0Var != null) {
            c0Var.m10222a(h0Var);
            unit = Unit.f22042a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new C11298a0("Accessing invalid module descriptor " + h0Var);
        }
    }
}
