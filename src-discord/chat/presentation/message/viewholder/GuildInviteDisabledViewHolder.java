package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.codedlinks.GuildInviteDisabledEmbedImpl;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.GuildInviteDisabledMessageAccessory;
import com.discord.chat.presentation.message.view.GuildInviteDisabledView;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/GuildInviteDisabledViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "guildInviteDisabledView", "Lcom/discord/chat/presentation/message/view/GuildInviteDisabledView;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "(Lcom/discord/chat/presentation/message/view/GuildInviteDisabledView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "getEventHandler", "()Lcom/discord/chat/presentation/events/ChatEventHandler;", "bind", "", "inviteAccessory", "Lcom/discord/chat/presentation/message/messagepart/GuildInviteDisabledMessageAccessory;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GuildInviteDisabledViewHolder extends MessagePartViewHolder {
    private final ChatEventHandler eventHandler;
    private final GuildInviteDisabledView guildInviteDisabledView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildInviteDisabledViewHolder(GuildInviteDisabledView guildInviteDisabledView, ChatEventHandler eventHandler) {
        super(guildInviteDisabledView, null);
        q.g(guildInviteDisabledView, "guildInviteDisabledView");
        q.g(eventHandler, "eventHandler");
        this.guildInviteDisabledView = guildInviteDisabledView;
        this.eventHandler = eventHandler;
    }

    public final void bind(GuildInviteDisabledMessageAccessory inviteAccessory) {
        q.g(inviteAccessory, "inviteAccessory");
        GuildInviteDisabledEmbedImpl invite = inviteAccessory.getInvite();
        GuildInviteDisabledView guildInviteDisabledView = this.guildInviteDisabledView;
        guildInviteDisabledView.setHeaderText(invite.getHeaderText());
        guildInviteDisabledView.setHelpIcon(invite.getHelpCenterArticleLabel(), invite.getHelpCenterArticleURL(), new GuildInviteDisabledViewHolder$bind$1$1(this, inviteAccessory));
        guildInviteDisabledView.setHeaderColor(Integer.valueOf(invite.getHeaderColor()));
        guildInviteDisabledView.setTitleText(invite.getTitleText());
        guildInviteDisabledView.setTitleColor(invite.getTitleColor());
        guildInviteDisabledView.setGuildImage(invite.getGuildIcon(), invite.getThumbnailText(), invite.getThumbnailBackgroundColor());
        guildInviteDisabledView.setSubtitle(invite.getSubtitle(), invite.getGuildName());
        guildInviteDisabledView.setSubtitleColor(invite.getSubtitleColor());
    }

    public final ChatEventHandler getEventHandler() {
        return this.eventHandler;
    }
}
