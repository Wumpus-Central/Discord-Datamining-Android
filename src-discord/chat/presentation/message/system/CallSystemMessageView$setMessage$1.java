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
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.y0;
import nf.t;
import si.a;
import si.c;
import tf.d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1", f = "CallSystemMessageView.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class CallSystemMessageView$setMessage$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Message $message;
    final /* synthetic */ long $start;
    int label;
    final /* synthetic */ CallSystemMessageView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1", f = "CallSystemMessageView.kt", l = {90}, m = "invokeSuspend")
    /* renamed from: com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Message $message;
        final /* synthetic */ long $start;
        int label;
        final /* synthetic */ CallSystemMessageView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j10, CallSystemMessageView callSystemMessageView, Message message, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$start = j10;
            this.this$0 = callSystemMessageView;
            this.$message = message;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$start, this.this$0, this.$message, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22034a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = d.d();
            int i10 = this.label;
            if (i10 == 0) {
                t.b(obj);
                a.C0415a aVar = a.f28973l;
                final Flow<Unit> flow = IntervalFlowKt.m442intervalFlowQTBD994(c.s(1, si.d.SECONDS), a.f28973l.b());
                final long j10 = this.$start;
                Flow f10 = kotlinx.coroutines.flow.d.f(new Flow<a>() { // from class: com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1

                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    /* renamed from: com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2  reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ long $start$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        @e(c = "com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2", f = "CallSystemMessageView.kt", l = {223}, m = "emit")
                        /* renamed from: com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2$1  reason: invalid class name */
                        /* loaded from: classes4.dex */
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, long j10) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$start$inlined = j10;
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
                                boolean r0 = r10 instanceof com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L_0x0013
                                r0 = r10
                                com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
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
                                java.lang.Object r1 = tf.b.d()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L_0x0031
                                if (r2 != r3) goto L_0x0029
                                nf.t.b(r10)
                                goto L_0x0062
                            L_0x0029:
                                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                                r9.<init>(r10)
                                throw r9
                            L_0x0031:
                                nf.t.b(r10)
                                kotlinx.coroutines.flow.FlowCollector r10 = r8.$this_unsafeFlow
                                kotlin.Unit r9 = (kotlin.Unit) r9
                                si.a$a r9 = si.a.f28973l
                                long r4 = java.lang.System.currentTimeMillis()
                                long r6 = r8.$start$inlined
                                long r4 = r4 - r6
                                si.d r9 = si.d.MILLISECONDS
                                long r4 = si.c.t(r4, r9)
                                si.a r9 = si.a.e(r4)
                                si.a$a r2 = si.a.f28973l
                                long r4 = r2.b()
                                si.a r2 = si.a.e(r4)
                                java.lang.Comparable r9 = eg.h.e(r9, r2)
                                r0.label = r3
                                java.lang.Object r9 = r10.emit(r9, r0)
                                if (r9 != r1) goto L_0x0062
                                return r1
                            L_0x0062:
                                kotlin.Unit r9 = kotlin.Unit.f22034a
                                return r9
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super a> flowCollector, Continuation continuation) {
                        Object d11;
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, j10), continuation);
                        d11 = d.d();
                        if (collect == d11) {
                            return collect;
                        }
                        return Unit.f22034a;
                    }
                }, y0.a());
                final CallSystemMessageView callSystemMessageView = this.this$0;
                final Message message = this.$message;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.discord.chat.presentation.message.system.CallSystemMessageView.setMessage.1.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return m289emitVtjQ1oo(((a) obj2).K(), continuation);
                    }

                    /* renamed from: emit-VtjQ1oo  reason: not valid java name */
                    public final Object m289emitVtjQ1oo(long j11, Continuation<? super Unit> continuation) {
                        CallSystemMessageViewBinding callSystemMessageViewBinding;
                        CallSystemMessageView callSystemMessageView2 = CallSystemMessageView.this;
                        Message message2 = message;
                        long m10 = a.m(j11);
                        int q10 = a.q(j11);
                        int s10 = a.s(j11);
                        a.r(j11);
                        callSystemMessageViewBinding = callSystemMessageView2.binding;
                        TextView textView = callSystemMessageViewBinding.info;
                        String format = String.format("%02d:%02d:%02d%s", Arrays.copyOf(new Object[]{b.d(m10), b.c(q10), b.c(s10), message2.getDescription()}, 4));
                        q.f(format, "format(this, *args)");
                        textView.setText(format);
                        return Unit.f22034a;
                    }
                };
                this.label = 1;
                if (f10.collect(flowCollector, this) == d10) {
                    return d10;
                }
            } else if (i10 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.f22034a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallSystemMessageView$setMessage$1(CallSystemMessageView callSystemMessageView, long j10, Message message, Continuation<? super CallSystemMessageView$setMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = callSystemMessageView;
        this.$start = j10;
        this.$message = message;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CallSystemMessageView$setMessage$1(this.this$0, this.$start, this.$message, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CallSystemMessageView$setMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22034a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = d.d();
        int i10 = this.label;
        if (i10 == 0) {
            t.b(obj);
            CallSystemMessageView callSystemMessageView = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 r92 = new AnonymousClass1(this.$start, callSystemMessageView, this.$message, null);
            this.label = 1;
            if (CoroutineViewUtilsKt.repeatOnLifecycleOwner(callSystemMessageView, state, r92, this) == d10) {
                return d10;
            }
        } else if (i10 == 1) {
            t.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f22034a;
    }
}
