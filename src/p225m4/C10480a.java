package p225m4;

import android.util.SparseIntArray;

/* renamed from: m4.a */
/* loaded from: classes7.dex */
public class C10480a {

    /* renamed from: a */
    private static final SparseIntArray f23144a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(7);
        f23144a = sparseIntArray;
        sparseIntArray.append(1, -7829368);
        sparseIntArray.append(2, -65536);
        sparseIntArray.append(3, -256);
        sparseIntArray.append(4, -256);
        sparseIntArray.append(5, -16711936);
        sparseIntArray.append(6, -16711936);
        sparseIntArray.append(7, -16711936);
    }

    /* renamed from: a */
    public static int m13080a(int i) {
        return f23144a.get(i, -1);
    }
}
