package p448yh;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9899f;
import kotlin.collections.C9906j;
import kotlin.collections.C9911o;
import kotlin.collections.C9921w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p249nh.C11142f;
import p268og.AbstractC11326h;
import p268og.AbstractC11330i;
import p268og.AbstractC11346m;
import p268og.AbstractC11388u0;
import p268og.AbstractC11404z0;
import p270oi.C11406a;
import p286pi.C11768e;
import p406wg.AbstractC13878b;
import p448yh.AbstractC14411h;

/* renamed from: yh.b */
/* loaded from: classes8.dex */
public final class C14398b implements AbstractC14411h {

    /* renamed from: d */
    public static final C14399a f32579d = new C14399a(null);

    /* renamed from: b */
    private final String f32580b;

    /* renamed from: c */
    private final AbstractC14411h[] f32581c;

    /* renamed from: yh.b$a */
    /* loaded from: classes8.dex */
    public static final class C14399a {
        private C14399a() {
        }

        public /* synthetic */ C14399a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC14411h m686a(String debugName, Iterable<? extends AbstractC14411h> scopes) {
            C9971q.m14633g(debugName, "debugName");
            C9971q.m14633g(scopes, "scopes");
            C11768e eVar = new C11768e();
            for (AbstractC14411h hVar : scopes) {
                if (hVar != AbstractC14411h.C14413b.f32626b) {
                    if (hVar instanceof C14398b) {
                        C9911o.m14800z(eVar, ((C14398b) hVar).f32581c);
                    } else {
                        eVar.add(hVar);
                    }
                }
            }
            return m685b(debugName, eVar);
        }

        /* renamed from: b */
        public final AbstractC14411h m685b(String debugName, List<? extends AbstractC14411h> scopes) {
            C9971q.m14633g(debugName, "debugName");
            C9971q.m14633g(scopes, "scopes");
            int size = scopes.size();
            if (size == 0) {
                return AbstractC14411h.C14413b.f32626b;
            }
            if (size != 1) {
                return new C14398b(debugName, (AbstractC14411h[]) scopes.toArray(new AbstractC14411h[0]), null);
            }
            return (AbstractC14411h) scopes.get(0);
        }
    }

    private C14398b(String str, AbstractC14411h[] hVarArr) {
        this.f32580b = str;
        this.f32581c = hVarArr;
    }

    public /* synthetic */ C14398b(String str, AbstractC14411h[] hVarArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, hVarArr);
    }

    @Override // p448yh.AbstractC14411h
    /* renamed from: a */
    public Collection<AbstractC11388u0> mo627a(C11142f name, AbstractC13878b location) {
        List i;
        Set d;
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        AbstractC14411h[] hVarArr = this.f32581c;
        int length = hVarArr.length;
        if (length != 0) {
            if (length == 1) {
                return hVarArr[0].mo627a(name, location);
            }
            Collection<AbstractC11388u0> collection = null;
            for (AbstractC14411h hVar : hVarArr) {
                collection = C11406a.m10133a(collection, hVar.mo627a(name, location));
            }
            if (collection != null) {
                return collection;
            }
            d = C9921w.m14722d();
            return d;
        }
        i = C9906j.m14820i();
        return i;
    }

    @Override // p448yh.AbstractC14411h
    /* renamed from: b */
    public Set<C11142f> mo638b() {
        AbstractC14411h[] hVarArr = this.f32581c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AbstractC14411h hVar : hVarArr) {
            C9911o.m14801y(linkedHashSet, hVar.mo638b());
        }
        return linkedHashSet;
    }

    @Override // p448yh.AbstractC14411h
    /* renamed from: c */
    public Set<C11142f> mo637c() {
        AbstractC14411h[] hVarArr = this.f32581c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AbstractC14411h hVar : hVarArr) {
            C9911o.m14801y(linkedHashSet, hVar.mo637c());
        }
        return linkedHashSet;
    }

    @Override // p448yh.AbstractC14411h
    /* renamed from: d */
    public Collection<AbstractC11404z0> mo626d(C11142f name, AbstractC13878b location) {
        List i;
        Set d;
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        AbstractC14411h[] hVarArr = this.f32581c;
        int length = hVarArr.length;
        if (length != 0) {
            if (length == 1) {
                return hVarArr[0].mo626d(name, location);
            }
            Collection<AbstractC11404z0> collection = null;
            for (AbstractC14411h hVar : hVarArr) {
                collection = C11406a.m10133a(collection, hVar.mo626d(name, location));
            }
            if (collection != null) {
                return collection;
            }
            d = C9921w.m14722d();
            return d;
        }
        i = C9906j.m14820i();
        return i;
    }

    @Override // p448yh.AbstractC14416k
    /* renamed from: e */
    public AbstractC11326h mo636e(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        AbstractC11326h hVar = null;
        for (AbstractC14411h hVar2 : this.f32581c) {
            AbstractC11326h e = hVar2.mo636e(name, location);
            if (e != null) {
                if (!(e instanceof AbstractC11330i) || !((AbstractC11330i) e).mo6114h0()) {
                    return e;
                }
                if (hVar == null) {
                    hVar = e;
                }
            }
        }
        return hVar;
    }

    @Override // p448yh.AbstractC14416k
    /* renamed from: f */
    public Collection<AbstractC11346m> mo625f(C14403d kindFilter, Function1<? super C11142f, Boolean> nameFilter) {
        List i;
        Set d;
        C9971q.m14633g(kindFilter, "kindFilter");
        C9971q.m14633g(nameFilter, "nameFilter");
        AbstractC14411h[] hVarArr = this.f32581c;
        int length = hVarArr.length;
        if (length != 0) {
            if (length == 1) {
                return hVarArr[0].mo625f(kindFilter, nameFilter);
            }
            Collection<AbstractC11346m> collection = null;
            for (AbstractC14411h hVar : hVarArr) {
                collection = C11406a.m10133a(collection, hVar.mo625f(kindFilter, nameFilter));
            }
            if (collection != null) {
                return collection;
            }
            d = C9921w.m14722d();
            return d;
        }
        i = C9906j.m14820i();
        return i;
    }

    @Override // p448yh.AbstractC14411h
    /* renamed from: g */
    public Set<C11142f> mo635g() {
        Iterable t;
        t = C9899f.m14917t(this.f32581c);
        return C14415j.m646a(t);
    }

    public String toString() {
        return this.f32580b;
    }
}
