package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.forums.ForumPostActions;
import com.discord.chat.bridge.reaction.MessageReaction;
import com.discord.chat.bridge.reaction.ReactionsTheme;
import com.discord.primitives.MessageId;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BJ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\nø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0019\u0010\u001e\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0012J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003Jf\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\nHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\fHÖ\u0001R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/ForumPostActionBar;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "postActions", "Lcom/discord/chat/bridge/forums/ForumPostActions;", "reactions", "", "Lcom/discord/chat/bridge/reaction/MessageReaction;", "canAddNewReactions", "", "addNewReactionAccessibilityLabel", "", "reactionsTheme", "Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "useSortedReactions", "(Ljava/lang/String;Lcom/discord/chat/bridge/forums/ForumPostActions;Ljava/util/List;ZLjava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAddNewReactionAccessibilityLabel", "()Ljava/lang/String;", "getCanAddNewReactions", "()Z", "getMessageId-3Eiw7ao", "Ljava/lang/String;", "getPostActions", "()Lcom/discord/chat/bridge/forums/ForumPostActions;", "getReactions", "()Ljava/util/List;", "getReactionsTheme", "()Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "getUseSortedReactions", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "copy-dB0-bEw", "(Ljava/lang/String;Lcom/discord/chat/bridge/forums/ForumPostActions;Ljava/util/List;ZLjava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Z)Lcom/discord/chat/presentation/message/messagepart/ForumPostActionBar;", "equals", "other", "", "hashCode", "", "toString", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ForumPostActionBar extends MessageAccessory {
    private final String addNewReactionAccessibilityLabel;
    private final boolean canAddNewReactions;
    private final String messageId;
    private final ForumPostActions postActions;
    private final List<MessageReaction> reactions;
    private final ReactionsTheme reactionsTheme;
    private final boolean useSortedReactions;

    private ForumPostActionBar(String str, ForumPostActions forumPostActions, List<MessageReaction> list, boolean z10, String str2, ReactionsTheme reactionsTheme, boolean z11) {
        super(str, "post-actions", null);
        this.messageId = str;
        this.postActions = forumPostActions;
        this.reactions = list;
        this.canAddNewReactions = z10;
        this.addNewReactionAccessibilityLabel = str2;
        this.reactionsTheme = reactionsTheme;
        this.useSortedReactions = z11;
    }

    public /* synthetic */ ForumPostActionBar(String str, ForumPostActions forumPostActions, List list, boolean z10, String str2, ReactionsTheme reactionsTheme, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, forumPostActions, list, z10, str2, reactionsTheme, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-dB0-bEw$default  reason: not valid java name */
    public static /* synthetic */ ForumPostActionBar m245copydB0bEw$default(ForumPostActionBar forumPostActionBar, String str, ForumPostActions forumPostActions, List list, boolean z10, String str2, ReactionsTheme reactionsTheme, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = forumPostActionBar.mo215getMessageId3Eiw7ao();
        }
        if ((i10 & 2) != 0) {
            forumPostActions = forumPostActionBar.postActions;
        }
        if ((i10 & 4) != 0) {
            list = forumPostActionBar.reactions;
        }
        if ((i10 & 8) != 0) {
            z10 = forumPostActionBar.canAddNewReactions;
        }
        if ((i10 & 16) != 0) {
            str2 = forumPostActionBar.addNewReactionAccessibilityLabel;
        }
        if ((i10 & 32) != 0) {
            reactionsTheme = forumPostActionBar.reactionsTheme;
        }
        if ((i10 & 64) != 0) {
            z11 = forumPostActionBar.useSortedReactions;
        }
        return forumPostActionBar.m247copydB0bEw(str, forumPostActions, list, z10, str2, reactionsTheme, z11);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m246component13Eiw7ao() {
        return mo215getMessageId3Eiw7ao();
    }

    public final ForumPostActions component2() {
        return this.postActions;
    }

    public final List<MessageReaction> component3() {
        return this.reactions;
    }

    public final boolean component4() {
        return this.canAddNewReactions;
    }

    public final String component5() {
        return this.addNewReactionAccessibilityLabel;
    }

    public final ReactionsTheme component6() {
        return this.reactionsTheme;
    }

    public final boolean component7() {
        return this.useSortedReactions;
    }

    /* renamed from: copy-dB0-bEw  reason: not valid java name */
    public final ForumPostActionBar m247copydB0bEw(String messageId, ForumPostActions postActions, List<MessageReaction> list, boolean z10, String addNewReactionAccessibilityLabel, ReactionsTheme reactionsTheme, boolean z11) {
        q.g(messageId, "messageId");
        q.g(postActions, "postActions");
        q.g(addNewReactionAccessibilityLabel, "addNewReactionAccessibilityLabel");
        return new ForumPostActionBar(messageId, postActions, list, z10, addNewReactionAccessibilityLabel, reactionsTheme, z11, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForumPostActionBar)) {
            return false;
        }
        ForumPostActionBar forumPostActionBar = (ForumPostActionBar) obj;
        return MessageId.m593equalsimpl0(mo215getMessageId3Eiw7ao(), forumPostActionBar.mo215getMessageId3Eiw7ao()) && q.b(this.postActions, forumPostActionBar.postActions) && q.b(this.reactions, forumPostActionBar.reactions) && this.canAddNewReactions == forumPostActionBar.canAddNewReactions && q.b(this.addNewReactionAccessibilityLabel, forumPostActionBar.addNewReactionAccessibilityLabel) && q.b(this.reactionsTheme, forumPostActionBar.reactionsTheme) && this.useSortedReactions == forumPostActionBar.useSortedReactions;
    }

    public final String getAddNewReactionAccessibilityLabel() {
        return this.addNewReactionAccessibilityLabel;
    }

    public final boolean getCanAddNewReactions() {
        return this.canAddNewReactions;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo215getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final ForumPostActions getPostActions() {
        return this.postActions;
    }

    public final List<MessageReaction> getReactions() {
        return this.reactions;
    }

    public final ReactionsTheme getReactionsTheme() {
        return this.reactionsTheme;
    }

    public final boolean getUseSortedReactions() {
        return this.useSortedReactions;
    }

    public int hashCode() {
        int i10 = ((MessageId.m594hashCodeimpl(mo215getMessageId3Eiw7ao()) * 31) + this.postActions.hashCode()) * 31;
        List<MessageReaction> list = this.reactions;
        int i11 = 0;
        int hashCode = (i10 + (list == null ? 0 : list.hashCode())) * 31;
        boolean z10 = this.canAddNewReactions;
        int i12 = 1;
        if (z10) {
            z10 = true;
        }
        int i13 = z10 ? 1 : 0;
        int i14 = z10 ? 1 : 0;
        int i15 = z10 ? 1 : 0;
        int hashCode2 = (((hashCode + i13) * 31) + this.addNewReactionAccessibilityLabel.hashCode()) * 31;
        ReactionsTheme reactionsTheme = this.reactionsTheme;
        if (reactionsTheme != null) {
            i11 = reactionsTheme.hashCode();
        }
        int i16 = (hashCode2 + i11) * 31;
        boolean z11 = this.useSortedReactions;
        if (!z11) {
            i12 = z11 ? 1 : 0;
        }
        return i16 + i12;
    }

    public String toString() {
        String str = MessageId.m595toStringimpl(mo215getMessageId3Eiw7ao());
        ForumPostActions forumPostActions = this.postActions;
        List<MessageReaction> list = this.reactions;
        boolean z10 = this.canAddNewReactions;
        String str2 = this.addNewReactionAccessibilityLabel;
        ReactionsTheme reactionsTheme = this.reactionsTheme;
        boolean z11 = this.useSortedReactions;
        return "ForumPostActionBar(messageId=" + str + ", postActions=" + forumPostActions + ", reactions=" + list + ", canAddNewReactions=" + z10 + ", addNewReactionAccessibilityLabel=" + str2 + ", reactionsTheme=" + reactionsTheme + ", useSortedReactions=" + z11 + ")";
    }
}
