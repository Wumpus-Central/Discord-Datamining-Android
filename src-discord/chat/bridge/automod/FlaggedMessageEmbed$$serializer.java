package com.discord.chat.bridge.automod;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
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
import si.h;
import si.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/automod/FlaggedMessageEmbed.$serializer", "Lsi/f0;", "Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class FlaggedMessageEmbed$$serializer implements f0<FlaggedMessageEmbed> {
    public static final FlaggedMessageEmbed$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        FlaggedMessageEmbed$$serializer flaggedMessageEmbed$$serializer = new FlaggedMessageEmbed$$serializer();
        INSTANCE = flaggedMessageEmbed$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.automod.FlaggedMessageEmbed", flaggedMessageEmbed$$serializer, 12);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l("channelId", false);
        pluginGeneratedSerialDescriptor.l("guildId", true);
        pluginGeneratedSerialDescriptor.l("userId", true);
        pluginGeneratedSerialDescriptor.l("content", true);
        pluginGeneratedSerialDescriptor.l("channelName", true);
        pluginGeneratedSerialDescriptor.l("username", true);
        pluginGeneratedSerialDescriptor.l("usernameColor", false);
        pluginGeneratedSerialDescriptor.l("roleColor", true);
        pluginGeneratedSerialDescriptor.l("shouldShowRoleDot", false);
        pluginGeneratedSerialDescriptor.l("avatarURL", true);
        pluginGeneratedSerialDescriptor.l("communicationDisabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FlaggedMessageEmbed$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f26237a;
        m0 m0Var = m0.f26312a;
        h hVar = h.f26279a;
        return new KSerializer[]{MessageId$$serializer.INSTANCE, ChannelId$$serializer.INSTANCE, a.u(GuildId$$serializer.INSTANCE), a.u(UserId$$serializer.INSTANCE), a.u(StructurableTextSerializer.INSTANCE), a.u(a2Var), a.u(a2Var), m0Var, a.u(m0Var), hVar, a.u(a2Var), a.u(hVar)};
    }

    @Override 
    public FlaggedMessageEmbed deserialize(Decoder decoder) {
        boolean z10;
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        int i11;
        Object obj8;
        Object obj9;
        Object obj10;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        int i12 = 10;
        int i13 = 9;
        int i14 = 7;
        int i15 = 6;
        Object obj11 = null;
        if (c10.y()) {
            obj10 = c10.m(descriptor2, 0, MessageId$$serializer.INSTANCE, null);
            obj = c10.m(descriptor2, 1, ChannelId$$serializer.INSTANCE, null);
            obj2 = c10.v(descriptor2, 2, GuildId$$serializer.INSTANCE, null);
            obj5 = c10.v(descriptor2, 3, UserId$$serializer.INSTANCE, null);
            obj3 = c10.v(descriptor2, 4, StructurableTextSerializer.INSTANCE, null);
            a2 a2Var = a2.f26237a;
            obj6 = c10.v(descriptor2, 5, a2Var, null);
            obj7 = c10.v(descriptor2, 6, a2Var, null);
            i10 = c10.k(descriptor2, 7);
            obj9 = c10.v(descriptor2, 8, m0.f26312a, null);
            z10 = c10.s(descriptor2, 9);
            obj8 = c10.v(descriptor2, 10, a2Var, null);
            obj4 = c10.v(descriptor2, 11, h.f26279a, null);
            i11 = 4095;
        } else {
            int i16 = 11;
            boolean z11 = true;
            int i17 = 0;
            boolean z12 = false;
            int i18 = 0;
            Object obj12 = null;
            Object obj13 = null;
            Object obj14 = null;
            Object obj15 = null;
            Object obj16 = null;
            Object obj17 = null;
            Object obj18 = null;
            Object obj19 = null;
            Object obj20 = null;
            while (z11) {
                int x10 = c10.x(descriptor2);
                switch (x10) {
                    case -1:
                        z11 = false;
                        i16 = 11;
                        i12 = 10;
                        i13 = 9;
                        i14 = 7;
                        i15 = 6;
                        break;
                    case 0:
                        obj12 = c10.m(descriptor2, 0, MessageId$$serializer.INSTANCE, obj12);
                        i17 |= 1;
                        i16 = 11;
                        i12 = 10;
                        i13 = 9;
                        i14 = 7;
                        i15 = 6;
                        break;
                    case 1:
                        obj20 = c10.m(descriptor2, 1, ChannelId$$serializer.INSTANCE, obj20);
                        i17 |= 2;
                        i16 = 11;
                        i12 = 10;
                        i13 = 9;
                        i14 = 7;
                        i15 = 6;
                        break;
                    case 2:
                        obj19 = c10.v(descriptor2, 2, GuildId$$serializer.INSTANCE, obj19);
                        i17 |= 4;
                        i16 = 11;
                        i12 = 10;
                        i13 = 9;
                        i14 = 7;
                        break;
                    case 3:
                        obj17 = c10.v(descriptor2, 3, UserId$$serializer.INSTANCE, obj17);
                        i17 |= 8;
                        i16 = 11;
                        i12 = 10;
                        i13 = 9;
                        break;
                    case 4:
                        obj18 = c10.v(descriptor2, 4, StructurableTextSerializer.INSTANCE, obj18);
                        i17 |= 16;
                        i16 = 11;
                        i12 = 10;
                        break;
                    case 5:
                        obj14 = c10.v(descriptor2, 5, a2.f26237a, obj14);
                        i17 |= 32;
                        i16 = 11;
                        continue;
                    case 6:
                        obj15 = c10.v(descriptor2, i15, a2.f26237a, obj15);
                        i17 |= 64;
                        break;
                    case 7:
                        i18 = c10.k(descriptor2, i14);
                        i17 |= 128;
                        break;
                    case 8:
                        obj11 = c10.v(descriptor2, 8, m0.f26312a, obj11);
                        i17 |= 256;
                        break;
                    case 9:
                        z12 = c10.s(descriptor2, i13);
                        i17 |= 512;
                        break;
                    case 10:
                        obj16 = c10.v(descriptor2, i12, a2.f26237a, obj16);
                        i17 |= 1024;
                        break;
                    case 11:
                        obj13 = c10.v(descriptor2, i16, h.f26279a, obj13);
                        i17 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        break;
                    default:
                        throw new n(x10);
                }
            }
            obj4 = obj13;
            obj6 = obj14;
            obj7 = obj15;
            z10 = z12;
            obj5 = obj17;
            obj2 = obj19;
            obj = obj20;
            i11 = i17;
            obj8 = obj16;
            i10 = i18;
            obj3 = obj18;
            obj10 = obj12;
            obj9 = obj11;
        }
        c10.b(descriptor2);
        MessageId messageId = (MessageId) obj10;
        return new FlaggedMessageEmbed(i11, messageId != null ? messageId.m600unboximpl() : null, (ChannelId) obj, (GuildId) obj2, (UserId) obj5, (StructurableText) obj3, (String) obj6, (String) obj7, i10, (Integer) obj9, z10, (String) obj8, (Boolean) obj4, null, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, FlaggedMessageEmbed value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        FlaggedMessageEmbed.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
