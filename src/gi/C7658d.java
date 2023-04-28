package gi;

import fi.AbstractC7223a0;
import fi.AbstractC7304o0;
import fi.AbstractC7335v1;
import fi.C7235d0;
import fi.C7270h0;
import fi.C7278i0;
import fi.C7336w;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import nf.C11088q;
import p142hi.C8039k;
import p142hi.EnumC8038j;

/* renamed from: gi.d */
/* loaded from: classes8.dex */
public final class C7658d {
    /* renamed from: a */
    public static final AbstractC7335v1 m21706a(List<? extends AbstractC7335v1> types) {
        Object r0;
        int t;
        int t2;
        AbstractC7304o0 o0Var;
        C9971q.m14633g(types, "types");
        int size = types.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types".toString());
        } else if (size != 1) {
            t = C9907k.m14809t(types, 10);
            ArrayList arrayList = new ArrayList(t);
            boolean z = false;
            boolean z2 = false;
            for (AbstractC7335v1 v1Var : types) {
                if (z || C7278i0.m23035a(v1Var)) {
                    z = true;
                } else {
                    z = false;
                }
                if (v1Var instanceof AbstractC7304o0) {
                    o0Var = (AbstractC7304o0) v1Var;
                } else if (!(v1Var instanceof AbstractC7223a0)) {
                    throw new C11088q();
                } else if (C7336w.m22890a(v1Var)) {
                    return v1Var;
                } else {
                    o0Var = ((AbstractC7223a0) v1Var).m23170V0();
                    z2 = true;
                }
                arrayList.add(o0Var);
            }
            if (z) {
                return C8039k.m20774d(EnumC8038j.INTERSECTION_OF_ERROR_TYPES, types.toString());
            }
            if (!z2) {
                return C7686w.f16691a.m21654c(arrayList);
            }
            t2 = C9907k.m14809t(types, 10);
            ArrayList arrayList2 = new ArrayList(t2);
            for (AbstractC7335v1 v1Var2 : types) {
                arrayList2.add(C7235d0.m23142d(v1Var2));
            }
            C7686w wVar = C7686w.f16691a;
            return C7270h0.m23056d(wVar.m21654c(arrayList), wVar.m21654c(arrayList2));
        } else {
            r0 = C9914r.m14747r0(types);
            return (AbstractC7335v1) r0;
        }
    }
}
