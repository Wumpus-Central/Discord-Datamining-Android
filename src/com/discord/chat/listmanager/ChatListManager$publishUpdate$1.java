package com.discord.chat.listmanager;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import nf.C11093t;
import tf.C13080d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9931e(m14702c = "com.discord.chat.listmanager.ChatListManager$publishUpdate$1", m14701f = "ChatListManager.kt", m14700l = {243}, m14699m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ChatListManager$publishUpdate$1 extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatListUpdate $update;
    int label;
    final /* synthetic */ ChatListManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListManager$publishUpdate$1(ChatListManager chatListManager, ChatListUpdate chatListUpdate, Continuation<? super ChatListManager$publishUpdate$1> continuation) {
        super(2, continuation);
        this.this$0 = chatListManager;
        this.$update = chatListUpdate;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatListManager$publishUpdate$1(this.this$0, this.$update, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatListManager$publishUpdate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Object invokeSuspend(Object obj) {
        Object d;
        MutableSharedFlow mutableSharedFlow;
        d = C13080d.m4646d();
        int i = this.label;
        if (i == 0) {
            C11093t.m10930b(obj);
            mutableSharedFlow = this.this$0.updatesFlow;
            ChatListUpdate chatListUpdate = this.$update;
            this.label = 1;
            if (mutableSharedFlow.emit(chatListUpdate, this) == d) {
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
