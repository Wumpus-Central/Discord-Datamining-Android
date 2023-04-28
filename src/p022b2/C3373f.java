package p022b2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: b2.f */
/* loaded from: classes.dex */
public class C3373f<TResult> {

    /* renamed from: i */
    public static final ExecutorService f5370i = C3368b.m34586a();

    /* renamed from: j */
    private static final Executor f5371j = C3368b.m34585b();

    /* renamed from: k */
    public static final Executor f5372k = C3366a.m34587c();

    /* renamed from: l */
    private static C3373f<?> f5373l = new C3373f<>((Object) null);

    /* renamed from: m */
    private static C3373f<Boolean> f5374m = new C3373f<>(Boolean.TRUE);

    /* renamed from: n */
    private static C3373f<Boolean> f5375n = new C3373f<>(Boolean.FALSE);

    /* renamed from: o */
    private static C3373f<?> f5376o = new C3373f<>(true);

    /* renamed from: b */
    private boolean f5378b;

    /* renamed from: c */
    private boolean f5379c;

    /* renamed from: d */
    private TResult f5380d;

    /* renamed from: e */
    private Exception f5381e;

    /* renamed from: f */
    private boolean f5382f;

    /* renamed from: g */
    private C3379h f5383g;

    /* renamed from: a */
    private final Object f5377a = new Object();

    /* renamed from: h */
    private List<AbstractC3371d<TResult, Void>> f5384h = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b2.f$a */
    /* loaded from: classes.dex */
    public class C3374a implements AbstractC3371d<TResult, Void> {

        /* renamed from: a */
        final /* synthetic */ C3378g f5385a;

        /* renamed from: b */
        final /* synthetic */ AbstractC3371d f5386b;

        /* renamed from: c */
        final /* synthetic */ Executor f5387c;

        C3374a(C3378g gVar, AbstractC3371d dVar, Executor executor, C3370c cVar) {
            this.f5385a = gVar;
            this.f5386b = dVar;
            this.f5387c = executor;
        }

