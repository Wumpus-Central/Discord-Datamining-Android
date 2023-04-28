package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C10083b0;
import kotlinx.coroutines.internal.C10095h0;
import nf.C11098x;

@Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\n\u001a\u00020\tJ\u0012\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0014R*\u0010\u0011\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m15073d2 = {"Lkotlinx/coroutines/w2;", "T", "Lkotlinx/coroutines/internal/b0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "oldValue", "", "W0", "", "V0", "state", "Q0", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", "n", "Ljava/lang/ThreadLocal;", "threadStateToRecover", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.w2 */
/* loaded from: classes8.dex */
public final class C10224w2<T> extends C10083b0<T> {

    /* renamed from: n */
    private ThreadLocal<Pair<CoroutineContext, Object>> f22474n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C10224w2(kotlin.coroutines.CoroutineContext r3, kotlin.coroutines.Continuation<? super T> r4) {
        /*
            r2 = this;
            kotlinx.coroutines.x2 r0 = kotlinx.coroutines.C10228x2.f22475k
            kotlin.coroutines.CoroutineContext$b r1 = r3.mo3484i(r0)
            if (r1 != 0) goto L_0x000d
            kotlin.coroutines.CoroutineContext r0 = r3.mo3485f0(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r3
        L_0x000e:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f22474n = r0
            kotlin.coroutines.CoroutineContext r4 = r4.getContext()
            sf.d$b r0 = p339sf.AbstractC12889d.f28964h
            kotlin.coroutines.CoroutineContext$b r4 = r4.mo3484i(r0)
            boolean r4 = r4 instanceof kotlinx.coroutines.CoroutineDispatcher
            if (r4 != 0) goto L_0x0031
            r4 = 0
            java.lang.Object r4 = kotlinx.coroutines.internal.C10095h0.m14301c(r3, r4)
            kotlinx.coroutines.internal.C10095h0.m14303a(r3, r4)
            r2.m13966W0(r3, r4)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C10224w2.<init>(kotlin.coroutines.CoroutineContext, kotlin.coroutines.Continuation):void");
    }

    @Override // kotlinx.coroutines.internal.C10083b0, kotlinx.coroutines.AbstractC9998a
    /* renamed from: Q0 */
    protected void mo13968Q0(Object obj) {
        Pair<CoroutineContext, Object> pair = this.f22474n.get();
        C10224w2<?> w2Var = null;
        if (pair != null) {
            C10095h0.m14303a(pair.m15067a(), pair.m15066b());
            this.f22474n.set(null);
        }
        Object a = C10015d0.m14487a(obj, this.f22269m);
        Continuation<T> continuation = this.f22269m;
        CoroutineContext context = continuation.getContext();
        Object c = C10095h0.m14301c(context, null);
        if (c != C10095h0.f22286a) {
            w2Var = C10025f0.m14456g(continuation, context, c);
        }
        try {
            this.f22269m.resumeWith(a);
            Unit unit = Unit.f22042a;
        } finally {
            if (w2Var == null || w2Var.m13967V0()) {
                C10095h0.m14303a(context, c);
            }
        }
    }

    /* renamed from: V0 */
    public final boolean m13967V0() {
        if (this.f22474n.get() == null) {
            return false;
        }
        this.f22474n.set(null);
        return true;
    }

    /* renamed from: W0 */
    public final void m13966W0(CoroutineContext coroutineContext, Object obj) {
        this.f22474n.set(C11098x.m10921a(coroutineContext, obj));
    }
}
