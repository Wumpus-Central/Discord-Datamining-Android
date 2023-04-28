package p126h2;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import p343t2.C12945f;

/* renamed from: h2.m0 */
/* loaded from: classes.dex */
public class C7771m0<T> {

    /* renamed from: e */
    public static Executor f16910e = Executors.newCachedThreadPool();

    /* renamed from: a */
    private final Set<AbstractC7755g0<T>> f16911a;

    /* renamed from: b */
    private final Set<AbstractC7755g0<Throwable>> f16912b;

    /* renamed from: c */
    private final Handler f16913c;

    /* renamed from: d */
    private volatile C7767k0<T> f16914d;

    /* renamed from: h2.m0$a */
    /* loaded from: classes.dex */
    private class C7772a extends FutureTask<C7767k0<T>> {
        C7772a(Callable<C7767k0<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (!isCancelled()) {
                try {
                    C7771m0.this.m21368k(get());
                } catch (InterruptedException | ExecutionException e) {
                    C7771m0.this.m21368k(new C7767k0(e));
                }
            }
        }
    }

    public C7771m0(Callable<C7767k0<T>> callable) {
        this(callable, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m21374e() {
        C7767k0<T> k0Var = this.f16914d;
        if (k0Var != null) {
            if (k0Var.m21379b() != null) {
                m21371h(k0Var.m21379b());
            } else {
                m21373f(k0Var.m21380a());
            }
        }
    }

    /* renamed from: f */
    private synchronized void m21373f(Throwable th2) {
        ArrayList<AbstractC7755g0> arrayList = new ArrayList(this.f16912b);
        if (arrayList.isEmpty()) {
            C12945f.m5008d("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        for (AbstractC7755g0 g0Var : arrayList) {
            g0Var.onResult(th2);
        }
    }

    /* renamed from: g */
    private void m21372g() {
        this.f16913c.post(new Runnable() { // from class: h2.l0
            @Override // java.lang.Runnable
            public final void run() {
                C7771m0.this.m21374e();
            }
        });
    }

    /* renamed from: h */
    private synchronized void m21371h(T t) {
        for (AbstractC7755g0 g0Var : new ArrayList(this.f16911a)) {
            g0Var.onResult(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m21368k(C7767k0<T> k0Var) {
        if (this.f16914d == null) {
            this.f16914d = k0Var;
            m21372g();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    /* renamed from: c */
    public synchronized C7771m0<T> m21376c(AbstractC7755g0<Throwable> g0Var) {
        C7767k0<T> k0Var = this.f16914d;
        if (!(k0Var == null || k0Var.m21380a() == null)) {
            g0Var.onResult(k0Var.m21380a());
        }
        this.f16912b.add(g0Var);
        return this;
    }

    /* renamed from: d */
    public synchronized C7771m0<T> m21375d(AbstractC7755g0<T> g0Var) {
        C7767k0<T> k0Var = this.f16914d;
        if (!(k0Var == null || k0Var.m21379b() == null)) {
            g0Var.onResult(k0Var.m21379b());
        }
        this.f16911a.add(g0Var);
        return this;
    }

    /* renamed from: i */
    public synchronized C7771m0<T> m21370i(AbstractC7755g0<Throwable> g0Var) {
        this.f16912b.remove(g0Var);
        return this;
    }

    /* renamed from: j */
    public synchronized C7771m0<T> m21369j(AbstractC7755g0<T> g0Var) {
        this.f16911a.remove(g0Var);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7771m0(Callable<C7767k0<T>> callable, boolean z) {
        this.f16911a = new LinkedHashSet(1);
        this.f16912b = new LinkedHashSet(1);
        this.f16913c = new Handler(Looper.getMainLooper());
        this.f16914d = null;
        if (z) {
            try {
                m21368k(callable.call());
            } catch (Throwable th2) {
                m21368k(new C7767k0<>(th2));
            }
        } else {
            f16910e.execute(new C7772a(callable));
        }
    }
}
