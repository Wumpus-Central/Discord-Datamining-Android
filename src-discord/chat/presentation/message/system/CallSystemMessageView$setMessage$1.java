package com.discord.chat.presentation.message.system;

import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.discord.chat.bridge.Message;
import com.discord.chat.databinding.CallSystemMessageViewBinding;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.discord.misc.utilities.time.IntervalFlowKt;
import java.util.Arrays;
import jf.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import oi.a;
import oi.c;
import pf.d;


@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1", f = "CallSystemMessageView.kt", l = {82}, m = "invokeSuspend")

public final class CallSystemMessageView$setMessage$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final  Message $message;
    final  long $start;
    int label;
    final  CallSystemMessageView this$0;

    
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1", f = "CallSystemMessageView.kt", l = {90}, m = "invokeSuspend")
    
    
    public static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final  Message $message;
        final  long $start;
        int label;
        final  CallSystemMessageView this$0;

        
        AnonymousClass1(long j10, CallSystemMessageView callSystemMessageView, Message message, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$start = j10;
            this.this$0 = callSystemMessageView;
            this.$message = message;
        }

        @Override 
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$start, this.this$0, this.$message, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f21036a);
        }

        @Override 
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = d.d();
            int i10 = this.label;
            if (i10 == 0) {
                t.b(obj);
                a.C0358a aVar = a.f25071l;
                final Flow<Unit> flow = IntervalFlowKt.m481intervalFlowQTBD994(c.s(1, oi.d.SECONDS), a.f25071l.b());
                final long j10 = this.$start;
                Flow f10 = kotlinx.coroutines.flow.d.f(new Flow<a>() { 

                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    
                    
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final  long $start$inlined;
                        final  FlowCollector $this_unsafeFlow;

                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        @e(c = "com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2", f = "CallSystemMessageView.kt", l = {223}, m = "emit")
                        
                        
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                            Object L$0;
                            int label;
                             Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override 
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

                        
                        
                        @Override 
                        
                        public final java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
                            
                            throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override 
                    public Object collect(FlowCollector<? super a> flowCollector, Continuation continuation) {
                        Object d11;
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, j10), continuation);
                        d11 = d.d();
                        if (collect == d11) {
                            return collect;
                        }
                        return Unit.f21036a;
                    }
                }, a1.a());
                final CallSystemMessageView callSystemMessageView = this.this$0;
                final Message message = this.$message;
                FlowCollector flowCollector = new FlowCollector() { 
                    @Override 
                    public   Object emit(Object obj2, Continuation continuation) {
                        return m307emitVtjQ1oo(((a) obj2).K(), continuation);
                    }

                    
                    public final Object m307emitVtjQ1oo(long j11, Continuation<? super Unit> continuation) {
                        CallSystemMessageViewBinding callSystemMessageViewBinding;
                        CallSystemMessageView callSystemMessageView2 = CallSystemMessageView.this;
                        Message message2 = message;
                        long p10 = a.p(j11);
                        int t10 = a.t(j11);
                        int v10 = a.v(j11);
                        a.u(j11);
                        callSystemMessageViewBinding = callSystemMessageView2.binding;
                        TextView textView = callSystemMessageViewBinding.info;
                        String format = String.format("%02d:%02d:%02d%s", Arrays.copyOf(new Object[]{b.d(p10), b.c(t10), b.c(v10), message2.getDescription()}, 4));
                        q.g(format, "format(this, *args)");
                        textView.setText(format);
                        return Unit.f21036a;
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
            return Unit.f21036a;
        }
    }

    
    
    public CallSystemMessageView$setMessage$1(CallSystemMessageView callSystemMessageView, long j10, Message message, Continuation<? super CallSystemMessageView$setMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = callSystemMessageView;
        this.$start = j10;
        this.$message = message;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CallSystemMessageView$setMessage$1(this.this$0, this.$start, this.$message, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CallSystemMessageView$setMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f21036a);
    }

    @Override 
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
        return Unit.f21036a;
    }
}
