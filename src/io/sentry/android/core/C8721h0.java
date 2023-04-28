package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import io.sentry.AbstractC8869g0;
import io.sentry.EnumC8942n3;

/* renamed from: io.sentry.android.core.h0 */
/* loaded from: classes8.dex */
final class C8721h0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static ApplicationInfo m18279a(Context context, long j, C8715f0 f0Var) {
        if (f0Var.m18303d() >= 33) {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(j));
        }
        return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public static PackageInfo m18278b(Context context, int i, AbstractC8869g0 g0Var, C8715f0 f0Var) {
        try {
            if (f0Var.m18303d() >= 33) {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(i));
            }
            return context.getPackageManager().getPackageInfo(context.getPackageName(), i);
        } catch (Throwable th2) {
            g0Var.mo17723b(EnumC8942n3.ERROR, "Error getting package info.", th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static PackageInfo m18277c(Context context, AbstractC8869g0 g0Var, C8715f0 f0Var) {
        return m18278b(context, 0, g0Var, f0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public static String m18276d(PackageInfo packageInfo, C8715f0 f0Var) {
        long longVersionCode;
        if (f0Var.m18303d() < 28) {
            return m18275e(packageInfo);
        }
        longVersionCode = packageInfo.getLongVersionCode();
        return Long.toString(longVersionCode);
    }

    /* renamed from: e */
    private static String m18275e(PackageInfo packageInfo) {
        return Integer.toString(packageInfo.versionCode);
    }
}
