package com.discord.chat.presentation.message;

import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class MessageViewReplyPreview$configureExecutedCommand$4 extends s implements Function1<CommandMentionContentNode, Unit> {
    final  ChatEventHandler $eventHandler;

    
    
    public MessageViewReplyPreview$configureExecutedCommand$4(ChatEventHandler chatEventHandler) {
        super(1);
        this.$eventHandler = chatEventHandler;
    }

    @Override 
    public   Unit invoke(CommandMentionContentNode commandMentionContentNode) {
        invoke2(commandMentionContentNode);
        return Unit.f21444a;
    }

    
    public final void invoke2(CommandMentionContentNode it) {
        q.h(it, "it");
        this.$eventHandler.onLongPressCommand(it);
    }
}
