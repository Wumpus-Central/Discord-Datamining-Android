package vi;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.coroutines.jvm.internal.C9933g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nf.C11093t;
import p429xi.C14170b;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002$\b\u0001\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aP\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u000020\b\u0001\u0010\u0005\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m15073d2 = {"R", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "block", "a", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lkotlinx/coroutines/flow/Flow;", "b", "(Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: vi.j */
/* loaded from: classes8.dex */
public final class C13523j {

    @Metadata(m15074d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m15073d2 = {"vi/j$a", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: vi.j$a */
    /* loaded from: classes8.dex */
    public static final class C13524a implements Flow<R> {

        /* renamed from: k */
        final /* synthetic */ Function3 f30214k;

        public C13524a(Function3 function3) {
            this.f30214k = function3;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super R> flowCollector, Continuation<? super Unit> continuation) {
            Object d;
            Object a = C13523j.m3480a(new C13525b(this.f30214k, flowCollector, null), continuation);
            d = C13080d.m4646d();
            if (a == d) {
                return a;
            }
            return Unit.f22042a;
        }
    }

    @Metadata(m15074d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m15073d2 = {"R", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 6, 0})
    @AbstractC9931e(m14702c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", m14701f = "FlowCoroutine.kt", m14700l = {51}, m14699m = "invokeSuspend")
    /* renamed from: vi.j$b */
    /* loaded from: classes8.dex */
    static final class C13525b extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: k */
        int f30215k;

        /* renamed from: l */
        private /* synthetic */ Object f30216l;

        /* renamed from: m */
        final /* synthetic */ Function3<CoroutineScope, FlowCollector<? super R>, Continuation<? super Unit>, Object> f30217m;

        /* renamed from: n */
        final /* synthetic */ FlowCollector<R> f30218n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13525b(Function3<? super CoroutineScope, ? super FlowCollector<? super R>, ? super Continuation<? super Unit>, ? extends Object> function3, FlowCollector<? super R> flowCollector, Continuation<? super C13525b> continuation) {
            super(2, continuation);
            this.f30217m = function3;
            this.f30218n = flowCollector;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13525b bVar = new C13525b(this.f30217m, this.f30218n, continuation);
            bVar.f30216l = obj;
            return bVar;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C13525b) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = C13080d.m4646d();
            int i = this.f30215k;
            if (i == 0) {
                C11093t.m10930b(obj);
                Function3<CoroutineScope, FlowCollector<? super R>, Continuation<? super Unit>, Object> function3 = this.f30217m;
                Object obj2 = this.f30218n;
                this.f30215k = 1;
                if (function3.invoke((CoroutineScope) this.f30216l, obj2, this) == d) {
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

    /* renamed from: a */
    public static final <R> Object m3480a(Function2<? super CoroutineScope, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        Object d;
        C13522i iVar = new C13522i(continuation.getContext(), continuation);
        Object d2 = C14170b.m1463d(iVar, iVar, function2);
        d = C13080d.m4646d();
        if (d2 == d) {
            C9933g.m14691c(continuation);
        }
        return d2;
    }

    /* renamed from: b */
    public static final <R> Flow<R> m3479b(Function3<? super CoroutineScope, ? super FlowCollector<? super R>, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new C13524a(function3);
    }
}
