package com.discord.chat.bridge.reaction;

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
import pi.n;
import qi.a;
import si.f0;
import si.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/reaction/ReactionsTheme.$serializer", "Lsi/f0;", "Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class ReactionsTheme$$serializer implements f0<ReactionsTheme> {
    public static final ReactionsTheme$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        ReactionsTheme$$serializer reactionsTheme$$serializer = new ReactionsTheme$$serializer();
        INSTANCE = reactionsTheme$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.reaction.ReactionsTheme", reactionsTheme$$serializer, 6);
        pluginGeneratedSerialDescriptor.l("reactionBackgroundColor", true);
        pluginGeneratedSerialDescriptor.l("reactionBorderColor", true);
        pluginGeneratedSerialDescriptor.l("reactionTextColor", true);
        pluginGeneratedSerialDescriptor.l("activeReactionBackgroundColor", true);
        pluginGeneratedSerialDescriptor.l("activeReactionBorderColor", true);
        pluginGeneratedSerialDescriptor.l("activeReactionTextColor", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ReactionsTheme$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        m0 m0Var = m0.f26306a;
        return new KSerializer[]{a.u(m0Var), a.u(m0Var), a.u(m0Var), a.u(m0Var), a.u(m0Var), a.u(m0Var)};
    }

    @Override 
    public ReactionsTheme deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i10;
        Object obj6;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        int i11 = 5;
        Object obj7 = null;
        if (c10.y()) {
            m0 m0Var = m0.f26306a;
            obj2 = c10.v(descriptor2, 0, m0Var, null);
            obj3 = c10.v(descriptor2, 1, m0Var, null);
            obj4 = c10.v(descriptor2, 2, m0Var, null);
            obj = c10.v(descriptor2, 3, m0Var, null);
            obj5 = c10.v(descriptor2, 4, m0Var, null);
            obj6 = c10.v(descriptor2, 5, m0Var, null);
            i10 = 63;
        } else {
            boolean z10 = true;
            int i12 = 0;
            Object obj8 = null;
            Object obj9 = null;
            obj = null;
            Object obj10 = null;
            Object obj11 = null;
            while (z10) {
                int x10 = c10.x(descriptor2);
                switch (x10) {
                    case -1:
                        z10 = false;
                        i11 = 5;
                    case 0:
                        obj7 = c10.v(descriptor2, 0, m0.f26306a, obj7);
                        i12 |= 1;
                        i11 = 5;
                    case 1:
                        obj8 = c10.v(descriptor2, 1, m0.f26306a, obj8);
                        i12 |= 2;
                    case 2:
                        obj9 = c10.v(descriptor2, 2, m0.f26306a, obj9);
                        i12 |= 4;
                    case 3:
                        obj = c10.v(descriptor2, 3, m0.f26306a, obj);
                        i12 |= 8;
                    case 4:
                        obj10 = c10.v(descriptor2, 4, m0.f26306a, obj10);
                        i12 |= 16;
                    case 5:
                        obj11 = c10.v(descriptor2, i11, m0.f26306a, obj11);
                        i12 |= 32;
                    default:
                        throw new n(x10);
                }
            }
            i10 = i12;
            obj2 = obj7;
            obj3 = obj8;
            obj4 = obj9;
            obj5 = obj10;
            obj6 = obj11;
        }
        c10.b(descriptor2);
        return new ReactionsTheme(i10, (Integer) obj2, (Integer) obj3, (Integer) obj4, (Integer) obj, (Integer) obj5, (Integer) obj6, (SerializationConstructorMarker) null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ReactionsTheme value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        ReactionsTheme.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
