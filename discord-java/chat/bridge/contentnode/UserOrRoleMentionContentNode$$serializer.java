package com.discord.chat.bridge.contentnode;

import bj.f;
import bj.f0;
import bj.m0;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import com.discord.primitives.RoleId;
import com.discord.primitives.RoleId$$serializer;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
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
import zi.a;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class UserOrRoleMentionContentNode$$serializer implements f0<UserOrRoleMentionContentNode> {
    public static final UserOrRoleMentionContentNode$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        UserOrRoleMentionContentNode$$serializer userOrRoleMentionContentNode$$serializer = new UserOrRoleMentionContentNode$$serializer();
        INSTANCE = userOrRoleMentionContentNode$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mention", userOrRoleMentionContentNode$$serializer, 6);
        pluginGeneratedSerialDescriptor.l("channelId", true);
        pluginGeneratedSerialDescriptor.l("userId", true);
        pluginGeneratedSerialDescriptor.l("roleColor", true);
        pluginGeneratedSerialDescriptor.l("guildId", true);
        pluginGeneratedSerialDescriptor.l("roleId", true);
        pluginGeneratedSerialDescriptor.l("content", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UserOrRoleMentionContentNode$$serializer() {
    }

    @Override // bj.f0
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.u(ChannelId$$serializer.INSTANCE), a.u(UserId$$serializer.INSTANCE), m0.f5992a, a.u(GuildId$$serializer.INSTANCE), a.u(RoleId$$serializer.INSTANCE), new f(ContentNodeSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public UserOrRoleMentionContentNode deserialize(Decoder decoder) {
        Object obj;
        int i10;
        int i11;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        int i12 = 5;
        boolean z10 = true;
        if (b10.p()) {
            obj5 = b10.n(descriptor2, 0, ChannelId$$serializer.INSTANCE, null);
            obj = b10.n(descriptor2, 1, UserId$$serializer.INSTANCE, null);
            i10 = b10.i(descriptor2, 2);
            obj3 = b10.n(descriptor2, 3, GuildId$$serializer.INSTANCE, null);
            obj2 = b10.n(descriptor2, 4, RoleId$$serializer.INSTANCE, null);
            obj4 = b10.y(descriptor2, 5, new f(ContentNodeSerializer.INSTANCE), null);
            i11 = 63;
        } else {
            boolean z11 = true;
            int i13 = 0;
            Object obj6 = null;
            obj = null;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            int i14 = 0;
            while (z11) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z11 = false;
                        i12 = 5;
                    case 0:
                        obj6 = b10.n(descriptor2, 0, ChannelId$$serializer.INSTANCE, obj6);
                        i14 |= 1;
                        z10 = z10;
                        i12 = 5;
                    case 1:
                        obj = b10.n(descriptor2, 1, UserId$$serializer.INSTANCE, obj);
                        i14 |= 2;
                        z10 = true;
                    case 2:
                        i13 = b10.i(descriptor2, 2);
                        i14 |= 4;
                        z10 = true;
                    case 3:
                        obj7 = b10.n(descriptor2, 3, GuildId$$serializer.INSTANCE, obj7);
                        i14 |= 8;
                        z10 = true;
                    case 4:
                        obj8 = b10.n(descriptor2, 4, RoleId$$serializer.INSTANCE, obj8);
                        i14 |= 16;
                        z10 = true;
                    case 5:
                        obj9 = b10.y(descriptor2, i12, new f(ContentNodeSerializer.INSTANCE), obj9);
                        i14 |= 32;
                        z10 = true;
                    default:
                        throw new n(o10);
                }
            }
            i11 = i14;
            obj3 = obj7;
            obj2 = obj8;
            obj4 = obj9;
            i10 = i13;
            obj5 = obj6;
        }
        b10.c(descriptor2);
        return new UserOrRoleMentionContentNode(i11, (ChannelId) obj5, (UserId) obj, i10, (GuildId) obj3, (RoleId) obj2, (List) obj4, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, yi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, UserOrRoleMentionContentNode value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        UserOrRoleMentionContentNode.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // bj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}