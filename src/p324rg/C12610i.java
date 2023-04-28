package p324rg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import p249nh.C11137c;
import p249nh.C11142f;
import p268og.AbstractC11344l0;
import p268og.AbstractC11347m0;
import p268og.AbstractC11366p0;
import p268og.C11364o0;

/* renamed from: rg.i */
/* loaded from: classes8.dex */
public final class C12610i implements AbstractC11366p0 {

    /* renamed from: a */
    private final List<AbstractC11347m0> f28359a;

    /* renamed from: b */
    private final String f28360b;

    /* JADX WARN: Multi-variable type inference failed */
    public C12610i(List<? extends AbstractC11347m0> providers, String debugName) {
        Set H0;
        C9971q.m14633g(providers, "providers");
        C9971q.m14633g(debugName, "debugName");
        this.f28359a = providers;
        this.f28360b = debugName;
        providers.size();
        H0 = C9914r.m14786H0(providers);
        H0.size();
    }

    @Override // p268og.AbstractC11347m0
    /* renamed from: a */
    public List<AbstractC11344l0> mo6357a(C11137c fqName) {
        List<AbstractC11344l0> D0;
        C9971q.m14633g(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        for (AbstractC11347m0 m0Var : this.f28359a) {
            C11364o0.m10184a(m0Var, fqName, arrayList);
        }
        D0 = C9914r.m14790D0(arrayList);
        return D0;
    }

    @Override // p268og.AbstractC11366p0
    /* renamed from: b */
    public void mo6356b(C11137c fqName, Collection<AbstractC11344l0> packageFragments) {
        C9971q.m14633g(fqName, "fqName");
        C9971q.m14633g(packageFragments, "packageFragments");
        for (AbstractC11347m0 m0Var : this.f28359a) {
            C11364o0.m10184a(m0Var, fqName, packageFragments);
        }
    }

    @Override // p268og.AbstractC11366p0
    /* renamed from: c */
    public boolean mo6355c(C11137c fqName) {
        C9971q.m14633g(fqName, "fqName");
        List<AbstractC11347m0> list = this.f28359a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (AbstractC11347m0 m0Var : list) {
            if (!C11364o0.m10183b(m0Var, fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // p268og.AbstractC11347m0
    /* renamed from: q */
    public Collection<C11137c> mo6354q(C11137c fqName, Function1<? super C11142f, Boolean> nameFilter) {
        C9971q.m14633g(fqName, "fqName");
        C9971q.m14633g(nameFilter, "nameFilter");
        HashSet hashSet = new HashSet();
        for (AbstractC11347m0 m0Var : this.f28359a) {
            hashSet.addAll(m0Var.mo6354q(fqName, nameFilter));
        }
        return hashSet;
    }

    public String toString() {
        return this.f28360b;
    }
}
