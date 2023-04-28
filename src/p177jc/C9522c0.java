package p177jc;

/* renamed from: jc.c0 */
/* loaded from: classes3.dex */
public final class C9522c0 {
    /* renamed from: a */
    public static void m16098a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static <T> T m16097b(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: c */
    public static <T> T m16096c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static void m16095d(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
