package p116g6;

/* renamed from: g6.a */
/* loaded from: classes7.dex */
public class C7420a {

    /* renamed from: a */
    private static AbstractC7421b f15990a;

    private C7420a() {
    }

    /* renamed from: a */
    public static void m22712a(AbstractC7421b bVar) {
        synchronized (C7420a.class) {
            if (f15990a == null) {
                f15990a = bVar;
            } else {
                throw new IllegalStateException("Cannot re-initialize NativeLoader.");
            }
        }
    }

    /* renamed from: b */
    public static void m22711b(AbstractC7421b bVar) {
        if (!m22710c()) {
            m22712a(bVar);
        }
    }

    /* renamed from: c */
    public static boolean m22710c() {
        boolean z;
        synchronized (C7420a.class) {
            if (f15990a != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: d */
    public static boolean m22709d(String str) {
        return m22708e(str, 0);
    }

    /* renamed from: e */
    public static boolean m22708e(String str, int i) {
        AbstractC7421b bVar;
        synchronized (C7420a.class) {
            bVar = f15990a;
            if (bVar == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return bVar.mo22707a(str, i);
    }
}
