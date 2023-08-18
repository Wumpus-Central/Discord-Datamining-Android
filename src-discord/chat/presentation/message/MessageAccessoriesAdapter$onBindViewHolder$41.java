package com.discord.chat.presentation.message;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;


@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

public  class MessageAccessoriesAdapter$onBindViewHolder$41 extends n implements Function2<MessageId, ChannelId, Unit> {
    
    public MessageAccessoriesAdapter$onBindViewHolder$41(Object obj) {
        super(2, obj, ChatEventHandler.class, "onTapAutoModerationActions", "onTapAutoModerationActions-pfaIj0E(Ljava/lang/String;J)V", 0);
    }

    @Override 
    public   Unit invoke(MessageId messageId, ChannelId channelId) {
        m206invokepfaIj0E(messageId.m615unboximpl(), channelId.m590unboximpl());
        return Unit.f21210a;
    }

    
    public final void m206invokepfaIj0E(String p02, long j10) {
        q.h(p02, "p0");
        ((ChatEventHandler) this.receiver).mo157onTapAutoModerationActionspfaIj0E(p02, j10);
    }
}
