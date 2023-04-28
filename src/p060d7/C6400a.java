package p060d7;

import android.util.SparseArray;
import java.util.HashMap;
import p279p6.EnumC11574d;

/* renamed from: d7.a */
/* loaded from: classes7.dex */
public final class C6400a {

    /* renamed from: a */
    private static SparseArray<EnumC11574d> f13377a = new SparseArray<>();

    /* renamed from: b */
    private static HashMap<EnumC11574d, Integer> f13378b;

    static {
        HashMap<EnumC11574d, Integer> hashMap = new HashMap<>();
        f13378b = hashMap;
        hashMap.put(EnumC11574d.DEFAULT, 0);
        f13378b.put(EnumC11574d.VERY_LOW, 1);
        f13378b.put(EnumC11574d.HIGHEST, 2);
        for (EnumC11574d dVar : f13378b.keySet()) {
            f13377a.append(f13378b.get(dVar).intValue(), dVar);
        }
    }

    /* renamed from: a */
    public static int m25618a(EnumC11574d dVar) {
        Integer num = f13378b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    /* renamed from: b */
    public static EnumC11574d m25617b(int i) {
        EnumC11574d dVar = f13377a.get(i);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
