package com.discord.chat.bridge.contentnode;

import com.discord.chat.bridge.ChannelType;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import qi.n;
import ri.a;
import ti.a2;
import ti.f;
import ti.f0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/contentnode/ChannelNameContentNode.$serializer", "Lti/f0;", "Lcom/discord/chat/bridge/contentnode/ChannelNameContentNode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ChannelNameContentNode$$serializer implements f0<ChannelNameContentNode> {
    public static final ChannelNameContentNode$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ChannelNameContentNode$$serializer channelNameContentNode$$serializer = new ChannelNameContentNode$$serializer();
        INSTANCE = channelNameContentNode$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("channel", channelNameContentNode$$serializer, 4);
        pluginGeneratedSerialDescriptor.l("channelType", true);
        pluginGeneratedSerialDescriptor.l("iconType", false);
        pluginGeneratedSerialDescriptor.l("icon", true);
        pluginGeneratedSerialDescriptor.l("content", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChannelNameContentNode$$serializer() {
    }

    @Override // ti.f0
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f26972a;
        return new KSerializer[]{a.u(ChannelType.Serializer.INSTANCE), a2Var, a.u(a2Var), new f(ContentNodeSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ChannelNameContentNode deserialize(Decoder decoder) {
        String str;
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        Object obj4 = null;
        if (c10.y()) {
            obj3 = c10.v(descriptor2, 0, ChannelType.Serializer.INSTANCE, null);
            str = c10.t(descriptor2, 1);
            obj = c10.v(descriptor2, 2, a2.f26972a, null);
            obj2 = c10.m(descriptor2, 3, new f(ContentNodeSerializer.INSTANCE), null);
            i10 = 15;
        } else {
            boolean z10 = true;
            int i11 = 0;
            str = null;
            Object obj5 = null;
            Object obj6 = null;
            while (z10) {
                int x10 = c10.x(descriptor2);
                if (x10 == -1) {
                    z10 = false;
                } else if (x10 == 0) {
                    obj4 = c10.v(descriptor2, 0, ChannelType.Serializer.INSTANCE, obj4);
                    i11 |= 1;
                } else if (x10 == 1) {
                    str = c10.t(descriptor2, 1);
                    i11 |= 2;
                } else if (x10 == 2) {
                    obj5 = c10.v(descriptor2, 2, a2.f26972a, obj5);
                    i11 |= 4;
                } else if (x10 == 3) {
                    obj6 = c10.m(descriptor2, 3, new f(ContentNodeSerializer.INSTANCE), obj6);
                    i11 |= 8;
                } else {
                    throw new n(x10);
                }
            }
            i10 = i11;
            obj3 = obj4;
            obj = obj5;
            obj2 = obj6;
        }
        c10.b(descriptor2);
        return new ChannelNameContentNode(i10, (ChannelType) obj3, str, (String) obj, (List) obj2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, qi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ChannelNameContentNode value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        ChannelNameContentNode.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // ti.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
