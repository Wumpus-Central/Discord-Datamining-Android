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
/* loaded from: classes5.dex */
final class EmbedView$setFields$onLinkClickedWithMessageId$1 extends s implements Function1<LinkContentNode, Unit> {
    final /* synthetic */ String $messageId;
    final /* synthetic */ Function2<MessageId, LinkContentNode, Unit> $onLinkClicked;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmbedView$setFields$onLinkClickedWithMessageId$1(Function2<? super MessageId, ? super LinkContentNode, Unit> function2, String str) {
        super(1);
        this.$onLinkClicked = function2;
        this.$messageId = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LinkContentNode linkContentNode) {
        invoke2(linkContentNode);
        return Unit.f22080a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LinkContentNode node) {
        q.g(node, "node");
        this.$onLinkClicked.invoke(MessageId.m572boximpl(this.$messageId), node);
    }
}
