package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.message.messagepart.MessageContentAccessory;
import com.discord.chat.presentation.textutils.LinkStyle;
import com.discord.fonts.DiscordFont;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/discord/chat/presentation/textutils/LinkStyle;", "it", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MessageContentViewHolder$bind$1 extends s implements Function1<LinkContentNode, LinkStyle> {
    final /* synthetic */ MessageContentAccessory $messageContentItem;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageContentViewHolder$bind$1(MessageContentAccessory messageContentAccessory) {
        super(1);
        this.$messageContentItem = messageContentAccessory;
    }

    public final LinkStyle invoke(LinkContentNode it) {
        DiscordFont discordFont;
        q.g(it, "it");
        if (this.$messageContentItem.getBoldLinkText()) {
            discordFont = DiscordFont.PrimarySemibold;
        } else {
            discordFont = DiscordFont.PrimaryNormal;
        }
        return new LinkStyle(discordFont, this.$messageContentItem.getLinkColor());
    }
}
