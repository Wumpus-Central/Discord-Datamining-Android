package com.discord.chat.bridge.contentnode;

import com.facebook.react.uimanager.ViewProps;
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
import vj.n;
import wj.a;
import yj.f;
import yj.f0;
import yj.h;
import yj.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/contentnode/BulletListContentNode.$serializer", "Lyj/f0;", "Lcom/discord/chat/bridge/contentnode/BulletListContentNode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class BulletListContentNode$$serializer implements f0<BulletListContentNode> {
    public static final BulletListContentNode$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BulletListContentNode$$serializer bulletListContentNode$$serializer = new BulletListContentNode$$serializer();
        INSTANCE = bulletListContentNode$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("list", bulletListContentNode$$serializer, 3);
        pluginGeneratedSerialDescriptor.l(ViewProps.START, true);
        pluginGeneratedSerialDescriptor.l("ordered", true);
        pluginGeneratedSerialDescriptor.l("items", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BulletListContentNode$$serializer() {
    }

    @Override // yj.f0
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.u(m0.f33000a), h.f32967a, new f(new f(ContentNodeSerializer.INSTANCE))};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public BulletListContentNode deserialize(Decoder decoder) {
        boolean z10;
        int i10;
        Object obj;
        Object obj2;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            obj2 = b10.n(descriptor2, 0, m0.f33000a, null);
            z10 = b10.C(descriptor2, 1);
            obj = b10.y(descriptor2, 2, new f(new f(ContentNodeSerializer.INSTANCE)), null);
            i10 = 7;
        } else {
            boolean z11 = true;
            boolean z12 = false;
            Object obj3 = null;
            Object obj4 = null;
            int i11 = 0;
            while (z11) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z11 = false;
                } else if (o10 == 0) {
                    obj3 = b10.n(descriptor2, 0, m0.f33000a, obj3);
                    i11 |= 1;
                } else if (o10 == 1) {
                    z12 = b10.C(descriptor2, 1);
                    i11 |= 2;
                } else if (o10 == 2) {
                    obj4 = b10.y(descriptor2, 2, new f(new f(ContentNodeSerializer.INSTANCE)), obj4);
                    i11 |= 4;
                } else {
                    throw new n(o10);
                }
            }
            i10 = i11;
            obj = obj4;
            z10 = z12;
            obj2 = obj3;
        }
        b10.c(descriptor2);
        return new BulletListContentNode(i10, (Integer) obj2, z10, (List) obj, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, vj.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, BulletListContentNode value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        BulletListContentNode.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // yj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
