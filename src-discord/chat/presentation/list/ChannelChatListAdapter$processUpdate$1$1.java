package com.discord.chat.presentation.list;

import ff.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import lf.d;


@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.chat.presentation.list.ChannelChatListAdapter$processUpdate$1$1", f = "ChannelChatListAdapter.kt", l = {}, m = "invokeSuspend")

public final class ChannelChatListAdapter$processUpdate$1$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final  ChannelChatListAdapter this$0;

    
    
    public ChannelChatListAdapter$processUpdate$1$1(ChannelChatListAdapter channelChatListAdapter, Continuation<? super ChannelChatListAdapter$processUpdate$1$1> continuation) {
        super(2, continuation);
        this.this$0 = channelChatListAdapter;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChannelChatListAdapter$processUpdate$1$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChannelChatListAdapter$processUpdate$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f20663a);
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        d.d();
        if (this.label == 0) {
            t.b(obj);
            this.this$0.isProcessingUpdate = false;
            this.this$0.processNextUpdate();
            return Unit.f20663a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
