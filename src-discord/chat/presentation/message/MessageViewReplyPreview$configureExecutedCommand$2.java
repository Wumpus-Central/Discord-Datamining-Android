package com.discord.chat.presentation.message;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class MessageViewReplyPreview$configureExecutedCommand$2 extends s implements Function1<LinkContentNode, Unit> {
    final /* synthetic */ ChatEventHandler $eventHandler;
    final /* synthetic */ String $messageId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageViewReplyPreview$configureExecutedCommand$2(ChatEventHandler chatEventHandler, String str) {
        super(1);
        this.$eventHandler = chatEventHandler;
        this.$messageId = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LinkContentNode linkContentNode) {
        invoke2(linkContentNode);
        return Unit.f22035a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LinkContentNode it) {
        q.g(it, "it");
        this.$eventHandler.mo140onLinkClickedntcYbpo(this.$messageId, it);
    }
}
