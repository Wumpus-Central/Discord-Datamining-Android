package p267of;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C9971q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u000f\u001a\u001e\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\u001aQ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b\u001aQ\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\n\u0010\b\u001aa\u0010\r\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0010\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aI\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\t2\u001a\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004¢\u0006\u0004\b\u0013\u0010\u0014\u001a@\u0010\u0016\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\t2\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0015\u001a4\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0015\u001aQ\u0010\u001a\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u0018*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\t*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00152\u0006\u0010\u0019\u001a\u00028\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001aS\u0010\u001c\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u0018*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\t*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00042\u0006\u0010\u0019\u001a\u00028\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a2\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007\u001a2\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007\u001aM\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0015H\u0086\u0002\u001aI\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0014\u0010!\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\u0002\u001a0\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0000¨\u0006$"}, m15073d2 = {"K", "V", "", "h", "", "Lkotlin/Pair;", "pairs", "k", "([Lkotlin/Pair;)Ljava/util/Map;", "", "l", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "j", "([Lkotlin/Pair;)Ljava/util/HashMap;", "key", "i", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "", "q", "(Ljava/util/Map;[Lkotlin/Pair;)V", "", "p", "r", "M", "destination", "s", "(Ljava/lang/Iterable;Ljava/util/Map;)Ljava/util/Map;", "u", "([Lkotlin/Pair;Ljava/util/Map;)Ljava/util/Map;", "t", "v", "n", "map", "o", "m", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/collections/MapsKt")
/* renamed from: of.v */
/* loaded from: classes8.dex */
public class C11289v extends C11288u {
    /* renamed from: h */
    public static <K, V> Map<K, V> m10251h() {
        C11277j jVar = C11277j.f25201k;
        C9971q.m14635e(jVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return jVar;
    }

    /* renamed from: i */
    public static <K, V> V m10250i(Map<K, ? extends V> map, K k) {
        C9971q.m14633g(map, "<this>");
        return (V) C11287t.m10258a(map, k);
    }

    /* renamed from: j */
    public static <K, V> HashMap<K, V> m10249j(Pair<? extends K, ? extends V>... pairs) {
        C9971q.m14633g(pairs, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(C11286s.m10271d(pairs.length));
        m10242q(hashMap, pairs);
        return hashMap;
    }

    /* renamed from: k */
    public static <K, V> Map<K, V> m10248k(Pair<? extends K, ? extends V>... pairs) {
        C9971q.m14633g(pairs, "pairs");
        if (pairs.length > 0) {
            return m10238u(pairs, new LinkedHashMap(C11286s.m10271d(pairs.length)));
        }
        return C11286s.m10268h();
    }

    /* renamed from: l */
    public static <K, V> Map<K, V> m10247l(Pair<? extends K, ? extends V>... pairs) {
        C9971q.m14633g(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C11286s.m10271d(pairs.length));
        m10242q(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public static final <K, V> Map<K, V> m10246m(Map<K, ? extends V> map) {
        C9971q.m14633g(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return C11286s.m10268h();
        }
        if (size != 1) {
            return map;
        }
        return C11288u.m10253f(map);
    }

    /* renamed from: n */
    public static <K, V> Map<K, V> m10245n(Map<? extends K, ? extends V> map, Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        C9971q.m14633g(map, "<this>");
        C9971q.m14633g(pairs, "pairs");
        if (map.isEmpty()) {
            return C11286s.m10261r(pairs);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        m10243p(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* renamed from: o */
    public static <K, V> Map<K, V> m10244o(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        C9971q.m14633g(map, "<this>");
        C9971q.m14633g(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* renamed from: p */
    public static final <K, V> void m10243p(Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        C9971q.m14633g(map, "<this>");
        C9971q.m14633g(pairs, "pairs");
        Iterator<? extends Pair<? extends K, ? extends V>> it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            map.put((Object) pair.m15067a(), (Object) pair.m15066b());
        }
    }

    /* renamed from: q */
    public static final <K, V> void m10242q(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairs) {
        C9971q.m14633g(map, "<this>");
        C9971q.m14633g(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put((Object) pair.m15067a(), (Object) pair.m15066b());
        }
    }

    /* renamed from: r */
    public static <K, V> Map<K, V> m10241r(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Object obj;
        C9971q.m14633g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m10246m(m10240s(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C11286s.m10268h();
        }
        if (size != 1) {
            return m10240s(iterable, new LinkedHashMap(C11286s.m10271d(collection.size())));
        }
        if (iterable instanceof List) {
            obj = ((List) iterable).get(0);
        } else {
            obj = iterable.iterator().next();
        }
        return C11286s.m10270e((Pair) obj);
    }

    /* renamed from: s */
    public static final <K, V, M extends Map<? super K, ? super V>> M m10240s(Iterable<? extends Pair<? extends K, ? extends V>> iterable, M destination) {
        C9971q.m14633g(iterable, "<this>");
        C9971q.m14633g(destination, "destination");
        m10243p(destination, iterable);
        return destination;
    }

    /* renamed from: t */
    public static <K, V> Map<K, V> m10239t(Map<? extends K, ? extends V> map) {
        C9971q.m14633g(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return C11286s.m10268h();
        }
        if (size != 1) {
            return C11286s.m10259v(map);
        }
        return C11288u.m10253f(map);
    }

    /* renamed from: u */
    public static final <K, V, M extends Map<? super K, ? super V>> M m10238u(Pair<? extends K, ? extends V>[] pairArr, M destination) {
        C9971q.m14633g(pairArr, "<this>");
        C9971q.m14633g(destination, "destination");
        m10242q(destination, pairArr);
        return destination;
    }

    /* renamed from: v */
    public static <K, V> Map<K, V> m10237v(Map<? extends K, ? extends V> map) {
        C9971q.m14633g(map, "<this>");
        return new LinkedHashMap(map);
    }
}
