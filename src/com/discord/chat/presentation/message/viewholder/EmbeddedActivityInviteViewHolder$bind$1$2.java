package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9674n;
import kotlin.jvm.internal.C9677q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public /* synthetic */ class EmbeddedActivityInviteViewHolder$bind$1$2 extends C9674n implements Function1<LinkContentNode, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public EmbeddedActivityInviteViewHolder$bind$1$2(Object obj) {
        super(1, obj, ChatEventHandler.class, "onLinkLongClicked", "onLinkLongClicked(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LinkContentNode linkContentNode) {
        invoke2(linkContentNode);
        return Unit.f25780a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LinkContentNode p0) {
        C9677q.m14633g(p0, "p0");
        ((ChatEventHandler) this.receiver).onLinkLongClicked(p0);
    }
}
