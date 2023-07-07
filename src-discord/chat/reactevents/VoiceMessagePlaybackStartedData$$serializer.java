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
import qi.n;
import ti.e0;
import ti.f0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/reactevents/VoiceMessagePlaybackStartedData.$serializer", "Lti/f0;", "Lcom/discord/chat/reactevents/VoiceMessagePlaybackStartedData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class VoiceMessagePlaybackStartedData$$serializer implements f0<VoiceMessagePlaybackStartedData> {
    public static final VoiceMessagePlaybackStartedData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        VoiceMessagePlaybackStartedData$$serializer voiceMessagePlaybackStartedData$$serializer = new VoiceMessagePlaybackStartedData$$serializer();
        INSTANCE = voiceMessagePlaybackStartedData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.VoiceMessagePlaybackStartedData", voiceMessagePlaybackStartedData$$serializer, 4);
        pluginGeneratedSerialDescriptor.l("messageId", false);
        pluginGeneratedSerialDescriptor.l("totalDurationSecs", false);
        pluginGeneratedSerialDescriptor.l("startDurationSecs", false);
        pluginGeneratedSerialDescriptor.l("senderUserId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VoiceMessagePlaybackStartedData$$serializer() {
    }

    @Override // ti.f0
    public KSerializer<?>[] childSerializers() {
        e0 e0Var = e0.f26997a;
        return new KSerializer[]{MessageId$$serializer.INSTANCE, e0Var, e0Var, UserId$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public VoiceMessagePlaybackStartedData deserialize(Decoder decoder) {
        float f10;
        float f11;
        int i10;
        Object obj;
        Object obj2;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        String str = null;
        if (c10.y()) {
            obj2 = c10.m(descriptor2, 0, MessageId$$serializer.INSTANCE, null);
            f11 = c10.G(descriptor2, 1);
            f10 = c10.G(descriptor2, 2);
            obj = c10.m(descriptor2, 3, UserId$$serializer.INSTANCE, null);
            i10 = 15;
        } else {
            float f12 = 0.0f;
            float f13 = 0.0f;
            boolean z10 = true;
            int i11 = 0;
            obj2 = null;
            Object obj3 = null;
            while (z10) {
                int x10 = c10.x(descriptor2);
                if (x10 == -1) {
                    z10 = false;
                } else if (x10 == 0) {
                    obj2 = c10.m(descriptor2, 0, MessageId$$serializer.INSTANCE, obj2);
                    i11 |= 1;
                } else if (x10 == 1) {
                    f13 = c10.G(descriptor2, 1);
                    i11 |= 2;
                } else if (x10 == 2) {
                    f12 = c10.G(descriptor2, 2);
                    i11 |= 4;
                } else if (x10 == 3) {
                    obj3 = c10.m(descriptor2, 3, UserId$$serializer.INSTANCE, obj3);
                    i11 |= 8;
                } else {
                    throw new n(x10);
                }
            }
            obj = obj3;
            f10 = f12;
            i10 = i11;
            f11 = f13;
        }
        c10.b(descriptor2);
        MessageId messageId = (MessageId) obj2;
        if (messageId != null) {
            str = messageId.m598unboximpl();
        }
        return new VoiceMessagePlaybackStartedData(i10, str, f11, f10, (UserId) obj, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, qi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, VoiceMessagePlaybackStartedData value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        VoiceMessagePlaybackStartedData.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // ti.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
