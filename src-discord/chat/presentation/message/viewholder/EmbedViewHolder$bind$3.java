package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public /* synthetic */ class EmbedViewHolder$bind$3 extends n implements Function2<MessageId, LinkContentNode, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public EmbedViewHolder$bind$3(Object obj) {
        super(2, obj, ChatEventHandler.class, "onLinkClicked", "onLinkClicked-ntcYbpo(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(MessageId messageId, LinkContentNode linkContentNode) {
        m330invokentcYbpo(messageId.m597unboximpl(), linkContentNode);
        return Unit.f22113a;
    }

    /* renamed from: invoke-ntcYbpo  reason: not valid java name */
    public final void m330invokentcYbpo(String p02, LinkContentNode p12) {
        q.g(p02, "p0");
        q.g(p12, "p1");
        ((ChatEventHandler) this.receiver).mo149onLinkClickedntcYbpo(p02, p12);
    }
}
