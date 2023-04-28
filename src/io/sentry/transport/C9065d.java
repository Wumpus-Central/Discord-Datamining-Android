package io.sentry.transport;

import io.sentry.AbstractC8869g0;
import io.sentry.C8951o3;
import io.sentry.C9025q2;
import io.sentry.C9116v;
import io.sentry.C9155y1;
import io.sentry.EnumC8942n3;
import io.sentry.cache.AbstractC8821e;
import io.sentry.clientreport.EnumC8827e;
import io.sentry.hints.AbstractC8883b;
import io.sentry.hints.AbstractC8884c;
import io.sentry.hints.AbstractC8887f;
import io.sentry.hints.AbstractC8892k;
import io.sentry.transport.C9065d;
import io.sentry.util.C9105h;
import io.sentry.util.C9110j;
import io.sentry.util.C9111k;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.transport.d */
/* loaded from: classes8.dex */
public final class C9065d implements AbstractC9080p {

    /* renamed from: k */
    private final C9086v f19906k;

    /* renamed from: l */
    private final AbstractC8821e f19907l;

    /* renamed from: m */
    private final C8951o3 f19908m;

    /* renamed from: n */
    private final C9090y f19909n;

    /* renamed from: o */
    private final AbstractC9081q f19910o;

    /* renamed from: p */
    private final C9078n f19911p;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.transport.d$b */
    /* loaded from: classes8.dex */
    public static final class ThreadFactoryC9067b implements ThreadFactory {

        /* renamed from: a */
        private int f19912a;

        private ThreadFactoryC9067b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryAsyncConnection-");
            int i = this.f19912a;
            this.f19912a = i + 1;
            sb2.append(i);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.transport.d$c */
    /* loaded from: classes8.dex */
    public final class RunnableC9068c implements Runnable {

        /* renamed from: k */
        private final C9025q2 f19913k;

        /* renamed from: l */
        private final C9116v f19914l;

        /* renamed from: m */
        private final AbstractC8821e f19915m;

        /* renamed from: n */
        private final AbstractC9059a0 f19916n = AbstractC9059a0.m17161a();

        RunnableC9068c(C9025q2 q2Var, C9116v vVar, AbstractC8821e eVar) {
            this.f19913k = (C9025q2) C9111k.m16995a(q2Var, "Envelope is required.");
            this.f19914l = vVar;
            this.f19915m = (AbstractC8821e) C9111k.m16995a(eVar, "EnvelopeCache is required.");
        }

