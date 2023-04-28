package p278p5;

import com.facebook.common.references.CloseableReference;
import p394w3.AbstractC13741k;
import p455z3.AbstractC14530b;

/* renamed from: p5.s */
/* loaded from: classes7.dex */
public interface AbstractC11564s<K, V> extends AbstractC14530b {

    /* renamed from: p5.s$a */
    /* loaded from: classes7.dex */
    public interface AbstractC11565a {
    }

    /* renamed from: a */
    void mo9356a(K k);

    /* renamed from: b */
    CloseableReference<V> mo9355b(K k, CloseableReference<V> closeableReference);

    boolean contains(K k);

    /* renamed from: d */
    boolean mo9354d(AbstractC13741k<K> kVar);

    /* renamed from: e */
    int mo9353e(AbstractC13741k<K> kVar);

    CloseableReference<V> get(K k);
}
