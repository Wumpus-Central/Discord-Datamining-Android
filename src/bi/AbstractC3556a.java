package bi;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9906j;
import kotlin.collections.C9921w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import p087ei.AbstractC6937h;
import p087ei.AbstractC6944n;
import p249nh.C11137c;
import p249nh.C11142f;
import p268og.AbstractC11327h0;
import p268og.AbstractC11344l0;
import p268og.AbstractC11366p0;
import p286pi.C11754a;

/* renamed from: bi.a */
/* loaded from: classes8.dex */
public abstract class AbstractC3556a implements AbstractC11366p0 {

    /* renamed from: a */
    private final AbstractC6944n f5759a;

    /* renamed from: b */
    private final AbstractC3601u f5760b;

    /* renamed from: c */
    private final AbstractC11327h0 f5761c;

    /* renamed from: d */
    protected C3585k f5762d;

    /* renamed from: e */
    private final AbstractC6937h<C11137c, AbstractC11344l0> f5763e;

    /* renamed from: bi.a$a */
    /* loaded from: classes8.dex */
    static final class C0091a extends AbstractC9973s implements Function1<C11137c, AbstractC11344l0> {
        C0091a() {
            super(1);
        }

        /* renamed from: a */
        public final AbstractC11344l0 invoke(C11137c fqName) {
            C9971q.m14633g(fqName, "fqName");
            AbstractC3592p d = AbstractC3556a.this.mo10829d(fqName);
            if (d == null) {
                return null;
            }
            d.mo34006L0(AbstractC3556a.this.m34111e());
            return d;
        }
    }

    public AbstractC3556a(AbstractC6944n storageManager, AbstractC3601u finder, AbstractC11327h0 moduleDescriptor) {
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(finder, "finder");
        C9971q.m14633g(moduleDescriptor, "moduleDescriptor");
        this.f5759a = storageManager;
        this.f5760b = finder;
        this.f5761c = moduleDescriptor;
        this.f5763e = storageManager.mo23894g(new C0091a());
    }

    @Override // p268og.AbstractC11347m0
    /* renamed from: a */
    public List<AbstractC11344l0> mo6357a(C11137c fqName) {
        List<AbstractC11344l0> m;
        C9971q.m14633g(fqName, "fqName");
        m = C9906j.m14816m(this.f5763e.invoke(fqName));
        return m;
    }

    @Override // p268og.AbstractC11366p0
    /* renamed from: b */
    public void mo6356b(C11137c fqName, Collection<AbstractC11344l0> packageFragments) {
        C9971q.m14633g(fqName, "fqName");
        C9971q.m14633g(packageFragments, "packageFragments");
        C11754a.m8689a(packageFragments, this.f5763e.invoke(fqName));
    }

    @Override // p268og.AbstractC11366p0
    /* renamed from: c */
    public boolean mo6355c(C11137c fqName) {
        AbstractC11344l0 l0Var;
        C9971q.m14633g(fqName, "fqName");
        if (this.f5763e.mo23907t(fqName)) {
            l0Var = this.f5763e.invoke(fqName);
        } else {
            l0Var = mo10829d(fqName);
        }
        if (l0Var == null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    protected abstract AbstractC3592p mo10829d(C11137c cVar);

    /* renamed from: e */
    protected final C3585k m34111e() {
        C3585k kVar = this.f5762d;
        if (kVar != null) {
            return kVar;
        }
        C9971q.m14615y("components");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final AbstractC3601u m34110f() {
        return this.f5760b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final AbstractC11327h0 m34109g() {
        return this.f5761c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final AbstractC6944n m34108h() {
        return this.f5759a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final void m34107i(C3585k kVar) {
        C9971q.m14633g(kVar, "<set-?>");
        this.f5762d = kVar;
    }

    @Override // p268og.AbstractC11347m0
    /* renamed from: q */
    public Collection<C11137c> mo6354q(C11137c fqName, Function1<? super C11142f, Boolean> nameFilter) {
        Set d;
        C9971q.m14633g(fqName, "fqName");
        C9971q.m14633g(nameFilter, "nameFilter");
        d = C9921w.m14722d();
        return d;
    }
}
