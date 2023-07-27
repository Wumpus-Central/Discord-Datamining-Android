package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.codedlinks.GuildInviteEmbedImpl;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\u0010\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J4\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/GuildInviteMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "codedLinkIndex", "", "invite", "Lcom/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl;", "(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCodedLinkIndex", "()I", "getInvite", "()Lcom/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl;", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "component3", "copy", "copy-u7_MRrM", "(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl;)Lcom/discord/chat/presentation/message/messagepart/GuildInviteMessageAccessory;", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class GuildInviteMessageAccessory extends MessageAccessory {
    private final int codedLinkIndex;
    private final GuildInviteEmbedImpl invite;
    private final String messageId;

    private GuildInviteMessageAccessory(String str, int i10, GuildInviteEmbedImpl guildInviteEmbedImpl) {
        super(str, "guild invite " + i10, null);
        this.messageId = str;
        this.codedLinkIndex = i10;
        this.invite = guildInviteEmbedImpl;
    }

    public  GuildInviteMessageAccessory(String str, int i10, GuildInviteEmbedImpl guildInviteEmbedImpl, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, guildInviteEmbedImpl);
    }

    
    public static  GuildInviteMessageAccessory m259copyu7_MRrM$default(GuildInviteMessageAccessory guildInviteMessageAccessory, String str, int i10, GuildInviteEmbedImpl guildInviteEmbedImpl, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = guildInviteMessageAccessory.mo217getMessageId3Eiw7ao();
        }
        if ((i11 & 2) != 0) {
            i10 = guildInviteMessageAccessory.codedLinkIndex;
        }
        if ((i11 & 4) != 0) {
            guildInviteEmbedImpl = guildInviteMessageAccessory.invite;
        }
        return guildInviteMessageAccessory.m261copyu7_MRrM(str, i10, guildInviteEmbedImpl);
    }

    
    public final String m260component13Eiw7ao() {
        return mo217getMessageId3Eiw7ao();
    }

    public final int component2() {
        return this.codedLinkIndex;
    }

    public final GuildInviteEmbedImpl component3() {
        return this.invite;
    }

    
    public final GuildInviteMessageAccessory m261copyu7_MRrM(String messageId, int i10, GuildInviteEmbedImpl invite) {
        q.g(messageId, "messageId");
        q.g(invite, "invite");
        return new GuildInviteMessageAccessory(messageId, i10, invite, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuildInviteMessageAccessory)) {
            return false;
        }
        GuildInviteMessageAccessory guildInviteMessageAccessory = (GuildInviteMessageAccessory) obj;
        return MessageId.m596equalsimpl0(mo217getMessageId3Eiw7ao(), guildInviteMessageAccessory.mo217getMessageId3Eiw7ao()) && this.codedLinkIndex == guildInviteMessageAccessory.codedLinkIndex && q.b(this.invite, guildInviteMessageAccessory.invite);
    }

    public final int getCodedLinkIndex() {
        return this.codedLinkIndex;
    }

    public final GuildInviteEmbedImpl getInvite() {
        return this.invite;
    }

    @Override 
    
    public String mo217getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        return (((MessageId.m597hashCodeimpl(mo217getMessageId3Eiw7ao()) * 31) + this.codedLinkIndex) * 31) + this.invite.hashCode();
    }

    public String toString() {
        String str = MessageId.m598toStringimpl(mo217getMessageId3Eiw7ao());
        int i10 = this.codedLinkIndex;
        GuildInviteEmbedImpl guildInviteEmbedImpl = this.invite;
        return "GuildInviteMessageAccessory(messageId=" + str + ", codedLinkIndex=" + i10 + ", invite=" + guildInviteEmbedImpl + ")";
    }
}
