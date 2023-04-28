package mg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9914r;
import kotlin.collections.C9921w;
import kotlin.jvm.internal.C9971q;
import mg.EnumC10600c;
import p087ei.AbstractC6944n;
import p217lg.AbstractC10413b;
import p217lg.AbstractC10418f;
import p249nh.C11136b;
import p249nh.C11137c;
import p249nh.C11142f;
import p268og.AbstractC11313e;
import p268og.AbstractC11327h0;
import p268og.AbstractC11344l0;
import p304qg.AbstractC12126b;
import p326ri.C12718u;
import p326ri.C12719v;

/* renamed from: mg.a */
/* loaded from: classes8.dex */
public final class C10597a implements AbstractC12126b {

    /* renamed from: a */
    private final AbstractC6944n f23459a;

    /* renamed from: b */
    private final AbstractC11327h0 f23460b;

    public C10597a(AbstractC6944n storageManager, AbstractC11327h0 module) {
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(module, "module");
        this.f23459a = storageManager;
        this.f23460b = module;
    }

    @Override // p304qg.AbstractC12126b
    /* renamed from: a */
    public Collection<AbstractC11313e> mo7769a(C11137c packageFqName) {
        Set d;
        C9971q.m14633g(packageFqName, "packageFqName");
        d = C9921w.m14722d();
        return d;
    }

    @Override // p304qg.AbstractC12126b
    /* renamed from: b */
    public boolean mo7768b(C11137c packageFqName, C11142f name) {
        boolean H;
        boolean H2;
        boolean H3;
        boolean H4;
        C9971q.m14633g(packageFqName, "packageFqName");
        C9971q.m14633g(name, "name");
        String b = name.m10771b();
        C9971q.m14634f(b, "name.asString()");
        H = C12718u.m5736H(b, "Function", false, 2, null);
        if (!H) {
            H2 = C12718u.m5736H(b, "KFunction", false, 2, null);
            if (!H2) {
                H3 = C12718u.m5736H(b, "SuspendFunction", false, 2, null);
                if (!H3) {
                    H4 = C12718u.m5736H(b, "KSuspendFunction", false, 2, null);
                    if (!H4) {
                        return false;
                    }
                }
            }
        }
        if (EnumC10600c.f23473o.m12754c(b, packageFqName) != null) {
            return true;
        }
        return false;
    }

    @Override // p304qg.AbstractC12126b
    /* renamed from: c */
    public AbstractC11313e mo7767c(C11136b classId) {
        boolean M;
        Object W;
        Object U;
        C9971q.m14633g(classId, "classId");
        if (classId.m10807k() || classId.m10806l()) {
            return null;
        }
        String b = classId.m10809i().m10803b();
        C9971q.m14634f(b, "classId.relativeClassName.asString()");
        M = C12719v.m5709M(b, "Function", false, 2, null);
        if (!M) {
            return null;
        }
        C11137c h = classId.m10810h();
        C9971q.m14634f(h, "classId.packageFqName");
        EnumC10600c.C10601a.C0342a c = EnumC10600c.f23473o.m12754c(b, h);
        if (c == null) {
            return null;
        }
        EnumC10600c a = c.m12752a();
        int b2 = c.m12751b();
        List<AbstractC11344l0> f0 = this.f23460b.mo6135n0(h).mo6181f0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : f0) {
            if (obj instanceof AbstractC10413b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof AbstractC10418f) {
                arrayList2.add(obj2);
            }
        }
        W = C9914r.m14768W(arrayList2);
        AbstractC11344l0 l0Var = (AbstractC10418f) W;
        if (l0Var == null) {
            U = C9914r.m14770U(arrayList);
            l0Var = (AbstractC10413b) U;
        }
        return new C10598b(this.f23459a, l0Var, a, b2);
    }
}
