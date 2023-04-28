package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* renamed from: io.sentry.l1 */
/* loaded from: classes8.dex */
final class C8925l1 implements AbstractC8913k0 {

    /* renamed from: a */
    private static final C8925l1 f19621a = new C8925l1();

    private C8925l1() {
    }

    /* renamed from: e */
    public static AbstractC8913k0 m17672e() {
        return f19621a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ Object m17671f() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ Object m17670g() {
        return null;
    }

    @Override // io.sentry.AbstractC8913k0
    /* renamed from: a */
    public void mo17613a(long j) {
    }

    @Override // io.sentry.AbstractC8913k0
    /* renamed from: b */
    public Future<?> mo17612b(Runnable runnable, long j) {
        return new FutureTask(new Callable() { // from class: io.sentry.k1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object f;
                f = C8925l1.m17671f();
                return f;
            }
        });
    }

    @Override // io.sentry.AbstractC8913k0
    public Future<?> submit(Runnable runnable) {
        return new FutureTask(new Callable() { // from class: io.sentry.j1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object g;
                g = C8925l1.m17670g();
                return g;
            }
        });
    }
}
