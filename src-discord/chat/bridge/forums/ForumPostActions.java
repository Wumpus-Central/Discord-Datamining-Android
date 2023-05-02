package com.discord.chat.bridge.forums;

import bj.n1;
import com.discord.chat.bridge.reaction.MessageReaction;
import com.discord.chat.bridge.reaction.MessageReaction$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import yi.f;

@f
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002/0B[\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0011J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003JQ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\bHÖ\u0001J!\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.HÇ\u0001R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015¨\u00061"}, d2 = {"Lcom/discord/chat/bridge/forums/ForumPostActions;", "", "seen1", "", "numDisplayedReactions", "isFollowing", "", "followIcon", "", "followLabel", "shareIcon", "shareLabel", "defaultReaction", "Lcom/discord/chat/bridge/reaction/MessageReaction;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/MessageReaction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/MessageReaction;)V", "getDefaultReaction", "()Lcom/discord/chat/bridge/reaction/MessageReaction;", "getFollowIcon", "()Ljava/lang/String;", "getFollowLabel", "()Z", "getNumDisplayedReactions", "()I", "getShareIcon", "getShareLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/forums/ForumPostActions$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/forums/ForumPostActions;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

    public /* synthetic */ ForumPostActions(int i10, int i11, boolean z10, String str, String str2, String str3, String str4, MessageReaction messageReaction, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i10 & 63)) {
            n1.b(i10, 63, ForumPostActions$$serializer.INSTANCE.getDescriptor());
        }
        this.numDisplayedReactions = i11;
        this.isFollowing = z10;
        this.followIcon = str;
        this.followLabel = str2;
        this.shareIcon = str3;
        this.shareLabel = str4;
        if ((i10 & 64) == 0) {
            this.defaultReaction = null;
        } else {
            this.defaultReaction = messageReaction;
        }
    }

    public static /* synthetic */ ForumPostActions copy$default(ForumPostActions forumPostActions, int i10, boolean z10, String str, String str2, String str3, String str4, MessageReaction messageReaction, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = forumPostActions.numDisplayedReactions;
        }
        if ((i11 & 2) != 0) {
            z10 = forumPostActions.isFollowing;
        }
        if ((i11 & 4) != 0) {
            str = forumPostActions.followIcon;
        }
        if ((i11 & 8) != 0) {
            str2 = forumPostActions.followLabel;
        }
        if ((i11 & 16) != 0) {
            str3 = forumPostActions.shareIcon;
        }
        if ((i11 & 32) != 0) {
            str4 = forumPostActions.shareLabel;
        }
        if ((i11 & 64) != 0) {
            messageReaction = forumPostActions.defaultReaction;
        }
        return forumPostActions.copy(i10, z10, str, str2, str3, str4, messageReaction);
    }

    public static final void write$Self(ForumPostActions self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        boolean z10 = false;
        output.x(serialDesc, 0, self.numDisplayedReactions);
        output.y(serialDesc, 1, self.isFollowing);
        output.z(serialDesc, 2, self.followIcon);
        output.z(serialDesc, 3, self.followLabel);
        output.z(serialDesc, 4, self.shareIcon);
        output.z(serialDesc, 5, self.shareLabel);
        if (output.A(serialDesc, 6) || self.defaultReaction != null) {
            z10 = true;
        }
        if (z10) {
            output.p(serialDesc, 6, MessageReaction$$serializer.INSTANCE, self.defaultReaction);
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

    public final ForumPostActions copy(int i10, boolean z10, String followIcon, String followLabel, String shareIcon, String shareLabel, MessageReaction messageReaction) {
        q.g(followIcon, "followIcon");
        q.g(followLabel, "followLabel");
        q.g(shareIcon, "shareIcon");
        q.g(shareLabel, "shareLabel");
        return new ForumPostActions(i10, z10, followIcon, followLabel, shareIcon, shareLabel, messageReaction);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForumPostActions)) {
            return false;
        }
        ForumPostActions forumPostActions = (ForumPostActions) obj;
        return this.numDisplayedReactions == forumPostActions.numDisplayedReactions && this.isFollowing == forumPostActions.isFollowing && q.b(this.followIcon, forumPostActions.followIcon) && q.b(this.followLabel, forumPostActions.followLabel) && q.b(this.shareIcon, forumPostActions.shareIcon) && q.b(this.shareLabel, forumPostActions.shareLabel) && q.b(this.defaultReaction, forumPostActions.defaultReaction);
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
        int i10 = this.numDisplayedReactions * 31;
        boolean z10 = this.isFollowing;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        int i13 = z10 ? 1 : 0;
        int hashCode = (((((((((i10 + i11) * 31) + this.followIcon.hashCode()) * 31) + this.followLabel.hashCode()) * 31) + this.shareIcon.hashCode()) * 31) + this.shareLabel.hashCode()) * 31;
        MessageReaction messageReaction = this.defaultReaction;
        return hashCode + (messageReaction == null ? 0 : messageReaction.hashCode());
    }

    public final boolean isFollowing() {
        return this.isFollowing;
    }

    public String toString() {
        int i10 = this.numDisplayedReactions;
        boolean z10 = this.isFollowing;
        String str = this.followIcon;
        String str2 = this.followLabel;
        String str3 = this.shareIcon;
        String str4 = this.shareLabel;
        MessageReaction messageReaction = this.defaultReaction;
        return "ForumPostActions(numDisplayedReactions=" + i10 + ", isFollowing=" + z10 + ", followIcon=" + str + ", followLabel=" + str2 + ", shareIcon=" + str3 + ", shareLabel=" + str4 + ", defaultReaction=" + messageReaction + ")";
    }

    public ForumPostActions(int i10, boolean z10, String followIcon, String followLabel, String shareIcon, String shareLabel, MessageReaction messageReaction) {
        q.g(followIcon, "followIcon");
        q.g(followLabel, "followLabel");
        q.g(shareIcon, "shareIcon");
        q.g(shareLabel, "shareLabel");
        this.numDisplayedReactions = i10;
        this.isFollowing = z10;
        this.followIcon = followIcon;
        this.followLabel = followLabel;
        this.shareIcon = shareIcon;
        this.shareLabel = shareLabel;
        this.defaultReaction = messageReaction;
    }

    public /* synthetic */ ForumPostActions(int i10, boolean z10, String str, String str2, String str3, String str4, MessageReaction messageReaction, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z10, str, str2, str3, str4, (i11 & 64) != 0 ? null : messageReaction);
    }
}
