package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class VideoAttachmentViewHolder$bind$1 extends n implements Function1<String, Unit> {
    
    public VideoAttachmentViewHolder$bind$1(Object obj) {
        super(1, obj, ChatEventHandler.class, "onTapShowAltText", "onTapShowAltText(Ljava/lang/String;)V", 0);
    }

    @Override 
    public   Unit invoke(String str) {
        invoke2(str);
        return Unit.f21601a;
    }

    
    public final void invoke2(String p02) {
        q.h(p02, "p0");
        ((ChatEventHandler) this.receiver).onTapShowAltText(p02);
    }
}
