package io.sentry;

import io.sentry.util.C9111k;

/* renamed from: io.sentry.i */
/* loaded from: classes8.dex */
public final class C8893i implements AbstractC8869g0 {

    /* renamed from: a */
    private final C8951o3 f19574a;

    /* renamed from: b */
    private final AbstractC8869g0 f19575b;

    public C8893i(C8951o3 o3Var, AbstractC8869g0 g0Var) {
        this.f19574a = (C8951o3) C9111k.m16995a(o3Var, "SentryOptions is required.");
        this.f19575b = g0Var;
    }

    @Override // io.sentry.AbstractC8869g0
    /* renamed from: a */
    public void mo17724a(EnumC8942n3 n3Var, Throwable th2, String str, Object... objArr) {
        if (this.f19575b != null && mo17721d(n3Var)) {
            this.f19575b.mo17724a(n3Var, th2, str, objArr);
        }
    }

    @Override // io.sentry.AbstractC8869g0
    /* renamed from: b */
    public void mo17723b(EnumC8942n3 n3Var, String str, Throwable th2) {
        if (this.f19575b != null && mo17721d(n3Var)) {
            this.f19575b.mo17723b(n3Var, str, th2);
        }
    }

    @Override // io.sentry.AbstractC8869g0
    /* renamed from: c */
    public void mo17722c(EnumC8942n3 n3Var, String str, Object... objArr) {
        if (this.f19575b != null && mo17721d(n3Var)) {
            this.f19575b.mo17722c(n3Var, str, objArr);
        }
    }

    @Override // io.sentry.AbstractC8869g0
    /* renamed from: d */
    public boolean mo17721d(EnumC8942n3 n3Var) {
        EnumC8942n3 diagnosticLevel = this.f19574a.getDiagnosticLevel();
        if (n3Var != null && this.f19574a.isDebug() && n3Var.ordinal() >= diagnosticLevel.ordinal()) {
            return true;
        }
        return false;
    }
}
