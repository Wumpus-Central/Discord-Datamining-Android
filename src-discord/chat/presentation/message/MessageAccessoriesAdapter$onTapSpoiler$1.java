package com.discord.chat.presentation.message;

import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "holder", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class MessageAccessoriesAdapter$onTapSpoiler$1 extends s implements Function1<MessagePartViewHolder, Unit> {
    final  MessageAccessoriesAdapter this$0;

    
    
    public MessageAccessoriesAdapter$onTapSpoiler$1(MessageAccessoriesAdapter messageAccessoriesAdapter) {
        super(1);
        this.this$0 = messageAccessoriesAdapter;
    }

    @Override 
    public   Unit invoke(MessagePartViewHolder messagePartViewHolder) {
        invoke2(messagePartViewHolder);
        return Unit.f21444a;
    }

    
    public final void invoke2(MessagePartViewHolder holder) {
        Function0 function0;
        q.h(holder, "holder");
        this.this$0.notifyItemChanged(holder.getBindingAdapterPosition());
        function0 = this.this$0.measureAndLayout;
        function0.invoke();
    }
}
