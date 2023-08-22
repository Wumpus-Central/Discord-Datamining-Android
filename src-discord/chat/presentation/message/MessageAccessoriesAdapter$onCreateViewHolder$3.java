package com.discord.chat.presentation.message;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;


@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

public  class MessageAccessoriesAdapter$onCreateViewHolder$3 extends n implements Function1<MessageId, Unit> {
    
    public MessageAccessoriesAdapter$onCreateViewHolder$3(Object obj) {
        super(1, obj, ChatEventHandler.class, "onTapInviteToSpeak", "onTapInviteToSpeak-1xi1bu0(Ljava/lang/String;)V", 0);
    }

    @Override 
    public   Unit invoke(MessageId messageId) {
        m214invoke1xi1bu0(messageId.m615unboximpl());
        return Unit.f21213a;
    }

    
    public final void m214invoke1xi1bu0(String p02) {
        q.h(p02, "p0");
        ((ChatEventHandler) this.receiver).mo166onTapInviteToSpeak1xi1bu0(p02);
    }
}
