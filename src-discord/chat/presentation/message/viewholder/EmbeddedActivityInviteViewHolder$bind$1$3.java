package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class EmbeddedActivityInviteViewHolder$bind$1$3 extends n implements Function3<String, String, String, Unit> {
    
    public EmbeddedActivityInviteViewHolder$bind$1$3(Object obj) {
        super(3, obj, ChatEventHandler.class, "onTapChannel", "onTapChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override 
    public   Unit invoke(String str, String str2, String str3) {
        invoke2(str, str2, str3);
        return Unit.f21210a;
    }

    
    public final void invoke2(String p02, String str, String str2) {
        q.h(p02, "p0");
        ((ChatEventHandler) this.receiver).onTapChannel(p02, str, str2);
    }
}
