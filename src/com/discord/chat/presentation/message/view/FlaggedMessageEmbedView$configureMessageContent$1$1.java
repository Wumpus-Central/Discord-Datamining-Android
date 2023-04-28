package com.discord.chat.presentation.message.view;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m15073d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/discord/primitives/MessageId;", "<anonymous parameter 1>", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "invoke-ntcYbpo", "(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class FlaggedMessageEmbedView$configureMessageContent$1$1 extends AbstractC9973s implements Function2<MessageId, LinkContentNode, Unit> {
    public static final FlaggedMessageEmbedView$configureMessageContent$1$1 INSTANCE = new FlaggedMessageEmbedView$configureMessageContent$1$1();

    FlaggedMessageEmbedView$configureMessageContent$1$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(MessageId messageId, LinkContentNode linkContentNode) {
        m41857invokentcYbpo(messageId.m42123unboximpl(), linkContentNode);
        return Unit.f22042a;
    }

    /* renamed from: invoke-ntcYbpo  reason: not valid java name */
    public final void m41857invokentcYbpo(String str, LinkContentNode linkContentNode) {
        C9971q.m14633g(str, "<anonymous parameter 0>");
        C9971q.m14633g(linkContentNode, "<anonymous parameter 1>");
    }
}
