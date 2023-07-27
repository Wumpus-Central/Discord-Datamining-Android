package com.discord.chat.reactevents;

import com.discord.chat.bridge.MediaType;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"<anonymous>", "", "messageId", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "mediaIndex", "", "mediaType", "Lcom/discord/chat/bridge/MediaType;", "invoke-8a0ehIg", "(Ljava/lang/String;JLjava/lang/Integer;Lcom/discord/chat/bridge/MediaType;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class ChatViewEventHandler$onMessageLongPressed$1 extends s implements Function4<MessageId, ChannelId, Integer, MediaType, Unit> {
    final  ChatViewEventHandler this$0;

    
    
    public ChatViewEventHandler$onMessageLongPressed$1(ChatViewEventHandler chatViewEventHandler) {
        super(4);
        this.this$0 = chatViewEventHandler;
    }

    @Override 
    public   Unit invoke(MessageId messageId, ChannelId channelId, Integer num, MediaType mediaType) {
        m343invoke8a0ehIg(messageId.m599unboximpl(), channelId.m574unboximpl(), num, mediaType);
        return Unit.f20666a;
    }

    
    public final void m343invoke8a0ehIg(String messageId, long j10, Integer num, MediaType mediaType) {
        Function1 function1;
        int i10;
        String str;
        q.g(messageId, "messageId");
        function1 = this.this$0.emitReactEvent;
        String str2 = MessageId.m597toStringimpl(messageId);
        String str3 = ChannelId.m572toStringimpl(j10);
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        if (mediaType == null || (str = mediaType.getType()) == null) {
            str = "";
        }
        function1.invoke(new LongPressMessageEvent(str2, str3, i10, str));
    }
}
