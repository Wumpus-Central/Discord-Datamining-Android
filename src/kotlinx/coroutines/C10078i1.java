package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.C10087d0;

@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\"\u001a\u0010\b\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u0012\u0004\b\n\u0010\u0007*\u001e\b\u0002\u0010\u000e\u001a\u0004\b\u0000\u0010\f\"\b\u0012\u0004\u0012\u00028\u00000\r2\b\u0012\u0004\u0012\u00028\u00000\r¨\u0006\u000f"}, m15073d2 = {"", "timeMillis", "c", "Lkotlinx/coroutines/internal/d0;", "a", "Lkotlinx/coroutines/internal/d0;", "getDISPOSED_TASK$annotations", "()V", "DISPOSED_TASK", "b", "getCLOSED_EMPTY$annotations", "CLOSED_EMPTY", "T", "Lkotlinx/coroutines/internal/s;", "Queue", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.i1 */
/* loaded from: classes8.dex */
public final class C10078i1 {

    /* renamed from: a */
    private static final C10087d0 f22263a = new C10087d0("REMOVED_TASK");

    /* renamed from: b */
    private static final C10087d0 f22264b = new C10087d0("CLOSED_EMPTY");

    /* renamed from: c */
    public static final long m14346c(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j;
    }
}
