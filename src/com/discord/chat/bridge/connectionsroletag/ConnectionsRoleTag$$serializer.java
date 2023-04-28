package com.discord.chat.bridge.connectionsroletag;

import bj.AbstractC3644f0;
import bj.C3622a2;
import bj.C3676m0;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p449yi.C14447n;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ConnectionsRoleTag$$serializer implements AbstractC3644f0<ConnectionsRoleTag> {
    public static final ConnectionsRoleTag$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ConnectionsRoleTag$$serializer connectionsRoleTag$$serializer = new ConnectionsRoleTag$$serializer();
        INSTANCE = connectionsRoleTag$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.connectionsroletag.ConnectionsRoleTag", connectionsRoleTag$$serializer, 4);
        pluginGeneratedSerialDescriptor.m13841l("id", false);
        pluginGeneratedSerialDescriptor.m13841l("name", false);
        pluginGeneratedSerialDescriptor.m13841l(ViewProps.BACKGROUND_COLOR, false);
        pluginGeneratedSerialDescriptor.m13841l("iconColor", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ConnectionsRoleTag$$serializer() {
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] childSerializers() {
        C3622a2 a2Var = C3622a2.f5917a;
        C3676m0 m0Var = C3676m0.f5992a;
        return new KSerializer[]{a2Var, a2Var, m0Var, m0Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ConnectionsRoleTag deserialize(Decoder decoder) {
        int i;
        int i2;
        String str;
        String str2;
        int i3;
        C9971q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC10248c b = decoder.mo13905b(descriptor2);
        if (b.mo13850p()) {
            str2 = b.mo13853m(descriptor2, 0);
            str = b.mo13853m(descriptor2, 1);
            i2 = b.mo13855i(descriptor2, 2);
            i = b.mo13855i(descriptor2, 3);
            i3 = 15;
        } else {
            String str3 = null;
            String str4 = null;
            boolean z = true;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (z) {
                int o = b.mo13851o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    str3 = b.mo13853m(descriptor2, 0);
                    i6 |= 1;
                } else if (o == 1) {
                    str4 = b.mo13853m(descriptor2, 1);
                    i6 |= 2;
                } else if (o == 2) {
                    i5 = b.mo13855i(descriptor2, 2);
                    i6 |= 4;
                } else if (o == 3) {
                    i4 = b.mo13855i(descriptor2, 3);
                    i6 |= 8;
                } else {
                    throw new C14447n(o);
                }
            }
            str2 = str3;
            i = i4;
            i2 = i5;
            str = str4;
            i3 = i6;
        }
        b.mo13857c(descriptor2);
        return new ConnectionsRoleTag(i3, str2, str, i2, i, null);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ConnectionsRoleTag value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        ConnectionsRoleTag.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC3644f0.C3645a.m33897a(this);
    }
}
