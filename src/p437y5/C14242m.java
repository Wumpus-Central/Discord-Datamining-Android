package p437y5;

import android.util.SparseIntArray;

/* renamed from: y5.m */
/* loaded from: classes7.dex */
public class C14242m {

    /* renamed from: a */
    public static final int f32167a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static SparseIntArray m1298a(int i, int i2, int i3) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        while (i <= i2) {
            sparseIntArray.put(i, i3);
            i *= 2;
        }
        return sparseIntArray;
    }

    /* renamed from: b */
    public static C14257z m1297b() {
        int i = f32167a;
        return new C14257z(4194304, i * 4194304, m1298a(131072, 4194304, i), 131072, 4194304, i);
    }
}