        /* renamed from: b */
        public Void mo30992a(C3373f<TResult> fVar) {
            C3373f.m34578d(this.f5385a, this.f5386b, fVar, this.f5387c, null);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b2.f$b */
    /* loaded from: classes.dex */
    public static class RunnableC3375b implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C3378g f5389k;

        /* renamed from: l */
        final /* synthetic */ AbstractC3371d f5390l;

        /* renamed from: m */
        final /* synthetic */ C3373f f5391m;

        RunnableC3375b(C3370c cVar, C3378g gVar, AbstractC3371d dVar, C3373f fVar) {
            this.f5389k = gVar;
            this.f5390l = dVar;
            this.f5391m = fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f5389k.m34559d(this.f5390l.mo30992a(this.f5391m));
            } catch (CancellationException unused) {
                this.f5389k.m34561b();
            } catch (Exception e) {
                this.f5389k.m34560c(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b2.f$c */
    /* loaded from: classes.dex */
    public static class RunnableC3376c implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C3378g f5392k;

        /* renamed from: l */
        final /* synthetic */ Callable f5393l;

        RunnableC3376c(C3370c cVar, C3378g gVar, Callable callable) {
            this.f5392k = gVar;
            this.f5393l = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f5392k.m34559d(this.f5393l.call());
            } catch (CancellationException unused) {
                this.f5392k.m34561b();
            } catch (Exception e) {
                this.f5392k.m34560c(e);
            }
        }
    }

    /* renamed from: b2.f$d */
    /* loaded from: classes.dex */
    public interface AbstractC3377d {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3373f() {
    }

    /* renamed from: b */
    public static <TResult> C3373f<TResult> m34580b(Callable<TResult> callable, Executor executor) {
        return m34579c(callable, executor, null);
    }

    /* renamed from: c */
    public static <TResult> C3373f<TResult> m34579c(Callable<TResult> callable, Executor executor, C3370c cVar) {
        C3378g gVar = new C3378g();
        try {
            executor.execute(new RunnableC3376c(cVar, gVar, callable));
        } catch (Exception e) {
            gVar.m34560c(new C3372e(e));
        }
        return gVar.m34562a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static <TContinuationResult, TResult> void m34578d(C3378g<TContinuationResult> gVar, AbstractC3371d<TResult, TContinuationResult> dVar, C3373f<TResult> fVar, Executor executor, C3370c cVar) {
        try {
            executor.execute(new RunnableC3375b(cVar, gVar, dVar, fVar));
        } catch (Exception e) {
            gVar.m34560c(new C3372e(e));
        }
    }

    /* renamed from: g */
    public static <TResult> C3373f<TResult> m34575g(Exception exc) {
        C3378g gVar = new C3378g();
        gVar.m34560c(exc);
        return gVar.m34562a();
    }

    /* renamed from: h */
    public static <TResult> C3373f<TResult> m34574h(TResult tresult) {
        if (tresult == null) {
            return (C3373f<TResult>) f5373l;
        }
        if (!(tresult instanceof Boolean)) {
            C3378g gVar = new C3378g();
            gVar.m34559d(tresult);
            return gVar.m34562a();
        } else if (((Boolean) tresult).booleanValue()) {
            return (C3373f<TResult>) f5374m;
        } else {
            return (C3373f<TResult>) f5375n;
        }
    }

    /* renamed from: k */
    public static AbstractC3377d m34571k() {
        return null;
    }

    /* renamed from: o */
    private void m34567o() {
        synchronized (this.f5377a) {
            for (AbstractC3371d<TResult, Void> dVar : this.f5384h) {
                try {
                    dVar.mo30992a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f5384h = null;
        }
    }

    /* renamed from: e */
    public <TContinuationResult> C3373f<TContinuationResult> m34577e(AbstractC3371d<TResult, TContinuationResult> dVar) {
        return m34576f(dVar, f5371j, null);
    }

    /* renamed from: f */
    public <TContinuationResult> C3373f<TContinuationResult> m34576f(AbstractC3371d<TResult, TContinuationResult> dVar, Executor executor, C3370c cVar) {
        boolean m;
        C3378g gVar = new C3378g();
        synchronized (this.f5377a) {
            m = m34569m();
            if (!m) {
                this.f5384h.add(new C3374a(gVar, dVar, executor, cVar));
            }
        }
        if (m) {
            m34578d(gVar, dVar, this, executor, cVar);
        }
        return gVar.m34562a();
    }

    /* renamed from: i */
    public Exception m34573i() {
        Exception exc;
        synchronized (this.f5377a) {
            if (this.f5381e != null) {
                this.f5382f = true;
                C3379h hVar = this.f5383g;
                if (hVar != null) {
                    hVar.m34555a();
                    this.f5383g = null;
                }
            }
            exc = this.f5381e;
        }
        return exc;
    }

    /* renamed from: j */
    public TResult m34572j() {
        TResult tresult;
        synchronized (this.f5377a) {
            tresult = this.f5380d;
        }
        return tresult;
    }

    /* renamed from: l */
    public boolean m34570l() {
        boolean z;
        synchronized (this.f5377a) {
            z = this.f5379c;
        }
        return z;
    }

    /* renamed from: m */
    public boolean m34569m() {
        boolean z;
        synchronized (this.f5377a) {
            z = this.f5378b;
        }
        return z;
    }

    /* renamed from: n */
    public boolean m34568n() {
        boolean z;
        synchronized (this.f5377a) {
            if (m34573i() != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m34566p() {
        synchronized (this.f5377a) {
            if (this.f5378b) {
                return false;
            }
            this.f5378b = true;
            this.f5379c = true;
            this.f5377a.notifyAll();
            m34567o();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean m34565q(Exception exc) {
        synchronized (this.f5377a) {
            if (this.f5378b) {
                return false;
            }
            this.f5378b = true;
            this.f5381e = exc;
            this.f5382f = false;
            this.f5377a.notifyAll();
            m34567o();
            if (!this.f5382f) {
                m34571k();
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean m34564r(TResult tresult) {
        synchronized (this.f5377a) {
            if (this.f5378b) {
                return false;
            }
            this.f5378b = true;
            this.f5380d = tresult;
            this.f5377a.notifyAll();
            m34567o();
            return true;
        }
    }

    private C3373f(TResult tresult) {
        m34564r(tresult);
    }

    private C3373f(boolean z) {
        if (z) {
            m34566p();
        } else {
            m34564r(null);
        }
    }
}
