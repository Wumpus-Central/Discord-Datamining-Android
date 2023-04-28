package com.discord.chat.bridge.contentnode;

import bj.AbstractC3644f0;
import bj.C3622a2;
import bj.C3652h;
import bj.C3710w0;
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

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/contentnode/CustomEmojiContentNode.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/contentnode/CustomEmojiContentNode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class CustomEmojiContentNode$$serializer implements AbstractC3644f0<CustomEmojiContentNode> {
    public static final CustomEmojiContentNode$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CustomEmojiContentNode$$serializer customEmojiContentNode$$serializer = new CustomEmojiContentNode$$serializer();
        INSTANCE = customEmojiContentNode$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("customEmoji", customEmojiContentNode$$serializer, 5);
        pluginGeneratedSerialDescriptor.m13841l("id", false);
        pluginGeneratedSerialDescriptor.m13841l("alt", false);
        pluginGeneratedSerialDescriptor.m13841l("src", false);
        pluginGeneratedSerialDescriptor.m13841l("frozenSrc", false);
        pluginGeneratedSerialDescriptor.m13841l("jumboable", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CustomEmojiContentNode$$serializer() {
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] childSerializers() {
        C3622a2 a2Var = C3622a2.f5917a;
        return new KSerializer[]{C3710w0.f6033a, a2Var, a2Var, a2Var, C3652h.f5959a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public CustomEmojiContentNode deserialize(Decoder decoder) {
        boolean z;
        String str;
        String str2;
        String str3;
        long j;
        int i;
        C9971q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC10248c b = decoder.mo13905b(descriptor2);
        if (b.mo13850p()) {
            j = b.mo13856f(descriptor2, 0);
            str3 = b.mo13853m(descriptor2, 1);
            str2 = b.mo13853m(descriptor2, 2);
            str = b.mo13853m(descriptor2, 3);
            z = b.mo13861C(descriptor2, 4);
            i = 31;
        } else {
            long j2 = 0;
            String str4 = null;
            String str5 = null;
            boolean z2 = true;
            int i2 = 0;
            String str6 = null;
            boolean z3 = false;
            while (z2) {
                int o = b.mo13851o(descriptor2);
                if (o == -1) {
                    z2 = false;
                } else if (o == 0) {
                    j2 = b.mo13856f(descriptor2, 0);
                    i2 |= 1;
                } else if (o == 1) {
                    str4 = b.mo13853m(descriptor2, 1);
                    i2 |= 2;
                } else if (o == 2) {
                    str5 = b.mo13853m(descriptor2, 2);
                    i2 |= 4;
                } else if (o == 3) {
                    str6 = b.mo13853m(descriptor2, 3);
                    i2 |= 8;
                } else if (o == 4) {
                    z3 = b.mo13861C(descriptor2, 4);
                    i2 |= 16;
                } else {
                    throw new C14447n(o);
                }
            }
            str3 = str4;
            str = str6;
            z = z3;
            str2 = str5;
            i = i2;
            j = j2;
        }
        b.mo13857c(descriptor2);
        return new CustomEmojiContentNode(i, j, str3, str2, str, z, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, CustomEmojiContentNode value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        CustomEmojiContentNode.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC3644f0.C3645a.m33897a(this);
    }
}
