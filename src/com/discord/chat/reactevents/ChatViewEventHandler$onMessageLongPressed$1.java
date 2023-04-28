package com.discord.chat.reactevents;

import com.discord.chat.bridge.MediaType;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\n¢\u0006\u0004\b\n\u0010\u000b"}, m15073d2 = {"<anonymous>", "", "messageId", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "mediaIndex", "", "mediaType", "Lcom/discord/chat/bridge/MediaType;", "invoke-8a0ehIg", "(Ljava/lang/String;JLjava/lang/Integer;Lcom/discord/chat/bridge/MediaType;)V"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class ChatViewEventHandler$onMessageLongPressed$1 extends AbstractC9679s implements Function4<MessageId, ChannelId, Integer, MediaType, Unit> {
    final /* synthetic */ ChatViewEventHandler this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewEventHandler$onMessageLongPressed$1(ChatViewEventHandler chatViewEventHandler) {
        super(4);
        this.this$0 = chatViewEventHandler;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(MessageId messageId, ChannelId channelId, Integer num, MediaType mediaType) {
        m41891invoke8a0ehIg(messageId.m42123unboximpl(), channelId.m42098unboximpl(), num, mediaType);
        return Unit.f25780a;
    }

    /* renamed from: invoke-8a0ehIg  reason: not valid java name */
    public final void m41891invoke8a0ehIg(String messageId, long j, Integer num, MediaType mediaType) {
        Function1 function1;
        int i;
        String str;
        C9677q.m14633g(messageId, "messageId");
        function1 = this.this$0.emitReactEvent;
        String str2 = MessageId.m42121toStringimpl(messageId);
        String str3 = ChannelId.m42096toStringimpl(j);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        if (mediaType == null || (str = mediaType.getType()) == null) {
            str = "";
        }
        function1.invoke(new LongPressMessageEvent(str2, str3, i, str));
    }
}
