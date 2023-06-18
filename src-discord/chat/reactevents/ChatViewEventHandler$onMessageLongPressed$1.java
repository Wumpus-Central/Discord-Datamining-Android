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

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"<anonymous>", "", "messageId", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "mediaIndex", "", "mediaType", "Lcom/discord/chat/bridge/MediaType;", "invoke-8a0ehIg", "(Ljava/lang/String;JLjava/lang/Integer;Lcom/discord/chat/bridge/MediaType;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ChatViewEventHandler$onMessageLongPressed$1 extends s implements Function4<MessageId, ChannelId, Integer, MediaType, Unit> {
    final /* synthetic */ ChatViewEventHandler this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewEventHandler$onMessageLongPressed$1(ChatViewEventHandler chatViewEventHandler) {
        super(4);
        this.this$0 = chatViewEventHandler;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(MessageId messageId, ChannelId channelId, Integer num, MediaType mediaType) {
        m332invoke8a0ehIg(messageId.m588unboximpl(), channelId.m563unboximpl(), num, mediaType);
        return Unit.f22111a;
    }

    /* renamed from: invoke-8a0ehIg  reason: not valid java name */
    public final void m332invoke8a0ehIg(String messageId, long j10, Integer num, MediaType mediaType) {
        Function1 function1;
        int i10;
        String str;
        q.g(messageId, "messageId");
        function1 = this.this$0.emitReactEvent;
        String str2 = MessageId.m586toStringimpl(messageId);
        String str3 = ChannelId.m561toStringimpl(j10);
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
