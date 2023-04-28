package p213l9;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: l9.l */
/* loaded from: classes5.dex */
final class ThreadFactoryC10371l implements ThreadFactory {

    /* renamed from: a */
    private static final AtomicInteger f22758a = new AtomicInteger();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ThreadFactoryC10371l(C10370k kVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int incrementAndGet = f22758a.incrementAndGet();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("measurement-");
        sb2.append(incrementAndGet);
        return new C10372m(runnable, sb2.toString());
    }
}
