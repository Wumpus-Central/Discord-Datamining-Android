package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import io.sentry.AbstractC8861f0;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9023q0;
import io.sentry.C8951o3;
import io.sentry.EnumC8942n3;
import io.sentry.android.core.C8699b;
import io.sentry.exception.C8858a;
import io.sentry.protocol.C8985h;
import io.sentry.util.C9111k;
import java.io.Closeable;

/* renamed from: io.sentry.android.core.y */
/* loaded from: classes8.dex */
public final class C8796y implements AbstractC9023q0, Closeable {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: m */
    private static C8699b f19443m;

    /* renamed from: n */
    private static final Object f19444n = new Object();

    /* renamed from: k */
    private final Context f19445k;

    /* renamed from: l */
    private C8951o3 f19446l;

    public C8796y(Context context) {
        this.f19445k = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m18061h(AbstractC8861f0 f0Var, SentryAndroidOptions sentryAndroidOptions, C8712e0 e0Var) {
        m18059l(f0Var, sentryAndroidOptions.getLogger(), e0Var);
    }

    /* renamed from: i */
    private void m18060i(final AbstractC8861f0 f0Var, final SentryAndroidOptions sentryAndroidOptions) {
        AbstractC8869g0 logger = sentryAndroidOptions.getLogger();
        EnumC8942n3 n3Var = EnumC8942n3.DEBUG;
        logger.mo17722c(n3Var, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            synchronized (f19444n) {
                if (f19443m == null) {
                    sentryAndroidOptions.getLogger().mo17722c(n3Var, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                    C8699b bVar = new C8699b(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new C8699b.AbstractC8700a() { // from class: io.sentry.android.core.x
                        @Override // io.sentry.android.core.C8699b.AbstractC8700a
                        /* renamed from: a */
                        public final void mo18063a(C8712e0 e0Var) {
                            C8796y.this.m18061h(f0Var, sentryAndroidOptions, e0Var);
                        }
                    }, sentryAndroidOptions.getLogger(), this.f19445k);
                    f19443m = bVar;
                    bVar.start();
                    sentryAndroidOptions.getLogger().mo17722c(n3Var, "AnrIntegration installed.", new Object[0]);
                }
            }
        }
    }

    @Override // io.sentry.AbstractC9023q0
    /* renamed from: b */
    public final void mo17181b(AbstractC8861f0 f0Var, C8951o3 o3Var) {
        this.f19446l = (C8951o3) C9111k.m16995a(o3Var, "SentryOptions is required");
        m18060i(f0Var, (SentryAndroidOptions) o3Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (f19444n) {
            C8699b bVar = f19443m;
            if (bVar != null) {
                bVar.interrupt();
                f19443m = null;
                C8951o3 o3Var = this.f19446l;
                if (o3Var != null) {
                    o3Var.getLogger().mo17722c(EnumC8942n3.DEBUG, "AnrIntegration removed.", new Object[0]);
                }
            }
        }
    }

    /* renamed from: l */
    void m18059l(AbstractC8861f0 f0Var, AbstractC8869g0 g0Var, C8712e0 e0Var) {
        g0Var.mo17722c(EnumC8942n3.INFO, "ANR triggered with message: %s", e0Var.getMessage());
        C8985h hVar = new C8985h();
        hVar.m17394j("ANR");
        f0Var.mo17816v(new C8858a(hVar, e0Var, e0Var.m18309a(), true));
    }
}
