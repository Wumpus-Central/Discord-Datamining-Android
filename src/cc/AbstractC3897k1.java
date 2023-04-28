package cc;

import java.util.Collection;
import java.util.Map;

/* renamed from: cc.k1 */
/* loaded from: classes3.dex */
public interface AbstractC3897k1<K, V> {
    /* renamed from: a */
    Collection<Map.Entry<K, V>> mo33300a();

    Map<K, Collection<V>> asMap();

    /* renamed from: b */
    boolean mo33299b(Object obj, Object obj2);

    void clear();

    Collection<V> get(K k);

    boolean put(K k, V v);

    boolean remove(Object obj, Object obj2);

    int size();

    Collection<V> values();
}
