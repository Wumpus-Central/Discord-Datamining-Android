package cc;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cc.c */
/* loaded from: classes3.dex */
public abstract class AbstractC3832c<K, V> extends AbstractC3849g<K, V> implements AbstractC3843e1<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3832c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // cc.AbstractC3849g
    /* renamed from: D */
    <E> Collection<E> mo33486D(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // cc.AbstractC3849g
    /* renamed from: E */
    Collection<V> mo33485E(K k, Collection<V> collection) {
        return m33484F(k, (List) collection, null);
    }

    /* renamed from: G */
    public List<V> get(K k) {
        return (List) super.get(k);
    }

    @Override // cc.AbstractC3889j, cc.AbstractC3897k1
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // cc.AbstractC3889j
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // cc.AbstractC3849g, cc.AbstractC3897k1
    public boolean put(K k, V v) {
        return super.put(k, v);
    }
}
