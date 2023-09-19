package com.discord.chat.presentation.list;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "scrollState", "Lcom/discord/chat/presentation/list/ScrollState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class ChatListView$scrollStateObserver$1 extends s implements Function1<ScrollState, Unit> {
    final  ChatListView this$0;

    
    
    public ChatListView$scrollStateObserver$1(ChatListView chatListView) {
        super(1);
        this.this$0 = chatListView;
    }

    @Override 
    public   Unit invoke(ScrollState scrollState) {
        invoke2(scrollState);
        return Unit.f21444a;
    }

    
    public final void invoke2(ScrollState scrollState) {
        ChatEventHandler chatEventHandler;
        ChatEventHandler chatEventHandler2;
        q.h(scrollState, "scrollState");
        chatEventHandler = this.this$0.eventHandler;
        if (chatEventHandler != null) {
            chatEventHandler2 = this.this$0.eventHandler;
            if (chatEventHandler2 == null) {
                q.z("eventHandler");
                chatEventHandler2 = null;
            }
            chatEventHandler2.onScrollStateChanged(scrollState);
        }
    }
}
