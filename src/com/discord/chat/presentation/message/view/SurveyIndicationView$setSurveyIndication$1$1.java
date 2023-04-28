package com.discord.chat.presentation.message.view;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "node", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class SurveyIndicationView$setSurveyIndication$1$1 extends AbstractC9679s implements Function1<LinkContentNode, Unit> {
    final /* synthetic */ String $messageId;
    final /* synthetic */ Function2<MessageId, LinkContentNode, Unit> $onLinkClicked;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SurveyIndicationView$setSurveyIndication$1$1(Function2<? super MessageId, ? super LinkContentNode, Unit> function2, String str) {
        super(1);
        this.$onLinkClicked = function2;
        this.$messageId = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LinkContentNode linkContentNode) {
        invoke2(linkContentNode);
        return Unit.f25780a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LinkContentNode node) {
        C9677q.m14633g(node, "node");
        this.$onLinkClicked.invoke(MessageId.m42115boximpl(this.$messageId), node);
    }
}
