package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class GuildEventInviteViewHolder$bind$1$1$6 extends n implements Function1<CommandMentionContentNode, Unit> {
    
    public GuildEventInviteViewHolder$bind$1$1$6(Object obj) {
        super(1, obj, ChatEventHandler.class, "onTapCommand", "onTapCommand(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V", 0);
    }

    @Override 
    public   Unit invoke(CommandMentionContentNode commandMentionContentNode) {
        invoke2(commandMentionContentNode);
        return Unit.f21600a;
    }

    
    public final void invoke2(CommandMentionContentNode p02) {
        q.h(p02, "p0");
        ((ChatEventHandler) this.receiver).onTapCommand(p02);
    }
}
