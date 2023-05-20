package com.discord.chat.bridge.postpreviewembed;

import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import j$.util.Spliterator;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import uj.n;
import vj.a;
import xj.a2;
import xj.f0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/postpreviewembed/PostPreviewEmbed.$serializer", "Lxj/f0;", "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class PostPreviewEmbed$$serializer implements f0<PostPreviewEmbed> {
    public static final PostPreviewEmbed$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PostPreviewEmbed$$serializer postPreviewEmbed$$serializer = new PostPreviewEmbed$$serializer();
        INSTANCE = postPreviewEmbed$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed", postPreviewEmbed$$serializer, 11);
        pluginGeneratedSerialDescriptor.l("parentChannelId", false);
        pluginGeneratedSerialDescriptor.l("threadId", false);
        pluginGeneratedSerialDescriptor.l("messageId", false);
        pluginGeneratedSerialDescriptor.l("guildId", false);
        pluginGeneratedSerialDescriptor.l("title", false);
        pluginGeneratedSerialDescriptor.l("ctaText", false);
        pluginGeneratedSerialDescriptor.l("footer", false);
        pluginGeneratedSerialDescriptor.l("subtitle", true);
        pluginGeneratedSerialDescriptor.l("coverImage", true);
        pluginGeneratedSerialDescriptor.l("blurredCoverImage", true);
        pluginGeneratedSerialDescriptor.l("coverImageOverlayText", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PostPreviewEmbed$$serializer() {
    }

    @Override // xj.f0
    public KSerializer<?>[] childSerializers() {
        ChannelId$$serializer channelId$$serializer = ChannelId$$serializer.INSTANCE;
        a2 a2Var = a2.f32309a;
        return new KSerializer[]{channelId$$serializer, channelId$$serializer, MessageId$$serializer.INSTANCE, GuildId$$serializer.INSTANCE, a2Var, a2Var, StructurableTextSerializer.INSTANCE, a.u(a2Var), a.u(a2Var), a.u(a2Var), a.u(a2Var)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public PostPreviewEmbed deserialize(Decoder decoder) {
        String str;
        String str2;
        Object obj;
        Object obj2;
        Object obj3;
        int i10;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        int i11 = 10;
        int i12 = 9;
        int i13 = 7;
        int i14 = 6;
        Object obj10 = null;
        if (b10.p()) {
            ChannelId$$serializer channelId$$serializer = ChannelId$$serializer.INSTANCE;
            obj = b10.y(descriptor2, 0, channelId$$serializer, null);
            obj9 = b10.y(descriptor2, 1, channelId$$serializer, null);
            obj4 = b10.y(descriptor2, 2, MessageId$$serializer.INSTANCE, null);
            obj2 = b10.y(descriptor2, 3, GuildId$$serializer.INSTANCE, null);
            str = b10.m(descriptor2, 4);
            str2 = b10.m(descriptor2, 5);
            obj5 = b10.y(descriptor2, 6, StructurableTextSerializer.INSTANCE, null);
            a2 a2Var = a2.f32309a;
            obj6 = b10.n(descriptor2, 7, a2Var, null);
            obj3 = b10.n(descriptor2, 8, a2Var, null);
            obj7 = b10.n(descriptor2, 9, a2Var, null);
            obj8 = b10.n(descriptor2, 10, a2Var, null);
            i10 = 2047;
        } else {
            boolean z10 = true;
            int i15 = 0;
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
            while (z10) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z10 = false;
                        i12 = 9;
                        i13 = 7;
                        i14 = 6;
                        break;
                    case 0:
                        obj16 = b10.y(descriptor2, 0, ChannelId$$serializer.INSTANCE, obj16);
                        i15 |= 1;
                        i11 = 10;
                        i12 = 9;
                        i13 = 7;
                        i14 = 6;
                        break;
                    case 1:
                        obj9 = b10.y(descriptor2, 1, ChannelId$$serializer.INSTANCE, obj9);
                        i15 |= 2;
                        i11 = 10;
                        i12 = 9;
                        i13 = 7;
                        break;
                    case 2:
                        obj15 = b10.y(descriptor2, 2, MessageId$$serializer.INSTANCE, obj15);
                        i15 |= 4;
                        i11 = 10;
                        i12 = 9;
                        i13 = 7;
                        break;
                    case 3:
                        obj2 = b10.y(descriptor2, 3, GuildId$$serializer.INSTANCE, obj2);
                        i15 |= 8;
                        i11 = 10;
                        i12 = 9;
                        break;
                    case 4:
                        str = b10.m(descriptor2, 4);
                        i15 |= 16;
                        i11 = 10;
                        break;
                    case 5:
                        str3 = b10.m(descriptor2, 5);
                        i15 |= 32;
                        break;
                    case 6:
                        obj12 = b10.y(descriptor2, i14, StructurableTextSerializer.INSTANCE, obj12);
                        i15 |= 64;
                        break;
                    case 7:
                        obj13 = b10.n(descriptor2, i13, a2.f32309a, obj13);
                        i15 |= 128;
                        break;
                    case 8:
                        obj11 = b10.n(descriptor2, 8, a2.f32309a, obj11);
                        i15 |= Spliterator.NONNULL;
                        break;
                    case 9:
                        obj10 = b10.n(descriptor2, i12, a2.f32309a, obj10);
                        i15 |= 512;
                        break;
                    case 10:
                        obj14 = b10.n(descriptor2, i11, a2.f32309a, obj14);
                        i15 |= Spliterator.IMMUTABLE;
                        break;
                    default:
                        throw new n(o10);
                }
            }
            obj4 = obj15;
            obj3 = obj11;
            i10 = i15;
            obj5 = obj12;
            obj7 = obj10;
            obj8 = obj14;
            str2 = str3;
            obj = obj16;
            obj6 = obj13;
        }
        b10.c(descriptor2);
        MessageId messageId = (MessageId) obj4;
        return new PostPreviewEmbed(i10, (ChannelId) obj, (ChannelId) obj9, messageId != null ? messageId.m580unboximpl() : null, (GuildId) obj2, str, str2, (StructurableText) obj5, (String) obj6, (String) obj3, (String) obj7, (String) obj8, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, uj.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, PostPreviewEmbed value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        PostPreviewEmbed.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // xj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
