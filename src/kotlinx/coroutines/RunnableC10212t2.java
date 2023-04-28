package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.C10083b0;

@Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000f\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, m15073d2 = {"Lkotlinx/coroutines/t2;", "U", "T", "Lkotlinx/coroutines/internal/b0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "run", "", "q0", "()Ljava/lang/String;", "", "n", "J", "time", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(JLkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.t2 */
/* loaded from: classes8.dex */
final class RunnableC10212t2<U, T extends U> extends C10083b0<T> implements Runnable {

    /* renamed from: n */
    public final long f22466n;

    public RunnableC10212t2(long j, Continuation<? super U> continuation) {
        super(continuation.getContext(), continuation);
        this.f22466n = j;
    }

    @Override // kotlinx.coroutines.AbstractC9998a, kotlinx.coroutines.C10005b2
    /* renamed from: q0 */
    public String mo13988q0() {
        return super.mo13988q0() + "(timeMillis=" + this.f22466n + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        m14552G(C10216u2.m13987a(this.f22466n, this));
    }
}
