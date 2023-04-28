package io.sentry.android.core;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.AbstractC8869g0;
import io.sentry.EnumC8942n3;
import io.sentry.android.core.internal.util.C8747e;
import io.sentry.protocol.C8983g;
import io.sentry.protocol.C9001p;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.android.core.g */
/* loaded from: classes8.dex */
public final class C8716g {

    /* renamed from: a */
    private FrameMetricsAggregator f19283a;

    /* renamed from: b */
    private final SentryAndroidOptions f19284b;

    /* renamed from: c */
    private final Map<C9001p, Map<String, C8983g>> f19285c;

    /* renamed from: d */
    private final Map<Activity, C8718b> f19286d;

    /* renamed from: e */
    private final C8778q0 f19287e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.android.core.g$b */
    /* loaded from: classes8.dex */
    public static final class C8718b {

        /* renamed from: a */
        private final int f19288a;

        /* renamed from: b */
        private final int f19289b;

        /* renamed from: c */
        private final int f19290c;

        private C8718b(int i, int i2, int i3) {
            this.f19288a = i;
            this.f19289b = i2;
            this.f19290c = i3;
        }
    }

    public C8716g(C8776p0 p0Var, SentryAndroidOptions sentryAndroidOptions, C8778q0 q0Var) {
        this.f19283a = null;
        this.f19285c = new ConcurrentHashMap();
        this.f19286d = new WeakHashMap();
        if (p0Var.m18114a("androidx.core.app.FrameMetricsAggregator", sentryAndroidOptions.getLogger())) {
            this.f19283a = new FrameMetricsAggregator();
        }
        this.f19284b = sentryAndroidOptions;
        this.f19287e = q0Var;
    }

    /* renamed from: f */
    private C8718b m18295f() {
        FrameMetricsAggregator frameMetricsAggregator;
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        if (!m18293h() || (frameMetricsAggregator = this.f19283a) == null) {
            return null;
        }
        SparseIntArray[] b = frameMetricsAggregator.m38647b();
        int i3 = 0;
        if (b == null || b.length <= 0 || (sparseIntArray = b[0]) == null) {
            i2 = 0;
            i = 0;
        } else {
            int i4 = 0;
            i2 = 0;
            i = 0;
            while (i3 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i3);
                int valueAt = sparseIntArray.valueAt(i3);
                i4 += valueAt;
                if (keyAt > 700) {
                    i += valueAt;
                } else if (keyAt > 16) {
                    i2 += valueAt;
                }
                i3++;
            }
            i3 = i4;
        }
        return new C8718b(i3, i2, i);
    }

    /* renamed from: g */
    private C8718b m18294g(Activity activity) {
        C8718b f;
        C8718b remove = this.f19286d.remove(activity);
        if (remove == null || (f = m18295f()) == null) {
            return null;
        }
        return new C8718b(f.f19288a - remove.f19288a, f.f19289b - remove.f19289b, f.f19290c - remove.f19290c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m18292i(Activity activity) {
        this.f19283a.m38648a(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m18291j(Runnable runnable, String str) {
        try {
            runnable.run();
        } catch (Throwable unused) {
            if (str != null) {
                AbstractC8869g0 logger = this.f19284b.getLogger();
                EnumC8942n3 n3Var = EnumC8942n3.WARNING;
                logger.mo17722c(n3Var, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m18290k(Activity activity) {
        this.f19283a.m38646c(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m18289l() {
        this.f19283a.m38644e();
    }

    /* renamed from: m */
    private void m18288m(final Runnable runnable, final String str) {
        try {
            if (C8747e.m18216a()) {
                runnable.run();
            } else {
                this.f19287e.m18098b(new Runnable() { // from class: io.sentry.android.core.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8716g.this.m18291j(runnable, str);
                    }
                });
            }
        } catch (Throwable unused) {
            if (str != null) {
                AbstractC8869g0 logger = this.f19284b.getLogger();
                EnumC8942n3 n3Var = EnumC8942n3.WARNING;
                logger.mo17722c(n3Var, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    /* renamed from: o */
    private void m18286o(Activity activity) {
        C8718b f = m18295f();
        if (f != null) {
            this.f19286d.put(activity, f);
        }
    }

    /* renamed from: e */
    public synchronized void m18296e(final Activity activity) {
        if (m18293h()) {
            m18288m(new Runnable() { // from class: io.sentry.android.core.c
                @Override // java.lang.Runnable
                public final void run() {
                    C8716g.this.m18292i(activity);
                }
            }, "FrameMetricsAggregator.add");
            m18286o(activity);
        }
    }

    /* renamed from: h */
    public boolean m18293h() {
        return this.f19283a != null && this.f19284b.isEnableFramesTracking();
    }

    /* renamed from: n */
    public synchronized void m18287n(final Activity activity, C9001p pVar) {
        if (m18293h()) {
            m18288m(new Runnable() { // from class: io.sentry.android.core.f
                @Override // java.lang.Runnable
                public final void run() {
                    C8716g.this.m18290k(activity);
                }
            }, null);
            C8718b g = m18294g(activity);
            if (!(g == null || (g.f19288a == 0 && g.f19289b == 0 && g.f19290c == 0))) {
                C8983g gVar = new C8983g(Integer.valueOf(g.f19288a), ViewProps.NONE);
                C8983g gVar2 = new C8983g(Integer.valueOf(g.f19289b), ViewProps.NONE);
                C8983g gVar3 = new C8983g(Integer.valueOf(g.f19290c), ViewProps.NONE);
                HashMap hashMap = new HashMap();
                hashMap.put("frames_total", gVar);
                hashMap.put("frames_slow", gVar2);
                hashMap.put("frames_frozen", gVar3);
                this.f19285c.put(pVar, hashMap);
            }
        }
    }

    /* renamed from: p */
    public synchronized void m18285p() {
        if (m18293h()) {
            m18288m(new Runnable() { // from class: io.sentry.android.core.d
                @Override // java.lang.Runnable
                public final void run() {
                    C8716g.this.m18289l();
                }
            }, "FrameMetricsAggregator.stop");
            this.f19283a.m38645d();
        }
        this.f19285c.clear();
    }

    /* renamed from: q */
    public synchronized Map<String, C8983g> m18284q(C9001p pVar) {
        if (!m18293h()) {
            return null;
        }
        Map<String, C8983g> map = this.f19285c.get(pVar);
        this.f19285c.remove(pVar);
        return map;
    }

    public C8716g(C8776p0 p0Var, SentryAndroidOptions sentryAndroidOptions) {
        this(p0Var, sentryAndroidOptions, new C8778q0());
    }
}
