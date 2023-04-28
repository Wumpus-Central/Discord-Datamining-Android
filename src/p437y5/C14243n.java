package p437y5;

import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import p163j$.util.Spliterator;

/* renamed from: y5.n */
/* loaded from: classes7.dex */
public class C14243n {
    /* renamed from: a */
    public static C14257z m1296a() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(Spliterator.IMMUTABLE, 5);
        sparseIntArray.put(RecyclerView.ItemAnimator.FLAG_MOVED, 5);
        sparseIntArray.put(4096, 5);
        sparseIntArray.put(8192, 5);
        sparseIntArray.put(Spliterator.SUBSIZED, 5);
        sparseIntArray.put(32768, 5);
        sparseIntArray.put(65536, 5);
        sparseIntArray.put(131072, 5);
        sparseIntArray.put(262144, 2);
        sparseIntArray.put(524288, 2);
        sparseIntArray.put(1048576, 2);
        return new C14257z(m1294c(), m1295b(), sparseIntArray);
    }

    /* renamed from: b */
    private static int m1295b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return min / 2;
        }
        return (min / 4) * 3;
    }

    /* renamed from: c */
    private static int m1294c() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return 3145728;
        }
        return min < 33554432 ? 6291456 : 12582912;
    }
}
