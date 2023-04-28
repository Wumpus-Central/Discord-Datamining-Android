package com.discord.chat.bridge.forums;

import bj.C2560n1;
import com.discord.chat.bridge.reaction.MessageReaction;
import com.discord.chat.bridge.reaction.MessageReaction$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p450yi.AbstractC14370f;

@AbstractC14370f
@Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002/0B[\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0011J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003JQ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\bHÖ\u0001J!\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.HÇ\u0001R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015¨\u00061"}, m15073d2 = {"Lcom/discord/chat/bridge/forums/ForumPostActions;", "", "seen1", "", "numDisplayedReactions", "isFollowing", "", "followIcon", "", "followLabel", "shareIcon", "shareLabel", "defaultReaction", "Lcom/discord/chat/bridge/reaction/MessageReaction;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/MessageReaction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/MessageReaction;)V", "getDefaultReaction", "()Lcom/discord/chat/bridge/reaction/MessageReaction;", "getFollowIcon", "()Ljava/lang/String;", "getFollowLabel", "()Z", "getNumDisplayedReactions", "()I", "getShareIcon", "getShareLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class ForumPostActions {
    public static final Companion Companion = new Companion(null);
    private final MessageReaction defaultReaction;
    private final String followIcon;
    private final String followLabel;
    private final boolean isFollowing;
    private final int numDisplayedReactions;
    private final String shareIcon;
    private final String shareLabel;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/bridge/forums/ForumPostActions$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/forums/ForumPostActions;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ForumPostActions> serializer() {
            return ForumPostActions$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ForumPostActions(int i, int i2, boolean z, String str, String str2, String str3, String str4, MessageReaction messageReaction, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            C2560n1.m33818b(i, 63, ForumPostActions$$serializer.INSTANCE.getDescriptor());
        }
        this.numDisplayedReactions = i2;
        this.isFollowing = z;
        this.followIcon = str;
        this.followLabel = str2;
        this.shareIcon = str3;
        this.shareLabel = str4;
        if ((i & 64) == 0) {
            this.defaultReaction = null;
        } else {
            this.defaultReaction = messageReaction;
        }
    }

    public static /* synthetic */ ForumPostActions copy$default(ForumPostActions forumPostActions, int i, boolean z, String str, String str2, String str3, String str4, MessageReaction messageReaction, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = forumPostActions.numDisplayedReactions;
        }
        if ((i2 & 2) != 0) {
            z = forumPostActions.isFollowing;
        }
        if ((i2 & 4) != 0) {
            str = forumPostActions.followIcon;
        }
        if ((i2 & 8) != 0) {
            str2 = forumPostActions.followLabel;
        }
        if ((i2 & 16) != 0) {
            str3 = forumPostActions.shareIcon;
        }
        if ((i2 & 32) != 0) {
            str4 = forumPostActions.shareLabel;
        }
        if ((i2 & 64) != 0) {
            messageReaction = forumPostActions.defaultReaction;
        }
        return forumPostActions.copy(i, z, str, str2, str3, str4, messageReaction);
    }

    public static final void write$Self(ForumPostActions self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9677q.m14633g(self, "self");
        C9677q.m14633g(output, "output");
        C9677q.m14633g(serialDesc, "serialDesc");
        boolean z = false;
        output.mo13866x(serialDesc, 0, self.numDisplayedReactions);
        output.mo13865y(serialDesc, 1, self.isFollowing);
        output.mo13864z(serialDesc, 2, self.followIcon);
        output.mo13864z(serialDesc, 3, self.followLabel);
        output.mo13864z(serialDesc, 4, self.shareIcon);
        output.mo13864z(serialDesc, 5, self.shareLabel);
        if (output.mo13893A(serialDesc, 6) || self.defaultReaction != null) {
            z = true;
        }
        if (z) {
            output.mo13874p(serialDesc, 6, MessageReaction$$serializer.INSTANCE, self.defaultReaction);
        }
    }

    public final int component1() {
        return this.numDisplayedReactions;
    }

    public final boolean component2() {
        return this.isFollowing;
    }

    public final String component3() {
        return this.followIcon;
    }

    public final String component4() {
        return this.followLabel;
    }

    public final String component5() {
        return this.shareIcon;
    }

    public final String component6() {
        return this.shareLabel;
    }

    public final MessageReaction component7() {
        return this.defaultReaction;
    }

    public final ForumPostActions copy(int i, boolean z, String followIcon, String followLabel, String shareIcon, String shareLabel, MessageReaction messageReaction) {
        C9677q.m14633g(followIcon, "followIcon");
        C9677q.m14633g(followLabel, "followLabel");
        C9677q.m14633g(shareIcon, "shareIcon");
        C9677q.m14633g(shareLabel, "shareLabel");
        return new ForumPostActions(i, z, followIcon, followLabel, shareIcon, shareLabel, messageReaction);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForumPostActions)) {
            return false;
        }
        ForumPostActions forumPostActions = (ForumPostActions) obj;
        return this.numDisplayedReactions == forumPostActions.numDisplayedReactions && this.isFollowing == forumPostActions.isFollowing && C9677q.m14638b(this.followIcon, forumPostActions.followIcon) && C9677q.m14638b(this.followLabel, forumPostActions.followLabel) && C9677q.m14638b(this.shareIcon, forumPostActions.shareIcon) && C9677q.m14638b(this.shareLabel, forumPostActions.shareLabel) && C9677q.m14638b(this.defaultReaction, forumPostActions.defaultReaction);
    }

    public final MessageReaction getDefaultReaction() {
        return this.defaultReaction;
    }

    public final String getFollowIcon() {
        return this.followIcon;
    }

    public final String getFollowLabel() {
        return this.followLabel;
    }

    public final int getNumDisplayedReactions() {
        return this.numDisplayedReactions;
    }

    public final String getShareIcon() {
        return this.shareIcon;
    }

    public final String getShareLabel() {
        return this.shareLabel;
    }

    public int hashCode() {
        int i = this.numDisplayedReactions * 31;
        boolean z = this.isFollowing;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int hashCode = (((((((((i + i2) * 31) + this.followIcon.hashCode()) * 31) + this.followLabel.hashCode()) * 31) + this.shareIcon.hashCode()) * 31) + this.shareLabel.hashCode()) * 31;
        MessageReaction messageReaction = this.defaultReaction;
        return hashCode + (messageReaction == null ? 0 : messageReaction.hashCode());
    }

    public final boolean isFollowing() {
        return this.isFollowing;
    }

    public String toString() {
        int i = this.numDisplayedReactions;
        boolean z = this.isFollowing;
        String str = this.followIcon;
        String str2 = this.followLabel;
        String str3 = this.shareIcon;
        String str4 = this.shareLabel;
        MessageReaction messageReaction = this.defaultReaction;
        return "ForumPostActions(numDisplayedReactions=" + i + ", isFollowing=" + z + ", followIcon=" + str + ", followLabel=" + str2 + ", shareIcon=" + str3 + ", shareLabel=" + str4 + ", defaultReaction=" + messageReaction + ")";
    }

    public ForumPostActions(int i, boolean z, String followIcon, String followLabel, String shareIcon, String shareLabel, MessageReaction messageReaction) {
        C9677q.m14633g(followIcon, "followIcon");
        C9677q.m14633g(followLabel, "followLabel");
        C9677q.m14633g(shareIcon, "shareIcon");
        C9677q.m14633g(shareLabel, "shareLabel");
        this.numDisplayedReactions = i;
        this.isFollowing = z;
        this.followIcon = followIcon;
        this.followLabel = followLabel;
        this.shareIcon = shareIcon;
        this.shareLabel = shareLabel;
        this.defaultReaction = messageReaction;
    }

    public /* synthetic */ ForumPostActions(int i, boolean z, String str, String str2, String str3, String str4, MessageReaction messageReaction, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, str, str2, str3, str4, (i2 & 64) != 0 ? null : messageReaction);
    }
}
