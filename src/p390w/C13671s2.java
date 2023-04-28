package p390w;

import android.util.ArrayMap;
import java.util.Map;
import java.util.Set;

/* renamed from: w.s2 */
/* loaded from: classes.dex */
public class C13671s2 {

    /* renamed from: b */
    private static final C13671s2 f30542b = new C13671s2(new ArrayMap());

    /* renamed from: a */
    protected final Map<String, Object> f30543a;

    /* JADX INFO: Access modifiers changed from: protected */
    public C13671s2(Map<String, Object> map) {
        this.f30543a = map;
    }

    /* renamed from: a */
    public static C13671s2 m3091a() {
        return f30542b;
    }

    /* renamed from: b */
    public static C13671s2 m3090b(C13671s2 s2Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : s2Var.m3088d()) {
            arrayMap.put(str, s2Var.m3089c(str));
        }
        return new C13671s2(arrayMap);
    }

    /* renamed from: c */
    public Object m3089c(String str) {
        return this.f30543a.get(str);
    }

    /* renamed from: d */
    public Set<String> m3088d() {
        return this.f30543a.keySet();
    }
}
