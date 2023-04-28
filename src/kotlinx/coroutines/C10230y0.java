package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.C10122u;
import kotlinx.coroutines.scheduling.C10178c;
import kotlinx.coroutines.scheduling.ExecutorC10177b;

@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\bR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u0012\u0004\b\f\u0010\b\u001a\u0004\b\u000b\u0010\u0006R \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u0012\u0004\b\u000f\u0010\b\u001a\u0004\b\u0003\u0010\u0006R\u001a\u0010\u0014\u001a\u00020\u00118FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\b\u001a\u0004\b\n\u0010\u0012¨\u0006\u0016"}, m15073d2 = {"Lkotlinx/coroutines/y0;", "", "Lkotlinx/coroutines/CoroutineDispatcher;", "b", "Lkotlinx/coroutines/CoroutineDispatcher;", "a", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getDefault$annotations", "()V", "Default", "c", "getUnconfined", "getUnconfined$annotations", "Unconfined", "d", "getIO$annotations", "IO", "Lkotlinx/coroutines/f2;", "()Lkotlinx/coroutines/f2;", "getMain$annotations", "Main", "<init>", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.y0 */
/* loaded from: classes8.dex */
public final class C10230y0 {

    /* renamed from: a */
    public static final C10230y0 f22481a = new C10230y0();

    /* renamed from: b */
    private static final CoroutineDispatcher f22482b = C10178c.f22405s;

    /* renamed from: c */
    private static final CoroutineDispatcher f22483c = C10220v2.f22471m;

    /* renamed from: d */
    private static final CoroutineDispatcher f22484d = ExecutorC10177b.f22403n;

    private C10230y0() {
    }

    /* renamed from: a */
    public static final CoroutineDispatcher m13947a() {
        return f22482b;
    }

    /* renamed from: b */
    public static final CoroutineDispatcher m13946b() {
        return f22484d;
    }

    /* renamed from: c */
    public static final AbstractC10034f2 m13945c() {
        return C10122u.f22331c;
    }
}
