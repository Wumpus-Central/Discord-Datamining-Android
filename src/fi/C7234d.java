package fi;

import kotlin.jvm.internal.C9971q;
import p182ji.AbstractC9616g;
import p182ji.AbstractC9618i;
import p182ji.AbstractC9620k;
import p182ji.AbstractC9622m;
import p182ji.AbstractC9625p;

/* renamed from: fi.d */
/* loaded from: classes8.dex */
public final class C7234d {

    /* renamed from: a */
    public static final C7234d f15673a = new C7234d();

    private C7234d() {
    }

    /* renamed from: a */
    private final boolean m23148a(AbstractC9625p pVar, AbstractC9620k kVar, AbstractC9620k kVar2) {
        boolean z;
        boolean z2;
        if (pVar.mo5900p0(kVar) == pVar.mo5900p0(kVar2) && pVar.mo5880z0(kVar) == pVar.mo5880z0(kVar2)) {
            if (pVar.mo5895s(kVar) == null) {
                z = true;
            } else {
                z = false;
            }
            if (pVar.mo5895s(kVar2) == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z == z2 && pVar.mo5903o(pVar.mo5931a(kVar), pVar.mo5931a(kVar2))) {
                if (pVar.mo5893t(kVar, kVar2)) {
                    return true;
                }
                int p0 = pVar.mo5900p0(kVar);
                for (int i = 0; i < p0; i++) {
                    AbstractC9622m D0 = pVar.mo5959D0(kVar, i);
                    AbstractC9622m D02 = pVar.mo5959D0(kVar2, i);
                    if (pVar.mo5948J(D0) != pVar.mo5948J(D02)) {
                        return false;
                    }
                    if (!(pVar.mo5948J(D0) || (pVar.mo5885x(D0) == pVar.mo5885x(D02) && m23146c(pVar, pVar.mo5932Z(D0), pVar.mo5932Z(D02))))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m23146c(AbstractC9625p pVar, AbstractC9618i iVar, AbstractC9618i iVar2) {
        if (iVar == iVar2) {
            return true;
        }
        AbstractC9620k f = pVar.mo5921f(iVar);
        AbstractC9620k f2 = pVar.mo5921f(iVar2);
        if (f != null && f2 != null) {
            return m23148a(pVar, f, f2);
        }
        AbstractC9616g I = pVar.mo5950I(iVar);
        AbstractC9616g I2 = pVar.mo5950I(iVar2);
        if (I == null || I2 == null) {
            return false;
        }
        if (!m23148a(pVar, pVar.mo5923e(I), pVar.mo5923e(I2)) || !m23148a(pVar, pVar.mo5927c(I), pVar.mo5927c(I2))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m23147b(AbstractC9625p context, AbstractC9618i a, AbstractC9618i b) {
        C9971q.m14633g(context, "context");
        C9971q.m14633g(a, "a");
        C9971q.m14633g(b, "b");
        return m23146c(context, a, b);
    }
}
