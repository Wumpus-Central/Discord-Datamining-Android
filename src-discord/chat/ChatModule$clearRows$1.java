package com.discord.chat;

import com.discord.chat.listmanager.ChatListManager;
import com.discord.chatreplay.logger.RowLogger;
import jf.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import pf.d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/discord/chat/listmanager/ChatListManager;", "manager", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.chat.ChatModule$clearRows$1", f = "ChatModule.kt", l = {}, m = "invokeSuspend")

final class ChatModule$clearRows$1 extends k implements Function2<ChatListManager, Continuation<? super Unit>, Object> {
    final  int $tag;
     Object L$0;
    int label;
    final  ChatModule this$0;

    
    
    public ChatModule$clearRows$1(ChatModule chatModule, int i10, Continuation<? super ChatModule$clearRows$1> continuation) {
        super(2, continuation);
        this.this$0 = chatModule;
        this.$tag = i10;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatModule$clearRows$1 chatModule$clearRows$1 = new ChatModule$clearRows$1(this.this$0, this.$tag, continuation);
        chatModule$clearRows$1.L$0 = obj;
        return chatModule$clearRows$1;
    }

    public final Object invoke(ChatListManager chatListManager, Continuation<? super Unit> continuation) {
        return ((ChatModule$clearRows$1) create(chatListManager, continuation)).invokeSuspend(Unit.f21025a);
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        RowLogger rowUpdateLoggerFor;
        d.d();
        if (this.label == 0) {
            t.b(obj);
            rowUpdateLoggerFor = this.this$0.rowUpdateLoggerFor(this.$tag);
            rowUpdateLoggerFor.logRowsClear();
            ((ChatListManager) this.L$0).clearRows();
            return Unit.f21025a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
