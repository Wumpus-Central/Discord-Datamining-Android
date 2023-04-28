package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.FlaggedMessageEmbedAccessory;
import com.discord.chat.presentation.message.view.FlaggedMessageEmbedView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m15073d2 = {"Lcom/discord/chat/presentation/message/viewholder/FlaggedMessageEmbedViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "embeddedMessageView", "Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "(Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "bind", "", "messageEmbedAccessory", "Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageEmbedAccessory;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class FlaggedMessageEmbedViewHolder extends MessagePartViewHolder {
    private final FlaggedMessageEmbedView embeddedMessageView;
    private final ChatEventHandler eventHandler;

    public /* synthetic */ FlaggedMessageEmbedViewHolder(FlaggedMessageEmbedView flaggedMessageEmbedView, ChatEventHandler chatEventHandler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(flaggedMessageEmbedView, (i & 2) != 0 ? null : chatEventHandler);
    }

    public final void bind(FlaggedMessageEmbedAccessory messageEmbedAccessory) {
        C9677q.m14633g(messageEmbedAccessory, "messageEmbedAccessory");
        FlaggedMessageEmbedView flaggedMessageEmbedView = this.embeddedMessageView;
        Message message = messageEmbedAccessory.getMessage();
        ChatEventHandler chatEventHandler = this.eventHandler;
        if (chatEventHandler == null) {
            chatEventHandler = ChatEventHandler.Empty.INSTANCE;
        }
        FlaggedMessageEmbedView.setMessage$default(flaggedMessageEmbedView, message, chatEventHandler, false, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlaggedMessageEmbedViewHolder(FlaggedMessageEmbedView embeddedMessageView, ChatEventHandler chatEventHandler) {
        super(embeddedMessageView, null);
        C9677q.m14633g(embeddedMessageView, "embeddedMessageView");
        this.embeddedMessageView = embeddedMessageView;
        this.eventHandler = chatEventHandler;
    }
}
