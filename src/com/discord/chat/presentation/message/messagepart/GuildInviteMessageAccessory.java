package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.codedlinks.GuildInviteEmbedImpl;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\u0010\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J4\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, m15073d2 = {"Lcom/discord/chat/presentation/message/messagepart/GuildInviteMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "codedLinkIndex", "", "invite", "Lcom/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl;", "(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCodedLinkIndex", "()I", "getInvite", "()Lcom/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl;", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "component3", "copy", "copy-u7_MRrM", "(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl;)Lcom/discord/chat/presentation/message/messagepart/GuildInviteMessageAccessory;", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class GuildInviteMessageAccessory extends MessageAccessory {
    private final int codedLinkIndex;
    private final GuildInviteEmbedImpl invite;
    private final String messageId;

    private GuildInviteMessageAccessory(String str, int i, GuildInviteEmbedImpl guildInviteEmbedImpl) {
        super(str, "guild invite " + i, null);
        this.messageId = str;
        this.codedLinkIndex = i;
        this.invite = guildInviteEmbedImpl;
    }

    public /* synthetic */ GuildInviteMessageAccessory(String str, int i, GuildInviteEmbedImpl guildInviteEmbedImpl, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, guildInviteEmbedImpl);
    }

    /* renamed from: copy-u7_MRrM$default  reason: not valid java name */
    public static /* synthetic */ GuildInviteMessageAccessory m41807copyu7_MRrM$default(GuildInviteMessageAccessory guildInviteMessageAccessory, String str, int i, GuildInviteEmbedImpl guildInviteEmbedImpl, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = guildInviteMessageAccessory.mo41765getMessageId3Eiw7ao();
        }
        if ((i2 & 2) != 0) {
            i = guildInviteMessageAccessory.codedLinkIndex;
        }
        if ((i2 & 4) != 0) {
            guildInviteEmbedImpl = guildInviteMessageAccessory.invite;
        }
        return guildInviteMessageAccessory.m41809copyu7_MRrM(str, i, guildInviteEmbedImpl);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41808component13Eiw7ao() {
        return mo41765getMessageId3Eiw7ao();
    }

    public final int component2() {
        return this.codedLinkIndex;
    }

    public final GuildInviteEmbedImpl component3() {
        return this.invite;
    }

    /* renamed from: copy-u7_MRrM  reason: not valid java name */
    public final GuildInviteMessageAccessory m41809copyu7_MRrM(String messageId, int i, GuildInviteEmbedImpl invite) {
        C9677q.m14633g(messageId, "messageId");
        C9677q.m14633g(invite, "invite");
        return new GuildInviteMessageAccessory(messageId, i, invite, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuildInviteMessageAccessory)) {
            return false;
        }
        GuildInviteMessageAccessory guildInviteMessageAccessory = (GuildInviteMessageAccessory) obj;
        return MessageId.m42119equalsimpl0(mo41765getMessageId3Eiw7ao(), guildInviteMessageAccessory.mo41765getMessageId3Eiw7ao()) && this.codedLinkIndex == guildInviteMessageAccessory.codedLinkIndex && C9677q.m14638b(this.invite, guildInviteMessageAccessory.invite);
    }

    public final int getCodedLinkIndex() {
        return this.codedLinkIndex;
    }

    public final GuildInviteEmbedImpl getInvite() {
        return this.invite;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo41765getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        return (((MessageId.m42120hashCodeimpl(mo41765getMessageId3Eiw7ao()) * 31) + this.codedLinkIndex) * 31) + this.invite.hashCode();
    }

    public String toString() {
        String str = MessageId.m42121toStringimpl(mo41765getMessageId3Eiw7ao());
        int i = this.codedLinkIndex;
        GuildInviteEmbedImpl guildInviteEmbedImpl = this.invite;
        return "GuildInviteMessageAccessory(messageId=" + str + ", codedLinkIndex=" + i + ", invite=" + guildInviteEmbedImpl + ")";
    }
}
