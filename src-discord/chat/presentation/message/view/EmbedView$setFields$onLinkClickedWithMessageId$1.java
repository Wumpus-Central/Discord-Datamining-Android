package com.discord.chat.presentation.message.view;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "node", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class EmbedView$setFields$onLinkClickedWithMessageId$1 extends s implements Function1<LinkContentNode, Unit> {
    final  String $messageId;
    final  Function2<MessageId, LinkContentNode, Unit> $onLinkClicked;

    
    
    
    public EmbedView$setFields$onLinkClickedWithMessageId$1(Function2<? super MessageId, ? super LinkContentNode, Unit> function2, String str) {
        super(1);
        this.$onLinkClicked = function2;
        this.$messageId = str;
    }

    @Override 
    public   Unit invoke(LinkContentNode linkContentNode) {
        invoke2(linkContentNode);
        return Unit.f21215a;
    }

    
    public final void invoke2(LinkContentNode node) {
        q.h(node, "node");
        this.$onLinkClicked.invoke(MessageId.m617boximpl(this.$messageId), node);
    }
}
