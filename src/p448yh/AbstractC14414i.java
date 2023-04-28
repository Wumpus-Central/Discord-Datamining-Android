package p448yh;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9906j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import p249nh.C11142f;
import p268og.AbstractC11326h;
import p268og.AbstractC11346m;
import p268og.AbstractC11388u0;
import p268og.AbstractC11404z0;
import p286pi.C11762d;
import p406wg.AbstractC13878b;

/* renamed from: yh.i */
/* loaded from: classes8.dex */
public abstract class AbstractC14414i implements AbstractC14411h {
    @Override // p448yh.AbstractC14411h
    /* renamed from: a */
    public Collection<? extends AbstractC11388u0> mo627a(C11142f name, AbstractC13878b location) {
        List i;
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        i = C9906j.m14820i();
        return i;
    }

    @Override // p448yh.AbstractC14411h
    /* renamed from: b */
    public Set<C11142f> mo638b() {
        Collection<AbstractC11346m> f = mo625f(C14403d.f32604v, C11762d.m8672a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : f) {
            if (obj instanceof AbstractC11404z0) {
                C11142f name = ((AbstractC11404z0) obj).getName();
                C9971q.m14634f(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // p448yh.AbstractC14411h
    /* renamed from: c */
    public Set<C11142f> mo637c() {
        Collection<AbstractC11346m> f = mo625f(C14403d.f32605w, C11762d.m8672a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : f) {
            if (obj instanceof AbstractC11404z0) {
                C11142f name = ((AbstractC11404z0) obj).getName();
                C9971q.m14634f(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // p448yh.AbstractC14411h
    /* renamed from: d */
    public Collection<? extends AbstractC11404z0> mo626d(C11142f name, AbstractC13878b location) {
        List i;
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        i = C9906j.m14820i();
        return i;
    }

    @Override // p448yh.AbstractC14416k
    /* renamed from: e */
    public AbstractC11326h mo636e(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        return null;
    }

    @Override // p448yh.AbstractC14416k
    /* renamed from: f */
    public Collection<AbstractC11346m> mo625f(C14403d kindFilter, Function1<? super C11142f, Boolean> nameFilter) {
        List i;
        C9971q.m14633g(kindFilter, "kindFilter");
        C9971q.m14633g(nameFilter, "nameFilter");
        i = C9906j.m14820i();
        return i;
    }

    @Override // p448yh.AbstractC14411h
    /* renamed from: g */
    public Set<C11142f> mo635g() {
        return null;
    }
}
