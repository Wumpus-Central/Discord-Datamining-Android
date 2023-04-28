package cc;

/* renamed from: cc.b0 */
/* loaded from: classes3.dex */
public abstract class AbstractC3826b0<K, V> extends AbstractC3833c0<K, V> {
    /* renamed from: w */
    public static <K, V> AbstractC3826b0<K, V> m33515w(K k, V v) {
        return new C3835c2(k, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final AbstractC3960w0<V> mo33271j() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: v */
    public abstract AbstractC3826b0<V, K> mo33499v();

    /* renamed from: x */
    public AbstractC3960w0<V> values() {
        return mo33499v().keySet();
    }
}
