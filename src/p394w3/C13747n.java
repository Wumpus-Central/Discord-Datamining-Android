package p394w3;

/* renamed from: w3.n */
/* loaded from: classes7.dex */
public final class C13747n {
    /* renamed from: a */
    public static RuntimeException m2823a(Throwable th2) {
        m2821c((Throwable) C13740j.m2834g(th2));
        throw new RuntimeException(th2);
    }

    /* renamed from: b */
    public static <X extends Throwable> void m2822b(Throwable th2, Class<X> cls) {
        if (th2 != null && cls.isInstance(th2)) {
            throw cls.cast(th2);
        }
    }

    /* renamed from: c */
    public static void m2821c(Throwable th2) {
        m2822b(th2, Error.class);
        m2822b(th2, RuntimeException.class);
    }
}
