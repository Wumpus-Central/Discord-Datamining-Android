package com.discord.chat.presentation.textutils;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/discord/chat/presentation/textutils/LinkStyle;", "<anonymous parameter 0>", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class TextUtilsKt$toSpannable$10 extends s implements Function1<LinkContentNode, LinkStyle> {
    public static final TextUtilsKt$toSpannable$10 INSTANCE = new TextUtilsKt$toSpannable$10();

    TextUtilsKt$toSpannable$10() {
        super(1);
    }

    public final LinkStyle invoke(LinkContentNode linkContentNode) {
        q.g(linkContentNode, "<anonymous parameter 0>");
        return new LinkStyle(null, 0, 3, null);
    }
}
