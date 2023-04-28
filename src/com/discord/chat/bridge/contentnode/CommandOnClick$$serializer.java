package com.discord.chat.bridge.contentnode;

import bj.AbstractC2522f0;
import bj.C2500a2;
import com.discord.chat.bridge.MessageType;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC9967c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p450yi.C14382n;
import p470zi.C14606a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/contentnode/CommandOnClick.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/contentnode/CommandOnClick;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class CommandOnClick$$serializer implements AbstractC2522f0<CommandOnClick> {
    public static final CommandOnClick$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CommandOnClick$$serializer commandOnClick$$serializer = new CommandOnClick$$serializer();
        INSTANCE = commandOnClick$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.CommandOnClick", commandOnClick$$serializer, 6);
        pluginGeneratedSerialDescriptor.m13841l("action", true);
        pluginGeneratedSerialDescriptor.m13841l("userId", true);
        pluginGeneratedSerialDescriptor.m13841l("messageId", true);
        pluginGeneratedSerialDescriptor.m13841l("applicationUserId", true);
        pluginGeneratedSerialDescriptor.m13841l("messageType", true);
        pluginGeneratedSerialDescriptor.m13841l("messageChannelId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CommandOnClick$$serializer() {
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] childSerializers() {
        UserId$$serializer userId$$serializer = UserId$$serializer.INSTANCE;
        return new KSerializer[]{C14606a.m13u(C2500a2.f6719a), C14606a.m13u(userId$$serializer), C14606a.m13u(MessageId$$serializer.INSTANCE), C14606a.m13u(userId$$serializer), C14606a.m13u(MessageType.Serializer.INSTANCE), C14606a.m13u(ChannelId$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public CommandOnClick deserialize(Decoder decoder) {
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        C9677q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC9967c b = decoder.mo13905b(descriptor2);
        if (b.mo13850p()) {
            obj6 = b.mo13852n(descriptor2, 0, C2500a2.f6719a, null);
            UserId$$serializer userId$$serializer = UserId$$serializer.INSTANCE;
            obj = b.mo13852n(descriptor2, 1, userId$$serializer, null);
            obj2 = b.mo13852n(descriptor2, 2, MessageId$$serializer.INSTANCE, null);
            obj4 = b.mo13852n(descriptor2, 3, userId$$serializer, null);
            obj3 = b.mo13852n(descriptor2, 4, MessageType.Serializer.INSTANCE, null);
            obj5 = b.mo13852n(descriptor2, 5, ChannelId$$serializer.INSTANCE, null);
            i = 63;
        } else {
            boolean z = true;
            int i2 = 0;
            obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            while (z) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        obj6 = b.mo13852n(descriptor2, 0, C2500a2.f6719a, obj6);
                        i2 |= 1;
                        break;
                    case 1:
                        obj11 = b.mo13852n(descriptor2, 1, UserId$$serializer.INSTANCE, obj11);
                        i2 |= 2;
                        break;
                    case 2:
                        obj10 = b.mo13852n(descriptor2, 2, MessageId$$serializer.INSTANCE, obj10);
                        i2 |= 4;
                        break;
                    case 3:
                        obj8 = b.mo13852n(descriptor2, 3, UserId$$serializer.INSTANCE, obj8);
                        i2 |= 8;
                        break;
                    case 4:
                        obj9 = b.mo13852n(descriptor2, 4, MessageType.Serializer.INSTANCE, obj9);
                        i2 |= 16;
                        break;
                    case 5:
                        obj7 = b.mo13852n(descriptor2, 5, ChannelId$$serializer.INSTANCE, obj7);
                        i2 |= 32;
                        break;
                    default:
                        throw new C14382n(o);
                }
            }
            obj5 = obj7;
            obj4 = obj8;
            obj3 = obj9;
            obj2 = obj10;
            obj = obj11;
            i = i2;
        }
        b.mo13857c(descriptor2);
        MessageId messageId = (MessageId) obj2;
        return new CommandOnClick(i, (String) obj6, (UserId) obj, messageId != null ? messageId.m42123unboximpl() : null, (UserId) obj4, (MessageType) obj3, (ChannelId) obj5, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, CommandOnClick value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        CommandOnClick.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC2522f0.C2523a.m33897a(this);
    }
}
