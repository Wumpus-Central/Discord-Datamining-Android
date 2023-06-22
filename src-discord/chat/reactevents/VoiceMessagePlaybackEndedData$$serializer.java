package com.discord.chat.reactevents;

import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
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
import yj.e0;
import yj.f0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/reactevents/VoiceMessagePlaybackEndedData.$serializer", "Lyj/f0;", "Lcom/discord/chat/reactevents/VoiceMessagePlaybackEndedData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class VoiceMessagePlaybackEndedData$$serializer implements f0<VoiceMessagePlaybackEndedData> {
    public static final VoiceMessagePlaybackEndedData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        VoiceMessagePlaybackEndedData$$serializer voiceMessagePlaybackEndedData$$serializer = new VoiceMessagePlaybackEndedData$$serializer();
        INSTANCE = voiceMessagePlaybackEndedData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.VoiceMessagePlaybackEndedData", voiceMessagePlaybackEndedData$$serializer, 5);
        pluginGeneratedSerialDescriptor.l("messageId", false);
        pluginGeneratedSerialDescriptor.l("totalDurationSecs", false);
        pluginGeneratedSerialDescriptor.l("endDurationSecs", false);
        pluginGeneratedSerialDescriptor.l("senderUserId", false);
        pluginGeneratedSerialDescriptor.l("durationListeningSecs", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VoiceMessagePlaybackEndedData$$serializer() {
    }

    @Override // yj.f0
    public KSerializer<?>[] childSerializers() {
        e0 e0Var = e0.f32958a;
        return new KSerializer[]{MessageId$$serializer.INSTANCE, e0Var, e0Var, UserId$$serializer.INSTANCE, e0Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public VoiceMessagePlaybackEndedData deserialize(Decoder decoder) {
        float f10;
        float f11;
        float f12;
        int i10;
        Object obj;
        Object obj2;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            obj2 = b10.y(descriptor2, 0, MessageId$$serializer.INSTANCE, null);
            f12 = b10.u(descriptor2, 1);
            f11 = b10.u(descriptor2, 2);
            obj = b10.y(descriptor2, 3, UserId$$serializer.INSTANCE, null);
            f10 = b10.u(descriptor2, 4);
            i10 = 31;
        } else {
            f10 = 0.0f;
            float f13 = 0.0f;
            float f14 = 0.0f;
            boolean z10 = true;
            int i11 = 0;
            obj2 = null;
            Object obj3 = null;
            while (z10) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z10 = false;
                } else if (o10 == 0) {
                    obj2 = b10.y(descriptor2, 0, MessageId$$serializer.INSTANCE, obj2);
                    i11 |= 1;
                } else if (o10 == 1) {
                    f14 = b10.u(descriptor2, 1);
                    i11 |= 2;
                } else if (o10 == 2) {
                    f13 = b10.u(descriptor2, 2);
                    i11 |= 4;
                } else if (o10 == 3) {
                    obj3 = b10.y(descriptor2, 3, UserId$$serializer.INSTANCE, obj3);
                    i11 |= 8;
                } else if (o10 == 4) {
                    f10 = b10.u(descriptor2, 4);
                    i11 |= 16;
                } else {
                    throw new n(o10);
                }
            }
            obj = obj3;
            f11 = f13;
            f12 = f14;
            i10 = i11;
        }
        b10.c(descriptor2);
        MessageId messageId = (MessageId) obj2;
        return new VoiceMessagePlaybackEndedData(i10, messageId != null ? messageId.m597unboximpl() : null, f12, f11, (UserId) obj, f10, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, vj.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, VoiceMessagePlaybackEndedData value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        VoiceMessagePlaybackEndedData.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // yj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
