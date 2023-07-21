package com.discord.chat.bridge.contentnode;

import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import java.util.List;
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
import si.f;
import si.f0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/contentnode/CommandMentionContentNode.$serializer", "Lsi/f0;", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class CommandMentionContentNode$$serializer implements f0<CommandMentionContentNode> {
    public static final CommandMentionContentNode$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        CommandMentionContentNode$$serializer commandMentionContentNode$$serializer = new CommandMentionContentNode$$serializer();
        INSTANCE = commandMentionContentNode$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("commandMention", commandMentionContentNode$$serializer, 5);
        pluginGeneratedSerialDescriptor.l("channelId", false);
        pluginGeneratedSerialDescriptor.l("commandId", false);
        pluginGeneratedSerialDescriptor.l("commandName", false);
        pluginGeneratedSerialDescriptor.l("commandKey", false);
        pluginGeneratedSerialDescriptor.l("content", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CommandMentionContentNode$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f26231a;
        return new KSerializer[]{ChannelId$$serializer.INSTANCE, a2Var, a2Var, a2Var, new f(ContentNodeSerializer.INSTANCE)};
    }

    @Override 
    public CommandMentionContentNode deserialize(Decoder decoder) {
        Object obj;
        String str;
        String str2;
        String str3;
        int i10;
        Object obj2;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        Object obj3 = null;
        if (c10.y()) {
            obj2 = c10.m(descriptor2, 0, ChannelId$$serializer.INSTANCE, null);
            str3 = c10.t(descriptor2, 1);
            str2 = c10.t(descriptor2, 2);
            str = c10.t(descriptor2, 3);
            obj = c10.m(descriptor2, 4, new f(ContentNodeSerializer.INSTANCE), null);
            i10 = 31;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            obj = null;
            while (z10) {
                int x10 = c10.x(descriptor2);
                if (x10 == -1) {
                    z10 = false;
                } else if (x10 == 0) {
                    obj3 = c10.m(descriptor2, 0, ChannelId$$serializer.INSTANCE, obj3);
                    i11 |= 1;
                } else if (x10 == 1) {
                    str4 = c10.t(descriptor2, 1);
                    i11 |= 2;
                } else if (x10 == 2) {
                    str5 = c10.t(descriptor2, 2);
                    i11 |= 4;
                } else if (x10 == 3) {
                    str6 = c10.t(descriptor2, 3);
                    i11 |= 8;
                } else if (x10 == 4) {
                    obj = c10.m(descriptor2, 4, new f(ContentNodeSerializer.INSTANCE), obj);
                    i11 |= 16;
                } else {
                    throw new n(x10);
                }
            }
            i10 = i11;
            obj2 = obj3;
            str3 = str4;
            str2 = str5;
            str = str6;
        }
        c10.b(descriptor2);
        return new CommandMentionContentNode(i10, (ChannelId) obj2, str3, str2, str, (List) obj, null, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, CommandMentionContentNode value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        CommandMentionContentNode.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
