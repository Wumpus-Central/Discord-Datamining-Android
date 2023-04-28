package com.discord.chat.bridge.embed;

import bj.AbstractC3644f0;
import bj.C3622a2;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p449yi.C14447n;
import p469zi.C14667a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/embed/EmbedField.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/embed/EmbedField;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class EmbedField$$serializer implements AbstractC3644f0<EmbedField> {
    public static final EmbedField$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        EmbedField$$serializer embedField$$serializer = new EmbedField$$serializer();
        INSTANCE = embedField$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.embed.EmbedField", embedField$$serializer, 4);
        pluginGeneratedSerialDescriptor.m13841l("rawName", true);
        pluginGeneratedSerialDescriptor.m13841l("rawValue", true);
        pluginGeneratedSerialDescriptor.m13841l("name", true);
        pluginGeneratedSerialDescriptor.m13841l("value", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EmbedField$$serializer() {
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] childSerializers() {
        C3622a2 a2Var = C3622a2.f5917a;
        StructurableTextSerializer structurableTextSerializer = StructurableTextSerializer.INSTANCE;
        return new KSerializer[]{C14667a.m13u(a2Var), C14667a.m13u(a2Var), C14667a.m13u(structurableTextSerializer), C14667a.m13u(structurableTextSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public EmbedField deserialize(Decoder decoder) {
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        C9971q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC10248c b = decoder.mo13905b(descriptor2);
        Object obj4 = null;
        if (b.mo13850p()) {
            C3622a2 a2Var = C3622a2.f5917a;
            obj4 = b.mo13852n(descriptor2, 0, a2Var, null);
            obj3 = b.mo13852n(descriptor2, 1, a2Var, null);
            StructurableTextSerializer structurableTextSerializer = StructurableTextSerializer.INSTANCE;
            obj = b.mo13852n(descriptor2, 2, structurableTextSerializer, null);
            obj2 = b.mo13852n(descriptor2, 3, structurableTextSerializer, null);
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            while (z) {
                int o = b.mo13851o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    obj4 = b.mo13852n(descriptor2, 0, C3622a2.f5917a, obj4);
                    i2 |= 1;
                } else if (o == 1) {
                    obj5 = b.mo13852n(descriptor2, 1, C3622a2.f5917a, obj5);
                    i2 |= 2;
                } else if (o == 2) {
                    obj6 = b.mo13852n(descriptor2, 2, StructurableTextSerializer.INSTANCE, obj6);
                    i2 |= 4;
                } else if (o == 3) {
                    obj7 = b.mo13852n(descriptor2, 3, StructurableTextSerializer.INSTANCE, obj7);
                    i2 |= 8;
                } else {
                    throw new C14447n(o);
                }
            }
            i = i2;
            obj3 = obj5;
            obj = obj6;
            obj2 = obj7;
        }
        b.mo13857c(descriptor2);
        return new EmbedField(i, (String) obj4, (String) obj3, (StructurableText) obj, (StructurableText) obj2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, EmbedField value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        EmbedField.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC3644f0.C3645a.m33897a(this);
    }
}
