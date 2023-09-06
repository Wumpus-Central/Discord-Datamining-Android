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

public  class MessageAccessoriesAdapter$onBindViewHolder$46 extends n implements Function4<GuildId, ChannelId, ChannelId, MessageId, Unit> {
    
    public MessageAccessoriesAdapter$onBindViewHolder$46(Object obj) {
        super(4, obj, ChatEventHandler.class, "onTapPostPreviewEmbed", "onTapPostPreviewEmbed-kUTrp-s(JJJLjava/lang/String;)V", 0);
    }

    @Override 
    public   Unit invoke(GuildId guildId, ChannelId channelId, ChannelId channelId2, MessageId messageId) {
        m220invokekUTrps(guildId.m613unboximpl(), channelId.m600unboximpl(), channelId2.m600unboximpl(), messageId.m625unboximpl());
        return Unit.f21436a;
    }

    
    public final void m220invokekUTrps(long j10, long j11, long j12, String p32) {
        q.h(p32, "p3");
        ((ChatEventHandler) this.receiver).mo178onTapPostPreviewEmbedkUTrps(j10, j11, j12, p32);
    }
}
