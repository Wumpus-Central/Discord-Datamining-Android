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
/* loaded from: classes4.dex */
public /* synthetic */ class MessageAccessoriesAdapter$onBindViewHolder$43 extends n implements Function4<GuildId, ChannelId, ChannelId, MessageId, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageAccessoriesAdapter$onBindViewHolder$43(Object obj) {
        super(4, obj, ChatEventHandler.class, "onTapPostPreviewEmbed", "onTapPostPreviewEmbed-kUTrp-s(JJJLjava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(GuildId guildId, ChannelId channelId, ChannelId channelId2, MessageId messageId) {
        m193invokekUTrps(guildId.m554unboximpl(), channelId.m541unboximpl(), channelId2.m541unboximpl(), messageId.m566unboximpl());
        return Unit.f22034a;
    }

    /* renamed from: invoke-kUTrp-s  reason: not valid java name */
    public final void m193invokekUTrps(long j10, long j11, long j12, String p32) {
        q.g(p32, "p3");
        ((ChatEventHandler) this.receiver).mo159onTapPostPreviewEmbedkUTrps(j10, j11, j12, p32);
    }
}
