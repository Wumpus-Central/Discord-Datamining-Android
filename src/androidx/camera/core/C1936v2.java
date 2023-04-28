package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C1936v2;
import androidx.concurrent.futures.C2114c;
import androidx.core.util.AbstractC2511b;
import androidx.core.util.C2517g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p120gc.AbstractFutureC7576b;
import p390w.AbstractC13597g0;
import p390w.AbstractC13689w0;
import p410x.C13905a;
import p431y.AbstractC14182c;
import p431y.C14186f;

/* renamed from: androidx.camera.core.v2 */
/* loaded from: classes.dex */
public final class C1936v2 {

    /* renamed from: a */
    private final Size f1995a;

    /* renamed from: b */
    private final boolean f1996b;

    /* renamed from: c */
    private final AbstractC13597g0 f1997c;

    /* renamed from: d */
    final AbstractFutureC7576b<Surface> f1998d;

    /* renamed from: e */
    private final C2114c.C2115a<Surface> f1999e;

    /* renamed from: f */
    private final AbstractFutureC7576b<Void> f2000f;

    /* renamed from: g */
    private final C2114c.C2115a<Void> f2001g;

    /* renamed from: h */
    private final AbstractC13689w0 f2002h;

    /* renamed from: i */
    private AbstractC1943g f2003i;

    /* renamed from: j */
    private AbstractC1944h f2004j;

    /* renamed from: k */
    private Executor f2005k;

    /* renamed from: androidx.camera.core.v2$a */
    /* loaded from: classes.dex */
    class C1937a implements AbstractC14182c<Void> {

        /* renamed from: a */
        final /* synthetic */ C2114c.C2115a f2006a;

        /* renamed from: b */
        final /* synthetic */ AbstractFutureC7576b f2007b;

        C1937a(C2114c.C2115a aVar, AbstractFutureC7576b bVar) {
            this.f2006a = aVar;
            this.f2007b = bVar;
        }

        /* renamed from: b */
        public void mo1412a(Void r2) {
            C2517g.m37586i(this.f2006a.m38961c(null));
        }

        @Override // p431y.AbstractC14182c
        public void onFailure(Throwable th2) {
            if (th2 instanceof C1941e) {
                C2517g.m37586i(this.f2007b.cancel(false));
            } else {
                C2517g.m37586i(this.f2006a.m38961c(null));
            }
        }
    }

    /* renamed from: androidx.camera.core.v2$b */
    /* loaded from: classes.dex */
    class C1938b extends AbstractC13689w0 {
        C1938b(Size size, int i) {
            super(size, i);
        }

        @Override // p390w.AbstractC13689w0
        /* renamed from: n */
        protected AbstractFutureC7576b<Surface> mo3012n() {
            return C1936v2.this.f1998d;
        }
    }

    /* renamed from: androidx.camera.core.v2$c */
    /* loaded from: classes.dex */
    class C1939c implements AbstractC14182c<Surface> {

        /* renamed from: a */
        final /* synthetic */ AbstractFutureC7576b f2010a;

        /* renamed from: b */
        final /* synthetic */ C2114c.C2115a f2011b;

        /* renamed from: c */
        final /* synthetic */ String f2012c;

        C1939c(AbstractFutureC7576b bVar, C2114c.C2115a aVar, String str) {
            this.f2010a = bVar;
            this.f2011b = aVar;
            this.f2012c = str;
        }

        /* renamed from: b */
        public void mo1412a(Surface surface) {
            C14186f.m1418k(this.f2010a, this.f2011b);
        }

        @Override // p431y.AbstractC14182c
        public void onFailure(Throwable th2) {
            if (th2 instanceof CancellationException) {
                C2114c.C2115a aVar = this.f2011b;
                C2517g.m37586i(aVar.m38958f(new C1941e(this.f2012c + " cancelled.", th2)));
                return;
            }
            this.f2011b.m38961c(null);
        }
    }

    /* renamed from: androidx.camera.core.v2$d */
    /* loaded from: classes.dex */
    class C1940d implements AbstractC14182c<Void> {

        /* renamed from: a */
        final /* synthetic */ AbstractC2511b f2014a;

        /* renamed from: b */
        final /* synthetic */ Surface f2015b;

        C1940d(AbstractC2511b bVar, Surface surface) {
            this.f2014a = bVar;
            this.f2015b = surface;
        }

        /* renamed from: b */
        public void mo1412a(Void r3) {
            this.f2014a.accept(AbstractC1942f.m39451c(0, this.f2015b));
        }

        @Override // p431y.AbstractC14182c
        public void onFailure(Throwable th2) {
            C2517g.m37585j(th2 instanceof C1941e, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th2);
            this.f2014a.accept(AbstractC1942f.m39451c(1, this.f2015b));
        }
    }

