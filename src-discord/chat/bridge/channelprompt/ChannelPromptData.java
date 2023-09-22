package com.discord.chat.bridge.channelprompt;

import cj.a2;
import cj.n1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import zi.f;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$BA\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB5\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÇ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006%"}, d2 = {"Lcom/discord/chat/bridge/channelprompt/ChannelPromptData;", "", "seen1", "", "cameraButtonIcon", "", "gifButtonIcon", "emojiButtonIcon", "gamingStatsButtonText", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCameraButtonIcon", "()Ljava/lang/String;", "getEmojiButtonIcon", "getGamingStatsButtonText", "getGifButtonIcon", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f

public final class ChannelPromptData {
    public static final Companion Companion = new Companion(null);
    private final String cameraButtonIcon;
    private final String emojiButtonIcon;
    private final String gamingStatsButtonText;
    private final String gifButtonIcon;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/channelprompt/ChannelPromptData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/channelprompt/ChannelPromptData;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChannelPromptData> serializer() {
            return ChannelPromptData$$serializer.INSTANCE;
        }
    }

    public ChannelPromptData() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public  ChannelPromptData(int i10, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 0) != 0) {
            n1.b(i10, 0, ChannelPromptData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.cameraButtonIcon = null;
        } else {
            this.cameraButtonIcon = str;
        }
        if ((i10 & 2) == 0) {
            this.gifButtonIcon = null;
        } else {
            this.gifButtonIcon = str2;
        }
        if ((i10 & 4) == 0) {
            this.emojiButtonIcon = null;
        } else {
            this.emojiButtonIcon = str3;
        }
        if ((i10 & 8) == 0) {
            this.gamingStatsButtonText = null;
        } else {
            this.gamingStatsButtonText = str4;
        }
    }

    public static  ChannelPromptData copy$default(ChannelPromptData channelPromptData, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = channelPromptData.cameraButtonIcon;
        }
        if ((i10 & 2) != 0) {
            str2 = channelPromptData.gifButtonIcon;
        }
        if ((i10 & 4) != 0) {
            str3 = channelPromptData.emojiButtonIcon;
        }
        if ((i10 & 8) != 0) {
            str4 = channelPromptData.gamingStatsButtonText;
        }
        return channelPromptData.copy(str, str2, str3, str4);
    }

    public static final void write$Self(ChannelPromptData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        boolean z13 = false;
        if (!output.z(serialDesc, 0) && self.cameraButtonIcon == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.E(serialDesc, 0, a2.f6238a, self.cameraButtonIcon);
        }
        if (!output.z(serialDesc, 1) && self.gifButtonIcon == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.E(serialDesc, 1, a2.f6238a, self.gifButtonIcon);
        }
        if (!output.z(serialDesc, 2) && self.emojiButtonIcon == null) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            output.E(serialDesc, 2, a2.f6238a, self.emojiButtonIcon);
        }
        if (output.z(serialDesc, 3) || self.gamingStatsButtonText != null) {
            z13 = true;
        }
        if (z13) {
            output.E(serialDesc, 3, a2.f6238a, self.gamingStatsButtonText);
        }
    }

    public final String component1() {
        return this.cameraButtonIcon;
    }

    public final String component2() {
        return this.gifButtonIcon;
    }

    public final String component3() {
        return this.emojiButtonIcon;
    }

    public final String component4() {
        return this.gamingStatsButtonText;
    }

    public final ChannelPromptData copy(String str, String str2, String str3, String str4) {
        return new ChannelPromptData(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelPromptData)) {
            return false;
        }
        ChannelPromptData channelPromptData = (ChannelPromptData) obj;
        return q.c(this.cameraButtonIcon, channelPromptData.cameraButtonIcon) && q.c(this.gifButtonIcon, channelPromptData.gifButtonIcon) && q.c(this.emojiButtonIcon, channelPromptData.emojiButtonIcon) && q.c(this.gamingStatsButtonText, channelPromptData.gamingStatsButtonText);
    }

    public final String getCameraButtonIcon() {
        return this.cameraButtonIcon;
    }

    public final String getEmojiButtonIcon() {
        return this.emojiButtonIcon;
    }

    public final String getGamingStatsButtonText() {
        return this.gamingStatsButtonText;
    }

    public final String getGifButtonIcon() {
        return this.gifButtonIcon;
    }

    public int hashCode() {
        String str = this.cameraButtonIcon;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.gifButtonIcon;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.emojiButtonIcon;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.gamingStatsButtonText;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.cameraButtonIcon;
        String str2 = this.gifButtonIcon;
        String str3 = this.emojiButtonIcon;
        String str4 = this.gamingStatsButtonText;
        return "ChannelPromptData(cameraButtonIcon=" + str + ", gifButtonIcon=" + str2 + ", emojiButtonIcon=" + str3 + ", gamingStatsButtonText=" + str4 + ")";
    }

    public ChannelPromptData(String str, String str2, String str3, String str4) {
        this.cameraButtonIcon = str;
        this.gifButtonIcon = str2;
        this.emojiButtonIcon = str3;
        this.gamingStatsButtonText = str4;
    }

    public  ChannelPromptData(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
    }
}
