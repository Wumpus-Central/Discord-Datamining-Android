package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import io.sentry.AbstractC8869g0;
import io.sentry.EnumC8942n3;
import io.sentry.android.core.C8715f0;
import io.sentry.util.C9111k;
import java.io.File;
import java.nio.charset.Charset;

/* renamed from: io.sentry.android.core.internal.util.g */
/* loaded from: classes8.dex */
public final class C8749g {

    /* renamed from: g */
    private static final Charset f19329g = Charset.forName("UTF-8");

    /* renamed from: a */
    private final Context f19330a;

    /* renamed from: b */
    private final C8715f0 f19331b;

    /* renamed from: c */
    private final AbstractC8869g0 f19332c;

    /* renamed from: d */
    private final String[] f19333d;

    /* renamed from: e */
    private final String[] f19334e;

    /* renamed from: f */
    private final Runtime f19335f;

    public C8749g(Context context, C8715f0 f0Var, AbstractC8869g0 g0Var) {
        this(context, f0Var, g0Var, new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"}, new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"}, Runtime.getRuntime());
    }

    /* renamed from: a */
    private boolean m18211a() {
        String[] strArr;
        for (String str : this.f19333d) {
            try {
            } catch (RuntimeException e) {
                this.f19332c.mo17724a(EnumC8942n3.ERROR, e, "Error when trying to check if root file %s exists.", str);
            }
            if (new File(str).exists()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private boolean m18210b(AbstractC8869g0 g0Var) {
        String[] strArr;
        C8715f0 f0Var = new C8715f0(g0Var);
        PackageManager packageManager = this.f19330a.getPackageManager();
        if (packageManager != null) {
            for (String str : this.f19334e) {
                try {
                    if (f0Var.m18303d() >= 33) {
                        packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
                        return true;
                    }
                    packageManager.getPackageInfo(str, 0);
                    return true;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (0 == 0) goto L_0x0058;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
        return false;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m18209c() {
        /*
            r6 = this;
            java.lang.String r0 = "/system/xbin/which"
            java.lang.String r1 = "su"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r1 = 0
            r2 = 0
            java.lang.Runtime r3 = r6.f19335f     // Catch: all -> 0x003a, IOException -> 0x004a
            java.lang.Process r2 = r3.exec(r0)     // Catch: all -> 0x003a, IOException -> 0x004a
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: all -> 0x003a, IOException -> 0x004a
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: all -> 0x003a, IOException -> 0x004a
            java.io.InputStream r4 = r2.getInputStream()     // Catch: all -> 0x003a, IOException -> 0x004a
            java.nio.charset.Charset r5 = io.sentry.android.core.internal.util.C8749g.f19329g     // Catch: all -> 0x003a, IOException -> 0x004a
            r3.<init>(r4, r5)     // Catch: all -> 0x003a, IOException -> 0x004a
            r0.<init>(r3)     // Catch: all -> 0x003a, IOException -> 0x004a
            java.lang.String r3 = r0.readLine()     // Catch: all -> 0x0030
            if (r3 == 0) goto L_0x0028
            r3 = 1
            goto L_0x0029
        L_0x0028:
            r3 = r1
        L_0x0029:
            r0.close()     // Catch: all -> 0x003a, IOException -> 0x004a
            r2.destroy()
            return r3
        L_0x0030:
            r3 = move-exception
            r0.close()     // Catch: all -> 0x0035
            goto L_0x0039
        L_0x0035:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: all -> 0x003a, IOException -> 0x004a
        L_0x0039:
            throw r3     // Catch: all -> 0x003a, IOException -> 0x004a
        L_0x003a:
            r0 = move-exception
            io.sentry.g0 r3 = r6.f19332c     // Catch: all -> 0x0059
            io.sentry.n3 r4 = io.sentry.EnumC8942n3.DEBUG     // Catch: all -> 0x0059
            java.lang.String r5 = "Error when trying to check if SU exists."
            r3.mo17723b(r4, r5, r0)     // Catch: all -> 0x0059
            if (r2 == 0) goto L_0x0058
        L_0x0046:
            r2.destroy()
            goto L_0x0058
        L_0x004a:
            io.sentry.g0 r0 = r6.f19332c     // Catch: all -> 0x0059
            io.sentry.n3 r3 = io.sentry.EnumC8942n3.DEBUG     // Catch: all -> 0x0059
            java.lang.String r4 = "SU isn't found on this Device."
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: all -> 0x0059
            r0.mo17722c(r3, r4, r5)     // Catch: all -> 0x0059
            if (r2 == 0) goto L_0x0058
            goto L_0x0046
        L_0x0058:
            return r1
        L_0x0059:
            r0 = move-exception
            if (r2 == 0) goto L_0x005f
            r2.destroy()
        L_0x005f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.internal.util.C8749g.m18209c():boolean");
    }

    /* renamed from: d */
    private boolean m18208d() {
        String a = this.f19331b.m18306a();
        if (a == null || !a.contains("test-keys")) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public boolean m18207e() {
        return m18208d() || m18211a() || m18209c() || m18210b(this.f19332c);
    }

    C8749g(Context context, C8715f0 f0Var, AbstractC8869g0 g0Var, String[] strArr, String[] strArr2, Runtime runtime) {
        this.f19330a = (Context) C9111k.m16995a(context, "The application context is required.");
        this.f19331b = (C8715f0) C9111k.m16995a(f0Var, "The BuildInfoProvider is required.");
        this.f19332c = (AbstractC8869g0) C9111k.m16995a(g0Var, "The Logger is required.");
        this.f19333d = (String[]) C9111k.m16995a(strArr, "The root Files are required.");
        this.f19334e = (String[]) C9111k.m16995a(strArr2, "The root packages are required.");
        this.f19335f = (Runtime) C9111k.m16995a(runtime, "The Runtime is required.");
    }
}
