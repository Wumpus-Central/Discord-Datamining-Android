package com.discord.chat.bridge.codedlinks;

import com.discord.chat.bridge.structurabletext.StructurableText;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0005¨\u0006\u0019"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbed;", "", "acceptLabelIcon", "", "getAcceptLabelIcon", "()Ljava/lang/String;", "badgeCount", "getBadgeCount", "badgeIcon", "getBadgeIcon", "content", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getContent", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "creatorAvatar", "getCreatorAvatar", "headerTextColor", "", "getHeaderTextColor", "()Ljava/lang/Integer;", "isRsvped", "", "()Ljava/lang/Boolean;", "secondaryActionIcon", "getSecondaryActionIcon", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface GuildEventInviteEmbed {
    String getAcceptLabelIcon();

    String getBadgeCount();

    String getBadgeIcon();

    StructurableText getContent();

    String getCreatorAvatar();

    Integer getHeaderTextColor();

    String getSecondaryActionIcon();

    Boolean isRsvped();
}
