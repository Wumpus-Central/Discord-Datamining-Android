package p233mi;

import ag.AbstractC1385a;
import java.util.Iterator;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;

/* renamed from: mi.a */
/* loaded from: classes8.dex */
public abstract class AbstractC10621a<K, V> implements Iterable<V>, AbstractC1385a {

    /* renamed from: mi.a$a */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC0343a<K, V, T extends V> {

        /* renamed from: a */
        private final KClass<? extends K> f23513a;

        /* renamed from: b */
        private final int f23514b;

        public AbstractC0343a(KClass<? extends K> key, int i) {
            C9971q.m14633g(key, "key");
            this.f23513a = key;
            this.f23514b = i;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Type inference failed for: r2v2, types: [T extends V, java.lang.Object] */
        /* renamed from: a */
        public final T m12713a(AbstractC10621a<K, V> thisRef) {
            C9971q.m14633g(thisRef, "thisRef");
            return thisRef.mo12709a().get(this.f23514b);
        }
    }

    /* renamed from: a */
    protected abstract AbstractC10623c<V> mo12709a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AbstractC10661s<K, V> mo12714b();

    public final boolean isEmpty() {
        return mo12709a().mo12695a() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<V> iterator() {
        return mo12709a().iterator();
    }
}
