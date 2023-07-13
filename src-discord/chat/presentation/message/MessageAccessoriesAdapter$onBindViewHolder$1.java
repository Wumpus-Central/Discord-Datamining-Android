package com.discord.chat.presentation.message;

import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class MessageAccessoriesAdapter$onBindViewHolder$1 extends s implements Function0<Unit> {
    final  MessagePartViewHolder $holder;
    final  MessageAccessoriesAdapter this$0;

    
    
    public MessageAccessoriesAdapter$onBindViewHolder$1(MessageAccessoriesAdapter messageAccessoriesAdapter, MessagePartViewHolder messagePartViewHolder) {
        super(0);
        this.this$0 = messageAccessoriesAdapter;
        this.$holder = messagePartViewHolder;
    }

    @Override 
    
    public final void invoke2() {
        Function1 function1;
        function1 = this.this$0.onTapSpoiler;
        function1.invoke(this.$holder);
    }
}
