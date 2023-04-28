package androidx.core.p018os;

import android.os.Handler;
import androidx.core.util.C2517g;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: androidx.core.os.g */
/* loaded from: classes.dex */
public final class C2442g {

    /* renamed from: androidx.core.os.g$a */
    /* loaded from: classes.dex */
    private static class ExecutorC2443a implements Executor {

        /* renamed from: k */
        private final Handler f3374k;

        ExecutorC2443a(Handler handler) {
            this.f3374k = (Handler) C2517g.m37588g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (!this.f3374k.post((Runnable) C2517g.m37588g(runnable))) {
                throw new RejectedExecutionException(this.f3374k + " is shutting down");
            }
        }
    }

    /* renamed from: a */
    public static Executor m37737a(Handler handler) {
        return new ExecutorC2443a(handler);
    }
}
