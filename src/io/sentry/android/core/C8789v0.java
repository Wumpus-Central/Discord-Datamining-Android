package io.sentry.android.core;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import io.sentry.AbstractC8861f0;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9023q0;
import io.sentry.C8843d;
import io.sentry.C8951o3;
import io.sentry.EnumC8942n3;
import io.sentry.android.core.internal.util.C8748f;
import io.sentry.util.C9111k;
import java.io.Closeable;

/* renamed from: io.sentry.android.core.v0 */
/* loaded from: classes8.dex */
public final class C8789v0 implements AbstractC9023q0, Closeable {

    /* renamed from: k */
    private final Context f19426k;

    /* renamed from: l */
    private SentryAndroidOptions f19427l;

    /* renamed from: m */
    C8790a f19428m;

    /* renamed from: n */
    private TelephonyManager f19429n;

    /* renamed from: io.sentry.android.core.v0$a */
    /* loaded from: classes8.dex */
    static final class C8790a extends PhoneStateListener {

        /* renamed from: a */
        private final AbstractC8861f0 f19430a;

        C8790a(AbstractC8861f0 f0Var) {
            this.f19430a = f0Var;
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            if (i == 1) {
                C8843d dVar = new C8843d();
                dVar.m17905p("system");
                dVar.m17909l("device.event");
                dVar.m17908m("action", "CALL_STATE_RINGING");
                dVar.m17906o("Device ringing");
                dVar.m17907n(EnumC8942n3.INFO);
                this.f19430a.mo17833e(dVar);
            }
        }
    }

    public C8789v0(Context context) {
        this.f19426k = (Context) C9111k.m16995a(context, "Context is required");
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
        SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) C9111k.m16995a(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f19427l = sentryAndroidOptions2;
        AbstractC8869g0 logger = sentryAndroidOptions2.getLogger();
        EnumC8942n3 n3Var = EnumC8942n3.DEBUG;
        logger.mo17722c(n3Var, "enableSystemEventBreadcrumbs enabled: %s", Boolean.valueOf(this.f19427l.isEnableSystemEventBreadcrumbs()));
        if (this.f19427l.isEnableSystemEventBreadcrumbs() && C8748f.m18212a(this.f19426k, "android.permission.READ_PHONE_STATE")) {
            TelephonyManager telephonyManager = (TelephonyManager) this.f19426k.getSystemService("phone");
            this.f19429n = telephonyManager;
            if (telephonyManager != null) {
                try {
                    C8790a aVar = new C8790a(f0Var);
                    this.f19428m = aVar;
                    this.f19429n.listen(aVar, 32);
                    o3Var.getLogger().mo17722c(n3Var, "PhoneStateBreadcrumbsIntegration installed.", new Object[0]);
                } catch (Throwable th2) {
                    this.f19427l.getLogger().mo17724a(EnumC8942n3.INFO, th2, "TelephonyManager is not available or ready to use.", new Object[0]);
                }
            } else {
                this.f19427l.getLogger().mo17722c(EnumC8942n3.INFO, "TelephonyManager is not available", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C8790a aVar;
        TelephonyManager telephonyManager = this.f19429n;
        if (telephonyManager != null && (aVar = this.f19428m) != null) {
            telephonyManager.listen(aVar, 0);
            this.f19428m = null;
            SentryAndroidOptions sentryAndroidOptions = this.f19427l;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo17722c(EnumC8942n3.DEBUG, "PhoneStateBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }
}
