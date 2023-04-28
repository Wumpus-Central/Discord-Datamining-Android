package kotlinx.coroutines.scheduling;

import eg.C6884j;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractC10136k1;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.C10089e0;
import kotlinx.coroutines.internal.C10093g0;
import p339sf.C12893f;

@Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0016J\u001c\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0017J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m15073d2 = {"Lkotlinx/coroutines/scheduling/b;", "Lkotlinx/coroutines/k1;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "", "execute", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/Runnable;", "block", "G0", "H0", "close", "", "toString", "Lkotlinx/coroutines/CoroutineDispatcher;", "o", "Lkotlinx/coroutines/CoroutineDispatcher;", "default", "<init>", "()V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.scheduling.b */
/* loaded from: classes8.dex */
public final class ExecutorC10177b extends AbstractC10136k1 implements Executor {

    /* renamed from: n */
    public static final ExecutorC10177b f22403n = new ExecutorC10177b();

    /* renamed from: o */
    private static final CoroutineDispatcher f22404o;

    static {
        int c;
        int d;
        C10188m mVar = C10188m.f22423m;
        c = C6884j.m23961c(64, C10089e0.m14329a());
        d = C10093g0.m14309d("kotlinx.coroutines.io.parallelism", c, 0, 0, 12, null);
        f22404o = mVar.m14573J0(d);
    }

    private ExecutorC10177b() {
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: G0 */
    public void mo4546G0(CoroutineContext coroutineContext, Runnable runnable) {
        f22404o.mo4546G0(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: H0 */
    public void mo14052H0(CoroutineContext coroutineContext, Runnable runnable) {
        f22404o.mo14052H0(coroutineContext, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        mo4546G0(C12893f.f28966k, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "Dispatchers.IO";
    }
}
