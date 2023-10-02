package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.reaction.MessageReaction;
import com.discord.chat.bridge.reaction.ReactionsTheme;
import com.discord.primitives.MessageId;
import com.discord.theme.DiscordTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\\\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0019\u0010\"\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\u0014J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jz\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0013\u0010/\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "reactions", "", "Lcom/discord/chat/bridge/reaction/MessageReaction;", "canAddNewReactions", "", "canAddNewBurstReactions", "addReactionLabel", "", "addNewReactionAccessibilityLabel", "addNewBurstReactionAccessibilityLabel", "reactionsTheme", "Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "theme", "Lcom/discord/theme/DiscordTheme;", "(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/theme/DiscordTheme;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAddNewBurstReactionAccessibilityLabel", "()Ljava/lang/String;", "getAddNewReactionAccessibilityLabel", "getAddReactionLabel", "getCanAddNewBurstReactions", "()Z", "getCanAddNewReactions", "getMessageId-3Eiw7ao", "Ljava/lang/String;", "getReactions", "()Ljava/util/List;", "getReactionsTheme", "()Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "getTheme", "()Lcom/discord/theme/DiscordTheme;", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copy-IwdeaXA", "(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/theme/DiscordTheme;)Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;", "equals", "other", "", "hashCode", "", "toString", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

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

    public  ReactionsMessageAccessory(String str, List list, boolean z10, boolean z11, String str2, String str3, String str4, ReactionsTheme reactionsTheme, DiscordTheme discordTheme, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, z10, z11, str2, str3, str4, reactionsTheme, (i10 & 256) != 0 ? null : discordTheme, null);
    }

    public  ReactionsMessageAccessory(String str, List list, boolean z10, boolean z11, String str2, String str3, String str4, ReactionsTheme reactionsTheme, DiscordTheme discordTheme, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, z10, z11, str2, str3, str4, reactionsTheme, discordTheme);
    }

    
    public final String m309component13Eiw7ao() {
        return mo240getMessageId3Eiw7ao();
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

    
    public final ReactionsMessageAccessory m310copyIwdeaXA(String messageId, List<MessageReaction> reactions, boolean z10, boolean z11, String addReactionLabel, String addNewReactionAccessibilityLabel, String addNewBurstReactionAccessibilityLabel, ReactionsTheme reactionsTheme, DiscordTheme discordTheme) {
        q.h(messageId, "messageId");
        q.h(reactions, "reactions");
        q.h(addReactionLabel, "addReactionLabel");
        q.h(addNewReactionAccessibilityLabel, "addNewReactionAccessibilityLabel");
        q.h(addNewBurstReactionAccessibilityLabel, "addNewBurstReactionAccessibilityLabel");
        return new ReactionsMessageAccessory(messageId, reactions, z10, z11, addReactionLabel, addNewReactionAccessibilityLabel, addNewBurstReactionAccessibilityLabel, reactionsTheme, discordTheme, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactionsMessageAccessory)) {
            return false;
        }
        ReactionsMessageAccessory reactionsMessageAccessory = (ReactionsMessageAccessory) obj;
        return MessageId.m647equalsimpl0(mo240getMessageId3Eiw7ao(), reactionsMessageAccessory.mo240getMessageId3Eiw7ao()) && q.c(this.reactions, reactionsMessageAccessory.reactions) && this.canAddNewReactions == reactionsMessageAccessory.canAddNewReactions && this.canAddNewBurstReactions == reactionsMessageAccessory.canAddNewBurstReactions && q.c(this.addReactionLabel, reactionsMessageAccessory.addReactionLabel) && q.c(this.addNewReactionAccessibilityLabel, reactionsMessageAccessory.addNewReactionAccessibilityLabel) && q.c(this.addNewBurstReactionAccessibilityLabel, reactionsMessageAccessory.addNewBurstReactionAccessibilityLabel) && q.c(this.reactionsTheme, reactionsMessageAccessory.reactionsTheme) && q.c(this.theme, reactionsMessageAccessory.theme);
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

    @Override 
    
    public String mo240getMessageId3Eiw7ao() {
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

    public int hashCode() {
        int i10 = ((MessageId.m648hashCodeimpl(mo240getMessageId3Eiw7ao()) * 31) + this.reactions.hashCode()) * 31;
        boolean z10 = this.canAddNewReactions;
        int i11 = 1;
        if (z10) {
            z10 = true;
        }
        int i12 = z10 ? 1 : 0;
        int i13 = z10 ? 1 : 0;
        int i14 = z10 ? 1 : 0;
        int i15 = (i10 + i12) * 31;
        boolean z11 = this.canAddNewBurstReactions;
        if (!z11) {
            i11 = z11 ? 1 : 0;
        }
        int hashCode = (((((((i15 + i11) * 31) + this.addReactionLabel.hashCode()) * 31) + this.addNewReactionAccessibilityLabel.hashCode()) * 31) + this.addNewBurstReactionAccessibilityLabel.hashCode()) * 31;
        ReactionsTheme reactionsTheme = this.reactionsTheme;
        int i16 = 0;
        int hashCode2 = (hashCode + (reactionsTheme == null ? 0 : reactionsTheme.hashCode())) * 31;
        DiscordTheme discordTheme = this.theme;
        if (discordTheme != null) {
            i16 = discordTheme.hashCode();
        }
        return hashCode2 + i16;
    }

    public String toString() {
        String str = MessageId.m649toStringimpl(mo240getMessageId3Eiw7ao());
        List<MessageReaction> list = this.reactions;
        boolean z10 = this.canAddNewReactions;
        boolean z11 = this.canAddNewBurstReactions;
        String str2 = this.addReactionLabel;
        String str3 = this.addNewReactionAccessibilityLabel;
        String str4 = this.addNewBurstReactionAccessibilityLabel;
        ReactionsTheme reactionsTheme = this.reactionsTheme;
        DiscordTheme discordTheme = this.theme;
        return "ReactionsMessageAccessory(messageId=" + str + ", reactions=" + list + ", canAddNewReactions=" + z10 + ", canAddNewBurstReactions=" + z11 + ", addReactionLabel=" + str2 + ", addNewReactionAccessibilityLabel=" + str3 + ", addNewBurstReactionAccessibilityLabel=" + str4 + ", reactionsTheme=" + reactionsTheme + ", theme=" + discordTheme + ")";
    }

    private ReactionsMessageAccessory(String str, List<MessageReaction> list, boolean z10, boolean z11, String str2, String str3, String str4, ReactionsTheme reactionsTheme, DiscordTheme discordTheme) {
        super(str, "reactions", null);
        this.messageId = str;
        this.reactions = list;
        this.canAddNewReactions = z10;
        this.canAddNewBurstReactions = z11;
        this.addReactionLabel = str2;
        this.addNewReactionAccessibilityLabel = str3;
        this.addNewBurstReactionAccessibilityLabel = str4;
        this.reactionsTheme = reactionsTheme;
        this.theme = discordTheme;
    }
}
