package p410x;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: x.a */
/* loaded from: classes.dex */
public final class C13905a {
    /* renamed from: a */
    public static Executor m2339a() {
        return ExecutorC13906b.m2332a();
    }

    /* renamed from: b */
    public static Executor m2338b() {
        return ExecutorC13910d.m2326a();
    }

    /* renamed from: c */
    public static Executor m2337c() {
        return ExecutorC13912e.m2325a();
    }

    /* renamed from: d */
    public static ScheduledExecutorService m2336d() {
        return C13914f.m2324a();
    }

    /* renamed from: e */
    public static ScheduledExecutorService m2335e() {
        return ScheduledExecutorServiceC13907c.m2330b();
    }

    /* renamed from: f */
    public static ScheduledExecutorService m2334f(Handler handler) {
        return new ScheduledExecutorServiceC13907c(handler);
    }

    /* renamed from: g */
    public static Executor m2333g(Executor executor) {
        return new ExecutorC13915g(executor);
    }
}
