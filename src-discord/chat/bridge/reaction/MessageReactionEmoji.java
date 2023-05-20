package com.discord.chat.bridge.reaction;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.emoji.RenderableEmoji;
import com.discord.reactions.ReactionView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import uj.f;
import xj.a2;
import xj.h;
import xj.n1;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002*+BK\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB9\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0010JF\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J!\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)HÇ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006,"}, d2 = {"Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;", "Lcom/discord/reactions/ReactionView$Emoji;", "seen1", "", ZeroconfModule.KEY_SERVICE_NAME, "", "src", "displayName", "id", "animated", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAnimated", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDisplayName", "()Ljava/lang/String;", "getId", "getName", "getSrc", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
/* loaded from: classes5.dex */
public final class MessageReactionEmoji implements ReactionView.Emoji {
    public static final Companion Companion = new Companion(null);
    private final Boolean animated;
    private final String displayName;

    /* renamed from: id  reason: collision with root package name */
    private final String f7701id;
    private final String name;
    private final String src;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/reaction/MessageReactionEmoji$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MessageReactionEmoji> serializer() {
            return MessageReactionEmoji$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MessageReactionEmoji(int i10, String str, String str2, String str3, String str4, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (6 != (i10 & 6)) {
            n1.b(i10, 6, MessageReactionEmoji$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        this.src = str2;
        this.displayName = str3;
        if ((i10 & 8) == 0) {
            this.f7701id = null;
        } else {
            this.f7701id = str4;
        }
        if ((i10 & 16) == 0) {
            this.animated = null;
        } else {
            this.animated = bool;
        }
    }

    public static /* synthetic */ MessageReactionEmoji copy$default(MessageReactionEmoji messageReactionEmoji, String str, String str2, String str3, String str4, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = messageReactionEmoji.getName();
        }
        if ((i10 & 2) != 0) {
            str2 = messageReactionEmoji.getSrc();
        }
        if ((i10 & 4) != 0) {
            str3 = messageReactionEmoji.getDisplayName();
        }
        if ((i10 & 8) != 0) {
            str4 = messageReactionEmoji.getId();
        }
        if ((i10 & 16) != 0) {
            bool = messageReactionEmoji.getAnimated();
        }
        return messageReactionEmoji.copy(str, str2, str3, str4, bool);
    }

    public static final void write$Self(MessageReactionEmoji self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        boolean z12 = false;
        if (!output.A(serialDesc, 0) && self.getName() == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.h(serialDesc, 0, a2.f32309a, self.getName());
        }
        output.y(serialDesc, 1, self.getSrc());
        output.y(serialDesc, 2, self.getDisplayName());
        if (!output.A(serialDesc, 3) && self.getId() == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.h(serialDesc, 3, a2.f32309a, self.getId());
        }
        if (output.A(serialDesc, 4) || self.getAnimated() != null) {
            z12 = true;
        }
        if (z12) {
            output.h(serialDesc, 4, h.f32351a, self.getAnimated());
        }
    }

    public final String component1() {
        return getName();
    }

    public final String component2() {
        return getSrc();
    }

    public final String component3() {
        return getDisplayName();
    }

    public final String component4() {
        return getId();
    }

    public final Boolean component5() {
        return getAnimated();
    }

    public final MessageReactionEmoji copy(String str, String src, String displayName, String str2, Boolean bool) {
        q.g(src, "src");
        q.g(displayName, "displayName");
        return new MessageReactionEmoji(str, src, displayName, str2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageReactionEmoji)) {
            return false;
        }
        MessageReactionEmoji messageReactionEmoji = (MessageReactionEmoji) obj;
        return q.b(getName(), messageReactionEmoji.getName()) && q.b(getSrc(), messageReactionEmoji.getSrc()) && q.b(getDisplayName(), messageReactionEmoji.getDisplayName()) && q.b(getId(), messageReactionEmoji.getId()) && q.b(getAnimated(), messageReactionEmoji.getAnimated());
    }

    @Override // com.discord.reactions.ReactionView.Emoji
    public Boolean getAnimated() {
        return this.animated;
    }

    @Override // com.discord.reactions.ReactionView.Emoji
    public String getDisplayName() {
        return this.displayName;
    }

    @Override // com.discord.reactions.ReactionView.Emoji
    public String getEmojiId() {
        return ReactionView.Emoji.DefaultImpls.getEmojiId(this);
    }

    @Override // com.discord.reactions.ReactionView.Emoji
    public String getId() {
        return this.f7701id;
    }

    @Override // com.discord.reactions.ReactionView.Emoji
    public String getName() {
        return this.name;
    }

    @Override // com.discord.reactions.ReactionView.Emoji
    public boolean getShouldAnimate() {
        return ReactionView.Emoji.DefaultImpls.getShouldAnimate(this);
    }

    @Override // com.discord.reactions.ReactionView.Emoji
    public String getSrc() {
        return this.src;
    }

    public int hashCode() {
        int i10 = 0;
        int hashCode = (((((((getName() == null ? 0 : getName().hashCode()) * 31) + getSrc().hashCode()) * 31) + getDisplayName().hashCode()) * 31) + (getId() == null ? 0 : getId().hashCode())) * 31;
        if (getAnimated() != null) {
            i10 = getAnimated().hashCode();
        }
        return hashCode + i10;
    }

    @Override // com.discord.reactions.ReactionView.Emoji
    public RenderableEmoji renderable() {
        return ReactionView.Emoji.DefaultImpls.renderable(this);
    }

    public String toString() {
        String name = getName();
        String src = getSrc();
        String displayName = getDisplayName();
        String id2 = getId();
        Boolean animated = getAnimated();
        return "MessageReactionEmoji(name=" + name + ", src=" + src + ", displayName=" + displayName + ", id=" + id2 + ", animated=" + animated + ")";
    }

    public MessageReactionEmoji(String str, String src, String displayName, String str2, Boolean bool) {
        q.g(src, "src");
        q.g(displayName, "displayName");
        this.name = str;
        this.src = src;
        this.displayName = displayName;
        this.f7701id = str2;
        this.animated = bool;
    }

    public /* synthetic */ MessageReactionEmoji(String str, String str2, String str3, String str4, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, str2, str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : bool);
    }
}
