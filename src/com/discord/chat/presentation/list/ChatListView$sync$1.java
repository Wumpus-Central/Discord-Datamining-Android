package com.discord.chat.presentation.list;

import com.discord.chat.listmanager.ChatListUpdate;
import com.discord.chat.presentation.list.ChatListView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9636e;
import kotlin.coroutines.jvm.internal.AbstractC9643k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nf.C10848t;
import tf.C12962d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9636e(m14702c = "com.discord.chat.presentation.list.ChatListView$sync$1", m14701f = "ChatListView.kt", m14700l = {186}, m14699m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ChatListView$sync$1 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChatListView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListView$sync$1(ChatListView chatListView, Continuation<? super ChatListView$sync$1> continuation) {
        super(2, continuation);
        this.this$0 = chatListView;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatListView$sync$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatListView$sync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Object invokeSuspend(Object obj) {
        Object d;
        ChatListView.DataSource dataSource;
        d = C12962d.m4646d();
        int i = this.label;
        if (i == 0) {
            C10848t.m10930b(obj);
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            ref$BooleanRef.f25805k = true;
            dataSource = this.this$0.dataSource;
            if (dataSource == null) {
                C9677q.m14615y("dataSource");
                dataSource = null;
            }
            Flow<ChatListUpdate> updatesFlow = dataSource.getUpdatesFlow();
            final ChatListView chatListView = this.this$0;
            FlowCollector<? super ChatListUpdate> flowCollector = new FlowCollector() { // from class: com.discord.chat.presentation.list.ChatListView$sync$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((ChatListUpdate) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(ChatListUpdate chatListUpdate, Continuation<? super Unit> continuation) {
                    if (Ref$BooleanRef.this.f25805k) {
                        chatListView.onChatListUpdate(ChatListUpdate.copy$default(chatListUpdate, null, null, null, 3, null));
                        Ref$BooleanRef.this.f25805k = false;
                    } else {
                        chatListView.onChatListUpdate(chatListUpdate);
                    }
                    return Unit.f25780a;
                }
            };
            this.label = 1;
            if (updatesFlow.collect(flowCollector, this) == d) {
                return d;
            }
        } else if (i == 1) {
            C10848t.m10930b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f25780a;
    }
}
