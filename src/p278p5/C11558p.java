package p278p5;

import com.facebook.common.references.CloseableReference;
import p394w3.AbstractC13741k;

/* renamed from: p5.p */
/* loaded from: classes7.dex */
public class C11558p<K, V> implements AbstractC11564s<K, V> {

    /* renamed from: a */
    private final AbstractC11564s<K, V> f25794a;

    /* renamed from: b */
    private final AbstractC11566t f25795b;

    public C11558p(AbstractC11564s<K, V> sVar, AbstractC11566t tVar) {
        this.f25794a = sVar;
        this.f25795b = tVar;
    }

    @Override // p278p5.AbstractC11564s
    /* renamed from: a */
    public void mo9356a(K k) {
        this.f25794a.mo9356a(k);
    }

    @Override // p278p5.AbstractC11564s
    /* renamed from: b */
    public CloseableReference<V> mo9355b(K k, CloseableReference<V> closeableReference) {
        this.f25795b.mo9350c(k);
        return this.f25794a.mo9355b(k, closeableReference);
    }

    @Override // p278p5.AbstractC11564s
    /* renamed from: d */
    public boolean mo9354d(AbstractC13741k<K> kVar) {
        return this.f25794a.mo9354d(kVar);
    }

    @Override // p278p5.AbstractC11564s
    /* renamed from: e */
    public int mo9353e(AbstractC13741k<K> kVar) {
        return this.f25794a.mo9353e(kVar);
    }

    @Override // p278p5.AbstractC11564s
    public CloseableReference<V> get(K k) {
        CloseableReference<V> closeableReference = this.f25794a.get(k);
        if (closeableReference == null) {
            this.f25795b.mo9351b(k);
        } else {
            this.f25795b.mo9352a(k);
        }
        return closeableReference;
    }
}
