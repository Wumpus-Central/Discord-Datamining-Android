package com.discord.chat.bridge.botuikit;

import bj.a2;
import bj.f0;
import bj.h;
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
import yi.n;
import zi.a;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/botuikit/ComponentEmoji.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/botuikit/ComponentEmoji;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ComponentEmoji$$serializer implements f0<ComponentEmoji> {
    public static final ComponentEmoji$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ComponentEmoji$$serializer componentEmoji$$serializer = new ComponentEmoji$$serializer();
        INSTANCE = componentEmoji$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.botuikit.ComponentEmoji", componentEmoji$$serializer, 5);
        pluginGeneratedSerialDescriptor.l("id", true);
        pluginGeneratedSerialDescriptor.l("name", false);
        pluginGeneratedSerialDescriptor.l("src", true);
        pluginGeneratedSerialDescriptor.l("animated", true);
        pluginGeneratedSerialDescriptor.l("surrogates", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ComponentEmoji$$serializer() {
    }

    @Override // bj.f0
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f5917a;
        return new KSerializer[]{a.u(a2Var), a2Var, a.u(a2Var), h.f5959a, a.u(a2Var)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ComponentEmoji deserialize(Decoder decoder) {
        boolean z10;
        Object obj;
        String str;
        Object obj2;
        int i10;
        Object obj3;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            a2 a2Var = a2.f5917a;
            obj = b10.n(descriptor2, 0, a2Var, null);
            str = b10.m(descriptor2, 1);
            obj2 = b10.n(descriptor2, 2, a2Var, null);
            z10 = b10.C(descriptor2, 3);
            obj3 = b10.n(descriptor2, 4, a2Var, null);
            i10 = 31;
        } else {
            boolean z11 = true;
            boolean z12 = false;
            Object obj4 = null;
            String str2 = null;
            Object obj5 = null;
            Object obj6 = null;
            int i11 = 0;
            while (z11) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z11 = false;
                } else if (o10 == 0) {
                    obj4 = b10.n(descriptor2, 0, a2.f5917a, obj4);
                    i11 |= 1;
                } else if (o10 == 1) {
                    str2 = b10.m(descriptor2, 1);
                    i11 |= 2;
                } else if (o10 == 2) {
                    obj5 = b10.n(descriptor2, 2, a2.f5917a, obj5);
                    i11 |= 4;
                } else if (o10 == 3) {
                    z12 = b10.C(descriptor2, 3);
                    i11 |= 8;
                } else if (o10 == 4) {
                    obj6 = b10.n(descriptor2, 4, a2.f5917a, obj6);
                    i11 |= 16;
                } else {
                    throw new n(o10);
                }
            }
            i10 = i11;
            obj = obj4;
            str = str2;
            obj2 = obj5;
            z10 = z12;
            obj3 = obj6;
        }
        b10.c(descriptor2);
        return new ComponentEmoji(i10, (String) obj, str, (String) obj2, z10, (String) obj3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, yi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ComponentEmoji value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        ComponentEmoji.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // bj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
