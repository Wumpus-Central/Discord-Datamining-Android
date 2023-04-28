package bi;

import kotlin.jvm.internal.C9971q;
import p249nh.C11136b;
import p249nh.C11137c;
import p268og.AbstractC11344l0;
import p268og.AbstractC11347m0;
import p268og.C11364o0;

/* renamed from: bi.o */
/* loaded from: classes8.dex */
public final class C3591o implements AbstractC3578h {

    /* renamed from: a */
    private final AbstractC11347m0 f5852a;

    public C3591o(AbstractC11347m0 packageFragmentProvider) {
        C9971q.m14633g(packageFragmentProvider, "packageFragmentProvider");
        this.f5852a = packageFragmentProvider;
    }

    @Override // bi.AbstractC3578h
    /* renamed from: a */
    public C3577g mo21860a(C11136b classId) {
        C3577g a;
        C9971q.m14633g(classId, "classId");
        AbstractC11347m0 m0Var = this.f5852a;
        C11137c h = classId.m10810h();
        C9971q.m14634f(h, "classId.packageFqName");
        for (AbstractC11344l0 l0Var : C11364o0.m10182c(m0Var, h)) {
            if ((l0Var instanceof AbstractC3592p) && (a = ((AbstractC3592p) l0Var).mo34007G0().mo21860a(classId)) != null) {
                return a;
            }
        }
        return null;
    }
}
