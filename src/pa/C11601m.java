package pa;

/* renamed from: pa.m */
/* loaded from: classes3.dex */
public final class C11601m {
    /* renamed from: a */
    public static int m9285a(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m9284b(i, i2, "index"));
    }

    /* renamed from: b */
    private static String m9284b(int i, int i2, String str) {
        if (i < 0) {
            return C11607s.m9272a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C11607s.m9272a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i2);
        throw new IllegalArgumentException(sb2.toString());
    }
}
