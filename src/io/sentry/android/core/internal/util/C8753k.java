package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.FrameMetrics;
import android.view.Window;
import io.sentry.C8951o3;
import io.sentry.EnumC8942n3;
import io.sentry.android.core.C8715f0;
import io.sentry.util.C9111k;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* renamed from: io.sentry.android.core.internal.util.k */
/* loaded from: classes8.dex */
public final class C8753k implements Application.ActivityLifecycleCallbacks {

    /* renamed from: k */
    private final C8715f0 f19339k;

    /* renamed from: l */
    private final Set<Window> f19340l;

    /* renamed from: m */
    private final C8951o3 f19341m;

    /* renamed from: n */
    private Handler f19342n;

    /* renamed from: o */
    private WeakReference<Window> f19343o;

    /* renamed from: p */
    private final HashMap<String, AbstractC8755b> f19344p;

    /* renamed from: q */
    private boolean f19345q;

    /* renamed from: r */
    private final AbstractC8756c f19346r;

    /* renamed from: s */
    private Window.OnFrameMetricsAvailableListener f19347s;

    /* renamed from: io.sentry.android.core.internal.util.k$a */
    /* loaded from: classes8.dex */
    class C8754a implements AbstractC8756c {
        C8754a() {
        }

        @Override // io.sentry.android.core.internal.util.C8753k.AbstractC8756c
        /* renamed from: a */
        public /* synthetic */ void mo18195a(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, Handler handler) {
            C8757l.m18193a(this, window, onFrameMetricsAvailableListener, handler);
        }

        @Override // io.sentry.android.core.internal.util.C8753k.AbstractC8756c
        /* renamed from: b */
        public /* synthetic */ void mo18194b(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
            C8757l.m18192b(this, window, onFrameMetricsAvailableListener);
        }
    }

    /* renamed from: io.sentry.android.core.internal.util.k$b */
    /* loaded from: classes8.dex */
    public interface AbstractC8755b {
        /* renamed from: a */
        void mo18067a(FrameMetrics frameMetrics, float f);
    }

    /* renamed from: io.sentry.android.core.internal.util.k$c */
    /* loaded from: classes8.dex */
    public interface AbstractC8756c {
        /* renamed from: a */
        void mo18195a(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, Handler handler);

        /* renamed from: b */
        void mo18194b(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener);
    }

    @SuppressLint({"NewApi"})
    public C8753k(Context context, C8951o3 o3Var, C8715f0 f0Var) {
        this(context, o3Var, f0Var, new C8754a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m18202c(C8951o3 o3Var, Thread thread, Throwable th2) {
        o3Var.getLogger().mo17723b(EnumC8942n3.ERROR, "Error during frames measurements.", th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m18201d(C8715f0 f0Var, Window window, FrameMetrics frameMetrics, int i) {
        float f;
        Display display;
        if (f0Var.m18303d() >= 30) {
            display = window.getContext().getDisplay();
            f = display.getRefreshRate();
        } else {
            f = window.getWindowManager().getDefaultDisplay().getRefreshRate();
        }
        for (AbstractC8755b bVar : this.f19344p.values()) {
            bVar.mo18067a(frameMetrics, f);
        }
    }

    /* renamed from: e */
    private void m18200e(Window window) {
        WeakReference<Window> weakReference = this.f19343o;
        if (weakReference == null || weakReference.get() != window) {
            this.f19343o = new WeakReference<>(window);
            m18196i();
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: h */
    private void m18197h(Window window) {
        if (this.f19340l.contains(window)) {
            if (this.f19339k.m18303d() >= 24) {
                try {
                    this.f19346r.mo18194b(window, this.f19347s);
                } catch (Exception e) {
                    this.f19341m.getLogger().mo17723b(EnumC8942n3.ERROR, "Failed to remove frameMetricsAvailableListener", e);
                }
            }
            this.f19340l.remove(window);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: i */
    private void m18196i() {
        Window window;
        WeakReference<Window> weakReference = this.f19343o;
        if (weakReference != null) {
            window = weakReference.get();
        } else {
            window = null;
        }
        if (window != null && this.f19345q && !this.f19340l.contains(window) && !this.f19344p.isEmpty() && this.f19339k.m18303d() >= 24 && this.f19342n != null) {
            this.f19340l.add(window);
            this.f19346r.mo18195a(window, this.f19347s, this.f19342n);
        }
    }

    /* renamed from: f */
    public String m18199f(AbstractC8755b bVar) {
        if (!this.f19345q) {
            return null;
        }
        String uuid = UUID.randomUUID().toString();
        this.f19344p.put(uuid, bVar);
        m18196i();
        return uuid;
    }

    /* renamed from: g */
    public void m18198g(String str) {
        Window window;
        if (this.f19345q) {
            if (str != null) {
                this.f19344p.remove(str);
            }
            WeakReference<Window> weakReference = this.f19343o;
            if (weakReference != null) {
                window = weakReference.get();
            } else {
                window = null;
            }
            if (window != null && this.f19344p.isEmpty()) {
                m18197h(window);
            }
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
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m18200e(activity.getWindow());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m18197h(activity.getWindow());
        WeakReference<Window> weakReference = this.f19343o;
        if (weakReference != null && weakReference.get() == activity.getWindow()) {
            this.f19343o = null;
        }
    }

    @SuppressLint({"NewApi"})
    public C8753k(Context context, final C8951o3 o3Var, final C8715f0 f0Var, AbstractC8756c cVar) {
        this.f19340l = new HashSet();
        this.f19344p = new HashMap<>();
        this.f19345q = false;
        C9111k.m16995a(context, "The context is required");
        this.f19341m = (C8951o3) C9111k.m16995a(o3Var, "SentryOptions is required");
        this.f19339k = (C8715f0) C9111k.m16995a(f0Var, "BuildInfoProvider is required");
        this.f19346r = (AbstractC8756c) C9111k.m16995a(cVar, "WindowFrameMetricsManager is required");
        if ((context instanceof Application) && f0Var.m18303d() >= 24) {
            this.f19345q = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.i
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th2) {
                    C8753k.m18202c(C8951o3.this, thread, th2);
                }
            });
            handlerThread.start();
            this.f19342n = new Handler(handlerThread.getLooper());
            ((Application) context).registerActivityLifecycleCallbacks(this);
            this.f19347s = new Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.j
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                    C8753k.this.m18201d(f0Var, window, frameMetrics, i);
                }
            };
        }
    }
}
