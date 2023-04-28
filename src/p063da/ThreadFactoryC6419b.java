package p063da;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p420x9.C14004p;

/* renamed from: da.b */
/* loaded from: classes5.dex */
public class ThreadFactoryC6419b implements ThreadFactory {

    /* renamed from: a */
    private final String f13466a;

    /* renamed from: b */
    private final ThreadFactory f13467b = Executors.defaultThreadFactory();

    public ThreadFactoryC6419b(String str) {
        C14004p.m2050k(str, "Name must not be null");
        this.f13466a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f13467b.newThread(new RunnableC6420c(runnable, 0));
        newThread.setName(this.f13466a);
        return newThread;
    }
}
