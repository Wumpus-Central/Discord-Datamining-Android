package com.discord.chat.bridge.contentnode;

import bj.f;
import bj.f0;
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
import yi.n;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/contentnode/StrikethroughContentNode.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/contentnode/StrikethroughContentNode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class StrikethroughContentNode$$serializer implements f0<StrikethroughContentNode> {
    public static final StrikethroughContentNode$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        StrikethroughContentNode$$serializer strikethroughContentNode$$serializer = new StrikethroughContentNode$$serializer();
        INSTANCE = strikethroughContentNode$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("s", strikethroughContentNode$$serializer, 1);
        pluginGeneratedSerialDescriptor.l("content", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StrikethroughContentNode$$serializer() {
    }

    @Override // bj.f0
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{new f(ContentNodeSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public StrikethroughContentNode deserialize(Decoder decoder) {
        Object obj;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        int i10 = 1;
        if (b10.p()) {
            obj = b10.y(descriptor2, 0, new f(ContentNodeSerializer.INSTANCE), null);
        } else {
            int i11 = 0;
            obj = null;
            while (i10 != 0) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    i10 = 0;
                } else if (o10 == 0) {
                    obj = b10.y(descriptor2, 0, new f(ContentNodeSerializer.INSTANCE), obj);
                    i11 |= 1;
                } else {
                    throw new n(o10);
                }
            }
            i10 = i11;
        }
        b10.c(descriptor2);
        return new StrikethroughContentNode(i10, (List) obj, null);
    }

    @Override // kotlinx.serialization.KSerializer, yi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, StrikethroughContentNode value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        StrikethroughContentNode.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // bj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}