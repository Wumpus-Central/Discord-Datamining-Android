package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;


@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

public  class EmbeddedActivityInviteViewHolder$bind$1$10 extends n implements Function1<MessageId, Unit> {
    
    public EmbeddedActivityInviteViewHolder$bind$1$10(Object obj) {
        super(1, obj, ChatEventHandler.class, "onTapSeeMore", "onTapSeeMore-1xi1bu0(Ljava/lang/String;)V", 0);
    }

    @Override 
    public   Unit invoke(MessageId messageId) {
        m336invoke1xi1bu0(messageId.m601unboximpl());
        return Unit.f21025a;
    }

    
    public final void m336invoke1xi1bu0(String p02) {
        q.h(p02, "p0");
        ((ChatEventHandler) this.receiver).mo172onTapSeeMore1xi1bu0(p02);
    }
}
