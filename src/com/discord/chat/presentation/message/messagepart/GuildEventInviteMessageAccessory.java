package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.codedlinks.GuildEventInviteEmbedImpl;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\tø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\u0018\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0012J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003JR\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, m15073d2 = {"Lcom/discord/chat/presentation/message/messagepart/GuildEventInviteMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "codedLinkIndex", "", "invite", "Lcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl;", "shouldAnimateEmoji", "", "shouldShowRoleDot", "shouldShowRoleOnName", "(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl;ZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCodedLinkIndex", "()I", "getInvite", "()Lcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl;", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getShouldAnimateEmoji", "()Z", "getShouldShowRoleDot", "getShouldShowRoleOnName", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "component5", "component6", "copy", "copy-LdU2QRA", "(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl;ZZZ)Lcom/discord/chat/presentation/message/messagepart/GuildEventInviteMessageAccessory;", "equals", "other", "", "hashCode", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class GuildEventInviteMessageAccessory extends MessageAccessory {
    private final int codedLinkIndex;
    private final GuildEventInviteEmbedImpl invite;
    private final String messageId;
    private final boolean shouldAnimateEmoji;
    private final boolean shouldShowRoleDot;
    private final boolean shouldShowRoleOnName;

    private GuildEventInviteMessageAccessory(String str, int i, GuildEventInviteEmbedImpl guildEventInviteEmbedImpl, boolean z, boolean z2, boolean z3) {
        super(str, "guild scheduled event invite " + i, null);
        this.messageId = str;
        this.codedLinkIndex = i;
        this.invite = guildEventInviteEmbedImpl;
        this.shouldAnimateEmoji = z;
        this.shouldShowRoleDot = z2;
        this.shouldShowRoleOnName = z3;
    }

    public /* synthetic */ GuildEventInviteMessageAccessory(String str, int i, GuildEventInviteEmbedImpl guildEventInviteEmbedImpl, boolean z, boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, guildEventInviteEmbedImpl, z, z2, z3);
    }

    /* renamed from: copy-LdU2QRA$default  reason: not valid java name */
    public static /* synthetic */ GuildEventInviteMessageAccessory m41801copyLdU2QRA$default(GuildEventInviteMessageAccessory guildEventInviteMessageAccessory, String str, int i, GuildEventInviteEmbedImpl guildEventInviteEmbedImpl, boolean z, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = guildEventInviteMessageAccessory.mo41765getMessageId3Eiw7ao();
        }
        if ((i2 & 2) != 0) {
            i = guildEventInviteMessageAccessory.codedLinkIndex;
        }
        if ((i2 & 4) != 0) {
            guildEventInviteEmbedImpl = guildEventInviteMessageAccessory.invite;
        }
        if ((i2 & 8) != 0) {
            z = guildEventInviteMessageAccessory.shouldAnimateEmoji;
        }
        if ((i2 & 16) != 0) {
            z2 = guildEventInviteMessageAccessory.shouldShowRoleDot;
        }
        if ((i2 & 32) != 0) {
            z3 = guildEventInviteMessageAccessory.shouldShowRoleOnName;
        }
        return guildEventInviteMessageAccessory.m41803copyLdU2QRA(str, i, guildEventInviteEmbedImpl, z, z2, z3);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41802component13Eiw7ao() {
        return mo41765getMessageId3Eiw7ao();
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

    /* renamed from: copy-LdU2QRA  reason: not valid java name */
    public final GuildEventInviteMessageAccessory m41803copyLdU2QRA(String messageId, int i, GuildEventInviteEmbedImpl invite, boolean z, boolean z2, boolean z3) {
        C9971q.m14633g(messageId, "messageId");
        C9971q.m14633g(invite, "invite");
        return new GuildEventInviteMessageAccessory(messageId, i, invite, z, z2, z3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuildEventInviteMessageAccessory)) {
            return false;
        }
        GuildEventInviteMessageAccessory guildEventInviteMessageAccessory = (GuildEventInviteMessageAccessory) obj;
        return MessageId.m42119equalsimpl0(mo41765getMessageId3Eiw7ao(), guildEventInviteMessageAccessory.mo41765getMessageId3Eiw7ao()) && this.codedLinkIndex == guildEventInviteMessageAccessory.codedLinkIndex && C9971q.m14638b(this.invite, guildEventInviteMessageAccessory.invite) && this.shouldAnimateEmoji == guildEventInviteMessageAccessory.shouldAnimateEmoji && this.shouldShowRoleDot == guildEventInviteMessageAccessory.shouldShowRoleDot && this.shouldShowRoleOnName == guildEventInviteMessageAccessory.shouldShowRoleOnName;
    }

    public final int getCodedLinkIndex() {
        return this.codedLinkIndex;
    }

    public final GuildEventInviteEmbedImpl getInvite() {
        return this.invite;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo41765getMessageId3Eiw7ao() {
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
        int i = ((((MessageId.m42120hashCodeimpl(mo41765getMessageId3Eiw7ao()) * 31) + this.codedLinkIndex) * 31) + this.invite.hashCode()) * 31;
        boolean z = this.shouldAnimateEmoji;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (i + i3) * 31;
        boolean z2 = this.shouldShowRoleDot;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.shouldShowRoleOnName;
        if (!z3) {
            i2 = z3 ? 1 : 0;
        }
        return i10 + i2;
    }

    public String toString() {
        String str = MessageId.m42121toStringimpl(mo41765getMessageId3Eiw7ao());
        int i = this.codedLinkIndex;
        GuildEventInviteEmbedImpl guildEventInviteEmbedImpl = this.invite;
        boolean z = this.shouldAnimateEmoji;
        boolean z2 = this.shouldShowRoleDot;
        boolean z3 = this.shouldShowRoleOnName;
        return "GuildEventInviteMessageAccessory(messageId=" + str + ", codedLinkIndex=" + i + ", invite=" + guildEventInviteEmbedImpl + ", shouldAnimateEmoji=" + z + ", shouldShowRoleDot=" + z2 + ", shouldShowRoleOnName=" + z3 + ")";
    }
}
