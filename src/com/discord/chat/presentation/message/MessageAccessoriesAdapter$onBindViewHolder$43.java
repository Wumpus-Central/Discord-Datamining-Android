package com.discord.chat.presentation.message;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C9674n;
import kotlin.jvm.internal.C9677q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public /* synthetic */ class MessageAccessoriesAdapter$onBindViewHolder$43 extends C9674n implements Function4<GuildId, ChannelId, ChannelId, MessageId, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageAccessoriesAdapter$onBindViewHolder$43(Object obj) {
        super(4, obj, ChatEventHandler.class, "onTapPostPreviewEmbed", "onTapPostPreviewEmbed-kUTrp-s(JJJLjava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(GuildId guildId, ChannelId channelId, ChannelId channelId2, MessageId messageId) {
        m41756invokekUTrps(guildId.m42111unboximpl(), channelId.m42098unboximpl(), channelId2.m42098unboximpl(), messageId.m42123unboximpl());
        return Unit.f25780a;
    }

    /* renamed from: invoke-kUTrp-s  reason: not valid java name */
    public final void m41756invokekUTrps(long j, long j2, long j3, String p3) {
        C9677q.m14633g(p3, "p3");
        ((ChatEventHandler) this.receiver).mo41722onTapPostPreviewEmbedkUTrps(j, j2, j3, p3);
    }
}
