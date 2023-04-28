package p390w;

import p390w.AbstractC13662r0;

/* renamed from: w.q0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C13656q0 {
    /* renamed from: a */
    public static boolean m3109a(AbstractC13662r0.EnumC13665c cVar, AbstractC13662r0.EnumC13665c cVar2) {
        AbstractC13662r0.EnumC13665c cVar3 = AbstractC13662r0.EnumC13665c.ALWAYS_OVERRIDE;
        if (cVar == cVar3 && cVar2 == cVar3) {
            return true;
        }
        AbstractC13662r0.EnumC13665c cVar4 = AbstractC13662r0.EnumC13665c.REQUIRED;
        if (cVar == cVar4 && cVar2 == cVar4) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static AbstractC13662r0 m3108b(AbstractC13662r0 r0Var, AbstractC13662r0 r0Var2) {
        C13696x1 x1Var;
        if (r0Var == null && r0Var2 == null) {
            return C13582c2.m3311G();
        }
        if (r0Var2 != null) {
            x1Var = C13696x1.m3001K(r0Var2);
        } else {
            x1Var = C13696x1.m3002J();
        }
        if (r0Var != null) {
            for (AbstractC13662r0.AbstractC13663a<?> aVar : r0Var.mo2975c()) {
                x1Var.mo3003E(aVar, r0Var.mo2974d(aVar), r0Var.mo2976b(aVar));
            }
        }
        return C13582c2.m3310H(x1Var);
    }
}
