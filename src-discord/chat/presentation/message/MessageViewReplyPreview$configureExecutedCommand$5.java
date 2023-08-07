package com.discord.chat.presentation.message;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.executedcommand.ExecutedCommand;
import com.discord.chat.presentation.textutils.LinkStyle;
import com.discord.fonts.DiscordFont;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/discord/chat/presentation/textutils/LinkStyle;", "it", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class MessageViewReplyPreview$configureExecutedCommand$5 extends s implements Function1<LinkContentNode, LinkStyle> {
    final  ExecutedCommand $executedCommand;

    
    
    public MessageViewReplyPreview$configureExecutedCommand$5(ExecutedCommand executedCommand) {
        super(1);
        this.$executedCommand = executedCommand;
    }

    public final LinkStyle invoke(LinkContentNode it) {
        q.h(it, "it");
        if (!q.c(it.getTarget(), "usernameOnClick")) {
            return new LinkStyle(DiscordFont.PrimarySemibold, 0, 2, null);
        }
        return new LinkStyle(DiscordFont.PrimarySemibold, this.$executedCommand.getUsernameColor());
    }
}
