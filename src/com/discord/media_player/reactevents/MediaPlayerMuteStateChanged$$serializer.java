package com.discord.media_player.reactevents;

import bj.AbstractC3644f0;
import bj.C3652h;
import bj.C3712x;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p449yi.C14447n;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/media_player/reactevents/MediaPlayerMuteStateChanged.$serializer", "Lbj/f0;", "Lcom/discord/media_player/reactevents/MediaPlayerMuteStateChanged;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "media_player_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class MediaPlayerMuteStateChanged$$serializer implements AbstractC3644f0<MediaPlayerMuteStateChanged> {
    public static final MediaPlayerMuteStateChanged$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MediaPlayerMuteStateChanged$$serializer mediaPlayerMuteStateChanged$$serializer = new MediaPlayerMuteStateChanged$$serializer();
        INSTANCE = mediaPlayerMuteStateChanged$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.media_player.reactevents.MediaPlayerMuteStateChanged", mediaPlayerMuteStateChanged$$serializer, 2);
        pluginGeneratedSerialDescriptor.m13841l("id", false);
        pluginGeneratedSerialDescriptor.m13841l("isMuted", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MediaPlayerMuteStateChanged$$serializer() {
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{C3712x.f6038a, C3652h.f5959a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public MediaPlayerMuteStateChanged deserialize(Decoder decoder) {
        boolean z;
        double d;
        int i;
        C9971q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC10248c b = decoder.mo13905b(descriptor2);
        if (b.mo13850p()) {
            d = b.mo13859F(descriptor2, 0);
            z = b.mo13861C(descriptor2, 1);
            i = 3;
        } else {
            double d2 = 0.0d;
            boolean z2 = true;
            boolean z3 = false;
            int i2 = 0;
            while (z2) {
                int o = b.mo13851o(descriptor2);
                if (o == -1) {
                    z2 = false;
                } else if (o == 0) {
                    d2 = b.mo13859F(descriptor2, 0);
                    i2 |= 1;
                } else if (o == 1) {
                    z3 = b.mo13861C(descriptor2, 1);
                    i2 |= 2;
                } else {
                    throw new C14447n(o);
                }
            }
            z = z3;
            i = i2;
            d = d2;
        }
        b.mo13857c(descriptor2);
        return new MediaPlayerMuteStateChanged(i, d, z, null);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, MediaPlayerMuteStateChanged value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        MediaPlayerMuteStateChanged.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC3644f0.C3645a.m33897a(this);
    }
}
