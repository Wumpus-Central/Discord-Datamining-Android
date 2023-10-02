package com.discord.chat.bridge.contentnode;

import aj.a;
import cj.a2;
import cj.f0;
import cj.h;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import zi.n;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/contentnode/SoundmojiContentNode.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class SoundmojiContentNode$$serializer implements f0<SoundmojiContentNode> {
    public static final SoundmojiContentNode$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        SoundmojiContentNode$$serializer soundmojiContentNode$$serializer = new SoundmojiContentNode$$serializer();
        INSTANCE = soundmojiContentNode$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("soundboard", soundmojiContentNode$$serializer, 4);
        pluginGeneratedSerialDescriptor.l("id", true);
        pluginGeneratedSerialDescriptor.l("soundId", true);
        pluginGeneratedSerialDescriptor.l("channelId", true);
        pluginGeneratedSerialDescriptor.l("jumboable", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SoundmojiContentNode$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f6238a;
        return new KSerializer[]{a.u(a2Var), a.u(a2Var), a.u(ChannelId$$serializer.INSTANCE), h.f6280a};
    }

    @Override 
    public SoundmojiContentNode deserialize(Decoder decoder) {
        Object obj;
        boolean z10;
        Object obj2;
        int i10;
        Object obj3;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            a2 a2Var = a2.f6238a;
            obj2 = b10.n(descriptor2, 0, a2Var, null);
            obj3 = b10.n(descriptor2, 1, a2Var, null);
            obj = b10.n(descriptor2, 2, ChannelId$$serializer.INSTANCE, null);
            z10 = b10.C(descriptor2, 3);
            i10 = 15;
        } else {
            boolean z11 = true;
            boolean z12 = false;
            Object obj4 = null;
            Object obj5 = null;
            obj = null;
            int i11 = 0;
            while (z11) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z11 = false;
                } else if (o10 == 0) {
                    obj4 = b10.n(descriptor2, 0, a2.f6238a, obj4);
                    i11 |= 1;
                } else if (o10 == 1) {
                    obj5 = b10.n(descriptor2, 1, a2.f6238a, obj5);
                    i11 |= 2;
                } else if (o10 == 2) {
                    obj = b10.n(descriptor2, 2, ChannelId$$serializer.INSTANCE, obj);
                    i11 |= 4;
                } else if (o10 == 3) {
                    z12 = b10.C(descriptor2, 3);
                    i11 |= 8;
                } else {
                    throw new n(o10);
                }
            }
            i10 = i11;
            obj2 = obj4;
            z10 = z12;
            obj3 = obj5;
        }
        b10.c(descriptor2);
        return new SoundmojiContentNode(i10, (String) obj2, (String) obj3, (ChannelId) obj, z10, null, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, SoundmojiContentNode value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        SoundmojiContentNode.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}