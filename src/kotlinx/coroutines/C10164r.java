package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.C10092g;
import kotlinx.coroutines.internal.C10110p;

@Metadata(m15074d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u001a\u0018\u0010\t\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0018\u0010\f\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\r"}, m15073d2 = {"T", "Lkotlin/coroutines/Continuation;", "delegate", "Lkotlinx/coroutines/p;", "b", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlinx/coroutines/internal/p;", "node", "", "c", "Lkotlinx/coroutines/a1;", "handle", "a", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.r */
/* loaded from: classes8.dex */
public final class C10164r {
    /* renamed from: a */
    public static final void m14107a(CancellableContinuation<?> cancellableContinuation, AbstractC10000a1 a1Var) {
        cancellableContinuation.mo14131k(new C10004b1(a1Var));
    }

    /* renamed from: b */
    public static final <T> C10156p<T> m14106b(Continuation<? super T> continuation) {
        if (!(continuation instanceof C10092g)) {
            return new C10156p<>(continuation, 1);
        }
        C10156p<T> l = ((C10092g) continuation).m14319l();
        if (l != null) {
            if (!l.m14142K()) {
                l = null;
            }
            if (l != null) {
                return l;
            }
        }
        return new C10156p<>(continuation, 2);
    }

    /* renamed from: c */
    public static final void m14105c(CancellableContinuation<?> cancellableContinuation, C10110p pVar) {
        cancellableContinuation.mo14131k(new C10138k2(pVar));
    }
}
