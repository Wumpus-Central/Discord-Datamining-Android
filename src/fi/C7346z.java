package fi;

import java.util.HashSet;
import kotlin.jvm.internal.C9971q;
import p182ji.AbstractC9618i;
import p182ji.AbstractC9620k;
import p182ji.AbstractC9623n;
import p182ji.AbstractC9624o;

/* renamed from: fi.z */
/* loaded from: classes8.dex */
public final class C7346z {
    /* renamed from: a */
    public static final AbstractC9618i m22856a(AbstractC7316q1 q1Var, AbstractC9618i inlineClassType) {
        C9971q.m14633g(q1Var, "<this>");
        C9971q.m14633g(inlineClassType, "inlineClassType");
        return m22855b(q1Var, inlineClassType, new HashSet());
    }

    /* renamed from: b */
    private static final AbstractC9618i m22855b(AbstractC7316q1 q1Var, AbstractC9618i iVar, HashSet<AbstractC9623n> hashSet) {
        AbstractC9618i iVar2;
        boolean z;
        AbstractC9618i iVar3;
        AbstractC9623n O = q1Var.mo5943O(iVar);
        if (!hashSet.add(O)) {
            return null;
        }
        AbstractC9624o b0 = q1Var.mo5928b0(O);
        if (b0 != null) {
            AbstractC9618i U = q1Var.mo5937U(b0);
            iVar2 = m22855b(q1Var, U, hashSet);
            if (iVar2 == null) {
                return null;
            }
            if (q1Var.mo5912j0(q1Var.mo5943O(U)) || ((U instanceof AbstractC9620k) && q1Var.mo5916h0((AbstractC9620k) U))) {
                z = true;
            } else {
                z = false;
            }
            if ((iVar2 instanceof AbstractC9620k) && q1Var.mo5916h0((AbstractC9620k) iVar2) && q1Var.mo5908l0(iVar) && z) {
                iVar3 = q1Var.mo5917h(U);
            } else if (!q1Var.mo5908l0(iVar2) && q1Var.mo5935W(iVar)) {
                iVar3 = q1Var.mo5917h(iVar2);
            }
            return iVar3;
        } else if (!q1Var.mo5912j0(O)) {
            return iVar;
        } else {
            AbstractC9618i K = q1Var.mo5947K(iVar);
            if (K == null || (iVar2 = m22855b(q1Var, K, hashSet)) == null) {
                return null;
            }
            if (q1Var.mo5908l0(iVar)) {
                if (q1Var.mo5908l0(iVar2)) {
                    return iVar;
                }
                if (!(iVar2 instanceof AbstractC9620k) || !q1Var.mo5916h0((AbstractC9620k) iVar2)) {
                    return q1Var.mo5917h(iVar2);
                }
                return iVar;
            }
        }
        return iVar2;
    }
}
