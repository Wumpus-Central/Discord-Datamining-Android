package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.bridge.codedlinks.GuildEventInviteEmbedImpl;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.GuildEventInviteMessageAccessory;
import com.discord.chat.presentation.message.view.GuildEventInviteView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m15073d2 = {"Lcom/discord/chat/presentation/message/viewholder/GuildEventInviteViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/messagepart/GuildEventInviteMessageAccessory;", "inviteAccessory", "", "bind", "Lcom/discord/chat/presentation/message/view/GuildEventInviteView;", "guildEventInviteView", "Lcom/discord/chat/presentation/message/view/GuildEventInviteView;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lkotlin/Function1;", "onTapSpoiler", "Lkotlin/jvm/functions/Function1;", "<init>", "(Lcom/discord/chat/presentation/message/view/GuildEventInviteView;Lcom/discord/chat/presentation/events/ChatEventHandler;Lkotlin/jvm/functions/Function1;)V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class GuildEventInviteViewHolder extends MessagePartViewHolder {
    private final ChatEventHandler eventHandler;
    private final GuildEventInviteView guildEventInviteView;
    private final Function1<MessagePartViewHolder, Unit> onTapSpoiler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GuildEventInviteViewHolder(GuildEventInviteView guildEventInviteView, ChatEventHandler eventHandler, Function1<? super MessagePartViewHolder, Unit> onTapSpoiler) {
        super(guildEventInviteView, null);
        C9971q.m14633g(guildEventInviteView, "guildEventInviteView");
        C9971q.m14633g(eventHandler, "eventHandler");
        C9971q.m14633g(onTapSpoiler, "onTapSpoiler");
        this.guildEventInviteView = guildEventInviteView;
        this.eventHandler = eventHandler;
        this.onTapSpoiler = onTapSpoiler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3$lambda$2$lambda$0(GuildEventInviteViewHolder this$0, GuildEventInviteMessageAccessory inviteAccessory, View view) {
        C9971q.m14633g(this$0, "this$0");
        C9971q.m14633g(inviteAccessory, "$inviteAccessory");
        this$0.eventHandler.mo41718onTapInviteEmbedAFFcxXc(inviteAccessory.mo41765getMessageId3Eiw7ao(), inviteAccessory.getCodedLinkIndex(), Boolean.TRUE, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3$lambda$2$lambda$1(GuildEventInviteViewHolder this$0, GuildEventInviteMessageAccessory inviteAccessory, View view) {
        C9971q.m14633g(this$0, "this$0");
        C9971q.m14633g(inviteAccessory, "$inviteAccessory");
        this$0.eventHandler.mo41718onTapInviteEmbedAFFcxXc(inviteAccessory.mo41765getMessageId3Eiw7ao(), inviteAccessory.getCodedLinkIndex(), Boolean.FALSE, Boolean.TRUE);
    }

    public final void bind(final GuildEventInviteMessageAccessory inviteAccessory) {
        C9971q.m14633g(inviteAccessory, "inviteAccessory");
        GuildEventInviteEmbedImpl invite = inviteAccessory.getInvite();
        GuildEventInviteView guildEventInviteView = this.guildEventInviteView;
        guildEventInviteView.setHeader(invite.getHeaderIcon(), invite.getHeaderText(), invite.getHeaderColor());
        guildEventInviteView.setCreatorAvatar(invite.getCreatorAvatar());
        guildEventInviteView.setBadge(invite.getBadgeIcon(), invite.getBadgeCount());
        guildEventInviteView.setTitle(invite.getTitleText(), invite.getTitleColor());
        guildEventInviteView.m41860setDescriptionKZKlOo(invite.getContent(), inviteAccessory.mo41765getMessageId3Eiw7ao(), inviteAccessory.getShouldAnimateEmoji(), inviteAccessory.getShouldShowRoleDot(), inviteAccessory.getShouldShowRoleOnName(), new GuildEventInviteViewHolder$bind$1$1$1(this.eventHandler), new GuildEventInviteViewHolder$bind$1$1$2(this.eventHandler), new GuildEventInviteViewHolder$bind$1$1$3(this.eventHandler), new GuildEventInviteViewHolder$bind$1$1$4(this.eventHandler), new GuildEventInviteViewHolder$bind$1$1$5(this.eventHandler), new GuildEventInviteViewHolder$bind$1$1$6(this.eventHandler), new GuildEventInviteViewHolder$bind$1$1$7(this.eventHandler), new GuildEventInviteViewHolder$bind$1$1$11(this), new GuildEventInviteViewHolder$bind$1$1$8(this.eventHandler), new GuildEventInviteViewHolder$bind$1$1$9(this.eventHandler), new GuildEventInviteViewHolder$bind$1$1$10(this.eventHandler));
        guildEventInviteView.setGuild(invite.getGuildName(), invite.getGuildIcon());
        guildEventInviteView.setChannel(invite.getChannelIcon(), invite.getChannelName());
        guildEventInviteView.setAcceptButton(invite.getAcceptLabelIcon(), invite.getAcceptLabelText(), invite.getAcceptLabelColor(), invite.getAcceptLabelBorderColor(), invite.getAcceptLabelBackgroundColor(), new View.OnClickListener() { // from class: com.discord.chat.presentation.message.viewholder.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuildEventInviteViewHolder.bind$lambda$3$lambda$2$lambda$0(GuildEventInviteViewHolder.this, inviteAccessory, view);
            }
        });
        guildEventInviteView.setSecondaryButton(invite.getSecondaryActionIcon(), new View.OnClickListener() { // from class: com.discord.chat.presentation.message.viewholder.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuildEventInviteViewHolder.bind$lambda$3$lambda$2$lambda$1(GuildEventInviteViewHolder.this, inviteAccessory, view);
            }
        });
    }
}
