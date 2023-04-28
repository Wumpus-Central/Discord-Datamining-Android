package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.AbstractC9053t;
import io.sentry.C8804b;
import io.sentry.C8908j3;
import io.sentry.C9046s;
import io.sentry.C9116v;
import io.sentry.EnumC8942n3;
import io.sentry.android.core.internal.util.C8750h;
import io.sentry.protocol.C9015w;
import io.sentry.util.C9105h;
import io.sentry.util.C9111k;
import java.io.Closeable;

/* renamed from: io.sentry.android.core.w0 */
/* loaded from: classes8.dex */
public final class C8793w0 implements AbstractC9053t, Application.ActivityLifecycleCallbacks, Closeable {

    /* renamed from: k */
    private final Application f19434k;

    /* renamed from: l */
    private final SentryAndroidOptions f19435l;

    /* renamed from: m */
    private final C8715f0 f19436m;

    /* renamed from: n */
    private boolean f19437n = true;

    public C8793w0(Application application, SentryAndroidOptions sentryAndroidOptions, C8715f0 f0Var) {
        this.f19434k = (Application) C9111k.m16995a(application, "Application is required");
        this.f19435l = (SentryAndroidOptions) C9111k.m16995a(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f19436m = (C8715f0) C9111k.m16995a(f0Var, "BuildInfoProvider is required");
        application.registerActivityLifecycleCallbacks(this);
    }

    /* renamed from: h */
    private void m18065h(Activity activity) {
        if (C8723i0.m18272c().m18273b() == activity) {
            C8723i0.m18272c().m18274a();
        }
    }

    /* renamed from: i */
    private void m18064i(Activity activity) {
        C8723i0.m18272c().m18271d(activity);
    }

    @Override // io.sentry.AbstractC9053t
    /* renamed from: b */
    public C8908j3 mo17164b(C8908j3 j3Var, C9116v vVar) {
        if (this.f19437n && j3Var.m17732t0()) {
            if (!this.f19435l.isAttachScreenshot()) {
                this.f19434k.unregisterActivityLifecycleCallbacks(this);
                this.f19437n = false;
                this.f19435l.getLogger().mo17722c(EnumC8942n3.DEBUG, "attachScreenshot is disabled, ScreenshotEventProcessor isn't installed.", new Object[0]);
                return j3Var;
            }
            Activity b = C8723i0.m18272c().m18273b();
            if (b != null && !C9105h.m17011h(vVar)) {
                byte[] b2 = C8750h.m18205b(b, this.f19435l.getLogger(), this.f19436m);
                if (b2 == null) {
                    return j3Var;
                }
                vVar.m16972i(C8804b.m18049a(b2));
                vVar.m16973h("android:activity", b);
            }
        }
        return j3Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f19435l.isAttachScreenshot()) {
            this.f19434k.unregisterActivityLifecycleCallbacks(this);
            C8723i0.m18272c().m18274a();
        }
    }

    @Override // io.sentry.AbstractC9053t
    /* renamed from: g */
    public /* synthetic */ C9015w mo17163g(C9015w wVar, C9116v vVar) {
        return C9046s.m17167a(this, wVar, vVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C8723i0.m18272c().m18271d(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        m18065h(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        m18065h(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        m18064i(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m18064i(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m18065h(activity);
    }
}
