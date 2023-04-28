package fi;

import p268og.AbstractC11346m;
import pg.AbstractC11672g;

/* renamed from: fi.b1 */
/* loaded from: classes8.dex */
public interface AbstractC7228b1 {

    /* renamed from: fi.b1$a */
    /* loaded from: classes8.dex */
    public static final class C7229a {
        /* renamed from: a */
        public static /* synthetic */ C7232c1 m23165a(AbstractC7228b1 b1Var, AbstractC11672g gVar, AbstractC7268g1 g1Var, AbstractC11346m mVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    g1Var = null;
                }
                if ((i & 4) != 0) {
                    mVar = null;
                }
                return b1Var.mo23000a(gVar, g1Var, mVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAttributes");
        }
    }

    /* renamed from: a */
    C7232c1 mo23000a(AbstractC11672g gVar, AbstractC7268g1 g1Var, AbstractC11346m mVar);
}
