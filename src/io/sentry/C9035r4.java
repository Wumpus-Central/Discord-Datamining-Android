package io.sentry;

import io.sentry.AbstractC9027q4;
import io.sentry.exception.C8858a;
import io.sentry.hints.AbstractC8884c;
import io.sentry.hints.AbstractC8885d;
import io.sentry.hints.AbstractC8888g;
import io.sentry.protocol.C8985h;
import io.sentry.protocol.C9001p;
import io.sentry.util.C9105h;
import io.sentry.util.C9111k;
import java.io.Closeable;
import java.lang.Thread;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.r4 */
/* loaded from: classes8.dex */
public final class C9035r4 implements AbstractC9023q0, Thread.UncaughtExceptionHandler, Closeable {

    /* renamed from: k */
    private Thread.UncaughtExceptionHandler f19865k;

    /* renamed from: l */
    private AbstractC8861f0 f19866l;

    /* renamed from: m */
    private C8951o3 f19867m;

    /* renamed from: n */
    private boolean f19868n;

    /* renamed from: o */
    private final AbstractC9027q4 f19869o;

    /* renamed from: io.sentry.r4$a */
    /* loaded from: classes8.dex */
    private static final class C9036a implements AbstractC8884c, AbstractC8885d, AbstractC8888g {

        /* renamed from: a */
        private final CountDownLatch f19870a = new CountDownLatch(1);

        /* renamed from: b */
        private final long f19871b;

        /* renamed from: c */
        private final AbstractC8869g0 f19872c;

        C9036a(long j, AbstractC8869g0 g0Var) {
            this.f19871b = j;
            this.f19872c = g0Var;
        }

        @Override // io.sentry.hints.AbstractC8884c
        /* renamed from: a */
        public void mo17179a() {
            this.f19870a.countDown();
        }

        @Override // io.sentry.hints.AbstractC8885d
        /* renamed from: d */
        public boolean mo17178d() {
            try {
                return this.f19870a.await(this.f19871b, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                this.f19872c.mo17723b(EnumC8942n3.ERROR, "Exception while awaiting for flush in UncaughtExceptionHint", e);
                return false;
            }
        }
    }

    public C9035r4() {
        this(AbstractC9027q4.C9028a.m17200c());
    }

    /* renamed from: g */
    static Throwable m17180g(Thread thread, Throwable th2) {
        C8985h hVar = new C8985h();
        hVar.m17395i(Boolean.FALSE);
        hVar.m17394j("UncaughtExceptionHandler");
        return new C8858a(hVar, th2, thread);
    }

    @Override // io.sentry.AbstractC9023q0
    /* renamed from: b */
    public final void mo17181b(AbstractC8861f0 f0Var, C8951o3 o3Var) {
        if (this.f19868n) {
            o3Var.getLogger().mo17722c(EnumC8942n3.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f19868n = true;
        this.f19866l = (AbstractC8861f0) C9111k.m16995a(f0Var, "Hub is required");
        C8951o3 o3Var2 = (C8951o3) C9111k.m16995a(o3Var, "SentryOptions is required");
        this.f19867m = o3Var2;
        AbstractC8869g0 logger = o3Var2.getLogger();
        EnumC8942n3 n3Var = EnumC8942n3.DEBUG;
        logger.mo17722c(n3Var, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f19867m.isEnableUncaughtExceptionHandler()));
        if (this.f19867m.isEnableUncaughtExceptionHandler()) {
            Thread.UncaughtExceptionHandler b = this.f19869o.mo17201b();
            if (b != null) {
                AbstractC8869g0 logger2 = this.f19867m.getLogger();
                logger2.mo17722c(n3Var, "default UncaughtExceptionHandler class='" + b.getClass().getName() + "'", new Object[0]);
                this.f19865k = b;
            }
            this.f19869o.mo17202a(this);
            this.f19867m.getLogger().mo17722c(n3Var, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this == this.f19869o.mo17201b()) {
            this.f19869o.mo17202a(this.f19865k);
            C8951o3 o3Var = this.f19867m;
            if (o3Var != null) {
                o3Var.getLogger().mo17722c(EnumC8942n3.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        C8951o3 o3Var = this.f19867m;
        if (o3Var != null && this.f19866l != null) {
            o3Var.getLogger().mo17722c(EnumC8942n3.INFO, "Uncaught exception received.", new Object[0]);
            try {
                C9036a aVar = new C9036a(this.f19867m.getFlushTimeoutMillis(), this.f19867m.getLogger());
                C8908j3 j3Var = new C8908j3(m17180g(thread, th2));
                j3Var.m17728x0(EnumC8942n3.FATAL);
                if (!this.f19866l.mo17821q(j3Var, C9105h.m17014e(aVar)).equals(C9001p.f19786l) && !aVar.mo17178d()) {
                    this.f19867m.getLogger().mo17722c(EnumC8942n3.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", j3Var.m17665E());
                }
            } catch (Throwable th3) {
                this.f19867m.getLogger().mo17723b(EnumC8942n3.ERROR, "Error sending uncaught exception to Sentry.", th3);
            }
            if (this.f19865k != null) {
                this.f19867m.getLogger().mo17722c(EnumC8942n3.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
                this.f19865k.uncaughtException(thread, th2);
            } else if (this.f19867m.isPrintUncaughtStackTrace()) {
                th2.printStackTrace();
            }
        }
    }

    C9035r4(AbstractC9027q4 q4Var) {
        this.f19868n = false;
        this.f19869o = (AbstractC9027q4) C9111k.m16995a(q4Var, "threadAdapter is required.");
    }
}
