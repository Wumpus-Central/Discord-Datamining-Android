package com.discord.media_player.reactevents;

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
import wi.f0;
import wi.w0;
import wi.x;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/media_player/reactevents/MediaPlayerProgress.$serializer", "Lwi/f0;", "Lcom/discord/media_player/reactevents/MediaPlayerProgress;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "media_player_release"}, k = 1, mv = {1, 8, 0})

public final class MediaPlayerProgress$$serializer implements f0<MediaPlayerProgress> {
    public static final MediaPlayerProgress$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        MediaPlayerProgress$$serializer mediaPlayerProgress$$serializer = new MediaPlayerProgress$$serializer();
        INSTANCE = mediaPlayerProgress$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.media_player.reactevents.MediaPlayerProgress", mediaPlayerProgress$$serializer, 3);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l("time", false);
        pluginGeneratedSerialDescriptor.l("duration", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MediaPlayerProgress$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        w0 w0Var = w0.f29874a;
        return new KSerializer[]{x.f29879a, w0Var, w0Var};
    }

    @Override 
    public MediaPlayerProgress deserialize(Decoder decoder) {
        long j10;
        long j11;
        double d10;
        int i10;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            d10 = b10.F(descriptor2, 0);
            j11 = b10.f(descriptor2, 1);
            j10 = b10.f(descriptor2, 2);
            i10 = 7;
        } else {
            double d11 = 0.0d;
            long j12 = 0;
            boolean z10 = true;
            int i11 = 0;
            long j13 = 0;
            while (z10) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z10 = false;
                } else if (o10 == 0) {
                    d11 = b10.F(descriptor2, 0);
                    i11 |= 1;
                } else if (o10 == 1) {
                    j13 = b10.f(descriptor2, 1);
                    i11 |= 2;
                } else if (o10 == 2) {
                    j12 = b10.f(descriptor2, 2);
                    i11 |= 4;
                } else {
                    throw new n(o10);
                }
            }
            i10 = i11;
            d10 = d11;
            j10 = j12;
            j11 = j13;
        }
        b10.c(descriptor2);
        return new MediaPlayerProgress(i10, d10, j11, j10, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, MediaPlayerProgress value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        MediaPlayerProgress.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
