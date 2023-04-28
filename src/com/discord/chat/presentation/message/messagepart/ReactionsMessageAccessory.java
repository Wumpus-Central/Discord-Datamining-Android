package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.reaction.MessageReaction;
import com.discord.chat.bridge.reaction.ReactionsTheme;
import com.discord.primitives.MessageId;
import com.discord.theme.DiscordTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p164j$.util.Spliterator;

@Metadata(m15074d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bd\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\bø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0019\u0010$\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010\u0015J\t\u0010&\u001a\u00020\bHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0084\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\bHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0013\u00102\u001a\u00020\b2\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001b\u0010\u0015R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, m15073d2 = {"Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "reactions", "", "Lcom/discord/chat/bridge/reaction/MessageReaction;", "canAddNewReactions", "", "canAddNewBurstReactions", "addReactionLabel", "", "addNewReactionAccessibilityLabel", "addNewBurstReactionAccessibilityLabel", "reactionsTheme", "Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "theme", "Lcom/discord/theme/DiscordTheme;", "useSortedReactions", "(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/theme/DiscordTheme;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAddNewBurstReactionAccessibilityLabel", "()Ljava/lang/String;", "getAddNewReactionAccessibilityLabel", "getAddReactionLabel", "getCanAddNewBurstReactions", "()Z", "getCanAddNewReactions", "getMessageId-3Eiw7ao", "Ljava/lang/String;", "getReactions", "()Ljava/util/List;", "getReactionsTheme", "()Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "getTheme", "()Lcom/discord/theme/DiscordTheme;", "getUseSortedReactions", "component1", "component1-3Eiw7ao", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copy-a6FnO-k", "(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/theme/DiscordTheme;Z)Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;", "equals", "other", "", "hashCode", "", "toString", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class ReactionsMessageAccessory extends MessageAccessory {
    private final String addNewBurstReactionAccessibilityLabel;
    private final String addNewReactionAccessibilityLabel;
    private final String addReactionLabel;
    private final boolean canAddNewBurstReactions;
    private final boolean canAddNewReactions;
    private final String messageId;
    private final List<MessageReaction> reactions;
    private final ReactionsTheme reactionsTheme;
    private final DiscordTheme theme;
    private final boolean useSortedReactions;

    public /* synthetic */ ReactionsMessageAccessory(String str, List list, boolean z, boolean z2, String str2, String str3, String str4, ReactionsTheme reactionsTheme, DiscordTheme discordTheme, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, z, z2, str2, str3, str4, reactionsTheme, (i & Spliterator.NONNULL) != 0 ? null : discordTheme, z3, null);
    }

    public /* synthetic */ ReactionsMessageAccessory(String str, List list, boolean z, boolean z2, String str2, String str3, String str4, ReactionsTheme reactionsTheme, DiscordTheme discordTheme, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, z, z2, str2, str3, str4, reactionsTheme, discordTheme, z3);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41829component13Eiw7ao() {
        return mo41765getMessageId3Eiw7ao();
    }

    public final boolean component10() {
        return this.useSortedReactions;
    }

    public final List<MessageReaction> component2() {
        return this.reactions;
    }

    public final boolean component3() {
        return this.canAddNewReactions;
    }

    public final boolean component4() {
        return this.canAddNewBurstReactions;
    }

    public final String component5() {
        return this.addReactionLabel;
    }

    public final String component6() {
        return this.addNewReactionAccessibilityLabel;
    }

    public final String component7() {
        return this.addNewBurstReactionAccessibilityLabel;
    }

    public final ReactionsTheme component8() {
        return this.reactionsTheme;
    }

    public final DiscordTheme component9() {
        return this.theme;
    }

    /* renamed from: copy-a6FnO-k  reason: not valid java name */
    public final ReactionsMessageAccessory m41830copya6FnOk(String messageId, List<MessageReaction> reactions, boolean z, boolean z2, String addReactionLabel, String addNewReactionAccessibilityLabel, String addNewBurstReactionAccessibilityLabel, ReactionsTheme reactionsTheme, DiscordTheme discordTheme, boolean z3) {
        C9677q.m14633g(messageId, "messageId");
        C9677q.m14633g(reactions, "reactions");
        C9677q.m14633g(addReactionLabel, "addReactionLabel");
        C9677q.m14633g(addNewReactionAccessibilityLabel, "addNewReactionAccessibilityLabel");
        C9677q.m14633g(addNewBurstReactionAccessibilityLabel, "addNewBurstReactionAccessibilityLabel");
        return new ReactionsMessageAccessory(messageId, reactions, z, z2, addReactionLabel, addNewReactionAccessibilityLabel, addNewBurstReactionAccessibilityLabel, reactionsTheme, discordTheme, z3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactionsMessageAccessory)) {
            return false;
        }
        ReactionsMessageAccessory reactionsMessageAccessory = (ReactionsMessageAccessory) obj;
        return MessageId.m42119equalsimpl0(mo41765getMessageId3Eiw7ao(), reactionsMessageAccessory.mo41765getMessageId3Eiw7ao()) && C9677q.m14638b(this.reactions, reactionsMessageAccessory.reactions) && this.canAddNewReactions == reactionsMessageAccessory.canAddNewReactions && this.canAddNewBurstReactions == reactionsMessageAccessory.canAddNewBurstReactions && C9677q.m14638b(this.addReactionLabel, reactionsMessageAccessory.addReactionLabel) && C9677q.m14638b(this.addNewReactionAccessibilityLabel, reactionsMessageAccessory.addNewReactionAccessibilityLabel) && C9677q.m14638b(this.addNewBurstReactionAccessibilityLabel, reactionsMessageAccessory.addNewBurstReactionAccessibilityLabel) && C9677q.m14638b(this.reactionsTheme, reactionsMessageAccessory.reactionsTheme) && C9677q.m14638b(this.theme, reactionsMessageAccessory.theme) && this.useSortedReactions == reactionsMessageAccessory.useSortedReactions;
    }

    public final String getAddNewBurstReactionAccessibilityLabel() {
        return this.addNewBurstReactionAccessibilityLabel;
    }

    public final String getAddNewReactionAccessibilityLabel() {
        return this.addNewReactionAccessibilityLabel;
    }

    public final String getAddReactionLabel() {
        return this.addReactionLabel;
    }

    public final boolean getCanAddNewBurstReactions() {
        return this.canAddNewBurstReactions;
    }

    public final boolean getCanAddNewReactions() {
        return this.canAddNewReactions;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo41765getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final List<MessageReaction> getReactions() {
        return this.reactions;
    }

    public final ReactionsTheme getReactionsTheme() {
        return this.reactionsTheme;
    }

    public final DiscordTheme getTheme() {
        return this.theme;
    }

    public final boolean getUseSortedReactions() {
        return this.useSortedReactions;
    }

    public int hashCode() {
        int i = ((MessageId.m42120hashCodeimpl(mo41765getMessageId3Eiw7ao()) * 31) + this.reactions.hashCode()) * 31;
        boolean z = this.canAddNewReactions;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (i + i3) * 31;
        boolean z2 = this.canAddNewBurstReactions;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int hashCode = (((((((i6 + i7) * 31) + this.addReactionLabel.hashCode()) * 31) + this.addNewReactionAccessibilityLabel.hashCode()) * 31) + this.addNewBurstReactionAccessibilityLabel.hashCode()) * 31;
        ReactionsTheme reactionsTheme = this.reactionsTheme;
        int i10 = 0;
        int hashCode2 = (hashCode + (reactionsTheme == null ? 0 : reactionsTheme.hashCode())) * 31;
        DiscordTheme discordTheme = this.theme;
        if (discordTheme != null) {
            i10 = discordTheme.hashCode();
        }
        int i11 = (hashCode2 + i10) * 31;
        boolean z3 = this.useSortedReactions;
        if (!z3) {
            i2 = z3 ? 1 : 0;
        }
        return i11 + i2;
    }

    public String toString() {
        String str = MessageId.m42121toStringimpl(mo41765getMessageId3Eiw7ao());
        List<MessageReaction> list = this.reactions;
        boolean z = this.canAddNewReactions;
        boolean z2 = this.canAddNewBurstReactions;
        String str2 = this.addReactionLabel;
        String str3 = this.addNewReactionAccessibilityLabel;
        String str4 = this.addNewBurstReactionAccessibilityLabel;
        ReactionsTheme reactionsTheme = this.reactionsTheme;
        DiscordTheme discordTheme = this.theme;
        boolean z3 = this.useSortedReactions;
        return "ReactionsMessageAccessory(messageId=" + str + ", reactions=" + list + ", canAddNewReactions=" + z + ", canAddNewBurstReactions=" + z2 + ", addReactionLabel=" + str2 + ", addNewReactionAccessibilityLabel=" + str3 + ", addNewBurstReactionAccessibilityLabel=" + str4 + ", reactionsTheme=" + reactionsTheme + ", theme=" + discordTheme + ", useSortedReactions=" + z3 + ")";
    }

    private ReactionsMessageAccessory(String str, List<MessageReaction> list, boolean z, boolean z2, String str2, String str3, String str4, ReactionsTheme reactionsTheme, DiscordTheme discordTheme, boolean z3) {
        super(str, "reactions", null);
        this.messageId = str;
        this.reactions = list;
        this.canAddNewReactions = z;
        this.canAddNewBurstReactions = z2;
        this.addReactionLabel = str2;
        this.addNewReactionAccessibilityLabel = str3;
        this.addNewBurstReactionAccessibilityLabel = str4;
        this.reactionsTheme = reactionsTheme;
        this.theme = discordTheme;
        this.useSortedReactions = z3;
    }
}
