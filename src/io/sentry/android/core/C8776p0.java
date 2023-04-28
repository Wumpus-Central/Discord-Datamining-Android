package io.sentry.android.core;

import io.sentry.AbstractC8869g0;
import io.sentry.C8951o3;
import io.sentry.EnumC8942n3;

/* renamed from: io.sentry.android.core.p0 */
/* loaded from: classes8.dex */
public final class C8776p0 {
    /* renamed from: a */
    public boolean m18114a(String str, AbstractC8869g0 g0Var) {
        return m18112c(str, g0Var) != null;
    }

    /* renamed from: b */
    public boolean m18113b(String str, C8951o3 o3Var) {
        return m18114a(str, o3Var != null ? o3Var.getLogger() : null);
    }

    /* renamed from: c */
    public Class<?> m18112c(String str, AbstractC8869g0 g0Var) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            if (g0Var == null) {
                return null;
            }
            EnumC8942n3 n3Var = EnumC8942n3.DEBUG;
            g0Var.mo17723b(n3Var, "Class not available:" + str, e);
            return null;
        } catch (UnsatisfiedLinkError e2) {
            if (g0Var == null) {
                return null;
            }
            EnumC8942n3 n3Var2 = EnumC8942n3.ERROR;
            g0Var.mo17723b(n3Var2, "Failed to load (UnsatisfiedLinkError) " + str, e2);
            return null;
        } catch (Throwable th2) {
            if (g0Var == null) {
                return null;
            }
            EnumC8942n3 n3Var3 = EnumC8942n3.ERROR;
            g0Var.mo17723b(n3Var3, "Failed to initialize " + str, th2);
            return null;
        }
    }
}
