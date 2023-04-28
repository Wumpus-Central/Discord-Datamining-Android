package fi;

import kotlin.jvm.internal.C9971q;
import p268og.AbstractC11319f1;

/* renamed from: fi.x */
/* loaded from: classes8.dex */
public class C7339x {
    /* renamed from: b */
    public static /* synthetic */ AbstractC7290k1 m22884b(C7339x xVar, AbstractC11319f1 f1Var, C7343y yVar, C7283j1 j1Var, AbstractC7267g0 g0Var, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                g0Var = j1Var.m23020c(f1Var, yVar);
            }
            return xVar.mo22885a(f1Var, yVar, j1Var, g0Var);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: computeProjection");
    }

    /* renamed from: a */
    public AbstractC7290k1 mo22885a(AbstractC11319f1 parameter, C7343y typeAttr, C7283j1 typeParameterUpperBoundEraser, AbstractC7267g0 erasedUpperBound) {
        C9971q.m14633g(parameter, "parameter");
        C9971q.m14633g(typeAttr, "typeAttr");
        C9971q.m14633g(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        C9971q.m14633g(erasedUpperBound, "erasedUpperBound");
        return new C7296m1(EnumC7338w1.OUT_VARIANCE, erasedUpperBound);
    }
}
