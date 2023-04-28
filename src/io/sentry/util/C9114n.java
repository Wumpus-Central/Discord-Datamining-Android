package io.sentry.util;

/* renamed from: io.sentry.util.n */
/* loaded from: classes8.dex */
public final class C9114n {
    /* renamed from: a */
    public static boolean m16991a(Double d) {
        return m16990b(d, true);
    }

    /* renamed from: b */
    private static boolean m16990b(Double d, boolean z) {
        return d == null ? z : !d.isNaN() && d.doubleValue() >= 0.0d && d.doubleValue() <= 1.0d;
    }

    /* renamed from: c */
    public static boolean m16989c(Double d) {
        return m16988d(d, true);
    }

    /* renamed from: d */
    public static boolean m16988d(Double d, boolean z) {
        return d == null ? z : !d.isNaN() && d.doubleValue() <= 1.0d && d.doubleValue() > 0.0d;
    }

    /* renamed from: e */
    public static boolean m16987e(Double d) {
        return m16986f(d, true);
    }

    /* renamed from: f */
    public static boolean m16986f(Double d, boolean z) {
        return m16990b(d, z);
    }
}
