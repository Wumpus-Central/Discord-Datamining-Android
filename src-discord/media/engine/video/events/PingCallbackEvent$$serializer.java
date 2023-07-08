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
import pi.n;
import si.a2;
import si.f0;
import si.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/media/engine/video/events/PingCallbackEvent.$serializer", "Lsi/f0;", "Lcom/discord/media/engine/video/events/PingCallbackEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "media_engine_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class PingCallbackEvent$$serializer implements f0<PingCallbackEvent> {
    public static final PingCallbackEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PingCallbackEvent$$serializer pingCallbackEvent$$serializer = new PingCallbackEvent$$serializer();
        INSTANCE = pingCallbackEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.media.engine.video.events.PingCallbackEvent", pingCallbackEvent$$serializer, 5);
        pluginGeneratedSerialDescriptor.l("connectionId", false);
        pluginGeneratedSerialDescriptor.l("ping", false);
        pluginGeneratedSerialDescriptor.l("server", false);
        pluginGeneratedSerialDescriptor.l(ZeroconfModule.KEY_SERVICE_PORT, false);
        pluginGeneratedSerialDescriptor.l("seq", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PingCallbackEvent$$serializer() {
    }

    @Override // si.f0
    public KSerializer<?>[] childSerializers() {
        m0 m0Var = m0.f26305a;
        return new KSerializer[]{m0Var, m0Var, a2.f26230a, m0Var, m0Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public PingCallbackEvent deserialize(Decoder decoder) {
        int i10;
        int i11;
        String str;
        int i12;
        int i13;
        int i14;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        if (c10.y()) {
            i13 = c10.k(descriptor2, 0);
            i12 = c10.k(descriptor2, 1);
            str = c10.t(descriptor2, 2);
            i11 = c10.k(descriptor2, 3);
            i10 = c10.k(descriptor2, 4);
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
                int x10 = c10.x(descriptor2);
                if (x10 == -1) {
                    z10 = false;
                } else if (x10 == 0) {
                    i15 = c10.k(descriptor2, 0);
                    i19 |= 1;
                } else if (x10 == 1) {
                    i18 = c10.k(descriptor2, 1);
                    i19 |= 2;
                } else if (x10 == 2) {
                    str2 = c10.t(descriptor2, 2);
                    i19 |= 4;
                } else if (x10 == 3) {
                    i16 = c10.k(descriptor2, 3);
                    i19 |= 8;
                } else if (x10 == 4) {
                    i17 = c10.k(descriptor2, 4);
                    i19 |= 16;
                } else {
                    throw new n(x10);
                }
            }
            i13 = i15;
            i11 = i16;
            i10 = i17;
            str = str2;
            i12 = i18;
            i14 = i19;
        }
        c10.b(descriptor2);
        return new PingCallbackEvent(i14, i13, i12, str, i11, i10, null);
    }

    @Override // kotlinx.serialization.KSerializer, pi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, PingCallbackEvent value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        PingCallbackEvent.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // si.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
