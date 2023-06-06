package com.discord.chat.bridge.contentnode;

import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
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
import wj.a;
import yj.a2;
import yj.f0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/contentnode/HandleSurveyMessage.$serializer", "Lyj/f0;", "Lcom/discord/chat/bridge/contentnode/HandleSurveyMessage;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class HandleSurveyMessage$$serializer implements f0<HandleSurveyMessage> {
    public static final HandleSurveyMessage$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        HandleSurveyMessage$$serializer handleSurveyMessage$$serializer = new HandleSurveyMessage$$serializer();
        INSTANCE = handleSurveyMessage$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.HandleSurveyMessage", handleSurveyMessage$$serializer, 3);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l("channel_id", false);
        pluginGeneratedSerialDescriptor.l("loggingName", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HandleSurveyMessage$$serializer() {
    }

    @Override // yj.f0
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{MessageId$$serializer.INSTANCE, ChannelId$$serializer.INSTANCE, a.u(a2.f32924a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public HandleSurveyMessage deserialize(Decoder decoder) {
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        String str = null;
        if (b10.p()) {
            obj3 = b10.y(descriptor2, 0, MessageId$$serializer.INSTANCE, null);
            obj = b10.y(descriptor2, 1, ChannelId$$serializer.INSTANCE, null);
            obj2 = b10.n(descriptor2, 2, a2.f32924a, null);
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            while (z10) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z10 = false;
                } else if (o10 == 0) {
                    obj3 = b10.y(descriptor2, 0, MessageId$$serializer.INSTANCE, obj3);
                    i11 |= 1;
                } else if (o10 == 1) {
                    obj5 = b10.y(descriptor2, 1, ChannelId$$serializer.INSTANCE, obj5);
                    i11 |= 2;
                } else if (o10 == 2) {
                    obj4 = b10.n(descriptor2, 2, a2.f32924a, obj4);
                    i11 |= 4;
                } else {
                    throw new n(o10);
                }
            }
            obj2 = obj4;
            obj = obj5;
            i10 = i11;
        }
        b10.c(descriptor2);
        MessageId messageId = (MessageId) obj3;
        if (messageId != null) {
            str = messageId.m580unboximpl();
        }
        return new HandleSurveyMessage(i10, str, (ChannelId) obj, (String) obj2, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, vj.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, HandleSurveyMessage value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        HandleSurveyMessage.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // yj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
