package com.discord.chat.presentation.message;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class MessageViewReplyPreview$configureExecutedCommand$2 extends s implements Function1<LinkContentNode, Unit> {
    final  ChatEventHandler $eventHandler;
    final  String $messageId;

    
    
    public MessageViewReplyPreview$configureExecutedCommand$2(ChatEventHandler chatEventHandler, String str) {
        super(1);
        this.$eventHandler = chatEventHandler;
        this.$messageId = str;
    }

    @Override 
    public   Unit invoke(LinkContentNode linkContentNode) {
        invoke2(linkContentNode);
        return Unit.f21036a;
    }

    
    public final void invoke2(LinkContentNode it) {
        q.h(it, "it");
        this.$eventHandler.mo149onLinkClickedntcYbpo(this.$messageId, it);
    }
}
