package p324rg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9906j;
import kotlin.collections.C9921w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import p249nh.C11137c;
import p249nh.C11142f;
import p268og.AbstractC11327h0;
import p268og.AbstractC11346m;
import p268og.AbstractC11368q0;
import p286pi.C11754a;
import p448yh.AbstractC14400c;
import p448yh.AbstractC14414i;
import p448yh.C14403d;

/* renamed from: rg.h0 */
/* loaded from: classes8.dex */
public class C12609h0 extends AbstractC14414i {

    /* renamed from: b */
    private final AbstractC11327h0 f28357b;

    /* renamed from: c */
    private final C11137c f28358c;

    public C12609h0(AbstractC11327h0 moduleDescriptor, C11137c fqName) {
        C9971q.m14633g(moduleDescriptor, "moduleDescriptor");
        C9971q.m14633g(fqName, "fqName");
        this.f28357b = moduleDescriptor;
        this.f28358c = fqName;
    }

    @Override // p448yh.AbstractC14414i, p448yh.AbstractC14416k
    /* renamed from: f */
    public Collection<AbstractC11346m> mo625f(C14403d kindFilter, Function1<? super C11142f, Boolean> nameFilter) {
        List i;
        List i2;
        C9971q.m14633g(kindFilter, "kindFilter");
        C9971q.m14633g(nameFilter, "nameFilter");
        if (!kindFilter.m683a(C14403d.f32585c.m664f())) {
            i2 = C9906j.m14820i();
            return i2;
        } else if (!this.f28358c.m10801d() || !kindFilter.m672l().contains(AbstractC14400c.C14402b.f32584a)) {
            Collection<C11137c> q = this.f28357b.mo6134q(this.f28358c, nameFilter);
            ArrayList arrayList = new ArrayList(q.size());
            for (C11137c cVar : q) {
                C11142f g = cVar.m10798g();
                C9971q.m14634f(g, "subFqName.shortName()");
                if (nameFilter.invoke(g).booleanValue()) {
                    C11754a.m8689a(arrayList, m6358h(g));
                }
            }
            return arrayList;
        } else {
            i = C9906j.m14820i();
            return i;
        }
    }

    @Override // p448yh.AbstractC14414i, p448yh.AbstractC14411h
    /* renamed from: g */
    public Set<C11142f> mo635g() {
        Set<C11142f> d;
        d = C9921w.m14722d();
        return d;
    }

    /* renamed from: h */
    protected final AbstractC11368q0 m6358h(C11142f name) {
        C9971q.m14633g(name, "name");
        if (name.m10766g()) {
            return null;
        }
        AbstractC11327h0 h0Var = this.f28357b;
        C11137c c = this.f28358c.m10802c(name);
        C9971q.m14634f(c, "fqName.child(name)");
        AbstractC11368q0 n0 = h0Var.mo6135n0(c);
        if (n0.isEmpty()) {
            return null;
        }
        return n0;
    }

    public String toString() {
        return "subpackages of " + this.f28358c + " from " + this.f28357b;
    }
}
