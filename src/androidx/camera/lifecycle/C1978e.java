package androidx.camera.lifecycle;

import android.content.Context;
import androidx.arch.core.util.Function;
import androidx.camera.core.AbstractC1874k;
import androidx.camera.core.AbstractC1906q;
import androidx.camera.core.AbstractC1911r;
import androidx.camera.core.AbstractC1917s;
import androidx.camera.core.AbstractC1948w2;
import androidx.camera.core.C1766a0;
import androidx.camera.core.C1795c3;
import androidx.camera.core.C1921t;
import androidx.camera.core.C1961z;
import androidx.camera.core.impl.utils.C1849j;
import androidx.camera.core.impl.utils.C1869r;
import androidx.concurrent.futures.C2114c;
import androidx.core.util.C2517g;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p120gc.AbstractFutureC7576b;
import p390w.AbstractC13597g0;
import p390w.AbstractC13688w;
import p390w.C13581c1;
import p410x.C13905a;
import p431y.AbstractC14179a;
import p431y.AbstractC14182c;
import p431y.C14183d;
import p431y.C14186f;
import p451z.C14499e;

/* renamed from: androidx.camera.lifecycle.e */
/* loaded from: classes.dex */
public final class C1978e implements AbstractC1917s {

    /* renamed from: h */
    private static final C1978e f2116h = new C1978e();

    /* renamed from: c */
    private AbstractFutureC7576b<C1961z> f2119c;

    /* renamed from: f */
    private C1961z f2122f;

    /* renamed from: g */
    private Context f2123g;

    /* renamed from: a */
    private final Object f2117a = new Object();

    /* renamed from: b */
    private C1766a0.AbstractC1768b f2118b = null;

    /* renamed from: d */
    private AbstractFutureC7576b<Void> f2120d = C14186f.m1421h(null);

    /* renamed from: e */
    private final LifecycleCameraRepository f2121e = new LifecycleCameraRepository();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.lifecycle.e$a */
    /* loaded from: classes.dex */
    public class C1979a implements AbstractC14182c<Void> {

        /* renamed from: a */
        final /* synthetic */ C2114c.C2115a f2124a;

        /* renamed from: b */
        final /* synthetic */ C1961z f2125b;

        C1979a(C2114c.C2115a aVar, C1961z zVar) {
            this.f2124a = aVar;
            this.f2125b = zVar;
        }

        /* renamed from: b */
        public void mo1412a(Void r2) {
            this.f2124a.m38961c(this.f2125b);
        }

        @Override // p431y.AbstractC14182c
        public void onFailure(Throwable th2) {
            this.f2124a.m38958f(th2);
        }
    }

    private C1978e() {
    }

