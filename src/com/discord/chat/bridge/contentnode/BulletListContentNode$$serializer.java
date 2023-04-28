package com.discord.chat.bridge.contentnode;

import bj.AbstractC3644f0;
import bj.C3643f;
import bj.C3652h;
import bj.C3676m0;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
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

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/contentnode/BulletListContentNode.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/contentnode/BulletListContentNode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BulletListContentNode$$serializer implements AbstractC3644f0<BulletListContentNode> {
    public static final BulletListContentNode$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BulletListContentNode$$serializer bulletListContentNode$$serializer = new BulletListContentNode$$serializer();
        INSTANCE = bulletListContentNode$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("list", bulletListContentNode$$serializer, 3);
        pluginGeneratedSerialDescriptor.m13841l(ViewProps.START, true);
        pluginGeneratedSerialDescriptor.m13841l("ordered", true);
        pluginGeneratedSerialDescriptor.m13841l("items", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BulletListContentNode$$serializer() {
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{C14667a.m13u(C3676m0.f5992a), C3652h.f5959a, new C3643f(new C3643f(ContentNodeSerializer.INSTANCE))};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public BulletListContentNode deserialize(Decoder decoder) {
        boolean z;
        int i;
        Object obj;
        Object obj2;
        C9971q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC10248c b = decoder.mo13905b(descriptor2);
        if (b.mo13850p()) {
            obj2 = b.mo13852n(descriptor2, 0, C3676m0.f5992a, null);
            z = b.mo13861C(descriptor2, 1);
            obj = b.mo13847y(descriptor2, 2, new C3643f(new C3643f(ContentNodeSerializer.INSTANCE)), null);
            i = 7;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            Object obj3 = null;
            Object obj4 = null;
            int i2 = 0;
            while (z2) {
                int o = b.mo13851o(descriptor2);
                if (o == -1) {
                    z2 = false;
                } else if (o == 0) {
                    obj3 = b.mo13852n(descriptor2, 0, C3676m0.f5992a, obj3);
                    i2 |= 1;
                } else if (o == 1) {
                    z3 = b.mo13861C(descriptor2, 1);
                    i2 |= 2;
                } else if (o == 2) {
                    obj4 = b.mo13847y(descriptor2, 2, new C3643f(new C3643f(ContentNodeSerializer.INSTANCE)), obj4);
                    i2 |= 4;
                } else {
                    throw new C14447n(o);
                }
            }
            i = i2;
            obj = obj4;
            z = z3;
            obj2 = obj3;
        }
        b.mo13857c(descriptor2);
        return new BulletListContentNode(i, (Integer) obj2, z, (List) obj, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, BulletListContentNode value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        BulletListContentNode.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC3644f0.C3645a.m33897a(this);
    }
}
