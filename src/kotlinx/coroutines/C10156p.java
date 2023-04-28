package kotlinx.coroutines;

import androidx.concurrent.futures.C2113b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.C10087d0;
import kotlinx.coroutines.internal.C10092g;
import nf.C11075i;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\f\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000e\u0012\u0006\u0010'\u001a\u00020!¢\u0006\u0004\b{\u0010|J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0011\u001a\u00020\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001c\u001a\u00020\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001f\u001a\u00020\u001e2\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$JK\u0010*\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u001a2\u0006\u0010'\u001a\u00020!2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\u0010)\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b*\u0010+J9\u0010,\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u001a2\u0006\u0010'\u001a\u00020!2\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b,\u0010-J;\u0010/\u001a\u0004\u0018\u00010.2\b\u0010&\u001a\u0004\u0018\u00010\u001a2\b\u0010)\u001a\u0004\u0018\u00010\u001a2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b/\u00100J\u0019\u00102\u001a\u0002012\b\u0010&\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u000eH\u0002¢\u0006\u0004\b4\u0010\u0019J\u000f\u00105\u001a\u00020\u000eH\u0016¢\u0006\u0004\b5\u0010\u0019J\u000f\u00106\u001a\u00020\u0006H\u0001¢\u0006\u0004\b6\u0010\bJ\u0011\u00107\u001a\u0004\u0018\u00010\u001aH\u0010¢\u0006\u0004\b7\u00108J!\u0010:\u001a\u00020\u000e2\b\u00109\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b<\u0010\fJ\u0017\u0010=\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u001e2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b?\u0010@J)\u0010A\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\bA\u0010\u0012J\u0017\u0010D\u001a\u00020\t2\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ\u0011\u0010F\u001a\u0004\u0018\u00010\u001aH\u0001¢\u0006\u0004\bF\u00108J \u0010I\u001a\u00020\u000e2\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000GH\u0016ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ-\u0010L\u001a\u00020\u000e2\u0006\u0010K\u001a\u00028\u00002\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\bL\u0010MJ)\u0010N\u001a\u00020\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u000eH\u0000¢\u0006\u0004\bP\u0010\u0019J#\u0010Q\u001a\u0004\u0018\u00010\u001a2\u0006\u0010K\u001a\u00028\u00002\b\u0010)\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\bQ\u0010RJ9\u0010S\u001a\u0004\u0018\u00010\u001a2\u0006\u0010K\u001a\u00028\u00002\b\u0010)\u001a\u0004\u0018\u00010\u001a2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\bS\u0010TJ\u0019\u0010V\u001a\u0004\u0018\u00010\u001a2\u0006\u0010U\u001a\u00020\tH\u0016¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020\u001aH\u0016¢\u0006\u0004\bY\u0010JJ\u001b\u0010[\u001a\u00020\u000e*\u00020Z2\u0006\u0010K\u001a\u00028\u0000H\u0016¢\u0006\u0004\b[\u0010\\J\u001f\u0010]\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0010¢\u0006\u0004\b]\u0010^J\u001b\u0010_\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0010¢\u0006\u0004\b_\u0010`J\u000f\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020aH\u0014¢\u0006\u0004\bd\u0010cR \u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010f\u001a\u0004\bg\u0010hR\u001a\u0010n\u001a\u00020j8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010k\u001a\u0004\bl\u0010mR\u0018\u0010p\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010oR\u0014\u0010r\u001a\u00020a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bq\u0010cR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bs\u00108R\u0014\u0010u\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010\bR\u0014\u0010w\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010\bR\u001c\u0010z\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010y\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006}"}, m15073d2 = {"Lkotlinx/coroutines/p;", "T", "Lkotlinx/coroutines/w0;", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "", "E", "()Z", "", "cause", "r", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "handler", "l", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V", "Q", "O", "Lkotlinx/coroutines/a1;", "D", "()Lkotlinx/coroutines/a1;", "J", "()V", "", "state", "G", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", "Lkotlinx/coroutines/n;", "F", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/n;", "", "mode", "w", "(I)V", "Lkotlinx/coroutines/i2;", "proposedUpdate", "resumeMode", "onCancellation", "idempotent", "N", "(Lkotlinx/coroutines/i2;Ljava/lang/Object;ILkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;", "L", "(Ljava/lang/Object;ILkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/internal/d0;", "P", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/d0;", "", "i", "(Ljava/lang/Object;)Ljava/lang/Void;", "t", "C", "K", "h", "()Ljava/lang/Object;", "takenState", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "q", "I", "(Ljava/lang/Throwable;)V", "n", "(Lkotlinx/coroutines/n;Ljava/lang/Throwable;)V", "p", "Lkotlinx/coroutines/Job;", "parent", "x", "(Lkotlinx/coroutines/Job;)Ljava/lang/Throwable;", "y", "Lnf/s;", "result", "resumeWith", "(Ljava/lang/Object;)V", "value", "o", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "k", "(Lkotlin/jvm/functions/Function1;)V", "s", "j", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "u", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "exception", "m", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "B", "Lkotlinx/coroutines/CoroutineDispatcher;", "v", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "d", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "H", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/Continuation;", "c", "()Lkotlin/coroutines/Continuation;", "delegate", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/a1;", "parentHandle", "A", "stateDebugRepresentation", "z", "b", "isActive", "g", "isCompleted", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "<init>", "(Lkotlin/coroutines/Continuation;I)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.p */
/* loaded from: classes8.dex */
public class C10156p<T> extends AbstractC10222w0<T> implements CancellableContinuation<T>, CoroutineStackFrame {

