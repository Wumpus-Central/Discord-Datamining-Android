package p390w;

import android.util.ArrayMap;
import java.util.Map;

/* renamed from: w.z1 */
/* loaded from: classes.dex */
public class C13708z1 extends C13671s2 {
    private C13708z1(Map<String, Object> map) {
        super(map);
    }

    /* renamed from: f */
    public static C13708z1 m2990f() {
        return new C13708z1(new ArrayMap());
    }

    /* renamed from: g */
    public static C13708z1 m2989g(C13671s2 s2Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : s2Var.m3088d()) {
            arrayMap.put(str, s2Var.m3089c(str));
        }
        return new C13708z1(arrayMap);
    }

    /* renamed from: e */
    public void m2991e(C13671s2 s2Var) {
        Map<String, Object> map;
        Map<String, Object> map2 = this.f30543a;
        if (map2 != null && (map = s2Var.f30543a) != null) {
            map2.putAll(map);
        }
    }

    /* renamed from: h */
    public void m2988h(String str, Object obj) {
        this.f30543a.put(str, obj);
    }
}
