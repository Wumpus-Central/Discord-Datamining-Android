package io.sentry.android.core;

import io.sentry.AbstractC8861f0;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9023q0;
import io.sentry.C8951o3;
import io.sentry.EnumC8942n3;
import io.sentry.util.C9111k;
import java.io.Closeable;

/* renamed from: io.sentry.android.core.s0 */
/* loaded from: classes8.dex */
public final class C8782s0 implements AbstractC9023q0, Closeable {

    /* renamed from: k */
    private final Class<?> f19395k;

    /* renamed from: l */
    private SentryAndroidOptions f19396l;

    public C8782s0(Class<?> cls) {
        this.f19395k = cls;
    }

    /* renamed from: g */
    private void m18088g(C8951o3 o3Var) {
        o3Var.setEnableNdk(false);
        o3Var.setEnableScopeSync(false);
    }

    @Override // io.sentry.AbstractC9023q0
    /* renamed from: b */
    public final void mo17181b(AbstractC8861f0 f0Var, C8951o3 o3Var) {
        SentryAndroidOptions sentryAndroidOptions;
        C9111k.m16995a(f0Var, "Hub is required");
        if (o3Var instanceof SentryAndroidOptions) {
            sentryAndroidOptions = (SentryAndroidOptions) o3Var;
        } else {
            sentryAndroidOptions = null;
        }
        SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) C9111k.m16995a(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f19396l = sentryAndroidOptions2;
        boolean isEnableNdk = sentryAndroidOptions2.isEnableNdk();
        AbstractC8869g0 logger = this.f19396l.getLogger();
        EnumC8942n3 n3Var = EnumC8942n3.DEBUG;
        logger.mo17722c(n3Var, "NdkIntegration enabled: %s", Boolean.valueOf(isEnableNdk));
        if (!isEnableNdk || this.f19395k == null) {
            m18088g(this.f19396l);
        } else if (this.f19396l.getCacheDirPath() == null) {
            this.f19396l.getLogger().mo17722c(EnumC8942n3.ERROR, "No cache dir path is defined in options.", new Object[0]);
            m18088g(this.f19396l);
        } else {
            try {
                this.f19395k.getMethod("init", SentryAndroidOptions.class).invoke(null, this.f19396l);
                this.f19396l.getLogger().mo17722c(n3Var, "NdkIntegration installed.", new Object[0]);
            } catch (NoSuchMethodException e) {
                m18088g(this.f19396l);
                this.f19396l.getLogger().mo17723b(EnumC8942n3.ERROR, "Failed to invoke the SentryNdk.init method.", e);
            } catch (Throwable th2) {
                m18088g(this.f19396l);
                this.f19396l.getLogger().mo17723b(EnumC8942n3.ERROR, "Failed to initialize SentryNdk.", th2);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Class<?> cls;
        SentryAndroidOptions sentryAndroidOptions = this.f19396l;
        if (sentryAndroidOptions != null && sentryAndroidOptions.isEnableNdk() && (cls = this.f19395k) != null) {
            try {
                try {
                    cls.getMethod("close", new Class[0]).invoke(null, new Object[0]);
                    this.f19396l.getLogger().mo17722c(EnumC8942n3.DEBUG, "NdkIntegration removed.", new Object[0]);
                } catch (NoSuchMethodException e) {
                    this.f19396l.getLogger().mo17723b(EnumC8942n3.ERROR, "Failed to invoke the SentryNdk.close method.", e);
                }
                m18088g(this.f19396l);
            }
        }
    }
}
