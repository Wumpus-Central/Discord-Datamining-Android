package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlinx.coroutines.AbstractC10213u;
import kotlinx.coroutines.AbstractC9998a;
import kotlinx.coroutines.C10015d0;
import kotlinx.coroutines.Job;
import tf.C13076c;

@Metadata(m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, m15073d2 = {"Lkotlinx/coroutines/internal/b0;", "T", "Lkotlinx/coroutines/a;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "", "state", "", "F", "Q0", "Lkotlin/coroutines/Continuation;", "m", "Lkotlin/coroutines/Continuation;", "uCont", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "", "m0", "()Z", "isScopedCoroutine", "Lkotlinx/coroutines/Job;", "U0", "()Lkotlinx/coroutines/Job;", "parent", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.b0 */
/* loaded from: classes8.dex */
public class C10083b0<T> extends AbstractC9998a<T> implements CoroutineStackFrame {

    /* renamed from: m */
    public final Continuation<T> f22269m;

    /* JADX WARN: Multi-variable type inference failed */
    public C10083b0(CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        super(coroutineContext, true, true);
        this.f22269m = continuation;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.C10005b2
    /* renamed from: F */
    public void mo13982F(Object obj) {
        Continuation c;
        c = C13076c.m4647c(this.f22269m);
        C10094h.m14305c(c, C10015d0.m14487a(obj, this.f22269m), null, 2, null);
    }

    @Override // kotlinx.coroutines.AbstractC9998a
    /* renamed from: Q0 */
    protected void mo13968Q0(Object obj) {
        Continuation<T> continuation = this.f22269m;
        continuation.resumeWith(C10015d0.m14487a(obj, continuation));
    }

    /* renamed from: U0 */
    public final Job m14336U0() {
        AbstractC10213u e0 = m14527e0();
        if (e0 != null) {
            return e0.getParent();
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f22269m;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlinx.coroutines.C10005b2
    /* renamed from: m0 */
    protected final boolean mo14335m0() {
        return true;
    }
}
