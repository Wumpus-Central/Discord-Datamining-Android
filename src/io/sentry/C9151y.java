package io.sentry;

import io.sentry.util.C9111k;
import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.sentry.y */
/* loaded from: classes8.dex */
final class C9151y {

    /* renamed from: g */
    private static final long f20088g = TimeUnit.HOURS.toMillis(5);

    /* renamed from: h */
    private static final long f20089h = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: i */
    private static C9151y f20090i;

    /* renamed from: a */
    private final long f20091a;

    /* renamed from: b */
    private volatile String f20092b;

    /* renamed from: c */
    private volatile long f20093c;

    /* renamed from: d */
    private final AtomicBoolean f20094d;

    /* renamed from: e */
    private final Callable<InetAddress> f20095e;

    /* renamed from: f */
    private final ExecutorService f20096f;

    /* renamed from: io.sentry.y$b */
    /* loaded from: classes8.dex */
    private static final class ThreadFactoryC9153b implements ThreadFactory {

        /* renamed from: a */
        private int f20097a;

        private ThreadFactoryC9153b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryHostnameCache-");
            int i = this.f20097a;
            this.f20097a = i + 1;
            sb2.append(i);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    private C9151y() {
        this(f20088g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C9151y m16783e() {
        if (f20090i == null) {
            f20090i = new C9151y();
        }
        return f20090i;
    }

    /* renamed from: f */
    private void m16782f() {
        this.f20093c = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    /* renamed from: h */
    public /* synthetic */ Void m16780h() {
        try {
            this.f20092b = this.f20095e.call().getCanonicalHostName();
            this.f20093c = System.currentTimeMillis() + this.f20091a;
            this.f20094d.set(false);
            return null;
        } catch (Throwable th2) {
            this.f20094d.set(false);
            throw th2;
        }
    }

    /* renamed from: i */
    private void m16779i() {
        try {
            this.f20096f.submit(new Callable() { // from class: io.sentry.x
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void h;
                    h = C9151y.this.m16780h();
                    return h;
                }
            }).get(f20089h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            m16782f();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            m16782f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m16785c() {
        this.f20096f.shutdown();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public String m16784d() {
        if (this.f20093c < System.currentTimeMillis() && this.f20094d.compareAndSet(false, true)) {
            m16779i();
        }
        return this.f20092b;
    }

    C9151y(long j) {
        this(j, new Callable() { // from class: io.sentry.w
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InetAddress localHost;
                localHost = InetAddress.getLocalHost();
                return localHost;
            }
        });
    }

    C9151y(long j, Callable<InetAddress> callable) {
        this.f20094d = new AtomicBoolean(false);
        this.f20096f = Executors.newSingleThreadExecutor(new ThreadFactoryC9153b());
        this.f20091a = j;
        this.f20095e = (Callable) C9111k.m16995a(callable, "getLocalhost is required");
        m16779i();
    }
}
