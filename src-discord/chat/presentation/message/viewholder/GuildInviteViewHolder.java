package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.GuildInviteMessageAccessory;
import com.discord.chat.presentation.message.view.GuildInviteView;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/GuildInviteViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "guildInviteView", "Lcom/discord/chat/presentation/message/view/GuildInviteView;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "(Lcom/discord/chat/presentation/message/view/GuildInviteView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "getEventHandler", "()Lcom/discord/chat/presentation/events/ChatEventHandler;", "bind", "", "inviteAccessory", "Lcom/discord/chat/presentation/message/messagepart/GuildInviteMessageAccessory;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GuildInviteViewHolder extends MessagePartViewHolder {
    private final ChatEventHandler eventHandler;
    private final GuildInviteView guildInviteView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildInviteViewHolder(GuildInviteView guildInviteView, ChatEventHandler eventHandler) {
        super(guildInviteView, null);
        q.g(guildInviteView, "guildInviteView");
        q.g(eventHandler, "eventHandler");
        this.guildInviteView = guildInviteView;
        this.eventHandler = eventHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1$lambda$0(GuildInviteViewHolder this$0, GuildInviteMessageAccessory inviteAccessory, View view) {
        q.g(this$0, "this$0");
        q.g(inviteAccessory, "$inviteAccessory");
        this$0.eventHandler.mo157onTapInviteEmbedAFFcxXc(inviteAccessory.mo204getMessageId3Eiw7ao(), inviteAccessory.getCodedLinkIndex(), null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r2 != false) goto L_0x0030;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bind(final com.discord.chat.presentation.message.messagepart.GuildInviteMessageAccessory r7) {
        /*
            r6 = this;
            java.lang.String r0 = "inviteAccessory"
            kotlin.jvm.internal.q.g(r7, r0)
            com.discord.chat.bridge.codedlinks.GuildInviteEmbedImpl r0 = r7.getInvite()
            com.discord.chat.presentation.message.view.GuildInviteView r1 = r6.guildInviteView
            java.lang.String r2 = r0.getSubtitle()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x001c
            boolean r2 = oj.l.w(r2)
            if (r2 == 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r2 = r3
            goto L_0x001d
        L_0x001c:
            r2 = r4
        L_0x001d:
            if (r2 != 0) goto L_0x0024
            java.lang.String r2 = r0.getSubtitle()
            goto L_0x0039
        L_0x0024:
            java.lang.String r2 = r0.getChannelIcon()
            if (r2 == 0) goto L_0x0030
            boolean r2 = oj.l.w(r2)
            if (r2 == 0) goto L_0x0031
        L_0x0030:
            r3 = r4
        L_0x0031:
            if (r3 != 0) goto L_0x0038
            java.lang.String r2 = r0.getChannelName()
            goto L_0x0039
        L_0x0038:
            r2 = 0
        L_0x0039:
            java.lang.String r3 = r0.getInviteSplash()
            r1.setInviteSplash(r3)
            java.lang.String r3 = r0.getHeaderText()
            r1.setHeaderText(r3)
            int r3 = r0.getHeaderColor()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.setHeaderColor(r3)
            java.lang.String r3 = r0.getTitleText()
            r1.setTitleText(r3)
            java.lang.Integer r3 = r0.getTitleColor()
            r1.setTitleColor(r3)
            java.lang.String r3 = r0.getOnlineText()
            java.lang.String r4 = r0.getMemberText()
            r1.setPresence(r3, r4)
            java.lang.String r3 = r0.getThumbnailUrl()
            java.lang.String r4 = r0.getThumbnailText()
            java.lang.Integer r5 = r0.getThumbnailBackgroundColor()
            r1.setGuildImage(r3, r4, r5)
            r1.setSubtitle(r2)
            java.lang.Integer r2 = r0.getSubtitleColor()
            r1.setSubtitleColor(r2)
            java.lang.String r2 = r0.getChannelIcon()
            r1.setSubtitleIcon(r2)
            com.discord.chat.presentation.message.viewholder.j r2 = new com.discord.chat.presentation.message.viewholder.j
            r2.<init>()
            r1.setOnButtonClickListener(r2)
            java.lang.String r7 = r0.getAcceptLabelText()
            r1.setButtonText(r7)
            java.lang.Integer r7 = r0.getAcceptLabelColor()
            r1.setButtonTextColor(r7)
            java.lang.Integer r7 = r0.getAcceptLabelBackgroundColor()
            r1.setButtonBackgroundColor(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.viewholder.GuildInviteViewHolder.bind(com.discord.chat.presentation.message.messagepart.GuildInviteMessageAccessory):void");
    }

    public final ChatEventHandler getEventHandler() {
        return this.eventHandler;
    }
}