    /* renamed from: g */
    public static AbstractFutureC7576b<C1978e> m39346g(final Context context) {
        C2517g.m37588g(context);
        return C14186f.m1414o(f2116h.m39345h(context), new Function() { // from class: androidx.camera.lifecycle.b
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                C1978e i;
                i = C1978e.m39344i(context, (C1961z) obj);
                return i;
            }
        }, C13905a.m2339a());
    }

    /* renamed from: h */
    private AbstractFutureC7576b<C1961z> m39345h(Context context) {
        synchronized (this.f2117a) {
            AbstractFutureC7576b<C1961z> bVar = this.f2119c;
            if (bVar != null) {
                return bVar;
            }
            final C1961z zVar = new C1961z(context, this.f2118b);
            AbstractFutureC7576b<C1961z> a = C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: androidx.camera.lifecycle.c
                @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
                /* renamed from: a */
                public final Object mo1403a(C2114c.C2115a aVar) {
                    Object k;
                    k = C1978e.this.m39342k(zVar, aVar);
                    return k;
                }
            });
            this.f2119c = a;
            return a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ C1978e m39344i(Context context, C1961z zVar) {
        C1978e eVar = f2116h;
        eVar.m39341l(zVar);
        eVar.m39340m(C1849j.m39678a(context));
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ Object m39342k(final C1961z zVar, C2114c.C2115a aVar) {
        synchronized (this.f2117a) {
            C14186f.m1427b(C14183d.m1433b(this.f2120d).m1429f(new AbstractC14179a() { // from class: androidx.camera.lifecycle.d
                @Override // p431y.AbstractC14179a
                public final AbstractFutureC7576b apply(Object obj) {
                    AbstractFutureC7576b h;
                    Void r2 = (Void) obj;
                    h = C1961z.this.m39409h();
                    return h;
                }
            }, C13905a.m2339a()), new C1979a(aVar, zVar), C13905a.m2339a());
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    /* renamed from: l */
    private void m39341l(C1961z zVar) {
        this.f2122f = zVar;
    }

    /* renamed from: m */
    private void m39340m(Context context) {
        this.f2123g = context;
    }

    @Override // androidx.camera.core.AbstractC1917s
    /* renamed from: a */
    public List<AbstractC1911r> mo39352a() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC13597g0 g0Var : this.f2122f.m39412e().m3259a()) {
            arrayList.add(g0Var.mo330a());
        }
        return arrayList;
    }

    /* renamed from: e */
    AbstractC1874k m39348e(LifecycleOwner lifecycleOwner, C1921t tVar, C1795c3 c3Var, AbstractC1948w2... w2VarArr) {
        AbstractC13688w wVar;
        AbstractC13688w a;
        C1869r.m39614a();
        C1921t.C1922a c = C1921t.C1922a.m39508c(tVar);
        int length = w2VarArr.length;
        int i = 0;
        while (true) {
            wVar = null;
            if (i >= length) {
                break;
            }
            C1921t C = w2VarArr[i].m39433f().mo2985C(null);
            if (C != null) {
                Iterator<AbstractC1906q> it = C.m39513c().iterator();
                while (it.hasNext()) {
                    c.m39510a(it.next());
                }
            }
            i++;
        }
        LinkedHashSet<AbstractC13597g0> a2 = c.m39509b().m39515a(this.f2122f.m39412e().m3259a());
        if (!a2.isEmpty()) {
            LifecycleCamera c2 = this.f2121e.m39367c(lifecycleOwner, C14499e.m314v(a2));
            Collection<LifecycleCamera> e = this.f2121e.m39365e();
            for (AbstractC1948w2 w2Var : w2VarArr) {
                for (LifecycleCamera lifecycleCamera : e) {
                    if (lifecycleCamera.m39373o(w2Var) && lifecycleCamera != c2) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", w2Var));
                    }
                }
            }
            if (c2 == null) {
                c2 = this.f2121e.m39368b(lifecycleOwner, new C14499e(a2, this.f2122f.m39413d(), this.f2122f.m39410g()));
            }
            Iterator<AbstractC1906q> it2 = tVar.m39513c().iterator();
            while (it2.hasNext()) {
                AbstractC1906q next = it2.next();
                if (!(next.mo3124a() == AbstractC1906q.f1938a || (a = C13581c1.m3313b(next.mo3124a()).mo2992a(c2.mo330a(), this.f2123g)) == null)) {
                    if (wVar == null) {
                        wVar = a;
                    } else {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                }
            }
            c2.m39378d(wVar);
            if (w2VarArr.length == 0) {
                return c2;
            }
            this.f2121e.m39369a(c2, c3Var, Arrays.asList(w2VarArr));
            return c2;
        }
        throw new IllegalArgumentException("Provided camera selector unable to resolve a camera for the given use case");
    }

    /* renamed from: f */
    public AbstractC1874k m39347f(LifecycleOwner lifecycleOwner, C1921t tVar, AbstractC1948w2... w2VarArr) {
        return m39348e(lifecycleOwner, tVar, null, w2VarArr);
    }

    /* renamed from: n */
    public void m39339n() {
        C1869r.m39614a();
        this.f2121e.m39359k();
    }
}
