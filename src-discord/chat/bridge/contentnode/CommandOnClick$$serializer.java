package com.discord.chat.bridge.contentnode;

import com.discord.chat.bridge.MessageType;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
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
import wj.a;
import yj.a2;
import yj.f0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/contentnode/CommandOnClick.$serializer", "Lyj/f0;", "Lcom/discord/chat/bridge/contentnode/CommandOnClick;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class CommandOnClick$$serializer implements f0<CommandOnClick> {
    public static final CommandOnClick$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CommandOnClick$$serializer commandOnClick$$serializer = new CommandOnClick$$serializer();
        INSTANCE = commandOnClick$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.CommandOnClick", commandOnClick$$serializer, 6);
        pluginGeneratedSerialDescriptor.l("action", true);
        pluginGeneratedSerialDescriptor.l("userId", true);
        pluginGeneratedSerialDescriptor.l("messageId", true);
        pluginGeneratedSerialDescriptor.l("applicationUserId", true);
        pluginGeneratedSerialDescriptor.l("messageType", true);
        pluginGeneratedSerialDescriptor.l("messageChannelId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CommandOnClick$$serializer() {
    }

    @Override // yj.f0
    public KSerializer<?>[] childSerializers() {
        UserId$$serializer userId$$serializer = UserId$$serializer.INSTANCE;
        return new KSerializer[]{a.u(a2.f32931a), a.u(userId$$serializer), a.u(MessageId$$serializer.INSTANCE), a.u(userId$$serializer), a.u(MessageType.Serializer.INSTANCE), a.u(ChannelId$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public CommandOnClick deserialize(Decoder decoder) {
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            obj6 = b10.n(descriptor2, 0, a2.f32931a, null);
            UserId$$serializer userId$$serializer = UserId$$serializer.INSTANCE;
            obj = b10.n(descriptor2, 1, userId$$serializer, null);
            obj2 = b10.n(descriptor2, 2, MessageId$$serializer.INSTANCE, null);
            obj4 = b10.n(descriptor2, 3, userId$$serializer, null);
            obj3 = b10.n(descriptor2, 4, MessageType.Serializer.INSTANCE, null);
            obj5 = b10.n(descriptor2, 5, ChannelId$$serializer.INSTANCE, null);
            i10 = 63;
        } else {
            boolean z10 = true;
            int i11 = 0;
            obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            while (z10) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        obj6 = b10.n(descriptor2, 0, a2.f32931a, obj6);
                        i11 |= 1;
                        break;
                    case 1:
                        obj11 = b10.n(descriptor2, 1, UserId$$serializer.INSTANCE, obj11);
                        i11 |= 2;
                        break;
                    case 2:
                        obj10 = b10.n(descriptor2, 2, MessageId$$serializer.INSTANCE, obj10);
                        i11 |= 4;
                        break;
                    case 3:
                        obj8 = b10.n(descriptor2, 3, UserId$$serializer.INSTANCE, obj8);
                        i11 |= 8;
                        break;
                    case 4:
                        obj9 = b10.n(descriptor2, 4, MessageType.Serializer.INSTANCE, obj9);
                        i11 |= 16;
                        break;
                    case 5:
                        obj7 = b10.n(descriptor2, 5, ChannelId$$serializer.INSTANCE, obj7);
                        i11 |= 32;
                        break;
                    default:
                        throw new n(o10);
                }
            }
            obj5 = obj7;
            obj4 = obj8;
            obj3 = obj9;
            obj2 = obj10;
            obj = obj11;
            i10 = i11;
        }
        b10.c(descriptor2);
        MessageId messageId = (MessageId) obj2;
        return new CommandOnClick(i10, (String) obj6, (UserId) obj, messageId != null ? messageId.m588unboximpl() : null, (UserId) obj4, (MessageType) obj3, (ChannelId) obj5, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, vj.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, CommandOnClick value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        CommandOnClick.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // yj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
