package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.codedlinks.GuildEventInviteEmbedImpl;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\tø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\u0018\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0012J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003JR\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/GuildEventInviteMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "codedLinkIndex", "", "invite", "Lcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl;", "shouldAnimateEmoji", "", "shouldShowRoleDot", "shouldShowRoleOnName", "(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl;ZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCodedLinkIndex", "()I", "getInvite", "()Lcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl;", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getShouldAnimateEmoji", "()Z", "getShouldShowRoleDot", "getShouldShowRoleOnName", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "component5", "component6", "copy", "copy-LdU2QRA", "(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl;ZZZ)Lcom/discord/chat/presentation/message/messagepart/GuildEventInviteMessageAccessory;", "equals", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class GuildEventInviteMessageAccessory extends MessageAccessory {
    private final int codedLinkIndex;
    private final GuildEventInviteEmbedImpl invite;
    private final String messageId;
    private final boolean shouldAnimateEmoji;
    private final boolean shouldShowRoleDot;
    private final boolean shouldShowRoleOnName;

    private GuildEventInviteMessageAccessory(String str, int i10, GuildEventInviteEmbedImpl guildEventInviteEmbedImpl, boolean z10, boolean z11, boolean z12) {
        super(str, "guild scheduled event invite " + i10, null);
        this.messageId = str;
        this.codedLinkIndex = i10;
        this.invite = guildEventInviteEmbedImpl;
        this.shouldAnimateEmoji = z10;
        this.shouldShowRoleDot = z11;
        this.shouldShowRoleOnName = z12;
    }

    public  GuildEventInviteMessageAccessory(String str, int i10, GuildEventInviteEmbedImpl guildEventInviteEmbedImpl, boolean z10, boolean z11, boolean z12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, guildEventInviteEmbedImpl, z10, z11, z12);
    }

    
    public static  GuildEventInviteMessageAccessory m272copyLdU2QRA$default(GuildEventInviteMessageAccessory guildEventInviteMessageAccessory, String str, int i10, GuildEventInviteEmbedImpl guildEventInviteEmbedImpl, boolean z10, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = guildEventInviteMessageAccessory.mo236getMessageId3Eiw7ao();
        }
        if ((i11 & 2) != 0) {
            i10 = guildEventInviteMessageAccessory.codedLinkIndex;
        }
        if ((i11 & 4) != 0) {
            guildEventInviteEmbedImpl = guildEventInviteMessageAccessory.invite;
        }
        if ((i11 & 8) != 0) {
            z10 = guildEventInviteMessageAccessory.shouldAnimateEmoji;
        }
        if ((i11 & 16) != 0) {
            z11 = guildEventInviteMessageAccessory.shouldShowRoleDot;
        }
        if ((i11 & 32) != 0) {
            z12 = guildEventInviteMessageAccessory.shouldShowRoleOnName;
        }
        return guildEventInviteMessageAccessory.m274copyLdU2QRA(str, i10, guildEventInviteEmbedImpl, z10, z11, z12);
    }

    
    public final String m273component13Eiw7ao() {
        return mo236getMessageId3Eiw7ao();
    }

    public final int component2() {
        return this.codedLinkIndex;
    }

    public final GuildEventInviteEmbedImpl component3() {
        return this.invite;
    }

    public final boolean component4() {
        return this.shouldAnimateEmoji;
    }

    public final boolean component5() {
        return this.shouldShowRoleDot;
    }

    public final boolean component6() {
        return this.shouldShowRoleOnName;
    }

    
    public final GuildEventInviteMessageAccessory m274copyLdU2QRA(String messageId, int i10, GuildEventInviteEmbedImpl invite, boolean z10, boolean z11, boolean z12) {
        q.h(messageId, "messageId");
        q.h(invite, "invite");
        return new GuildEventInviteMessageAccessory(messageId, i10, invite, z10, z11, z12, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuildEventInviteMessageAccessory)) {
            return false;
        }
        GuildEventInviteMessageAccessory guildEventInviteMessageAccessory = (GuildEventInviteMessageAccessory) obj;
        return MessageId.m635equalsimpl0(mo236getMessageId3Eiw7ao(), guildEventInviteMessageAccessory.mo236getMessageId3Eiw7ao()) && this.codedLinkIndex == guildEventInviteMessageAccessory.codedLinkIndex && q.c(this.invite, guildEventInviteMessageAccessory.invite) && this.shouldAnimateEmoji == guildEventInviteMessageAccessory.shouldAnimateEmoji && this.shouldShowRoleDot == guildEventInviteMessageAccessory.shouldShowRoleDot && this.shouldShowRoleOnName == guildEventInviteMessageAccessory.shouldShowRoleOnName;
    }

    public final int getCodedLinkIndex() {
        return this.codedLinkIndex;
    }

    public final GuildEventInviteEmbedImpl getInvite() {
        return this.invite;
    }

    @Override 
    
    public String mo236getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final boolean getShouldAnimateEmoji() {
        return this.shouldAnimateEmoji;
    }

    public final boolean getShouldShowRoleDot() {
        return this.shouldShowRoleDot;
    }

    public final boolean getShouldShowRoleOnName() {
        return this.shouldShowRoleOnName;
    }

    public int hashCode() {
        int i10 = ((((MessageId.m636hashCodeimpl(mo236getMessageId3Eiw7ao()) * 31) + this.codedLinkIndex) * 31) + this.invite.hashCode()) * 31;
        boolean z10 = this.shouldAnimateEmoji;
        int i11 = 1;
        if (z10) {
            z10 = true;
        }
        int i12 = z10 ? 1 : 0;
        int i13 = z10 ? 1 : 0;
        int i14 = z10 ? 1 : 0;
        int i15 = (i10 + i12) * 31;
        boolean z11 = this.shouldShowRoleDot;
        if (z11) {
            z11 = true;
        }
        int i16 = z11 ? 1 : 0;
        int i17 = z11 ? 1 : 0;
        int i18 = z11 ? 1 : 0;
        int i19 = (i15 + i16) * 31;
        boolean z12 = this.shouldShowRoleOnName;
        if (!z12) {
            i11 = z12 ? 1 : 0;
        }
        return i19 + i11;
    }

    public String toString() {
        String str = MessageId.m637toStringimpl(mo236getMessageId3Eiw7ao());
        int i10 = this.codedLinkIndex;
        GuildEventInviteEmbedImpl guildEventInviteEmbedImpl = this.invite;
        boolean z10 = this.shouldAnimateEmoji;
        boolean z11 = this.shouldShowRoleDot;
        boolean z12 = this.shouldShowRoleOnName;
        return "GuildEventInviteMessageAccessory(messageId=" + str + ", codedLinkIndex=" + i10 + ", invite=" + guildEventInviteEmbedImpl + ", shouldAnimateEmoji=" + z10 + ", shouldShowRoleDot=" + z11 + ", shouldShowRoleOnName=" + z12 + ")";
    }
}
