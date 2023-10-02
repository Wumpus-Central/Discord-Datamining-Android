package com.discord.chat.presentation.message;

import com.discord.chat.bridge.sticker.Sticker;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.messagepart.StickerMessageAccessory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/discord/chat/bridge/sticker/Sticker;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class MessageAccessoriesAdapter$onBindViewHolder$30 extends s implements Function1<Sticker, Unit> {
    final  MessageAccessory $part;
    final  MessageAccessoriesAdapter this$0;

    
    
    public MessageAccessoriesAdapter$onBindViewHolder$30(MessageAccessoriesAdapter messageAccessoriesAdapter, MessageAccessory messageAccessory) {
        super(1);
        this.this$0 = messageAccessoriesAdapter;
        this.$part = messageAccessory;
    }

    @Override 
    public   Unit invoke(Sticker sticker) {
        invoke2(sticker);
        return Unit.f21601a;
    }

    
    public final void invoke2(Sticker it) {
        ChatEventHandler chatEventHandler;
        q.h(it, "it");
        chatEventHandler = this.this$0.eventHandler;
        if (chatEventHandler == null) {
            q.y("eventHandler");
            chatEventHandler = null;
        }
        chatEventHandler.mo169onStickerLongClickedAyv7vGE(((StickerMessageAccessory) this.$part).getSticker(), this.$part.mo240getMessageId3Eiw7ao());
    }
}
