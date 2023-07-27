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
        m208invokeAyv7vGE(sticker, messageId.m599unboximpl());
        return Unit.f20666a;
    }

    
    public final void m208invokeAyv7vGE(Sticker p02, String p12) {
        q.g(p02, "p0");
        q.g(p12, "p1");
        ((ChatEventHandler) this.receiver).mo180onWelcomeReplyClickedAyv7vGE(p02, p12);
    }
}
