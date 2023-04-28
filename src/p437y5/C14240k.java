package p437y5;

import android.util.SparseIntArray;

/* renamed from: y5.k */
/* loaded from: classes7.dex */
public class C14240k {

    /* renamed from: a */
    private static final SparseIntArray f32166a = new SparseIntArray(0);

    /* renamed from: a */
    public static C14257z m1301a() {
        return new C14257z(0, m1300b(), f32166a);
    }

    /* renamed from: b */
    private static int m1300b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            return (min / 4) * 3;
        }
        return min / 2;
    }
}
