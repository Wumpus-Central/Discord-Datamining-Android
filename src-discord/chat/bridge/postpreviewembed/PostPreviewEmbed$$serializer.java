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
import pi.n;
import qi.a;
import si.a2;
import si.f0;
import si.h;
import si.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/postpreviewembed/PostPreviewEmbed.$serializer", "Lsi/f0;", "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class PostPreviewEmbed$$serializer implements f0<PostPreviewEmbed> {
    public static final PostPreviewEmbed$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        PostPreviewEmbed$$serializer postPreviewEmbed$$serializer = new PostPreviewEmbed$$serializer();
        INSTANCE = postPreviewEmbed$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed", postPreviewEmbed$$serializer, 16);
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
        pluginGeneratedSerialDescriptor.l("shouldSpoiler", true);
        pluginGeneratedSerialDescriptor.l("spoilerOrNull", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PostPreviewEmbed$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        ChannelId$$serializer channelId$$serializer = ChannelId$$serializer.INSTANCE;
        a2 a2Var = a2.f26237a;
        return new KSerializer[]{channelId$$serializer, channelId$$serializer, MessageId$$serializer.INSTANCE, GuildId$$serializer.INSTANCE, a2Var, a2Var, m0.f26312a, StructurableTextSerializer.INSTANCE, a.u(a2Var), a.u(a2Var), a.u(a2Var), a.u(a2Var), a.u(a2Var), a.u(a2Var), h.f26279a, a.u(a2Var)};
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
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        int i12 = 11;
        char c11 = '\n';
        Object obj13 = null;
        if (c10.y()) {
            ChannelId$$serializer channelId$$serializer = ChannelId$$serializer.INSTANCE;
            obj9 = c10.m(descriptor2, 0, channelId$$serializer, null);
            obj12 = c10.m(descriptor2, 1, channelId$$serializer, null);
            obj11 = c10.m(descriptor2, 2, MessageId$$serializer.INSTANCE, null);
            obj10 = c10.m(descriptor2, 3, GuildId$$serializer.INSTANCE, null);
            str2 = c10.t(descriptor2, 4);
            str = c10.t(descriptor2, 5);
            i10 = c10.k(descriptor2, 6);
            obj5 = c10.m(descriptor2, 7, StructurableTextSerializer.INSTANCE, null);
            a2 a2Var = a2.f26237a;
            obj3 = c10.v(descriptor2, 8, a2Var, null);
            obj6 = c10.v(descriptor2, 9, a2Var, null);
            obj7 = c10.v(descriptor2, 10, a2Var, null);
            obj8 = c10.v(descriptor2, 11, a2Var, null);
            obj = c10.v(descriptor2, 12, a2Var, null);
            obj2 = c10.v(descriptor2, 13, a2Var, null);
            z10 = c10.s(descriptor2, 14);
            obj4 = c10.v(descriptor2, 15, a2Var, null);
            i11 = 65535;
        } else {
            int i13 = 15;
            int i14 = 0;
            boolean z11 = false;
            int i15 = 0;
            boolean z12 = true;
            Object obj14 = null;
            Object obj15 = null;
            Object obj16 = null;
            Object obj17 = null;
            Object obj18 = null;
            Object obj19 = null;
            obj4 = null;
            Object obj20 = null;
            Object obj21 = null;
            Object obj22 = null;
            Object obj23 = null;
            String str3 = null;
            String str4 = null;
            while (z12) {
                int x10 = c10.x(descriptor2);
                switch (x10) {
                    case -1:
                        obj21 = obj21;
                        z12 = false;
                        obj14 = obj14;
                        i12 = 11;
                        c11 = '\n';
                        break;
                    case 0:
                        obj21 = obj21;
                        obj14 = obj14;
                        obj22 = c10.m(descriptor2, 0, ChannelId$$serializer.INSTANCE, obj22);
                        i14 |= 1;
                        i13 = 15;
                        i12 = 11;
                        c11 = '\n';
                        break;
                    case 1:
                        obj21 = obj21;
                        obj14 = obj14;
                        obj13 = c10.m(descriptor2, 1, ChannelId$$serializer.INSTANCE, obj13);
                        i14 |= 2;
                        i13 = 15;
                        i12 = 11;
                        c11 = '\n';
                        break;
                    case 2:
                        obj21 = c10.m(descriptor2, 2, MessageId$$serializer.INSTANCE, obj21);
                        i14 |= 4;
                        obj14 = obj14;
                        i12 = 11;
                        c11 = '\n';
                        i13 = 15;
                        break;
                    case 3:
                        obj15 = c10.m(descriptor2, 3, GuildId$$serializer.INSTANCE, obj15);
                        i14 |= 8;
                        i13 = 15;
                        i12 = 11;
                        c11 = '\n';
                        break;
                    case 4:
                        str4 = c10.t(descriptor2, 4);
                        i14 |= 16;
                        i13 = 15;
                        i12 = 11;
                        c11 = '\n';
                        break;
                    case 5:
                        str3 = c10.t(descriptor2, 5);
                        i14 |= 32;
                        i13 = 15;
                        i12 = 11;
                        c11 = '\n';
                        break;
                    case 6:
                        i15 = c10.k(descriptor2, 6);
                        i14 |= 64;
                        i13 = 15;
                        i12 = 11;
                        c11 = '\n';
                        break;
                    case 7:
                        obj23 = c10.m(descriptor2, 7, StructurableTextSerializer.INSTANCE, obj23);
                        i14 |= 128;
                        i13 = 15;
                        i12 = 11;
                        c11 = '\n';
                        break;
                    case 8:
                        obj17 = c10.v(descriptor2, 8, a2.f26237a, obj17);
                        i14 |= 256;
                        i13 = 15;
                        i12 = 11;
                        c11 = '\n';
                        break;
                    case 9:
                        obj18 = c10.v(descriptor2, 9, a2.f26237a, obj18);
                        i14 |= 512;
                        i13 = 15;
                        i12 = 11;
                        c11 = '\n';
                        break;
                    case 10:
                        obj19 = c10.v(descriptor2, 10, a2.f26237a, obj19);
                        i14 |= 1024;
                        c11 = '\n';
                        i13 = 15;
                        i12 = 11;
                        break;
                    case 11:
                        obj20 = c10.v(descriptor2, i12, a2.f26237a, obj20);
                        i14 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        i13 = 15;
                        c11 = '\n';
                        break;
                    case 12:
                        obj14 = c10.v(descriptor2, 12, a2.f26237a, obj14);
                        i14 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        i13 = 15;
                        c11 = '\n';
                        break;
                    case 13:
                        obj16 = c10.v(descriptor2, 13, a2.f26237a, obj16);
                        i14 |= 8192;
                        i13 = 15;
                        c11 = '\n';
                        break;
                    case 14:
                        z11 = c10.s(descriptor2, 14);
                        i14 |= 16384;
                        break;
                    case 15:
                        obj4 = c10.v(descriptor2, i13, a2.f26237a, obj4);
                        i14 |= 32768;
                        break;
                    default:
                        throw new n(x10);
                }
            }
            obj9 = obj22;
            obj2 = obj16;
            obj12 = obj13;
            obj6 = obj18;
            i11 = i14;
            z10 = z11;
            obj = obj14;
            i10 = i15;
            str = str3;
            str2 = str4;
            obj10 = obj15;
            obj11 = obj21;
            obj3 = obj17;
            obj7 = obj19;
            obj5 = obj23;
            obj8 = obj20;
        }
        c10.b(descriptor2);
        MessageId messageId = (MessageId) obj11;
        return new PostPreviewEmbed(i11, (ChannelId) obj9, (ChannelId) obj12, messageId != null ? messageId.m600unboximpl() : null, (GuildId) obj10, str2, str, i10, (StructurableText) obj5, (String) obj3, (String) obj6, (String) obj7, (String) obj8, (String) obj, (String) obj2, z10, (String) obj4, null, null);
    }

    @Override 
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

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
