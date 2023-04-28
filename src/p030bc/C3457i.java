package p030bc;

/* renamed from: bc.i */
/* loaded from: classes3.dex */
public final class C3457i {
    /* renamed from: a */
    private static String m34360a(int i, int i2, String str) {
        if (i < 0) {
            return C3464m.m34331a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C3464m.m34331a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: b */
    private static String m34359b(int i, int i2, String str) {
        if (i < 0) {
            return C3464m.m34331a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C3464m.m34331a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: c */
    private static String m34358c(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return m34359b(i, i3, "start index");
        }
        if (i2 < 0 || i2 > i3) {
            return m34359b(i2, i3, "end index");
        }
        return C3464m.m34331a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* renamed from: d */
    public static void m34357d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public static void m34356e(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: f */
    public static void m34355f(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(C3464m.m34331a(str, Long.valueOf(j)));
        }
    }

    /* renamed from: g */
    public static int m34354g(int i, int i2) {
        return m34353h(i, i2, "index");
    }

    /* renamed from: h */
    public static int m34353h(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m34360a(i, i2, str));
    }

    /* renamed from: i */
    public static <T> T m34352i(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: j */
    public static <T> T m34351j(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: k */
    public static int m34350k(int i, int i2) {
        return m34349l(i, i2, "index");
    }

    /* renamed from: l */
    public static int m34349l(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m34359b(i, i2, str));
    }

    /* renamed from: m */
    public static void m34348m(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(m34358c(i, i2, i3));
        }
    }

    /* renamed from: n */
    public static void m34347n(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: o */
    public static void m34346o(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
