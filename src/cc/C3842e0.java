package cc;

import java.io.Serializable;

/* renamed from: cc.e0 */
/* loaded from: classes3.dex */
class C3842e0<K, V> extends AbstractC3883i<K, V> implements Serializable {

    /* renamed from: k */
    final K f6367k;

    /* renamed from: l */
    final V f6368l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3842e0(K k, V v) {
        this.f6367k = k;
        this.f6368l = v;
    }

    @Override // cc.AbstractC3883i, java.util.Map.Entry
    public final K getKey() {
        return this.f6367k;
    }

    @Override // cc.AbstractC3883i, java.util.Map.Entry
    public final V getValue() {
        return this.f6368l;
    }

    @Override // cc.AbstractC3883i, java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
