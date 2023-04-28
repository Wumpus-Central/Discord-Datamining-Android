package io.sentry;

import java.io.File;

/* renamed from: io.sentry.f2 */
/* loaded from: classes8.dex */
public final /* synthetic */ class C8864f2 {
    /* renamed from: a */
    public static boolean m17858a(AbstractC8871g2 g2Var, String str, AbstractC8869g0 g0Var) {
        if (str != null) {
            return true;
        }
        g0Var.mo17722c(EnumC8942n3.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    /* renamed from: b */
    public static AbstractC8813c2 m17857b(AbstractC8871g2 g2Var, final AbstractC8911k kVar, final String str, final AbstractC8869g0 g0Var) {
        final File file = new File(str);
        return new AbstractC8813c2() { // from class: io.sentry.e2
            @Override // io.sentry.AbstractC8813c2
            /* renamed from: a */
            public final void mo17864a() {
                C8864f2.m17856c(AbstractC8869g0.this, str, kVar, file);
            }
        };
    }

    /* renamed from: c */
    public static /* synthetic */ void m17856c(AbstractC8869g0 g0Var, String str, AbstractC8911k kVar, File file) {
        EnumC8942n3 n3Var = EnumC8942n3.DEBUG;
        g0Var.mo17722c(n3Var, "Started processing cached files from %s", str);
        kVar.mo17038e(file);
        g0Var.mo17722c(n3Var, "Finished processing cached files from %s", str);
    }
}
