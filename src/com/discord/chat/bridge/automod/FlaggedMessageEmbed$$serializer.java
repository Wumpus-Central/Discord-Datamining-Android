package com.discord.chat.bridge.automod;

import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC2522f0;
import bj.C2500a2;
import bj.C2530h;
import bj.C2555m0;
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
import kotlin.jvm.internal.C9677q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC9967c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p164j$.util.Spliterator;
import p450yi.C14382n;
import p470zi.C14606a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/automod/FlaggedMessageEmbed.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class FlaggedMessageEmbed$$serializer implements AbstractC2522f0<FlaggedMessageEmbed> {
    public static final FlaggedMessageEmbed$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        FlaggedMessageEmbed$$serializer flaggedMessageEmbed$$serializer = new FlaggedMessageEmbed$$serializer();
        INSTANCE = flaggedMessageEmbed$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.automod.FlaggedMessageEmbed", flaggedMessageEmbed$$serializer, 12);
        pluginGeneratedSerialDescriptor.m13841l("id", false);
        pluginGeneratedSerialDescriptor.m13841l("channelId", false);
        pluginGeneratedSerialDescriptor.m13841l("guildId", true);
        pluginGeneratedSerialDescriptor.m13841l("userId", true);
        pluginGeneratedSerialDescriptor.m13841l("content", true);
        pluginGeneratedSerialDescriptor.m13841l("channelName", true);
        pluginGeneratedSerialDescriptor.m13841l("username", true);
        pluginGeneratedSerialDescriptor.m13841l("usernameColor", false);
        pluginGeneratedSerialDescriptor.m13841l("roleColor", true);
        pluginGeneratedSerialDescriptor.m13841l("shouldShowRoleDot", false);
        pluginGeneratedSerialDescriptor.m13841l("avatarURL", true);
        pluginGeneratedSerialDescriptor.m13841l("communicationDisabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FlaggedMessageEmbed$$serializer() {
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] childSerializers() {
        C2500a2 a2Var = C2500a2.f6719a;
        C2555m0 m0Var = C2555m0.f6794a;
        C2530h hVar = C2530h.f6761a;
        return new KSerializer[]{MessageId$$serializer.INSTANCE, ChannelId$$serializer.INSTANCE, C14606a.m13u(GuildId$$serializer.INSTANCE), C14606a.m13u(UserId$$serializer.INSTANCE), C14606a.m13u(StructurableTextSerializer.INSTANCE), C14606a.m13u(a2Var), C14606a.m13u(a2Var), m0Var, C14606a.m13u(m0Var), hVar, C14606a.m13u(a2Var), C14606a.m13u(hVar)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public FlaggedMessageEmbed deserialize(Decoder decoder) {
        boolean z;
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        int i2;
        Object obj8;
        Object obj9;
        Object obj10;
        C9677q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC9967c b = decoder.mo13905b(descriptor2);
        int i3 = 10;
        int i4 = 9;
        int i5 = 7;
        int i6 = 6;
        Object obj11 = null;
        if (b.mo13850p()) {
            obj10 = b.mo13847y(descriptor2, 0, MessageId$$serializer.INSTANCE, null);
            obj = b.mo13847y(descriptor2, 1, ChannelId$$serializer.INSTANCE, null);
            obj2 = b.mo13852n(descriptor2, 2, GuildId$$serializer.INSTANCE, null);
            obj5 = b.mo13852n(descriptor2, 3, UserId$$serializer.INSTANCE, null);
            obj3 = b.mo13852n(descriptor2, 4, StructurableTextSerializer.INSTANCE, null);
            C2500a2 a2Var = C2500a2.f6719a;
            obj6 = b.mo13852n(descriptor2, 5, a2Var, null);
            obj7 = b.mo13852n(descriptor2, 6, a2Var, null);
            i = b.mo13855i(descriptor2, 7);
            obj9 = b.mo13852n(descriptor2, 8, C2555m0.f6794a, null);
            z = b.mo13861C(descriptor2, 9);
            obj8 = b.mo13852n(descriptor2, 10, a2Var, null);
            obj4 = b.mo13852n(descriptor2, 11, C2530h.f6761a, null);
            i2 = 4095;
        } else {
            int i7 = 11;
            boolean z2 = true;
            int i8 = 0;
            boolean z3 = false;
            int i9 = 0;
            Object obj12 = null;
            Object obj13 = null;
            Object obj14 = null;
            Object obj15 = null;
            Object obj16 = null;
            Object obj17 = null;
            Object obj18 = null;
            Object obj19 = null;
            Object obj20 = null;
            while (z2) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z2 = false;
                        i7 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        break;
                    case 0:
                        obj12 = b.mo13847y(descriptor2, 0, MessageId$$serializer.INSTANCE, obj12);
                        i8 |= 1;
                        i7 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        break;
                    case 1:
                        obj20 = b.mo13847y(descriptor2, 1, ChannelId$$serializer.INSTANCE, obj20);
                        i8 |= 2;
                        i7 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        break;
                    case 2:
                        obj19 = b.mo13852n(descriptor2, 2, GuildId$$serializer.INSTANCE, obj19);
                        i8 |= 4;
                        i7 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 3:
                        obj17 = b.mo13852n(descriptor2, 3, UserId$$serializer.INSTANCE, obj17);
                        i8 |= 8;
                        i7 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 4:
                        obj18 = b.mo13852n(descriptor2, 4, StructurableTextSerializer.INSTANCE, obj18);
                        i8 |= 16;
                        i7 = 11;
                        i3 = 10;
                        break;
                    case 5:
                        obj14 = b.mo13852n(descriptor2, 5, C2500a2.f6719a, obj14);
                        i8 |= 32;
                        i7 = 11;
                        continue;
                    case 6:
                        obj15 = b.mo13852n(descriptor2, i6, C2500a2.f6719a, obj15);
                        i8 |= 64;
                        break;
                    case 7:
                        i9 = b.mo13855i(descriptor2, i5);
                        i8 |= 128;
                        break;
                    case 8:
                        obj11 = b.mo13852n(descriptor2, 8, C2555m0.f6794a, obj11);
                        i8 |= Spliterator.NONNULL;
                        break;
                    case 9:
                        z3 = b.mo13861C(descriptor2, i4);
                        i8 |= 512;
                        break;
                    case 10:
                        obj16 = b.mo13852n(descriptor2, i3, C2500a2.f6719a, obj16);
                        i8 |= Spliterator.IMMUTABLE;
                        break;
                    case 11:
                        obj13 = b.mo13852n(descriptor2, i7, C2530h.f6761a, obj13);
                        i8 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        break;
                    default:
                        throw new C14382n(o);
                }
            }
            obj4 = obj13;
            obj6 = obj14;
            obj7 = obj15;
            z = z3;
            obj5 = obj17;
            obj2 = obj19;
            obj = obj20;
            i2 = i8;
            obj8 = obj16;
            i = i9;
            obj3 = obj18;
            obj10 = obj12;
            obj9 = obj11;
        }
        b.mo13857c(descriptor2);
        MessageId messageId = (MessageId) obj10;
        return new FlaggedMessageEmbed(i2, messageId != null ? messageId.m42123unboximpl() : null, (ChannelId) obj, (GuildId) obj2, (UserId) obj5, (StructurableText) obj3, (String) obj6, (String) obj7, i, (Integer) obj9, z, (String) obj8, (Boolean) obj4, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, FlaggedMessageEmbed value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        FlaggedMessageEmbed.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC2522f0.C2523a.m33897a(this);
    }
}
