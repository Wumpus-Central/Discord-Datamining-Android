package vi;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

@Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J8\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0003¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0096\u0001J\u0011\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0096\u0003R\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, m15073d2 = {"Lvi/h;", "Lkotlin/coroutines/CoroutineContext;", "R", "initial", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$b;", "operation", "w0", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "E", "Lkotlin/coroutines/CoroutineContext$c;", "key", "i", "(Lkotlin/coroutines/CoroutineContext$c;)Lkotlin/coroutines/CoroutineContext$b;", "j0", "context", "f0", "", "k", "Ljava/lang/Throwable;", "e", "originalContext", "<init>", "(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: vi.h */
/* loaded from: classes8.dex */
public final class C13521h implements CoroutineContext {

    /* renamed from: k */
    public final Throwable f30212k;

    /* renamed from: l */
    private final /* synthetic */ CoroutineContext f30213l;

    public C13521h(Throwable th2, CoroutineContext coroutineContext) {
        this.f30212k = th2;
        this.f30213l = coroutineContext;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: f0 */
    public CoroutineContext mo3485f0(CoroutineContext coroutineContext) {
        return this.f30213l.mo3485f0(coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: i */
    public <E extends CoroutineContext.AbstractC9924b> E mo3484i(CoroutineContext.AbstractC9926c<E> cVar) {
        return (E) this.f30213l.mo3484i(cVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: j0 */
    public CoroutineContext mo3483j0(CoroutineContext.AbstractC9926c<?> cVar) {
        return this.f30213l.mo3483j0(cVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: w0 */
    public <R> R mo3482w0(R r, Function2<? super R, ? super CoroutineContext.AbstractC9924b, ? extends R> function2) {
        return (R) this.f30213l.mo3482w0(r, function2);
    }
}
