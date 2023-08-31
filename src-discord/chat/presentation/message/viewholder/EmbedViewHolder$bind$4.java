package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;


@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

public  class EmbedViewHolder$bind$4 extends n implements Function1<LinkContentNode, Unit> {
    
    public EmbedViewHolder$bind$4(Object obj) {
        super(1, obj, ChatEventHandler.class, "onLinkLongClicked", "onLinkLongClicked(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", 0);
    }

    @Override 
    public   Unit invoke(LinkContentNode linkContentNode) {
        invoke2(linkContentNode);
        return Unit.f21215a;
    }

    
    public final void invoke2(LinkContentNode p02) {
        q.h(p02, "p0");
        ((ChatEventHandler) this.receiver).onLinkLongClicked(p02);
    }
}
