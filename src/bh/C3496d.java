package bh;

import gh.AbstractC7637r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C9899f;
import kotlin.collections.C9911o;
import kotlin.collections.C9921w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9944c0;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KProperty;
import p013ah.C1399g;
import p086eh.AbstractC6909u;
import p087ei.AbstractC6938i;
import p087ei.C6943m;
import p249nh.C11142f;
import p268og.AbstractC11313e;
import p268og.AbstractC11326h;
import p268og.AbstractC11330i;
import p268og.AbstractC11346m;
import p268og.AbstractC11388u0;
import p268og.AbstractC11404z0;
import p270oi.C11406a;
import p406wg.AbstractC13878b;
import p448yh.AbstractC14411h;
import p448yh.C14403d;
import p448yh.C14415j;
import vg.C13505a;

/* renamed from: bh.d */
/* loaded from: classes8.dex */
public final class C3496d implements AbstractC14411h {

    /* renamed from: f */
    static final /* synthetic */ KProperty<Object>[] f5632f = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(C3496d.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: b */
    private final C1399g f5633b;

    /* renamed from: c */
    private final C3521h f5634c;

    /* renamed from: d */
    private final C3526i f5635d;

    /* renamed from: e */
    private final AbstractC6938i f5636e;

    /* renamed from: bh.d$a */
    /* loaded from: classes8.dex */
    static final class C3497a extends AbstractC9973s implements Function0<AbstractC14411h[]> {
        C3497a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC14411h[] invoke() {
            Collection<AbstractC7637r> values = C3496d.this.f5634c.m34192M0().values();
            C3496d dVar = C3496d.this;
            ArrayList arrayList = new ArrayList();
            for (AbstractC7637r rVar : values) {
                AbstractC14411h b = dVar.f5633b.m41174a().m41208b().m21874b(dVar.f5634c, rVar);
                if (b != null) {
                    arrayList.add(b);
                }
            }
            return (AbstractC14411h[]) C11406a.m10132b(arrayList).toArray(new AbstractC14411h[0]);
        }
    }

    public C3496d(C1399g c, AbstractC6909u jPackage, C3521h packageFragment) {
        C9971q.m14633g(c, "c");
        C9971q.m14633g(jPackage, "jPackage");
        C9971q.m14633g(packageFragment, "packageFragment");
        this.f5633b = c;
        this.f5634c = packageFragment;
        this.f5635d = new C3526i(c, jPackage, packageFragment);
        this.f5636e = c.m41170e().mo23898c(new C3497a());
    }

    /* renamed from: k */
    private final AbstractC14411h[] m34290k() {
        return (AbstractC14411h[]) C6943m.m23902a(this.f5636e, this, f5632f[0]);
    }

    @Override // p448yh.AbstractC14411h
    /* renamed from: a */
    public Collection<AbstractC11388u0> mo627a(C11142f name, AbstractC13878b location) {
        Set d;
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        m34289l(name, location);
        C3526i iVar = this.f5635d;
        AbstractC14411h[] k = m34290k();
        Collection<? extends AbstractC11388u0> a = iVar.mo627a(name, location);
        int length = k.length;
        int i = 0;
        Collection collection = a;
        while (i < length) {
            i++;
            collection = C11406a.m10133a(collection, k[i].mo627a(name, location));
        }
        if (collection != null) {
            return collection;
        }
        d = C9921w.m14722d();
        return d;
    }

    @Override // p448yh.AbstractC14411h
    /* renamed from: b */
    public Set<C11142f> mo638b() {
        AbstractC14411h[] k = m34290k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AbstractC14411h hVar : k) {
            C9911o.m14801y(linkedHashSet, hVar.mo638b());
        }
        linkedHashSet.addAll(this.f5635d.mo638b());
        return linkedHashSet;
    }

    @Override // p448yh.AbstractC14411h
    /* renamed from: c */
    public Set<C11142f> mo637c() {
        AbstractC14411h[] k = m34290k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AbstractC14411h hVar : k) {
            C9911o.m14801y(linkedHashSet, hVar.mo637c());
        }
        linkedHashSet.addAll(this.f5635d.mo637c());
        return linkedHashSet;
    }

    @Override // p448yh.AbstractC14411h
    /* renamed from: d */
    public Collection<AbstractC11404z0> mo626d(C11142f name, AbstractC13878b location) {
        Set d;
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        m34289l(name, location);
        C3526i iVar = this.f5635d;
        AbstractC14411h[] k = m34290k();
        Collection<? extends AbstractC11404z0> d2 = iVar.mo626d(name, location);
        int length = k.length;
        int i = 0;
        Collection collection = d2;
        while (i < length) {
            i++;
            collection = C11406a.m10133a(collection, k[i].mo626d(name, location));
        }
        if (collection != null) {
            return collection;
        }
        d = C9921w.m14722d();
        return d;
    }

    @Override // p448yh.AbstractC14416k
    /* renamed from: e */
    public AbstractC11326h mo636e(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        m34289l(name, location);
        AbstractC11313e P = this.f5635d.mo636e(name, location);
        if (P != null) {
            return P;
        }
        AbstractC11326h hVar = null;
        for (AbstractC14411h hVar2 : m34290k()) {
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
        Set d;
        C9971q.m14633g(kindFilter, "kindFilter");
        C9971q.m14633g(nameFilter, "nameFilter");
        C3526i iVar = this.f5635d;
        AbstractC14411h[] k = m34290k();
        Collection<AbstractC11346m> f = iVar.mo625f(kindFilter, nameFilter);
        for (AbstractC14411h hVar : k) {
            f = C11406a.m10133a(f, hVar.mo625f(kindFilter, nameFilter));
        }
        if (f != null) {
            return f;
        }
        d = C9921w.m14722d();
        return d;
    }

    @Override // p448yh.AbstractC14411h
    /* renamed from: g */
    public Set<C11142f> mo635g() {
        Iterable t;
        t = C9899f.m14917t(m34290k());
        Set<C11142f> a = C14415j.m646a(t);
        if (a == null) {
            return null;
        }
        a.addAll(this.f5635d.mo635g());
        return a;
    }

    /* renamed from: j */
    public final C3526i m34291j() {
        return this.f5635d;
    }

    /* renamed from: l */
    public void m34289l(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        C13505a.m3543b(this.f5633b.m41174a().m41198l(), location, this.f5634c, name);
    }

    public String toString() {
        return "scope for " + this.f5634c;
    }
}
