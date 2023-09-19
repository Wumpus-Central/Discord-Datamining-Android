package com.discord.chat.bridge.messageframe;

import com.discord.chat.bridge.messageframe.MessageFrameType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ui.f;
import xi.a2;
import xi.n1;

@f
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÇ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, d2 = {"Lcom/discord/chat/bridge/messageframe/MessageFrameJump;", "Lcom/discord/chat/bridge/messageframe/MessageFrame;", "seen1", "", "type", "Lcom/discord/chat/bridge/messageframe/MessageFrameType;", "guildName", "", "channelName", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/messageframe/MessageFrameType;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/discord/chat/bridge/messageframe/MessageFrameType;Ljava/lang/String;Ljava/lang/String;)V", "getChannelName", "()Ljava/lang/String;", "getGuildName", "getType", "()Lcom/discord/chat/bridge/messageframe/MessageFrameType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class MessageFrameJump extends MessageFrame {
    public static final Companion Companion = new Companion(null);
    private final String channelName;
    private final String guildName;
    private final MessageFrameType type;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/messageframe/MessageFrameJump$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/messageframe/MessageFrameJump;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MessageFrameJump> serializer() {
            return MessageFrameJump$$serializer.INSTANCE;
        }
    }

    
    public  MessageFrameJump(int i10, MessageFrameType messageFrameType, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (1 != (i10 & 1)) {
            n1.b(i10, 1, MessageFrameJump$$serializer.INSTANCE.getDescriptor());
        }
        this.type = messageFrameType;
        if ((i10 & 2) == 0) {
            this.guildName = null;
        } else {
            this.guildName = str;
        }
        if ((i10 & 4) == 0) {
            this.channelName = null;
        } else {
            this.channelName = str2;
        }
    }

    public static  MessageFrameJump copy$default(MessageFrameJump messageFrameJump, MessageFrameType messageFrameType, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            messageFrameType = messageFrameJump.getType();
        }
        if ((i10 & 2) != 0) {
            str = messageFrameJump.guildName;
        }
        if ((i10 & 4) != 0) {
            str2 = messageFrameJump.channelName;
        }
        return messageFrameJump.copy(messageFrameType, str, str2);
    }

    public static final void write$Self(MessageFrameJump self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        boolean z11 = false;
        output.h(serialDesc, 0, MessageFrameType.Serializer.INSTANCE, self.getType());
        if (!output.z(serialDesc, 1) && self.guildName == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.e(serialDesc, 1, a2.f30576a, self.guildName);
        }
        if (output.z(serialDesc, 2) || self.channelName != null) {
            z11 = true;
        }
        if (z11) {
            output.e(serialDesc, 2, a2.f30576a, self.channelName);
        }
    }

    public final MessageFrameType component1() {
        return getType();
    }

    public final String component2() {
        return this.guildName;
    }

    public final String component3() {
        return this.channelName;
    }

    public final MessageFrameJump copy(MessageFrameType type, String str, String str2) {
        q.h(type, "type");
        return new MessageFrameJump(type, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageFrameJump)) {
            return false;
        }
        MessageFrameJump messageFrameJump = (MessageFrameJump) obj;
        return getType() == messageFrameJump.getType() && q.c(this.guildName, messageFrameJump.guildName) && q.c(this.channelName, messageFrameJump.channelName);
    }

    public final String getChannelName() {
        return this.channelName;
    }

    public final String getGuildName() {
        return this.guildName;
    }

    @Override 
    public MessageFrameType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = getType().hashCode() * 31;
        String str = this.guildName;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.channelName;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        MessageFrameType type = getType();
        String str = this.guildName;
        String str2 = this.channelName;
        return "MessageFrameJump(type=" + type + ", guildName=" + str + ", channelName=" + str2 + ")";
    }

    public  MessageFrameJump(MessageFrameType messageFrameType, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(messageFrameType, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
    }

    
    public MessageFrameJump(MessageFrameType type, String str, String str2) {
        super(null);
        q.h(type, "type");
        this.type = type;
        this.guildName = str;
        this.channelName = str2;
    }
}
