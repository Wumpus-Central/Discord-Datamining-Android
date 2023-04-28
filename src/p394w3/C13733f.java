package p394w3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: w3.f */
/* loaded from: classes7.dex */
public class C13733f<K, V> extends HashMap<K, V> {
    private C13733f(Map<? extends K, ? extends V> map) {
        super(map);
    }

    /* renamed from: a */
    public static <K, V> C13733f<K, V> m2853a(Map<? extends K, ? extends V> map) {
        return new C13733f<>(map);
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m2852of(K k, V v) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(k, v);
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m2851of(K k, V v, K k2, V v2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        return Collections.unmodifiableMap(hashMap);
    }
}
