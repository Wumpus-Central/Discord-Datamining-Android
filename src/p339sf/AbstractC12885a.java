package p339sf;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m15073d2 = {"Lsf/a;", "Lkotlin/coroutines/CoroutineContext$b;", "Lkotlin/coroutines/CoroutineContext$c;", "k", "Lkotlin/coroutines/CoroutineContext$c;", "getKey", "()Lkotlin/coroutines/CoroutineContext$c;", "key", "<init>", "(Lkotlin/coroutines/CoroutineContext$c;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: sf.a */
/* loaded from: classes8.dex */
public abstract class AbstractC12885a implements CoroutineContext.AbstractC9924b {

    /* renamed from: k */
    private final CoroutineContext.AbstractC9926c<?> f28958k;

    public AbstractC12885a(CoroutineContext.AbstractC9926c<?> key) {
        C9971q.m14633g(key, "key");
        this.f28958k = key;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: f0 */
    public CoroutineContext mo3485f0(CoroutineContext coroutineContext) {
        return CoroutineContext.AbstractC9924b.C9925a.m14707d(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.AbstractC9924b
    public CoroutineContext.AbstractC9926c<?> getKey() {
        return this.f28958k;
    }

    @Override // kotlin.coroutines.CoroutineContext.AbstractC9924b, kotlin.coroutines.CoroutineContext
    /* renamed from: i */
    public <E extends CoroutineContext.AbstractC9924b> E mo3484i(CoroutineContext.AbstractC9926c<E> cVar) {
        return (E) CoroutineContext.AbstractC9924b.C9925a.m14709b(this, cVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: j0 */
    public CoroutineContext mo3483j0(CoroutineContext.AbstractC9926c<?> cVar) {
        return CoroutineContext.AbstractC9924b.C9925a.m14708c(this, cVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: w0 */
    public <R> R mo3482w0(R r, Function2<? super R, ? super CoroutineContext.AbstractC9924b, ? extends R> function2) {
        return (R) CoroutineContext.AbstractC9924b.C9925a.m14710a(this, r, function2);
    }
}
