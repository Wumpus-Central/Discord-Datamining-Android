package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.AbstractC8861f0;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9023q0;
import io.sentry.C8843d;
import io.sentry.C8951o3;
import io.sentry.C9116v;
import io.sentry.EnumC8942n3;
import io.sentry.android.core.internal.util.C8746d;
import io.sentry.protocol.C8977e;
import io.sentry.util.C9111k;
import java.io.Closeable;
import java.util.Locale;

/* renamed from: io.sentry.android.core.z */
/* loaded from: classes8.dex */
public final class ComponentCallbacks2C8798z implements AbstractC9023q0, Closeable, ComponentCallbacks2 {

    /* renamed from: k */
    private final Context f19449k;

    /* renamed from: l */
    private AbstractC8861f0 f19450l;

    /* renamed from: m */
    private SentryAndroidOptions f19451m;

    public ComponentCallbacks2C8798z(Context context) {
        this.f19449k = (Context) C9111k.m16995a(context, "Context is required");
    }

    /* renamed from: g */
    private void m18056g(Integer num) {
        if (this.f19450l != null) {
            C8843d dVar = new C8843d();
            if (num != null) {
                if (num.intValue() >= 40) {
                    dVar.m17908m("level", num);
                } else {
                    return;
                }
            }
            dVar.m17905p("system");
            dVar.m17909l("device.event");
            dVar.m17906o("Low memory");
            dVar.m17908m("action", "LOW_MEMORY");
            dVar.m17907n(EnumC8942n3.WARNING);
            this.f19450l.mo17833e(dVar);
        }
    }

    @Override // io.sentry.AbstractC9023q0
    /* renamed from: b */
    public void mo17181b(AbstractC8861f0 f0Var, C8951o3 o3Var) {
        SentryAndroidOptions sentryAndroidOptions;
        this.f19450l = (AbstractC8861f0) C9111k.m16995a(f0Var, "Hub is required");
        if (o3Var instanceof SentryAndroidOptions) {
            sentryAndroidOptions = (SentryAndroidOptions) o3Var;
        } else {
            sentryAndroidOptions = null;
        }
        SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) C9111k.m16995a(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f19451m = sentryAndroidOptions2;
        AbstractC8869g0 logger = sentryAndroidOptions2.getLogger();
        EnumC8942n3 n3Var = EnumC8942n3.DEBUG;
        logger.mo17722c(n3Var, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f19451m.isEnableAppComponentBreadcrumbs()));
        if (this.f19451m.isEnableAppComponentBreadcrumbs()) {
            try {
                this.f19449k.registerComponentCallbacks(this);
                o3Var.getLogger().mo17722c(n3Var, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
            } catch (Throwable th2) {
                this.f19451m.setEnableAppComponentBreadcrumbs(false);
                o3Var.getLogger().mo17724a(EnumC8942n3.INFO, th2, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f19449k.unregisterComponentCallbacks(this);
        } catch (Throwable th2) {
            SentryAndroidOptions sentryAndroidOptions = this.f19451m;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo17724a(EnumC8942n3.DEBUG, th2, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.f19451m;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().mo17722c(EnumC8942n3.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        String str;
        if (this.f19450l != null) {
            C8977e.EnumC8979b a = C8746d.m18217a(this.f19449k.getResources().getConfiguration().orientation);
            if (a != null) {
                str = a.name().toLowerCase(Locale.ROOT);
            } else {
                str = "undefined";
            }
            C8843d dVar = new C8843d();
            dVar.m17905p("navigation");
            dVar.m17909l("device.orientation");
            dVar.m17908m(ViewProps.POSITION, str);
            dVar.m17907n(EnumC8942n3.INFO);
            C9116v vVar = new C9116v();
            vVar.m16973h("android:configuration", configuration);
            this.f19450l.mo17830h(dVar, vVar);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        m18056g(null);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        m18056g(Integer.valueOf(i));
    }
}
