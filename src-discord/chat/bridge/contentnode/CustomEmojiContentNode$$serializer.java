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
import pi.n;
import si.a2;
import si.f0;
import si.h;
import si.w0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/contentnode/CustomEmojiContentNode.$serializer", "Lsi/f0;", "Lcom/discord/chat/bridge/contentnode/CustomEmojiContentNode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class CustomEmojiContentNode$$serializer implements f0<CustomEmojiContentNode> {
    public static final CustomEmojiContentNode$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

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

    @Override 
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f26246a;
        return new KSerializer[]{w0.f26362a, a2Var, a2Var, a2Var, h.f26288a};
    }

    @Override 
    public CustomEmojiContentNode deserialize(Decoder decoder) {
        boolean z10;
        String str;
        String str2;
        String str3;
        long j10;
        int i10;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        if (c10.y()) {
            j10 = c10.h(descriptor2, 0);
            str3 = c10.t(descriptor2, 1);
            str2 = c10.t(descriptor2, 2);
            str = c10.t(descriptor2, 3);
            z10 = c10.s(descriptor2, 4);
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
                int x10 = c10.x(descriptor2);
                if (x10 == -1) {
                    z11 = false;
                } else if (x10 == 0) {
                    j11 = c10.h(descriptor2, 0);
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
                    z12 = c10.s(descriptor2, 4);
                    i11 |= 16;
                } else {
                    throw new n(x10);
                }
            }
            str3 = str4;
            str = str6;
            z10 = z12;
            str2 = str5;
            i10 = i11;
            j10 = j11;
        }
        c10.b(descriptor2);
        return new CustomEmojiContentNode(i10, j10, str3, str2, str, z10, (SerializationConstructorMarker) null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, CustomEmojiContentNode value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        CustomEmojiContentNode.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
