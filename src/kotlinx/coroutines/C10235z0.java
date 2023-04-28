package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, m15073d2 = {"Lkotlinx/coroutines/z0;", "Lkotlinx/coroutines/a1;", "", "dispose", "", "toString", "Ljava/util/concurrent/Future;", "k", "Ljava/util/concurrent/Future;", "future", "<init>", "(Ljava/util/concurrent/Future;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.z0 */
/* loaded from: classes8.dex */
final class C10235z0 implements AbstractC10000a1 {

    /* renamed from: k */
    private final Future<?> f22489k;

    public C10235z0(Future<?> future) {
        this.f22489k = future;
    }

    @Override // kotlinx.coroutines.AbstractC10000a1
    public void dispose() {
        this.f22489k.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f22489k + ']';
    }
}
