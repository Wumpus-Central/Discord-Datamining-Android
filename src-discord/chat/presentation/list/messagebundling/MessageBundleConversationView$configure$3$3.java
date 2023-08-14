package com.discord.chat.presentation.list.messagebundling;

import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.reactions.ReactionView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/discord/reactions/ReactionView$Reaction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class MessageBundleConversationView$configure$3$3 extends s implements Function1<ReactionView.Reaction, Unit> {
    final  ChatEventHandler $eventHandler;
    final  Message $message;

    
    
    public MessageBundleConversationView$configure$3$3(ChatEventHandler chatEventHandler, Message message) {
        super(1);
        this.$eventHandler = chatEventHandler;
        this.$message = message;
    }

    @Override 
    public   Unit invoke(ReactionView.Reaction reaction) {
        invoke2(reaction);
        return Unit.f21036a;
    }

    
    public final void invoke2(ReactionView.Reaction it) {
        q.h(it, "it");
        ChatEventHandler.DefaultImpls.m188onTapReactionu7_MRrM$default(this.$eventHandler, this.$message.m17getId3Eiw7ao(), it, null, 4, null);
    }
}
