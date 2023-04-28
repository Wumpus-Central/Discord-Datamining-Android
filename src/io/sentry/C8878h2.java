package io.sentry;

import io.sentry.util.C9111k;

/* renamed from: io.sentry.h2 */
/* loaded from: classes8.dex */
public final class C8878h2 implements AbstractC8871g2 {

    /* renamed from: a */
    private final AbstractC8847d2 f19565a;

    public C8878h2(AbstractC8847d2 d2Var) {
        this.f19565a = (AbstractC8847d2) C9111k.m16995a(d2Var, "SendFireAndForgetDirPath is required");
    }

    @Override // io.sentry.AbstractC8871g2
    /* renamed from: a */
    public AbstractC8813c2 mo17767a(AbstractC8861f0 f0Var, C8951o3 o3Var) {
        C9111k.m16995a(f0Var, "Hub is required");
        C9111k.m16995a(o3Var, "SentryOptions is required");
        String a = this.f19565a.mo17884a();
        if (a != null && mo17766b(a, o3Var.getLogger())) {
            return m17812c(new C9029r(f0Var, o3Var.getSerializer(), o3Var.getLogger(), o3Var.getFlushTimeoutMillis()), a, o3Var.getLogger());
        }
        o3Var.getLogger().mo17722c(EnumC8942n3.ERROR, "No cache dir path is defined in options.", new Object[0]);
        return null;
    }

    @Override // io.sentry.AbstractC8871g2
    /* renamed from: b */
    public /* synthetic */ boolean mo17766b(String str, AbstractC8869g0 g0Var) {
        return C8864f2.m17858a(this, str, g0Var);
    }

    /* renamed from: c */
    public /* synthetic */ AbstractC8813c2 m17812c(AbstractC8911k kVar, String str, AbstractC8869g0 g0Var) {
        return C8864f2.m17857b(this, kVar, str, g0Var);
    }
}
