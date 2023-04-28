package p059d6;

/* renamed from: d6.a */
/* loaded from: classes7.dex */
public class C6399a {
    /* renamed from: a */
    public static void m25624a(boolean z) {
        if (!z) {
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    public static void m25623b(boolean z, String str) {
        if (!z) {
            throw new AssertionError(str);
        }
    }

    /* renamed from: c */
    public static <T> T m25622c(T t) {
        if (t != null) {
            return t;
        }
        throw new AssertionError();
    }

    /* renamed from: d */
    public static <T> T m25621d(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new AssertionError(str);
    }

    /* renamed from: e */
    public static AssertionError m25620e() {
        throw new AssertionError();
    }

    /* renamed from: f */
    public static <T> T m25619f(T t) {
        return t;
    }
}
