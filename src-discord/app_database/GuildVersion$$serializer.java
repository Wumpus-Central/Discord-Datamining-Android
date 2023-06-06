package com.discord.app_database;

import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import vj.n;
import yj.a2;
import yj.f0;
import yj.w0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/app_database/GuildVersion.$serializer", "Lyj/f0;", "Lcom/discord/app_database/GuildVersion;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "app_database_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class GuildVersion$$serializer implements f0<GuildVersion> {
    public static final GuildVersion$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        GuildVersion$$serializer guildVersion$$serializer = new GuildVersion$$serializer();
        INSTANCE = guildVersion$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.app_database.GuildVersion", guildVersion$$serializer, 2);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l("version", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GuildVersion$$serializer() {
    }

    @Override // yj.f0
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a2.f32924a, w0.f33040a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public GuildVersion deserialize(Decoder decoder) {
        long j10;
        String str;
        int i10;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            str = b10.m(descriptor2, 0);
            j10 = b10.f(descriptor2, 1);
            i10 = 3;
        } else {
            String str2 = null;
            long j11 = 0;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z10 = false;
                } else if (o10 == 0) {
                    str2 = b10.m(descriptor2, 0);
                    i11 |= 1;
                } else if (o10 == 1) {
                    j11 = b10.f(descriptor2, 1);
                    i11 |= 2;
                } else {
                    throw new n(o10);
                }
            }
            str = str2;
            j10 = j11;
            i10 = i11;
        }
        b10.c(descriptor2);
        return new GuildVersion(i10, str, j10, null);
    }

    @Override // kotlinx.serialization.KSerializer, vj.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, GuildVersion value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        GuildVersion.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // yj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
