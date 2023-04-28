package vi;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nf.C11093t;
import p339sf.AbstractC12889d;
import p372ui.EnumC13337e;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H¤@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\fJ\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, m15073d2 = {"Lvi/f;", "S", "T", "Lvi/d;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Lkotlin/coroutines/CoroutineContext;", "newContext", "", "k", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ProducerScope;", "scope", "d", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collect", "", "toString", "Lkotlinx/coroutines/flow/Flow;", "n", "Lkotlinx/coroutines/flow/Flow;", "flow", "context", "", "capacity", "Lui/e;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;ILui/e;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: vi.f */
/* loaded from: classes8.dex */
public abstract class AbstractC13518f<S, T> extends AbstractC13514d<T> {

    /* renamed from: n */
    protected final Flow<S> f30208n;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, m15073d2 = {"S", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 6, 0})
    @AbstractC9931e(m14702c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", m14701f = "ChannelFlow.kt", m14700l = {152}, m14699m = "invokeSuspend")
    /* renamed from: vi.f$a */
    /* loaded from: classes8.dex */
    public static final class C13519a extends AbstractC9938k implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: k */
        int f30209k;

        /* renamed from: l */
        /* synthetic */ Object f30210l;

        /* renamed from: m */
        final /* synthetic */ AbstractC13518f<S, T> f30211m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13519a(AbstractC13518f<S, T> fVar, Continuation<? super C13519a> continuation) {
            super(2, continuation);
            this.f30211m = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13519a aVar = new C13519a(this.f30211m, continuation);
            aVar.f30210l = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return invoke((FlowCollector) ((FlowCollector) obj), continuation);
        }

        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
            return ((C13519a) create(flowCollector, continuation)).invokeSuspend(Unit.f22042a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = C13080d.m4646d();
            int i = this.f30209k;
            if (i == 0) {
                C11093t.m10930b(obj);
                AbstractC13518f<S, T> fVar = this.f30211m;
                this.f30209k = 1;
                if (fVar.mo3486l((FlowCollector) this.f30210l, this) == d) {
                    return d;
                }
            } else if (i == 1) {
                C11093t.m10930b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.f22042a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC13518f(Flow<? extends S> flow, CoroutineContext coroutineContext, int i, EnumC13337e eVar) {
        super(coroutineContext, i, eVar);
        this.f30208n = flow;
    }

    /* renamed from: i */
    static /* synthetic */ Object m3490i(AbstractC13518f fVar, FlowCollector flowCollector, Continuation continuation) {
        Object d;
        Object d2;
        Object d3;
        if (fVar.f30199l == -3) {
            CoroutineContext context = continuation.getContext();
            CoroutineContext f0 = context.mo3485f0(fVar.f30198k);
            if (C9971q.m14638b(f0, context)) {
                Object l = fVar.mo3486l(flowCollector, continuation);
                d3 = C13080d.m4646d();
                if (l == d3) {
                    return l;
                }
                return Unit.f22042a;
            }
            AbstractC12889d.C12891b bVar = AbstractC12889d.f28964h;
            if (C9971q.m14638b(f0.mo3484i(bVar), context.mo3484i(bVar))) {
                Object k = fVar.m3488k(flowCollector, f0, continuation);
                d2 = C13080d.m4646d();
                if (k == d2) {
                    return k;
                }
                return Unit.f22042a;
            }
        }
        Object collect = super.collect(flowCollector, continuation);
        d = C13080d.m4646d();
        if (collect == d) {
            return collect;
        }
        return Unit.f22042a;
    }

    /* renamed from: j */
    static /* synthetic */ Object m3489j(AbstractC13518f fVar, ProducerScope producerScope, Continuation continuation) {
        Object d;
        Object l = fVar.mo3486l(new C13535q(producerScope), continuation);
        d = C13080d.m4646d();
        return l == d ? l : Unit.f22042a;
    }

    /* renamed from: k */
    private final Object m3488k(FlowCollector<? super T> flowCollector, CoroutineContext coroutineContext, Continuation<? super Unit> continuation) {
        Object d;
        Object c = C13517e.m3493c(coroutineContext, C13517e.m3495a(flowCollector, continuation.getContext()), null, new C13519a(this, null), continuation, 4, null);
        d = C13080d.m4646d();
        if (c == d) {
            return c;
        }
        return Unit.f22042a;
    }

    @Override // vi.AbstractC13514d, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        return m3490i(this, flowCollector, continuation);
    }

    @Override // vi.AbstractC13514d
    /* renamed from: d */
    protected Object mo3491d(ProducerScope<? super T> producerScope, Continuation<? super Unit> continuation) {
        return m3489j(this, producerScope, continuation);
    }

    /* renamed from: l */
    protected abstract Object mo3486l(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation);

    @Override // vi.AbstractC13514d
    public String toString() {
        return this.f30208n + " -> " + super.toString();
    }
}
