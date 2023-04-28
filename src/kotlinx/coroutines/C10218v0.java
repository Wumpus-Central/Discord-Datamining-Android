package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C10083b0;
import kotlinx.coroutines.internal.C10094h;
import tf.C13076c;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0015"}, m15073d2 = {"Lkotlinx/coroutines/v0;", "T", "Lkotlinx/coroutines/internal/b0;", "", "X0", "()Z", "W0", "", "state", "", "F", "(Ljava/lang/Object;)V", "Q0", "V0", "()Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.v0 */
/* loaded from: classes8.dex */
public final class C10218v0<T> extends C10083b0<T> {

    /* renamed from: n */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f22470n = AtomicIntegerFieldUpdater.newUpdater(C10218v0.class, "_decision");
    private volatile /* synthetic */ int _decision = 0;

    public C10218v0(CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        super(coroutineContext, continuation);
    }

    /* renamed from: W0 */
    private final boolean m13980W0() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f22470n.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: X0 */
    private final boolean m13979X0() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f22470n.compareAndSet(this, 0, 1));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.internal.C10083b0, kotlinx.coroutines.C10005b2
    /* renamed from: F */
    public void mo13982F(Object obj) {
        mo13968Q0(obj);
    }

    @Override // kotlinx.coroutines.internal.C10083b0, kotlinx.coroutines.AbstractC9998a
    /* renamed from: Q0 */
    protected void mo13968Q0(Object obj) {
        Continuation c;
        if (!m13980W0()) {
            c = C13076c.m4647c(this.f22269m);
            C10094h.m14305c(c, C10015d0.m14487a(obj, this.f22269m), null, 2, null);
        }
    }

    /* renamed from: V0 */
    public final Object m13981V0() {
        Object d;
        if (m13979X0()) {
            d = C13080d.m4646d();
            return d;
        }
        Object h = C10013c2.m14488h(m14525g0());
        if (!(h instanceof C10234z)) {
            return h;
        }
        throw ((C10234z) h).f22488a;
    }
}
