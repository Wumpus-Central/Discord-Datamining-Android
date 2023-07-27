package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class GuildEventInviteViewHolder$bind$1$1$2 extends n implements Function1<LinkContentNode, Unit> {
    
    public GuildEventInviteViewHolder$bind$1$1$2(Object obj) {
        super(1, obj, ChatEventHandler.class, "onLinkLongClicked", "onLinkLongClicked(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", 0);
    }

    @Override 
    public   Unit invoke(LinkContentNode linkContentNode) {
        invoke2(linkContentNode);
        return Unit.f20670a;
    }

    
    public final void invoke2(LinkContentNode p02) {
        q.g(p02, "p0");
        ((ChatEventHandler) this.receiver).onLinkLongClicked(p02);
    }
}
