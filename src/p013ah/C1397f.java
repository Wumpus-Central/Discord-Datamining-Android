package p013ah;

import bh.C3521h;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.C9906j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import nf.C11086o;
import p013ah.AbstractC1404k;
import p086eh.AbstractC6909u;
import p087ei.AbstractC6915a;
import p249nh.C11137c;
import p249nh.C11142f;
import p268og.AbstractC11344l0;
import p268og.AbstractC11366p0;
import p286pi.C11754a;
import p427xg.C14145o;

/* renamed from: ah.f */
/* loaded from: classes8.dex */
public final class C1397f implements AbstractC11366p0 {

    /* renamed from: a */
    private final C1399g f421a;

    /* renamed from: b */
    private final AbstractC6915a<C11137c, C3521h> f422b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ah.f$a */
    /* loaded from: classes8.dex */
    public static final class C1398a extends AbstractC9973s implements Function0<C3521h> {

        /* renamed from: l */
        final /* synthetic */ AbstractC6909u f424l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1398a(AbstractC6909u uVar) {
            super(0);
            this.f424l = uVar;
        }

        /* renamed from: a */
        public final C3521h invoke() {
            return new C3521h(C1397f.this.f421a, this.f424l);
        }
    }

    public C1397f(C1391b components) {
        Lazy c;
        C9971q.m14633g(components, "components");
        AbstractC1404k.C1405a aVar = AbstractC1404k.C1405a.f437a;
        c = C11086o.m10943c(null);
        C1399g gVar = new C1399g(components, aVar, c);
        this.f421a = gVar;
        this.f422b = gVar.m41170e().mo23900a();
    }

    /* renamed from: e */
    private final C3521h m41177e(C11137c cVar) {
        AbstractC6909u a = C14145o.m1526a(this.f421a.m41174a().m41206d(), cVar, false, 2, null);
        if (a == null) {
            return null;
        }
        return this.f422b.mo23928a(cVar, new C1398a(a));
    }

    @Override // p268og.AbstractC11347m0
    /* renamed from: a */
    public List<C3521h> mo6357a(C11137c fqName) {
        List<C3521h> m;
        C9971q.m14633g(fqName, "fqName");
        m = C9906j.m14816m(m41177e(fqName));
        return m;
    }

    @Override // p268og.AbstractC11366p0
    /* renamed from: b */
    public void mo6356b(C11137c fqName, Collection<AbstractC11344l0> packageFragments) {
        C9971q.m14633g(fqName, "fqName");
        C9971q.m14633g(packageFragments, "packageFragments");
        C11754a.m8689a(packageFragments, m41177e(fqName));
    }

    @Override // p268og.AbstractC11366p0
    /* renamed from: c */
    public boolean mo6355c(C11137c fqName) {
        C9971q.m14633g(fqName, "fqName");
        if (C14145o.m1526a(this.f421a.m41174a().m41206d(), fqName, false, 2, null) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public List<C11137c> mo6354q(C11137c fqName, Function1<? super C11142f, Boolean> nameFilter) {
        List<C11137c> list;
        List<C11137c> i;
        C9971q.m14633g(fqName, "fqName");
        C9971q.m14633g(nameFilter, "nameFilter");
        C3521h e = m41177e(fqName);
        if (e != null) {
            list = e.m34190O0();
        } else {
            list = null;
        }
        if (list != null) {
            return list;
        }
        i = C9906j.m14820i();
        return i;
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f421a.m41174a().m41197m();
    }
}
