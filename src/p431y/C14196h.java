package p431y;

import androidx.concurrent.futures.C2114c;
import androidx.core.util.C2517g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p120gc.AbstractFutureC7576b;
import p410x.C13905a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y.h */
/* loaded from: classes.dex */
public class C14196h<V> implements AbstractFutureC7576b<List<V>> {

    /* renamed from: k */
    List<? extends AbstractFutureC7576b<? extends V>> f32040k;

    /* renamed from: l */
    List<V> f32041l;

    /* renamed from: m */
    private final boolean f32042m;

    /* renamed from: n */
    private final AtomicInteger f32043n;

    /* renamed from: o */
    private final AbstractFutureC7576b<List<V>> f32044o = C2114c.m38964a(new C14197a());

    /* renamed from: p */
    C2114c.C2115a<List<V>> f32045p;

    /* renamed from: y.h$a */
    /* loaded from: classes.dex */
    class C14197a implements C2114c.AbstractC0030c<List<V>> {
        C14197a() {
        }

        @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
        /* renamed from: a */
        public Object mo1403a(C2114c.C2115a<List<V>> aVar) {
            boolean z;
            if (C14196h.this.f32045p == null) {
                z = true;
            } else {
                z = false;
            }
            C2517g.m37585j(z, "The result can only set once!");
            C14196h.this.f32045p = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y.h$b */
    /* loaded from: classes.dex */
    public class RunnableC14198b implements Runnable {
        RunnableC14198b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C14196h hVar = C14196h.this;
            hVar.f32041l = null;
            hVar.f32040k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y.h$c */
    /* loaded from: classes.dex */
    public class RunnableC14199c implements Runnable {

        /* renamed from: k */
        final /* synthetic */ int f32048k;

        /* renamed from: l */
        final /* synthetic */ AbstractFutureC7576b f32049l;

        RunnableC14199c(int i, AbstractFutureC7576b bVar) {
            this.f32048k = i;
            this.f32049l = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C14196h.this.m1404f(this.f32048k, this.f32049l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14196h(List<? extends AbstractFutureC7576b<? extends V>> list, boolean z, Executor executor) {
        this.f32040k = (List) C2517g.m37588g(list);
        this.f32041l = new ArrayList(list.size());
        this.f32042m = z;
        this.f32043n = new AtomicInteger(list.size());
        m1405e(executor);
    }

    /* renamed from: b */
    private void m1408b() {
        List<? extends AbstractFutureC7576b<? extends V>> list = this.f32040k;
        if (list != null && !isDone()) {
            Iterator<? extends AbstractFutureC7576b<? extends V>> it = list.iterator();
            while (it.hasNext()) {
                AbstractFutureC7576b bVar = (AbstractFutureC7576b) it.next();
                while (!bVar.isDone()) {
                    try {
                        bVar.get();
                    } catch (Error e) {
                        throw e;
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                        if (this.f32042m) {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    private void m1405e(Executor executor) {
        mo1409a(new RunnableC14198b(), C13905a.m2339a());
        if (this.f32040k.isEmpty()) {
            this.f32045p.m38961c(new ArrayList(this.f32041l));
            return;
        }
        for (int i = 0; i < this.f32040k.size(); i++) {
            this.f32041l.add(null);
        }
        List<? extends AbstractFutureC7576b<? extends V>> list = this.f32040k;
        for (int i2 = 0; i2 < list.size(); i2++) {
            AbstractFutureC7576b bVar = (AbstractFutureC7576b) list.get(i2);
            bVar.mo1409a(new RunnableC14199c(i2, bVar), executor);
        }
    }

    @Override // p120gc.AbstractFutureC7576b
    /* renamed from: a */
    public void mo1409a(Runnable runnable, Executor executor) {
        this.f32044o.mo1409a(runnable, executor);
    }

    /* renamed from: c */
    public List<V> get() {
        m1408b();
        return this.f32044o.get();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        List<? extends AbstractFutureC7576b<? extends V>> list = this.f32040k;
        if (list != null) {
            Iterator<? extends AbstractFutureC7576b<? extends V>> it = list.iterator();
            while (it.hasNext()) {
                ((AbstractFutureC7576b) it.next()).cancel(z);
            }
        }
        return this.f32044o.cancel(z);
    }

    /* renamed from: d */
    public List<V> get(long j, TimeUnit timeUnit) {
        return this.f32044o.get(j, timeUnit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    void m1404f(int i, Future<? extends V> future) {
        C2114c.C2115a<List<V>> aVar;
        ArrayList arrayList;
        int decrementAndGet;
        List<V> list = this.f32041l;
        if (isDone() || list == 0) {
            C2517g.m37585j(this.f32042m, "Future was done before all dependencies completed");
            return;
        }
        boolean z = true;
        try {
            try {
                try {
                    try {
                        C2517g.m37585j(future.isDone(), "Tried to set value from future which is not done");
                        list.set(i, C14186f.m1424e(future));
                        decrementAndGet = this.f32043n.decrementAndGet();
                        if (decrementAndGet < 0) {
                            z = false;
                        }
                        C2517g.m37585j(z, "Less than 0 remaining futures");
                    } catch (ExecutionException e) {
                        if (this.f32042m) {
                            this.f32045p.m38958f(e.getCause());
                        }
                        int decrementAndGet2 = this.f32043n.decrementAndGet();
                        if (decrementAndGet2 < 0) {
                            z = false;
                        }
                        C2517g.m37585j(z, "Less than 0 remaining futures");
                        if (decrementAndGet2 == 0) {
                            List<V> list2 = this.f32041l;
                            if (list2 != null) {
                                aVar = this.f32045p;
                                arrayList = new ArrayList(list2);
                            }
                        } else {
                            return;
                        }
                    }
                } catch (RuntimeException e2) {
                    if (this.f32042m) {
                        this.f32045p.m38958f(e2);
                    }
                    int decrementAndGet3 = this.f32043n.decrementAndGet();
                    if (decrementAndGet3 < 0) {
                        z = false;
                    }
                    C2517g.m37585j(z, "Less than 0 remaining futures");
                    if (decrementAndGet3 == 0) {
                        List<V> list3 = this.f32041l;
                        if (list3 != null) {
                            aVar = this.f32045p;
                            arrayList = new ArrayList(list3);
                        }
                    } else {
                        return;
                    }
                }
            } catch (Error e3) {
                this.f32045p.m38958f(e3);
                int decrementAndGet4 = this.f32043n.decrementAndGet();
                if (decrementAndGet4 < 0) {
                    z = false;
                }
                C2517g.m37585j(z, "Less than 0 remaining futures");
                if (decrementAndGet4 == 0) {
                    List<V> list4 = this.f32041l;
                    if (list4 != null) {
                        aVar = this.f32045p;
                        arrayList = new ArrayList(list4);
                    }
                } else {
                    return;
                }
            } catch (CancellationException unused) {
                if (this.f32042m) {
                    cancel(false);
                }
                int decrementAndGet5 = this.f32043n.decrementAndGet();
                if (decrementAndGet5 < 0) {
                    z = false;
                }
                C2517g.m37585j(z, "Less than 0 remaining futures");
                if (decrementAndGet5 == 0) {
                    List<V> list5 = this.f32041l;
                    if (list5 != null) {
                        aVar = this.f32045p;
                        arrayList = new ArrayList(list5);
                    }
                } else {
                    return;
                }
            }
            if (decrementAndGet == 0) {
                List<V> list6 = this.f32041l;
                if (list6 != null) {
                    aVar = this.f32045p;
                    arrayList = new ArrayList(list6);
                    aVar.m38961c(arrayList);
                    return;
                }
                C2517g.m37586i(isDone());
            }
        } catch (Throwable th2) {
            int decrementAndGet6 = this.f32043n.decrementAndGet();
            if (decrementAndGet6 < 0) {
                z = false;
            }
            C2517g.m37585j(z, "Less than 0 remaining futures");
            if (decrementAndGet6 == 0) {
                List<V> list7 = this.f32041l;
                if (list7 != null) {
                    this.f32045p.m38961c(new ArrayList(list7));
                } else {
                    C2517g.m37586i(isDone());
                }
            }
            throw th2;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f32044o.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f32044o.isDone();
    }
}
