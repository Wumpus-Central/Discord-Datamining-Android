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
import pi.n;
import qi.a;
import si.f;
import si.f0;
import si.h;
import si.w0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/contentnode/BulletListContentNode.$serializer", "Lsi/f0;", "Lcom/discord/chat/bridge/contentnode/BulletListContentNode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class BulletListContentNode$$serializer implements f0<BulletListContentNode> {
    public static final BulletListContentNode$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

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

    @Override 
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.u(w0.f26349a), h.f26275a, new f(new f(ContentNodeSerializer.INSTANCE))};
    }

    @Override 
    public BulletListContentNode deserialize(Decoder decoder) {
        boolean z10;
        int i10;
        Object obj;
        Object obj2;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        if (c10.y()) {
            obj2 = c10.v(descriptor2, 0, w0.f26349a, null);
            z10 = c10.s(descriptor2, 1);
            obj = c10.m(descriptor2, 2, new f(new f(ContentNodeSerializer.INSTANCE)), null);
            i10 = 7;
        } else {
            boolean z11 = true;
            boolean z12 = false;
            Object obj3 = null;
            Object obj4 = null;
            int i11 = 0;
            while (z11) {
                int x10 = c10.x(descriptor2);
                if (x10 == -1) {
                    z11 = false;
                } else if (x10 == 0) {
                    obj3 = c10.v(descriptor2, 0, w0.f26349a, obj3);
                    i11 |= 1;
                } else if (x10 == 1) {
                    z12 = c10.s(descriptor2, 1);
                    i11 |= 2;
                } else if (x10 == 2) {
                    obj4 = c10.m(descriptor2, 2, new f(new f(ContentNodeSerializer.INSTANCE)), obj4);
                    i11 |= 4;
                } else {
                    throw new n(x10);
                }
            }
            i10 = i11;
            obj = obj4;
            z10 = z12;
            obj2 = obj3;
        }
        c10.b(descriptor2);
        return new BulletListContentNode(i10, (Long) obj2, z10, (List) obj, (SerializationConstructorMarker) null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, BulletListContentNode value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        BulletListContentNode.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
