package p448yh;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import p249nh.C11142f;
import p268og.AbstractC11326h;
import p268og.AbstractC11346m;
import p268og.AbstractC11388u0;
import p268og.AbstractC11404z0;
import p406wg.AbstractC13878b;

/* renamed from: yh.a */
/* loaded from: classes8.dex */
public abstract class AbstractC14397a implements AbstractC14411h {
    @Override // p448yh.AbstractC14411h
    /* renamed from: a */
    public Collection<AbstractC11388u0> mo627a(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        return mo624i().mo627a(name, location);
    }

    @Override // p448yh.AbstractC14411h
    /* renamed from: b */
    public Set<C11142f> mo638b() {
        return mo624i().mo638b();
    }

    @Override // p448yh.AbstractC14411h
    /* renamed from: c */
    public Set<C11142f> mo637c() {
        return mo624i().mo637c();
    }

    @Override // p448yh.AbstractC14411h
    /* renamed from: d */
    public Collection<AbstractC11404z0> mo626d(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        return mo624i().mo626d(name, location);
    }

    @Override // p448yh.AbstractC14416k
    /* renamed from: e */
    public AbstractC11326h mo636e(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        return mo624i().mo636e(name, location);
    }

    @Override // p448yh.AbstractC14416k
    /* renamed from: f */
    public Collection<AbstractC11346m> mo625f(C14403d kindFilter, Function1<? super C11142f, Boolean> nameFilter) {
        C9971q.m14633g(kindFilter, "kindFilter");
        C9971q.m14633g(nameFilter, "nameFilter");
        return mo624i().mo625f(kindFilter, nameFilter);
    }

    @Override // p448yh.AbstractC14411h
    /* renamed from: g */
    public Set<C11142f> mo635g() {
        return mo624i().mo635g();
    }

    /* renamed from: h */
    public final AbstractC14411h m688h() {
        if (!(mo624i() instanceof AbstractC14397a)) {
            return mo624i();
        }
        AbstractC14411h i = mo624i();
        C9971q.m14635e(i, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((AbstractC14397a) i).m688h();
    }

    /* renamed from: i */
    protected abstract AbstractC14411h mo624i();
}
