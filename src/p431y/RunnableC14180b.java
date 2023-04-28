package p431y;

import androidx.core.util.C2517g;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p120gc.AbstractFutureC7576b;
import p410x.C13905a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y.b */
/* loaded from: classes.dex */
public class RunnableC14180b<I, O> extends C14183d<O> implements Runnable {

    /* renamed from: m */
    private AbstractC14179a<? super I, ? extends O> f32019m;

    /* renamed from: n */
    private final BlockingQueue<Boolean> f32020n = new LinkedBlockingQueue(1);

    /* renamed from: o */
    private final CountDownLatch f32021o = new CountDownLatch(1);

    /* renamed from: p */
    private AbstractFutureC7576b<? extends I> f32022p;

    /* renamed from: q */
    volatile AbstractFutureC7576b<? extends O> f32023q;

    /* renamed from: y.b$a */
    /* loaded from: classes.dex */
    class RunnableC14181a implements Runnable {

        /* renamed from: k */
        final /* synthetic */ AbstractFutureC7576b f32024k;

        RunnableC14181a(AbstractFutureC7576b bVar) {
            this.f32024k = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    RunnableC14180b.this.m1432c(C14186f.m1424e(this.f32024k));
                } catch (CancellationException unused) {
                    RunnableC14180b.this.cancel(false);
                    RunnableC14180b.this.f32023q = null;
                    return;
                } catch (ExecutionException e) {
                    RunnableC14180b.this.m1431d(e.getCause());
                }
                RunnableC14180b.this.f32023q = null;
            } catch (Throwable th2) {
                RunnableC14180b.this.f32023q = null;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC14180b(AbstractC14179a<? super I, ? extends O> aVar, AbstractFutureC7576b<? extends I> bVar) {
        this.f32019m = (AbstractC14179a) C2517g.m37588g(aVar);
        this.f32022p = (AbstractFutureC7576b) C2517g.m37588g(bVar);
    }

    /* renamed from: g */
    private void m1436g(Future<?> future, boolean z) {
        if (future != null) {
            future.cancel(z);
        }
    }

    /* renamed from: h */
    private <E> void m1435h(BlockingQueue<E> blockingQueue, E e) {
        boolean z = false;
        while (true) {
            try {
                blockingQueue.put(e);
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
    }

    /* renamed from: i */
    private <E> E m1434i(BlockingQueue<E> blockingQueue) {
        E take;
        boolean z = false;
        while (true) {
            try {
                take = blockingQueue.take();
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
        return take;
    }

    @Override // p431y.C14183d, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (!super.cancel(z)) {
            return false;
        }
        m1435h(this.f32020n, Boolean.valueOf(z));
        m1436g(this.f32022p, z);
        m1436g(this.f32023q, z);
        return true;
    }

    @Override // p431y.C14183d, java.util.concurrent.Future
    public O get() {
        if (!isDone()) {
            AbstractFutureC7576b<? extends I> bVar = this.f32022p;
            if (bVar != null) {
                bVar.get();
            }
            this.f32021o.await();
            AbstractFutureC7576b<? extends O> bVar2 = this.f32023q;
            if (bVar2 != null) {
                bVar2.get();
            }
        }
        return (O) super.get();
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractFutureC7576b<? extends O> apply;
        try {
            try {
                try {
                    try {
                        apply = this.f32019m.apply(C14186f.m1424e(this.f32022p));
                        this.f32023q = apply;
                    } catch (Error e) {
                        m1431d(e);
                    } catch (UndeclaredThrowableException e2) {
                        m1431d(e2.getCause());
                    }
                } catch (Throwable th2) {
                    this.f32019m = null;
                    this.f32022p = null;
                    this.f32021o.countDown();
                    throw th2;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e3) {
                m1431d(e3.getCause());
            }
        } catch (Exception e4) {
            m1431d(e4);
        }
        if (isCancelled()) {
            apply.cancel(((Boolean) m1434i(this.f32020n)).booleanValue());
            this.f32023q = null;
            this.f32019m = null;
            this.f32022p = null;
            this.f32021o.countDown();
            return;
        }
        apply.mo1409a(new RunnableC14181a(apply), C13905a.m2339a());
        this.f32019m = null;
        this.f32022p = null;
        this.f32021o.countDown();
    }

    @Override // p431y.C14183d, java.util.concurrent.Future
    public O get(long j, TimeUnit timeUnit) {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            AbstractFutureC7576b<? extends I> bVar = this.f32022p;
            if (bVar != null) {
                long nanoTime = System.nanoTime();
                bVar.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.f32021o.await(j, timeUnit)) {
                j -= Math.max(0L, System.nanoTime() - nanoTime2);
                AbstractFutureC7576b<? extends O> bVar2 = this.f32023q;
                if (bVar2 != null) {
                    bVar2.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) super.get(j, timeUnit);
    }
}
