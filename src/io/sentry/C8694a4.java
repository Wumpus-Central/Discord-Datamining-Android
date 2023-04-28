package io.sentry;

import io.sentry.util.C9111k;
import java.io.Closeable;

/* renamed from: io.sentry.a4 */
/* loaded from: classes8.dex */
public final class C8694a4 implements AbstractC9023q0, Closeable {

    /* renamed from: k */
    private final Runtime f19214k;

    /* renamed from: l */
    private Thread f19215l;

    public C8694a4(Runtime runtime) {
        this.f19214k = (Runtime) C9111k.m16995a(runtime, "Runtime is required");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m18346h(AbstractC8861f0 f0Var, C8951o3 o3Var) {
        f0Var.mo17834d(o3Var.getFlushTimeoutMillis());
    }

    @Override // io.sentry.AbstractC9023q0
    /* renamed from: b */
    public void mo17181b(final AbstractC8861f0 f0Var, final C8951o3 o3Var) {
        C9111k.m16995a(f0Var, "Hub is required");
        C9111k.m16995a(o3Var, "SentryOptions is required");
        if (o3Var.isEnableShutdownHook()) {
            Thread thread = new Thread(new Runnable() { // from class: io.sentry.z3
                @Override // java.lang.Runnable
                public final void run() {
                    C8694a4.m18346h(AbstractC8861f0.this, o3Var);
                }
            });
            this.f19215l = thread;
            this.f19214k.addShutdownHook(thread);
            o3Var.getLogger().mo17722c(EnumC8942n3.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
            return;
        }
        o3Var.getLogger().mo17722c(EnumC8942n3.INFO, "enableShutdownHook is disabled.", new Object[0]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Thread thread = this.f19215l;
        if (thread != null) {
            this.f19214k.removeShutdownHook(thread);
        }
    }

    public C8694a4() {
        this(Runtime.getRuntime());
    }
}
