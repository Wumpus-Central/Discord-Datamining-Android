package com.discord.chat.bridge.truncation;

import com.facebook.react.uimanager.ViewProps;
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
import ui.n;
import vi.a;
import xi.a2;
import xi.f0;
import xi.h;
import xi.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/truncation/Truncation.$serializer", "Lxi/f0;", "Lcom/discord/chat/bridge/truncation/Truncation;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class Truncation$$serializer implements f0<Truncation> {
    public static final Truncation$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        Truncation$$serializer truncation$$serializer = new Truncation$$serializer();
        INSTANCE = truncation$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.truncation.Truncation", truncation$$serializer, 4);
        pluginGeneratedSerialDescriptor.l(ViewProps.NUMBER_OF_LINES, false);
        pluginGeneratedSerialDescriptor.l("seeMoreLabel", false);
        pluginGeneratedSerialDescriptor.l("seeMoreLabelColor", true);
        pluginGeneratedSerialDescriptor.l("forceShow", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Truncation$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        m0 m0Var = m0.f30643a;
        return new KSerializer[]{m0Var, a2.f30568a, a.u(m0Var), a.u(h.f30610a)};
    }

    @Override 
    public Truncation deserialize(Decoder decoder) {
        String str;
        int i10;
        int i11;
        Object obj;
        Object obj2;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            i10 = b10.i(descriptor2, 0);
            str = b10.m(descriptor2, 1);
            obj = b10.n(descriptor2, 2, m0.f30643a, null);
            obj2 = b10.n(descriptor2, 3, h.f30610a, null);
            i11 = 15;
        } else {
            boolean z10 = true;
            int i12 = 0;
            String str2 = null;
            Object obj3 = null;
            Object obj4 = null;
            int i13 = 0;
            while (z10) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z10 = false;
                } else if (o10 == 0) {
                    i12 = b10.i(descriptor2, 0);
                    i13 |= 1;
                } else if (o10 == 1) {
                    str2 = b10.m(descriptor2, 1);
                    i13 |= 2;
                } else if (o10 == 2) {
                    obj3 = b10.n(descriptor2, 2, m0.f30643a, obj3);
                    i13 |= 4;
                } else if (o10 == 3) {
                    obj4 = b10.n(descriptor2, 3, h.f30610a, obj4);
                    i13 |= 8;
                } else {
                    throw new n(o10);
                }
            }
            i10 = i12;
            i11 = i13;
            str = str2;
            obj = obj3;
            obj2 = obj4;
        }
        b10.c(descriptor2);
        return new Truncation(i11, i10, str, (Integer) obj, (Boolean) obj2, (SerializationConstructorMarker) null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, Truncation value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        Truncation.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
