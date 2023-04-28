package p268og;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.sequences.Sequence;
import p249nh.C11137c;
import p249nh.C11142f;
import p306qi.C12200o;

/* renamed from: og.n0 */
/* loaded from: classes8.dex */
public final class C11359n0 implements AbstractC11366p0 {

    /* renamed from: a */
    private final Collection<AbstractC11344l0> f25286a;

    /* renamed from: og.n0$a */
    /* loaded from: classes8.dex */
    static final class C11360a extends AbstractC9973s implements Function1<AbstractC11344l0, C11137c> {

        /* renamed from: k */
        public static final C11360a f25287k = new C11360a();

        C11360a() {
            super(1);
        }

        /* renamed from: a */
        public final C11137c invoke(AbstractC11344l0 it) {
            C9971q.m14633g(it, "it");
            return it.mo6103e();
        }
    }

    /* renamed from: og.n0$b */
    /* loaded from: classes8.dex */
    static final class C11361b extends AbstractC9973s implements Function1<C11137c, Boolean> {

        /* renamed from: k */
        final /* synthetic */ C11137c f25288k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11361b(C11137c cVar) {
            super(1);
            this.f25288k = cVar;
        }

        /* renamed from: a */
        public final Boolean invoke(C11137c it) {
            boolean z;
            C9971q.m14633g(it, "it");
            if (it.m10801d() || !C9971q.m14638b(it.m10800e(), this.f25288k)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11359n0(Collection<? extends AbstractC11344l0> packageFragments) {
        C9971q.m14633g(packageFragments, "packageFragments");
        this.f25286a = packageFragments;
    }

    @Override // p268og.AbstractC11347m0
    /* renamed from: a */
    public List<AbstractC11344l0> mo6357a(C11137c fqName) {
        C9971q.m14633g(fqName, "fqName");
        Collection<AbstractC11344l0> collection = this.f25286a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (C9971q.m14638b(((AbstractC11344l0) obj).mo6103e(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p268og.AbstractC11366p0
    /* renamed from: b */
    public void mo6356b(C11137c fqName, Collection<AbstractC11344l0> packageFragments) {
        C9971q.m14633g(fqName, "fqName");
        C9971q.m14633g(packageFragments, "packageFragments");
        for (Object obj : this.f25286a) {
            if (C9971q.m14638b(((AbstractC11344l0) obj).mo6103e(), fqName)) {
                packageFragments.add(obj);
            }
        }
    }

    @Override // p268og.AbstractC11366p0
    /* renamed from: c */
    public boolean mo6355c(C11137c fqName) {
        C9971q.m14633g(fqName, "fqName");
        Collection<AbstractC11344l0> collection = this.f25286a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        for (AbstractC11344l0 l0Var : collection) {
            if (C9971q.m14638b(l0Var.mo6103e(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // p268og.AbstractC11347m0
    /* renamed from: q */
    public Collection<C11137c> mo6354q(C11137c fqName, Function1<? super C11142f, Boolean> nameFilter) {
        Sequence K;
        Sequence y;
        Sequence p;
        List E;
        C9971q.m14633g(fqName, "fqName");
        C9971q.m14633g(nameFilter, "nameFilter");
        K = C9914r.m14782K(this.f25286a);
        y = C12200o.m7420y(K, C11360a.f25287k);
        p = C12200o.m7429p(y, new C11361b(fqName));
        E = C12200o.m7436E(p);
        return E;
    }
}
