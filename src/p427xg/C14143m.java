package p427xg;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C9971q;
import nf.C11098x;
import p249nh.C11136b;
import p249nh.C11137c;
import p249nh.C11145i;
import p267of.C11289v;

/* renamed from: xg.m */
/* loaded from: classes8.dex */
public final class C14143m {

    /* renamed from: a */
    public static final C14143m f31949a;

    /* renamed from: b */
    private static final Map<C11136b, C11136b> f31950b;

    /* renamed from: c */
    private static final Map<C11137c, C11137c> f31951c;

    static {
        Map<C11137c, C11137c> r;
        C14143m mVar = new C14143m();
        f31949a = mVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f31950b = linkedHashMap;
        C11145i iVar = C11145i.f24751a;
        mVar.m1527c(iVar.m10749l(), mVar.m1529a("java.util.ArrayList", "java.util.LinkedList"));
        mVar.m1527c(iVar.m10747n(), mVar.m1529a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        mVar.m1527c(iVar.m10748m(), mVar.m1529a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        C11136b m = C11136b.m10805m(new C11137c("java.util.function.Function"));
        C9971q.m14634f(m, "topLevel(FqName(\"java.util.function.Function\"))");
        mVar.m1527c(m, mVar.m1529a("java.util.function.UnaryOperator"));
        C11136b m2 = C11136b.m10805m(new C11137c("java.util.function.BiFunction"));
        C9971q.m14634f(m2, "topLevel(FqName(\"java.util.function.BiFunction\"))");
        mVar.m1527c(m2, mVar.m1529a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(C11098x.m10921a(((C11136b) entry.getKey()).m10816b(), ((C11136b) entry.getValue()).m10816b()));
        }
        r = C11289v.m10241r(arrayList);
        f31951c = r;
    }

    private C14143m() {
    }

    /* renamed from: a */
    private final List<C11136b> m1529a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C11136b.m10805m(new C11137c(str)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    private final void m1527c(C11136b bVar, List<C11136b> list) {
        Map<C11136b, C11136b> map = f31950b;
        for (Object obj : list) {
            C11136b bVar2 = (C11136b) obj;
            map.put(obj, bVar);
        }
    }

    /* renamed from: b */
    public final C11137c m1528b(C11137c classFqName) {
        C9971q.m14633g(classFqName, "classFqName");
        return f31951c.get(classFqName);
    }
}
