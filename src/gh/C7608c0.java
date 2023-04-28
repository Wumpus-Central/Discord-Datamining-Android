package gh;

import fi.AbstractC7316q1;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C9971q;
import ng.C11105c;
import p108fh.C7221s;
import p182ji.AbstractC9618i;
import p182ji.AbstractC9623n;
import p217lg.EnumC10426i;
import p249nh.C11136b;
import p249nh.C11138d;
import p407wh.C13885d;
import p407wh.EnumC13886e;

/* renamed from: gh.c0 */
/* loaded from: classes8.dex */
public final class C7608c0 {
    /* renamed from: a */
    public static final <T> T m21902a(AbstractC7630n<T> nVar, T possiblyPrimitiveType, boolean z) {
        C9971q.m14633g(nVar, "<this>");
        C9971q.m14633g(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (z) {
            return nVar.mo21833b(possiblyPrimitiveType);
        }
        return possiblyPrimitiveType;
    }

    /* renamed from: b */
    public static final <T> T m21901b(AbstractC7316q1 q1Var, AbstractC9618i type, AbstractC7630n<T> typeFactory, C7604b0 mode) {
        EnumC10426i x0;
        C11136b bVar;
        C9971q.m14633g(q1Var, "<this>");
        C9971q.m14633g(type, "type");
        C9971q.m14633g(typeFactory, "typeFactory");
        C9971q.m14633g(mode, "mode");
        AbstractC9623n O = q1Var.mo5943O(type);
        if (!q1Var.mo5924d0(O)) {
            return null;
        }
        EnumC10426i Q = q1Var.mo5941Q(O);
        boolean z = true;
        if (Q != null) {
            T c = typeFactory.mo21832c(Q);
            if (!q1Var.mo5908l0(type) && !C7221s.m23178c(q1Var, type)) {
                z = false;
            }
            return (T) m21902a(typeFactory, c, z);
        }
        if (q1Var.mo5884x0(O) != null) {
            return typeFactory.mo21834a('[' + EnumC13886e.m2393c(x0).m2392d());
        }
        if (q1Var.mo5958E(O)) {
            C11138d B = q1Var.mo5964B(O);
            if (B != null) {
                bVar = C11105c.f24626a.m10896n(B);
            } else {
                bVar = null;
            }
            if (bVar != null) {
                if (!mode.m21911a()) {
                    List<C11105c.C11106a> i = C11105c.f24626a.m10901i();
                    if (!(i instanceof Collection) || !i.isEmpty()) {
                        for (C11105c.C11106a aVar : i) {
                            if (C9971q.m14638b(aVar.m10890d(), bVar)) {
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        return null;
                    }
                }
                String f = C13885d.m2401b(bVar).m2397f();
                C9971q.m14634f(f, "byClassId(classId).internalName");
                return typeFactory.mo21830e(f);
            }
        }
        return null;
    }
}
