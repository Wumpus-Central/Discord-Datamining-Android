package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9674n;
import kotlin.jvm.internal.C9677q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public /* synthetic */ class EphemeralIndicationViewHolder$bind$1$1 extends C9674n implements Function2<MessageId, LinkContentNode, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public EphemeralIndicationViewHolder$bind$1$1(Object obj) {
        super(2, obj, ChatEventHandler.class, "onLinkClicked", "onLinkClicked-ntcYbpo(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(MessageId messageId, LinkContentNode linkContentNode) {
        m41883invokentcYbpo(messageId.m42123unboximpl(), linkContentNode);
        return Unit.f25780a;
    }

    /* renamed from: invoke-ntcYbpo  reason: not valid java name */
    public final void m41883invokentcYbpo(String p0, LinkContentNode p1) {
        C9677q.m14633g(p0, "p0");
        C9677q.m14633g(p1, "p1");
        ((ChatEventHandler) this.receiver).mo41703onLinkClickedntcYbpo(p0, p1);
    }
}
