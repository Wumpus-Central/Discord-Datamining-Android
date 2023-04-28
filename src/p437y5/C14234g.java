package p437y5;

/* renamed from: y5.g */
/* loaded from: classes7.dex */
public class C14234g {

    /* renamed from: a */
    public static final int f32156a = m1312b();

    /* renamed from: b */
    private static int f32157b = 384;

    /* renamed from: c */
    private static volatile C14232f f32158c;

    /* renamed from: a */
    public static C14232f m1313a() {
        if (f32158c == null) {
            synchronized (C14234g.class) {
                if (f32158c == null) {
                    f32158c = new C14232f(f32157b, f32156a);
                }
            }
        }
        return f32158c;
    }

    /* renamed from: b */
    private static int m1312b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            return (min / 4) * 3;
        }
        return min / 2;
    }
}
