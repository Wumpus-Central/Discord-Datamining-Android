package com.discord.chat.bridge.embed;

import bj.a2;
import bj.f0;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
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

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/embed/EmbedField.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/embed/EmbedField;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class EmbedField$$serializer implements f0<EmbedField> {
    public static final EmbedField$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        EmbedField$$serializer embedField$$serializer = new EmbedField$$serializer();
        INSTANCE = embedField$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.embed.EmbedField", embedField$$serializer, 4);
        pluginGeneratedSerialDescriptor.l("rawName", true);
        pluginGeneratedSerialDescriptor.l("rawValue", true);
        pluginGeneratedSerialDescriptor.l("name", true);
        pluginGeneratedSerialDescriptor.l("value", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EmbedField$$serializer() {
    }

    @Override // bj.f0
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f5917a;
        StructurableTextSerializer structurableTextSerializer = StructurableTextSerializer.INSTANCE;
        return new KSerializer[]{a.u(a2Var), a.u(a2Var), a.u(structurableTextSerializer), a.u(structurableTextSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public EmbedField deserialize(Decoder decoder) {
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        Object obj4 = null;
        if (b10.p()) {
            a2 a2Var = a2.f5917a;
            obj4 = b10.n(descriptor2, 0, a2Var, null);
            obj3 = b10.n(descriptor2, 1, a2Var, null);
            StructurableTextSerializer structurableTextSerializer = StructurableTextSerializer.INSTANCE;
            obj = b10.n(descriptor2, 2, structurableTextSerializer, null);
            obj2 = b10.n(descriptor2, 3, structurableTextSerializer, null);
            i10 = 15;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            while (z10) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z10 = false;
                } else if (o10 == 0) {
                    obj4 = b10.n(descriptor2, 0, a2.f5917a, obj4);
                    i11 |= 1;
                } else if (o10 == 1) {
                    obj5 = b10.n(descriptor2, 1, a2.f5917a, obj5);
                    i11 |= 2;
                } else if (o10 == 2) {
                    obj6 = b10.n(descriptor2, 2, StructurableTextSerializer.INSTANCE, obj6);
                    i11 |= 4;
                } else if (o10 == 3) {
                    obj7 = b10.n(descriptor2, 3, StructurableTextSerializer.INSTANCE, obj7);
                    i11 |= 8;
                } else {
                    throw new n(o10);
                }
            }
            i10 = i11;
            obj3 = obj5;
            obj = obj6;
            obj2 = obj7;
        }
        b10.c(descriptor2);
        return new EmbedField(i10, (String) obj4, (String) obj3, (StructurableText) obj, (StructurableText) obj2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, yi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, EmbedField value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        EmbedField.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // bj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
