package com.discord.chat.bridge.postpreviewembed;

import bj.AbstractC2522f0;
import bj.C2500a2;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
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

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/postpreviewembed/PostPreviewEmbed.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class PostPreviewEmbed$$serializer implements AbstractC2522f0<PostPreviewEmbed> {
    public static final PostPreviewEmbed$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PostPreviewEmbed$$serializer postPreviewEmbed$$serializer = new PostPreviewEmbed$$serializer();
        INSTANCE = postPreviewEmbed$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed", postPreviewEmbed$$serializer, 11);
        pluginGeneratedSerialDescriptor.m13841l("parentChannelId", false);
        pluginGeneratedSerialDescriptor.m13841l("threadId", false);
        pluginGeneratedSerialDescriptor.m13841l("messageId", false);
        pluginGeneratedSerialDescriptor.m13841l("guildId", false);
        pluginGeneratedSerialDescriptor.m13841l("title", false);
        pluginGeneratedSerialDescriptor.m13841l("ctaText", false);
        pluginGeneratedSerialDescriptor.m13841l("footer", false);
        pluginGeneratedSerialDescriptor.m13841l("subtitle", true);
        pluginGeneratedSerialDescriptor.m13841l("coverImage", true);
        pluginGeneratedSerialDescriptor.m13841l("blurredCoverImage", true);
        pluginGeneratedSerialDescriptor.m13841l("coverImageOverlayText", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PostPreviewEmbed$$serializer() {
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] childSerializers() {
        ChannelId$$serializer channelId$$serializer = ChannelId$$serializer.INSTANCE;
        C2500a2 a2Var = C2500a2.f6719a;
        return new KSerializer[]{channelId$$serializer, channelId$$serializer, MessageId$$serializer.INSTANCE, GuildId$$serializer.INSTANCE, a2Var, a2Var, StructurableTextSerializer.INSTANCE, C14606a.m13u(a2Var), C14606a.m13u(a2Var), C14606a.m13u(a2Var), C14606a.m13u(a2Var)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public PostPreviewEmbed deserialize(Decoder decoder) {
        String str;
        String str2;
        Object obj;
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        C9677q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC9967c b = decoder.mo13905b(descriptor2);
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        Object obj10 = null;
        if (b.mo13850p()) {
            ChannelId$$serializer channelId$$serializer = ChannelId$$serializer.INSTANCE;
            obj = b.mo13847y(descriptor2, 0, channelId$$serializer, null);
            obj9 = b.mo13847y(descriptor2, 1, channelId$$serializer, null);
            obj4 = b.mo13847y(descriptor2, 2, MessageId$$serializer.INSTANCE, null);
            obj2 = b.mo13847y(descriptor2, 3, GuildId$$serializer.INSTANCE, null);
            str = b.mo13853m(descriptor2, 4);
            str2 = b.mo13853m(descriptor2, 5);
            obj5 = b.mo13847y(descriptor2, 6, StructurableTextSerializer.INSTANCE, null);
            C2500a2 a2Var = C2500a2.f6719a;
            obj6 = b.mo13852n(descriptor2, 7, a2Var, null);
            obj3 = b.mo13852n(descriptor2, 8, a2Var, null);
            obj7 = b.mo13852n(descriptor2, 9, a2Var, null);
            obj8 = b.mo13852n(descriptor2, 10, a2Var, null);
            i = 2047;
        } else {
            boolean z = true;
            int i6 = 0;
            obj9 = null;
            Object obj11 = null;
            obj2 = null;
            Object obj12 = null;
            Object obj13 = null;
            Object obj14 = null;
            String str3 = null;
            str = null;
            Object obj15 = null;
            Object obj16 = null;
            while (z) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 0:
                        obj16 = b.mo13847y(descriptor2, 0, ChannelId$$serializer.INSTANCE, obj16);
                        i6 |= 1;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 1:
                        obj9 = b.mo13847y(descriptor2, 1, ChannelId$$serializer.INSTANCE, obj9);
                        i6 |= 2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 2:
                        obj15 = b.mo13847y(descriptor2, 2, MessageId$$serializer.INSTANCE, obj15);
                        i6 |= 4;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 3:
                        obj2 = b.mo13847y(descriptor2, 3, GuildId$$serializer.INSTANCE, obj2);
                        i6 |= 8;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 4:
                        str = b.mo13853m(descriptor2, 4);
                        i6 |= 16;
                        i2 = 10;
                        break;
                    case 5:
                        str3 = b.mo13853m(descriptor2, 5);
                        i6 |= 32;
                        break;
                    case 6:
                        obj12 = b.mo13847y(descriptor2, i5, StructurableTextSerializer.INSTANCE, obj12);
                        i6 |= 64;
                        break;
                    case 7:
                        obj13 = b.mo13852n(descriptor2, i4, C2500a2.f6719a, obj13);
                        i6 |= 128;
                        break;
                    case 8:
                        obj11 = b.mo13852n(descriptor2, 8, C2500a2.f6719a, obj11);
                        i6 |= Spliterator.NONNULL;
                        break;
                    case 9:
                        obj10 = b.mo13852n(descriptor2, i3, C2500a2.f6719a, obj10);
                        i6 |= 512;
                        break;
                    case 10:
                        obj14 = b.mo13852n(descriptor2, i2, C2500a2.f6719a, obj14);
                        i6 |= Spliterator.IMMUTABLE;
                        break;
                    default:
                        throw new C14382n(o);
                }
            }
            obj4 = obj15;
            obj3 = obj11;
            i = i6;
            obj5 = obj12;
            obj7 = obj10;
            obj8 = obj14;
            str2 = str3;
            obj = obj16;
            obj6 = obj13;
        }
        b.mo13857c(descriptor2);
        MessageId messageId = (MessageId) obj4;
        return new PostPreviewEmbed(i, (ChannelId) obj, (ChannelId) obj9, messageId != null ? messageId.m42123unboximpl() : null, (GuildId) obj2, str, str2, (StructurableText) obj5, (String) obj6, (String) obj3, (String) obj7, (String) obj8, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, PostPreviewEmbed value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        PostPreviewEmbed.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC2522f0.C2523a.m33897a(this);
    }
}
