package p397w6;

import android.util.Log;

/* renamed from: w6.a */
/* loaded from: classes7.dex */
public final class C13750a {
    /* renamed from: a */
    public static void m2814a(String str, String str2, Object obj) {
        Log.d(m2811d(str), String.format(str2, obj));
    }

    /* renamed from: b */
    public static void m2813b(String str, String str2, Object... objArr) {
        Log.d(m2811d(str), String.format(str2, objArr));
    }

    /* renamed from: c */
    public static void m2812c(String str, String str2, Throwable th2) {
        Log.e(m2811d(str), str2, th2);
    }

    /* renamed from: d */
    private static String m2811d(String str) {
        return "TransportRuntime." + str;
    }

    /* renamed from: e */
    public static void m2810e(String str, String str2) {
        Log.i(m2811d(str), str2);
    }

    /* renamed from: f */
    public static void m2809f(String str, String str2, Object obj) {
        Log.w(m2811d(str), String.format(str2, obj));
    }
}
