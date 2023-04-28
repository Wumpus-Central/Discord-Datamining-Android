package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import android.view.FrameMetrics;
import io.sentry.AbstractC8861f0;
import io.sentry.AbstractC8932m0;
import io.sentry.AbstractC8939n0;
import io.sentry.C8805b0;
import io.sentry.C9025q2;
import io.sentry.C9137w1;
import io.sentry.C9147x1;
import io.sentry.EnumC8942n3;
import io.sentry.android.core.internal.util.C8745c;
import io.sentry.android.core.internal.util.C8753k;
import io.sentry.exception.C8859b;
import io.sentry.profilemeasurements.C8966a;
import io.sentry.profilemeasurements.C8967b;
import io.sentry.util.C9111k;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.android.core.v */
/* loaded from: classes8.dex */
public final class C8787v implements AbstractC8939n0 {

    /* renamed from: a */
    private int f19403a;

    /* renamed from: b */
    private File f19404b;

    /* renamed from: c */
    private File f19405c;

    /* renamed from: d */
    private Future<?> f19406d;

    /* renamed from: e */
    private final Context f19407e;

    /* renamed from: f */
    private final SentryAndroidOptions f19408f;

    /* renamed from: g */
    private final AbstractC8861f0 f19409g;

    /* renamed from: h */
    private final C8715f0 f19410h;

    /* renamed from: i */
    private long f19411i;

    /* renamed from: j */
    private long f19412j;

    /* renamed from: k */
    private boolean f19413k;

    /* renamed from: l */
    private int f19414l;

    /* renamed from: m */
    private String f19415m;

    /* renamed from: n */
    private final C8753k f19416n;

    /* renamed from: o */
    private final Map<String, C9147x1> f19417o;

    /* renamed from: p */
    private final ArrayDeque<C8967b> f19418p;

    /* renamed from: q */
    private final ArrayDeque<C8967b> f19419q;

    /* renamed from: r */
    private final ArrayDeque<C8967b> f19420r;

    /* renamed from: s */
    private final Map<String, C8966a> f19421s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.sentry.android.core.v$a */
    /* loaded from: classes8.dex */
    public class C8788a implements C8753k.AbstractC8755b {

        /* renamed from: a */
        final long f19422a = TimeUnit.SECONDS.toNanos(1);

        /* renamed from: b */
        final long f19423b = TimeUnit.MILLISECONDS.toNanos(700);

        /* renamed from: c */
        float f19424c = 0.0f;

        C8788a() {
        }

        @Override // io.sentry.android.core.internal.util.C8753k.AbstractC8755b
        /* renamed from: a */
        public void mo18067a(FrameMetrics frameMetrics, float f) {
            long metric;
            boolean z;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - C8787v.this.f19411i;
            if (elapsedRealtimeNanos >= 0) {
                metric = frameMetrics.getMetric(8);
                if (((float) metric) > ((float) this.f19422a) / (f - 1.0f)) {
                    z = true;
                } else {
                    z = false;
                }
                float f2 = ((int) (f * 100.0f)) / 100.0f;
                if (metric > this.f19423b) {
                    C8787v.this.f19420r.addLast(new C8967b(Long.valueOf(elapsedRealtimeNanos), Long.valueOf(metric)));
                } else if (z) {
                    C8787v.this.f19419q.addLast(new C8967b(Long.valueOf(elapsedRealtimeNanos), Long.valueOf(metric)));
                }
                if (f2 != this.f19424c) {
                    this.f19424c = f2;
                    C8787v.this.f19418p.addLast(new C8967b(Long.valueOf(elapsedRealtimeNanos), Float.valueOf(f2)));
                }
            }
        }
    }

    public C8787v(Context context, SentryAndroidOptions sentryAndroidOptions, C8715f0 f0Var, C8753k kVar) {
        this(context, sentryAndroidOptions, f0Var, kVar, C8805b0.m18042a());
    }

