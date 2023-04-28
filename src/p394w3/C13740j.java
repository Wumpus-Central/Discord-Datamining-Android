package p394w3;

/* renamed from: w3.j */
/* loaded from: classes7.dex */
public final class C13740j {
    /* renamed from: a */
    private static String m2840a(int i, int i2, String str) {
        if (i < 0) {
            return m2830k("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return m2830k("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }

    /* renamed from: b */
    public static void m2839b(Boolean bool) {
        if (bool != null && !bool.booleanValue()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static void m2838c(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: d */
    public static void m2837d(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(m2830k(str, objArr));
        }
    }

    /* renamed from: e */
    public static int m2836e(int i, int i2) {
        return m2835f(i, i2, "index");
    }

    /* renamed from: f */
    public static int m2835f(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m2840a(i, i2, str));
    }

    /* renamed from: g */
    public static <T> T m2834g(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: h */
    public static <T> T m2833h(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: i */
    public static void m2832i(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: j */
    public static void m2831j(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: k */
    static String m2830k(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i2)) != -1) {
            sb2.append(valueOf.substring(i2, indexOf));
            sb2.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb2.append(valueOf.substring(i2));
        if (i < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb2.append(", ");
                sb2.append(objArr[i3]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
