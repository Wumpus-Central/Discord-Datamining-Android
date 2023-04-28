package p063da;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import pa.HandlerC11593e;

/* renamed from: da.a */
/* loaded from: classes5.dex */
public class ExecutorC6418a implements Executor {

    /* renamed from: k */
    private final Handler f13465k;

    public ExecutorC6418a(Looper looper) {
        this.f13465k = new HandlerC11593e(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f13465k.post(runnable);
    }
}
