package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.truncation.Truncation;
import com.discord.fonts.DiscordFont;
import com.discord.primitives.MessageId;
import com.discord.theme.DiscordTheme;
import com.discord.theme.ThemeManagerKt;
import j$.util.Spliterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u008a\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u0019\u00101\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u0010 J\t\u00103\u001a\u00020\u000bHÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u000bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u00108\u001a\u00020\u0018HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\t\u0010;\u001a\u00020\u0007HÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\t\u0010=\u001a\u00020\u000bHÆ\u0003J\t\u0010>\u001a\u00020\u000bHÆ\u0003J\t\u0010?\u001a\u00020\u000bHÆ\u0003J\t\u0010@\u001a\u00020\u000fHÆ\u0003J°\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u0013\u0010D\u001a\u00020\u00072\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020\u000bHÖ\u0001J\t\u0010H\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010'\u001a\u0004\b&\u0010 R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b/\u00100\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006I"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "messageContent", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "shouldAnimateEmoji", "", "shouldShowRoleDot", "shouldShowRoleOnName", "bottomSpacingPx", "", "linkColor", "messageTextColor", "messageFont", "Lcom/discord/fonts/DiscordFont;", "textSizeSp", "boldLinkText", "constrainedWidth", "editedLabel", "", "truncation", "Lcom/discord/chat/bridge/truncation/Truncation;", "theme", "Lcom/discord/theme/DiscordTheme;", "(Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;ZZZIIILcom/discord/fonts/DiscordFont;IZILjava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/theme/DiscordTheme;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBoldLinkText", "()Z", "getBottomSpacingPx", "()I", "getConstrainedWidth", "getEditedLabel", "()Ljava/lang/String;", "getLinkColor", "getMessageContent", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getMessageFont", "()Lcom/discord/fonts/DiscordFont;", "getMessageId-3Eiw7ao", "Ljava/lang/String;", "getMessageTextColor", "getShouldAnimateEmoji", "getShouldShowRoleDot", "getShouldShowRoleOnName", "getTextSizeSp", "getTheme", "()Lcom/discord/theme/DiscordTheme;", "getTruncation", "()Lcom/discord/chat/bridge/truncation/Truncation;", "component1", "component1-3Eiw7ao", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copy-UwkiYZs", "(Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;ZZZIIILcom/discord/fonts/DiscordFont;IZILjava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/theme/DiscordTheme;)Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;", "equals", "other", "", "hashCode", "toString", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MessageContentAccessory extends MessageAccessory {
    private final boolean boldLinkText;
    private final int bottomSpacingPx;
    private final int constrainedWidth;
    private final String editedLabel;
    private final int linkColor;
    private final StructurableText messageContent;
    private final DiscordFont messageFont;
    private final String messageId;
    private final int messageTextColor;
    private final boolean shouldAnimateEmoji;
    private final boolean shouldShowRoleDot;
    private final boolean shouldShowRoleOnName;
    private final int textSizeSp;
    private final DiscordTheme theme;
    private final Truncation truncation;

    public /* synthetic */ MessageContentAccessory(String str, StructurableText structurableText, boolean z10, boolean z11, boolean z12, int i10, int i11, int i12, DiscordFont discordFont, int i13, boolean z13, int i14, String str2, Truncation truncation, DiscordTheme discordTheme, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, structurableText, z10, z11, z12, i10, i11, i12, discordFont, i13, z13, i14, str2, (i15 & 8192) != 0 ? null : truncation, (i15 & Spliterator.SUBSIZED) != 0 ? ThemeManagerKt.getTheme() : discordTheme, null);
    }

    public /* synthetic */ MessageContentAccessory(String str, StructurableText structurableText, boolean z10, boolean z11, boolean z12, int i10, int i11, int i12, DiscordFont discordFont, int i13, boolean z13, int i14, String str2, Truncation truncation, DiscordTheme discordTheme, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, structurableText, z10, z11, z12, i10, i11, i12, discordFont, i13, z13, i14, str2, truncation, discordTheme);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m262component13Eiw7ao() {
        return mo204getMessageId3Eiw7ao();
    }

    public final int component10() {
        return this.textSizeSp;
    }

    public final boolean component11() {
        return this.boldLinkText;
    }

    public final int component12() {
        return this.constrainedWidth;
    }

    public final String component13() {
        return this.editedLabel;
    }

    public final Truncation component14() {
        return this.truncation;
    }

    public final DiscordTheme component15() {
        return this.theme;
    }

    public final StructurableText component2() {
        return this.messageContent;
    }

    public final boolean component3() {
        return this.shouldAnimateEmoji;
    }

    public final boolean component4() {
        return this.shouldShowRoleDot;
    }

    public final boolean component5() {
        return this.shouldShowRoleOnName;
    }

    public final int component6() {
        return this.bottomSpacingPx;
    }

    public final int component7() {
        return this.linkColor;
    }

    public final int component8() {
        return this.messageTextColor;
    }

    public final DiscordFont component9() {
        return this.messageFont;
    }

    /* renamed from: copy-UwkiYZs  reason: not valid java name */
    public final MessageContentAccessory m263copyUwkiYZs(String messageId, StructurableText messageContent, boolean z10, boolean z11, boolean z12, int i10, int i11, int i12, DiscordFont messageFont, int i13, boolean z13, int i14, String str, Truncation truncation, DiscordTheme theme) {
        q.g(messageId, "messageId");
        q.g(messageContent, "messageContent");
        q.g(messageFont, "messageFont");
        q.g(theme, "theme");
        return new MessageContentAccessory(messageId, messageContent, z10, z11, z12, i10, i11, i12, messageFont, i13, z13, i14, str, truncation, theme, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageContentAccessory)) {
            return false;
        }
        MessageContentAccessory messageContentAccessory = (MessageContentAccessory) obj;
        return MessageId.m576equalsimpl0(mo204getMessageId3Eiw7ao(), messageContentAccessory.mo204getMessageId3Eiw7ao()) && q.b(this.messageContent, messageContentAccessory.messageContent) && this.shouldAnimateEmoji == messageContentAccessory.shouldAnimateEmoji && this.shouldShowRoleDot == messageContentAccessory.shouldShowRoleDot && this.shouldShowRoleOnName == messageContentAccessory.shouldShowRoleOnName && this.bottomSpacingPx == messageContentAccessory.bottomSpacingPx && this.linkColor == messageContentAccessory.linkColor && this.messageTextColor == messageContentAccessory.messageTextColor && this.messageFont == messageContentAccessory.messageFont && this.textSizeSp == messageContentAccessory.textSizeSp && this.boldLinkText == messageContentAccessory.boldLinkText && this.constrainedWidth == messageContentAccessory.constrainedWidth && q.b(this.editedLabel, messageContentAccessory.editedLabel) && q.b(this.truncation, messageContentAccessory.truncation) && q.b(this.theme, messageContentAccessory.theme);
    }

    public final boolean getBoldLinkText() {
        return this.boldLinkText;
    }

    public final int getBottomSpacingPx() {
        return this.bottomSpacingPx;
    }

    public final int getConstrainedWidth() {
        return this.constrainedWidth;
    }

    public final String getEditedLabel() {
        return this.editedLabel;
    }

    public final int getLinkColor() {
        return this.linkColor;
    }

    public final StructurableText getMessageContent() {
        return this.messageContent;
    }

    public final DiscordFont getMessageFont() {
        return this.messageFont;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo204getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final int getMessageTextColor() {
        return this.messageTextColor;
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

    public final int getTextSizeSp() {
        return this.textSizeSp;
    }

    public final DiscordTheme getTheme() {
        return this.theme;
    }

    public final Truncation getTruncation() {
        return this.truncation;
    }

    public int hashCode() {
        int i10 = ((MessageId.m577hashCodeimpl(mo204getMessageId3Eiw7ao()) * 31) + this.messageContent.hashCode()) * 31;
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
        if (z12) {
            z12 = true;
        }
        int i20 = z12 ? 1 : 0;
        int i21 = z12 ? 1 : 0;
        int i22 = z12 ? 1 : 0;
        int hashCode = (((((((((((i19 + i20) * 31) + this.bottomSpacingPx) * 31) + this.linkColor) * 31) + this.messageTextColor) * 31) + this.messageFont.hashCode()) * 31) + this.textSizeSp) * 31;
        boolean z13 = this.boldLinkText;
        if (!z13) {
            i11 = z13 ? 1 : 0;
        }
        int i23 = (((hashCode + i11) * 31) + this.constrainedWidth) * 31;
        String str = this.editedLabel;
        int i24 = 0;
        int hashCode2 = (i23 + (str == null ? 0 : str.hashCode())) * 31;
        Truncation truncation = this.truncation;
        if (truncation != null) {
            i24 = truncation.hashCode();
        }
        return ((hashCode2 + i24) * 31) + this.theme.hashCode();
    }

    public String toString() {
        String str = MessageId.m578toStringimpl(mo204getMessageId3Eiw7ao());
        StructurableText structurableText = this.messageContent;
        boolean z10 = this.shouldAnimateEmoji;
        boolean z11 = this.shouldShowRoleDot;
        boolean z12 = this.shouldShowRoleOnName;
        int i10 = this.bottomSpacingPx;
        int i11 = this.linkColor;
        int i12 = this.messageTextColor;
        DiscordFont discordFont = this.messageFont;
        int i13 = this.textSizeSp;
        boolean z13 = this.boldLinkText;
        int i14 = this.constrainedWidth;
        String str2 = this.editedLabel;
        Truncation truncation = this.truncation;
        DiscordTheme discordTheme = this.theme;
        return "MessageContentAccessory(messageId=" + str + ", messageContent=" + structurableText + ", shouldAnimateEmoji=" + z10 + ", shouldShowRoleDot=" + z11 + ", shouldShowRoleOnName=" + z12 + ", bottomSpacingPx=" + i10 + ", linkColor=" + i11 + ", messageTextColor=" + i12 + ", messageFont=" + discordFont + ", textSizeSp=" + i13 + ", boldLinkText=" + z13 + ", constrainedWidth=" + i14 + ", editedLabel=" + str2 + ", truncation=" + truncation + ", theme=" + discordTheme + ")";
    }

    private MessageContentAccessory(String str, StructurableText structurableText, boolean z10, boolean z11, boolean z12, int i10, int i11, int i12, DiscordFont discordFont, int i13, boolean z13, int i14, String str2, Truncation truncation, DiscordTheme discordTheme) {
        super(str, "message content", null);
        this.messageId = str;
        this.messageContent = structurableText;
        this.shouldAnimateEmoji = z10;
        this.shouldShowRoleDot = z11;
        this.shouldShowRoleOnName = z12;
        this.bottomSpacingPx = i10;
        this.linkColor = i11;
        this.messageTextColor = i12;
        this.messageFont = discordFont;
        this.textSizeSp = i13;
        this.boldLinkText = z13;
        this.constrainedWidth = i14;
        this.editedLabel = str2;
        this.truncation = truncation;
        this.theme = discordTheme;
    }
}
