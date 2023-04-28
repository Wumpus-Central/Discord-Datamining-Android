package p268og;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import p217lg.AbstractC10420h;
import p249nh.C11137c;
import p249nh.C11142f;

/* renamed from: og.h0 */
/* loaded from: classes8.dex */
public interface AbstractC11327h0 extends AbstractC11346m {

    /* renamed from: og.h0$a */
    /* loaded from: classes8.dex */
    public static final class C11328a {
        /* renamed from: a */
        public static <R, D> R m10205a(AbstractC11327h0 h0Var, AbstractC11363o<R, D> visitor, D d) {
            C9971q.m14633g(visitor, "visitor");
            return visitor.mo6320d(h0Var, d);
        }

        /* renamed from: b */
        public static AbstractC11346m m10204b(AbstractC11327h0 h0Var) {
            return null;
        }
    }

    /* renamed from: m0 */
    boolean mo6137m0(AbstractC11327h0 h0Var);

    /* renamed from: n */
    AbstractC10420h mo6136n();

    /* renamed from: n0 */
    AbstractC11368q0 mo6135n0(C11137c cVar);

    /* renamed from: q */
    Collection<C11137c> mo6134q(C11137c cVar, Function1<? super C11142f, Boolean> function1);

    /* renamed from: v0 */
    <T> T mo6133v0(C11321g0<T> g0Var);

    /* renamed from: x0 */
    List<AbstractC11327h0> mo6132x0();
}
