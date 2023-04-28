package p427xg;

import gh.C7648w;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import p217lg.AbstractC10420h;
import p249nh.C11142f;
import p268og.AbstractC11301b;
import p268og.AbstractC11404z0;
import p388vh.C13508c;

/* renamed from: xg.e */
/* loaded from: classes8.dex */
public final class C14114e extends C14132i0 {

    /* renamed from: n */
    public static final C14114e f31894n = new C14114e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xg.e$a */
    /* loaded from: classes8.dex */
    public static final class C14115a extends AbstractC9973s implements Function1<AbstractC11301b, Boolean> {

        /* renamed from: k */
        final /* synthetic */ AbstractC11404z0 f31895k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14115a(AbstractC11404z0 z0Var) {
            super(1);
            this.f31895k = z0Var;
        }

        /* renamed from: a */
        public final Boolean invoke(AbstractC11301b it) {
            C9971q.m14633g(it, "it");
            return Boolean.valueOf(C14132i0.f31919a.m1548j().containsKey(C7648w.m21802d(this.f31895k)));
        }
    }

    private C14114e() {
    }

    /* renamed from: i */
    public final C11142f m1612i(AbstractC11404z0 functionDescriptor) {
        C9971q.m14633g(functionDescriptor, "functionDescriptor");
        Map<String, C11142f> j = C14132i0.f31919a.m1548j();
        String d = C7648w.m21802d(functionDescriptor);
        if (d == null) {
            return null;
        }
        return j.get(d);
    }

    /* renamed from: j */
    public final boolean m1611j(AbstractC11404z0 functionDescriptor) {
        C9971q.m14633g(functionDescriptor, "functionDescriptor");
        if (!AbstractC10420h.m13391f0(functionDescriptor) || C13508c.m3535f(functionDescriptor, false, new C14115a(functionDescriptor), 1, null) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m1610k(AbstractC11404z0 z0Var) {
        C9971q.m14633g(z0Var, "<this>");
        if (!C9971q.m14638b(z0Var.getName().m10771b(), "removeAt") || !C9971q.m14638b(C7648w.m21802d(z0Var), C14132i0.f31919a.m1550h().m1543b())) {
            return false;
        }
        return true;
    }
}
