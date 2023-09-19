package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class GuildEventInviteViewHolder$bind$1$1$10 extends n implements Function1<MessageId, Unit> {
    
    public GuildEventInviteViewHolder$bind$1$1$10(Object obj) {
        super(1, obj, ChatEventHandler.class, "onTapSeeMore", "onTapSeeMore-1xi1bu0(Ljava/lang/String;)V", 0);
    }

    @Override 
    public   Unit invoke(MessageId messageId) {
        m360invoke1xi1bu0(messageId.m639unboximpl());
        return Unit.f21444a;
    }

    
    public final void m360invoke1xi1bu0(String p02) {
        q.h(p02, "p0");
        ((ChatEventHandler) this.receiver).mo186onTapSeeMore1xi1bu0(p02);
    }
}
