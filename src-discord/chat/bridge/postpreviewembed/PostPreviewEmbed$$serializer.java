package com.discord.chat.bridge.postpreviewembed;

import aj.a;
import androidx.recyclerview.widget.RecyclerView;
import cj.a2;
import cj.f0;
import cj.h;
import cj.m0;
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
import zi.n;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/postpreviewembed/PostPreviewEmbed.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class PostPreviewEmbed$$serializer implements f0<PostPreviewEmbed> {
    public static final PostPreviewEmbed$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        PostPreviewEmbed$$serializer postPreviewEmbed$$serializer = new PostPreviewEmbed$$serializer();
        INSTANCE = postPreviewEmbed$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed", postPreviewEmbed$$serializer, 18);
        pluginGeneratedSerialDescriptor.l("parentChannelId", false);
        pluginGeneratedSerialDescriptor.l("threadId", false);
        pluginGeneratedSerialDescriptor.l("messageId", false);
        pluginGeneratedSerialDescriptor.l("guildId", false);
        pluginGeneratedSerialDescriptor.l("title", false);
        pluginGeneratedSerialDescriptor.l("ctaText", false);
        pluginGeneratedSerialDescriptor.l("ctaButtonColor", false);
        pluginGeneratedSerialDescriptor.l("footer", false);
        pluginGeneratedSerialDescriptor.l("subtitle", true);
        pluginGeneratedSerialDescriptor.l("coverImage", true);
        pluginGeneratedSerialDescriptor.l("blurredCoverImage", true);
        pluginGeneratedSerialDescriptor.l("coverImageOverlayText", true);
        pluginGeneratedSerialDescriptor.l("backgroundImage", true);
        pluginGeneratedSerialDescriptor.l("spoiler", true);
        pluginGeneratedSerialDescriptor.l("obscure", true);
        pluginGeneratedSerialDescriptor.l("shouldSpoiler", true);
        pluginGeneratedSerialDescriptor.l("spoilerOrNull", true);
        pluginGeneratedSerialDescriptor.l("obscureOrNull", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PostPreviewEmbed$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        ChannelId$$serializer channelId$$serializer = ChannelId$$serializer.INSTANCE;
        a2 a2Var = a2.f6238a;
        return new KSerializer[]{channelId$$serializer, channelId$$serializer, MessageId$$serializer.INSTANCE, GuildId$$serializer.INSTANCE, a2Var, a2Var, m0.f6313a, StructurableTextSerializer.INSTANCE, a.u(a2Var), a.u(a2Var), a.u(a2Var), a.u(a2Var), a.u(a2Var), a.u(a2Var), a.u(a2Var), h.f6280a, a.u(a2Var), a.u(a2Var)};
    }

    @Override 
    public PostPreviewEmbed deserialize(Decoder decoder) {
        boolean z10;
        int i10;
        String str;
        String str2;
        int i11;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        Object obj15 = null;
        if (b10.p()) {
            ChannelId$$serializer channelId$$serializer = ChannelId$$serializer.INSTANCE;
            obj10 = b10.y(descriptor2, 0, channelId$$serializer, null);
            obj14 = b10.y(descriptor2, 1, channelId$$serializer, null);
            obj12 = b10.y(descriptor2, 2, MessageId$$serializer.INSTANCE, null);
            obj11 = b10.y(descriptor2, 3, GuildId$$serializer.INSTANCE, null);
            str2 = b10.m(descriptor2, 4);
            str = b10.m(descriptor2, 5);
            i10 = b10.i(descriptor2, 6);
            obj6 = b10.y(descriptor2, 7, StructurableTextSerializer.INSTANCE, null);
            a2 a2Var = a2.f6238a;
            obj13 = b10.n(descriptor2, 8, a2Var, null);
            obj7 = b10.n(descriptor2, 9, a2Var, null);
            obj8 = b10.n(descriptor2, 10, a2Var, null);
            obj9 = b10.n(descriptor2, 11, a2Var, null);
            obj = b10.n(descriptor2, 12, a2Var, null);
            obj2 = b10.n(descriptor2, 13, a2Var, null);
            obj3 = b10.n(descriptor2, 14, a2Var, null);
            z10 = b10.C(descriptor2, 15);
            obj4 = b10.n(descriptor2, 16, a2Var, null);
            obj5 = b10.n(descriptor2, 17, a2Var, null);
            i11 = 262143;
        } else {
            int i12 = 17;
            int i13 = 0;
            boolean z11 = false;
            int i14 = 0;
            boolean z12 = true;
            Object obj16 = null;
            Object obj17 = null;
            Object obj18 = null;
            Object obj19 = null;
            Object obj20 = null;
            Object obj21 = null;
            obj5 = null;
            obj4 = null;
            Object obj22 = null;
            Object obj23 = null;
            Object obj24 = null;
            Object obj25 = null;
            Object obj26 = null;
            String str3 = null;
            String str4 = null;
            while (z12) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z12 = false;
                        obj18 = obj18;
                        obj17 = obj17;
                        i12 = 17;
                        break;
                    case 0:
                        obj16 = obj16;
                        obj17 = obj17;
                        obj18 = obj18;
                        obj25 = b10.y(descriptor2, 0, ChannelId$$serializer.INSTANCE, obj25);
                        i13 |= 1;
                        i12 = 17;
                        break;
                    case 1:
                        obj16 = obj16;
                        obj17 = obj17;
                        obj18 = obj18;
                        obj15 = b10.y(descriptor2, 1, ChannelId$$serializer.INSTANCE, obj15);
                        i13 |= 2;
                        i12 = 17;
                        break;
                    case 2:
                        obj16 = obj16;
                        obj17 = obj17;
                        obj18 = obj18;
                        obj23 = b10.y(descriptor2, 2, MessageId$$serializer.INSTANCE, obj23);
                        i13 |= 4;
                        i12 = 17;
                        break;
                    case 3:
                        obj16 = obj16;
                        obj17 = obj17;
                        obj24 = b10.y(descriptor2, 3, GuildId$$serializer.INSTANCE, obj24);
                        i13 |= 8;
                        i12 = 17;
                        break;
                    case 4:
                        obj16 = obj16;
                        str4 = b10.m(descriptor2, 4);
                        i13 |= 16;
                        i12 = 17;
                        break;
                    case 5:
                        obj16 = obj16;
                        str3 = b10.m(descriptor2, 5);
                        i13 |= 32;
                        i12 = 17;
                        break;
                    case 6:
                        obj16 = obj16;
                        i14 = b10.i(descriptor2, 6);
                        i13 |= 64;
                        i12 = 17;
                        break;
                    case 7:
                        obj16 = obj16;
                        obj26 = b10.y(descriptor2, 7, StructurableTextSerializer.INSTANCE, obj26);
                        i13 |= 128;
                        i12 = 17;
                        break;
                    case 8:
                        obj22 = b10.n(descriptor2, 8, a2.f6238a, obj22);
                        i13 |= 256;
                        i12 = 17;
                        break;
                    case 9:
                        obj17 = b10.n(descriptor2, 9, a2.f6238a, obj17);
                        i13 |= 512;
                        i12 = 17;
                        break;
                    case 10:
                        obj20 = b10.n(descriptor2, 10, a2.f6238a, obj20);
                        i13 |= 1024;
                        i12 = 17;
                        continue;
                    case 11:
                        obj21 = b10.n(descriptor2, 11, a2.f6238a, obj21);
                        i13 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        i12 = 17;
                        break;
                    case 12:
                        obj16 = b10.n(descriptor2, 12, a2.f6238a, obj16);
                        i13 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        i12 = 17;
                        break;
                    case 13:
                        obj19 = b10.n(descriptor2, 13, a2.f6238a, obj19);
                        i13 |= 8192;
                        i12 = 17;
                        break;
                    case 14:
                        obj18 = b10.n(descriptor2, 14, a2.f6238a, obj18);
                        i13 |= 16384;
                        i12 = 17;
                        break;
                    case 15:
                        z11 = b10.C(descriptor2, 15);
                        i13 |= 32768;
                        i12 = 17;
                        break;
                    case 16:
                        obj4 = b10.n(descriptor2, 16, a2.f6238a, obj4);
                        i13 |= 65536;
                        i12 = 17;
                        break;
                    case 17:
                        obj5 = b10.n(descriptor2, i12, a2.f6238a, obj5);
                        i13 |= 131072;
                        break;
                    default:
                        throw new n(o10);
                }
            }
            obj = obj16;
            obj2 = obj19;
            obj11 = obj24;
            obj14 = obj15;
            i11 = i13;
            obj8 = obj20;
            obj3 = obj18;
            obj7 = obj17;
            z10 = z11;
            i10 = i14;
            str = str3;
            str2 = str4;
            obj10 = obj25;
            obj6 = obj26;
            obj9 = obj21;
            obj12 = obj23;
            obj13 = obj22;
        }
        b10.c(descriptor2);
        MessageId messageId = (MessageId) obj12;
        return new PostPreviewEmbed(i11, (ChannelId) obj10, (ChannelId) obj14, messageId != null ? messageId.m644unboximpl() : null, (GuildId) obj11, str2, str, i10, (StructurableText) obj6, (String) obj13, (String) obj7, (String) obj8, (String) obj9, (String) obj, (String) obj2, (String) obj3, z10, (String) obj4, (String) obj5, null, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, PostPreviewEmbed value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        PostPreviewEmbed.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
