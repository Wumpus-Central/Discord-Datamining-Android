package com.discord.chat.presentation.list;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m15073d2 = {"<anonymous>", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class ChatListView$chatListAdapter$4 extends AbstractC9679s implements Function0<ChatEventHandler> {
    final /* synthetic */ ChatListView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListView$chatListAdapter$4(ChatListView chatListView) {
        super(0);
        this.this$0 = chatListView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ChatEventHandler invoke() {
        ChatEventHandler chatEventHandler;
        chatEventHandler = this.this$0.eventHandler;
        if (chatEventHandler != null) {
            return chatEventHandler;
        }
        C9677q.m14615y("eventHandler");
        return null;
    }
}
