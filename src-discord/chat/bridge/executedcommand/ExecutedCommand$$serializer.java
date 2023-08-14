package com.discord.chat.bridge.executedcommand;

import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText;
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableTextSerializer;
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
import ti.n;
import ui.a;
import wi.a2;
import wi.f0;
import wi.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/executedcommand/ExecutedCommand.$serializer", "Lwi/f0;", "Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class ExecutedCommand$$serializer implements f0<ExecutedCommand> {
    public static final ExecutedCommand$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        ExecutedCommand$$serializer executedCommand$$serializer = new ExecutedCommand$$serializer();
        INSTANCE = executedCommand$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.executedcommand.ExecutedCommand", executedCommand$$serializer, 4);
        pluginGeneratedSerialDescriptor.l("userId", false);
        pluginGeneratedSerialDescriptor.l("usernameColor", false);
        pluginGeneratedSerialDescriptor.l("avatarURL", true);
        pluginGeneratedSerialDescriptor.l("content", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ExecutedCommand$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{UserId$$serializer.INSTANCE, m0.f29625a, a.u(a2.f29550a), AnnotatedStructurableTextSerializer.INSTANCE};
    }

    @Override 
    public ExecutedCommand deserialize(Decoder decoder) {
        int i10;
        int i11;
        Object obj;
        Object obj2;
        Object obj3;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        if (c10.y()) {
            obj3 = c10.m(descriptor2, 0, UserId$$serializer.INSTANCE, null);
            i10 = c10.k(descriptor2, 1);
            obj = c10.v(descriptor2, 2, a2.f29550a, null);
            obj2 = c10.m(descriptor2, 3, AnnotatedStructurableTextSerializer.INSTANCE, null);
            i11 = 15;
        } else {
            boolean z10 = true;
            int i12 = 0;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            int i13 = 0;
            while (z10) {
                int x10 = c10.x(descriptor2);
                if (x10 == -1) {
                    z10 = false;
                } else if (x10 == 0) {
                    obj4 = c10.m(descriptor2, 0, UserId$$serializer.INSTANCE, obj4);
                    i13 |= 1;
                } else if (x10 == 1) {
                    i12 = c10.k(descriptor2, 1);
                    i13 |= 2;
                } else if (x10 == 2) {
                    obj5 = c10.v(descriptor2, 2, a2.f29550a, obj5);
                    i13 |= 4;
                } else if (x10 == 3) {
                    obj6 = c10.m(descriptor2, 3, AnnotatedStructurableTextSerializer.INSTANCE, obj6);
                    i13 |= 8;
                } else {
                    throw new n(x10);
                }
            }
            i11 = i13;
            obj = obj5;
            obj2 = obj6;
            i10 = i12;
            obj3 = obj4;
        }
        c10.b(descriptor2);
        return new ExecutedCommand(i11, (UserId) obj3, i10, (String) obj, (AnnotatedStructurableText) obj2, null, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ExecutedCommand value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        ExecutedCommand.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
