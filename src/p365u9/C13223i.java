package p365u9;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import ca.C3799f;
import ca.C3803j;
import ca.C3808o;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.concurrent.atomic.AtomicBoolean;
import p082ea.C6801d;
import p420x9.C14004p;
import p420x9.C14021v0;

/* renamed from: u9.i */
/* loaded from: classes5.dex */
public class C13223i {
    @Deprecated

    /* renamed from: a */
    public static final int f29692a = 12451000;

    /* renamed from: c */
    private static boolean f29694c = false;

    /* renamed from: d */
    static boolean f29695d = false;

    /* renamed from: b */
    static final AtomicBoolean f29693b = new AtomicBoolean();

    /* renamed from: e */
    private static final AtomicBoolean f29696e = new AtomicBoolean();

    @Deprecated
    /* renamed from: a */
    public static String m4266a(int i) {
        return C13215a.m4299B(i);
    }

    /* renamed from: b */
    public static Resources m4265b(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m4264c(Context context) {
        try {
            if (!f29695d) {
                PackageInfo e = C6801d.m24304a(context).m24306e("com.google.android.gms", 64);
                C13224j.m4258a(context);
                if (e == null || C13224j.m4255d(e, false) || !C13224j.m4255d(e, true)) {
                    f29694c = false;
                } else {
                    f29694c = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
        } finally {
            f29695d = true;
        }
        if (f29694c || !C3799f.m33577b()) {
            return true;
        }
        return false;
    }

    @Deprecated
    /* renamed from: d */
    public static int m4263d(Context context, int i) {
        boolean z;
        boolean z2;
        PackageInfo packageInfo;
        try {
            context.getResources().getString(C13225k.f29699a);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f29696e.get()) {
            int a = C14021v0.m2020a(context);
            if (a == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            } else if (a != f29692a) {
                throw new GooglePlayServicesIncorrectManifestValueException(a);
            }
        }
        if (C3799f.m33575d(context) || C3799f.m33573f(context)) {
            z = false;
        } else {
            z = true;
        }
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C14004p.m2060a(z2);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C13224j.m4258a(context);
            if (!C13224j.m4255d(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else {
                if (z) {
                    C14004p.m2051j(packageInfo);
                    if (!C13224j.m4255d(packageInfo, true)) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                    }
                }
                if (z && packageInfo != null && !packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                } else if (C3808o.m33548a(packageInfo2.versionCode) < C3808o.m33548a(i)) {
                    int i2 = packageInfo2.versionCode;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 82);
                    sb2.append("Google Play services out of date for ");
                    sb2.append(packageName);
                    sb2.append(".  Requires ");
                    sb2.append(i);
                    sb2.append(" but found ");
                    sb2.append(i2);
                    Log.w("GooglePlayServicesUtil", sb2.toString());
                    return 2;
                } else {
                    ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e);
                            return 1;
                        }
                    }
                    if (!applicationInfo.enabled) {
                        return 3;
                    }
                    return 0;
                }
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    @Deprecated
    /* renamed from: e */
    public static boolean m4262e(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m4259h(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(18)
    /* renamed from: f */
    public static boolean m4261f(Context context) {
        if (!C3803j.m33564c()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        C14004p.m2051j(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        if (applicationRestrictions == null || !"true".equals(applicationRestrictions.getString("restricted_profile"))) {
            return false;
        }
        return true;
    }

    @Deprecated
    /* renamed from: g */
    public static boolean m4260g(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(21)
    /* renamed from: h */
    public static boolean m4259h(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        if (C3803j.m33561f()) {
            try {
                for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(sessionInfo.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (equals) {
            return applicationInfo.enabled;
        }
        if (!applicationInfo.enabled || m4261f(context)) {
            return false;
        }
        return true;
    }
}
