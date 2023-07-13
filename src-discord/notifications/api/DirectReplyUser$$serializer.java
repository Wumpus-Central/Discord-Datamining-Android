package com.discord.notifications.api;

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
import pi.n;
import qi.a;
import si.a2;
import si.f0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/notifications/api/DirectReplyUser.$serializer", "Lsi/f0;", "Lcom/discord/notifications/api/DirectReplyUser;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "notification_api_release"}, k = 1, mv = {1, 8, 0})

public final class DirectReplyUser$$serializer implements f0<DirectReplyUser> {
    public static final DirectReplyUser$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        DirectReplyUser$$serializer directReplyUser$$serializer = new DirectReplyUser$$serializer();
        INSTANCE = directReplyUser$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.notifications.api.DirectReplyUser", directReplyUser$$serializer, 4);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l("username", true);
        pluginGeneratedSerialDescriptor.l("discriminator", true);
        pluginGeneratedSerialDescriptor.l("avatar", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DirectReplyUser$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f26230a;
        return new KSerializer[]{UserId$$serializer.INSTANCE, a.u(a2Var), a.u(a2Var), a.u(a2Var)};
    }

    @Override 
    public DirectReplyUser deserialize(Decoder decoder) {
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        Object obj5 = null;
        if (c10.y()) {
            obj4 = c10.m(descriptor2, 0, UserId$$serializer.INSTANCE, null);
            a2 a2Var = a2.f26230a;
            obj = c10.v(descriptor2, 1, a2Var, null);
            obj2 = c10.v(descriptor2, 2, a2Var, null);
            obj3 = c10.v(descriptor2, 3, a2Var, null);
            i10 = 15;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            while (z10) {
                int x10 = c10.x(descriptor2);
                if (x10 == -1) {
                    z10 = false;
                } else if (x10 == 0) {
                    obj5 = c10.m(descriptor2, 0, UserId$$serializer.INSTANCE, obj5);
                    i11 |= 1;
                } else if (x10 == 1) {
                    obj6 = c10.v(descriptor2, 1, a2.f26230a, obj6);
                    i11 |= 2;
                } else if (x10 == 2) {
                    obj7 = c10.v(descriptor2, 2, a2.f26230a, obj7);
                    i11 |= 4;
                } else if (x10 == 3) {
                    obj8 = c10.v(descriptor2, 3, a2.f26230a, obj8);
                    i11 |= 8;
                } else {
                    throw new n(x10);
                }
            }
            obj = obj6;
            obj2 = obj7;
            obj3 = obj8;
            i10 = i11;
            obj4 = obj5;
        }
        c10.b(descriptor2);
        return new DirectReplyUser(i10, (UserId) obj4, (String) obj, (String) obj2, (String) obj3, null, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, DirectReplyUser value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        DirectReplyUser.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
