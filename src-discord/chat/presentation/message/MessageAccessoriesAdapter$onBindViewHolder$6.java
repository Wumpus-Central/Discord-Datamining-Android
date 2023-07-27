package com.discord.chat.presentation.message;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;


@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

public  class MessageAccessoriesAdapter$onBindViewHolder$6 extends n implements Function2<MessageId, LinkContentNode, Unit> {
    
    public MessageAccessoriesAdapter$onBindViewHolder$6(Object obj) {
        super(2, obj, ChatEventHandler.class, "onLinkClicked", "onLinkClicked-ntcYbpo(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", 0);
    }

    @Override 
    public   Unit invoke(MessageId messageId, LinkContentNode linkContentNode) {
        m207invokentcYbpo(messageId.m600unboximpl(), linkContentNode);
        return Unit.f20670a;
    }

    
    public final void m207invokentcYbpo(String p02, LinkContentNode p12) {
        q.g(p02, "p0");
        q.g(p12, "p1");
        ((ChatEventHandler) this.receiver).mo148onLinkClickedntcYbpo(p02, p12);
    }
}
