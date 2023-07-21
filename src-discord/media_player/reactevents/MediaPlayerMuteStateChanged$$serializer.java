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
import pi.n;
import si.f0;
import si.h;
import si.x;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/media_player/reactevents/MediaPlayerMuteStateChanged.$serializer", "Lsi/f0;", "Lcom/discord/media_player/reactevents/MediaPlayerMuteStateChanged;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "media_player_release"}, k = 1, mv = {1, 8, 0})

public final class MediaPlayerMuteStateChanged$$serializer implements f0<MediaPlayerMuteStateChanged> {
    public static final MediaPlayerMuteStateChanged$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        MediaPlayerMuteStateChanged$$serializer mediaPlayerMuteStateChanged$$serializer = new MediaPlayerMuteStateChanged$$serializer();
        INSTANCE = mediaPlayerMuteStateChanged$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.media_player.reactevents.MediaPlayerMuteStateChanged", mediaPlayerMuteStateChanged$$serializer, 2);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l("isMuted", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MediaPlayerMuteStateChanged$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{x.f26352a, h.f26273a};
    }

    @Override 
    public MediaPlayerMuteStateChanged deserialize(Decoder decoder) {
        boolean z10;
        double d10;
        int i10;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        if (c10.y()) {
            d10 = c10.A(descriptor2, 0);
            z10 = c10.s(descriptor2, 1);
            i10 = 3;
        } else {
            double d11 = 0.0d;
            boolean z11 = true;
            boolean z12 = false;
            int i11 = 0;
            while (z11) {
                int x10 = c10.x(descriptor2);
                if (x10 == -1) {
                    z11 = false;
                } else if (x10 == 0) {
                    d11 = c10.A(descriptor2, 0);
                    i11 |= 1;
                } else if (x10 == 1) {
                    z12 = c10.s(descriptor2, 1);
                    i11 |= 2;
                } else {
                    throw new n(x10);
                }
            }
            z10 = z12;
            i10 = i11;
            d10 = d11;
        }
        c10.b(descriptor2);
        return new MediaPlayerMuteStateChanged(i10, d10, z10, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, MediaPlayerMuteStateChanged value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        MediaPlayerMuteStateChanged.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
