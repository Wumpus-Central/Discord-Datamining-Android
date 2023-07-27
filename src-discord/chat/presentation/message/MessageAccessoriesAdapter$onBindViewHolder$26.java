package com.discord.chat.presentation.message;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.ChannelId;
import com.discord.reactions.ReactionView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "reaction", "Lcom/discord/reactions/ReactionView$Reaction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class MessageAccessoriesAdapter$onBindViewHolder$26 extends s implements Function1<ReactionView.Reaction, Unit> {
    final  MessageAccessoriesAdapter this$0;

    
    
    public MessageAccessoriesAdapter$onBindViewHolder$26(MessageAccessoriesAdapter messageAccessoriesAdapter) {
        super(1);
        this.this$0 = messageAccessoriesAdapter;
    }

    @Override 
    public   Unit invoke(ReactionView.Reaction reaction) {
        invoke2(reaction);
        return Unit.f20670a;
    }

    
    public final void invoke2(ReactionView.Reaction reaction) {
        ChatEventHandler chatEventHandler;
        String str;
        ChannelId channelId;
        q.g(reaction, "reaction");
        chatEventHandler = this.this$0.eventHandler;
        if (chatEventHandler == null) {
            q.y("eventHandler");
            chatEventHandler = null;
        }
        str = this.this$0.messageId;
        q.d(str);
        channelId = this.this$0.channelId;
        q.d(channelId);
        chatEventHandler.mo151onLongPressReactionEqy5D80(str, channelId.m575unboximpl(), reaction);
    }
}
