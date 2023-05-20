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
import uj.n;
import xj.e0;
import xj.f0;
import xj.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/media/engine/video/events/OnVoiceEvent.$serializer", "Lxj/f0;", "Lcom/discord/media/engine/video/events/OnVoiceEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "media_engine_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class OnVoiceEvent$$serializer implements f0<OnVoiceEvent> {
    public static final OnVoiceEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        OnVoiceEvent$$serializer onVoiceEvent$$serializer = new OnVoiceEvent$$serializer();
        INSTANCE = onVoiceEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.media.engine.video.events.OnVoiceEvent", onVoiceEvent$$serializer, 2);
        pluginGeneratedSerialDescriptor.l("level", false);
        pluginGeneratedSerialDescriptor.l("speaking", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OnVoiceEvent$$serializer() {
    }

    @Override // xj.f0
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{e0.f32334a, m0.f32384a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public OnVoiceEvent deserialize(Decoder decoder) {
        int i10;
        int i11;
        float f10;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            f10 = b10.u(descriptor2, 0);
            i11 = b10.i(descriptor2, 1);
            i10 = 3;
        } else {
            f10 = 0.0f;
            boolean z10 = true;
            int i12 = 0;
            int i13 = 0;
            while (z10) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z10 = false;
                } else if (o10 == 0) {
                    f10 = b10.u(descriptor2, 0);
                    i13 |= 1;
                } else if (o10 == 1) {
                    i12 = b10.i(descriptor2, 1);
                    i13 |= 2;
                } else {
                    throw new n(o10);
                }
            }
            i11 = i12;
            i10 = i13;
        }
        b10.c(descriptor2);
        return new OnVoiceEvent(i10, f10, i11, null);
    }

    @Override // kotlinx.serialization.KSerializer, uj.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, OnVoiceEvent value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        OnVoiceEvent.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // xj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
