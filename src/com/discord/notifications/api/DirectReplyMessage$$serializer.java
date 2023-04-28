package com.discord.notifications.api;

import bj.AbstractC3644f0;
import bj.C3622a2;
import bj.C3676m0;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
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
import p469zi.C14667a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/notifications/api/DirectReplyMessage.$serializer", "Lbj/f0;", "Lcom/discord/notifications/api/DirectReplyMessage;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "notification_api_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class DirectReplyMessage$$serializer implements AbstractC3644f0<DirectReplyMessage> {
    public static final DirectReplyMessage$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        DirectReplyMessage$$serializer directReplyMessage$$serializer = new DirectReplyMessage$$serializer();
        INSTANCE = directReplyMessage$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.notifications.api.DirectReplyMessage", directReplyMessage$$serializer, 8);
        pluginGeneratedSerialDescriptor.m13841l("id", false);
        pluginGeneratedSerialDescriptor.m13841l("channel_id", false);
        pluginGeneratedSerialDescriptor.m13841l("author", false);
        pluginGeneratedSerialDescriptor.m13841l("content", true);
        pluginGeneratedSerialDescriptor.m13841l("type", true);
        pluginGeneratedSerialDescriptor.m13841l("channelType", true);
        pluginGeneratedSerialDescriptor.m13841l("channelName", true);
        pluginGeneratedSerialDescriptor.m13841l("guildName", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DirectReplyMessage$$serializer() {
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] childSerializers() {
        C3622a2 a2Var = C3622a2.f5917a;
        C3676m0 m0Var = C3676m0.f5992a;
        return new KSerializer[]{MessageId$$serializer.INSTANCE, ChannelId$$serializer.INSTANCE, DirectReplyUser$$serializer.INSTANCE, C14667a.m13u(a2Var), C14667a.m13u(m0Var), C14667a.m13u(m0Var), C14667a.m13u(a2Var), C14667a.m13u(a2Var)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public DirectReplyMessage deserialize(Decoder decoder) {
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        C9971q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC10248c b = decoder.mo13905b(descriptor2);
        int i2 = 7;
        int i3 = 6;
        Object obj9 = null;
        if (b.mo13850p()) {
            obj8 = b.mo13847y(descriptor2, 0, MessageId$$serializer.INSTANCE, null);
            obj = b.mo13847y(descriptor2, 1, ChannelId$$serializer.INSTANCE, null);
            obj2 = b.mo13847y(descriptor2, 2, DirectReplyUser$$serializer.INSTANCE, null);
            C3622a2 a2Var = C3622a2.f5917a;
            obj4 = b.mo13852n(descriptor2, 3, a2Var, null);
            C3676m0 m0Var = C3676m0.f5992a;
            obj3 = b.mo13852n(descriptor2, 4, m0Var, null);
            obj5 = b.mo13852n(descriptor2, 5, m0Var, null);
            obj6 = b.mo13852n(descriptor2, 6, a2Var, null);
            obj7 = b.mo13852n(descriptor2, 7, a2Var, null);
            i = 255;
        } else {
            boolean z = true;
            int i4 = 0;
            obj8 = null;
            Object obj10 = null;
            Object obj11 = null;
            Object obj12 = null;
            Object obj13 = null;
            Object obj14 = null;
            Object obj15 = null;
            while (z) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 0:
                        obj8 = b.mo13847y(descriptor2, 0, MessageId$$serializer.INSTANCE, obj8);
                        i4 |= 1;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 1:
                        obj15 = b.mo13847y(descriptor2, 1, ChannelId$$serializer.INSTANCE, obj15);
                        i4 |= 2;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 2:
                        obj10 = b.mo13847y(descriptor2, 2, DirectReplyUser$$serializer.INSTANCE, obj10);
                        i4 |= 4;
                        i2 = 7;
                        continue;
                    case 3:
                        obj14 = b.mo13852n(descriptor2, 3, C3622a2.f5917a, obj14);
                        i4 |= 8;
                        break;
                    case 4:
                        obj9 = b.mo13852n(descriptor2, 4, C3676m0.f5992a, obj9);
                        i4 |= 16;
                        break;
                    case 5:
                        obj13 = b.mo13852n(descriptor2, 5, C3676m0.f5992a, obj13);
                        i4 |= 32;
                        break;
                    case 6:
                        obj12 = b.mo13852n(descriptor2, i3, C3622a2.f5917a, obj12);
                        i4 |= 64;
                        break;
                    case 7:
                        obj11 = b.mo13852n(descriptor2, i2, C3622a2.f5917a, obj11);
                        i4 |= 128;
                        break;
                    default:
                        throw new C14447n(o);
                }
            }
            obj2 = obj10;
            obj3 = obj9;
            obj6 = obj12;
            obj5 = obj13;
            obj4 = obj14;
            i = i4;
            obj = obj15;
            obj7 = obj11;
        }
        b.mo13857c(descriptor2);
        MessageId messageId = (MessageId) obj8;
        return new DirectReplyMessage(i, messageId != null ? messageId.m42123unboximpl() : null, (ChannelId) obj, (DirectReplyUser) obj2, (String) obj4, (Integer) obj3, (Integer) obj5, (String) obj6, (String) obj7, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, DirectReplyMessage value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        DirectReplyMessage.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC3644f0.C3645a.m33897a(this);
    }
}
