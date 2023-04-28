package com.discord.chat.presentation.message.messagepart;

import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B,\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0019\u0010\u0011\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003JB\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000f\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, m15073d2 = {"Lcom/discord/chat/presentation/message/messagepart/RoleSubscriptionPurchaseAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "authorUsername", "", "authorAvatar", "constrainedWidth", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAuthorAvatar", "()Ljava/lang/String;", "getAuthorUsername", "getConstrainedWidth", "()I", "getMessageId-3Eiw7ao", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "copy", "copy-AFFcxXc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/discord/chat/presentation/message/messagepart/RoleSubscriptionPurchaseAccessory;", "equals", "", "other", "", "hashCode", "toString", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class RoleSubscriptionPurchaseAccessory extends MessageAccessory {
    private final String authorAvatar;
    private final String authorUsername;
    private final int constrainedWidth;
    private final String messageId;

    private RoleSubscriptionPurchaseAccessory(String str, String str2, String str3, int i) {
        super(str, "role subscription purchase", null);
        this.messageId = str;
        this.authorUsername = str2;
        this.authorAvatar = str3;
        this.constrainedWidth = i;
    }

    public /* synthetic */ RoleSubscriptionPurchaseAccessory(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i);
    }

    /* renamed from: copy-AFFcxXc$default  reason: not valid java name */
    public static /* synthetic */ RoleSubscriptionPurchaseAccessory m41831copyAFFcxXc$default(RoleSubscriptionPurchaseAccessory roleSubscriptionPurchaseAccessory, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = roleSubscriptionPurchaseAccessory.mo41765getMessageId3Eiw7ao();
        }
        if ((i2 & 2) != 0) {
            str2 = roleSubscriptionPurchaseAccessory.authorUsername;
        }
        if ((i2 & 4) != 0) {
            str3 = roleSubscriptionPurchaseAccessory.authorAvatar;
        }
        if ((i2 & 8) != 0) {
            i = roleSubscriptionPurchaseAccessory.constrainedWidth;
        }
        return roleSubscriptionPurchaseAccessory.m41833copyAFFcxXc(str, str2, str3, i);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41832component13Eiw7ao() {
        return mo41765getMessageId3Eiw7ao();
    }

    public final String component2() {
        return this.authorUsername;
    }

    public final String component3() {
        return this.authorAvatar;
    }

    public final int component4() {
        return this.constrainedWidth;
    }

    /* renamed from: copy-AFFcxXc  reason: not valid java name */
    public final RoleSubscriptionPurchaseAccessory m41833copyAFFcxXc(String messageId, String str, String str2, int i) {
        C9677q.m14633g(messageId, "messageId");
        return new RoleSubscriptionPurchaseAccessory(messageId, str, str2, i, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoleSubscriptionPurchaseAccessory)) {
            return false;
        }
        RoleSubscriptionPurchaseAccessory roleSubscriptionPurchaseAccessory = (RoleSubscriptionPurchaseAccessory) obj;
        return MessageId.m42119equalsimpl0(mo41765getMessageId3Eiw7ao(), roleSubscriptionPurchaseAccessory.mo41765getMessageId3Eiw7ao()) && C9677q.m14638b(this.authorUsername, roleSubscriptionPurchaseAccessory.authorUsername) && C9677q.m14638b(this.authorAvatar, roleSubscriptionPurchaseAccessory.authorAvatar) && this.constrainedWidth == roleSubscriptionPurchaseAccessory.constrainedWidth;
    }

    public final String getAuthorAvatar() {
        return this.authorAvatar;
    }

    public final String getAuthorUsername() {
        return this.authorUsername;
    }

    public final int getConstrainedWidth() {
        return this.constrainedWidth;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo41765getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        int i = MessageId.m42120hashCodeimpl(mo41765getMessageId3Eiw7ao()) * 31;
        String str = this.authorUsername;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.authorAvatar;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + this.constrainedWidth;
    }

    public String toString() {
        String str = MessageId.m42121toStringimpl(mo41765getMessageId3Eiw7ao());
        String str2 = this.authorUsername;
        String str3 = this.authorAvatar;
        int i = this.constrainedWidth;
        return "RoleSubscriptionPurchaseAccessory(messageId=" + str + ", authorUsername=" + str2 + ", authorAvatar=" + str3 + ", constrainedWidth=" + i + ")";
    }
}
