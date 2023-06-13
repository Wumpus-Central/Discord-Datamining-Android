package com.discord.chat.bridge.reaction;

import com.discord.reactions.ReactionView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import vj.f;
import yj.m0;
import yj.n1;

@f
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-BU\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fBM\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJV\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J!\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+HÇ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0014\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0015\u0010\u000f¨\u0006."}, d2 = {"Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "Lcom/discord/reactions/ReactionView$ReactionsTheme;", "seen1", "", "reactionBackgroundColor", "reactionBorderColor", "reactionTextColor", "activeReactionBackgroundColor", "activeReactionBorderColor", "activeReactionTextColor", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getActiveReactionBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getActiveReactionBorderColor", "getActiveReactionTextColor", "getReactionBackgroundColor", "getReactionBorderColor", "getReactionTextColor", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ReactionsTheme implements ReactionView.ReactionsTheme {
    public static final Companion Companion = new Companion(null);
    private final Integer activeReactionBackgroundColor;
    private final Integer activeReactionBorderColor;
    private final Integer activeReactionTextColor;
    private final Integer reactionBackgroundColor;
    private final Integer reactionBorderColor;
    private final Integer reactionTextColor;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/reaction/ReactionsTheme$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ReactionsTheme> serializer() {
            return ReactionsTheme$$serializer.INSTANCE;
        }
    }

    public ReactionsTheme() {
        this((Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 63, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ReactionsTheme(int i10, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 0) != 0) {
            n1.b(i10, 0, ReactionsTheme$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.reactionBackgroundColor = null;
        } else {
            this.reactionBackgroundColor = num;
        }
        if ((i10 & 2) == 0) {
            this.reactionBorderColor = null;
        } else {
            this.reactionBorderColor = num2;
        }
        if ((i10 & 4) == 0) {
            this.reactionTextColor = null;
        } else {
            this.reactionTextColor = num3;
        }
        if ((i10 & 8) == 0) {
            this.activeReactionBackgroundColor = null;
        } else {
            this.activeReactionBackgroundColor = num4;
        }
        if ((i10 & 16) == 0) {
            this.activeReactionBorderColor = null;
        } else {
            this.activeReactionBorderColor = num5;
        }
        if ((i10 & 32) == 0) {
            this.activeReactionTextColor = null;
        } else {
            this.activeReactionTextColor = num6;
        }
    }

    public static /* synthetic */ ReactionsTheme copy$default(ReactionsTheme reactionsTheme, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = reactionsTheme.getReactionBackgroundColor();
        }
        if ((i10 & 2) != 0) {
            num2 = reactionsTheme.getReactionBorderColor();
        }
        if ((i10 & 4) != 0) {
            num3 = reactionsTheme.getReactionTextColor();
        }
        if ((i10 & 8) != 0) {
            num4 = reactionsTheme.getActiveReactionBackgroundColor();
        }
        if ((i10 & 16) != 0) {
            num5 = reactionsTheme.getActiveReactionBorderColor();
        }
        if ((i10 & 32) != 0) {
            num6 = reactionsTheme.getActiveReactionTextColor();
        }
        return reactionsTheme.copy(num, num2, num3, num4, num5, num6);
    }

    public static final void write$Self(ReactionsTheme self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        boolean z15 = false;
        if (!output.A(serialDesc, 0) && self.getReactionBackgroundColor() == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.u(serialDesc, 0, m0.f33000a, self.getReactionBackgroundColor());
        }
        if (!output.A(serialDesc, 1) && self.getReactionBorderColor() == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.u(serialDesc, 1, m0.f33000a, self.getReactionBorderColor());
        }
        if (!output.A(serialDesc, 2) && self.getReactionTextColor() == null) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            output.u(serialDesc, 2, m0.f33000a, self.getReactionTextColor());
        }
        if (!output.A(serialDesc, 3) && self.getActiveReactionBackgroundColor() == null) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z13) {
            output.u(serialDesc, 3, m0.f33000a, self.getActiveReactionBackgroundColor());
        }
        if (!output.A(serialDesc, 4) && self.getActiveReactionBorderColor() == null) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z14) {
            output.u(serialDesc, 4, m0.f33000a, self.getActiveReactionBorderColor());
        }
        if (output.A(serialDesc, 5) || self.getActiveReactionTextColor() != null) {
            z15 = true;
        }
        if (z15) {
            output.u(serialDesc, 5, m0.f33000a, self.getActiveReactionTextColor());
        }
    }

    public final Integer component1() {
        return getReactionBackgroundColor();
    }

    public final Integer component2() {
        return getReactionBorderColor();
    }

    public final Integer component3() {
        return getReactionTextColor();
    }

    public final Integer component4() {
        return getActiveReactionBackgroundColor();
    }

    public final Integer component5() {
        return getActiveReactionBorderColor();
    }

    public final Integer component6() {
        return getActiveReactionTextColor();
    }

    public final ReactionsTheme copy(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        return new ReactionsTheme(num, num2, num3, num4, num5, num6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactionsTheme)) {
            return false;
        }
        ReactionsTheme reactionsTheme = (ReactionsTheme) obj;
        return q.b(getReactionBackgroundColor(), reactionsTheme.getReactionBackgroundColor()) && q.b(getReactionBorderColor(), reactionsTheme.getReactionBorderColor()) && q.b(getReactionTextColor(), reactionsTheme.getReactionTextColor()) && q.b(getActiveReactionBackgroundColor(), reactionsTheme.getActiveReactionBackgroundColor()) && q.b(getActiveReactionBorderColor(), reactionsTheme.getActiveReactionBorderColor()) && q.b(getActiveReactionTextColor(), reactionsTheme.getActiveReactionTextColor());
    }

    @Override // com.discord.reactions.ReactionView.ReactionsTheme
    public Integer getActiveReactionBackgroundColor() {
        return this.activeReactionBackgroundColor;
    }

    @Override // com.discord.reactions.ReactionView.ReactionsTheme
    public Integer getActiveReactionBorderColor() {
        return this.activeReactionBorderColor;
    }

    @Override // com.discord.reactions.ReactionView.ReactionsTheme
    public Integer getActiveReactionTextColor() {
        return this.activeReactionTextColor;
    }

    @Override // com.discord.reactions.ReactionView.ReactionsTheme
    public Integer getReactionBackgroundColor() {
        return this.reactionBackgroundColor;
    }

    @Override // com.discord.reactions.ReactionView.ReactionsTheme
    public Integer getReactionBorderColor() {
        return this.reactionBorderColor;
    }

    @Override // com.discord.reactions.ReactionView.ReactionsTheme
    public Integer getReactionTextColor() {
        return this.reactionTextColor;
    }

    public int hashCode() {
        int i10 = 0;
        int hashCode = (((((((((getReactionBackgroundColor() == null ? 0 : getReactionBackgroundColor().hashCode()) * 31) + (getReactionBorderColor() == null ? 0 : getReactionBorderColor().hashCode())) * 31) + (getReactionTextColor() == null ? 0 : getReactionTextColor().hashCode())) * 31) + (getActiveReactionBackgroundColor() == null ? 0 : getActiveReactionBackgroundColor().hashCode())) * 31) + (getActiveReactionBorderColor() == null ? 0 : getActiveReactionBorderColor().hashCode())) * 31;
        if (getActiveReactionTextColor() != null) {
            i10 = getActiveReactionTextColor().hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        Integer reactionBackgroundColor = getReactionBackgroundColor();
        Integer reactionBorderColor = getReactionBorderColor();
        Integer reactionTextColor = getReactionTextColor();
        Integer activeReactionBackgroundColor = getActiveReactionBackgroundColor();
        Integer activeReactionBorderColor = getActiveReactionBorderColor();
        Integer activeReactionTextColor = getActiveReactionTextColor();
        return "ReactionsTheme(reactionBackgroundColor=" + reactionBackgroundColor + ", reactionBorderColor=" + reactionBorderColor + ", reactionTextColor=" + reactionTextColor + ", activeReactionBackgroundColor=" + activeReactionBackgroundColor + ", activeReactionBorderColor=" + activeReactionBorderColor + ", activeReactionTextColor=" + activeReactionTextColor + ")";
    }

    public ReactionsTheme(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.reactionBackgroundColor = num;
        this.reactionBorderColor = num2;
        this.reactionTextColor = num3;
        this.activeReactionBackgroundColor = num4;
        this.activeReactionBorderColor = num5;
        this.activeReactionTextColor = num6;
    }

    public /* synthetic */ ReactionsTheme(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : num3, (i10 & 8) != 0 ? null : num4, (i10 & 16) != 0 ? null : num5, (i10 & 32) != 0 ? null : num6);
    }
}
