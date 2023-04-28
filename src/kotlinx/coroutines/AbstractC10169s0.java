package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

@Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u000f"}, m15073d2 = {"Lkotlinx/coroutines/s0;", "", "", "timeMillis", "Lkotlinx/coroutines/CancellableContinuation;", "", "continuation", "t", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/a1;", "R", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.s0 */
/* loaded from: classes8.dex */
public interface AbstractC10169s0 {

    @Metadata(m15072k = 3, m15071mv = {1, 6, 0}, m15069xi = 48)
    /* renamed from: kotlinx.coroutines.s0$a */
    /* loaded from: classes8.dex */
    public static final class C10170a {
        /* renamed from: a */
        public static AbstractC10000a1 m14098a(AbstractC10169s0 s0Var, long j, Runnable runnable, CoroutineContext coroutineContext) {
            return C10157p0.m14115a().mo4537R(j, runnable, coroutineContext);
        }
    }

    /* renamed from: R */
    AbstractC10000a1 mo4537R(long j, Runnable runnable, CoroutineContext coroutineContext);

    /* renamed from: t */
    void mo4538t(long j, CancellableContinuation<? super Unit> cancellableContinuation);
}
