package com.discord.chat.presentation.list.delegate.messagebundling;

import com.discord.chat.presentation.list.item.MessageBundleItem;
import com.discord.chat.presentation.message.MessageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discord/chat/presentation/message/MessageView$ChainPart;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class MessageBundleMessageDelegate$onBindViewHolder$1 extends s implements Function0<MessageView.ChainPart> {
    final  List<MessageBundleItem> $items;
    final  int $position;
    final  MessageBundleMessageDelegate this$0;

    
    
    
    public MessageBundleMessageDelegate$onBindViewHolder$1(MessageBundleMessageDelegate messageBundleMessageDelegate, List<? extends MessageBundleItem> list, int i10) {
        super(0);
        this.this$0 = messageBundleMessageDelegate;
        this.$items = list;
        this.$position = i10;
    }

    
    @Override 
    public final MessageView.ChainPart invoke() {
        MessageView.ChainPart chainPart;
        chainPart = this.this$0.getChainPart(this.$items, this.$position);
        return chainPart;
    }
}
