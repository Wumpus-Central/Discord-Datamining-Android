package vi;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.C10095h0;
import nf.C11093t;
import tf.C13080d;

@Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR3\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m15073d2 = {"Lvi/s;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "k", "Lkotlin/coroutines/CoroutineContext;", "emitContext", "", "l", "Ljava/lang/Object;", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "m", "Lkotlin/jvm/functions/Function2;", "emitRef", "downstream", "<init>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: vi.s */
/* loaded from: classes8.dex */
final class C13537s<T> implements FlowCollector<T> {

    /* renamed from: k */
    private final CoroutineContext f30236k;

    /* renamed from: l */
    private final Object f30237l;

    /* renamed from: m */
    private final Function2<T, Continuation<? super Unit>, Object> f30238m;

    @Metadata(m15074d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, m15073d2 = {"T", "it", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 6, 0})
    @AbstractC9931e(m14702c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", m14701f = "ChannelFlow.kt", m14700l = {212}, m14699m = "invokeSuspend")
    /* renamed from: vi.s$a */
    /* loaded from: classes8.dex */
    static final class C13538a extends AbstractC9938k implements Function2<T, Continuation<? super Unit>, Object> {

        /* renamed from: k */
        int f30239k;

        /* renamed from: l */
        /* synthetic */ Object f30240l;

        /* renamed from: m */
        final /* synthetic */ FlowCollector<T> f30241m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13538a(FlowCollector<? super T> flowCollector, Continuation<? super C13538a> continuation) {
            super(2, continuation);
            this.f30241m = flowCollector;
        }

        /* renamed from: a */
        public final Object invoke(T t, Continuation<? super Unit> continuation) {
            return ((C13538a) create(t, continuation)).invokeSuspend(Unit.f22042a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13538a aVar = new C13538a(this.f30241m, continuation);
            aVar.f30240l = obj;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = C13080d.m4646d();
            int i = this.f30239k;
            if (i == 0) {
                C11093t.m10930b(obj);
                Object obj2 = this.f30240l;
                this.f30239k = 1;
                if (this.f30241m.emit(obj2, this) == d) {
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

    public C13537s(FlowCollector<? super T> flowCollector, CoroutineContext coroutineContext) {
        this.f30236k = coroutineContext;
        this.f30237l = C10095h0.m14302b(coroutineContext);
        this.f30238m = new C13538a(flowCollector, null);
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, Continuation<? super Unit> continuation) {
        Object d;
        Object b = C13517e.m3494b(this.f30236k, t, this.f30237l, this.f30238m, continuation);
        d = C13080d.m4646d();
        return b == d ? b : Unit.f22042a;
    }
}
