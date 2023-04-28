package com.discord.chat.presentation.message.view;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.textutils.LinkStyle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "Lcom/discord/chat/presentation/textutils/LinkStyle;", "<anonymous parameter 0>", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class MessageContentView$setMessageContent$1 extends AbstractC9973s implements Function1<LinkContentNode, LinkStyle> {
    public static final MessageContentView$setMessageContent$1 INSTANCE = new MessageContentView$setMessageContent$1();

    MessageContentView$setMessageContent$1() {
        super(1);
    }

    public final LinkStyle invoke(LinkContentNode linkContentNode) {
        C9971q.m14633g(linkContentNode, "<anonymous parameter 0>");
        return new LinkStyle(null, 0, 3, null);
    }
}
