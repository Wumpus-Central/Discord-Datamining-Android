package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m15073d2 = {"Lkotlinx/coroutines/x2;", "Lkotlin/coroutines/CoroutineContext$b;", "Lkotlin/coroutines/CoroutineContext$c;", "getKey", "()Lkotlin/coroutines/CoroutineContext$c;", "key", "<init>", "()V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.x2 */
/* loaded from: classes8.dex */
public final class C10228x2 implements CoroutineContext.AbstractC9924b, CoroutineContext.AbstractC9926c<C10228x2> {

    /* renamed from: k */
    public static final C10228x2 f22475k = new C10228x2();

    private C10228x2() {
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: f0 */
    public CoroutineContext mo3485f0(CoroutineContext coroutineContext) {
        return CoroutineContext.AbstractC9924b.C9925a.m14707d(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.AbstractC9924b
    public CoroutineContext.AbstractC9926c<?> getKey() {
        return this;
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
