package p420x9;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import ca.C3809p;

/* renamed from: x9.p */
/* loaded from: classes5.dex */
public final class C14004p {
    /* renamed from: a */
    public static void m2060a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m2059b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static void m2058c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m2057d(Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            String name = handler.getLooper().getThread().getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 36 + String.valueOf(str).length());
            sb2.append("Must be called on ");
            sb2.append(name);
            sb2.append(" thread, but got ");
            sb2.append(str);
            sb2.append(".");
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: e */
    public static void m2056e(String str) {
        if (!C3809p.m33547a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: f */
    public static String m2055f(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* renamed from: g */
    public static String m2054g(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: h */
    public static void m2053h() {
        m2052i("Must not be called on the main application thread");
    }

    /* renamed from: i */
    public static void m2052i(String str) {
        if (C3809p.m33547a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: j */
    public static <T> T m2051j(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: k */
    public static <T> T m2050k(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: l */
    public static void m2049l(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: m */
    public static void m2048m(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
