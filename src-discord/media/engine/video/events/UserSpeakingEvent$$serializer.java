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

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/media/engine/video/events/UserSpeakingEvent.$serializer", "Lsi/f0;", "Lcom/discord/media/engine/video/events/UserSpeakingEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "media_engine_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class UserSpeakingEvent$$serializer implements f0<UserSpeakingEvent> {
    public static final UserSpeakingEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        UserSpeakingEvent$$serializer userSpeakingEvent$$serializer = new UserSpeakingEvent$$serializer();
        INSTANCE = userSpeakingEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.media.engine.video.events.UserSpeakingEvent", userSpeakingEvent$$serializer, 3);
        pluginGeneratedSerialDescriptor.l("connectionId", false);
        pluginGeneratedSerialDescriptor.l("userId", false);
        pluginGeneratedSerialDescriptor.l("isSpeaking", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UserSpeakingEvent$$serializer() {
    }

    @Override // si.f0
    public KSerializer<?>[] childSerializers() {
        m0 m0Var = m0.f26305a;
        return new KSerializer[]{m0Var, a2.f26230a, m0Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public UserSpeakingEvent deserialize(Decoder decoder) {
        int i10;
        String str;
        int i11;
        int i12;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        if (c10.y()) {
            i11 = c10.k(descriptor2, 0);
            str = c10.t(descriptor2, 1);
            i10 = c10.k(descriptor2, 2);
            i12 = 7;
        } else {
            String str2 = null;
            boolean z10 = true;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (z10) {
                int x10 = c10.x(descriptor2);
                if (x10 == -1) {
                    z10 = false;
                } else if (x10 == 0) {
                    i13 = c10.k(descriptor2, 0);
                    i15 |= 1;
                } else if (x10 == 1) {
                    str2 = c10.t(descriptor2, 1);
                    i15 |= 2;
                } else if (x10 == 2) {
                    i14 = c10.k(descriptor2, 2);
                    i15 |= 4;
                } else {
                    throw new n(x10);
                }
            }
            i11 = i13;
            i10 = i14;
            str = str2;
            i12 = i15;
        }
        c10.b(descriptor2);
        return new UserSpeakingEvent(i12, i11, str, i10, null);
    }

    @Override // kotlinx.serialization.KSerializer, pi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, UserSpeakingEvent value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        UserSpeakingEvent.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // si.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
