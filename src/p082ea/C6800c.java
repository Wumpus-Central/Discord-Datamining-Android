package p082ea;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import ca.C3803j;

/* renamed from: ea.c */
/* loaded from: classes5.dex */
public class C6800c {

    /* renamed from: a */
    protected final Context f14520a;

    public C6800c(Context context) {
        this.f14520a = context;
    }

    /* renamed from: a */
    public int m24310a(String str) {
        return this.f14520a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: b */
    public int m24309b(String str, String str2) {
        return this.f14520a.getPackageManager().checkPermission(str, str2);
    }

    /* renamed from: c */
    public ApplicationInfo m24308c(String str, int i) {
        return this.f14520a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: d */
    public CharSequence m24307d(String str) {
        return this.f14520a.getPackageManager().getApplicationLabel(this.f14520a.getPackageManager().getApplicationInfo(str, 0));
    }

    /* renamed from: e */
    public PackageInfo m24306e(String str, int i) {
        return this.f14520a.getPackageManager().getPackageInfo(str, i);
    }

    @TargetApi(19)
    /* renamed from: f */
    public final boolean m24305f(int i, String str) {
        if (C3803j.m33563d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f14520a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f14520a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String str2 : packagesForUid) {
                    if (str.equals(str2)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
