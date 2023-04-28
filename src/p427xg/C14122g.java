package p427xg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9971q;
import nf.C11098x;
import p217lg.C10434k;
import p249nh.C11137c;
import p249nh.C11138d;
import p249nh.C11142f;
import p267of.C11288u;
import p267of.C11289v;

/* renamed from: xg.g */
/* loaded from: classes8.dex */
public final class C14122g {

    /* renamed from: a */
    public static final C14122g f31903a = new C14122g();

    /* renamed from: b */
    private static final Map<C11137c, C11142f> f31904b;

    /* renamed from: c */
    private static final Map<C11142f, List<C11142f>> f31905c;

    /* renamed from: d */
    private static final Set<C11137c> f31906d;

    /* renamed from: e */
    private static final Set<C11142f> f31907e;

    static {
        C11137c d;
        C11137c d2;
        C11137c c;
        C11137c c2;
        C11137c d3;
        C11137c c3;
        C11137c c4;
        C11137c c5;
        Map<C11137c, C11142f> k;
        int t;
        int d4;
        int t2;
        Set<C11142f> H0;
        List N;
        C11138d dVar = C10434k.C10435a.f22936s;
        d = C14125h.m1581d(dVar, "name");
        d2 = C14125h.m1581d(dVar, "ordinal");
        c = C14125h.m1582c(C10434k.C10435a.f38795U, "size");
        C11137c cVar = C10434k.C10435a.f38799Y;
        c2 = C14125h.m1582c(cVar, "size");
        d3 = C14125h.m1581d(C10434k.C10435a.f22912g, "length");
        c3 = C14125h.m1582c(cVar, "keys");
        c4 = C14125h.m1582c(cVar, "values");
        c5 = C14125h.m1582c(cVar, "entries");
        k = C11289v.m10248k(C11098x.m10921a(d, C11142f.m10767f("name")), C11098x.m10921a(d2, C11142f.m10767f("ordinal")), C11098x.m10921a(c, C11142f.m10767f("size")), C11098x.m10921a(c2, C11142f.m10767f("size")), C11098x.m10921a(d3, C11142f.m10767f("length")), C11098x.m10921a(c3, C11142f.m10767f("keySet")), C11098x.m10921a(c4, C11142f.m10767f("values")), C11098x.m10921a(c5, C11142f.m10767f("entrySet")));
        f31904b = k;
        Set<Map.Entry<C11137c, C11142f>> entrySet = k.entrySet();
        t = C9907k.m14809t(entrySet, 10);
        ArrayList<Pair> arrayList = new ArrayList(t);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new Pair(((C11137c) entry.getKey()).m10798g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            C11142f fVar = (C11142f) pair.m15064d();
            Object obj = linkedHashMap.get(fVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(fVar, obj);
            }
            ((List) obj).add((C11142f) pair.m15065c());
        }
        d4 = C11288u.m10255d(linkedHashMap.size());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d4);
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            N = C9914r.m14777N((Iterable) entry2.getValue());
            linkedHashMap2.put(key, N);
        }
        f31905c = linkedHashMap2;
        Set<C11137c> keySet = f31904b.keySet();
        f31906d = keySet;
        t2 = C9907k.m14809t(keySet, 10);
        ArrayList arrayList2 = new ArrayList(t2);
        for (C11137c cVar2 : keySet) {
            arrayList2.add(cVar2.m10798g());
        }
        H0 = C9914r.m14786H0(arrayList2);
        f31907e = H0;
    }

    private C14122g() {
    }

    /* renamed from: a */
    public final Map<C11137c, C11142f> m1592a() {
        return f31904b;
    }

    /* renamed from: b */
    public final List<C11142f> m1591b(C11142f name1) {
        List<C11142f> i;
        C9971q.m14633g(name1, "name1");
        List<C11142f> list = f31905c.get(name1);
        if (list != null) {
            return list;
        }
        i = C9906j.m14820i();
        return i;
    }

    /* renamed from: c */
    public final Set<C11137c> m1590c() {
        return f31906d;
    }

    /* renamed from: d */
    public final Set<C11142f> m1589d() {
        return f31907e;
    }
}
