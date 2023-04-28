package p362u6;

/* renamed from: u6.d */
/* loaded from: classes7.dex */
public final class C13196d {
    /* renamed from: a */
    public static <T> void m4362a(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }

    /* renamed from: b */
    public static <T> T m4361b(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: c */
    public static <T> T m4360c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
