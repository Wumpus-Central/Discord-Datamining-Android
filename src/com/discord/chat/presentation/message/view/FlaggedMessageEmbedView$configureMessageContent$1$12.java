package com.discord.chat.presentation.message.view;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.textutils.LinkStyle;
import com.discord.fonts.DiscordFont;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "Lcom/discord/chat/presentation/textutils/LinkStyle;", "it", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class FlaggedMessageEmbedView$configureMessageContent$1$12 extends AbstractC9679s implements Function1<LinkContentNode, LinkStyle> {
    public static final FlaggedMessageEmbedView$configureMessageContent$1$12 INSTANCE = new FlaggedMessageEmbedView$configureMessageContent$1$12();

    FlaggedMessageEmbedView$configureMessageContent$1$12() {
        super(1);
    }

    public final LinkStyle invoke(LinkContentNode it) {
        C9677q.m14633g(it, "it");
        return new LinkStyle(DiscordFont.PrimaryNormal, ThemeManagerKt.getTheme().getTextNormal());
    }
}
