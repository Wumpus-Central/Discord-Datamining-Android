package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import io.sentry.AbstractC8861f0;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9023q0;
import io.sentry.C8951o3;
import io.sentry.EnumC8942n3;
import io.sentry.android.core.internal.gestures.C8733h;
import io.sentry.android.core.internal.gestures.GestureDetector$OnGestureListenerC8730g;
import io.sentry.android.core.internal.gestures.Window$CallbackC8724a;
import io.sentry.util.C9111k;
import java.io.Closeable;

/* renamed from: io.sentry.android.core.e1 */
/* loaded from: classes8.dex */
public final class C8713e1 implements AbstractC9023q0, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: k */
    private final Application f19275k;

    /* renamed from: l */
    private AbstractC8861f0 f19276l;

    /* renamed from: m */
    private SentryAndroidOptions f19277m;

    /* renamed from: n */
    private final boolean f19278n;

    /* renamed from: o */
    private final boolean f19279o;

    public C8713e1(Application application, C8776p0 p0Var) {
        this.f19275k = (Application) C9111k.m16995a(application, "Application is required");
        this.f19278n = p0Var.m18113b("androidx.core.view.GestureDetectorCompat", this.f19277m);
        this.f19279o = p0Var.m18113b("androidx.core.view.ScrollingView", this.f19277m);
    }

    /* renamed from: g */
    private void m18308g(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f19277m;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo17722c(EnumC8942n3.INFO, "Window was null in startTracking", new Object[0]);
            }
        } else if (this.f19276l != null && this.f19277m != null) {
            Window.Callback callback = window.getCallback();
            if (callback == null) {
                callback = new Window$CallbackC8724a();
            }
            window.setCallback(new C8733h(callback, activity, new GestureDetector$OnGestureListenerC8730g(activity, this.f19276l, this.f19277m, this.f19279o), this.f19277m));
        }
    }

    /* renamed from: h */
    private void m18307h(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f19277m;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo17722c(EnumC8942n3.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C8733h) {
            C8733h hVar = (C8733h) callback;
            hVar.m18238c();
            if (hVar.m18240a() instanceof Window$CallbackC8724a) {
                window.setCallback(null);
            } else {
                window.setCallback(hVar.m18240a());
            }
        }
    }

    @Override // io.sentry.AbstractC9023q0
    /* renamed from: b */
    public void mo17181b(AbstractC8861f0 f0Var, C8951o3 o3Var) {
        SentryAndroidOptions sentryAndroidOptions;
        if (o3Var instanceof SentryAndroidOptions) {
            sentryAndroidOptions = (SentryAndroidOptions) o3Var;
        } else {
            sentryAndroidOptions = null;
        }
        this.f19277m = (SentryAndroidOptions) C9111k.m16995a(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f19276l = (AbstractC8861f0) C9111k.m16995a(f0Var, "Hub is required");
        AbstractC8869g0 logger = this.f19277m.getLogger();
        EnumC8942n3 n3Var = EnumC8942n3.DEBUG;
        logger.mo17722c(n3Var, "UserInteractionIntegration enabled: %s", Boolean.valueOf(this.f19277m.isEnableUserInteractionBreadcrumbs()));
        if (!this.f19277m.isEnableUserInteractionBreadcrumbs()) {
            return;
        }
        if (this.f19278n) {
            this.f19275k.registerActivityLifecycleCallbacks(this);
            this.f19277m.getLogger().mo17722c(n3Var, "UserInteractionIntegration installed.", new Object[0]);
            return;
        }
        o3Var.getLogger().mo17722c(EnumC8942n3.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f19275k.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f19277m;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo17722c(EnumC8942n3.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        m18307h(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        m18308g(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
