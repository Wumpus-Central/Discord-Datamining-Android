package com.discord.chat.presentation.message;

import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class MessageView$setMessage$4 extends s implements Function0<Unit> {
    final  ChatEventHandler $eventHandler;
    final  Message $message;

    
    
    public MessageView$setMessage$4(ChatEventHandler chatEventHandler, Message message) {
        super(0);
        this.$eventHandler = chatEventHandler;
        this.$message = message;
    }

    @Override 
    
    public final void invoke2() {
        this.$eventHandler.mo180onTapMessageReply0eiqbug(this.$message.m22getChannelIdo4g7jtM(), this.$message.m24getId3Eiw7ao());
    }
}
