package bj;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import p163j$.util.concurrent.ConcurrentHashMap;
import p446yf.C14376a;

@Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\u001e\u0010\n\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R,\u0010\n\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR*\u0010\u0010\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m15073d2 = {"Lbj/u;", "T", "Lbj/x1;", "Lkotlin/reflect/KClass;", "", "key", "Lkotlinx/serialization/KSerializer;", "a", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "compute", "j$/util/concurrent/ConcurrentHashMap", "Ljava/lang/Class;", "Lbj/k;", "b", "Lj$/util/concurrent/ConcurrentHashMap;", "cache", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.u */
/* loaded from: classes8.dex */
final class C3703u<T> implements AbstractC3716x1<T> {

    /* renamed from: a */
    private final Function1<KClass<?>, KSerializer<T>> f6020a;

    /* renamed from: b */
    private final ConcurrentHashMap<Class<?>, C3666k<T>> f6021b = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    public C3703u(Function1<? super KClass<?>, ? extends KSerializer<T>> compute) {
        C9971q.m14633g(compute, "compute");
        this.f6020a = compute;
    }

    @Override // bj.AbstractC3716x1
    /* renamed from: a */
    public KSerializer<T> mo33752a(KClass<Object> key) {
        C3666k<T> putIfAbsent;
        C9971q.m14633g(key, "key");
        ConcurrentHashMap<Class<?>, C3666k<T>> concurrentHashMap = this.f6021b;
        Class<?> b = C14376a.m737b(key);
        C3666k<T> kVar = concurrentHashMap.get(b);
        if (kVar == null && (putIfAbsent = concurrentHashMap.putIfAbsent(b, (kVar = new C3666k<>(this.f6020a.invoke(key))))) != null) {
            kVar = putIfAbsent;
        }
        return kVar.f5983a;
    }
}
