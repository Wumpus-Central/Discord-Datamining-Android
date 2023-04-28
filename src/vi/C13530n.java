package vi;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC9930d;
import kotlin.coroutines.jvm.internal.C9933g;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.C10227x1;
import kotlinx.coroutines.flow.FlowCollector;
import nf.C11090s;
import p326ri.C12709n;
import p339sf.C12893f;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\"\u001a\u00020\f¢\u0006\u0004\b2\u00103J'\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\"\u0010\u0018\u001a\u00020\t2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\u001b\u0010\u001b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010!R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00101\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, m15073d2 = {"Lvi/n;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/jvm/internal/d;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "", "uCont", "value", "", "c", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "currentContext", "previousContext", "a", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Lvi/h;", "exception", "d", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lnf/s;", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "l", "Lkotlin/coroutines/CoroutineContext;", "collectContext", "", "m", "I", "collectContextSize", "n", "lastEmissionContext", "o", "Lkotlin/coroutines/Continuation;", "completion", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: vi.n */
/* loaded from: classes8.dex */
public final class C13530n<T> extends AbstractC9930d implements FlowCollector<T> {

    /* renamed from: k */
    public final FlowCollector<T> f30224k;

    /* renamed from: l */
    public final CoroutineContext f30225l;

    /* renamed from: m */
    public final int f30226m;

    /* renamed from: n */
    private CoroutineContext f30227n;

    /* renamed from: o */
    private Continuation<? super Unit> f30228o;

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m15073d2 = {"T", "", "count", "Lkotlin/coroutines/CoroutineContext$b;", "<anonymous parameter 1>", "a", "(ILkotlin/coroutines/CoroutineContext$b;)Ljava/lang/Integer;"}, m15072k = 3, m15071mv = {1, 6, 0})
    /* renamed from: vi.n$a */
    /* loaded from: classes8.dex */
    static final class C13531a extends AbstractC9973s implements Function2<Integer, CoroutineContext.AbstractC9924b, Integer> {

        /* renamed from: k */
        public static final C13531a f30229k = new C13531a();

        C13531a() {
            super(2);
        }

        /* renamed from: a */
        public final Integer m3473a(int i, CoroutineContext.AbstractC9924b bVar) {
            return Integer.valueOf(i + 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, CoroutineContext.AbstractC9924b bVar) {
            return m3473a(num.intValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13530n(FlowCollector<? super T> flowCollector, CoroutineContext coroutineContext) {
        super(C13528l.f30219k, C12893f.f28966k);
        this.f30224k = flowCollector;
        this.f30225l = coroutineContext;
        this.f30226m = ((Number) coroutineContext.mo3482w0(0, C13531a.f30229k)).intValue();
    }

    /* renamed from: a */
    private final void m3476a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, T t) {
        if (coroutineContext2 instanceof C13521h) {
            m3474d((C13521h) coroutineContext2, t);
        }
        C13533p.m3470a(this, coroutineContext);
    }

    /* renamed from: c */
    private final Object m3475c(Continuation<? super Unit> continuation, T t) {
        Object d;
        CoroutineContext context = continuation.getContext();
        C10227x1.m13953h(context);
        CoroutineContext coroutineContext = this.f30227n;
        if (coroutineContext != context) {
            m3476a(context, coroutineContext, t);
            this.f30227n = context;
        }
        this.f30228o = continuation;
        Object invoke = Function3.m3472a().invoke(this.f30224k, t, this);
        d = C13080d.m4646d();
        if (!C9971q.m14638b(invoke, d)) {
            this.f30228o = null;
        }
        return invoke;
    }

    /* renamed from: d */
    private final void m3474d(C13521h hVar, Object obj) {
        String f;
        f = C12709n.m5756f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + hVar.f30212k + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(f.toString());
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, Continuation<? super Unit> continuation) {
        Object d;
        Object d2;
        try {
            Object c = m3475c(continuation, t);
            d = C13080d.m4646d();
            if (c == d) {
                C9933g.m14691c(continuation);
            }
            d2 = C13080d.m4646d();
            if (c == d2) {
                return c;
            }
            return Unit.f22042a;
        } catch (Throwable th2) {
            this.f30227n = new C13521h(th2, continuation.getContext());
            throw th2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<? super Unit> continuation = this.f30228o;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9930d, kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.f30227n;
        return coroutineContext == null ? C12893f.f28966k : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public Object invokeSuspend(Object obj) {
        Object d;
        Throwable e = C11090s.m10937e(obj);
        if (e != null) {
            this.f30227n = new C13521h(e, getContext());
        }
        Continuation<? super Unit> continuation = this.f30228o;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        d = C13080d.m4646d();
        return d;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9930d, kotlin.coroutines.jvm.internal.AbstractC9927a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
