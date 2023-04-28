package p213l9;

import android.os.Process;

/* renamed from: l9.m */
/* loaded from: classes5.dex */
final class C10372m extends Thread {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10372m(Runnable runnable, String str) {
        super(runnable, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}
