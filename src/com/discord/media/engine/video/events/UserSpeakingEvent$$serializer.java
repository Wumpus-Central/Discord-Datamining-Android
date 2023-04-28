package com.discord.media.engine.video.events;

import bj.AbstractC3644f0;
import bj.C3622a2;
import bj.C3676m0;
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

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/media/engine/video/events/UserSpeakingEvent.$serializer", "Lbj/f0;", "Lcom/discord/media/engine/video/events/UserSpeakingEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "media_engine_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class UserSpeakingEvent$$serializer implements AbstractC3644f0<UserSpeakingEvent> {
    public static final UserSpeakingEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        UserSpeakingEvent$$serializer userSpeakingEvent$$serializer = new UserSpeakingEvent$$serializer();
        INSTANCE = userSpeakingEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.media.engine.video.events.UserSpeakingEvent", userSpeakingEvent$$serializer, 3);
        pluginGeneratedSerialDescriptor.m13841l("connectionId", false);
        pluginGeneratedSerialDescriptor.m13841l("userId", false);
        pluginGeneratedSerialDescriptor.m13841l("isSpeaking", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UserSpeakingEvent$$serializer() {
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] childSerializers() {
        C3676m0 m0Var = C3676m0.f5992a;
        return new KSerializer[]{m0Var, C3622a2.f5917a, m0Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public UserSpeakingEvent deserialize(Decoder decoder) {
        int i;
        String str;
        int i2;
        int i3;
        C9971q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC10248c b = decoder.mo13905b(descriptor2);
        if (b.mo13850p()) {
            i2 = b.mo13855i(descriptor2, 0);
            str = b.mo13853m(descriptor2, 1);
            i = b.mo13855i(descriptor2, 2);
            i3 = 7;
        } else {
            String str2 = null;
            boolean z = true;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (z) {
                int o = b.mo13851o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    i4 = b.mo13855i(descriptor2, 0);
                    i6 |= 1;
                } else if (o == 1) {
                    str2 = b.mo13853m(descriptor2, 1);
                    i6 |= 2;
                } else if (o == 2) {
                    i5 = b.mo13855i(descriptor2, 2);
                    i6 |= 4;
                } else {
                    throw new C14447n(o);
                }
            }
            i2 = i4;
            i = i5;
            str = str2;
            i3 = i6;
        }
        b.mo13857c(descriptor2);
        return new UserSpeakingEvent(i3, i2, str, i, null);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, UserSpeakingEvent value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        UserSpeakingEvent.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC3644f0.C3645a.m33897a(this);
    }
}
