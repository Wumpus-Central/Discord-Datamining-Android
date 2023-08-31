package com.discord.chat.presentation.list;

import com.discord.chat.listmanager.ChatListUpdate;
import com.discord.chat.presentation.list.ChatListView;
import jf.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import pf.d;


@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.chat.presentation.list.ChatListView$sync$1", f = "ChatListView.kt", l = {218}, m = "invokeSuspend")

public final class ChatListView$sync$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final  ChatListView this$0;

    
    
    public ChatListView$sync$1(ChatListView chatListView, Continuation<? super ChatListView$sync$1> continuation) {
        super(2, continuation);
        this.this$0 = chatListView;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatListView$sync$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatListView$sync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f21215a);
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        Object d10;
        ChatListView.DataSource dataSource;
        d10 = d.d();
        int i10 = this.label;
        if (i10 == 0) {
            t.b(obj);
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            ref$BooleanRef.f21240j = true;
            dataSource = this.this$0.dataSource;
            if (dataSource == null) {
                q.z("dataSource");
                dataSource = null;
            }
            Flow<ChatListUpdate> updatesFlow = dataSource.getUpdatesFlow();
            final ChatListView chatListView = this.this$0;
            FlowCollector<? super ChatListUpdate> flowCollector = new FlowCollector() { 
                @Override 
                public   Object emit(Object obj2, Continuation continuation) {
                    return emit((ChatListUpdate) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(ChatListUpdate chatListUpdate, Continuation<? super Unit> continuation) {
                    if (Ref$BooleanRef.this.f21240j) {
                        chatListView.onChatListUpdate(ChatListUpdate.copy$default(chatListUpdate, null, null, null, 3, null));
                        Ref$BooleanRef.this.f21240j = false;
                    } else {
                        chatListView.onChatListUpdate(chatListUpdate);
                    }
                    return Unit.f21215a;
                }
            };
            this.label = 1;
            if (updatesFlow.collect(flowCollector, this) == d10) {
                return d10;
            }
        } else if (i10 == 1) {
            t.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f21215a;
    }
}
