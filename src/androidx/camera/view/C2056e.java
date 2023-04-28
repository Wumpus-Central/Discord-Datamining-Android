package androidx.camera.view;

import androidx.arch.core.util.Function;
import androidx.camera.core.AbstractC1911r;
import androidx.camera.core.C1915r1;
import androidx.camera.view.C2066l;
import androidx.concurrent.futures.C2114c;
import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.List;
import p120gc.AbstractFutureC7576b;
import p390w.AbstractC13568a2;
import p390w.AbstractC13589e0;
import p390w.AbstractC13597g0;
import p390w.AbstractC13615k;
import p390w.AbstractC13672t;
import p410x.C13905a;
import p431y.AbstractC14179a;
import p431y.AbstractC14182c;
import p431y.C14183d;
import p431y.C14186f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.view.e */
/* loaded from: classes.dex */
public final class C2056e implements AbstractC13568a2.AbstractC13569a<AbstractC13597g0.EnumC13598a> {

    /* renamed from: a */
    private final AbstractC13589e0 f2305a;

    /* renamed from: b */
    private final MutableLiveData<C2066l.EnumC2072f> f2306b;

    /* renamed from: c */
    private C2066l.EnumC2072f f2307c;

    /* renamed from: d */
    private final AbstractC2073m f2308d;

    /* renamed from: e */
    AbstractFutureC7576b<Void> f2309e;

    /* renamed from: f */
    private boolean f2310f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.view.e$a */
    /* loaded from: classes.dex */
    public class C2057a implements AbstractC14182c<Void> {

        /* renamed from: a */
        final /* synthetic */ List f2311a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1911r f2312b;

        C2057a(List list, AbstractC1911r rVar) {
            this.f2311a = list;
            this.f2312b = rVar;
        }

        /* renamed from: b */
        public void mo1412a(Void r2) {
            C2056e.this.f2309e = null;
        }

        @Override // p431y.AbstractC14182c
        public void onFailure(Throwable th2) {
            C2056e.this.f2309e = null;
            if (!this.f2311a.isEmpty()) {
                for (AbstractC13615k kVar : this.f2311a) {
                    ((AbstractC13589e0) this.f2312b).mo3298a(kVar);
                }
                this.f2311a.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.view.e$b */
    /* loaded from: classes.dex */
    public class C2058b extends AbstractC13615k {

        /* renamed from: a */
        final /* synthetic */ C2114c.C2115a f2314a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1911r f2315b;

        C2058b(C2114c.C2115a aVar, AbstractC1911r rVar) {
            this.f2314a = aVar;
            this.f2315b = rVar;
        }

        @Override // p390w.AbstractC13615k
        /* renamed from: b */
        public void mo3171b(AbstractC13672t tVar) {
            this.f2314a.m38961c(null);
            ((AbstractC13589e0) this.f2315b).mo3298a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2056e(AbstractC13589e0 e0Var, MutableLiveData<C2066l.EnumC2072f> mutableLiveData, AbstractC2073m mVar) {
        this.f2305a = e0Var;
        this.f2306b = mutableLiveData;
        this.f2308d = mVar;
        synchronized (this) {
            this.f2307c = mutableLiveData.mo8408f();
        }
    }

    /* renamed from: e */
    private void m39163e() {
        AbstractFutureC7576b<Void> bVar = this.f2309e;
        if (bVar != null) {
            bVar.cancel(false);
            this.f2309e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ AbstractFutureC7576b m39161g(Void r1) {
        return this.f2308d.mo39108i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Void m39160h(Void r1) {
        m39156l(C2066l.EnumC2072f.STREAMING);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Object m39159i(AbstractC1911r rVar, List list, C2114c.C2115a aVar) {
        C2058b bVar = new C2058b(aVar, rVar);
        list.add(bVar);
        ((AbstractC13589e0) rVar).mo3293h(C13905a.m2339a(), bVar);
        return "waitForCaptureResult";
    }

    /* renamed from: k */
    private void m39157k(AbstractC1911r rVar) {
        m39156l(C2066l.EnumC2072f.IDLE);
        ArrayList arrayList = new ArrayList();
        C14183d e = C14183d.m1433b(m39155m(rVar, arrayList)).m1429f(new AbstractC14179a() { // from class: androidx.camera.view.b
            @Override // p431y.AbstractC14179a
            public final AbstractFutureC7576b apply(Object obj) {
                AbstractFutureC7576b g;
                g = C2056e.this.m39161g((Void) obj);
                return g;
            }
        }, C13905a.m2339a()).m1430e(new Function() { // from class: androidx.camera.view.c
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                Void h;
                h = C2056e.this.m39160h((Void) obj);
                return h;
            }
        }, C13905a.m2339a());
        this.f2309e = e;
        C14186f.m1427b(e, new C2057a(arrayList, rVar), C13905a.m2339a());
    }

    /* renamed from: m */
    private AbstractFutureC7576b<Void> m39155m(final AbstractC1911r rVar, final List<AbstractC13615k> list) {
        return C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: androidx.camera.view.d
            @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
            /* renamed from: a */
            public final Object mo1403a(C2114c.C2115a aVar) {
                Object i;
                i = C2056e.this.m39159i(rVar, list, aVar);
                return i;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m39162f() {
        m39163e();
    }

    /* renamed from: j */
    public void mo3341a(AbstractC13597g0.EnumC13598a aVar) {
        if (aVar == AbstractC13597g0.EnumC13598a.CLOSING || aVar == AbstractC13597g0.EnumC13598a.CLOSED || aVar == AbstractC13597g0.EnumC13598a.RELEASING || aVar == AbstractC13597g0.EnumC13598a.RELEASED) {
            m39156l(C2066l.EnumC2072f.IDLE);
            if (this.f2310f) {
                this.f2310f = false;
                m39163e();
            }
        } else if ((aVar == AbstractC13597g0.EnumC13598a.OPENING || aVar == AbstractC13597g0.EnumC13598a.OPEN || aVar == AbstractC13597g0.EnumC13598a.PENDING_OPEN) && !this.f2310f) {
            m39157k(this.f2305a);
            this.f2310f = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m39156l(C2066l.EnumC2072f fVar) {
        synchronized (this) {
            if (!this.f2307c.equals(fVar)) {
                this.f2307c = fVar;
                C1915r1.m39527a("StreamStateObserver", "Update Preview stream state to " + fVar);
                this.f2306b.mo35815m(fVar);
            }
        }
    }

    @Override // p390w.AbstractC13568a2.AbstractC13569a
    public void onError(Throwable th2) {
        m39162f();
        m39156l(C2066l.EnumC2072f.IDLE);
    }
}
