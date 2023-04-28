package com.discord.chat.presentation.message;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9674n;
import kotlin.jvm.internal.C9677q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public /* synthetic */ class MessageAccessoriesAdapter$onBindViewHolder$38 extends C9674n implements Function2<MessageId, ChannelId, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageAccessoriesAdapter$onBindViewHolder$38(Object obj) {
        super(2, obj, ChatEventHandler.class, "onTapAutoModerationActions", "onTapAutoModerationActions-pfaIj0E(Ljava/lang/String;J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(MessageId messageId, ChannelId channelId) {
        m41751invokepfaIj0E(messageId.m42123unboximpl(), channelId.m42098unboximpl());
        return Unit.f25780a;
    }

    /* renamed from: invoke-pfaIj0E  reason: not valid java name */
    public final void m41751invokepfaIj0E(String p0, long j) {
        C9677q.m14633g(p0, "p0");
        ((ChatEventHandler) this.receiver).mo41711onTapAutoModerationActionspfaIj0E(p0, j);
    }
}
