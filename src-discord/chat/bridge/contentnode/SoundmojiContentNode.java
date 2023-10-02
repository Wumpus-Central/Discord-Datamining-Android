package com.discord.chat.bridge.contentnode;

import cj.a2;
import cj.n1;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import zi.f;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*BB\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\fø\u0001\u0000¢\u0006\u0002\u0010\rB6\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\nø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b\u0019J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JB\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b\u001cJ\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J!\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÇ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "seen1", "", "id", "", "soundId", "channelId", "Lcom/discord/primitives/ChannelId;", "jumboable", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;ZLkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getChannelId-qMVnFVQ", "()Lcom/discord/primitives/ChannelId;", "getId", "()Ljava/lang/String;", "getJumboable", "()Z", "getSoundId", "component1", "component2", "component3", "component3-qMVnFVQ", "component4", "copy", "copy-MrxLv8Q", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f

public final class SoundmojiContentNode extends ContentNode {
    public static final Companion Companion = new Companion(null);
    private final ChannelId channelId;

    
    private final String f6928id;
    private final boolean jumboable;
    private final String soundId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SoundmojiContentNode> serializer() {
            return SoundmojiContentNode$$serializer.INSTANCE;
        }
    }

    
    private SoundmojiContentNode(int i10, String str, String str2, ChannelId channelId, boolean z10, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if ((i10 & 0) != 0) {
            n1.b(i10, 0, SoundmojiContentNode$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f6928id = null;
        } else {
            this.f6928id = str;
        }
        if ((i10 & 2) == 0) {
            this.soundId = null;
        } else {
            this.soundId = str2;
        }
        if ((i10 & 4) == 0) {
            this.channelId = null;
        } else {
            this.channelId = channelId;
        }
        if ((i10 & 8) == 0) {
            this.jumboable = false;
        } else {
            this.jumboable = z10;
        }
    }

    public  SoundmojiContentNode(int i10, String str, String str2, ChannelId channelId, boolean z10, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2, channelId, z10, serializationConstructorMarker);
    }

    public  SoundmojiContentNode(String str, String str2, ChannelId channelId, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, channelId, z10);
    }

    
    public static  SoundmojiContentNode m90copyMrxLv8Q$default(SoundmojiContentNode soundmojiContentNode, String str, String str2, ChannelId channelId, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = soundmojiContentNode.f6928id;
        }
        if ((i10 & 2) != 0) {
            str2 = soundmojiContentNode.soundId;
        }
        if ((i10 & 4) != 0) {
            channelId = soundmojiContentNode.channelId;
        }
        if ((i10 & 8) != 0) {
            z10 = soundmojiContentNode.jumboable;
        }
        return soundmojiContentNode.m92copyMrxLv8Q(str, str2, channelId, z10);
    }

    public static final void write$Self(SoundmojiContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        boolean z13 = false;
        if (!output.z(serialDesc, 0) && self.f6928id == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.E(serialDesc, 0, a2.f6238a, self.f6928id);
        }
        if (!output.z(serialDesc, 1) && self.soundId == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.E(serialDesc, 1, a2.f6238a, self.soundId);
        }
        if (!output.z(serialDesc, 2) && self.channelId == null) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            output.E(serialDesc, 2, ChannelId$$serializer.INSTANCE, self.channelId);
        }
        if (output.z(serialDesc, 3) || self.jumboable) {
            z13 = true;
        }
        if (z13) {
            output.x(serialDesc, 3, self.jumboable);
        }
    }

    public final String component1() {
        return this.f6928id;
    }

    public final String component2() {
        return this.soundId;
    }

    
    public final ChannelId m91component3qMVnFVQ() {
        return this.channelId;
    }

    public final boolean component4() {
        return this.jumboable;
    }

    
    public final SoundmojiContentNode m92copyMrxLv8Q(String str, String str2, ChannelId channelId, boolean z10) {
        return new SoundmojiContentNode(str, str2, channelId, z10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SoundmojiContentNode)) {
            return false;
        }
        SoundmojiContentNode soundmojiContentNode = (SoundmojiContentNode) obj;
        return q.c(this.f6928id, soundmojiContentNode.f6928id) && q.c(this.soundId, soundmojiContentNode.soundId) && q.c(this.channelId, soundmojiContentNode.channelId) && this.jumboable == soundmojiContentNode.jumboable;
    }

    
    public final ChannelId m93getChannelIdqMVnFVQ() {
        return this.channelId;
    }

    public final String getId() {
        return this.f6928id;
    }

    public final boolean getJumboable() {
        return this.jumboable;
    }

    public final String getSoundId() {
        return this.soundId;
    }

    public int hashCode() {
        String str = this.f6928id;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.soundId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ChannelId channelId = this.channelId;
        if (channelId != null) {
            i10 = ChannelId.m622hashCodeimpl(channelId.m626unboximpl());
        }
        int i11 = (hashCode2 + i10) * 31;
        boolean z10 = this.jumboable;
        if (z10) {
            z10 = true;
        }
        int i12 = z10 ? 1 : 0;
        int i13 = z10 ? 1 : 0;
        int i14 = z10 ? 1 : 0;
        return i11 + i12;
    }

    public String toString() {
        String str = this.f6928id;
        String str2 = this.soundId;
        ChannelId channelId = this.channelId;
        boolean z10 = this.jumboable;
        return "SoundmojiContentNode(id=" + str + ", soundId=" + str2 + ", channelId=" + channelId + ", jumboable=" + z10 + ")";
    }

    public  SoundmojiContentNode(String str, String str2, ChannelId channelId, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : channelId, (i10 & 8) != 0 ? false : z10, null);
    }

    private SoundmojiContentNode(String str, String str2, ChannelId channelId, boolean z10) {
        super(null);
        this.f6928id = str;
        this.soundId = str2;
        this.channelId = channelId;
        this.jumboable = z10;
    }
}
