package p007a6;

/* renamed from: a6.b */
/* loaded from: classes7.dex */
public class C1271b {

    /* renamed from: a */
    public static final AbstractC0002b f142a = new C1273c();

    /* renamed from: b */
    private static volatile AbstractC1274d f143b = null;

    /* renamed from: a6.b$b */
    /* loaded from: classes7.dex */
    public interface AbstractC0002b {
    }

    /* renamed from: a6.b$c */
    /* loaded from: classes7.dex */
    private static final class C1273c implements AbstractC0002b {
        private C1273c() {
        }
    }

    /* renamed from: a6.b$d */
    /* loaded from: classes7.dex */
    public interface AbstractC1274d {
        /* renamed from: a */
        void mo41490a(String str);

        /* renamed from: b */
        void mo41489b();

        boolean isTracing();
    }

    private C1271b() {
    }

    /* renamed from: a */
    public static void m41494a(String str) {
        m41492c().mo41490a(str);
    }

    /* renamed from: b */
    public static void m41493b() {
        m41492c().mo41489b();
    }

    /* renamed from: c */
    private static AbstractC1274d m41492c() {
        if (f143b == null) {
            synchronized (C1271b.class) {
                if (f143b == null) {
                    f143b = new C1270a();
                }
            }
        }
        return f143b;
    }

    /* renamed from: d */
    public static boolean m41491d() {
        return m41492c().isTracing();
    }
}
