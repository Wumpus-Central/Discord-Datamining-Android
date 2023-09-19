package com.discord.media.engine.video.events;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
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
import xi.a2;
import xi.f0;
import xi.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/media/engine/video/events/PingTimeoutCallbackEvent.$serializer", "Lxi/f0;", "Lcom/discord/media/engine/video/events/PingTimeoutCallbackEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "media_engine_release"}, k = 1, mv = {1, 8, 0})

public final class PingTimeoutCallbackEvent$$serializer implements f0<PingTimeoutCallbackEvent> {
    public static final PingTimeoutCallbackEvent$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        PingTimeoutCallbackEvent$$serializer pingTimeoutCallbackEvent$$serializer = new PingTimeoutCallbackEvent$$serializer();
        INSTANCE = pingTimeoutCallbackEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.media.engine.video.events.PingTimeoutCallbackEvent", pingTimeoutCallbackEvent$$serializer, 5);
        pluginGeneratedSerialDescriptor.l("connectionId", false);
        pluginGeneratedSerialDescriptor.l("server", false);
        pluginGeneratedSerialDescriptor.l(ZeroconfModule.KEY_SERVICE_PORT, false);
        pluginGeneratedSerialDescriptor.l("seq", false);
        pluginGeneratedSerialDescriptor.l("timeout", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PingTimeoutCallbackEvent$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        m0 m0Var = m0.f30651a;
        return new KSerializer[]{m0Var, a2.f30576a, m0Var, m0Var, m0Var};
    }

    @Override 
    public PingTimeoutCallbackEvent deserialize(Decoder decoder) {
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            i13 = b10.i(descriptor2, 0);
            str = b10.m(descriptor2, 1);
            i12 = b10.i(descriptor2, 2);
            i11 = b10.i(descriptor2, 3);
            i10 = b10.i(descriptor2, 4);
            i14 = 31;
        } else {
            String str2 = null;
            boolean z10 = true;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            while (z10) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z10 = false;
                } else if (o10 == 0) {
                    i15 = b10.i(descriptor2, 0);
                    i19 |= 1;
                } else if (o10 == 1) {
                    str2 = b10.m(descriptor2, 1);
                    i19 |= 2;
                } else if (o10 == 2) {
                    i18 = b10.i(descriptor2, 2);
                    i19 |= 4;
                } else if (o10 == 3) {
                    i16 = b10.i(descriptor2, 3);
                    i19 |= 8;
                } else if (o10 == 4) {
                    i17 = b10.i(descriptor2, 4);
                    i19 |= 16;
                } else {
                    throw new n(o10);
                }
            }
            i13 = i15;
            i11 = i16;
            i10 = i17;
            i12 = i18;
            str = str2;
            i14 = i19;
        }
        b10.c(descriptor2);
        return new PingTimeoutCallbackEvent(i14, i13, str, i12, i11, i10, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, PingTimeoutCallbackEvent value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        PingTimeoutCallbackEvent.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
