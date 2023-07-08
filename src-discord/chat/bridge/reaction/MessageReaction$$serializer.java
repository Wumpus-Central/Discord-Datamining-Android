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
import pi.n;
import qi.a;
import si.f0;
import si.h;
import si.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/reaction/MessageReaction.$serializer", "Lsi/f0;", "Lcom/discord/chat/bridge/reaction/MessageReaction;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class MessageReaction$$serializer implements f0<MessageReaction> {
    public static final MessageReaction$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

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

    @Override // si.f0
    public KSerializer<?>[] childSerializers() {
        m0 m0Var = m0.f26305a;
        h hVar = h.f26272a;
        return new KSerializer[]{m0Var, hVar, hVar, MessageReactionEmoji$$serializer.INSTANCE, m0Var, a.u(ThemedBurstReactionColorPalette$$serializer.INSTANCE), hVar};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public MessageReaction deserialize(Decoder decoder) {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        Object obj;
        Object obj2;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        if (c10.y()) {
            i11 = c10.k(descriptor2, 0);
            z12 = c10.s(descriptor2, 1);
            z11 = c10.s(descriptor2, 2);
            obj = c10.m(descriptor2, 3, MessageReactionEmoji$$serializer.INSTANCE, null);
            i10 = c10.k(descriptor2, 4);
            obj2 = c10.v(descriptor2, 5, ThemedBurstReactionColorPalette$$serializer.INSTANCE, null);
            z10 = c10.s(descriptor2, 6);
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
                int x10 = c10.x(descriptor2);
                switch (x10) {
                    case -1:
                        z13 = false;
                        break;
                    case 0:
                        i13 = c10.k(descriptor2, 0);
                        i15 |= 1;
                        continue;
                    case 1:
                        z15 = c10.s(descriptor2, 1);
                        i15 |= 2;
                        continue;
                    case 2:
                        z14 = c10.s(descriptor2, 2);
                        i15 |= 4;
                        break;
                    case 3:
                        obj3 = c10.m(descriptor2, 3, MessageReactionEmoji$$serializer.INSTANCE, obj3);
                        i15 |= 8;
                        break;
                    case 4:
                        i14 = c10.k(descriptor2, 4);
                        i15 |= 16;
                        break;
                    case 5:
                        obj4 = c10.v(descriptor2, 5, ThemedBurstReactionColorPalette$$serializer.INSTANCE, obj4);
                        i15 |= 32;
                        break;
                    case 6:
                        z16 = c10.s(descriptor2, 6);
                        i15 |= 64;
                        break;
                    default:
                        throw new n(x10);
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
        c10.b(descriptor2);
        return new MessageReaction(i12, i11, z12, z11, (MessageReactionEmoji) obj, i10, (ThemedBurstReactionColorPalette) obj2, z10, null);
    }

    @Override // kotlinx.serialization.KSerializer, pi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, MessageReaction value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        MessageReaction.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // si.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
