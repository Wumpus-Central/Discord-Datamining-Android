package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p380v5.C13434e;
import p396w5.C13749a;

/* renamed from: com.facebook.imagepipeline.producers.y */
/* loaded from: classes7.dex */
public class C5049y {

    /* renamed from: a */
    private final Executor f8662a;

    /* renamed from: b */
    private final AbstractC5053d f8663b;

    /* renamed from: e */
    private final int f8666e;

    /* renamed from: c */
    private final Runnable f8664c = new RunnableC5050a();

    /* renamed from: d */
    private final Runnable f8665d = new RunnableC5051b();

    /* renamed from: f */
    C13434e f8667f = null;

    /* renamed from: g */
    int f8668g = 0;

    /* renamed from: h */
    EnumC5055f f8669h = EnumC5055f.IDLE;

    /* renamed from: i */
    long f8670i = 0;

    /* renamed from: j */
    long f8671j = 0;

    /* renamed from: com.facebook.imagepipeline.producers.y$a */
    /* loaded from: classes7.dex */
    class RunnableC5050a implements Runnable {
        RunnableC5050a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5049y.this.m30927d();
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.y$b */
    /* loaded from: classes7.dex */
    class RunnableC5051b implements Runnable {
        RunnableC5051b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5049y.this.m30921j();
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.y$c */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C5052c {

        /* renamed from: a */
        static final /* synthetic */ int[] f8674a;

        static {
            int[] iArr = new int[EnumC5055f.values().length];
            f8674a = iArr;
            try {
                iArr[EnumC5055f.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8674a[EnumC5055f.QUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8674a[EnumC5055f.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8674a[EnumC5055f.RUNNING_AND_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.y$d */
    /* loaded from: classes7.dex */
    public interface AbstractC5053d {
        /* renamed from: a */
        void mo30919a(C13434e eVar, int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.producers.y$e */
    /* loaded from: classes7.dex */
    public static class C5054e {

        /* renamed from: a */
        private static ScheduledExecutorService f8675a;

        /* renamed from: a */
        static ScheduledExecutorService m30918a() {
            if (f8675a == null) {
                f8675a = Executors.newSingleThreadScheduledExecutor();
            }
            return f8675a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.producers.y$f */
    /* loaded from: classes7.dex */
    public enum EnumC5055f {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    public C5049y(Executor executor, AbstractC5053d dVar, int i) {
        this.f8662a = executor;
        this.f8663b = dVar;
        this.f8666e = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m30927d() {
        C13434e eVar;
        int i;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            eVar = this.f8667f;
            i = this.f8668g;
            this.f8667f = null;
            this.f8668g = 0;
            this.f8669h = EnumC5055f.RUNNING;
            this.f8671j = uptimeMillis;
        }
        try {
            if (m30922i(eVar, i)) {
                this.f8663b.mo30919a(eVar, i);
            }
        } finally {
            C13434e.m3706h(eVar);
            m30924g();
        }
    }

    /* renamed from: e */
    private void m30926e(long j) {
        Runnable a = C13749a.m2820a(this.f8665d, "JobScheduler_enqueueJob");
        if (j > 0) {
            C5054e.m30918a().schedule(a, j, TimeUnit.MILLISECONDS);
        } else {
            a.run();
        }
    }

    /* renamed from: g */
    private void m30924g() {
        boolean z;
        long j;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            if (this.f8669h == EnumC5055f.RUNNING_AND_PENDING) {
                j = Math.max(this.f8671j + this.f8666e, uptimeMillis);
                this.f8670i = uptimeMillis;
                this.f8669h = EnumC5055f.QUEUED;
                z = true;
            } else {
                this.f8669h = EnumC5055f.IDLE;
                j = 0;
                z = false;
            }
        }
        if (z) {
            m30926e(j - uptimeMillis);
        }
    }

    /* renamed from: i */
    private static boolean m30922i(C13434e eVar, int i) {
        if (AbstractC4954b.m31197d(i) || AbstractC4954b.m31192m(i, 4) || C13434e.m3704j0(eVar)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m30921j() {
        this.f8662a.execute(C13749a.m2820a(this.f8664c, "JobScheduler_submitJob"));
    }

    /* renamed from: c */
    public void m30928c() {
        C13434e eVar;
        synchronized (this) {
            eVar = this.f8667f;
            this.f8667f = null;
            this.f8668g = 0;
        }
        C13434e.m3706h(eVar);
    }

    /* renamed from: f */
    public synchronized long m30925f() {
        return this.f8671j - this.f8670i;
    }

    /* renamed from: h */
    public boolean m30923h() {
        long j;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            boolean z = false;
            if (!m30922i(this.f8667f, this.f8668g)) {
                return false;
            }
            int i = C5052c.f8674a[this.f8669h.ordinal()];
            if (i != 1) {
                if (i == 3) {
                    this.f8669h = EnumC5055f.RUNNING_AND_PENDING;
                }
                j = 0;
            } else {
                j = Math.max(this.f8671j + this.f8666e, uptimeMillis);
                this.f8670i = uptimeMillis;
                this.f8669h = EnumC5055f.QUEUED;
                z = true;
            }
            if (z) {
                m30926e(j - uptimeMillis);
            }
            return true;
        }
    }

    /* renamed from: k */
    public boolean m30920k(C13434e eVar, int i) {
        C13434e eVar2;
        if (!m30922i(eVar, i)) {
            return false;
        }
        synchronized (this) {
            eVar2 = this.f8667f;
            this.f8667f = C13434e.m3707g(eVar);
            this.f8668g = i;
        }
        C13434e.m3706h(eVar2);
        return true;
    }
}
