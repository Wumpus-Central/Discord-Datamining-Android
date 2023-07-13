package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class GuildEventInviteViewHolder$bind$1$1$4 extends n implements Function4<String, String, String, String, Unit> {
    
    public GuildEventInviteViewHolder$bind$1$1$4(Object obj) {
        super(4, obj, ChatEventHandler.class, "onLongPressChannel", "onLongPressChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override 
    public   Unit invoke(String str, String str2, String str3, String str4) {
        invoke2(str, str2, str3, str4);
        return Unit.f20663a;
    }

    
    public final void invoke2(String p02, String str, String str2, String str3) {
        q.g(p02, "p0");
        ((ChatEventHandler) this.receiver).onLongPressChannel(p02, str, str2, str3);
    }
}
