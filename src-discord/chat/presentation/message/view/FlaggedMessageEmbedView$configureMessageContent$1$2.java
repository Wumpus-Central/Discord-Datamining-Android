package com.discord.chat.presentation.message.view;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class FlaggedMessageEmbedView$configureMessageContent$1$2 extends s implements Function1<LinkContentNode, Unit> {
    public static final FlaggedMessageEmbedView$configureMessageContent$1$2 INSTANCE = new FlaggedMessageEmbedView$configureMessageContent$1$2();

    FlaggedMessageEmbedView$configureMessageContent$1$2() {
        super(1);
    }

    @Override 
    public   Unit invoke(LinkContentNode linkContentNode) {
        invoke2(linkContentNode);
        return Unit.f21436a;
    }

    
    public final void invoke2(LinkContentNode it) {
        q.h(it, "it");
    }
}
