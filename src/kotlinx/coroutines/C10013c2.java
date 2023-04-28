package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.C10087d0;

@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\"\u001a\u0010\b\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u0012\u0004\b\n\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u0012\u0004\b\r\u0010\u0007\"\u001a\u0010\u0011\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u0012\u0004\b\u0010\u0010\u0007\"\u001a\u0010\u0014\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0005\u0012\u0004\b\u0013\u0010\u0007\"\u001a\u0010\u0019\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0007\"\u001a\u0010\u001b\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0017\u0012\u0004\b\u001a\u0010\u0007¨\u0006\u001c"}, m15073d2 = {"", "g", "h", "Lkotlinx/coroutines/internal/d0;", "a", "Lkotlinx/coroutines/internal/d0;", "getCOMPLETING_ALREADY$annotations", "()V", "COMPLETING_ALREADY", "b", "getCOMPLETING_WAITING_CHILDREN$annotations", "COMPLETING_WAITING_CHILDREN", "c", "getCOMPLETING_RETRY$annotations", "COMPLETING_RETRY", "d", "getTOO_LATE_TO_CANCEL$annotations", "TOO_LATE_TO_CANCEL", "e", "getSEALED$annotations", "SEALED", "Lkotlinx/coroutines/d1;", "f", "Lkotlinx/coroutines/d1;", "getEMPTY_NEW$annotations", "EMPTY_NEW", "getEMPTY_ACTIVE$annotations", "EMPTY_ACTIVE", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.c2 */
/* loaded from: classes8.dex */
public final class C10013c2 {

    /* renamed from: a */
    private static final C10087d0 f22141a = new C10087d0("COMPLETING_ALREADY");

    /* renamed from: b */
    public static final C10087d0 f22142b = new C10087d0("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c */
    private static final C10087d0 f22143c = new C10087d0("COMPLETING_RETRY");

    /* renamed from: d */
    private static final C10087d0 f22144d = new C10087d0("TOO_LATE_TO_CANCEL");

    /* renamed from: e */
    private static final C10087d0 f22145e = new C10087d0("SEALED");

    /* renamed from: f */
    private static final C10016d1 f22146f = new C10016d1(false);

    /* renamed from: g */
    private static final C10016d1 f22147g = new C10016d1(true);

    /* renamed from: g */
    public static final Object m14489g(Object obj) {
        return obj instanceof AbstractC10158p1 ? new C10162q1((AbstractC10158p1) obj) : obj;
    }

    /* renamed from: h */
    public static final Object m14488h(Object obj) {
        AbstractC10158p1 p1Var;
        C10162q1 q1Var = obj instanceof C10162q1 ? (C10162q1) obj : null;
        return (q1Var == null || (p1Var = q1Var.f22368a) == null) ? obj : p1Var;
    }
}
