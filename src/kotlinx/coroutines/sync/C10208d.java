package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlinx.coroutines.internal.C10087d0;

@Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000\"\u001a\u0010\b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u0012\u0004\b\n\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u0012\u0004\b\r\u0010\u0007\"\u001a\u0010\u0011\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u0012\u0004\b\u0010\u0010\u0007\"\u001a\u0010\u0016\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u0007\"\u001a\u0010\u0019\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u0012\u0004\b\u0018\u0010\u0007¨\u0006\u001a"}, m15073d2 = {"", "locked", "Lkotlinx/coroutines/sync/b;", "a", "Lkotlinx/coroutines/internal/d0;", "Lkotlinx/coroutines/internal/d0;", "getLOCK_FAIL$annotations", "()V", "LOCK_FAIL", "b", "getUNLOCK_FAIL$annotations", "UNLOCK_FAIL", "c", "getLOCKED$annotations", "LOCKED", "d", "getUNLOCKED$annotations", "UNLOCKED", "Lkotlinx/coroutines/sync/a;", "e", "Lkotlinx/coroutines/sync/a;", "getEMPTY_LOCKED$annotations", "EMPTY_LOCKED", "f", "getEMPTY_UNLOCKED$annotations", "EMPTY_UNLOCKED", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.sync.d */
/* loaded from: classes8.dex */
public final class C10208d {

    /* renamed from: a */
    private static final C10087d0 f22458a = new C10087d0("LOCK_FAIL");

    /* renamed from: b */
    private static final C10087d0 f22459b = new C10087d0("UNLOCK_FAIL");

    /* renamed from: c */
    private static final C10087d0 f22460c;

    /* renamed from: d */
    private static final C10087d0 f22461d;

    /* renamed from: e */
    private static final C10201a f22462e;

    /* renamed from: f */
    private static final C10201a f22463f;

    static {
        C10087d0 d0Var = new C10087d0("LOCKED");
        f22460c = d0Var;
        C10087d0 d0Var2 = new C10087d0("UNLOCKED");
        f22461d = d0Var2;
        f22462e = new C10201a(d0Var);
        f22463f = new C10201a(d0Var2);
    }

    /* renamed from: a */
    public static final AbstractC10202b m13999a(boolean z) {
        return new C10203c(z);
    }

    /* renamed from: b */
    public static /* synthetic */ AbstractC10202b m13998b(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m13999a(z);
    }
}
