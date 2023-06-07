package com.discord.chat.bridge.messageframe;

import com.discord.chat.bridge.messageframe.MessageFrameType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import vj.f;
import yj.n1;

@f
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J!\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bHÇ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/discord/chat/bridge/messageframe/MessageFrameMediaViewer;", "Lcom/discord/chat/bridge/messageframe/MessageFrame;", "seen1", "", "type", "Lcom/discord/chat/bridge/messageframe/MessageFrameType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/messageframe/MessageFrameType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/discord/chat/bridge/messageframe/MessageFrameType;)V", "getType", "()Lcom/discord/chat/bridge/messageframe/MessageFrameType;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MessageFrameMediaViewer extends MessageFrame {
    public static final Companion Companion = new Companion(null);
    private final MessageFrameType type;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/messageframe/MessageFrameMediaViewer$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/messageframe/MessageFrameMediaViewer;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MessageFrameMediaViewer> serializer() {
            return MessageFrameMediaViewer$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MessageFrameMediaViewer(int i10, MessageFrameType messageFrameType, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (1 != (i10 & 1)) {
            n1.b(i10, 1, MessageFrameMediaViewer$$serializer.INSTANCE.getDescriptor());
        }
        this.type = messageFrameType;
    }

    public static /* synthetic */ MessageFrameMediaViewer copy$default(MessageFrameMediaViewer messageFrameMediaViewer, MessageFrameType messageFrameType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            messageFrameType = messageFrameMediaViewer.getType();
        }
        return messageFrameMediaViewer.copy(messageFrameType);
    }

    public static final void write$Self(MessageFrameMediaViewer self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.q(serialDesc, 0, MessageFrameType.Serializer.INSTANCE, self.getType());
    }

    public final MessageFrameType component1() {
        return getType();
    }

    public final MessageFrameMediaViewer copy(MessageFrameType type) {
        q.g(type, "type");
        return new MessageFrameMediaViewer(type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessageFrameMediaViewer) && getType() == ((MessageFrameMediaViewer) obj).getType();
    }

    @Override // com.discord.chat.bridge.messageframe.MessageFrame
    public MessageFrameType getType() {
        return this.type;
    }

    public int hashCode() {
        return getType().hashCode();
    }

    public String toString() {
        MessageFrameType type = getType();
        return "MessageFrameMediaViewer(type=" + type + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageFrameMediaViewer(MessageFrameType type) {
        super(null);
        q.g(type, "type");
        this.type = type;
    }
}
