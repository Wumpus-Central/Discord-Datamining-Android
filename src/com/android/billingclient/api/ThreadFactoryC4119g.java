package com.android.billingclient.api;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.android.billingclient.api.g */
/* loaded from: classes.dex */
final class ThreadFactoryC4119g implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f6874a = Executors.defaultThreadFactory();

    /* renamed from: b */
    private final AtomicInteger f6875b = new AtomicInteger(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public ThreadFactoryC4119g(C4113a aVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f6874a.newThread(runnable);
        int andIncrement = this.f6875b.getAndIncrement();
        newThread.setName("PlayBillingLibrary-" + andIncrement);
        return newThread;
    }
}
