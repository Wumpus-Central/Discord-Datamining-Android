package p448yh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9906j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import p249nh.C11142f;
import p268og.AbstractC11313e;
import p268og.AbstractC11316e1;
import p268og.AbstractC11326h;
import p268og.AbstractC11330i;
import p268og.AbstractC11346m;
import p406wg.AbstractC13878b;

/* renamed from: yh.f */
/* loaded from: classes8.dex */
public final class C14408f extends AbstractC14414i {

    /* renamed from: b */
    private final AbstractC14411h f32619b;

    public C14408f(AbstractC14411h workerScope) {
        C9971q.m14633g(workerScope, "workerScope");
        this.f32619b = workerScope;
    }

    @Override // p448yh.AbstractC14414i, p448yh.AbstractC14411h
    /* renamed from: b */
    public Set<C11142f> mo638b() {
        return this.f32619b.mo638b();
    }

    @Override // p448yh.AbstractC14414i, p448yh.AbstractC14411h
    /* renamed from: c */
    public Set<C11142f> mo637c() {
        return this.f32619b.mo637c();
    }

    @Override // p448yh.AbstractC14414i, p448yh.AbstractC14416k
    /* renamed from: e */
    public AbstractC11326h mo636e(C11142f name, AbstractC13878b location) {
        AbstractC11313e eVar;
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        AbstractC11326h e = this.f32619b.mo636e(name, location);
        if (e == null) {
            return null;
        }
        if (e instanceof AbstractC11313e) {
            eVar = (AbstractC11313e) e;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            return eVar;
        }
        if (e instanceof AbstractC11316e1) {
            return (AbstractC11316e1) e;
        }
        return null;
    }

    @Override // p448yh.AbstractC14414i, p448yh.AbstractC14411h
    /* renamed from: g */
    public Set<C11142f> mo635g() {
        return this.f32619b.mo635g();
    }

    /* renamed from: h */
    public List<AbstractC11326h> mo625f(C14403d kindFilter, Function1<? super C11142f, Boolean> nameFilter) {
        List<AbstractC11326h> i;
        C9971q.m14633g(kindFilter, "kindFilter");
        C9971q.m14633g(nameFilter, "nameFilter");
        C14403d n = kindFilter.m670n(C14403d.f32585c.m667c());
        if (n == null) {
            i = C9906j.m14820i();
            return i;
        }
        Collection<AbstractC11346m> f = this.f32619b.mo625f(n, nameFilter);
        ArrayList arrayList = new ArrayList();
        for (Object obj : f) {
            if (obj instanceof AbstractC11330i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public String toString() {
        return "Classes from " + this.f32619b;
    }
}
