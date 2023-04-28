package com.discord.chat.presentation.message.system;

import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.discord.chat.bridge.Message;
import com.discord.chat.databinding.CallSystemMessageViewBinding;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.discord.misc.utilities.time.IntervalFlowKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9930d;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.coroutines.jvm.internal.C9928b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.C10230y0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C10039d;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nf.C11093t;
import si.C12905a;
import si.C12907c;
import si.EnumC12908d;
import tf.C13080d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9931e(m14702c = "com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1", m14701f = "CallSystemMessageView.kt", m14700l = {82}, m14699m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class CallSystemMessageView$setMessage$1 extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Message $message;
    final /* synthetic */ long $start;
    int label;
    final /* synthetic */ CallSystemMessageView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    @AbstractC9931e(m14702c = "com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1", m14701f = "CallSystemMessageView.kt", m14700l = {90}, m14699m = "invokeSuspend")
    /* renamed from: com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Message $message;
        final /* synthetic */ long $start;
        int label;
        final /* synthetic */ CallSystemMessageView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j, CallSystemMessageView callSystemMessageView, Message message, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$start = j;
            this.this$0 = callSystemMessageView;
            this.$message = message;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$start, this.this$0, this.$message, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = C13080d.m4646d();
            int i = this.label;
            if (i == 0) {
                C11093t.m10930b(obj);
                C12905a.C0415a aVar = C12905a.f28981l;
                final Flow<Unit> flow = IntervalFlowKt.m42005intervalFlowQTBD994(C12907c.m5090s(1, EnumC12908d.SECONDS), C12905a.f28981l.m5111b());
                final long j = this.$start;
                Flow f = C10039d.m14427f(new Flow<C12905a>() { // from class: com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1

                    @Metadata(m15074d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
                    /* renamed from: com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2 */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ long $start$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
                        @AbstractC9931e(m14702c = "com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2", m14701f = "CallSystemMessageView.kt", m14700l = {223}, m14699m = "emit")
                        /* renamed from: com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2$1 */
                        /* loaded from: classes4.dex */
                        public static final class AnonymousClass1 extends AbstractC9930d {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, long j) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$start$inlined = j;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
                            /*
                                r8 = this;
                                boolean r0 = r10 instanceof com.discord.chat.presentation.message.system.C4313xed4af3cc.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L_0x0013
                                r0 = r10
                                com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.discord.chat.presentation.message.system.C4313xed4af3cc.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L_0x0013
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L_0x0018
                            L_0x0013:
                                com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2$1
                                r0.<init>(r10)
                            L_0x0018:
                                java.lang.Object r10 = r0.result
                                java.lang.Object r1 = tf.C13075b.m4650d()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L_0x0031
                                if (r2 != r3) goto L_0x0029
                                nf.C11093t.m10930b(r10)
                                goto L_0x0062
                            L_0x0029:
                                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                                r9.<init>(r10)
                                throw r9
                            L_0x0031:
                                nf.C11093t.m10930b(r10)
                                kotlinx.coroutines.flow.FlowCollector r10 = r8.$this_unsafeFlow
                                kotlin.Unit r9 = (kotlin.Unit) r9
                                si.a$a r9 = si.C12905a.f28981l
                                long r4 = java.lang.System.currentTimeMillis()
                                long r6 = r8.$start$inlined
                                long r4 = r4 - r6
                                si.d r9 = si.EnumC12908d.MILLISECONDS
                                long r4 = si.C12907c.m5089t(r4, r9)
                                si.a r9 = si.C12905a.m5133e(r4)
                                si.a$a r2 = si.C12905a.f28981l
                                long r4 = r2.m5111b()
                                si.a r2 = si.C12905a.m5133e(r4)
                                java.lang.Comparable r9 = eg.C6882h.m23976e(r9, r2)
                                r0.label = r3
                                java.lang.Object r9 = r10.emit(r9, r0)
                                if (r9 != r1) goto L_0x0062
                                return r1
                            L_0x0062:
                                kotlin.Unit r9 = kotlin.Unit.f22042a
                                return r9
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.system.C4313xed4af3cc.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super C12905a> flowCollector, Continuation continuation) {
                        Object d2;
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, j), continuation);
                        d2 = C13080d.m4646d();
                        if (collect == d2) {
                            return collect;
                        }
                        return Unit.f22042a;
                    }
                }, C10230y0.m13947a());
                final CallSystemMessageView callSystemMessageView = this.this$0;
                final Message message = this.$message;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.discord.chat.presentation.message.system.CallSystemMessageView.setMessage.1.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return m41852emitVtjQ1oo(((C12905a) obj2).m5138K(), continuation);
                    }

                    /* renamed from: emit-VtjQ1oo  reason: not valid java name */
                    public final Object m41852emitVtjQ1oo(long j2, Continuation<? super Unit> continuation) {
                        CallSystemMessageViewBinding callSystemMessageViewBinding;
                        CallSystemMessageView callSystemMessageView2 = CallSystemMessageView.this;
                        Message message2 = message;
                        long m = C12905a.m5125m(j2);
                        int q = C12905a.m5121q(j2);
                        int s = C12905a.m5119s(j2);
                        C12905a.m5120r(j2);
                        callSystemMessageViewBinding = callSystemMessageView2.binding;
                        TextView textView = callSystemMessageViewBinding.info;
                        String format = String.format("%02d:%02d:%02d%s", Arrays.copyOf(new Object[]{C9928b.m14703d(m), C9928b.m14704c(q), C9928b.m14704c(s), message2.getDescription()}, 4));
                        C9971q.m14634f(format, "format(this, *args)");
                        textView.setText(format);
                        return Unit.f22042a;
                    }
                };
                this.label = 1;
                if (f.collect(flowCollector, this) == d) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallSystemMessageView$setMessage$1(CallSystemMessageView callSystemMessageView, long j, Message message, Continuation<? super CallSystemMessageView$setMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = callSystemMessageView;
        this.$start = j;
        this.$message = message;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CallSystemMessageView$setMessage$1(this.this$0, this.$start, this.$message, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CallSystemMessageView$setMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Object invokeSuspend(Object obj) {
        Object d;
        d = C13080d.m4646d();
        int i = this.label;
        if (i == 0) {
            C11093t.m10930b(obj);
            CallSystemMessageView callSystemMessageView = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 r9 = new AnonymousClass1(this.$start, callSystemMessageView, this.$message, null);
            this.label = 1;
            if (CoroutineViewUtilsKt.repeatOnLifecycleOwner(callSystemMessageView, state, r9, this) == d) {
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
