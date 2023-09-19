package com.discord.external_pip.react_events;

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
import xi.f0;
import xi.h;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/external_pip/react_events/OnPipModeChangedEvent.$serializer", "Lxi/f0;", "Lcom/discord/external_pip/react_events/OnPipModeChangedEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "external_pip_release"}, k = 1, mv = {1, 8, 0})

public final class OnPipModeChangedEvent$$serializer implements f0<OnPipModeChangedEvent> {
    public static final OnPipModeChangedEvent$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        OnPipModeChangedEvent$$serializer onPipModeChangedEvent$$serializer = new OnPipModeChangedEvent$$serializer();
        INSTANCE = onPipModeChangedEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.external_pip.react_events.OnPipModeChangedEvent", onPipModeChangedEvent$$serializer, 1);
        pluginGeneratedSerialDescriptor.l("isInPipMode", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OnPipModeChangedEvent$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{h.f30618a};
    }

    @Override 
    public OnPipModeChangedEvent deserialize(Decoder decoder) {
        boolean z10;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        int i10 = 1;
        if (b10.p()) {
            z10 = b10.C(descriptor2, 0);
        } else {
            z10 = false;
            int i11 = 0;
            while (i10 != 0) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    i10 = 0;
                } else if (o10 == 0) {
                    z10 = b10.C(descriptor2, 0);
                    i11 |= 1;
                } else {
                    throw new n(o10);
                }
            }
            i10 = i11;
        }
        b10.c(descriptor2);
        return new OnPipModeChangedEvent(i10, z10, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, OnPipModeChangedEvent value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        OnPipModeChangedEvent.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
