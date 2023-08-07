package com.discord.chat.presentation.list;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class ChatListView$chatListAdapter$4 extends s implements Function0<ChatEventHandler> {
    final  ChatListView this$0;

    
    
    public ChatListView$chatListAdapter$4(ChatListView chatListView) {
        super(0);
        this.this$0 = chatListView;
    }

    
    @Override 
    public final ChatEventHandler invoke() {
        ChatEventHandler chatEventHandler;
        chatEventHandler = this.this$0.eventHandler;
        if (chatEventHandler != null) {
            return chatEventHandler;
        }
        q.z("eventHandler");
        return null;
    }
}
