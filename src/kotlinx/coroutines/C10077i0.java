package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import nf.C11067f;

@Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¨\u0006\t"}, m15073d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "a", "originalException", "thrownException", "b", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.i0 */
/* loaded from: classes8.dex */
public final class C10077i0 {
    /* renamed from: a */
    public static final void m14350a(CoroutineContext coroutineContext, Throwable th2) {
        try {
            AbstractC10068g0 g0Var = (AbstractC10068g0) coroutineContext.mo3484i(AbstractC10068g0.f22256d);
            if (g0Var != null) {
                g0Var.mo4547b0(coroutineContext, th2);
            } else {
                C10073h0.m14352a(coroutineContext, th2);
            }
        } catch (Throwable th3) {
            C10073h0.m14352a(coroutineContext, m14349b(th2, th3));
        }
    }

    /* renamed from: b */
    public static final Throwable m14349b(Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        C11067f.m10981a(runtimeException, th2);
        return runtimeException;
    }
}
