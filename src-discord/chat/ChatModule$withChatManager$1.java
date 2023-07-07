package com.discord.chat;

import com.discord.chat.listmanager.ChatListManager;
import gf.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import mf.d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.chat.ChatModule$withChatManager$1", f = "ChatModule.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ChatModule$withChatManager$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<ChatListManager, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ ChatListManager $manager;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatModule$withChatManager$1(Function2<? super ChatListManager, ? super Continuation<? super Unit>, ? extends Object> function2, ChatListManager chatListManager, Continuation<? super ChatModule$withChatManager$1> continuation) {
        super(2, continuation);
        this.$block = function2;
        this.$manager = chatListManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatModule$withChatManager$1(this.$block, this.$manager, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatModule$withChatManager$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f20717a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = d.d();
        int i10 = this.label;
        if (i10 == 0) {
            t.b(obj);
            Function2<ChatListManager, Continuation<? super Unit>, Object> function2 = this.$block;
            ChatListManager chatListManager = this.$manager;
            this.label = 1;
            if (function2.invoke(chatListManager, this) == d10) {
                return d10;
            }
        } else if (i10 == 1) {
            t.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f20717a;
    }
}
