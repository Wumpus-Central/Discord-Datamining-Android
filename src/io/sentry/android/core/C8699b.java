package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import io.sentry.AbstractC8869g0;
import io.sentry.EnumC8942n3;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.sentry.android.core.b */
/* loaded from: classes8.dex */
final class C8699b extends Thread {

    /* renamed from: k */
    private final boolean f19236k;

    /* renamed from: l */
    private final AbstractC8700a f19237l;

    /* renamed from: m */
    private final C8778q0 f19238m;

    /* renamed from: n */
    private final long f19239n;

    /* renamed from: o */
    private final AbstractC8869g0 f19240o;

    /* renamed from: p */
    private final AtomicLong f19241p;

    /* renamed from: q */
    private final AtomicBoolean f19242q;

    /* renamed from: r */
    private final Context f19243r;

    /* renamed from: s */
    private final Runnable f19244s;

    /* renamed from: io.sentry.android.core.b$a */
    /* loaded from: classes8.dex */
    public interface AbstractC8700a {
        /* renamed from: a */
        void mo18063a(C8712e0 e0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8699b(long j, boolean z, AbstractC8700a aVar, AbstractC8869g0 g0Var, Context context) {
        this(j, z, aVar, g0Var, new C8778q0(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m18336b() {
        this.f19241p.set(0L);
        this.f19242q.set(false);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        boolean z;
        List<ActivityManager.ProcessErrorStateInfo> list;
        boolean z2;
        setName("|ANR-WatchDog|");
        long j = this.f19239n;
        while (!isInterrupted()) {
            if (this.f19241p.get() == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f19241p.addAndGet(j);
            if (z) {
                this.f19238m.m18098b(this.f19244s);
            }
            try {
                Thread.sleep(j);
                if (this.f19241p.get() != 0 && !this.f19242q.get()) {
                    if (this.f19236k || (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger())) {
                        ActivityManager activityManager = (ActivityManager) this.f19243r.getSystemService("activity");
                        if (activityManager != null) {
                            try {
                                list = activityManager.getProcessesInErrorState();
                            } catch (Throwable th2) {
                                this.f19240o.mo17723b(EnumC8942n3.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th2);
                                list = null;
                            }
                            if (list != null) {
                                Iterator<ActivityManager.ProcessErrorStateInfo> it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (it.next().condition == 2) {
                                            z2 = true;
                                            break;
                                        }
                                    } else {
                                        z2 = false;
                                        break;
                                    }
                                }
                                if (!z2) {
                                }
                            }
                        }
                        this.f19240o.mo17722c(EnumC8942n3.INFO, "Raising ANR", new Object[0]);
                        this.f19237l.mo18063a(new C8712e0("Application Not Responding for at least " + this.f19239n + " ms.", this.f19238m.m18099a()));
                        j = this.f19239n;
                        this.f19242q.set(true);
                    } else {
                        this.f19240o.mo17722c(EnumC8942n3.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.f19242q.set(true);
                    }
                }
            } catch (InterruptedException e) {
                try {
                    Thread.currentThread().interrupt();
                    this.f19240o.mo17722c(EnumC8942n3.WARNING, "Interrupted: %s", e.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.f19240o.mo17722c(EnumC8942n3.WARNING, "Failed to interrupt due to SecurityException: %s", e.getMessage());
                    return;
                }
            }
        }
    }

    C8699b(long j, boolean z, AbstractC8700a aVar, AbstractC8869g0 g0Var, C8778q0 q0Var, Context context) {
        this.f19241p = new AtomicLong(0L);
        this.f19242q = new AtomicBoolean(false);
        this.f19244s = new Runnable() { // from class: io.sentry.android.core.a
            @Override // java.lang.Runnable
            public final void run() {
                C8699b.this.m18336b();
            }
        };
        this.f19236k = z;
        this.f19237l = aVar;
        this.f19239n = j;
        this.f19240o = g0Var;
        this.f19238m = q0Var;
        this.f19243r = context;
    }
}
