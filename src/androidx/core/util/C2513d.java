package androidx.core.util;

import java.util.Objects;

/* renamed from: androidx.core.util.d */
/* loaded from: classes.dex */
public class C2513d {

    /* renamed from: androidx.core.util.d$a */
    /* loaded from: classes.dex */
    static class C2514a {
        /* renamed from: a */
        static boolean m37596a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        /* renamed from: b */
        static int m37595b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    /* renamed from: a */
    public static boolean m37601a(Object obj, Object obj2) {
        return C2514a.m37596a(obj, obj2);
    }

    /* renamed from: b */
    public static int m37600b(Object... objArr) {
        return C2514a.m37595b(objArr);
    }

    /* renamed from: c */
    public static <T> T m37599c(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: d */
    public static <T> T m37598d(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: e */
    public static String m37597e(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }
}