        /* renamed from: j */
        private AbstractC9059a0 m17136j() {
            AbstractC9059a0 a0Var = this.f19916n;
            this.f19915m.mo17113o(this.f19913k, this.f19914l);
            C9105h.m17005n(this.f19914l, AbstractC8884c.class, new C9105h.AbstractC9106a() { // from class: io.sentry.transport.f
                @Override // io.sentry.util.C9105h.AbstractC9106a
                public final void accept(Object obj) {
                    C9065d.RunnableC9068c.this.m17135k((AbstractC8884c) obj);
                }
            });
            if (C9065d.this.f19910o.mo17109a()) {
                final C9025q2 d = C9065d.this.f19908m.getClientReportRecorder().mo17935d(this.f19913k);
                try {
                    AbstractC9059a0 h = C9065d.this.f19911p.m17118h(d);
                    if (h.mo17157d()) {
                        this.f19915m.mo17114d(this.f19913k);
                        return h;
                    }
                    String str = "The transport failed to send the envelope with response code " + h.mo17158c();
                    C9065d.this.f19908m.getLogger().mo17722c(EnumC8942n3.ERROR, str, new Object[0]);
                    if (h.mo17158c() >= 400 && h.mo17158c() != 429) {
                        C9105h.m17006m(this.f19914l, AbstractC8887f.class, new C9105h.AbstractC9108c() { // from class: io.sentry.transport.g
                            @Override // io.sentry.util.C9105h.AbstractC9108c
                            public final void accept(Object obj) {
                                C9065d.RunnableC9068c.this.m17134l(d, obj);
                            }
                        });
                    }
                    throw new IllegalStateException(str);
                } catch (IOException e) {
                    C9105h.m17004o(this.f19914l, AbstractC8887f.class, new C9105h.AbstractC9106a() { // from class: io.sentry.transport.h
                        @Override // io.sentry.util.C9105h.AbstractC9106a
                        public final void accept(Object obj) {
                            ((AbstractC8887f) obj).mo17715c(true);
                        }
                    }, new C9105h.AbstractC9107b() { // from class: io.sentry.transport.i
                        @Override // io.sentry.util.C9105h.AbstractC9107b
                        /* renamed from: a */
                        public final void mo16999a(Object obj, Class cls) {
                            C9065d.RunnableC9068c.this.m17132n(d, obj, cls);
                        }
                    });
                    throw new IllegalStateException("Sending the event failed.", e);
                }
            } else {
                C9105h.m17004o(this.f19914l, AbstractC8887f.class, new C9105h.AbstractC9106a() { // from class: io.sentry.transport.j
                    @Override // io.sentry.util.C9105h.AbstractC9106a
                    public final void accept(Object obj) {
                        ((AbstractC8887f) obj).mo17715c(true);
                    }
                }, new C9105h.AbstractC9107b() { // from class: io.sentry.transport.k
                    @Override // io.sentry.util.C9105h.AbstractC9107b
                    /* renamed from: a */
                    public final void mo16999a(Object obj, Class cls) {
                        C9065d.RunnableC9068c.this.m17130p(obj, cls);
                    }
                });
                return a0Var;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m17135k(AbstractC8884c cVar) {
            cVar.mo17179a();
            C9065d.this.f19908m.getLogger().mo17722c(EnumC8942n3.DEBUG, "Disk flush envelope fired", new Object[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m17134l(C9025q2 q2Var, Object obj) {
            C9065d.this.f19908m.getClientReportRecorder().mo17937b(EnumC8827e.NETWORK_ERROR, q2Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m17132n(C9025q2 q2Var, Object obj, Class cls) {
            C9110j.m16996a(cls, obj, C9065d.this.f19908m.getLogger());
            C9065d.this.f19908m.getClientReportRecorder().mo17937b(EnumC8827e.NETWORK_ERROR, q2Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public /* synthetic */ void m17130p(Object obj, Class cls) {
            C9110j.m16996a(cls, obj, C9065d.this.f19908m.getLogger());
            C9065d.this.f19908m.getClientReportRecorder().mo17937b(EnumC8827e.NETWORK_ERROR, this.f19913k);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public /* synthetic */ void m17129q(AbstractC9059a0 a0Var, AbstractC8892k kVar) {
            C9065d.this.f19908m.getLogger().mo17722c(EnumC8942n3.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(a0Var.mo17157d()));
            kVar.mo17716b(a0Var.mo17157d());
        }

        @Override // java.lang.Runnable
        public void run() {
            final AbstractC9059a0 a0Var = this.f19916n;
            try {
                a0Var = m17136j();
                C9065d.this.f19908m.getLogger().mo17722c(EnumC8942n3.DEBUG, "Envelope flushed", new Object[0]);
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
    }

    public C9065d(C8951o3 o3Var, C9090y yVar, AbstractC9081q qVar, C9155y1 y1Var) {
        this(m17150p(o3Var.getMaxQueueSize(), o3Var.getEnvelopeDiskCache(), o3Var.getLogger()), o3Var, yVar, qVar, new C9078n(o3Var, y1Var, yVar));
    }

    /* renamed from: p */
    private static C9086v m17150p(int i, final AbstractC8821e eVar, final AbstractC8869g0 g0Var) {
        return new C9086v(1, i, new ThreadFactoryC9067b(), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                C9065d.m17149r(AbstractC8821e.this, g0Var, runnable, threadPoolExecutor);
            }
        }, g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ void m17149r(AbstractC8821e eVar, AbstractC8869g0 g0Var, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (runnable instanceof RunnableC9068c) {
            RunnableC9068c cVar = (RunnableC9068c) runnable;
            if (!C9105h.m17012g(cVar.f19914l, AbstractC8883b.class)) {
                eVar.mo17113o(cVar.f19913k, cVar.f19914l);
            }
            m17146z(cVar.f19914l, true);
            g0Var.mo17722c(EnumC8942n3.WARNING, "Envelope rejected", new Object[0]);
        }
    }

    /* renamed from: z */
    private static void m17146z(C9116v vVar, final boolean z) {
        C9105h.m17005n(vVar, AbstractC8892k.class, new C9105h.AbstractC9106a() { // from class: io.sentry.transport.b
            @Override // io.sentry.util.C9105h.AbstractC9106a
            public final void accept(Object obj) {
                ((AbstractC8892k) obj).mo17716b(false);
            }
        });
        C9105h.m17005n(vVar, AbstractC8887f.class, new C9105h.AbstractC9106a() { // from class: io.sentry.transport.c
            @Override // io.sentry.util.C9105h.AbstractC9106a
            public final void accept(Object obj) {
                ((AbstractC8887f) obj).mo17715c(z);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f19906k.shutdown();
        this.f19908m.getLogger().mo17722c(EnumC8942n3.DEBUG, "Shutting down", new Object[0]);
        try {
            if (!this.f19906k.awaitTermination(1L, TimeUnit.MINUTES)) {
                this.f19908m.getLogger().mo17722c(EnumC8942n3.WARNING, "Failed to shutdown the async connection async sender within 1 minute. Trying to force it now.", new Object[0]);
                this.f19906k.shutdownNow();
            }
        } catch (InterruptedException unused) {
            this.f19908m.getLogger().mo17722c(EnumC8942n3.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.AbstractC9080p
    /* renamed from: d */
    public void mo17111d(long j) {
        this.f19906k.m17106b(j);
    }

    @Override // io.sentry.transport.AbstractC9080p
    /* renamed from: x */
    public void mo17110x(C9025q2 q2Var, C9116v vVar) {
        AbstractC8821e eVar = this.f19907l;
        boolean z = false;
        if (C9105h.m17012g(vVar, AbstractC8883b.class)) {
            eVar = C9082r.m17115a();
            this.f19908m.getLogger().mo17722c(EnumC8942n3.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z = true;
        }
        C9025q2 d = this.f19909n.m17102d(q2Var, vVar);
        if (d != null) {
            if (C9105h.m17012g(vVar, AbstractC8884c.class)) {
                d = this.f19908m.getClientReportRecorder().mo17935d(d);
            }
            Future<?> submit = this.f19906k.submit(new RunnableC9068c(d, vVar, eVar));
            if (submit != null && submit.isCancelled()) {
                this.f19908m.getClientReportRecorder().mo17937b(EnumC8827e.QUEUE_OVERFLOW, d);
            }
        } else if (z) {
            this.f19907l.mo17114d(q2Var);
        }
    }

    public C9065d(C9086v vVar, C8951o3 o3Var, C9090y yVar, AbstractC9081q qVar, C9078n nVar) {
        this.f19906k = (C9086v) C9111k.m16995a(vVar, "executor is required");
        this.f19907l = (AbstractC8821e) C9111k.m16995a(o3Var.getEnvelopeDiskCache(), "envelopeCache is required");
        this.f19908m = (C8951o3) C9111k.m16995a(o3Var, "options is required");
        this.f19909n = (C9090y) C9111k.m16995a(yVar, "rateLimiter is required");
        this.f19910o = (AbstractC9081q) C9111k.m16995a(qVar, "transportGate is required");
        this.f19911p = (C9078n) C9111k.m16995a(nVar, "httpConnection is required");
    }
}
