package io.sentry.android.core;

import io.sentry.AbstractC8813c2;
import io.sentry.AbstractC8861f0;
import io.sentry.AbstractC8871g2;
import io.sentry.AbstractC9023q0;
import io.sentry.C8951o3;
import io.sentry.EnumC8942n3;
import io.sentry.util.C9111k;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.android.core.y0 */
/* loaded from: classes8.dex */
public final class C8797y0 implements AbstractC9023q0 {

    /* renamed from: k */
    private final AbstractC8871g2 f19447k;

    /* renamed from: l */
    private final boolean f19448l;

    public C8797y0(AbstractC8871g2 g2Var, boolean z) {
        this.f19447k = (AbstractC8871g2) C9111k.m16995a(g2Var, "SendFireAndForgetFactory is required");
        this.f19448l = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m18057c(AbstractC8813c2 c2Var, SentryAndroidOptions sentryAndroidOptions) {
        try {
            c2Var.mo17864a();
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().mo17723b(EnumC8942n3.ERROR, "Failed trying to send cached events.", th2);
        }
    }

    @Override // io.sentry.AbstractC9023q0
    /* renamed from: b */
    public void mo17181b(AbstractC8861f0 f0Var, C8951o3 o3Var) {
        SentryAndroidOptions sentryAndroidOptions;
        C9111k.m16995a(f0Var, "Hub is required");
        if (o3Var instanceof SentryAndroidOptions) {
            sentryAndroidOptions = (SentryAndroidOptions) o3Var;
        } else {
            sentryAndroidOptions = null;
        }
        final SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) C9111k.m16995a(sentryAndroidOptions, "SentryAndroidOptions is required");
        if (!this.f19447k.mo17766b(o3Var.getCacheDirPath(), o3Var.getLogger())) {
            o3Var.getLogger().mo17722c(EnumC8942n3.ERROR, "No cache dir path is defined in options.", new Object[0]);
            return;
        }
        final AbstractC8813c2 a = this.f19447k.mo17767a(f0Var, sentryAndroidOptions2);
        if (a == null) {
            sentryAndroidOptions2.getLogger().mo17722c(EnumC8942n3.ERROR, "SendFireAndForget factory is null.", new Object[0]);
            return;
        }
        try {
            Future<?> submit = sentryAndroidOptions2.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.x0
                @Override // java.lang.Runnable
                public final void run() {
                    C8797y0.m18057c(AbstractC8813c2.this, sentryAndroidOptions2);
                }
            });
            if (this.f19448l) {
                sentryAndroidOptions2.getLogger().mo17722c(EnumC8942n3.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                try {
                    submit.get(sentryAndroidOptions2.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused) {
                    sentryAndroidOptions2.getLogger().mo17722c(EnumC8942n3.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                }
            }
            sentryAndroidOptions2.getLogger().mo17722c(EnumC8942n3.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
        } catch (Throwable th2) {
            sentryAndroidOptions2.getLogger().mo17723b(EnumC8942n3.ERROR, "Failed to call the executor. Cached events will not be sent", th2);
        }
    }
}
