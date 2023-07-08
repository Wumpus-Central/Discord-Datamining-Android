package com.discord.chat.presentation.message;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class MessageAccessoriesAdapter$onBindViewHolder$42 extends n implements Function2<MessageId, ChannelId, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageAccessoriesAdapter$onBindViewHolder$42(Object obj) {
        super(2, obj, ChatEventHandler.class, "onTapAutoModerationActions", "onTapAutoModerationActions-pfaIj0E(Ljava/lang/String;J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(MessageId messageId, ChannelId channelId) {
        m202invokepfaIj0E(messageId.m598unboximpl(), channelId.m573unboximpl());
        return Unit.f20663a;
    }

    /* renamed from: invoke-pfaIj0E  reason: not valid java name */
    public final void m202invokepfaIj0E(String p02, long j10) {
        q.g(p02, "p0");
        ((ChatEventHandler) this.receiver).mo156onTapAutoModerationActionspfaIj0E(p02, j10);
    }
}
