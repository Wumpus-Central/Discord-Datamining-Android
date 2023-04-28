package androidx.concurrent.futures;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p120gc.AbstractFutureC7576b;

/* renamed from: androidx.concurrent.futures.c */
/* loaded from: classes.dex */
public final class C2114c {

    /* renamed from: androidx.concurrent.futures.c$a */
    /* loaded from: classes.dex */
    public static final class C2115a<T> {

        /* renamed from: a */
        Object f2485a;

        /* renamed from: b */
        C2117d<T> f2486b;

        /* renamed from: c */
        private C2119d<Void> f2487c = C2119d.m38951s();

        /* renamed from: d */
        private boolean f2488d;

        C2115a() {
        }

        /* renamed from: e */
        private void m38959e() {
            this.f2485a = null;
            this.f2486b = null;
            this.f2487c = null;
        }

        /* renamed from: a */
        public void m38963a(Runnable runnable, Executor executor) {
            C2119d<Void> dVar = this.f2487c;
            if (dVar != null) {
                dVar.mo1409a(runnable, executor);
            }
        }

        /* renamed from: b */
        void m38962b() {
            this.f2485a = null;
            this.f2486b = null;
            this.f2487c.mo38953p(null);
        }

        /* renamed from: c */
        public boolean m38961c(T t) {
            boolean z = true;
            this.f2488d = true;
            C2117d<T> dVar = this.f2486b;
            if (dVar == null || !dVar.m38956c(t)) {
                z = false;
            }
            if (z) {
                m38959e();
            }
            return z;
        }

        /* renamed from: d */
        public boolean m38960d() {
            boolean z = true;
            this.f2488d = true;
            C2117d<T> dVar = this.f2486b;
            if (dVar == null || !dVar.m38957b(true)) {
                z = false;
            }
            if (z) {
                m38959e();
            }
            return z;
        }

        /* renamed from: f */
        public boolean m38958f(Throwable th2) {
            boolean z = true;
            this.f2488d = true;
            C2117d<T> dVar = this.f2486b;
            if (dVar == null || !dVar.m38955d(th2)) {
                z = false;
            }
            if (z) {
                m38959e();
            }
            return z;
        }

        protected void finalize() {
            C2119d<Void> dVar;
            C2117d<T> dVar2 = this.f2486b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.m38955d(new C2116b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f2485a));
            }
            if (!this.f2488d && (dVar = this.f2487c) != null) {
                dVar.mo38953p(null);
            }
        }
    }

    /* renamed from: androidx.concurrent.futures.c$b */
    /* loaded from: classes.dex */
    static final class C2116b extends Throwable {
        C2116b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: androidx.concurrent.futures.c$c */
    /* loaded from: classes.dex */
    public interface AbstractC0030c<T> {
        /* renamed from: a */
        Object mo1403a(C2115a<T> aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.concurrent.futures.c$d */
    /* loaded from: classes.dex */
    public static final class C2117d<T> implements AbstractFutureC7576b<T> {

        /* renamed from: k */
        final WeakReference<C2115a<T>> f2489k;

        /* renamed from: l */
        private final AbstractC2104a<T> f2490l = new C2118a();

        /* renamed from: androidx.concurrent.futures.c$d$a */
        /* loaded from: classes.dex */
        class C2118a extends AbstractC2104a<T> {
            C2118a() {
            }

            @Override // androidx.concurrent.futures.AbstractC2104a
            /* renamed from: m */
            protected String mo38954m() {
                C2115a<T> aVar = C2117d.this.f2489k.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f2485a + "]";
            }
        }

        C2117d(C2115a<T> aVar) {
            this.f2489k = new WeakReference<>(aVar);
        }

        @Override // p120gc.AbstractFutureC7576b
        /* renamed from: a */
        public void mo1409a(Runnable runnable, Executor executor) {
            this.f2490l.mo1409a(runnable, executor);
        }

        /* renamed from: b */
        boolean m38957b(boolean z) {
            return this.f2490l.cancel(z);
        }

        /* renamed from: c */
        boolean m38956c(T t) {
            return this.f2490l.mo38953p(t);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            C2115a<T> aVar = this.f2489k.get();
            boolean cancel = this.f2490l.cancel(z);
            if (cancel && aVar != null) {
                aVar.m38962b();
            }
            return cancel;
        }

        /* renamed from: d */
        boolean m38955d(Throwable th2) {
            return this.f2490l.mo38952q(th2);
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.f2490l.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f2490l.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f2490l.isDone();
        }

        public String toString() {
            return this.f2490l.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j, TimeUnit timeUnit) {
            return this.f2490l.get(j, timeUnit);
        }
    }

    /* renamed from: a */
    public static <T> AbstractFutureC7576b<T> m38964a(AbstractC0030c<T> cVar) {
        C2115a<T> aVar = new C2115a<>();
        C2117d<T> dVar = new C2117d<>(aVar);
        aVar.f2486b = dVar;
        aVar.f2485a = cVar.getClass();
        try {
            Object a = cVar.mo1403a(aVar);
            if (a != null) {
                aVar.f2485a = a;
            }
        } catch (Exception e) {
            dVar.m38955d(e);
        }
        return dVar;
    }
}
