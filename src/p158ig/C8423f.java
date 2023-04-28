package p158ig;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import p163j$.util.concurrent.ConcurrentHashMap;

@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0016\u0010\t\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0005\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\t\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR$\u0010\r\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00028\u00000\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m15073d2 = {"Lig/f;", "V", "Lig/a;", "Ljava/lang/Class;", "key", "a", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "compute", "j$/util/concurrent/ConcurrentHashMap", "b", "Lj$/util/concurrent/ConcurrentHashMap;", "cache", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ig.f */
/* loaded from: classes8.dex */
final class C8423f<V> extends AbstractC8395a<V> {

    /* renamed from: a */
    private final Function1<Class<?>, V> f18369a;

    /* renamed from: b */
    private final ConcurrentHashMap<Class<?>, V> f18370b = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    public C8423f(Function1<? super Class<?>, ? extends V> compute) {
        C9971q.m14633g(compute, "compute");
        this.f18369a = compute;
    }

    @Override // p158ig.AbstractC8395a
    /* renamed from: a */
    public V mo19794a(Class<?> key) {
        C9971q.m14633g(key, "key");
        ConcurrentHashMap<Class<?>, V> concurrentHashMap = this.f18370b;
        V v = concurrentHashMap.get(key);
        if (v != null) {
            return v;
        }
        V invoke = this.f18369a.invoke(key);
        V putIfAbsent = concurrentHashMap.putIfAbsent(key, invoke);
        if (putIfAbsent == null) {
            return invoke;
        }
        return putIfAbsent;
    }
}
