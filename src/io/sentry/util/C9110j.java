package io.sentry.util;

import io.sentry.AbstractC8869g0;
import io.sentry.EnumC8942n3;

/* renamed from: io.sentry.util.j */
/* loaded from: classes8.dex */
public final class C9110j {
    /* renamed from: a */
    public static void m16996a(Class<?> cls, Object obj, AbstractC8869g0 g0Var) {
        String str;
        EnumC8942n3 n3Var = EnumC8942n3.DEBUG;
        Object[] objArr = new Object[2];
        if (obj != null) {
            str = obj.getClass().getCanonicalName();
        } else {
            str = "Hint";
        }
        objArr[0] = str;
        objArr[1] = cls.getCanonicalName();
        g0Var.mo17722c(n3Var, "%s is not %s", objArr);
    }
}
