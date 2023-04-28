package p339sf;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.AbstractC9924b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u0004B+\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00010\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m15073d2 = {"Lsf/b;", "Lkotlin/coroutines/CoroutineContext$b;", "B", "E", "Lkotlin/coroutines/CoroutineContext$c;", "element", "b", "(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$b;", "key", "", "a", "(Lkotlin/coroutines/CoroutineContext$c;)Z", "Lkotlin/Function1;", "k", "Lkotlin/jvm/functions/Function1;", "safeCast", "l", "Lkotlin/coroutines/CoroutineContext$c;", "topmostKey", "baseKey", "<init>", "(Lkotlin/coroutines/CoroutineContext$c;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: sf.b */
/* loaded from: classes8.dex */
public abstract class AbstractC12886b<B extends CoroutineContext.AbstractC9924b, E extends B> implements CoroutineContext.AbstractC9926c<E> {

    /* renamed from: k */
    private final Function1<CoroutineContext.AbstractC9924b, E> f28959k;

    /* renamed from: l */
    private final CoroutineContext.AbstractC9926c<?> f28960l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1<? super kotlin.coroutines.CoroutineContext$b, ? extends E extends B>, kotlin.jvm.functions.Function1<kotlin.coroutines.CoroutineContext$b, E extends B>, java.lang.Object] */
    public AbstractC12886b(CoroutineContext.AbstractC9926c<B> baseKey, Function1<? super CoroutineContext.AbstractC9924b, ? extends E> safeCast) {
        C9971q.m14633g(baseKey, "baseKey");
        C9971q.m14633g(safeCast, "safeCast");
        this.f28959k = safeCast;
        this.f28960l = baseKey instanceof AbstractC12886b ? (CoroutineContext.AbstractC9926c<B>) ((AbstractC12886b) baseKey).f28960l : baseKey;
    }

    /* renamed from: a */
    public final boolean m5189a(CoroutineContext.AbstractC9926c<?> key) {
        C9971q.m14633g(key, "key");
        if (key == this || this.f28960l == key) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/coroutines/CoroutineContext$b;)TE; */
    /* renamed from: b */
    public final CoroutineContext.AbstractC9924b m5188b(CoroutineContext.AbstractC9924b element) {
        C9971q.m14633g(element, "element");
        return (CoroutineContext.AbstractC9924b) this.f28959k.invoke(element);
    }
}
