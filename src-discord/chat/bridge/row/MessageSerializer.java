package com.discord.chat.bridge.row;

import com.discord.chat.bridge.ErrorMessage;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageBase;
import com.discord.crash_reporting.CrashReporting;
import com.discord.primitives.MessageId;
import java.util.UUID;
import kf.f;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wi.e;
import wi.g;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/bridge/row/MessageSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/MessageBase;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class MessageSerializer implements KSerializer<MessageBase> {
    public static final MessageSerializer INSTANCE = new MessageSerializer();

    private MessageSerializer() {
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return g.a("Message", e.i.f30052a);
    }

    @Override 
    public MessageBase deserialize(Decoder decoder) {
        String b10;
        q.h(decoder, "decoder");
        try {
            return (MessageBase) decoder.G(Message.Companion.serializer());
        } catch (Exception e10) {
            CrashReporting.INSTANCE.captureException(e10);
            UUID randomUUID = UUID.randomUUID();
            String str = MessageId.m632constructorimpl("RENDERING_ERROR_" + randomUUID);
            b10 = f.b(e10);
            return new ErrorMessage(str, b10, null);
        }
    }

    public void serialize(Encoder encoder, MessageBase value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        throw new UnsupportedOperationException();
    }
}
