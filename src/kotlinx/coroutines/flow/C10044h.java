package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9930d;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.internal.C10087d0;
import nf.C11093t;
import p372ui.C13342i;
import tf.C13080d;
import vi.C13523j;
import vi.C13529m;

@Metadata(m15074d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m15073d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "", "timeoutMillis", "a", "Lkotlin/Function1;", "timeoutMillisSelector", "b", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, m15072k = 5, m15071mv = {1, 6, 0}, m15068xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.flow.h */
/* loaded from: classes8.dex */
final /* synthetic */ class C10044h {

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Long;"}, m15072k = 3, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.h$a */
    /* loaded from: classes8.dex */
    static final class C10045a extends AbstractC9973s implements Function1<T, Long> {

        /* renamed from: k */
        final /* synthetic */ long f22189k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10045a(long j) {
            super(1);
            this.f22189k = j;
        }

        /* renamed from: a */
        public final Long invoke(T t) {
            return Long.valueOf(this.f22189k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, m15073d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/FlowCollector;", "downstream", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 6, 0})
    @AbstractC9931e(m14702c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", m14701f = "Delay.kt", m14700l = {222, 355}, m14699m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.h$b */
    /* loaded from: classes8.dex */
    public static final class C10046b extends AbstractC9938k implements Function3<CoroutineScope, FlowCollector<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: k */
        Object f22190k;

        /* renamed from: l */
        Object f22191l;

        /* renamed from: m */
        int f22192m;

        /* renamed from: n */
        private /* synthetic */ Object f22193n;

        /* renamed from: o */
        /* synthetic */ Object f22194o;

        /* renamed from: p */
        final /* synthetic */ Function1<T, Long> f22195p;

        /* renamed from: q */
        final /* synthetic */ Flow<T> f22196q;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@"}, m15073d2 = {"T", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 6, 0})
        @AbstractC9931e(m14702c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", m14701f = "Delay.kt", m14700l = {233}, m14699m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.flow.h$b$a */
        /* loaded from: classes8.dex */
        public static final class C10047a extends AbstractC9938k implements Function1<Continuation<? super Unit>, Object> {

            /* renamed from: k */
            int f22197k;

            /* renamed from: l */
            final /* synthetic */ FlowCollector<T> f22198l;

            /* renamed from: m */
            final /* synthetic */ Ref$ObjectRef<Object> f22199m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C10047a(FlowCollector<? super T> flowCollector, Ref$ObjectRef<Object> ref$ObjectRef, Continuation<? super C10047a> continuation) {
                super(1, continuation);
                this.f22198l = flowCollector;
                this.f22199m = ref$ObjectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new C10047a(this.f22198l, this.f22199m, continuation);
            }

            public final Object invoke(Continuation<? super Unit> continuation) {
                return ((C10047a) create(continuation)).invokeSuspend(Unit.f22042a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
            public final Object invokeSuspend(Object obj) {
                Object d;
                d = C13080d.m4646d();
                int i = this.f22197k;
                if (i == 0) {
                    C11093t.m10930b(obj);
                    FlowCollector<T> flowCollector = this.f22198l;
                    C10087d0 d0Var = C13529m.f30221a;
                    Object obj2 = this.f22199m.f22069k;
                    if (obj2 == d0Var) {
                        obj2 = null;
                    }
                    this.f22197k = 1;
                    if (flowCollector.emit(obj2, this) == d) {
                        return d;
                    }
                } else if (i == 1) {
                    C11093t.m10930b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f22199m.f22069k = null;
                return Unit.f22042a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, m15073d2 = {"T", "Lui/i;", "", "value", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 6, 0})
        @AbstractC9931e(m14702c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", m14701f = "Delay.kt", m14700l = {243}, m14699m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.flow.h$b$b */
        /* loaded from: classes8.dex */
        public static final class C0308b extends AbstractC9938k implements Function2<C13342i<? extends Object>, Continuation<? super Unit>, Object> {

            /* renamed from: k */
            Object f22200k;

            /* renamed from: l */
            int f22201l;

            /* renamed from: m */
            /* synthetic */ Object f22202m;

            /* renamed from: n */
            final /* synthetic */ Ref$ObjectRef<Object> f22203n;

            /* renamed from: o */
            final /* synthetic */ FlowCollector<T> f22204o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0308b(Ref$ObjectRef<Object> ref$ObjectRef, FlowCollector<? super T> flowCollector, Continuation<? super C0308b> continuation) {
                super(2, continuation);
                this.f22203n = ref$ObjectRef;
                this.f22204o = flowCollector;
            }

            /* renamed from: a */
            public final Object m14415a(Object obj, Continuation<? super Unit> continuation) {
                return ((C0308b) create(C13342i.m3907b(obj), continuation)).invokeSuspend(Unit.f22042a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C0308b bVar = new C0308b(this.f22203n, this.f22204o, continuation);
                bVar.f22202m = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(C13342i<? extends Object> iVar, Continuation<? super Unit> continuation) {
                return m14415a(iVar.m3899j(), continuation);
            }

            /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.internal.d0, T] */
            /* JADX WARN: Type inference failed for: r7v5, types: [T, java.lang.Object] */
            /* JADX WARN: Unknown variable types count: 1 */
            @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = tf.C13075b.m4650d()
                    int r1 = r6.f22201l
                    r2 = 1
                    if (r1 == 0) goto L_0x001b
                    if (r1 != r2) goto L_0x0013
                    java.lang.Object r0 = r6.f22200k
                    kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
                    nf.C11093t.m10930b(r7)
                    goto L_0x004f
                L_0x0013:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L_0x001b:
                    nf.C11093t.m10930b(r7)
                    java.lang.Object r7 = r6.f22202m
                    ui.i r7 = (p372ui.C13342i) r7
                    java.lang.Object r7 = r7.m3899j()
                    kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r1 = r6.f22203n
                    boolean r3 = r7 instanceof p372ui.C13342i.C13345c
                    if (r3 != 0) goto L_0x002e
                    r1.f22069k = r7
                L_0x002e:
                    kotlinx.coroutines.flow.FlowCollector<T> r4 = r6.f22204o
                    if (r3 == 0) goto L_0x0056
                    java.lang.Throwable r3 = p372ui.C13342i.m3904e(r7)
                    if (r3 != 0) goto L_0x0055
                    T r3 = r1.f22069k
                    if (r3 == 0) goto L_0x0050
                    kotlinx.coroutines.internal.d0 r5 = vi.C13529m.f30221a
                    if (r3 != r5) goto L_0x0041
                    r3 = 0
                L_0x0041:
                    r6.f22202m = r7
                    r6.f22200k = r1
                    r6.f22201l = r2
                    java.lang.Object r7 = r4.emit(r3, r6)
                    if (r7 != r0) goto L_0x004e
                    return r0
                L_0x004e:
                    r0 = r1
                L_0x004f:
                    r1 = r0
                L_0x0050:
                    kotlinx.coroutines.internal.d0 r7 = vi.C13529m.f30223c
                    r1.f22069k = r7
                    goto L_0x0056
                L_0x0055:
                    throw r3
                L_0x0056:
                    kotlin.Unit r7 = kotlin.Unit.f22042a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C10044h.C10046b.C0308b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, m15073d2 = {"T", "Lkotlinx/coroutines/channels/ProducerScope;", "", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 6, 0})
        @AbstractC9931e(m14702c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", m14701f = "Delay.kt", m14700l = {211}, m14699m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.flow.h$b$c */
        /* loaded from: classes8.dex */
        public static final class C10048c extends AbstractC9938k implements Function2<ProducerScope<? super Object>, Continuation<? super Unit>, Object> {

            /* renamed from: k */
            int f22205k;

            /* renamed from: l */
            private /* synthetic */ Object f22206l;

            /* renamed from: m */
            final /* synthetic */ Flow<T> f22207m;

            /* JADX INFO: Access modifiers changed from: package-private */
            @Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m15072k = 3, m15071mv = {1, 6, 0}, m15069xi = 48)
            /* renamed from: kotlinx.coroutines.flow.h$b$c$a */
            /* loaded from: classes8.dex */
            public static final class C10049a<T> implements FlowCollector {

                /* renamed from: k */
                final /* synthetic */ ProducerScope<Object> f22208k;

                /* JADX INFO: Access modifiers changed from: package-private */
                @Metadata(m15072k = 3, m15071mv = {1, 6, 0}, m15069xi = 48)
                @AbstractC9931e(m14702c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", m14701f = "Delay.kt", m14700l = {211}, m14699m = "emit")
                /* renamed from: kotlinx.coroutines.flow.h$b$c$a$a */
                /* loaded from: classes8.dex */
                public static final class C0309a extends AbstractC9930d {

                    /* renamed from: k */
                    /* synthetic */ Object f22209k;

                    /* renamed from: l */
                    final /* synthetic */ C10049a<T> f22210l;

                    /* renamed from: m */
                    int f22211m;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0309a(C10049a<? super T> aVar, Continuation<? super C0309a> continuation) {
                        super(continuation);
                        this.f22210l = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
                    public final Object invokeSuspend(Object obj) {
                        this.f22209k = obj;
                        this.f22211m |= Integer.MIN_VALUE;
                        return this.f22210l.emit(null, this);
                    }
                }

                C10049a(ProducerScope<Object> producerScope) {
                    this.f22208k = producerScope;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(T r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.C10044h.C10046b.C10048c.C10049a.C0309a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        kotlinx.coroutines.flow.h$b$c$a$a r0 = (kotlinx.coroutines.flow.C10044h.C10046b.C10048c.C10049a.C0309a) r0
                        int r1 = r0.f22211m
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f22211m = r1
                        goto L_0x0018
                    L_0x0013:
                        kotlinx.coroutines.flow.h$b$c$a$a r0 = new kotlinx.coroutines.flow.h$b$c$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f22209k
                        java.lang.Object r1 = tf.C13075b.m4650d()
                        int r2 = r0.f22211m
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        nf.C11093t.m10930b(r6)
                        goto L_0x0043
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        nf.C11093t.m10930b(r6)
                        kotlinx.coroutines.channels.ProducerScope<java.lang.Object> r6 = r4.f22208k
                        if (r5 != 0) goto L_0x003a
                        kotlinx.coroutines.internal.d0 r5 = vi.C13529m.f30221a
                    L_0x003a:
                        r0.f22211m = r3
                        java.lang.Object r5 = r6.mo3856w(r5, r0)
                        if (r5 != r1) goto L_0x0043
                        return r1
                    L_0x0043:
                        kotlin.Unit r5 = kotlin.Unit.f22042a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C10044h.C10046b.C10048c.C10049a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C10048c(Flow<? extends T> flow, Continuation<? super C10048c> continuation) {
                super(2, continuation);
                this.f22207m = flow;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C10048c cVar = new C10048c(this.f22207m, continuation);
                cVar.f22206l = obj;
                return cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(ProducerScope<? super Object> producerScope, Continuation<? super Unit> continuation) {
                return invoke2((ProducerScope<Object>) producerScope, continuation);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(ProducerScope<Object> producerScope, Continuation<? super Unit> continuation) {
                return ((C10048c) create(producerScope, continuation)).invokeSuspend(Unit.f22042a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
            public final Object invokeSuspend(Object obj) {
                Object d;
                d = C13080d.m4646d();
                int i = this.f22205k;
                if (i == 0) {
                    C11093t.m10930b(obj);
                    Flow<T> flow = this.f22207m;
                    C10049a aVar = new C10049a((ProducerScope) this.f22206l);
                    this.f22205k = 1;
                    if (flow.collect(aVar, this) == d) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C10046b(Function1<? super T, Long> function1, Flow<? extends T> flow, Continuation<? super C10046b> continuation) {
            super(3, continuation);
            this.f22195p = function1;
            this.f22196q = flow;
        }

        /* renamed from: a */
        public final Object invoke(CoroutineScope coroutineScope, FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
            C10046b bVar = new C10046b(this.f22195p, this.f22196q, continuation);
            bVar.f22193n = coroutineScope;
            bVar.f22194o = flowCollector;
            return bVar.invokeSuspend(Unit.f22042a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:9|31|32|35|50|36|(1:38)|39|42|(1:44)|(1:46)(1:47)) */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00f7, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00f8, code lost:
            r10.m14032c0(r0);
         */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00e0 A[Catch: all -> 0x00f7, TryCatch #0 {all -> 0x00f7, blocks: (B:36:0x00dc, B:38:0x00e0, B:39:0x00ea), top: B:50:0x00dc }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x010a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x010b -> B:11:0x006f). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 276
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C10044h.C10046b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <T> Flow<T> m14419a(Flow<? extends T> flow, long j) {
        boolean z;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
        } else if (i == 0) {
            return flow;
        } else {
            return m14418b(flow, new C10045a(j));
        }
    }

    /* renamed from: b */
    private static final <T> Flow<T> m14418b(Flow<? extends T> flow, Function1<? super T, Long> function1) {
        return C13523j.m3479b(new C10046b(function1, flow, null));
    }
}
