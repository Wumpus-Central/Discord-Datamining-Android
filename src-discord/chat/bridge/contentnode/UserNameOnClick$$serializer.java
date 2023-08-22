package com.discord.chat.bridge.contentnode;

import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ti.n;
import ui.a;
import wi.a2;
import wi.f0;
import wi.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/contentnode/UserNameOnClick.$serializer", "Lwi/f0;", "Lcom/discord/chat/bridge/contentnode/UserNameOnClick;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class UserNameOnClick$$serializer implements f0<UserNameOnClick> {
    public static final UserNameOnClick$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        UserNameOnClick$$serializer userNameOnClick$$serializer = new UserNameOnClick$$serializer();
        INSTANCE = userNameOnClick$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.UserNameOnClick", userNameOnClick$$serializer, 4);
        pluginGeneratedSerialDescriptor.l("action", false);
        pluginGeneratedSerialDescriptor.l("userId", false);
        pluginGeneratedSerialDescriptor.l("messageChannelId", true);
        pluginGeneratedSerialDescriptor.l("linkColor", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UserNameOnClick$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a2.f29758a, UserId$$serializer.INSTANCE, a.u(ChannelId$$serializer.INSTANCE), a.u(m0.f29833a)};
    }

    @Override 
    public UserNameOnClick deserialize(Decoder decoder) {
        String str;
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        String str2 = null;
        if (b10.p()) {
            str = b10.m(descriptor2, 0);
            obj = b10.y(descriptor2, 1, UserId$$serializer.INSTANCE, null);
            obj2 = b10.n(descriptor2, 2, ChannelId$$serializer.INSTANCE, null);
            obj3 = b10.n(descriptor2, 3, m0.f29833a, null);
            i10 = 15;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            while (z10) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z10 = false;
                } else if (o10 == 0) {
                    str2 = b10.m(descriptor2, 0);
                    i11 |= 1;
                } else if (o10 == 1) {
                    obj4 = b10.y(descriptor2, 1, UserId$$serializer.INSTANCE, obj4);
                    i11 |= 2;
                } else if (o10 == 2) {
                    obj5 = b10.n(descriptor2, 2, ChannelId$$serializer.INSTANCE, obj5);
                    i11 |= 4;
                } else if (o10 == 3) {
                    obj6 = b10.n(descriptor2, 3, m0.f29833a, obj6);
                    i11 |= 8;
                } else {
                    throw new n(o10);
                }
            }
            i10 = i11;
            str = str2;
            obj = obj4;
            obj2 = obj5;
            obj3 = obj6;
        }
        b10.c(descriptor2);
        return new UserNameOnClick(i10, str, (UserId) obj, (ChannelId) obj2, (Integer) obj3, null, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, UserNameOnClick value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        UserNameOnClick.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
