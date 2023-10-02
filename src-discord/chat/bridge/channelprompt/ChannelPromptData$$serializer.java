package com.discord.chat.bridge.channelprompt;

import aj.a;
import cj.a2;
import cj.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import zi.n;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/channelprompt/ChannelPromptData.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/channelprompt/ChannelPromptData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class ChannelPromptData$$serializer implements f0<ChannelPromptData> {
    public static final ChannelPromptData$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        ChannelPromptData$$serializer channelPromptData$$serializer = new ChannelPromptData$$serializer();
        INSTANCE = channelPromptData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.channelprompt.ChannelPromptData", channelPromptData$$serializer, 4);
        pluginGeneratedSerialDescriptor.l("cameraButtonIcon", true);
        pluginGeneratedSerialDescriptor.l("gifButtonIcon", true);
        pluginGeneratedSerialDescriptor.l("emojiButtonIcon", true);
        pluginGeneratedSerialDescriptor.l("gamingStatsButtonText", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChannelPromptData$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f6238a;
        return new KSerializer[]{a.u(a2Var), a.u(a2Var), a.u(a2Var), a.u(a2Var)};
    }

    @Override 
    public ChannelPromptData deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        int i10;
        Object obj4;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        Object obj5 = null;
        if (b10.p()) {
            a2 a2Var = a2.f6238a;
            obj2 = b10.n(descriptor2, 0, a2Var, null);
            obj3 = b10.n(descriptor2, 1, a2Var, null);
            obj = b10.n(descriptor2, 2, a2Var, null);
            obj4 = b10.n(descriptor2, 3, a2Var, null);
            i10 = 15;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object obj6 = null;
            obj = null;
            Object obj7 = null;
            while (z10) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z10 = false;
                } else if (o10 == 0) {
                    obj5 = b10.n(descriptor2, 0, a2.f6238a, obj5);
                    i11 |= 1;
                } else if (o10 == 1) {
                    obj6 = b10.n(descriptor2, 1, a2.f6238a, obj6);
                    i11 |= 2;
                } else if (o10 == 2) {
                    obj = b10.n(descriptor2, 2, a2.f6238a, obj);
                    i11 |= 4;
                } else if (o10 == 3) {
                    obj7 = b10.n(descriptor2, 3, a2.f6238a, obj7);
                    i11 |= 8;
                } else {
                    throw new n(o10);
                }
            }
            i10 = i11;
            obj2 = obj5;
            obj3 = obj6;
            obj4 = obj7;
        }
        b10.c(descriptor2);
        return new ChannelPromptData(i10, (String) obj2, (String) obj3, (String) obj, (String) obj4, (SerializationConstructorMarker) null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ChannelPromptData value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        ChannelPromptData.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}