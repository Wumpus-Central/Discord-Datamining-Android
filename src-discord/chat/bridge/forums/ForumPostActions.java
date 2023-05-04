package com.discord.chat.bridge.forums;

import bj.a2;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000245Be\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0013J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003Ja\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020\bHÖ\u0001J!\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203HÇ\u0001R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00066"}, d2 = {"Lcom/discord/chat/bridge/forums/ForumPostActions;", "", "seen1", "", "numDisplayedReactions", "isFollowing", "", "followIcon", "", "followLabel", "shareIcon", "shareLabel", "defaultReaction", "Lcom/discord/chat/bridge/reaction/MessageReaction;", "sharePrompt", "Lcom/discord/chat/bridge/forums/PostSharePrompt;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/MessageReaction;Lcom/discord/chat/bridge/forums/PostSharePrompt;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/MessageReaction;Lcom/discord/chat/bridge/forums/PostSharePrompt;)V", "getDefaultReaction", "()Lcom/discord/chat/bridge/reaction/MessageReaction;", "getFollowIcon", "()Ljava/lang/String;", "getFollowLabel", "()Z", "getNumDisplayedReactions", "()I", "getShareIcon", "getShareLabel", "getSharePrompt", "()Lcom/discord/chat/bridge/forums/PostSharePrompt;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
    private final PostSharePrompt sharePrompt;

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

    public /* synthetic */ ForumPostActions(int i10, int i11, boolean z10, String str, String str2, String str3, String str4, MessageReaction messageReaction, PostSharePrompt postSharePrompt, SerializationConstructorMarker serializationConstructorMarker) {
        if (43 != (i10 & 43)) {
            n1.b(i10, 43, ForumPostActions$$serializer.INSTANCE.getDescriptor());
        }
        this.numDisplayedReactions = i11;
        this.isFollowing = z10;
        if ((i10 & 4) == 0) {
            this.followIcon = null;
        } else {
            this.followIcon = str;
        }
        this.followLabel = str2;
        if ((i10 & 16) == 0) {
            this.shareIcon = null;
        } else {
            this.shareIcon = str3;
        }
        this.shareLabel = str4;
        if ((i10 & 64) == 0) {
            this.defaultReaction = null;
        } else {
            this.defaultReaction = messageReaction;
        }
        if ((i10 & 128) == 0) {
            this.sharePrompt = null;
        } else {
            this.sharePrompt = postSharePrompt;
        }
    }

    public static final void write$Self(ForumPostActions self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        boolean z13 = false;
        output.x(serialDesc, 0, self.numDisplayedReactions);
        output.y(serialDesc, 1, self.isFollowing);
        if (!output.A(serialDesc, 2) && self.followIcon == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.p(serialDesc, 2, a2.f5917a, self.followIcon);
        }
        output.z(serialDesc, 3, self.followLabel);
        if (!output.A(serialDesc, 4) && self.shareIcon == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.p(serialDesc, 4, a2.f5917a, self.shareIcon);
        }
        output.z(serialDesc, 5, self.shareLabel);
        if (!output.A(serialDesc, 6) && self.defaultReaction == null) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            output.p(serialDesc, 6, MessageReaction$$serializer.INSTANCE, self.defaultReaction);
        }
        if (output.A(serialDesc, 7) || self.sharePrompt != null) {
            z13 = true;
        }
        if (z13) {
            output.p(serialDesc, 7, PostSharePrompt$$serializer.INSTANCE, self.sharePrompt);
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

    public final PostSharePrompt component8() {
        return this.sharePrompt;
    }

    public final ForumPostActions copy(int i10, boolean z10, String str, String followLabel, String str2, String shareLabel, MessageReaction messageReaction, PostSharePrompt postSharePrompt) {
        q.g(followLabel, "followLabel");
        q.g(shareLabel, "shareLabel");
        return new ForumPostActions(i10, z10, str, followLabel, str2, shareLabel, messageReaction, postSharePrompt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForumPostActions)) {
            return false;
        }
        ForumPostActions forumPostActions = (ForumPostActions) obj;
        return this.numDisplayedReactions == forumPostActions.numDisplayedReactions && this.isFollowing == forumPostActions.isFollowing && q.b(this.followIcon, forumPostActions.followIcon) && q.b(this.followLabel, forumPostActions.followLabel) && q.b(this.shareIcon, forumPostActions.shareIcon) && q.b(this.shareLabel, forumPostActions.shareLabel) && q.b(this.defaultReaction, forumPostActions.defaultReaction) && q.b(this.sharePrompt, forumPostActions.sharePrompt);
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

    public final PostSharePrompt getSharePrompt() {
        return this.sharePrompt;
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
        int i14 = (i10 + i11) * 31;
        String str = this.followIcon;
        int i15 = 0;
        int hashCode = (((i14 + (str == null ? 0 : str.hashCode())) * 31) + this.followLabel.hashCode()) * 31;
        String str2 = this.shareIcon;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.shareLabel.hashCode()) * 31;
        MessageReaction messageReaction = this.defaultReaction;
        int hashCode3 = (hashCode2 + (messageReaction == null ? 0 : messageReaction.hashCode())) * 31;
        PostSharePrompt postSharePrompt = this.sharePrompt;
        if (postSharePrompt != null) {
            i15 = postSharePrompt.hashCode();
        }
        return hashCode3 + i15;
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
        PostSharePrompt postSharePrompt = this.sharePrompt;
        return "ForumPostActions(numDisplayedReactions=" + i10 + ", isFollowing=" + z10 + ", followIcon=" + str + ", followLabel=" + str2 + ", shareIcon=" + str3 + ", shareLabel=" + str4 + ", defaultReaction=" + messageReaction + ", sharePrompt=" + postSharePrompt + ")";
    }

    public ForumPostActions(int i10, boolean z10, String str, String followLabel, String str2, String shareLabel, MessageReaction messageReaction, PostSharePrompt postSharePrompt) {
        q.g(followLabel, "followLabel");
        q.g(shareLabel, "shareLabel");
        this.numDisplayedReactions = i10;
        this.isFollowing = z10;
        this.followIcon = str;
        this.followLabel = followLabel;
        this.shareIcon = str2;
        this.shareLabel = shareLabel;
        this.defaultReaction = messageReaction;
        this.sharePrompt = postSharePrompt;
    }

    public /* synthetic */ ForumPostActions(int i10, boolean z10, String str, String str2, String str3, String str4, MessageReaction messageReaction, PostSharePrompt postSharePrompt, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z10, (i11 & 4) != 0 ? null : str, str2, (i11 & 16) != 0 ? null : str3, str4, (i11 & 64) != 0 ? null : messageReaction, (i11 & 128) != 0 ? null : postSharePrompt);
    }
}
