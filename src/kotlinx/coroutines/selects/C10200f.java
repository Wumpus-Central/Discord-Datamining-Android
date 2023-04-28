package kotlinx.coroutines.selects;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m15073d2 = {"Lkotlinx/coroutines/selects/f;", "", "", "a", "()J", "<init>", "()V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.selects.f */
/* loaded from: classes8.dex */
public final class C10200f {

    /* renamed from: a */
    private static final /* synthetic */ AtomicLongFieldUpdater f22445a = AtomicLongFieldUpdater.newUpdater(C10200f.class, "number");
    private volatile /* synthetic */ long number = 1;

    /* renamed from: a */
    public final long m14010a() {
        return f22445a.incrementAndGet(this);
    }
}
