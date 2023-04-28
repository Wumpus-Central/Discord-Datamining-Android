package p112g2;

import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p074e2.C6639l;

/* renamed from: g2.g */
/* loaded from: classes.dex */
public class ThreadFactoryC7405g implements ThreadFactory {

    /* renamed from: a */
    private String f15956a;

    /* renamed from: g2.g$a */
    /* loaded from: classes.dex */
    class C7406a implements Thread.UncaughtExceptionHandler {
        C7406a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            C6639l.m24863j().mo24885b("Thread [%s] with error [%s]", thread.getName(), th2.getMessage());
        }
    }

    public ThreadFactoryC7405g(String str) {
        this.f15956a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setPriority(9);
        newThread.setName("Adjust-" + newThread.getName() + "-" + this.f15956a);
        newThread.setDaemon(true);
        newThread.setUncaughtExceptionHandler(new C7406a());
        return newThread;
    }
}
