package kotlinx.coroutines.scheduling;

import eg.C6882h;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlinx.coroutines.internal.C10089e0;
import kotlinx.coroutines.internal.C10093g0;

@Metadata(m15074d1 = {"\u0000 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0002\"\u0016\u0010\u000f\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0013\u001a\u00020\u00108\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00108\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, m15073d2 = {"", "a", "J", "WORK_STEALING_TIME_RESOLUTION_NS", "", "b", "I", "CORE_POOL_SIZE", "c", "MAX_POOL_SIZE", "d", "IDLE_WORKER_KEEP_ALIVE_NS", "Lkotlinx/coroutines/scheduling/g;", "e", "Lkotlinx/coroutines/scheduling/g;", "schedulerTimeSource", "Lkotlinx/coroutines/scheduling/i;", "f", "Lkotlinx/coroutines/scheduling/i;", "NonBlockingContext", "g", "BlockingContext", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.scheduling.l */
/* loaded from: classes8.dex */
public final class C10187l {

    /* renamed from: a */
    public static final long f22416a;

    /* renamed from: b */
    public static final int f22417b;

    /* renamed from: c */
    public static final int f22418c;

    /* renamed from: d */
    public static final long f22419d;

    /* renamed from: e */
    public static AbstractC10182g f22420e = C10180e.f22406a;

    /* renamed from: f */
    public static final AbstractC10184i f22421f = new C10185j(0);

    /* renamed from: g */
    public static final AbstractC10184i f22422g = new C10185j(1);

    static {
        long e;
        int d;
        int d2;
        long e2;
        e = C10093g0.m14308e("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f22416a = e;
        d = C10093g0.m14309d("kotlinx.coroutines.scheduler.core.pool.size", C6882h.m23978c(C10089e0.m14329a(), 2), 1, 0, 8, null);
        f22417b = d;
        d2 = C10093g0.m14309d("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f22418c = d2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        e2 = C10093g0.m14308e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f22419d = timeUnit.toNanos(e2);
    }
}
