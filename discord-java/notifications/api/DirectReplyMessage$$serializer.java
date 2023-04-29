package com.discord.notifications.api;

import bj.a2;
import bj.f0;
import bj.m0;
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
import yi.n;
import zi.a;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/notifications/api/DirectReplyMessage.$serializer", "Lbj/f0;", "Lcom/discord/notifications/api/DirectReplyMessage;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "notification_api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class DirectReplyMessage$$serializer implements f0<DirectReplyMessage> {
    public static final DirectReplyMessage$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        DirectReplyMessage$$serializer directReplyMessage$$serializer = new DirectReplyMessage$$serializer();
        INSTANCE = directReplyMessage$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.notifications.api.DirectReplyMessage", directReplyMessage$$serializer, 8);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l("channel_id", false);
        pluginGeneratedSerialDescriptor.l("author", false);
        pluginGeneratedSerialDescriptor.l("content", true);
        pluginGeneratedSerialDescriptor.l("type", true);
        pluginGeneratedSerialDescriptor.l("channelType", true);
        pluginGeneratedSerialDescriptor.l("channelName", true);
        pluginGeneratedSerialDescriptor.l("guildName", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DirectReplyMessage$$serializer() {
    }

    @Override // bj.f0
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f5917a;
        m0 m0Var = m0.f5992a;
        return new KSerializer[]{MessageId$$serializer.INSTANCE, ChannelId$$serializer.INSTANCE, DirectReplyUser$$serializer.INSTANCE, a.u(a2Var), a.u(m0Var), a.u(m0Var), a.u(a2Var), a.u(a2Var)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public DirectReplyMessage deserialize(Decoder decoder) {
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        int i11 = 7;
        int i12 = 6;
        Object obj9 = null;
        if (b10.p()) {
            obj8 = b10.y(descriptor2, 0, MessageId$$serializer.INSTANCE, null);
            obj = b10.y(descriptor2, 1, ChannelId$$serializer.INSTANCE, null);
            obj2 = b10.y(descriptor2, 2, DirectReplyUser$$serializer.INSTANCE, null);
            a2 a2Var = a2.f5917a;
            obj4 = b10.n(descriptor2, 3, a2Var, null);
            m0 m0Var = m0.f5992a;
            obj3 = b10.n(descriptor2, 4, m0Var, null);
            obj5 = b10.n(descriptor2, 5, m0Var, null);
            obj6 = b10.n(descriptor2, 6, a2Var, null);
            obj7 = b10.n(descriptor2, 7, a2Var, null);
            i10 = 255;
        } else {
            boolean z10 = true;
            int i13 = 0;
            obj8 = null;
            Object obj10 = null;
            Object obj11 = null;
            Object obj12 = null;
            Object obj13 = null;
            Object obj14 = null;
            Object obj15 = null;
            while (z10) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z10 = false;
                        i11 = 7;
                        i12 = 6;
                        break;
                    case 0:
                        obj8 = b10.y(descriptor2, 0, MessageId$$serializer.INSTANCE, obj8);
                        i13 |= 1;
                        i11 = 7;
                        i12 = 6;
                        break;
                    case 1:
                        obj15 = b10.y(descriptor2, 1, ChannelId$$serializer.INSTANCE, obj15);
                        i13 |= 2;
                        i11 = 7;
                        i12 = 6;
                        break;
                    case 2:
                        obj10 = b10.y(descriptor2, 2, DirectReplyUser$$serializer.INSTANCE, obj10);
                        i13 |= 4;
                        i11 = 7;
                        continue;
                    case 3:
                        obj14 = b10.n(descriptor2, 3, a2.f5917a, obj14);
                        i13 |= 8;
                        break;
                    case 4:
                        obj9 = b10.n(descriptor2, 4, m0.f5992a, obj9);
                        i13 |= 16;
                        break;
                    case 5:
                        obj13 = b10.n(descriptor2, 5, m0.f5992a, obj13);
                        i13 |= 32;
                        break;
                    case 6:
                        obj12 = b10.n(descriptor2, i12, a2.f5917a, obj12);
                        i13 |= 64;
                        break;
                    case 7:
                        obj11 = b10.n(descriptor2, i11, a2.f5917a, obj11);
                        i13 |= 128;
                        break;
                    default:
                        throw new n(o10);
                }
            }
            obj2 = obj10;
            obj3 = obj9;
            obj6 = obj12;
            obj5 = obj13;
            obj4 = obj14;
            i10 = i13;
            obj = obj15;
            obj7 = obj11;
        }
        b10.c(descriptor2);
        MessageId messageId = (MessageId) obj8;
        return new DirectReplyMessage(i10, messageId != null ? messageId.m566unboximpl() : null, (ChannelId) obj, (DirectReplyUser) obj2, (String) obj4, (Integer) obj3, (Integer) obj5, (String) obj6, (String) obj7, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, yi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, DirectReplyMessage value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        DirectReplyMessage.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // bj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}