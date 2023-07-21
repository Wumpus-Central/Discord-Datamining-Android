package com.discord.chat.reactevents;

import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "messageId", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "invoke-pfaIj0E", "(Ljava/lang/String;J)V"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class ChatViewEventHandler$onMessageTapped$1 extends s implements Function2<MessageId, ChannelId, Unit> {
    final  ChatViewEventHandler this$0;

    
    
    public ChatViewEventHandler$onMessageTapped$1(ChatViewEventHandler chatViewEventHandler) {
        super(2);
        this.this$0 = chatViewEventHandler;
    }

    @Override 
    public   Unit invoke(MessageId messageId, ChannelId channelId) {
        m343invokepfaIj0E(messageId.m598unboximpl(), channelId.m573unboximpl());
        return Unit.f20664a;
    }

    
    public final void m343invokepfaIj0E(String messageId, long j10) {
        Function1 function1;
        q.g(messageId, "messageId");
        function1 = this.this$0.emitReactEvent;
        function1.invoke(new TapMessageData(MessageId.m596toStringimpl(messageId), ChannelId.m571toStringimpl(j10)));
    }
}
