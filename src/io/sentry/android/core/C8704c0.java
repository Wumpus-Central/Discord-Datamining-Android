package io.sentry.android.core;

import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.AbstractC8861f0;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9023q0;
import io.sentry.C8951o3;
import io.sentry.EnumC8942n3;
import io.sentry.android.core.internal.util.C8747e;
import io.sentry.util.C9111k;
import java.io.Closeable;

/* renamed from: io.sentry.android.core.c0 */
/* loaded from: classes8.dex */
public final class C8704c0 implements AbstractC9023q0, Closeable {

    /* renamed from: k */
    LifecycleWatcher f19251k;

    /* renamed from: l */
    private SentryAndroidOptions f19252l;

    /* renamed from: m */
    private final C8778q0 f19253m;

    public C8704c0() {
        this(new C8778q0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m18323n(AbstractC8861f0 f0Var) {
        SentryAndroidOptions sentryAndroidOptions = this.f19252l;
        if (sentryAndroidOptions != null) {
            this.f19251k = new LifecycleWatcher(f0Var, sentryAndroidOptions.getSessionTrackingIntervalMillis(), this.f19252l.isEnableAutoSessionTracking(), this.f19252l.isEnableAppLifecycleBreadcrumbs());
            try {
                ProcessLifecycleOwner.m35806h().getLifecycle().mo35844a(this.f19251k);
                this.f19252l.getLogger().mo17722c(EnumC8942n3.DEBUG, "AppLifecycleIntegration installed.", new Object[0]);
            } catch (Throwable th2) {
                this.f19251k = null;
                this.f19252l.getLogger().mo17723b(EnumC8942n3.ERROR, "AppLifecycleIntegration failed to get Lifecycle and could not be installed.", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m18324l() {
        ProcessLifecycleOwner.m35806h().getLifecycle().mo35842c(this.f19251k);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0074 -> B:19:0x008c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0081 -> B:19:0x008c). Please submit an issue!!! */
    @Override // io.sentry.AbstractC9023q0
    /* renamed from: b */
    public void mo17181b(final AbstractC8861f0 f0Var, C8951o3 o3Var) {
        SentryAndroidOptions sentryAndroidOptions;
        C9111k.m16995a(f0Var, "Hub is required");
        if (o3Var instanceof SentryAndroidOptions) {
            sentryAndroidOptions = (SentryAndroidOptions) o3Var;
        } else {
            sentryAndroidOptions = null;
        }
        SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) C9111k.m16995a(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f19252l = sentryAndroidOptions2;
        AbstractC8869g0 logger = sentryAndroidOptions2.getLogger();
        EnumC8942n3 n3Var = EnumC8942n3.DEBUG;
        logger.mo17722c(n3Var, "enableSessionTracking enabled: %s", Boolean.valueOf(this.f19252l.isEnableAutoSessionTracking()));
        this.f19252l.getLogger().mo17722c(n3Var, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.f19252l.isEnableAppLifecycleBreadcrumbs()));
        if (this.f19252l.isEnableAutoSessionTracking() || this.f19252l.isEnableAppLifecycleBreadcrumbs()) {
            try {
                int i = ProcessLifecycleOwner.f4404t;
                if (C8747e.m18216a()) {
                    m18323n(f0Var);
                    o3Var = o3Var;
                } else {
                    this.f19253m.m18098b(new Runnable() { // from class: io.sentry.android.core.b0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8704c0.this.m18323n(f0Var);
                        }
                    });
                    o3Var = o3Var;
                }
            } catch (ClassNotFoundException e) {
                AbstractC8869g0 logger2 = o3Var.getLogger();
                logger2.mo17723b(EnumC8942n3.INFO, "androidx.lifecycle is not available, AppLifecycleIntegration won't be installed", e);
                o3Var = logger2;
            } catch (IllegalStateException e2) {
                AbstractC8869g0 logger3 = o3Var.getLogger();
                logger3.mo17723b(EnumC8942n3.ERROR, "AppLifecycleIntegration could not be installed", e2);
                o3Var = logger3;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f19251k != null) {
            if (C8747e.m18216a()) {
                m18324l();
            } else {
                this.f19253m.m18098b(new Runnable() { // from class: io.sentry.android.core.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8704c0.this.m18324l();
                    }
                });
            }
            this.f19251k = null;
            SentryAndroidOptions sentryAndroidOptions = this.f19252l;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo17722c(EnumC8942n3.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
            }
        }
    }

    C8704c0(C8778q0 q0Var) {
        this.f19253m = q0Var;
    }
}
