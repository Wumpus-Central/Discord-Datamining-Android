package com.discord.media.engine.video.events;

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
import si.w0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/media/engine/video/events/FirstFrameCallbackEvent.$serializer", "Lsi/f0;", "Lcom/discord/media/engine/video/events/FirstFrameCallbackEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "media_engine_release"}, k = 1, mv = {1, 8, 0})

public final class FirstFrameCallbackEvent$$serializer implements f0<FirstFrameCallbackEvent> {
    public static final FirstFrameCallbackEvent$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        FirstFrameCallbackEvent$$serializer firstFrameCallbackEvent$$serializer = new FirstFrameCallbackEvent$$serializer();
        INSTANCE = firstFrameCallbackEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.media.engine.video.events.FirstFrameCallbackEvent", firstFrameCallbackEvent$$serializer, 4);
        pluginGeneratedSerialDescriptor.l("connectionId", false);
        pluginGeneratedSerialDescriptor.l("userId", false);
        pluginGeneratedSerialDescriptor.l("ssrc", false);
        pluginGeneratedSerialDescriptor.l("streamId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FirstFrameCallbackEvent$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f26233a;
        return new KSerializer[]{m0.f26308a, a2Var, w0.f26349a, a2Var};
    }

    @Override 
    public FirstFrameCallbackEvent deserialize(Decoder decoder) {
        String str;
        long j10;
        String str2;
        int i10;
        int i11;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        if (c10.y()) {
            i10 = c10.k(descriptor2, 0);
            str2 = c10.t(descriptor2, 1);
            j10 = c10.h(descriptor2, 2);
            str = c10.t(descriptor2, 3);
            i11 = 15;
        } else {
            String str3 = null;
            long j11 = 0;
            boolean z10 = true;
            String str4 = null;
            int i12 = 0;
            int i13 = 0;
            while (z10) {
                int x10 = c10.x(descriptor2);
                if (x10 == -1) {
                    z10 = false;
                } else if (x10 == 0) {
                    i12 = c10.k(descriptor2, 0);
                    i13 |= 1;
                } else if (x10 == 1) {
                    str3 = c10.t(descriptor2, 1);
                    i13 |= 2;
                } else if (x10 == 2) {
                    j11 = c10.h(descriptor2, 2);
                    i13 |= 4;
                } else if (x10 == 3) {
                    str4 = c10.t(descriptor2, 3);
                    i13 |= 8;
                } else {
                    throw new n(x10);
                }
            }
            i10 = i12;
            str = str4;
            i11 = i13;
            str2 = str3;
            j10 = j11;
        }
        c10.b(descriptor2);
        return new FirstFrameCallbackEvent(i11, i10, str2, j10, str, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, FirstFrameCallbackEvent value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        FirstFrameCallbackEvent.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
