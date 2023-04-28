package ca;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import p082ea.C6801d;
import p365u9.C13224j;

/* renamed from: ca.m */
/* loaded from: classes5.dex */
public final class C3806m {
    /* renamed from: a */
    public static boolean m33553a(Context context, int i) {
        if (!m33552b(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return C13224j.m4258a(context).m4257b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @TargetApi(19)
    /* renamed from: b */
    public static boolean m33552b(Context context, int i, String str) {
        return C6801d.m24304a(context).m24305f(i, str);
    }
}
