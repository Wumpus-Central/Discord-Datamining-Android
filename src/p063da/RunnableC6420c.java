package p063da;

import android.os.Process;

/* renamed from: da.c */
/* loaded from: classes5.dex */
final class RunnableC6420c implements Runnable {

    /* renamed from: k */
    private final Runnable f13468k;

    public RunnableC6420c(Runnable runnable, int i) {
        this.f13468k = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f13468k.run();
    }
}
