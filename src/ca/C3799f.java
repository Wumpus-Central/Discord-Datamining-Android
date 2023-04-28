package ca;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import p365u9.C13223i;

/* renamed from: ca.f */
/* loaded from: classes5.dex */
public final class C3799f {

    /* renamed from: a */
    private static Boolean f6289a;

    /* renamed from: b */
    private static Boolean f6290b;

    /* renamed from: c */
    private static Boolean f6291c;

    /* renamed from: d */
    private static Boolean f6292d;

    /* renamed from: a */
    public static boolean m33578a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f6292d == null) {
            boolean z = false;
            if (C3803j.m33559h() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            f6292d = Boolean.valueOf(z);
        }
        return f6292d.booleanValue();
    }

    /* renamed from: b */
    public static boolean m33577b() {
        int i = C13223i.f29692a;
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    /* renamed from: c */
    public static boolean m33576c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f6289a == null) {
            boolean z = false;
            if (C3803j.m33562e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            f6289a = Boolean.valueOf(z);
        }
        return f6289a.booleanValue();
    }

    @TargetApi(26)
    /* renamed from: d */
    public static boolean m33575d(Context context) {
        if (!m33576c(context)) {
            return false;
        }
        if (!C3803j.m33560g()) {
            return true;
        }
        if (!m33574e(context) || C3803j.m33559h()) {
            return false;
        }
        return true;
    }

    @TargetApi(21)
    /* renamed from: e */
    public static boolean m33574e(Context context) {
        if (f6290b == null) {
            boolean z = false;
            if (C3803j.m33561f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            f6290b = Boolean.valueOf(z);
        }
        return f6290b.booleanValue();
    }

    /* renamed from: f */
    public static boolean m33573f(Context context) {
        if (f6291c == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            f6291c = Boolean.valueOf(z);
        }
        return f6291c.booleanValue();
    }
}