    /* renamed from: androidx.camera.core.v2$e */
    /* loaded from: classes.dex */
    private static final class C1941e extends RuntimeException {
        C1941e(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* renamed from: androidx.camera.core.v2$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1942f {
        /* renamed from: c */
        static AbstractC1942f m39451c(int i, Surface surface) {
            return new C1832i(i, surface);
        }

        /* renamed from: a */
        public abstract int mo39453a();

        /* renamed from: b */
        public abstract Surface mo39452b();
    }

    /* renamed from: androidx.camera.core.v2$g */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1943g {
        /* renamed from: d */
        public static AbstractC1943g m39447d(Rect rect, int i, int i2) {
            return new C1870j(rect, i, i2);
        }

        /* renamed from: a */
        public abstract Rect mo39450a();

        /* renamed from: b */
        public abstract int mo39449b();

        /* renamed from: c */
        public abstract int mo39448c();
    }

    /* renamed from: androidx.camera.core.v2$h */
    /* loaded from: classes.dex */
    public interface AbstractC1944h {
        /* renamed from: a */
        void mo20571a(AbstractC1943g gVar);
    }

    public C1936v2(Size size, AbstractC13597g0 g0Var, boolean z) {
        this.f1995a = size;
        this.f1997c = g0Var;
        this.f1996b = z;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        AbstractFutureC7576b a = C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: androidx.camera.core.n2
            @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
            /* renamed from: a */
            public final Object mo1403a(C2114c.C2115a aVar) {
                Object n;
                n = C1936v2.m39468n(atomicReference, str, aVar);
                return n;
            }
        });
        C2114c.C2115a<Void> aVar = (C2114c.C2115a) C2517g.m37588g((C2114c.C2115a) atomicReference.get());
        this.f2001g = aVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        AbstractFutureC7576b<Void> a2 = C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: androidx.camera.core.o2
            @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
            /* renamed from: a */
            public final Object mo1403a(C2114c.C2115a aVar2) {
                Object o;
                o = C1936v2.m39467o(atomicReference2, str, aVar2);
                return o;
            }
        });
        this.f2000f = a2;
        C14186f.m1427b(a2, new C1937a(aVar, a), C13905a.m2339a());
        final AtomicReference atomicReference3 = new AtomicReference(null);
        AbstractFutureC7576b<Surface> a3 = C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: androidx.camera.core.p2
            @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
            /* renamed from: a */
            public final Object mo1403a(C2114c.C2115a aVar2) {
                Object p;
                p = C1936v2.m39466p(atomicReference3, str, aVar2);
                return p;
            }
        });
        this.f1998d = a3;
        this.f1999e = (C2114c.C2115a) C2517g.m37588g((C2114c.C2115a) atomicReference3.get());
        C1938b bVar = new C1938b(size, 34);
        this.f2002h = bVar;
        AbstractFutureC7576b<Void> i = bVar.m3017i();
        C14186f.m1427b(a3, new C1939c(i, (C2114c.C2115a) C2517g.m37588g((C2114c.C2115a) atomicReference2.get()), str), C13905a.m2339a());
        i.mo1409a(new Runnable() { // from class: androidx.camera.core.q2
            @Override // java.lang.Runnable
            public final void run() {
                C1936v2.this.m39465q();
            }
        }, C13905a.m2339a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ Object m39468n(AtomicReference atomicReference, String str, C2114c.C2115a aVar) {
        atomicReference.set(aVar);
        return str + "-cancellation";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ Object m39467o(AtomicReference atomicReference, String str, C2114c.C2115a aVar) {
        atomicReference.set(aVar);
        return str + "-status";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ Object m39466p(AtomicReference atomicReference, String str, C2114c.C2115a aVar) {
        atomicReference.set(aVar);
        return str + "-Surface";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m39465q() {
        this.f1998d.cancel(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ void m39464r(AbstractC2511b bVar, Surface surface) {
        bVar.accept(AbstractC1942f.m39451c(3, surface));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static /* synthetic */ void m39463s(AbstractC2511b bVar, Surface surface) {
        bVar.accept(AbstractC1942f.m39451c(4, surface));
    }

    @SuppressLint({"PairedRegistration"})
    /* renamed from: i */
    public void m39473i(Executor executor, Runnable runnable) {
        this.f2001g.m38963a(runnable, executor);
    }

    /* renamed from: j */
    public AbstractC13597g0 m39472j() {
        return this.f1997c;
    }

    /* renamed from: k */
    public AbstractC13689w0 m39471k() {
        return this.f2002h;
    }

    /* renamed from: l */
    public Size m39470l() {
        return this.f1995a;
    }

    /* renamed from: m */
    public boolean m39469m() {
        return this.f1996b;
    }

    /* renamed from: v */
    public void m39460v(final Surface surface, Executor executor, final AbstractC2511b<AbstractC1942f> bVar) {
        if (this.f1999e.m38961c(surface) || this.f1998d.isCancelled()) {
            C14186f.m1427b(this.f2000f, new C1940d(bVar, surface), executor);
            return;
        }
        C2517g.m37586i(this.f1998d.isDone());
        try {
            this.f1998d.get();
            executor.execute(new Runnable() { // from class: androidx.camera.core.s2
                @Override // java.lang.Runnable
                public final void run() {
                    C1936v2.m39464r(AbstractC2511b.this, surface);
                }
            });
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new Runnable() { // from class: androidx.camera.core.t2
                @Override // java.lang.Runnable
                public final void run() {
                    C1936v2.m39463s(AbstractC2511b.this, surface);
                }
            });
        }
    }

    /* renamed from: w */
    public void m39459w(Executor executor, final AbstractC1944h hVar) {
        this.f2004j = hVar;
        this.f2005k = executor;
        final AbstractC1943g gVar = this.f2003i;
        if (gVar != null) {
            executor.execute(new Runnable() { // from class: androidx.camera.core.u2
                @Override // java.lang.Runnable
                public final void run() {
                    C1936v2.AbstractC1944h.this.mo20571a(gVar);
                }
            });
        }
    }

    /* renamed from: x */
    public void m39458x(final AbstractC1943g gVar) {
        this.f2003i = gVar;
        final AbstractC1944h hVar = this.f2004j;
        if (hVar != null) {
            this.f2005k.execute(new Runnable() { // from class: androidx.camera.core.r2
                @Override // java.lang.Runnable
                public final void run() {
                    C1936v2.AbstractC1944h.this.mo20571a(gVar);
                }
            });
        }
    }

    /* renamed from: y */
    public boolean m39457y() {
        return this.f1999e.m38958f(new AbstractC13689w0.C13691b("Surface request will not complete."));
    }
}
