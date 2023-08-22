package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class EmbeddedActivityInviteViewHolder$bind$1$5 extends n implements Function2<String, String, Unit> {
    
    public EmbeddedActivityInviteViewHolder$bind$1$5(Object obj) {
        super(2, obj, ChatEventHandler.class, "onTapMention", "onTapMention(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override 
    public   Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.f21213a;
    }

    
    public final void invoke2(String p02, String p12) {
        q.h(p02, "p0");
        q.h(p12, "p1");
        ((ChatEventHandler) this.receiver).onTapMention(p02, p12);
    }
}
