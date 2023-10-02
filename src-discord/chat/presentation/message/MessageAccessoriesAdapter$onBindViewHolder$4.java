package com.discord.chat.presentation.message;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.InfoLinkMessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class MessageAccessoriesAdapter$onBindViewHolder$4 extends s implements Function0<Unit> {
    final  MessageAccessory $part;
    final  MessageAccessoriesAdapter this$0;

    
    
    public MessageAccessoriesAdapter$onBindViewHolder$4(MessageAccessoriesAdapter messageAccessoriesAdapter, MessageAccessory messageAccessory) {
        super(0);
        this.this$0 = messageAccessoriesAdapter;
        this.$part = messageAccessory;
    }

    @Override 
    
    public final void invoke2() {
        ChatEventHandler chatEventHandler;
        chatEventHandler = this.this$0.eventHandler;
        if (chatEventHandler == null) {
            q.y("eventHandler");
            chatEventHandler = null;
        }
        chatEventHandler.mo185onTapObscuredMediaLearnMore8a0ehIg(this.$part.mo240getMessageId3Eiw7ao(), ((InfoLinkMessageAccessory) this.$part).m292getChannelIdo4g7jtM(), ((InfoLinkMessageAccessory) this.$part).getAttachmentId(), ((InfoLinkMessageAccessory) this.$part).getEmbedId());
    }
}
