package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;


@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

public  class EmbedViewHolder$bind$1 extends n implements Function3<MessageId, String, String, Unit> {
    
    public EmbedViewHolder$bind$1(Object obj) {
        super(3, obj, ChatEventHandler.class, "onLinkClicked", "onLinkClicked-u7_MRrM(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override 
    public   Unit invoke(MessageId messageId, String str, String str2) {
        m358invokeu7_MRrM(messageId.m644unboximpl(), str, str2);
        return Unit.f21600a;
    }

    
    public final void m358invokeu7_MRrM(String p02, String p12, String str) {
        q.h(p02, "p0");
        q.h(p12, "p1");
        ((ChatEventHandler) this.receiver).mo160onLinkClickedu7_MRrM(p02, p12, str);
    }
}
