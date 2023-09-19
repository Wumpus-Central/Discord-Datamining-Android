package com.discord.chat.bridge.contentnode;

import com.facebook.react.uimanager.events.TouchesHelper;
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
import ui.n;
import vi.a;
import xi.a2;
import xi.f;
import xi.f0;
import xi.h;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/contentnode/LinkContentNode.$serializer", "Lxi/f0;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class LinkContentNode$$serializer implements f0<LinkContentNode> {
    public static final LinkContentNode$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        LinkContentNode$$serializer linkContentNode$$serializer = new LinkContentNode$$serializer();
        INSTANCE = linkContentNode$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("link", linkContentNode$$serializer, 5);
        pluginGeneratedSerialDescriptor.l("content", false);
        pluginGeneratedSerialDescriptor.l(TouchesHelper.TARGET_KEY, false);
        pluginGeneratedSerialDescriptor.l("context", true);
        pluginGeneratedSerialDescriptor.l("textContent", true);
        pluginGeneratedSerialDescriptor.l("isUrl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LinkContentNode$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f30576a;
        return new KSerializer[]{new f(ContentNodeSerializer.INSTANCE), a2Var, a.u(LinkContext$$serializer.INSTANCE), a2Var, h.f30618a};
    }

    @Override 
    public LinkContentNode deserialize(Decoder decoder) {
        boolean z10;
        String str;
        String str2;
        Object obj;
        int i10;
        Object obj2;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            obj2 = b10.y(descriptor2, 0, new f(ContentNodeSerializer.INSTANCE), null);
            str2 = b10.m(descriptor2, 1);
            obj = b10.n(descriptor2, 2, LinkContext$$serializer.INSTANCE, null);
            str = b10.m(descriptor2, 3);
            z10 = b10.C(descriptor2, 4);
            i10 = 31;
        } else {
            boolean z11 = true;
            boolean z12 = false;
            Object obj3 = null;
            String str3 = null;
            Object obj4 = null;
            String str4 = null;
            int i11 = 0;
            while (z11) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z11 = false;
                } else if (o10 == 0) {
                    obj3 = b10.y(descriptor2, 0, new f(ContentNodeSerializer.INSTANCE), obj3);
                    i11 |= 1;
                } else if (o10 == 1) {
                    str3 = b10.m(descriptor2, 1);
                    i11 |= 2;
                } else if (o10 == 2) {
                    obj4 = b10.n(descriptor2, 2, LinkContext$$serializer.INSTANCE, obj4);
                    i11 |= 4;
                } else if (o10 == 3) {
                    str4 = b10.m(descriptor2, 3);
                    i11 |= 8;
                } else if (o10 == 4) {
                    z12 = b10.C(descriptor2, 4);
                    i11 |= 16;
                } else {
                    throw new n(o10);
                }
            }
            i10 = i11;
            str2 = str3;
            obj = obj4;
            str = str4;
            z10 = z12;
            obj2 = obj3;
        }
        b10.c(descriptor2);
        return new LinkContentNode(i10, (List) obj2, str2, (LinkContext) obj, str, z10, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, LinkContentNode value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        LinkContentNode.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
