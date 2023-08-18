package com.discord.chat.bridge.threads;

import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ti.n;
import ui.a;
import wi.a2;
import wi.f0;
import wi.h;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/threads/ThreadEmbed.$serializer", "Lwi/f0;", "Lcom/discord/chat/bridge/threads/ThreadEmbed;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class ThreadEmbed$$serializer implements f0<ThreadEmbed> {
    public static final ThreadEmbed$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        ThreadEmbed$$serializer threadEmbed$$serializer = new ThreadEmbed$$serializer();
        INSTANCE = threadEmbed$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.threads.ThreadEmbed", threadEmbed$$serializer, 6);
        pluginGeneratedSerialDescriptor.l("title", false);
        pluginGeneratedSerialDescriptor.l("messageCountLabel", false);
        pluginGeneratedSerialDescriptor.l("messagePreviewString", true);
        pluginGeneratedSerialDescriptor.l("archived", true);
        pluginGeneratedSerialDescriptor.l("archivedIconUrl", true);
        pluginGeneratedSerialDescriptor.l("referencedMessage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ThreadEmbed$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f29755a;
        return new KSerializer[]{a2Var, a2Var, a.u(a2Var), a.u(h.f29797a), a.u(a2Var), a.u(ThreadEmbedMessage$$serializer.INSTANCE)};
    }

    @Override 
    public ThreadEmbed deserialize(Decoder decoder) {
        String str;
        String str2;
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        String str3 = null;
        if (b10.p()) {
            str2 = b10.m(descriptor2, 0);
            str = b10.m(descriptor2, 1);
            a2 a2Var = a2.f29755a;
            obj = b10.n(descriptor2, 2, a2Var, null);
            obj3 = b10.n(descriptor2, 3, h.f29797a, null);
            obj2 = b10.n(descriptor2, 4, a2Var, null);
            obj4 = b10.n(descriptor2, 5, ThreadEmbedMessage$$serializer.INSTANCE, null);
            i10 = 63;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String str4 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            while (z10) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        str3 = b10.m(descriptor2, 0);
                        i11 |= 1;
                        continue;
                    case 1:
                        str4 = b10.m(descriptor2, 1);
                        i11 |= 2;
                        break;
                    case 2:
                        obj5 = b10.n(descriptor2, 2, a2.f29755a, obj5);
                        i11 |= 4;
                        break;
                    case 3:
                        obj6 = b10.n(descriptor2, 3, h.f29797a, obj6);
                        i11 |= 8;
                        break;
                    case 4:
                        obj7 = b10.n(descriptor2, 4, a2.f29755a, obj7);
                        i11 |= 16;
                        break;
                    case 5:
                        obj8 = b10.n(descriptor2, 5, ThreadEmbedMessage$$serializer.INSTANCE, obj8);
                        i11 |= 32;
                        break;
                    default:
                        throw new n(o10);
                }
            }
            obj = obj5;
            obj3 = obj6;
            obj2 = obj7;
            obj4 = obj8;
            str2 = str3;
            str = str4;
            i10 = i11;
        }
        b10.c(descriptor2);
        return new ThreadEmbed(i10, str2, str, (String) obj, (Boolean) obj3, (String) obj2, (ThreadEmbedMessage) obj4, (SerializationConstructorMarker) null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ThreadEmbed value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        ThreadEmbed.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
