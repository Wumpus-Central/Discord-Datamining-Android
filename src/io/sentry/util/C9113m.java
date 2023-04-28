package io.sentry.util;

/* renamed from: io.sentry.util.m */
/* loaded from: classes8.dex */
public final class C9113m {

    /* renamed from: a */
    private static boolean f19980a;

    static {
        try {
            f19980a = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            f19980a = false;
        }
    }

    /* renamed from: a */
    public static boolean m16992a() {
        return !f19980a;
    }
}
