package com.discord.chat.presentation.message;

import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory;
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import com.discord.chat.reactevents.ViewResizeMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "portal", "", "invoke", "(Ljava/lang/Double;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class MessageAccessoriesAdapter$onBindViewHolder$20 extends s implements Function1<Double, Unit> {
    final  MessagePartViewHolder $holder;
    final  MessageAccessory $part;
    final  MessageAccessoriesAdapter this$0;

    
    
    public MessageAccessoriesAdapter$onBindViewHolder$20(MessageAccessory messageAccessory, MessageAccessoriesAdapter messageAccessoriesAdapter, MessagePartViewHolder messagePartViewHolder) {
        super(1);
        this.$part = messageAccessory;
        this.this$0 = messageAccessoriesAdapter;
        this.$holder = messagePartViewHolder;
    }

    @Override 
    public   Unit invoke(Double d10) {
        invoke2(d10);
        return Unit.f21436a;
    }

    
    public final void invoke2(Double d10) {
        this.this$0.m209onMediaClickedl3ndGo(this.$holder, this.$part.mo232getMessageId3Eiw7ao(), ((VideoAttachmentMessageAccessory) this.$part).getIndex(), "attachment", d10, null, ViewResizeMode.Fill);
    }
}
