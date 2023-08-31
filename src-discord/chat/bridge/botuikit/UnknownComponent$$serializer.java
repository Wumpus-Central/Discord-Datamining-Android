package com.discord.chat.bridge.botuikit;

import java.util.List;
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
import ti.n;
import wi.f;
import wi.f0;
import wi.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/botuikit/UnknownComponent.$serializer", "Lwi/f0;", "Lcom/discord/chat/bridge/botuikit/UnknownComponent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class UnknownComponent$$serializer implements f0<UnknownComponent> {
    public static final UnknownComponent$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        UnknownComponent$$serializer unknownComponent$$serializer = new UnknownComponent$$serializer();
        INSTANCE = unknownComponent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("0", unknownComponent$$serializer, 2);
        pluginGeneratedSerialDescriptor.l("type", true);
        pluginGeneratedSerialDescriptor.l("indices", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UnknownComponent$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        m0 m0Var = m0.f29839a;
        return new KSerializer[]{m0Var, new f(m0Var)};
    }

    @Override 
    public UnknownComponent deserialize(Decoder decoder) {
        int i10;
        Object obj;
        int i11;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            i11 = b10.i(descriptor2, 0);
            obj = b10.y(descriptor2, 1, new f(m0.f29839a), null);
            i10 = 3;
        } else {
            boolean z10 = true;
            i11 = 0;
            int i12 = 0;
            Object obj2 = null;
            while (z10) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z10 = false;
                } else if (o10 == 0) {
                    i11 = b10.i(descriptor2, 0);
                    i12 |= 1;
                } else if (o10 == 1) {
                    obj2 = b10.y(descriptor2, 1, new f(m0.f29839a), obj2);
                    i12 |= 2;
                } else {
                    throw new n(o10);
                }
            }
            obj = obj2;
            i10 = i12;
        }
        b10.c(descriptor2);
        return new UnknownComponent(i10, i11, (List) obj, (SerializationConstructorMarker) null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, UnknownComponent value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        UnknownComponent.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