    /* renamed from: k */
    private ActivityManager.MemoryInfo m18077k() {
        try {
            ActivityManager activityManager = (ActivityManager) this.f19407e.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            this.f19408f.getLogger().mo17722c(EnumC8942n3.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th2) {
            this.f19408f.getLogger().mo17723b(EnumC8942n3.ERROR, "Error getting MemoryInfo.", th2);
            return null;
        }
    }

    /* renamed from: l */
    private void m18076l() {
        if (!this.f19413k) {
            this.f19413k = true;
            String profilingTracesDirPath = this.f19408f.getProfilingTracesDirPath();
            if (!this.f19408f.isProfilingEnabled()) {
                this.f19408f.getLogger().mo17722c(EnumC8942n3.INFO, "Profiling is disabled in options.", new Object[0]);
            } else if (profilingTracesDirPath == null) {
                this.f19408f.getLogger().mo17722c(EnumC8942n3.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            } else {
                int profilingTracesHz = this.f19408f.getProfilingTracesHz();
                if (profilingTracesHz <= 0) {
                    this.f19408f.getLogger().mo17722c(EnumC8942n3.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(profilingTracesHz));
                    return;
                }
                this.f19403a = ((int) TimeUnit.SECONDS.toMicros(1L)) / profilingTracesHz;
                this.f19405c = new File(profilingTracesDirPath);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m18075m(AbstractC8932m0 m0Var) {
        m18069s(m0Var, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ List m18074n() {
        return C8745c.m18220a().m18218c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m18073o(AbstractC8932m0 m0Var) {
        m18069s(m0Var, false);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: q */
    private void m18071q(final AbstractC8932m0 m0Var) {
        File file = this.f19405c;
        this.f19404b = new File(file, UUID.randomUUID() + ".trace");
        this.f19421s.clear();
        this.f19418p.clear();
        this.f19419q.clear();
        this.f19420r.clear();
        this.f19415m = this.f19416n.m18199f(new C8788a());
        this.f19406d = this.f19408f.getExecutorService().mo17612b(new Runnable() { // from class: io.sentry.android.core.t
            @Override // java.lang.Runnable
            public final void run() {
                C8787v.this.m18075m(m0Var);
            }
        }, 30000L);
        this.f19411i = SystemClock.elapsedRealtimeNanos();
        this.f19412j = Process.getElapsedCpuTime();
        this.f19417o.put(m0Var.mo16838f().toString(), new C9147x1(m0Var, Long.valueOf(this.f19411i), Long.valueOf(this.f19412j)));
        Debug.startMethodTracingSampling(this.f19404b.getPath(), 3000000, this.f19403a);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: r */
    private void m18070r(AbstractC8932m0 m0Var, boolean z) {
        String str;
        String str2;
        String str3;
        Debug.stopMethodTracing();
        this.f19416n.m18198g(this.f19415m);
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        long j = elapsedRealtimeNanos - this.f19411i;
        ArrayList<C9147x1> arrayList = new ArrayList(this.f19417o.values());
        this.f19417o.clear();
        this.f19414l = 0;
        Future<?> future = this.f19406d;
        if (future != null) {
            future.cancel(true);
            this.f19406d = null;
        }
        if (this.f19404b == null) {
            this.f19408f.getLogger().mo17722c(EnumC8942n3.ERROR, "Trace file does not exists", new Object[0]);
            return;
        }
        ActivityManager.MemoryInfo k = m18077k();
        if (k != null) {
            str = Long.toString(k.totalMem);
        } else {
            str = "0";
        }
        String[] strArr = Build.SUPPORTED_ABIS;
        for (C9147x1 x1Var : arrayList) {
            x1Var.m16791h(Long.valueOf(elapsedRealtimeNanos), Long.valueOf(this.f19411i), Long.valueOf(elapsedCpuTime), Long.valueOf(this.f19412j));
            elapsedRealtimeNanos = elapsedRealtimeNanos;
        }
        if (!this.f19419q.isEmpty()) {
            this.f19421s.put("slow_frame_renders", new C8966a("nanosecond", this.f19419q));
        }
        if (!this.f19420r.isEmpty()) {
            this.f19421s.put("frozen_frame_renders", new C8966a("nanosecond", this.f19420r));
        }
        if (!this.f19418p.isEmpty()) {
            this.f19421s.put("screen_frame_rates", new C8966a("hz", this.f19418p));
        }
        File file = this.f19404b;
        String l = Long.toString(j);
        int d = this.f19410h.m18303d();
        if (strArr == null || strArr.length <= 0) {
            str2 = "";
        } else {
            str2 = strArr[0];
        }
        Callable uVar = new Callable() { // from class: io.sentry.android.core.u
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List n;
                n = C8787v.m18074n();
                return n;
            }
        };
        String b = this.f19410h.m18305b();
        String c = this.f19410h.m18304c();
        String e = this.f19410h.m18302e();
        Boolean f = this.f19410h.m18301f();
        String proguardUuid = this.f19408f.getProguardUuid();
        String release = this.f19408f.getRelease();
        String environment = this.f19408f.getEnvironment();
        if (z) {
            str3 = "timeout";
        } else {
            str3 = "normal";
        }
        try {
            this.f19409g.mo17822p(C9025q2.m17208a(this.f19408f.getSerializer(), new C9137w1(file, arrayList, m0Var, l, d, str2, uVar, b, c, e, f, str, proguardUuid, release, environment, str3, this.f19421s), this.f19408f.getMaxTraceFileSize(), this.f19408f.getSdkVersion()));
        } catch (C8859b e2) {
            this.f19408f.getLogger().mo17723b(EnumC8942n3.ERROR, "Failed to capture profile.", e2);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: s */
    private void m18069s(AbstractC8932m0 m0Var, boolean z) {
        if (this.f19410h.m18303d() >= 21) {
            if (!this.f19417o.containsKey(m0Var.mo16838f().toString())) {
                this.f19408f.getLogger().mo17722c(EnumC8942n3.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", m0Var.getName(), m0Var.mo16831m().m17987j().toString());
                return;
            }
            int i = this.f19414l;
            if (i > 0) {
                this.f19414l = i - 1;
            }
            this.f19408f.getLogger().mo17722c(EnumC8942n3.DEBUG, "Transaction %s (%s) finished. Transactions to be profiled: %d", m0Var.getName(), m0Var.mo16831m().m17987j().toString(), Integer.valueOf(this.f19414l));
            if (this.f19414l == 0 || z) {
                m18070r(m0Var, z);
                return;
            }
            C9147x1 x1Var = this.f19417o.get(m0Var.mo16838f().toString());
            if (x1Var != null) {
                x1Var.m16791h(Long.valueOf(SystemClock.elapsedRealtimeNanos()), Long.valueOf(this.f19411i), Long.valueOf(Process.getElapsedCpuTime()), Long.valueOf(this.f19412j));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    /* renamed from: t */
    public void m18072p(AbstractC8932m0 m0Var) {
        if (this.f19410h.m18303d() >= 21) {
            m18076l();
            File file = this.f19405c;
            if (file != null && this.f19403a != 0 && file.canWrite()) {
                int i = this.f19414l + 1;
                this.f19414l = i;
                if (i == 1) {
                    m18071q(m0Var);
                } else {
                    this.f19417o.put(m0Var.mo16838f().toString(), new C9147x1(m0Var, Long.valueOf(SystemClock.elapsedRealtimeNanos()), Long.valueOf(Process.getElapsedCpuTime())));
                }
                this.f19408f.getLogger().mo17722c(EnumC8942n3.DEBUG, "Transaction %s (%s) started. Transactions being profiled: %d", m0Var.getName(), m0Var.mo16831m().m17987j().toString(), Integer.valueOf(this.f19414l));
            }
        }
    }

    @Override // io.sentry.AbstractC8939n0
    /* renamed from: a */
    public synchronized void mo17553a(final AbstractC8932m0 m0Var) {
        this.f19408f.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.r
            @Override // java.lang.Runnable
            public final void run() {
                C8787v.this.m18072p(m0Var);
            }
        });
    }

    @Override // io.sentry.AbstractC8939n0
    /* renamed from: b */
    public synchronized void mo17552b(final AbstractC8932m0 m0Var) {
        this.f19408f.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.s
            @Override // java.lang.Runnable
            public final void run() {
                C8787v.this.m18073o(m0Var);
            }
        });
    }

    public C8787v(Context context, SentryAndroidOptions sentryAndroidOptions, C8715f0 f0Var, C8753k kVar, AbstractC8861f0 f0Var2) {
        this.f19404b = null;
        this.f19405c = null;
        this.f19406d = null;
        this.f19411i = 0L;
        this.f19412j = 0L;
        this.f19413k = false;
        this.f19414l = 0;
        this.f19417o = new HashMap();
        this.f19418p = new ArrayDeque<>();
        this.f19419q = new ArrayDeque<>();
        this.f19420r = new ArrayDeque<>();
        this.f19421s = new HashMap();
        this.f19407e = (Context) C9111k.m16995a(context, "The application context is required");
        this.f19408f = (SentryAndroidOptions) C9111k.m16995a(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f19409g = (AbstractC8861f0) C9111k.m16995a(f0Var2, "Hub is required");
        this.f19416n = (C8753k) C9111k.m16995a(kVar, "SentryFrameMetricsCollector is required");
        this.f19410h = (C8715f0) C9111k.m16995a(f0Var, "The BuildInfoProvider is required.");
    }
}
