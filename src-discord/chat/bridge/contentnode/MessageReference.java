package com.discord.chat.bridge.contentnode;

import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ui.f;
import xi.n1;

@f
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()B4\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000¢\u0006\u0002\u0010\nB\u001c\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0019\u0010\u0014\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000fJ\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b\u0017J,\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J!\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÇ\u0001R'\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0010\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR'\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Lcom/discord/chat/bridge/contentnode/MessageReference;", "", "seen1", "", "channelId", "Lcom/discord/primitives/ChannelId;", "guildId", "Lcom/discord/primitives/GuildId;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/primitives/ChannelId;Lcom/discord/primitives/GuildId;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JLcom/discord/primitives/GuildId;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getChannelId-o4g7jtM$annotations", "()V", "getChannelId-o4g7jtM", "()J", "J", "getGuildId-qOKuAAo$annotations", "getGuildId-qOKuAAo", "()Lcom/discord/primitives/GuildId;", "component1", "component1-o4g7jtM", "component2", "component2-qOKuAAo", "copy", "copy-2_zTmBg", "(JLcom/discord/primitives/GuildId;)Lcom/discord/chat/bridge/contentnode/MessageReference;", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class MessageReference {
    public static final Companion Companion = new Companion(null);
    private final long channelId;
    private final GuildId guildId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/contentnode/MessageReference$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/MessageReference;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MessageReference> serializer() {
            return MessageReference$$serializer.INSTANCE;
        }
    }

    private MessageReference(int i10, ChannelId channelId, GuildId guildId, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            n1.b(i10, 1, MessageReference$$serializer.INSTANCE.getDescriptor());
        }
        this.channelId = channelId.m607unboximpl();
        if ((i10 & 2) == 0) {
            this.guildId = null;
        } else {
            this.guildId = guildId;
        }
    }

    public  MessageReference(int i10, ChannelId channelId, GuildId guildId, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, channelId, guildId, serializationConstructorMarker);
    }

    public  MessageReference(long j10, GuildId guildId, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, guildId);
    }

    
    public static  MessageReference m79copy2_zTmBg$default(MessageReference messageReference, long j10, GuildId guildId, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = messageReference.channelId;
        }
        if ((i10 & 2) != 0) {
            guildId = messageReference.guildId;
        }
        return messageReference.m84copy2_zTmBg(j10, guildId);
    }

    
    public static  void m80getChannelIdo4g7jtM$annotations() {
    }

    
    public static  void m81getGuildIdqOKuAAo$annotations() {
    }

    public static final void write$Self(MessageReference self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        boolean z10 = false;
        output.h(serialDesc, 0, ChannelId$$serializer.INSTANCE, ChannelId.m598boximpl(self.channelId));
        if (output.z(serialDesc, 1) || self.guildId != null) {
            z10 = true;
        }
        if (z10) {
            output.e(serialDesc, 1, GuildId$$serializer.INSTANCE, self.guildId);
        }
    }

    
    public final long m82component1o4g7jtM() {
        return this.channelId;
    }

    
    public final GuildId m83component2qOKuAAo() {
        return this.guildId;
    }

    
    public final MessageReference m84copy2_zTmBg(long j10, GuildId guildId) {
        return new MessageReference(j10, guildId, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageReference)) {
            return false;
        }
        MessageReference messageReference = (MessageReference) obj;
        return ChannelId.m602equalsimpl0(this.channelId, messageReference.channelId) && q.c(this.guildId, messageReference.guildId);
    }

    
    public final long m85getChannelIdo4g7jtM() {
        return this.channelId;
    }

    
    public final GuildId m86getGuildIdqOKuAAo() {
        return this.guildId;
    }

    public int hashCode() {
        int i10 = ChannelId.m603hashCodeimpl(this.channelId) * 31;
        GuildId guildId = this.guildId;
        return i10 + (guildId == null ? 0 : GuildId.m616hashCodeimpl(guildId.m620unboximpl()));
    }

    public String toString() {
        String str = ChannelId.m605toStringimpl(this.channelId);
        GuildId guildId = this.guildId;
        return "MessageReference(channelId=" + str + ", guildId=" + guildId + ")";
    }

    private MessageReference(long j10, GuildId guildId) {
        this.channelId = j10;
        this.guildId = guildId;
    }

    public  MessageReference(long j10, GuildId guildId, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i10 & 2) != 0 ? null : guildId, null);
    }
}
