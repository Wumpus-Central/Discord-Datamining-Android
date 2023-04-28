package p278p5;

import com.facebook.common.references.CloseableReference;
import p394w3.C13740j;
import p455z3.AbstractC14530b;

/* renamed from: p5.i */
/* loaded from: classes7.dex */
public interface AbstractC11547i<K, V> extends AbstractC11564s<K, V>, AbstractC14530b {

    /* renamed from: p5.i$a */
    /* loaded from: classes7.dex */
    public static class C11548a<K, V> {

        /* renamed from: a */
        public final K f25785a;

        /* renamed from: b */
        public final CloseableReference<V> f25786b;

        /* renamed from: e */
        public final AbstractC11549b<K> f25789e;

        /* renamed from: c */
        public int f25787c = 0;

        /* renamed from: d */
        public boolean f25788d = false;

        /* renamed from: f */
        public int f25790f = 0;

        private C11548a(K k, CloseableReference<V> closeableReference, AbstractC11549b<K> bVar) {
            this.f25785a = (K) C13740j.m2834g(k);
            this.f25786b = (CloseableReference) C13740j.m2834g(CloseableReference.m32027r(closeableReference));
            this.f25789e = bVar;
        }

        /* renamed from: a */
        public static <K, V> C11548a<K, V> m9399a(K k, CloseableReference<V> closeableReference, AbstractC11549b<K> bVar) {
            return new C11548a<>(k, closeableReference, bVar);
        }
    }

    /* renamed from: p5.i$b */
    /* loaded from: classes7.dex */
    public interface AbstractC11549b<K> {
        /* renamed from: a */
        void mo9398a(K k, boolean z);
    }

    /* renamed from: c */
    CloseableReference<V> mo9379c(K k);

    /* renamed from: f */
    CloseableReference<V> mo9378f(K k, CloseableReference<V> closeableReference, AbstractC11549b<K> bVar);
}
