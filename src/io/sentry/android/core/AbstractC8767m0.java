package io.sentry.android.core;

import io.sentry.AbstractC8861f0;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9023q0;
import io.sentry.C8951o3;
import io.sentry.C9095u1;
import io.sentry.EnumC8942n3;
import io.sentry.util.C9111k;
import java.io.Closeable;

/* renamed from: io.sentry.android.core.m0 */
/* loaded from: classes8.dex */
public abstract class AbstractC8767m0 implements AbstractC9023q0, Closeable {

    /* renamed from: k */
    private FileObserverC8764l0 f19382k;

    /* renamed from: l */
    private AbstractC8869g0 f19383l;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.android.core.m0$b */
    /* loaded from: classes8.dex */
    public static final class C8769b extends AbstractC8767m0 {
        private C8769b() {
        }

        @Override // io.sentry.android.core.AbstractC8767m0
        /* renamed from: h */
        protected String mo18119h(C8951o3 o3Var) {
            return o3Var.getOutboxPath();
        }
    }

    /* renamed from: g */
    public static AbstractC8767m0 m18120g() {
        return new C8769b();
    }

    @Override // io.sentry.AbstractC9023q0
    /* renamed from: b */
    public final void mo17181b(AbstractC8861f0 f0Var, C8951o3 o3Var) {
        C9111k.m16995a(f0Var, "Hub is required");
        C9111k.m16995a(o3Var, "SentryOptions is required");
        this.f19383l = o3Var.getLogger();
        String h = mo18119h(o3Var);
        if (h == null) {
            this.f19383l.mo17722c(EnumC8942n3.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        AbstractC8869g0 g0Var = this.f19383l;
        EnumC8942n3 n3Var = EnumC8942n3.DEBUG;
        g0Var.mo17722c(n3Var, "Registering EnvelopeFileObserverIntegration for path: %s", h);
        FileObserverC8764l0 l0Var = new FileObserverC8764l0(h, new C9095u1(f0Var, o3Var.getEnvelopeReader(), o3Var.getSerializer(), this.f19383l, o3Var.getFlushTimeoutMillis()), this.f19383l, o3Var.getFlushTimeoutMillis());
        this.f19382k = l0Var;
        try {
            l0Var.startWatching();
            this.f19383l.mo17722c(n3Var, "EnvelopeFileObserverIntegration installed.", new Object[0]);
        } catch (Throwable th2) {
            o3Var.getLogger().mo17723b(EnumC8942n3.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        FileObserverC8764l0 l0Var = this.f19382k;
        if (l0Var != null) {
            l0Var.stopWatching();
            AbstractC8869g0 g0Var = this.f19383l;
            if (g0Var != null) {
                g0Var.mo17722c(EnumC8942n3.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
            }
        }
    }

    /* renamed from: h */
    abstract String mo18119h(C8951o3 o3Var);
}
