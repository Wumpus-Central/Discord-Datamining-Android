package io.sentry.android.core;

import io.sentry.util.C9111k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.android.core.e0 */
/* loaded from: classes8.dex */
public final class C8712e0 extends RuntimeException {

    /* renamed from: k */
    private final Thread f19274k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8712e0(String str, Thread thread) {
        super(str);
        Thread thread2 = (Thread) C9111k.m16995a(thread, "Thread must be provided.");
        this.f19274k = thread2;
        setStackTrace(thread2.getStackTrace());
    }

    /* renamed from: a */
    public Thread m18309a() {
        return this.f19274k;
    }
}
