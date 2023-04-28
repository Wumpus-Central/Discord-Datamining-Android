package p359u3;

import android.os.Handler;
import android.os.Looper;

/* renamed from: u3.h */
/* loaded from: classes7.dex */
public class C13190h extends ScheduledExecutorServiceC13186d {

    /* renamed from: l */
    private static C13190h f29581l;

    private C13190h() {
        super(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: g */
    public static C13190h m4376g() {
        if (f29581l == null) {
            f29581l = new C13190h();
        }
        return f29581l;
    }

    @Override // p359u3.ScheduledExecutorServiceC13186d, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (m4389a()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
