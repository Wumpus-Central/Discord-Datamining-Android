package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;


@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

public  class SurveyIndicationViewHolder$bind$1$1 extends n implements Function2<MessageId, LinkContentNode, Unit> {
    
    public SurveyIndicationViewHolder$bind$1$1(Object obj) {
        super(2, obj, ChatEventHandler.class, "onLinkClicked", "onLinkClicked-ntcYbpo(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", 0);
    }

    @Override 
    public   Unit invoke(MessageId messageId, LinkContentNode linkContentNode) {
        m343invokentcYbpo(messageId.m600unboximpl(), linkContentNode);
        return Unit.f20670a;
    }

    
    public final void m343invokentcYbpo(String p02, LinkContentNode p12) {
        q.g(p02, "p0");
        q.g(p12, "p1");
        ((ChatEventHandler) this.receiver).mo148onLinkClickedntcYbpo(p02, p12);
    }
}
