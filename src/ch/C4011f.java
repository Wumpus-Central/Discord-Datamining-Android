package ch;

import fi.AbstractC7267g0;
import fi.AbstractC7290k1;
import fi.C7283j1;
import fi.C7296m1;
import fi.C7322s1;
import fi.C7339x;
import fi.C7343y;
import fi.EnumC7338w1;
import java.util.List;
import kotlin.jvm.internal.C9971q;
import nf.C11088q;
import p268og.AbstractC11319f1;
import p388vh.C13508c;

/* renamed from: ch.f */
/* loaded from: classes8.dex */
public final class C4011f extends C7339x {

    /* renamed from: ch.f$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C4012a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6598a;

        static {
            int[] iArr = new int[EnumC4007c.values().length];
            try {
                iArr[EnumC4007c.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4007c.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4007c.INFLEXIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6598a = iArr;
        }
    }

    @Override // fi.C7339x
    /* renamed from: a */
    public AbstractC7290k1 mo22885a(AbstractC11319f1 parameter, C7343y typeAttr, C7283j1 typeParameterUpperBoundEraser, AbstractC7267g0 erasedUpperBound) {
        AbstractC7290k1 k1Var;
        C9971q.m14633g(parameter, "parameter");
        C9971q.m14633g(typeAttr, "typeAttr");
        C9971q.m14633g(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        C9971q.m14633g(erasedUpperBound, "erasedUpperBound");
        if (!(typeAttr instanceof C4005a)) {
            return super.mo22885a(parameter, typeAttr, typeParameterUpperBoundEraser, erasedUpperBound);
        }
        C4005a aVar = (C4005a) typeAttr;
        if (!aVar.m33115i()) {
            aVar = aVar.m33112l(EnumC4007c.INFLEXIBLE);
        }
        int i = C4012a.f6598a[aVar.m33117g().ordinal()];
        if (i == 1) {
            return new C7296m1(EnumC7338w1.INVARIANT, erasedUpperBound);
        }
        if (i == 2 || i == 3) {
            if (!parameter.mo6392m().m22887b()) {
                k1Var = new C7296m1(EnumC7338w1.INVARIANT, C13508c.m3531j(parameter).m13420H());
            } else {
                List<AbstractC11319f1> parameters = erasedUpperBound.mo5172N0().getParameters();
                C9971q.m14634f(parameters, "erasedUpperBound.constructor.parameters");
                if (!parameters.isEmpty()) {
                    k1Var = new C7296m1(EnumC7338w1.OUT_VARIANCE, erasedUpperBound);
                } else {
                    k1Var = C7322s1.m22927t(parameter, aVar);
                }
            }
            C9971q.m14634f(k1Var, "{\n                if (!p…          }\n            }");
            return k1Var;
        }
        throw new C11088q();
    }
}
