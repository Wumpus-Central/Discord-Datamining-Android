package com.discord.chat.reactevents;

import bj.AbstractC3644f0;
import bj.C3640e0;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
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

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/reactevents/VoiceMessagePlaybackEndedData.$serializer", "Lbj/f0;", "Lcom/discord/chat/reactevents/VoiceMessagePlaybackEndedData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class VoiceMessagePlaybackEndedData$$serializer implements AbstractC3644f0<VoiceMessagePlaybackEndedData> {
    public static final VoiceMessagePlaybackEndedData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        VoiceMessagePlaybackEndedData$$serializer voiceMessagePlaybackEndedData$$serializer = new VoiceMessagePlaybackEndedData$$serializer();
        INSTANCE = voiceMessagePlaybackEndedData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.VoiceMessagePlaybackEndedData", voiceMessagePlaybackEndedData$$serializer, 4);
        pluginGeneratedSerialDescriptor.m13841l("messageId", false);
        pluginGeneratedSerialDescriptor.m13841l("totalDurationSecs", false);
        pluginGeneratedSerialDescriptor.m13841l("endDurationSecs", false);
        pluginGeneratedSerialDescriptor.m13841l("senderUserId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VoiceMessagePlaybackEndedData$$serializer() {
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] childSerializers() {
        C3640e0 e0Var = C3640e0.f5942a;
        return new KSerializer[]{MessageId$$serializer.INSTANCE, e0Var, e0Var, UserId$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public VoiceMessagePlaybackEndedData deserialize(Decoder decoder) {
        float f;
        float f2;
        int i;
        Object obj;
        Object obj2;
        C9971q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC10248c b = decoder.mo13905b(descriptor2);
        String str = null;
        if (b.mo13850p()) {
            obj2 = b.mo13847y(descriptor2, 0, MessageId$$serializer.INSTANCE, null);
            f2 = b.mo13848u(descriptor2, 1);
            f = b.mo13848u(descriptor2, 2);
            obj = b.mo13847y(descriptor2, 3, UserId$$serializer.INSTANCE, null);
            i = 15;
        } else {
            float f3 = 0.0f;
            float f4 = 0.0f;
            boolean z = true;
            int i2 = 0;
            obj2 = null;
            Object obj3 = null;
            while (z) {
                int o = b.mo13851o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    obj2 = b.mo13847y(descriptor2, 0, MessageId$$serializer.INSTANCE, obj2);
                    i2 |= 1;
                } else if (o == 1) {
                    f4 = b.mo13848u(descriptor2, 1);
                    i2 |= 2;
                } else if (o == 2) {
                    f3 = b.mo13848u(descriptor2, 2);
                    i2 |= 4;
                } else if (o == 3) {
                    obj3 = b.mo13847y(descriptor2, 3, UserId$$serializer.INSTANCE, obj3);
                    i2 |= 8;
                } else {
                    throw new C14447n(o);
                }
            }
            obj = obj3;
            f = f3;
            i = i2;
            f2 = f4;
        }
        b.mo13857c(descriptor2);
        MessageId messageId = (MessageId) obj2;
        if (messageId != null) {
            str = messageId.m42123unboximpl();
        }
        return new VoiceMessagePlaybackEndedData(i, str, f2, f, (UserId) obj, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, VoiceMessagePlaybackEndedData value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        VoiceMessagePlaybackEndedData.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC3644f0.C3645a.m33897a(this);
    }
}
