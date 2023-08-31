package com.discord.chat.presentation.message;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;


@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

public  class MessageAccessoriesAdapter$onBindViewHolder$19 extends n implements Function1<MessageId, Unit> {
    
    public MessageAccessoriesAdapter$onBindViewHolder$19(Object obj) {
        super(1, obj, ChatEventHandler.class, "onTapRemix", "onTapRemix-1xi1bu0(Ljava/lang/String;)V", 0);
    }

    @Override 
    public   Unit invoke(MessageId messageId) {
        m212invoke1xi1bu0(messageId.m625unboximpl());
        return Unit.f21215a;
    }

    
    public final void m212invoke1xi1bu0(String p02) {
        q.h(p02, "p0");
        ((ChatEventHandler) this.receiver).mo181onTapRemix1xi1bu0(p02);
    }
}
