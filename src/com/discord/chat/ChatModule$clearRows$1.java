package com.discord.chat;

import com.discord.chat.listmanager.ChatListManager;
import com.discord.chatreplay.logger.RowLogger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.jvm.functions.Function2;
import nf.C11093t;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m15073d2 = {"Lcom/discord/chat/listmanager/ChatListManager;", "manager", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9931e(m14702c = "com.discord.chat.ChatModule$clearRows$1", m14701f = "ChatModule.kt", m14700l = {}, m14699m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ChatModule$clearRows$1 extends AbstractC9938k implements Function2<ChatListManager, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $tag;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatModule$clearRows$1(ChatModule chatModule, int i, Continuation<? super ChatModule$clearRows$1> continuation) {
        super(2, continuation);
        this.this$0 = chatModule;
        this.$tag = i;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatModule$clearRows$1 chatModule$clearRows$1 = new ChatModule$clearRows$1(this.this$0, this.$tag, continuation);
        chatModule$clearRows$1.L$0 = obj;
        return chatModule$clearRows$1;
    }

    public final Object invoke(ChatListManager chatListManager, Continuation<? super Unit> continuation) {
        return ((ChatModule$clearRows$1) create(chatListManager, continuation)).invokeSuspend(Unit.f22042a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Object invokeSuspend(Object obj) {
        RowLogger rowUpdateLoggerFor;
        C13080d.m4646d();
        if (this.label == 0) {
            C11093t.m10930b(obj);
            rowUpdateLoggerFor = this.this$0.rowUpdateLoggerFor(this.$tag);
            rowUpdateLoggerFor.logRowsClear();
            ((ChatListManager) this.L$0).clearRows();
            return Unit.f22042a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
