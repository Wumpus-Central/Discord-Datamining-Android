package com.discord.chat.bridge.roleicons;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
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
import yj.a2;
import yj.f0;
import yj.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/roleicons/RoleIcon.$serializer", "Lyj/f0;", "Lcom/discord/chat/bridge/roleicons/RoleIcon;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class RoleIcon$$serializer implements f0<RoleIcon> {
    public static final RoleIcon$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        RoleIcon$$serializer roleIcon$$serializer = new RoleIcon$$serializer();
        INSTANCE = roleIcon$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.roleicons.RoleIcon", roleIcon$$serializer, 5);
        pluginGeneratedSerialDescriptor.l("source", true);
        pluginGeneratedSerialDescriptor.l("unicodeEmoji", true);
        pluginGeneratedSerialDescriptor.l(ZeroconfModule.KEY_SERVICE_NAME, false);
        pluginGeneratedSerialDescriptor.l("size", false);
        pluginGeneratedSerialDescriptor.l("alt", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RoleIcon$$serializer() {
    }

    @Override // yj.f0
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f32931a;
        return new KSerializer[]{a.u(a2Var), a.u(a2Var), a2Var, m0.f33006a, a2Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public RoleIcon deserialize(Decoder decoder) {
        String str;
        String str2;
        int i10;
        Object obj;
        int i11;
        Object obj2;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            a2 a2Var = a2.f32931a;
            obj = b10.n(descriptor2, 0, a2Var, null);
            obj2 = b10.n(descriptor2, 1, a2Var, null);
            str = b10.m(descriptor2, 2);
            i10 = b10.i(descriptor2, 3);
            str2 = b10.m(descriptor2, 4);
            i11 = 31;
        } else {
            boolean z10 = true;
            int i12 = 0;
            Object obj3 = null;
            Object obj4 = null;
            str = null;
            String str3 = null;
            int i13 = 0;
            while (z10) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z10 = false;
                } else if (o10 == 0) {
                    obj3 = b10.n(descriptor2, 0, a2.f32931a, obj3);
                    i13 |= 1;
                } else if (o10 == 1) {
                    obj4 = b10.n(descriptor2, 1, a2.f32931a, obj4);
                    i13 |= 2;
                } else if (o10 == 2) {
                    str = b10.m(descriptor2, 2);
                    i13 |= 4;
                } else if (o10 == 3) {
                    i12 = b10.i(descriptor2, 3);
                    i13 |= 8;
                } else if (o10 == 4) {
                    str3 = b10.m(descriptor2, 4);
                    i13 |= 16;
                } else {
                    throw new n(o10);
                }
            }
            i11 = i13;
            obj = obj3;
            str2 = str3;
            i10 = i12;
            obj2 = obj4;
        }
        b10.c(descriptor2);
        return new RoleIcon(i11, (String) obj, (String) obj2, str, i10, str2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, vj.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, RoleIcon value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        RoleIcon.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // yj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
