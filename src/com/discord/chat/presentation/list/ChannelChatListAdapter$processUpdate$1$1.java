package com.discord.chat.presentation.list;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9636e;
import kotlin.coroutines.jvm.internal.AbstractC9643k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nf.C10848t;
import tf.C12962d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9636e(m14702c = "com.discord.chat.presentation.list.ChannelChatListAdapter$processUpdate$1$1", m14701f = "ChannelChatListAdapter.kt", m14700l = {}, m14699m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ChannelChatListAdapter$processUpdate$1$1 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChannelChatListAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelChatListAdapter$processUpdate$1$1(ChannelChatListAdapter channelChatListAdapter, Continuation<? super ChannelChatListAdapter$processUpdate$1$1> continuation) {
        super(2, continuation);
        this.this$0 = channelChatListAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChannelChatListAdapter$processUpdate$1$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChannelChatListAdapter$processUpdate$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Object invokeSuspend(Object obj) {
        C12962d.m4646d();
        if (this.label == 0) {
            C10848t.m10930b(obj);
            this.this$0.isProcessingUpdate = false;
            this.this$0.processNextUpdate();
            return Unit.f25780a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
