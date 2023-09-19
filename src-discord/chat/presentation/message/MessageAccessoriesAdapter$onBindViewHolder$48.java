package com.discord.chat.presentation.message;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;


@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

public  class MessageAccessoriesAdapter$onBindViewHolder$48 extends n implements Function3<MessageId, ChannelId, String, Unit> {
    
    public MessageAccessoriesAdapter$onBindViewHolder$48(Object obj) {
        super(3, obj, ChatEventHandler.class, "onTapChannelPromptButton", "onTapChannelPromptButton-Eqy5D80(Ljava/lang/String;JLjava/lang/String;)V", 0);
    }

    @Override 
    public   Unit invoke(MessageId messageId, ChannelId channelId, String str) {
        m225invokeEqy5D80(messageId.m639unboximpl(), channelId.m614unboximpl(), str);
        return Unit.f21444a;
    }

    
    public final void m225invokeEqy5D80(String p02, long j10, String p22) {
        q.h(p02, "p0");
        q.h(p22, "p2");
        ((ChatEventHandler) this.receiver).mo173onTapChannelPromptButtonEqy5D80(p02, j10, p22);
    }
}
