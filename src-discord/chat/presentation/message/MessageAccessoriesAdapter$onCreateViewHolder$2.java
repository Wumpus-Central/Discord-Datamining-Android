package com.discord.chat.presentation.message;

import com.discord.chat.bridge.sticker.Sticker;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;


@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

public  class MessageAccessoriesAdapter$onCreateViewHolder$2 extends n implements Function2<Sticker, MessageId, Unit> {
    
    public MessageAccessoriesAdapter$onCreateViewHolder$2(Object obj) {
        super(2, obj, ChatEventHandler.class, "onWelcomeReplyClicked", "onWelcomeReplyClicked-Ayv7vGE(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V", 0);
    }

    @Override 
    public   Unit invoke(Sticker sticker, MessageId messageId) {
        m223invokeAyv7vGE(sticker, messageId.m625unboximpl());
        return Unit.f21215a;
    }

    
    public final void m223invokeAyv7vGE(Sticker p02, String p12) {
        q.h(p02, "p0");
        q.h(p12, "p1");
        ((ChatEventHandler) this.receiver).mo191onWelcomeReplyClickedAyv7vGE(p02, p12);
    }
}
