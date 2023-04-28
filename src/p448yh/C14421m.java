package p448yh;

import fi.AbstractC7299n1;
import fi.C7309p1;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import nf.C11084n;
import p249nh.C11142f;
import p268og.AbstractC11308c1;
import p268og.AbstractC11326h;
import p268og.AbstractC11346m;
import p268og.AbstractC11388u0;
import p268og.AbstractC11404z0;
import p286pi.C11754a;
import p406wg.AbstractC13878b;
import p448yh.AbstractC14416k;
import sh.C12902d;

/* renamed from: yh.m */
/* loaded from: classes8.dex */
public final class C14421m implements AbstractC14411h {

    /* renamed from: b */
    private final AbstractC14411h f32633b;

    /* renamed from: c */
    private final Lazy f32634c;

    /* renamed from: d */
    private final C7309p1 f32635d;

    /* renamed from: e */
    private Map<AbstractC11346m, AbstractC11346m> f32636e;

    /* renamed from: f */
    private final Lazy f32637f;

    /* renamed from: yh.m$a */
    /* loaded from: classes8.dex */
    static final class C14422a extends AbstractC9973s implements Function0<Collection<? extends AbstractC11346m>> {
        C14422a() {
            super(0);
        }

        /* renamed from: a */
        public final Collection<AbstractC11346m> invoke() {
            C14421m mVar = C14421m.this;
            return mVar.m631k(AbstractC14416k.C14417a.m645a(mVar.f32633b, null, null, 3, null));
        }
    }

    /* renamed from: yh.m$b */
    /* loaded from: classes8.dex */
    static final class C14423b extends AbstractC9973s implements Function0<C7309p1> {

        /* renamed from: k */
        final /* synthetic */ C7309p1 f32639k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14423b(C7309p1 p1Var) {
            super(0);
            this.f32639k = p1Var;
        }

        /* renamed from: a */
        public final C7309p1 invoke() {
            return this.f32639k.m22976j().m23003c();
        }
    }

    public C14421m(AbstractC14411h workerScope, C7309p1 givenSubstitutor) {
        Lazy a;
        Lazy a2;
        C9971q.m14633g(workerScope, "workerScope");
        C9971q.m14633g(givenSubstitutor, "givenSubstitutor");
        this.f32633b = workerScope;
        a = C11084n.m10945a(new C14423b(givenSubstitutor));
        this.f32634c = a;
        AbstractC7299n1 j = givenSubstitutor.m22976j();
        C9971q.m14634f(j, "givenSubstitutor.substitution");
        this.f32635d = C12902d.m5150f(j, false, 1, null).m23003c();
        a2 = C11084n.m10945a(new C14422a());
        this.f32637f = a2;
    }

    /* renamed from: j */
    private final Collection<AbstractC11346m> m632j() {
        return (Collection) this.f32637f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final <D extends AbstractC11346m> Collection<D> m631k(Collection<? extends D> collection) {
        if (this.f32635d.m22975k()) {
            return collection;
        }
        if (collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet g = C11754a.m8683g(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            g.add(m630l((AbstractC11346m) it.next()));
        }
        return g;
    }

    /* renamed from: l */
    private final <D extends AbstractC11346m> D m630l(D d) {
        if (this.f32635d.m22975k()) {
            return d;
        }
        if (this.f32636e == null) {
            this.f32636e = new HashMap();
        }
        Map<AbstractC11346m, AbstractC11346m> map = this.f32636e;
        C9971q.m14636d(map);
        AbstractC11346m mVar = map.get(d);
        if (mVar == null) {
            if (d instanceof AbstractC11308c1) {
                mVar = ((AbstractC11308c1) d).mo6167c(this.f32635d);
                if (mVar != null) {
                    map.put(d, mVar);
                } else {
                    throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d + " substitution fails");
                }
            } else {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d).toString());
            }
        }
        D d2 = (D) mVar;
        C9971q.m14635e(d2, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return d2;
    }

    @Override // p448yh.AbstractC14411h
    /* renamed from: a */
    public Collection<? extends AbstractC11388u0> mo627a(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        return m631k(this.f32633b.mo627a(name, location));
    }

    @Override // p448yh.AbstractC14411h
    /* renamed from: b */
    public Set<C11142f> mo638b() {
        return this.f32633b.mo638b();
    }

    @Override // p448yh.AbstractC14411h
    /* renamed from: c */
    public Set<C11142f> mo637c() {
        return this.f32633b.mo637c();
    }

    @Override // p448yh.AbstractC14411h
    /* renamed from: d */
    public Collection<? extends AbstractC11404z0> mo626d(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        return m631k(this.f32633b.mo626d(name, location));
    }

    @Override // p448yh.AbstractC14416k
    /* renamed from: e */
    public AbstractC11326h mo636e(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        AbstractC11326h e = this.f32633b.mo636e(name, location);
        if (e != null) {
            return (AbstractC11326h) m630l(e);
        }
        return null;
    }

    @Override // p448yh.AbstractC14416k
    /* renamed from: f */
    public Collection<AbstractC11346m> mo625f(C14403d kindFilter, Function1<? super C11142f, Boolean> nameFilter) {
        C9971q.m14633g(kindFilter, "kindFilter");
        C9971q.m14633g(nameFilter, "nameFilter");
        return m632j();
    }

    @Override // p448yh.AbstractC14411h
    /* renamed from: g */
    public Set<C11142f> mo635g() {
        return this.f32633b.mo635g();
    }
}
