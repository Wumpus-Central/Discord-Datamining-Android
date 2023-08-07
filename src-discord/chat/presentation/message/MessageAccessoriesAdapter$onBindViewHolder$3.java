package com.discord.chat.presentation.message;

import com.discord.chat.presentation.message.messagepart.EmbedMessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import com.discord.chat.reactevents.ViewResizeMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "portal", "", "index", "", "invoke", "(Ljava/lang/Double;Ljava/lang/Integer;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class MessageAccessoriesAdapter$onBindViewHolder$3 extends s implements Function2<Double, Integer, Unit> {
    final  MessagePartViewHolder $holder;
    final  MessageAccessory $part;
    final  MessageAccessoriesAdapter this$0;

    
    
    public MessageAccessoriesAdapter$onBindViewHolder$3(MessageAccessoriesAdapter messageAccessoriesAdapter, MessagePartViewHolder messagePartViewHolder, MessageAccessory messageAccessory) {
        super(2);
        this.this$0 = messageAccessoriesAdapter;
        this.$holder = messagePartViewHolder;
        this.$part = messageAccessory;
    }

    @Override 
    public   Unit invoke(Double d10, Integer num) {
        invoke2(d10, num);
        return Unit.f21025a;
    }

    
    public final void invoke2(Double d10, Integer num) {
        this.this$0.m197onMediaClickedl3ndGo(this.$holder, this.$part.mo218getMessageId3Eiw7ao(), ((EmbedMessageAccessory) this.$part).getIndex(), "embed", d10, num, ViewResizeMode.Fill);
    }
}
