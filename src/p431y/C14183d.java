package p431y;

import androidx.arch.core.util.Function;
import androidx.concurrent.futures.C2114c;
import androidx.core.util.C2517g;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p120gc.AbstractFutureC7576b;

/* renamed from: y.d */
/* loaded from: classes.dex */
public class C14183d<V> implements AbstractFutureC7576b<V> {

    /* renamed from: k */
    private final AbstractFutureC7576b<V> f32026k;

    /* renamed from: l */
    C2114c.C2115a<V> f32027l;

    /* renamed from: y.d$a */
    /* loaded from: classes.dex */
    class C14184a implements C2114c.AbstractC0030c<V> {
        C14184a() {
        }

        @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
        /* renamed from: a */
        public Object mo1403a(C2114c.C2115a<V> aVar) {
            boolean z;
            if (C14183d.this.f32027l == null) {
                z = true;
            } else {
                z = false;
            }
            C2517g.m37585j(z, "The result can only set once!");
            C14183d.this.f32027l = aVar;
            return "FutureChain[" + C14183d.this + "]";
        }
    }

    C14183d(AbstractFutureC7576b<V> bVar) {
        this.f32026k = (AbstractFutureC7576b) C2517g.m37588g(bVar);
    }

    /* renamed from: b */
    public static <V> C14183d<V> m1433b(AbstractFutureC7576b<V> bVar) {
        if (bVar instanceof C14183d) {
            return (C14183d) bVar;
        }
        return new C14183d<>(bVar);
    }

    @Override // p120gc.AbstractFutureC7576b
    /* renamed from: a */
    public void mo1409a(Runnable runnable, Executor executor) {
        this.f32026k.mo1409a(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m1432c(V v) {
        C2114c.C2115a<V> aVar = this.f32027l;
        if (aVar != null) {
            return aVar.m38961c(v);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f32026k.cancel(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m1431d(Throwable th2) {
        C2114c.C2115a<V> aVar = this.f32027l;
        if (aVar != null) {
            return aVar.m38958f(th2);
        }
        return false;
    }

    /* renamed from: e */
    public final <T> C14183d<T> m1430e(Function<? super V, T> function, Executor executor) {
        return (C14183d) C14186f.m1414o(this, function, executor);
    }

    /* renamed from: f */
    public final <T> C14183d<T> m1429f(AbstractC14179a<? super V, T> aVar, Executor executor) {
        return (C14183d) C14186f.m1413p(this, aVar, executor);
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f32026k.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f32026k.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f32026k.isDone();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) {
        return this.f32026k.get(j, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14183d() {
        this.f32026k = C2114c.m38964a(new C14184a());
    }
}
