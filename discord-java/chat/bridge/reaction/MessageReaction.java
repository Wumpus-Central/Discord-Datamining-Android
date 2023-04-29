package com.discord.chat.bridge.reaction;

import bj.n1;
import com.discord.reactions.ReactionView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import yi.f;

@f
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000223BY\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003JG\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010%\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J!\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201HÇ\u0001R\u001c\u0010\n\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\r\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0019R\u001c\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0007\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00064"}, d2 = {"Lcom/discord/chat/bridge/reaction/MessageReaction;", "Lcom/discord/reactions/ReactionView$Reaction;", "seen1", "", "count", "me", "", "isMeBurst", "emoji", "Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;", "burstCount", "themedBurstColors", "Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;", "isMe", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIZZLcom/discord/chat/bridge/reaction/MessageReactionEmoji;ILcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(IZZLcom/discord/chat/bridge/reaction/MessageReactionEmoji;ILcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;)V", "getBurstCount$annotations", "()V", "getBurstCount", "()I", "getCount", "getEmoji", "()Lcom/discord/chat/bridge/reaction/MessageReactionEmoji;", "()Z", "isMeBurst$annotations", "getMe", "getThemedBurstColors", "()Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MessageReaction implements ReactionView.Reaction {
    public static final Companion Companion = new Companion(null);
    private final int burstCount;
    private final int count;
    private final MessageReactionEmoji emoji;
    private final boolean isMe;
    private final boolean isMeBurst;

    /* renamed from: me  reason: collision with root package name */
    private final boolean f7209me;
    private final ThemedBurstReactionColorPalette themedBurstColors;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/reaction/MessageReaction$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/reaction/MessageReaction;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MessageReaction> serializer() {
            return MessageReaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MessageReaction(int i10, int i11, boolean z10, boolean z11, MessageReactionEmoji messageReactionEmoji, int i12, ThemedBurstReactionColorPalette themedBurstReactionColorPalette, boolean z12, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i10 & 11)) {
            n1.b(i10, 11, MessageReaction$$serializer.INSTANCE.getDescriptor());
        }
        this.count = i11;
        this.f7209me = z10;
        if ((i10 & 4) == 0) {
            this.isMeBurst = false;
        } else {
            this.isMeBurst = z11;
        }
        this.emoji = messageReactionEmoji;
        if ((i10 & 16) == 0) {
            this.burstCount = 0;
        } else {
            this.burstCount = i12;
        }
        if ((i10 & 32) == 0) {
            this.themedBurstColors = null;
        } else {
            this.themedBurstColors = themedBurstReactionColorPalette;
        }
        if ((i10 & 64) == 0) {
            this.isMe = z10;
        } else {
            this.isMe = z12;
        }
    }

    public static /* synthetic */ MessageReaction copy$default(MessageReaction messageReaction, int i10, boolean z10, boolean z11, MessageReactionEmoji messageReactionEmoji, int i11, ThemedBurstReactionColorPalette themedBurstReactionColorPalette, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = messageReaction.getCount();
        }
        if ((i12 & 2) != 0) {
            z10 = messageReaction.f7209me;
        }
        if ((i12 & 4) != 0) {
            z11 = messageReaction.isMeBurst();
        }
        if ((i12 & 8) != 0) {
            messageReactionEmoji = messageReaction.getEmoji();
        }
        if ((i12 & 16) != 0) {
            i11 = messageReaction.getBurstCount();
        }
        if ((i12 & 32) != 0) {
            themedBurstReactionColorPalette = messageReaction.getThemedBurstColors();
        }
        return messageReaction.copy(i10, z10, z11, messageReactionEmoji, i11, themedBurstReactionColorPalette);
    }

    public static /* synthetic */ void getBurstCount$annotations() {
    }

    public static /* synthetic */ void isMeBurst$annotations() {
    }

    public static final void write$Self(MessageReaction self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        boolean z13 = false;
        output.x(serialDesc, 0, self.getCount());
        output.y(serialDesc, 1, self.f7209me);
        if (!output.A(serialDesc, 2) && !self.isMeBurst()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.y(serialDesc, 2, self.isMeBurst());
        }
        output.t(serialDesc, 3, MessageReactionEmoji$$serializer.INSTANCE, self.getEmoji());
        if (!output.A(serialDesc, 4) && self.getBurstCount() == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.x(serialDesc, 4, self.getBurstCount());
        }
        if (!output.A(serialDesc, 5) && self.getThemedBurstColors() == null) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            output.p(serialDesc, 5, ThemedBurstReactionColorPalette$$serializer.INSTANCE, self.getThemedBurstColors());
        }
        if (output.A(serialDesc, 6) || self.isMe() != self.f7209me) {
            z13 = true;
        }
        if (z13) {
            output.y(serialDesc, 6, self.isMe());
        }
    }

    public final int component1() {
        return getCount();
    }

    public final boolean component2() {
        return this.f7209me;
    }

    public final boolean component3() {
        return isMeBurst();
    }

    public final MessageReactionEmoji component4() {
        return getEmoji();
    }

    public final int component5() {
        return getBurstCount();
    }

    public final ThemedBurstReactionColorPalette component6() {
        return getThemedBurstColors();
    }

    public final MessageReaction copy(int i10, boolean z10, boolean z11, MessageReactionEmoji emoji, int i11, ThemedBurstReactionColorPalette themedBurstReactionColorPalette) {
        q.g(emoji, "emoji");
        return new MessageReaction(i10, z10, z11, emoji, i11, themedBurstReactionColorPalette);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageReaction)) {
            return false;
        }
        MessageReaction messageReaction = (MessageReaction) obj;
        return getCount() == messageReaction.getCount() && this.f7209me == messageReaction.f7209me && isMeBurst() == messageReaction.isMeBurst() && q.b(getEmoji(), messageReaction.getEmoji()) && getBurstCount() == messageReaction.getBurstCount() && q.b(getThemedBurstColors(), messageReaction.getThemedBurstColors());
    }

    @Override // com.discord.reactions.ReactionView.Reaction
    public int getBurstCount() {
        return this.burstCount;
    }

    @Override // com.discord.reactions.ReactionView.Reaction
    public int getCount() {
        return this.count;
    }

    @Override // com.discord.reactions.ReactionView.Reaction, com.discord.recycler_view.utils.ItemDiffableType
    public Long getItemId() {
        return ReactionView.Reaction.DefaultImpls.getItemId(this);
    }

    public final boolean getMe() {
        return this.f7209me;
    }

    public int hashCode() {
        int count = getCount() * 31;
        boolean z10 = this.f7209me;
        int i10 = 1;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        int i13 = z10 ? 1 : 0;
        int i14 = (count + i11) * 31;
        boolean isMeBurst = isMeBurst();
        if (!isMeBurst) {
            i10 = isMeBurst;
        }
        return ((((((i14 + i10) * 31) + getEmoji().hashCode()) * 31) + getBurstCount()) * 31) + (getThemedBurstColors() == null ? 0 : getThemedBurstColors().hashCode());
    }

    @Override // com.discord.reactions.ReactionView.Reaction
    public boolean isBurstReaction() {
        return ReactionView.Reaction.DefaultImpls.isBurstReaction(this);
    }

    @Override // com.discord.reactions.ReactionView.Reaction
    public boolean isMe() {
        return this.isMe;
    }

    @Override // com.discord.reactions.ReactionView.Reaction
    public boolean isMeBurst() {
        return this.isMeBurst;
    }

    public String toString() {
        int count = getCount();
        boolean z10 = this.f7209me;
        boolean isMeBurst = isMeBurst();
        MessageReactionEmoji emoji = getEmoji();
        int burstCount = getBurstCount();
        ThemedBurstReactionColorPalette themedBurstColors = getThemedBurstColors();
        return "MessageReaction(count=" + count + ", me=" + z10 + ", isMeBurst=" + isMeBurst + ", emoji=" + emoji + ", burstCount=" + burstCount + ", themedBurstColors=" + themedBurstColors + ")";
    }

    public MessageReaction(int i10, boolean z10, boolean z11, MessageReactionEmoji emoji, int i11, ThemedBurstReactionColorPalette themedBurstReactionColorPalette) {
        q.g(emoji, "emoji");
        this.count = i10;
        this.f7209me = z10;
        this.isMeBurst = z11;
        this.emoji = emoji;
        this.burstCount = i11;
        this.themedBurstColors = themedBurstReactionColorPalette;
        this.isMe = z10;
    }

    @Override // com.discord.reactions.ReactionView.Reaction
    public MessageReactionEmoji getEmoji() {
        return this.emoji;
    }

    @Override // com.discord.reactions.ReactionView.Reaction
    public ThemedBurstReactionColorPalette getThemedBurstColors() {
        return this.themedBurstColors;
    }

    public /* synthetic */ MessageReaction(int i10, boolean z10, boolean z11, MessageReactionEmoji messageReactionEmoji, int i11, ThemedBurstReactionColorPalette themedBurstReactionColorPalette, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z10, (i12 & 4) != 0 ? false : z11, messageReactionEmoji, (i12 & 16) != 0 ? 0 : i11, (i12 & 32) != 0 ? null : themedBurstReactionColorPalette);
    }
}
