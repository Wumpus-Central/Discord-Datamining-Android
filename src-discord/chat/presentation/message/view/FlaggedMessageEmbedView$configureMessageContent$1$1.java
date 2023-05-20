package com.discord.chat.presentation.message.view;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/discord/primitives/MessageId;", "<anonymous parameter 1>", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "invoke-ntcYbpo", "(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class FlaggedMessageEmbedView$configureMessageContent$1$1 extends s implements Function2<MessageId, LinkContentNode, Unit> {
    public static final FlaggedMessageEmbedView$configureMessageContent$1$1 INSTANCE = new FlaggedMessageEmbedView$configureMessageContent$1$1();

    FlaggedMessageEmbedView$configureMessageContent$1$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(MessageId messageId, LinkContentNode linkContentNode) {
        m296invokentcYbpo(messageId.m580unboximpl(), linkContentNode);
        return Unit.f22076a;
    }

    /* renamed from: invoke-ntcYbpo  reason: not valid java name */
    public final void m296invokentcYbpo(String str, LinkContentNode linkContentNode) {
        q.g(str, "<anonymous parameter 0>");
        q.g(linkContentNode, "<anonymous parameter 1>");
    }
}
