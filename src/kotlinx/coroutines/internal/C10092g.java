package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C2113b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.AbstractC10022e1;
import kotlinx.coroutines.AbstractC10222w0;
import kotlinx.coroutines.C10015d0;
import kotlinx.coroutines.C10149n0;
import kotlinx.coroutines.C10156p;
import kotlinx.coroutines.C10167r2;
import kotlinx.coroutines.C9999a0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(m15074d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010,\u001a\u00020*\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b>\u0010?J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\u00020\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u0012H\u0010¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00028\u0000H\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010+R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u00102\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b/\u00100\u0012\u0004\b1\u0010\u000bR\u0014\u00104\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b3\u00100R\u001a\u00105\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u000fR\u0014\u0010#\u001a\u00020\"8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107R\u001c\u0010:\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006@"}, m15073d2 = {"Lkotlinx/coroutines/internal/g;", "T", "Lkotlinx/coroutines/w0;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "", "r", "()Z", "", "i", "()V", "t", "Lkotlinx/coroutines/p;", "l", "()Lkotlinx/coroutines/p;", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "", "w", "(Lkotlinx/coroutines/CancellableContinuation;)Ljava/lang/Throwable;", "cause", "s", "(Ljava/lang/Throwable;)Z", "", "h", "()Ljava/lang/Object;", "Lnf/s;", "result", "resumeWith", "(Ljava/lang/Object;)V", "takenState", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "value", "n", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "o", "Lkotlin/coroutines/Continuation;", "p", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "_state", "q", "countOrElement", "reusableCancellableContinuation", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "c", "()Lkotlin/coroutines/Continuation;", "delegate", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.g */
/* loaded from: classes8.dex */
public final class C10092g<T> extends AbstractC10222w0<T> implements CoroutineStackFrame, Continuation<T> {

    /* renamed from: r */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f22279r = AtomicReferenceFieldUpdater.newUpdater(C10092g.class, Object.class, "_reusableCancellableContinuation");

    /* renamed from: n */
    public final CoroutineDispatcher f22280n;

    /* renamed from: o */
    public final Continuation<T> f22281o;

    /* renamed from: p */
    public Object f22282p = C10094h.m14307a();

    /* renamed from: q */
    public final Object f22283q = C10095h0.m14302b(getContext());
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;

    /* JADX WARN: Multi-variable type inference failed */
    public C10092g(CoroutineDispatcher coroutineDispatcher, Continuation<? super T> continuation) {
        super(-1);
        this.f22280n = coroutineDispatcher;
        this.f22281o = continuation;
    }

    /* renamed from: p */
    private final C10156p<?> m14317p() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof C10156p) {
            return (C10156p) obj;
        }
        return null;
    }

    @Override // kotlinx.coroutines.AbstractC10222w0
    /* renamed from: a */
    public void mo13977a(Object obj, Throwable th2) {
        if (obj instanceof C9999a0) {
            ((C9999a0) obj).f22124b.invoke(th2);
        }
    }

    @Override // kotlinx.coroutines.AbstractC10222w0
    /* renamed from: c */
    public Continuation<T> mo13976c() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f22281o;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.f22281o.getContext();
    }

    @Override // kotlinx.coroutines.AbstractC10222w0
    /* renamed from: h */
    public Object mo13972h() {
        Object obj = this.f22282p;
        this.f22282p = C10094h.m14307a();
        return obj;
    }

    /* renamed from: i */
    public final void m14320i() {
        do {
        } while (this._reusableCancellableContinuation == C10094h.f22285b);
    }

    /* renamed from: l */
    public final C10156p<T> m14319l() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = C10094h.f22285b;
                return null;
            } else if (obj instanceof C10156p) {
                if (C2113b.m38965a(f22279r, this, obj, C10094h.f22285b)) {
                    return (C10156p) obj;
                }
            } else if (obj != C10094h.f22285b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    /* renamed from: n */
    public final void m14318n(CoroutineContext coroutineContext, T t) {
        this.f22282p = t;
        this.f22472m = 1;
        this.f22280n.mo14052H0(coroutineContext, this);
    }

    /* renamed from: r */
    public final boolean m14316r() {
        return this._reusableCancellableContinuation != null;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        CoroutineContext context = this.f22281o.getContext();
        Object d = C10015d0.m14484d(obj, null, 1, null);
        if (this.f22280n.mo4545I0(context)) {
            this.f22282p = d;
            this.f22472m = 0;
            this.f22280n.mo4546G0(context, this);
            return;
        }
        AbstractC10022e1 b = C10167r2.f22370a.m14102b();
        if (b.m14468R0()) {
            this.f22282p = d;
            this.f22472m = 0;
            b.m14471N0(this);
            return;
        }
        b.m14470P0(true);
        try {
            CoroutineContext context2 = getContext();
            Object c = C10095h0.m14301c(context2, this.f22283q);
            this.f22281o.resumeWith(obj);
            Unit unit = Unit.f22042a;
            C10095h0.m14303a(context2, c);
            do {
            } while (b.m14466U0());
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: s */
    public final boolean m14315s(Throwable th2) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C10087d0 d0Var = C10094h.f22285b;
            if (C9971q.m14638b(obj, d0Var)) {
                if (C2113b.m38965a(f22279r, this, d0Var, th2)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (C2113b.m38965a(f22279r, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    /* renamed from: t */
    public final void m14314t() {
        m14320i();
        C10156p<?> p = m14317p();
        if (p != null) {
            p.m14123s();
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f22280n + ", " + C10149n0.m14163c(this.f22281o) + ']';
    }

    /* renamed from: w */
    public final Throwable m14313w(CancellableContinuation<?> cancellableContinuation) {
        C10087d0 d0Var;
        do {
            Object obj = this._reusableCancellableContinuation;
            d0Var = C10094h.f22285b;
            if (obj != d0Var) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                } else if (C2113b.m38965a(f22279r, this, obj, null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!C2113b.m38965a(f22279r, this, d0Var, cancellableContinuation));
        return null;
    }
}
