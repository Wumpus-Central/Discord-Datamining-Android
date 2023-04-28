package io.sentry;

import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: io.sentry.j4 */
/* loaded from: classes8.dex */
public final class C8910j4 implements AbstractC8869g0 {
    /* renamed from: e */
    private String m17720e(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // io.sentry.AbstractC8869g0
    /* renamed from: a */
    public void mo17724a(EnumC8942n3 n3Var, Throwable th2, String str, Object... objArr) {
        if (th2 == null) {
            mo17722c(n3Var, str, objArr);
        } else {
            System.out.println(String.format("%s: %s \n %s\n%s", n3Var, String.format(str, objArr), th2.toString(), m17720e(th2)));
        }
    }

    @Override // io.sentry.AbstractC8869g0
    /* renamed from: b */
    public void mo17723b(EnumC8942n3 n3Var, String str, Throwable th2) {
        if (th2 == null) {
            mo17722c(n3Var, str, new Object[0]);
        } else {
            System.out.println(String.format("%s: %s\n%s", n3Var, String.format(str, th2.toString()), m17720e(th2)));
        }
    }

    @Override // io.sentry.AbstractC8869g0
    /* renamed from: c */
    public void mo17722c(EnumC8942n3 n3Var, String str, Object... objArr) {
        System.out.println(String.format("%s: %s", n3Var, String.format(str, objArr)));
    }

    @Override // io.sentry.AbstractC8869g0
    /* renamed from: d */
    public boolean mo17721d(EnumC8942n3 n3Var) {
        return true;
    }
}
