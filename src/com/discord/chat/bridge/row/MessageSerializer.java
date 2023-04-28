package com.discord.chat.bridge.row;

import com.discord.chat.bridge.ErrorMessage;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageBase;
import com.discord.crash_reporting.CrashReporting;
import com.discord.primitives.MessageId;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import nf.C10822f;
import p014aj.AbstractC0192e;
import p014aj.C0207g;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m15073d2 = {"Lcom/discord/chat/bridge/row/MessageSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/MessageBase;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class MessageSerializer implements KSerializer<MessageBase> {
    public static final MessageSerializer INSTANCE = new MessageSerializer();

    private MessageSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return C0207g.m41131a("Message", AbstractC0192e.C0201i.f537a);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public MessageBase deserialize(Decoder decoder) {
        String b;
        C9677q.m14633g(decoder, "decoder");
        try {
            return (MessageBase) decoder.mo13909G(Message.Companion.serializer());
        } catch (Exception e) {
            CrashReporting.INSTANCE.captureException(e);
            UUID randomUUID = UUID.randomUUID();
            String str = MessageId.m42116constructorimpl("RENDERING_ERROR_" + randomUUID);
            b = C10822f.m10980b(e);
            return new ErrorMessage(str, b, null);
        }
    }

    public void serialize(Encoder encoder, MessageBase value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        throw new UnsupportedOperationException();
    }
}
