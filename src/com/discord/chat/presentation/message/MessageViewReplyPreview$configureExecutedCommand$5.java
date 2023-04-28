package com.discord.chat.presentation.message;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.executedcommand.ExecutedCommand;
import com.discord.chat.presentation.textutils.LinkStyle;
import com.discord.fonts.DiscordFont;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "Lcom/discord/chat/presentation/textutils/LinkStyle;", "it", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class MessageViewReplyPreview$configureExecutedCommand$5 extends AbstractC9973s implements Function1<LinkContentNode, LinkStyle> {
    final /* synthetic */ ExecutedCommand $executedCommand;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageViewReplyPreview$configureExecutedCommand$5(ExecutedCommand executedCommand) {
        super(1);
        this.$executedCommand = executedCommand;
    }

    public final LinkStyle invoke(LinkContentNode it) {
        C9971q.m14633g(it, "it");
        if (!C9971q.m14638b(it.getTarget(), "usernameOnClick")) {
            return new LinkStyle(DiscordFont.PrimarySemibold, 0, 2, null);
        }
        return new LinkStyle(DiscordFont.PrimarySemibold, this.$executedCommand.getUsernameColor());
    }
}
