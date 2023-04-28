package com.discord.chat.bridge.contentnode;

import bj.AbstractC2522f0;
import bj.C2521f;
import bj.C2555m0;
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
import kotlin.jvm.internal.C9677q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC9967c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p450yi.C14382n;
import p470zi.C14606a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class UserOrRoleMentionContentNode$$serializer implements AbstractC2522f0<UserOrRoleMentionContentNode> {
    public static final UserOrRoleMentionContentNode$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        UserOrRoleMentionContentNode$$serializer userOrRoleMentionContentNode$$serializer = new UserOrRoleMentionContentNode$$serializer();
        INSTANCE = userOrRoleMentionContentNode$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mention", userOrRoleMentionContentNode$$serializer, 6);
        pluginGeneratedSerialDescriptor.m13841l("channelId", true);
        pluginGeneratedSerialDescriptor.m13841l("userId", true);
        pluginGeneratedSerialDescriptor.m13841l("roleColor", true);
        pluginGeneratedSerialDescriptor.m13841l("guildId", true);
        pluginGeneratedSerialDescriptor.m13841l("roleId", true);
        pluginGeneratedSerialDescriptor.m13841l("content", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UserOrRoleMentionContentNode$$serializer() {
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{C14606a.m13u(ChannelId$$serializer.INSTANCE), C14606a.m13u(UserId$$serializer.INSTANCE), C2555m0.f6794a, C14606a.m13u(GuildId$$serializer.INSTANCE), C14606a.m13u(RoleId$$serializer.INSTANCE), new C2521f(ContentNodeSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public UserOrRoleMentionContentNode deserialize(Decoder decoder) {
        Object obj;
        int i;
        int i2;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        C9677q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC9967c b = decoder.mo13905b(descriptor2);
        int i3 = 5;
        boolean z = true;
        if (b.mo13850p()) {
            obj5 = b.mo13852n(descriptor2, 0, ChannelId$$serializer.INSTANCE, null);
            obj = b.mo13852n(descriptor2, 1, UserId$$serializer.INSTANCE, null);
            i = b.mo13855i(descriptor2, 2);
            obj3 = b.mo13852n(descriptor2, 3, GuildId$$serializer.INSTANCE, null);
            obj2 = b.mo13852n(descriptor2, 4, RoleId$$serializer.INSTANCE, null);
            obj4 = b.mo13847y(descriptor2, 5, new C2521f(ContentNodeSerializer.INSTANCE), null);
            i2 = 63;
        } else {
            boolean z2 = true;
            int i4 = 0;
            Object obj6 = null;
            obj = null;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            int i5 = 0;
            while (z2) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z2 = false;
                        i3 = 5;
                    case 0:
                        obj6 = b.mo13852n(descriptor2, 0, ChannelId$$serializer.INSTANCE, obj6);
                        i5 |= 1;
                        z = z;
                        i3 = 5;
                    case 1:
                        obj = b.mo13852n(descriptor2, 1, UserId$$serializer.INSTANCE, obj);
                        i5 |= 2;
                        z = true;
                    case 2:
                        i4 = b.mo13855i(descriptor2, 2);
                        i5 |= 4;
                        z = true;
                    case 3:
                        obj7 = b.mo13852n(descriptor2, 3, GuildId$$serializer.INSTANCE, obj7);
                        i5 |= 8;
                        z = true;
                    case 4:
                        obj8 = b.mo13852n(descriptor2, 4, RoleId$$serializer.INSTANCE, obj8);
                        i5 |= 16;
                        z = true;
                    case 5:
                        obj9 = b.mo13847y(descriptor2, i3, new C2521f(ContentNodeSerializer.INSTANCE), obj9);
                        i5 |= 32;
                        z = true;
                    default:
                        throw new C14382n(o);
                }
            }
            i2 = i5;
            obj3 = obj7;
            obj2 = obj8;
            obj4 = obj9;
            i = i4;
            obj5 = obj6;
        }
        b.mo13857c(descriptor2);
        return new UserOrRoleMentionContentNode(i2, (ChannelId) obj5, (UserId) obj, i, (GuildId) obj3, (RoleId) obj2, (List) obj4, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, UserOrRoleMentionContentNode value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        UserOrRoleMentionContentNode.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC2522f0.C2523a.m33897a(this);
    }
}
