package p410x;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x.f */
/* loaded from: classes.dex */
public final class C13914f {

    /* renamed from: a */
    private static volatile ScheduledExecutorService f31368a;

    private C13914f() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ScheduledExecutorService m2324a() {
        if (f31368a != null) {
            return f31368a;
        }
        synchronized (C13914f.class) {
            if (f31368a == null) {
                f31368a = new ScheduledExecutorServiceC13907c(new Handler(Looper.getMainLooper()));
            }
        }
        return f31368a;
    }
}
