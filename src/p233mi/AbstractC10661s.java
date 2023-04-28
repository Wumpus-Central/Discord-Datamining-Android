package p233mi;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: mi.s */
/* loaded from: classes8.dex */
public abstract class AbstractC10661s<K, V> {

    /* renamed from: a */
    private final ConcurrentHashMap<KClass<? extends K>, Integer> f23586a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final AtomicInteger f23587b = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mi.s$a */
    /* loaded from: classes8.dex */
    public static final class C10662a extends AbstractC9973s implements Function1<KClass<? extends K>, Integer> {

        /* renamed from: k */
        final /* synthetic */ AbstractC10661s<K, V> f23588k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10662a(AbstractC10661s<K, V> sVar) {
            super(1);
            this.f23588k = sVar;
        }

        /* renamed from: a */
        public final Integer invoke(KClass<? extends K> it) {
            C9971q.m14633g(it, "it");
            return Integer.valueOf(((AbstractC10661s) this.f23588k).f23587b.getAndIncrement());
        }
    }

    /* renamed from: b */
    public abstract <T extends K> int mo12680b(ConcurrentHashMap<KClass<? extends K>, Integer> concurrentHashMap, KClass<T> kClass, Function1<? super KClass<? extends K>, Integer> function1);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final <T extends V, KK extends K> C10647n<K, V, T> m12679c(KClass<KK> kClass) {
        C9971q.m14633g(kClass, "kClass");
        return new C10647n<>(kClass, m12678d(kClass));
    }

    /* renamed from: d */
    public final <T extends K> int m12678d(KClass<T> kClass) {
        C9971q.m14633g(kClass, "kClass");
        return mo12680b(this.f23586a, kClass, new C10662a(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final Collection<Integer> m12677e() {
        Collection<Integer> values = this.f23586a.values();
        C9971q.m14634f(values, "idPerType.values");
        return values;
    }
}
