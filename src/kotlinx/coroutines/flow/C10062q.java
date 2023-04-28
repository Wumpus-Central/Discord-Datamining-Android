package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C10087d0;
import p372ui.EnumC13337e;
import vi.C13529m;

@Metadata(m15074d1 = {"\u00000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a6\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000\"\u001a\u0010\u0012\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0015\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u0012\u0004\b\u0014\u0010\u0011¨\u0006\u0016"}, m15073d2 = {"T", "value", "Lkotlinx/coroutines/flow/MutableStateFlow;", "a", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/o;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lui/e;", "onBufferOverflow", "Lkotlinx/coroutines/flow/Flow;", "d", "Lkotlinx/coroutines/internal/d0;", "Lkotlinx/coroutines/internal/d0;", "getNONE$annotations", "()V", "NONE", "b", "getPENDING$annotations", "PENDING", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.q */
/* loaded from: classes8.dex */
public final class C10062q {

    /* renamed from: a */
    private static final C10087d0 f22245a = new C10087d0("NONE");

    /* renamed from: b */
    private static final C10087d0 f22246b = new C10087d0("PENDING");

    /* renamed from: a */
    public static final <T> MutableStateFlow<T> m14364a(T t) {
        if (t == null) {
            t = (T) C13529m.f30221a;
        }
        return new C10060p(t);
    }

    /* renamed from: d */
    public static final <T> Flow<T> m14361d(AbstractC10059o<? extends T> oVar, CoroutineContext coroutineContext, int i, EnumC13337e eVar) {
        boolean z = false;
        if (i >= 0 && i < 2) {
            z = true;
        }
        if ((z || i == -2) && eVar == EnumC13337e.DROP_OLDEST) {
            return oVar;
        }
        return C10057m.m14372d(oVar, coroutineContext, i, eVar);
    }
}
