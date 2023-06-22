package com.discord.chat.bridge.contentnode;

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
import vj.n;
import yj.a2;
import yj.f0;
import yj.h;
import yj.w0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/contentnode/CustomEmojiContentNode.$serializer", "Lyj/f0;", "Lcom/discord/chat/bridge/contentnode/CustomEmojiContentNode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class CustomEmojiContentNode$$serializer implements f0<CustomEmojiContentNode> {
    public static final CustomEmojiContentNode$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CustomEmojiContentNode$$serializer customEmojiContentNode$$serializer = new CustomEmojiContentNode$$serializer();
        INSTANCE = customEmojiContentNode$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("customEmoji", customEmojiContentNode$$serializer, 5);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l("alt", false);
        pluginGeneratedSerialDescriptor.l("src", false);
        pluginGeneratedSerialDescriptor.l("frozenSrc", false);
        pluginGeneratedSerialDescriptor.l("jumboable", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CustomEmojiContentNode$$serializer() {
    }

    @Override // yj.f0
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f32933a;
        return new KSerializer[]{w0.f33049a, a2Var, a2Var, a2Var, h.f32975a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public CustomEmojiContentNode deserialize(Decoder decoder) {
        boolean z10;
        String str;
        String str2;
        String str3;
        long j10;
        int i10;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            j10 = b10.f(descriptor2, 0);
            str3 = b10.m(descriptor2, 1);
            str2 = b10.m(descriptor2, 2);
            str = b10.m(descriptor2, 3);
            z10 = b10.C(descriptor2, 4);
            i10 = 31;
        } else {
            long j11 = 0;
            String str4 = null;
            String str5 = null;
            boolean z11 = true;
            int i11 = 0;
            String str6 = null;
            boolean z12 = false;
            while (z11) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z11 = false;
                } else if (o10 == 0) {
                    j11 = b10.f(descriptor2, 0);
                    i11 |= 1;
                } else if (o10 == 1) {
                    str4 = b10.m(descriptor2, 1);
                    i11 |= 2;
                } else if (o10 == 2) {
                    str5 = b10.m(descriptor2, 2);
                    i11 |= 4;
                } else if (o10 == 3) {
                    str6 = b10.m(descriptor2, 3);
                    i11 |= 8;
                } else if (o10 == 4) {
                    z12 = b10.C(descriptor2, 4);
                    i11 |= 16;
                } else {
                    throw new n(o10);
                }
            }
            str3 = str4;
            str = str6;
            z10 = z12;
            str2 = str5;
            i10 = i11;
            j10 = j11;
        }
        b10.c(descriptor2);
        return new CustomEmojiContentNode(i10, j10, str3, str2, str, z10, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, vj.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, CustomEmojiContentNode value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        CustomEmojiContentNode.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // yj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
