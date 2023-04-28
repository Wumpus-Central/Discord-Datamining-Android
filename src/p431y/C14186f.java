package p431y;

import androidx.arch.core.util.Function;
import androidx.concurrent.futures.C2114c;
import androidx.core.util.C2517g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import p120gc.AbstractFutureC7576b;
import p410x.C13905a;
import p431y.AbstractC14192g;

/* renamed from: y.f */
/* loaded from: classes.dex */
public final class C14186f {

    /* renamed from: a */
    private static final Function<?, ?> f32030a = new C14188b();

    /* renamed from: y.f$a */
    /* loaded from: classes.dex */
    class C14187a implements AbstractC14179a<I, O> {

        /* renamed from: a */
        final /* synthetic */ Function f32031a;

        C14187a(Function function) {
            this.f32031a = function;
        }

        @Override // p431y.AbstractC14179a
        public AbstractFutureC7576b<O> apply(I i) {
            return C14186f.m1421h(this.f32031a.apply(i));
        }
    }

    /* renamed from: y.f$b */
    /* loaded from: classes.dex */
    class C14188b implements Function<Object, Object> {
        C14188b() {
        }

        @Override // androidx.arch.core.util.Function
        public Object apply(Object obj) {
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y.f$c */
    /* loaded from: classes.dex */
    public class C14189c implements AbstractC14182c<I> {

        /* renamed from: a */
        final /* synthetic */ C2114c.C2115a f32032a;

        /* renamed from: b */
        final /* synthetic */ Function f32033b;

        C14189c(C2114c.C2115a aVar, Function function) {
            this.f32032a = aVar;
            this.f32033b = function;
        }

        @Override // p431y.AbstractC14182c
        /* renamed from: a */
        public void mo1412a(I i) {
            try {
                this.f32032a.m38961c(this.f32033b.apply(i));
            } catch (Throwable th2) {
                this.f32032a.m38958f(th2);
            }
        }

        @Override // p431y.AbstractC14182c
        public void onFailure(Throwable th2) {
            this.f32032a.m38958f(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y.f$d */
    /* loaded from: classes.dex */
    public class RunnableC14190d implements Runnable {

        /* renamed from: k */
        final /* synthetic */ AbstractFutureC7576b f32034k;

        RunnableC14190d(AbstractFutureC7576b bVar) {
            this.f32034k = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32034k.cancel(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y.f$e */
    /* loaded from: classes.dex */
    public static final class RunnableC14191e<V> implements Runnable {

        /* renamed from: k */
        final Future<V> f32035k;

        /* renamed from: l */
        final AbstractC14182c<? super V> f32036l;

        RunnableC14191e(Future<V> future, AbstractC14182c<? super V> cVar) {
            this.f32035k = future;
            this.f32036l = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable e;
            try {
                this.f32036l.mo1412a(C14186f.m1425d(this.f32035k));
            } catch (Error e2) {
                e = e2;
                this.f32036l.onFailure(e);
            } catch (RuntimeException e3) {
                e = e3;
                this.f32036l.onFailure(e);
            } catch (ExecutionException e4) {
                this.f32036l.onFailure(e4.getCause());
            }
        }

        public String toString() {
            return RunnableC14191e.class.getSimpleName() + "," + this.f32036l;
        }
    }

    /* renamed from: b */
    public static <V> void m1427b(AbstractFutureC7576b<V> bVar, AbstractC14182c<? super V> cVar, Executor executor) {
        C2517g.m37588g(cVar);
        bVar.mo1409a(new RunnableC14191e(bVar, cVar), executor);
    }

    /* renamed from: c */
    public static <V> AbstractFutureC7576b<List<V>> m1426c(Collection<? extends AbstractFutureC7576b<? extends V>> collection) {
        return new C14196h(new ArrayList(collection), true, C13905a.m2339a());
    }

    /* renamed from: d */
    public static <V> V m1425d(Future<V> future) {
        boolean isDone = future.isDone();
        C2517g.m37585j(isDone, "Future was expected to be done, " + future);
        return (V) m1424e(future);
    }

    /* renamed from: e */
    public static <V> V m1424e(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th2) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* renamed from: f */
    public static <V> AbstractFutureC7576b<V> m1423f(Throwable th2) {
        return new AbstractC14192g.C14193a(th2);
    }

    /* renamed from: g */
    public static <V> ScheduledFuture<V> m1422g(Throwable th2) {
        return new AbstractC14192g.ScheduledFutureC14194b(th2);
    }

    /* renamed from: h */
    public static <V> AbstractFutureC7576b<V> m1421h(V v) {
        if (v == null) {
            return AbstractC14192g.m1411b();
        }
        return new AbstractC14192g.C14195c(v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ Object m1420i(AbstractFutureC7576b bVar, C2114c.C2115a aVar) {
        m1416m(false, bVar, f32030a, aVar, C13905a.m2339a());
        return "nonCancellationPropagating[" + bVar + "]";
    }

    /* renamed from: j */
    public static <V> AbstractFutureC7576b<V> m1419j(final AbstractFutureC7576b<V> bVar) {
        C2517g.m37588g(bVar);
        if (bVar.isDone()) {
            return bVar;
        }
        return C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: y.e
            @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
            /* renamed from: a */
            public final Object mo1403a(C2114c.C2115a aVar) {
                Object i;
                i = C14186f.m1420i(AbstractFutureC7576b.this, aVar);
                return i;
            }
        });
    }

    /* renamed from: k */
    public static <V> void m1418k(AbstractFutureC7576b<V> bVar, C2114c.C2115a<V> aVar) {
        m1417l(bVar, f32030a, aVar, C13905a.m2339a());
    }

    /* renamed from: l */
    public static <I, O> void m1417l(AbstractFutureC7576b<I> bVar, Function<? super I, ? extends O> function, C2114c.C2115a<O> aVar, Executor executor) {
        m1416m(true, bVar, function, aVar, executor);
    }

    /* renamed from: m */
    private static <I, O> void m1416m(boolean z, AbstractFutureC7576b<I> bVar, Function<? super I, ? extends O> function, C2114c.C2115a<O> aVar, Executor executor) {
        C2517g.m37588g(bVar);
        C2517g.m37588g(function);
        C2517g.m37588g(aVar);
        C2517g.m37588g(executor);
        m1427b(bVar, new C14189c(aVar, function), executor);
        if (z) {
            aVar.m38963a(new RunnableC14190d(bVar), C13905a.m2339a());
        }
    }

    /* renamed from: n */
    public static <V> AbstractFutureC7576b<List<V>> m1415n(Collection<? extends AbstractFutureC7576b<? extends V>> collection) {
        return new C14196h(new ArrayList(collection), false, C13905a.m2339a());
    }

    /* renamed from: o */
    public static <I, O> AbstractFutureC7576b<O> m1414o(AbstractFutureC7576b<I> bVar, Function<? super I, ? extends O> function, Executor executor) {
        C2517g.m37588g(function);
        return m1413p(bVar, new C14187a(function), executor);
    }

    /* renamed from: p */
    public static <I, O> AbstractFutureC7576b<O> m1413p(AbstractFutureC7576b<I> bVar, AbstractC14179a<? super I, ? extends O> aVar, Executor executor) {
        RunnableC14180b bVar2 = new RunnableC14180b(aVar, bVar);
        bVar.mo1409a(bVar2, executor);
        return bVar2;
    }
}
