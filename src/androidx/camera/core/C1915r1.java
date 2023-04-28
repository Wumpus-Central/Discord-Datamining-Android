package androidx.camera.core;

import android.os.Build;
import android.util.Log;

/* renamed from: androidx.camera.core.r1 */
/* loaded from: classes.dex */
public final class C1915r1 {

    /* renamed from: a */
    private static int f1949a = 3;

    /* renamed from: a */
    public static void m39527a(String str, String str2) {
        String j = m39518j(str);
        if (m39521g(j, 3)) {
            Log.d(j, str2);
        }
    }

    /* renamed from: b */
    public static void m39526b(String str, String str2, Throwable th2) {
        String j = m39518j(str);
        if (m39521g(j, 3)) {
            Log.d(j, str2, th2);
        }
    }

    /* renamed from: c */
    public static void m39525c(String str, String str2) {
        String j = m39518j(str);
        if (m39521g(j, 6)) {
            Log.e(j, str2);
        }
    }

    /* renamed from: d */
    public static void m39524d(String str, String str2, Throwable th2) {
        String j = m39518j(str);
        if (m39521g(j, 6)) {
            Log.e(j, str2, th2);
        }
    }

    /* renamed from: e */
    public static void m39523e(String str, String str2) {
        String j = m39518j(str);
        if (m39521g(j, 4)) {
            Log.i(j, str2);
        }
    }

    /* renamed from: f */
    public static boolean m39522f(String str) {
        return m39521g(m39518j(str), 3);
    }

    /* renamed from: g */
    private static boolean m39521g(String str, int i) {
        return f1949a <= i || Log.isLoggable(str, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static void m39520h() {
        f1949a = 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m39519i(int i) {
        f1949a = i;
    }

    /* renamed from: j */
    private static String m39518j(String str) {
        if (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) {
            return str;
        }
        return str.substring(0, 23);
    }

    /* renamed from: k */
    public static void m39517k(String str, String str2) {
        String j = m39518j(str);
        if (m39521g(j, 5)) {
            Log.w(j, str2);
        }
    }

    /* renamed from: l */
    public static void m39516l(String str, String str2, Throwable th2) {
        String j = m39518j(str);
        if (m39521g(j, 5)) {
            Log.w(j, str2, th2);
        }
    }
}
