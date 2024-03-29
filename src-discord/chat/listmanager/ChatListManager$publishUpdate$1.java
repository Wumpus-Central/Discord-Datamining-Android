package com.discord.chat.listmanager;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import pf.t;
import vf.d;


@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.chat.listmanager.ChatListManager$publishUpdate$1", f = "ChatListManager.kt", l = {239}, m = "invokeSuspend")

public final class ChatListManager$publishUpdate$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final  ChatListUpdate $update;
    int label;
    final  ChatListManager this$0;

    
    
    public ChatListManager$publishUpdate$1(ChatListManager chatListManager, ChatListUpdate chatListUpdate, Continuation<? super ChatListManager$publishUpdate$1> continuation) {
        super(2, continuation);
        this.this$0 = chatListManager;
        this.$update = chatListUpdate;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatListManager$publishUpdate$1(this.this$0, this.$update, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatListManager$publishUpdate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f21601a);
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        Object d10;
        MutableSharedFlow mutableSharedFlow;
        d10 = d.d();
        int i10 = this.label;
        if (i10 == 0) {
            t.b(obj);
            mutableSharedFlow = this.this$0.updatesFlow;
            ChatListUpdate chatListUpdate = this.$update;
            this.label = 1;
            if (mutableSharedFlow.emit(chatListUpdate, this) == d10) {
                return d10;
            }
        } else if (i10 == 1) {
            t.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f21601a;
    }
}
