package p314r5;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: r5.i */
/* loaded from: classes7.dex */
public class ThreadFactoryC12395i implements ThreadFactory {

    /* renamed from: a */
    private final int f27844a;

    /* renamed from: b */
    private final String f27845b;

    /* renamed from: c */
    private final boolean f27846c;

    /* renamed from: d */
    private final AtomicInteger f27847d = new AtomicInteger(1);

    /* renamed from: r5.i$a */
    /* loaded from: classes7.dex */
    class RunnableC12396a implements Runnable {

        /* renamed from: k */
        final /* synthetic */ Runnable f27848k;

        RunnableC12396a(Runnable runnable) {
            this.f27848k = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(ThreadFactoryC12395i.this.f27844a);
            } catch (Throwable unused) {
            }
            this.f27848k.run();
        }
    }

    public ThreadFactoryC12395i(int i, String str, boolean z) {
        this.f27844a = i;
        this.f27845b = str;
        this.f27846c = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str;
        RunnableC12396a aVar = new RunnableC12396a(runnable);
        if (this.f27846c) {
            str = this.f27845b + "-" + this.f27847d.getAndIncrement();
        } else {
            str = this.f27845b;
        }
        return new Thread(aVar, str);
    }
}
