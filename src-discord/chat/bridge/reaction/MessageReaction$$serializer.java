package com.discord.chat.bridge.reaction;

import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ui.n;
import vi.a;
import xi.f0;
import xi.h;
import xi.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/reaction/MessageReaction.$serializer", "Lxi/f0;", "Lcom/discord/chat/bridge/reaction/MessageReaction;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class MessageReaction$$serializer implements f0<MessageReaction> {
    public static final MessageReaction$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        MessageReaction$$serializer messageReaction$$serializer = new MessageReaction$$serializer();
        INSTANCE = messageReaction$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.reaction.MessageReaction", messageReaction$$serializer, 7);
        pluginGeneratedSerialDescriptor.l("count", false);
        pluginGeneratedSerialDescriptor.l("me", false);
        pluginGeneratedSerialDescriptor.l("me_burst", true);
        pluginGeneratedSerialDescriptor.l("emoji", false);
        pluginGeneratedSerialDescriptor.l("burst_count", true);
        pluginGeneratedSerialDescriptor.l("themedBurstColors", true);
        pluginGeneratedSerialDescriptor.l("isMe", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MessageReaction$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        m0 m0Var = m0.f30651a;
        h hVar = h.f30618a;
        return new KSerializer[]{m0Var, hVar, hVar, MessageReactionEmoji$$serializer.INSTANCE, m0Var, a.u(ThemedBurstReactionColorPalette$$serializer.INSTANCE), hVar};
    }

    @Override 
    public MessageReaction deserialize(Decoder decoder) {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        Object obj;
        Object obj2;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            i11 = b10.i(descriptor2, 0);
            z12 = b10.C(descriptor2, 1);
            z11 = b10.C(descriptor2, 2);
            obj = b10.y(descriptor2, 3, MessageReactionEmoji$$serializer.INSTANCE, null);
            i10 = b10.i(descriptor2, 4);
            obj2 = b10.n(descriptor2, 5, ThemedBurstReactionColorPalette$$serializer.INSTANCE, null);
            z10 = b10.C(descriptor2, 6);
            i12 = 127;
        } else {
            boolean z13 = true;
            int i13 = 0;
            int i14 = 0;
            boolean z14 = false;
            boolean z15 = false;
            int i15 = 0;
            Object obj3 = null;
            Object obj4 = null;
            boolean z16 = false;
            while (z13) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z13 = false;
                        break;
                    case 0:
                        i13 = b10.i(descriptor2, 0);
                        i15 |= 1;
                        continue;
                    case 1:
                        z15 = b10.C(descriptor2, 1);
                        i15 |= 2;
                        continue;
                    case 2:
                        z14 = b10.C(descriptor2, 2);
                        i15 |= 4;
                        break;
                    case 3:
                        obj3 = b10.y(descriptor2, 3, MessageReactionEmoji$$serializer.INSTANCE, obj3);
                        i15 |= 8;
                        break;
                    case 4:
                        i14 = b10.i(descriptor2, 4);
                        i15 |= 16;
                        break;
                    case 5:
                        obj4 = b10.n(descriptor2, 5, ThemedBurstReactionColorPalette$$serializer.INSTANCE, obj4);
                        i15 |= 32;
                        break;
                    case 6:
                        z16 = b10.C(descriptor2, 6);
                        i15 |= 64;
                        break;
                    default:
                        throw new n(o10);
                }
            }
            obj2 = obj4;
            z10 = z16;
            i12 = i15;
            obj = obj3;
            i10 = i14;
            i11 = i13;
            z11 = z14;
            z12 = z15;
        }
        b10.c(descriptor2);
        return new MessageReaction(i12, i11, z12, z11, (MessageReactionEmoji) obj, i10, (ThemedBurstReactionColorPalette) obj2, z10, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, MessageReaction value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        MessageReaction.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
