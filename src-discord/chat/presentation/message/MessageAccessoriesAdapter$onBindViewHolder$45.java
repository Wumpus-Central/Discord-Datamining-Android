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


@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

public  class MessageAccessoriesAdapter$onBindViewHolder$45 extends n implements Function4<GuildId, ChannelId, ChannelId, MessageId, Unit> {
    
    public MessageAccessoriesAdapter$onBindViewHolder$45(Object obj) {
        super(4, obj, ChatEventHandler.class, "onTapPostPreviewEmbed", "onTapPostPreviewEmbed-kUTrp-s(JJJLjava/lang/String;)V", 0);
    }

    @Override 
    public   Unit invoke(GuildId guildId, ChannelId channelId, ChannelId channelId2, MessageId messageId) {
        m206invokekUTrps(guildId.m588unboximpl(), channelId.m575unboximpl(), channelId2.m575unboximpl(), messageId.m600unboximpl());
        return Unit.f20679a;
    }

    
    public final void m206invokekUTrps(long j10, long j11, long j12, String p32) {
        q.g(p32, "p3");
        ((ChatEventHandler) this.receiver).mo168onTapPostPreviewEmbedkUTrps(j10, j11, j12, p32);
    }
}
