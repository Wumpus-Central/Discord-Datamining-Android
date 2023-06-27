package com.discord.chat.bridge.postpreviewembed;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import qi.n;
import ri.a;
import ti.a2;
import ti.f0;
import ti.h;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/postpreviewembed/PostPreviewEmbed.$serializer", "Lti/f0;", "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class PostPreviewEmbed$$serializer implements f0<PostPreviewEmbed> {
    public static final PostPreviewEmbed$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PostPreviewEmbed$$serializer postPreviewEmbed$$serializer = new PostPreviewEmbed$$serializer();
        INSTANCE = postPreviewEmbed$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed", postPreviewEmbed$$serializer, 14);
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
        pluginGeneratedSerialDescriptor.l("spoiler", true);
        pluginGeneratedSerialDescriptor.l("shouldSpoiler", true);
        pluginGeneratedSerialDescriptor.l("spoilerOrNull", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PostPreviewEmbed$$serializer() {
    }

    @Override // ti.f0
    public KSerializer<?>[] childSerializers() {
        ChannelId$$serializer channelId$$serializer = ChannelId$$serializer.INSTANCE;
        a2 a2Var = a2.f26940a;
        return new KSerializer[]{channelId$$serializer, channelId$$serializer, MessageId$$serializer.INSTANCE, GuildId$$serializer.INSTANCE, a2Var, a2Var, StructurableTextSerializer.INSTANCE, a.u(a2Var), a.u(a2Var), a.u(a2Var), a.u(a2Var), a.u(a2Var), h.f26982a, a.u(a2Var)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public PostPreviewEmbed deserialize(Decoder decoder) {
        Object obj;
        String str;
        String str2;
        boolean z10;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        int i10;
        Object obj10;
        Object obj11;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        int i11 = 11;
        int i12 = 10;
        int i13 = 9;
        Object obj12 = null;
        if (c10.y()) {
            ChannelId$$serializer channelId$$serializer = ChannelId$$serializer.INSTANCE;
            obj11 = c10.m(descriptor2, 0, channelId$$serializer, null);
            obj = c10.m(descriptor2, 1, channelId$$serializer, null);
            obj7 = c10.m(descriptor2, 2, MessageId$$serializer.INSTANCE, null);
            obj4 = c10.m(descriptor2, 3, GuildId$$serializer.INSTANCE, null);
            str = c10.t(descriptor2, 4);
            str2 = c10.t(descriptor2, 5);
            obj5 = c10.m(descriptor2, 6, StructurableTextSerializer.INSTANCE, null);
            a2 a2Var = a2.f26940a;
            obj3 = c10.v(descriptor2, 7, a2Var, null);
            obj2 = c10.v(descriptor2, 8, a2Var, null);
            obj6 = c10.v(descriptor2, 9, a2Var, null);
            obj8 = c10.v(descriptor2, 10, a2Var, null);
            obj9 = c10.v(descriptor2, 11, a2Var, null);
            z10 = c10.s(descriptor2, 12);
            obj10 = c10.v(descriptor2, 13, a2Var, null);
            i10 = 16383;
        } else {
            int i14 = 13;
            int i15 = 0;
            z10 = false;
            Object obj13 = null;
            Object obj14 = null;
            obj5 = null;
            Object obj15 = null;
            obj3 = null;
            Object obj16 = null;
            Object obj17 = null;
            str2 = null;
            Object obj18 = null;
            str = null;
            Object obj19 = null;
            boolean z11 = true;
            Object obj20 = null;
            while (z11) {
                int x10 = c10.x(descriptor2);
                switch (x10) {
                    case -1:
                        z11 = false;
                        i11 = 11;
                        i12 = 10;
                        i13 = 9;
                        break;
                    case 0:
                        obj17 = c10.m(descriptor2, 0, ChannelId$$serializer.INSTANCE, obj17);
                        i15 |= 1;
                        i14 = 13;
                        i11 = 11;
                        i12 = 10;
                        i13 = 9;
                        break;
                    case 1:
                        obj12 = c10.m(descriptor2, 1, ChannelId$$serializer.INSTANCE, obj12);
                        i15 |= 2;
                        i14 = 13;
                        i11 = 11;
                        i12 = 10;
                        i13 = 9;
                        break;
                    case 2:
                        obj19 = c10.m(descriptor2, 2, MessageId$$serializer.INSTANCE, obj19);
                        i15 |= 4;
                        i14 = 13;
                        i11 = 11;
                        i12 = 10;
                        i13 = 9;
                        break;
                    case 3:
                        obj18 = c10.m(descriptor2, 3, GuildId$$serializer.INSTANCE, obj18);
                        i15 |= 8;
                        i14 = 13;
                        i11 = 11;
                        i12 = 10;
                        break;
                    case 4:
                        str = c10.t(descriptor2, 4);
                        i15 |= 16;
                        i14 = 13;
                        i11 = 11;
                        break;
                    case 5:
                        str2 = c10.t(descriptor2, 5);
                        i15 |= 32;
                        i14 = 13;
                        i11 = 11;
                        break;
                    case 6:
                        obj5 = c10.m(descriptor2, 6, StructurableTextSerializer.INSTANCE, obj5);
                        i15 |= 64;
                        i14 = 13;
                        i11 = 11;
                        break;
                    case 7:
                        obj3 = c10.v(descriptor2, 7, a2.f26940a, obj3);
                        i15 |= 128;
                        i14 = 13;
                        i11 = 11;
                        break;
                    case 8:
                        obj14 = c10.v(descriptor2, 8, a2.f26940a, obj14);
                        i15 |= 256;
                        i14 = 13;
                        i11 = 11;
                        continue;
                    case 9:
                        obj15 = c10.v(descriptor2, i13, a2.f26940a, obj15);
                        i15 |= 512;
                        i14 = 13;
                        break;
                    case 10:
                        obj16 = c10.v(descriptor2, i12, a2.f26940a, obj16);
                        i15 |= 1024;
                        i14 = 13;
                        break;
                    case 11:
                        obj20 = c10.v(descriptor2, i11, a2.f26940a, obj20);
                        i15 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        i14 = 13;
                        break;
                    case 12:
                        z10 = c10.s(descriptor2, 12);
                        i15 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        break;
                    case 13:
                        obj13 = c10.v(descriptor2, i14, a2.f26940a, obj13);
                        i15 |= 8192;
                        break;
                    default:
                        throw new n(x10);
                }
            }
            obj11 = obj17;
            obj8 = obj16;
            obj2 = obj14;
            obj6 = obj15;
            obj4 = obj18;
            i10 = i15;
            obj7 = obj19;
            obj9 = obj20;
            obj = obj12;
            obj10 = obj13;
        }
        c10.b(descriptor2);
        MessageId messageId = (MessageId) obj7;
        return new PostPreviewEmbed(i10, (ChannelId) obj11, (ChannelId) obj, messageId != null ? messageId.m596unboximpl() : null, (GuildId) obj4, str, str2, (StructurableText) obj5, (String) obj3, (String) obj2, (String) obj6, (String) obj8, (String) obj9, z10, (String) obj10, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, qi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, PostPreviewEmbed value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        PostPreviewEmbed.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // ti.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
