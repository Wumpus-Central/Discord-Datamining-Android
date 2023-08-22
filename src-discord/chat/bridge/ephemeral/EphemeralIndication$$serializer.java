package com.discord.chat.bridge.ephemeral;

import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
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
import wi.a2;
import wi.f0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/ephemeral/EphemeralIndication.$serializer", "Lwi/f0;", "Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class EphemeralIndication$$serializer implements f0<EphemeralIndication> {
    public static final EphemeralIndication$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        EphemeralIndication$$serializer ephemeralIndication$$serializer = new EphemeralIndication$$serializer();
        INSTANCE = ephemeralIndication$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.ephemeral.EphemeralIndication", ephemeralIndication$$serializer, 3);
        pluginGeneratedSerialDescriptor.l("content", false);
        pluginGeneratedSerialDescriptor.l("helpArticleLink", false);
        pluginGeneratedSerialDescriptor.l("helpButtonAccessibilityLabel", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EphemeralIndication$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f29758a;
        return new KSerializer[]{StructurableTextSerializer.INSTANCE, a2Var, a2Var};
    }

    @Override 
    public EphemeralIndication deserialize(Decoder decoder) {
        String str;
        String str2;
        int i10;
        Object obj;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        Object obj2 = null;
        if (b10.p()) {
            obj = b10.y(descriptor2, 0, StructurableTextSerializer.INSTANCE, null);
            str2 = b10.m(descriptor2, 1);
            str = b10.m(descriptor2, 2);
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String str3 = null;
            String str4 = null;
            while (z10) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z10 = false;
                } else if (o10 == 0) {
                    obj2 = b10.y(descriptor2, 0, StructurableTextSerializer.INSTANCE, obj2);
                    i11 |= 1;
                } else if (o10 == 1) {
                    str3 = b10.m(descriptor2, 1);
                    i11 |= 2;
                } else if (o10 == 2) {
                    str4 = b10.m(descriptor2, 2);
                    i11 |= 4;
                } else {
                    throw new n(o10);
                }
            }
            i10 = i11;
            obj = obj2;
            str2 = str3;
            str = str4;
        }
        b10.c(descriptor2);
        return new EphemeralIndication(i10, (StructurableText) obj, str2, str, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, EphemeralIndication value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        EphemeralIndication.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
