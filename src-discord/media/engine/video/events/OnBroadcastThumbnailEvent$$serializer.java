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
import qi.n;
import ti.a2;
import ti.f0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/media/engine/video/events/OnBroadcastThumbnailEvent.$serializer", "Lti/f0;", "Lcom/discord/media/engine/video/events/OnBroadcastThumbnailEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "media_engine_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class OnBroadcastThumbnailEvent$$serializer implements f0<OnBroadcastThumbnailEvent> {
    public static final OnBroadcastThumbnailEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        OnBroadcastThumbnailEvent$$serializer onBroadcastThumbnailEvent$$serializer = new OnBroadcastThumbnailEvent$$serializer();
        INSTANCE = onBroadcastThumbnailEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.media.engine.video.events.OnBroadcastThumbnailEvent", onBroadcastThumbnailEvent$$serializer, 1);
        pluginGeneratedSerialDescriptor.l("imgdata", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OnBroadcastThumbnailEvent$$serializer() {
    }

    @Override // ti.f0
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a2.f26939a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public OnBroadcastThumbnailEvent deserialize(Decoder decoder) {
        String str;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        int i10 = 1;
        if (c10.y()) {
            str = c10.t(descriptor2, 0);
        } else {
            int i11 = 0;
            str = null;
            while (i10 != 0) {
                int x10 = c10.x(descriptor2);
                if (x10 == -1) {
                    i10 = 0;
                } else if (x10 == 0) {
                    str = c10.t(descriptor2, 0);
                    i11 |= 1;
                } else {
                    throw new n(x10);
                }
            }
            i10 = i11;
        }
        c10.b(descriptor2);
        return new OnBroadcastThumbnailEvent(i10, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, qi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, OnBroadcastThumbnailEvent value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        OnBroadcastThumbnailEvent.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // ti.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
