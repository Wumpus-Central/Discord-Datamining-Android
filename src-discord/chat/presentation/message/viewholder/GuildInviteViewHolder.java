package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.GuildInviteMessageAccessory;
import com.discord.chat.presentation.message.view.GuildInviteView;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/GuildInviteViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "guildInviteView", "Lcom/discord/chat/presentation/message/view/GuildInviteView;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "(Lcom/discord/chat/presentation/message/view/GuildInviteView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "getEventHandler", "()Lcom/discord/chat/presentation/events/ChatEventHandler;", "bind", "", "inviteAccessory", "Lcom/discord/chat/presentation/message/messagepart/GuildInviteMessageAccessory;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class GuildInviteViewHolder extends MessagePartViewHolder {
    private final ChatEventHandler eventHandler;
    private final GuildInviteView guildInviteView;

    
    public GuildInviteViewHolder(GuildInviteView guildInviteView, ChatEventHandler eventHandler) {
        super(guildInviteView, null);
        q.h(guildInviteView, "guildInviteView");
        q.h(eventHandler, "eventHandler");
        this.guildInviteView = guildInviteView;
        this.eventHandler = eventHandler;
    }

    
    public static final void bind$lambda$1$lambda$0(GuildInviteViewHolder this$0, GuildInviteMessageAccessory inviteAccessory, View view) {
        q.h(this$0, "this$0");
        q.h(inviteAccessory, "$inviteAccessory");
        this$0.eventHandler.mo165onTapInviteEmbedAFFcxXc(inviteAccessory.mo220getMessageId3Eiw7ao(), inviteAccessory.getCodedLinkIndex(), null, null);
    }

    
    
    
    
    public final void bind(final com.discord.chat.presentation.message.messagepart.GuildInviteMessageAccessory r7) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.viewholder.GuildInviteViewHolder.bind(com.discord.chat.presentation.message.messagepart.GuildInviteMessageAccessory):void");
    }

    public final ChatEventHandler getEventHandler() {
        return this.eventHandler;
    }
}
