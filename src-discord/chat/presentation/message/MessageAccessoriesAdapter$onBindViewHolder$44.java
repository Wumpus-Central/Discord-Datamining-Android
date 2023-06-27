package com.discord.chat.presentation.message;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public /* synthetic */ class MessageAccessoriesAdapter$onBindViewHolder$44 extends n implements Function4<GuildId, ChannelId, ChannelId, MessageId, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageAccessoriesAdapter$onBindViewHolder$44(Object obj) {
        super(4, obj, ChatEventHandler.class, "onTapPostPreviewEmbed", "onTapPostPreviewEmbed-kUTrp-s(JJJLjava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(GuildId guildId, ChannelId channelId, ChannelId channelId2, MessageId messageId) {
        m204invokekUTrps(guildId.m584unboximpl(), channelId.m571unboximpl(), channelId2.m571unboximpl(), messageId.m596unboximpl());
        return Unit.f20685a;
    }

    /* renamed from: invoke-kUTrp-s  reason: not valid java name */
    public final void m204invokekUTrps(long j10, long j11, long j12, String p32) {
        q.g(p32, "p3");
        ((ChatEventHandler) this.receiver).mo168onTapPostPreviewEmbedkUTrps(j10, j11, j12, p32);
    }
}