    /* renamed from: q */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f22360q = AtomicIntegerFieldUpdater.newUpdater(C10156p.class, "_decision");

    /* renamed from: r */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f22361r = AtomicReferenceFieldUpdater.newUpdater(C10156p.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision = 0;
    private volatile /* synthetic */ Object _state = C10014d.f22148k;

    /* renamed from: n */
    private final Continuation<T> f22362n;

    /* renamed from: o */
    private final CoroutineContext f22363o;

    /* renamed from: p */
    private AbstractC10000a1 f22364p;

    /* JADX WARN: Multi-variable type inference failed */
    public C10156p(Continuation<? super T> continuation, int i) {
        super(i);
        this.f22362n = continuation;
        this.f22363o = continuation.getContext();
    }

    /* renamed from: A */
    private final String m14152A() {
        Object z = m14116z();
        if (z instanceof AbstractC10079i2) {
            return "Active";
        }
        if (z instanceof C10168s) {
            return "Cancelled";
        }
        return "Completed";
    }

    /* renamed from: D */
    private final AbstractC10000a1 m14149D() {
        Job job = (Job) getContext().mo3484i(Job.f22120e);
        if (job == null) {
            return null;
        }
        AbstractC10000a1 d = Job.C9996a.m14568d(job, true, false, new C10209t(this), 2, null);
        this.f22364p = d;
        return d;
    }

    /* renamed from: E */
    private final boolean m14148E() {
        return C10226x0.m13963c(this.f22472m) && ((C10092g) this.f22362n).m14316r();
    }

    /* renamed from: F */
    private final AbstractC10148n m14147F(Function1<? super Throwable, Unit> function1) {
        return function1 instanceof AbstractC10148n ? (AbstractC10148n) function1 : new C10166r1(function1);
    }

    /* renamed from: G */
    private final void m14146G(Function1<? super Throwable, Unit> function1, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + function1 + ", already has " + obj).toString());
    }

    /* renamed from: J */
    private final void m14143J() {
        C10092g gVar;
        Throwable w;
        Continuation<T> continuation = this.f22362n;
        if (continuation instanceof C10092g) {
            gVar = (C10092g) continuation;
        } else {
            gVar = null;
        }
        if (gVar != null && (w = gVar.m14313w(this)) != null) {
            m14123s();
            mo14125q(w);
        }
    }

    /* renamed from: L */
    private final void m14141L(Object obj, int i, Function1<? super Throwable, Unit> function1) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof AbstractC10079i2) {
            } else {
                if (obj2 instanceof C10168s) {
                    C10168s sVar = (C10168s) obj2;
                    if (sVar.m14099c()) {
                        if (function1 != null) {
                            m14126p(function1, sVar.f22488a);
                            return;
                        }
                        return;
                    }
                }
                m14133i(obj);
                throw new C11075i();
            }
        } while (!C2113b.m38965a(f22361r, this, obj2, m14139N((AbstractC10079i2) obj2, obj, i, function1, null)));
        m14122t();
        m14119w(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: M */
    static /* synthetic */ void m14140M(C10156p pVar, Object obj, int i, Function1 function1, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 4) != 0) {
                function1 = null;
            }
            pVar.m14141L(obj, i, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    /* renamed from: N */
    private final Object m14139N(AbstractC10079i2 i2Var, Object obj, int i, Function1<? super Throwable, Unit> function1, Object obj2) {
        AbstractC10148n nVar;
        if (obj instanceof C10234z) {
            return obj;
        }
        if (!C10226x0.m13964b(i) && obj2 == null) {
            return obj;
        }
        if (function1 == null && ((!(i2Var instanceof AbstractC10148n) || (i2Var instanceof AbstractC10067g)) && obj2 == null)) {
            return obj;
        }
        if (i2Var instanceof AbstractC10148n) {
            nVar = (AbstractC10148n) i2Var;
        } else {
            nVar = null;
        }
        return new C10229y(obj, nVar, function1, obj2, null, 16, null);
    }

    /* renamed from: O */
    private final boolean m14138O() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f22360q.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: P */
    private final C10087d0 m14137P(Object obj, Object obj2, Function1<? super Throwable, Unit> function1) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof AbstractC10079i2) {
            } else if (!(obj3 instanceof C10229y) || obj2 == null || ((C10229y) obj3).f22479d != obj2) {
                return null;
            } else {
                return C10160q.f22367a;
            }
        } while (!C2113b.m38965a(f22361r, this, obj3, m14139N((AbstractC10079i2) obj3, obj, this.f22472m, function1, obj2)));
        m14122t();
        return C10160q.f22367a;
    }

    /* renamed from: Q */
    private final boolean m14136Q() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f22360q.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: i */
    private final Void m14133i(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    /* renamed from: l */
    private final void m14130l(Function1<? super Throwable, Unit> function1, Throwable th2) {
        try {
            function1.invoke(th2);
        } catch (Throwable th3) {
            CoroutineContext context = getContext();
            C10077i0.m14350a(context, new C10011c0("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    /* renamed from: r */
    private final boolean m14124r(Throwable th2) {
        if (!m14148E()) {
            return false;
        }
        return ((C10092g) this.f22362n).m14315s(th2);
    }

    /* renamed from: t */
    private final void m14122t() {
        if (!m14148E()) {
            m14123s();
        }
    }

    /* renamed from: w */
    private final void m14119w(int i) {
        if (!m14138O()) {
            C10226x0.m13965a(this, i);
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: B */
    public void mo14151B(Object obj) {
        m14119w(this.f22472m);
    }

    /* renamed from: C */
    public void m14150C() {
        AbstractC10000a1 D = m14149D();
        if (D != null && mo14134g()) {
            D.dispose();
            this.f22364p = C10075h2.f22261k;
        }
    }

    /* renamed from: H */
    protected String m14145H() {
        return "CancellableContinuation";
    }

    /* renamed from: I */
    public final void m14144I(Throwable th2) {
        if (!m14124r(th2)) {
            mo14125q(th2);
            m14122t();
        }
    }

    /* renamed from: K */
    public final boolean m14142K() {
        Object obj = this._state;
        if (!(obj instanceof C10229y) || ((C10229y) obj).f22479d == null) {
            this._decision = 0;
            this._state = C10014d.f22148k;
            return true;
        }
        m14123s();
        return false;
    }

    @Override // kotlinx.coroutines.AbstractC10222w0
    /* renamed from: a */
    public void mo13977a(Object obj, Throwable th2) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof AbstractC10079i2) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof C10234z)) {
                if (obj2 instanceof C10229y) {
                    C10229y yVar = (C10229y) obj2;
                    if (!yVar.m13949c()) {
                        if (C2113b.m38965a(f22361r, this, obj2, C10229y.m13950b(yVar, null, null, null, null, th2, 15, null))) {
                            yVar.m13948d(this, th2);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (C2113b.m38965a(f22361r, this, obj2, new C10229y(obj2, null, null, null, th2, 14, null))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: b */
    public boolean mo14135b() {
        return m14116z() instanceof AbstractC10079i2;
    }

    @Override // kotlinx.coroutines.AbstractC10222w0
    /* renamed from: c */
    public final Continuation<T> mo13976c() {
        return this.f22362n;
    }

    @Override // kotlinx.coroutines.AbstractC10222w0
    /* renamed from: d */
    public Throwable mo13975d(Object obj) {
        Throwable d = super.mo13975d(obj);
        if (d != null) {
            return d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.AbstractC10222w0
    /* renamed from: e */
    public <T> T mo13974e(Object obj) {
        return obj instanceof C10229y ? (T) ((C10229y) obj).f22476a : obj;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: g */
    public boolean mo14134g() {
        return !(m14116z() instanceof AbstractC10079i2);
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f22362n;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.f22363o;
    }

    @Override // kotlinx.coroutines.AbstractC10222w0
    /* renamed from: h */
    public Object mo13972h() {
        return m14116z();
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: j */
    public Object mo14132j(T t, Object obj) {
        return m14137P(t, obj, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: k */
    public void mo14131k(Function1<? super Throwable, Unit> function1) {
        AbstractC10148n F = m14147F(function1);
        while (true) {
            Object obj = this._state;
            if (obj instanceof C10014d) {
                if (C2113b.m38965a(f22361r, this, obj, F)) {
                    return;
                }
            } else if (obj instanceof AbstractC10148n) {
                m14146G(function1, obj);
            } else {
                boolean z = obj instanceof C10234z;
                if (z) {
                    C10234z zVar = (C10234z) obj;
                    if (!zVar.m13942b()) {
                        m14146G(function1, obj);
                    }
                    if (obj instanceof C10168s) {
                        Throwable th2 = null;
                        if (!z) {
                            zVar = null;
                        }
                        if (zVar != null) {
                            th2 = zVar.f22488a;
                        }
                        m14130l(function1, th2);
                        return;
                    }
                    return;
                } else if (obj instanceof C10229y) {
                    C10229y yVar = (C10229y) obj;
                    if (yVar.f22477b != null) {
                        m14146G(function1, obj);
                    }
                    if (!(F instanceof AbstractC10067g)) {
                        if (yVar.m13949c()) {
                            m14130l(function1, yVar.f22480e);
                            return;
                        }
                        if (C2113b.m38965a(f22361r, this, obj, C10229y.m13950b(yVar, null, F, null, null, null, 29, null))) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (!(F instanceof AbstractC10067g)) {
                    if (C2113b.m38965a(f22361r, this, obj, new C10229y(obj, F, null, null, null, 28, null))) {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: m */
    public Object mo14129m(Throwable th2) {
        return m14137P(new C10234z(th2, false, 2, null), null, null);
    }

    /* renamed from: n */
    public final void m14128n(AbstractC10148n nVar, Throwable th2) {
        try {
            nVar.mo3945a(th2);
        } catch (Throwable th3) {
            CoroutineContext context = getContext();
            C10077i0.m14350a(context, new C10011c0("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: o */
    public void mo14127o(T t, Function1<? super Throwable, Unit> function1) {
        m14141L(t, this.f22472m, function1);
    }

    /* renamed from: p */
    public final void m14126p(Function1<? super Throwable, Unit> function1, Throwable th2) {
        try {
            function1.invoke(th2);
        } catch (Throwable th3) {
            CoroutineContext context = getContext();
            C10077i0.m14350a(context, new C10011c0("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: q */
    public boolean mo14125q(Throwable th2) {
        Object obj;
        boolean z;
        AbstractC10148n nVar;
        do {
            obj = this._state;
            if (!(obj instanceof AbstractC10079i2)) {
                return false;
            }
            z = obj instanceof AbstractC10148n;
        } while (!C2113b.m38965a(f22361r, this, obj, new C10168s(this, th2, z)));
        if (z) {
            nVar = (AbstractC10148n) obj;
        } else {
            nVar = null;
        }
        if (nVar != null) {
            m14128n(nVar, th2);
        }
        m14122t();
        m14119w(this.f22472m);
        return true;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        m14140M(this, C10015d0.m14485c(obj, this), this.f22472m, null, 4, null);
    }

    /* renamed from: s */
    public final void m14123s() {
        AbstractC10000a1 a1Var = this.f22364p;
        if (a1Var != null) {
            a1Var.dispose();
            this.f22364p = C10075h2.f22261k;
        }
    }

    public String toString() {
        return m14145H() + '(' + C10149n0.m14163c(this.f22362n) + "){" + m14152A() + "}@" + C10149n0.m14164b(this);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: u */
    public Object mo14121u(T t, Object obj, Function1<? super Throwable, Unit> function1) {
        return m14137P(t, obj, function1);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: v */
    public void mo14120v(CoroutineDispatcher coroutineDispatcher, T t) {
        C10092g gVar;
        int i;
        Continuation<T> continuation = this.f22362n;
        CoroutineDispatcher coroutineDispatcher2 = null;
        if (continuation instanceof C10092g) {
            gVar = (C10092g) continuation;
        } else {
            gVar = null;
        }
        if (gVar != null) {
            coroutineDispatcher2 = gVar.f22280n;
        }
        if (coroutineDispatcher2 == coroutineDispatcher) {
            i = 4;
        } else {
            i = this.f22472m;
        }
        m14140M(this, t, i, null, 4, null);
    }

    /* renamed from: x */
    public Throwable m14118x(Job job) {
        return job.mo14559C();
    }

    /* renamed from: y */
    public final Object m14117y() {
        Job job;
        Object d;
        boolean E = m14148E();
        if (m14136Q()) {
            if (this.f22364p == null) {
                m14149D();
            }
            if (E) {
                m14143J();
            }
            d = C13080d.m4646d();
            return d;
        }
        if (E) {
            m14143J();
        }
        Object z = m14116z();
        if (z instanceof C10234z) {
            throw ((C10234z) z).f22488a;
        } else if (!C10226x0.m13964b(this.f22472m) || (job = (Job) getContext().mo3484i(Job.f22120e)) == null || job.mo3873b()) {
            return mo13974e(z);
        } else {
            CancellationException C = job.mo14559C();
            mo13977a(z, C);
            throw C;
        }
    }

    /* renamed from: z */
    public final Object m14116z() {
        return this._state;
    }
}
