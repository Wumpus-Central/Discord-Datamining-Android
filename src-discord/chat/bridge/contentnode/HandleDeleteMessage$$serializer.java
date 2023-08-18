package com.discord.chat.bridge.contentnode;

import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ti.n;
import ui.a;
import wi.a2;
import wi.f0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/contentnode/HandleDeleteMessage.$serializer", "Lwi/f0;", "Lcom/discord/chat/bridge/contentnode/HandleDeleteMessage;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class HandleDeleteMessage$$serializer implements f0<HandleDeleteMessage> {
    public static final HandleDeleteMessage$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        HandleDeleteMessage$$serializer handleDeleteMessage$$serializer = new HandleDeleteMessage$$serializer();
        INSTANCE = handleDeleteMessage$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.HandleDeleteMessage", handleDeleteMessage$$serializer, 4);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l("channel_id", false);
        pluginGeneratedSerialDescriptor.l("loggingName", true);
        pluginGeneratedSerialDescriptor.l("author", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HandleDeleteMessage$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{MessageId$$serializer.INSTANCE, ChannelId$$serializer.INSTANCE, a.u(a2.f29755a), HandleDeleteMessageAuthor$$serializer.INSTANCE};
    }

    @Override 
    public HandleDeleteMessage deserialize(Decoder decoder) {
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        String str = null;
        if (b10.p()) {
            obj4 = b10.y(descriptor2, 0, MessageId$$serializer.INSTANCE, null);
            obj = b10.y(descriptor2, 1, ChannelId$$serializer.INSTANCE, null);
            obj2 = b10.n(descriptor2, 2, a2.f29755a, null);
            obj3 = b10.y(descriptor2, 3, HandleDeleteMessageAuthor$$serializer.INSTANCE, null);
            i10 = 15;
        } else {
            boolean z10 = true;
            int i11 = 0;
            obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            while (z10) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z10 = false;
                } else if (o10 == 0) {
                    obj4 = b10.y(descriptor2, 0, MessageId$$serializer.INSTANCE, obj4);
                    i11 |= 1;
                } else if (o10 == 1) {
                    obj7 = b10.y(descriptor2, 1, ChannelId$$serializer.INSTANCE, obj7);
                    i11 |= 2;
                } else if (o10 == 2) {
                    obj6 = b10.n(descriptor2, 2, a2.f29755a, obj6);
                    i11 |= 4;
                } else if (o10 == 3) {
                    obj5 = b10.y(descriptor2, 3, HandleDeleteMessageAuthor$$serializer.INSTANCE, obj5);
                    i11 |= 8;
                } else {
                    throw new n(o10);
                }
            }
            obj3 = obj5;
            obj2 = obj6;
            obj = obj7;
            i10 = i11;
        }
        b10.c(descriptor2);
        MessageId messageId = (MessageId) obj4;
        if (messageId != null) {
            str = messageId.m615unboximpl();
        }
        return new HandleDeleteMessage(i10, str, (ChannelId) obj, (String) obj2, (HandleDeleteMessageAuthor) obj3, null, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, HandleDeleteMessage value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        HandleDeleteMessage.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
