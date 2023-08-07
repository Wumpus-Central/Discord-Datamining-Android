package com.discord.chat.bridge.embed;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.embed.EmbedFailureState;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import com.facebook.react.uimanager.ViewProps;
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
import org.webrtc.MediaStreamTrack;
import ti.n;
import ui.a;
import wi.a2;
import wi.f;
import wi.f0;
import wi.h;
import wi.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/embed/Embed.$serializer", "Lwi/f0;", "Lcom/discord/chat/bridge/embed/Embed;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class Embed$$serializer implements f0<Embed> {
    public static final Embed$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        Embed$$serializer embed$$serializer = new Embed$$serializer();
        INSTANCE = embed$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.embed.Embed", embed$$serializer, 27);
        pluginGeneratedSerialDescriptor.l("type", false);
        pluginGeneratedSerialDescriptor.l("author", true);
        pluginGeneratedSerialDescriptor.l("provider", true);
        pluginGeneratedSerialDescriptor.l("rawTitle", true);
        pluginGeneratedSerialDescriptor.l("title", true);
        pluginGeneratedSerialDescriptor.l("fields", true);
        pluginGeneratedSerialDescriptor.l("url", true);
        pluginGeneratedSerialDescriptor.l("rawDescription", true);
        pluginGeneratedSerialDescriptor.l("description", true);
        pluginGeneratedSerialDescriptor.l("image", true);
        pluginGeneratedSerialDescriptor.l("images", true);
        pluginGeneratedSerialDescriptor.l(MediaStreamTrack.VIDEO_TRACK_KIND, true);
        pluginGeneratedSerialDescriptor.l("thumbnail", true);
        pluginGeneratedSerialDescriptor.l("numAttachments", true);
        pluginGeneratedSerialDescriptor.l("attachmentsSize", true);
        pluginGeneratedSerialDescriptor.l("messageSendError", true);
        pluginGeneratedSerialDescriptor.l("disableBackgroundColor", true);
        pluginGeneratedSerialDescriptor.l("footer", true);
        pluginGeneratedSerialDescriptor.l("spoiler", true);
        pluginGeneratedSerialDescriptor.l("iconURL", true);
        pluginGeneratedSerialDescriptor.l("failureState", true);
        pluginGeneratedSerialDescriptor.l("providerColor", true);
        pluginGeneratedSerialDescriptor.l(ViewProps.BORDER_LEFT_COLOR, true);
        pluginGeneratedSerialDescriptor.l("headerTextColor", true);
        pluginGeneratedSerialDescriptor.l("bodyTextColor", false);
        pluginGeneratedSerialDescriptor.l(ViewProps.BACKGROUND_COLOR, true);
        pluginGeneratedSerialDescriptor.l("spoilerOrNull", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Embed$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f29540a;
        StructurableTextSerializer structurableTextSerializer = StructurableTextSerializer.INSTANCE;
        EmbedMedia$$serializer embedMedia$$serializer = EmbedMedia$$serializer.INSTANCE;
        m0 m0Var = m0.f29615a;
        return new KSerializer[]{EmbedType.Companion.serializer(), a.u(EmbedAuthor$$serializer.INSTANCE), a.u(EmbedProvider$$serializer.INSTANCE), a.u(a2Var), a.u(structurableTextSerializer), a.u(new f(EmbedField$$serializer.INSTANCE)), a.u(a2Var), a.u(a2Var), a.u(structurableTextSerializer), a.u(embedMedia$$serializer), a.u(new f(embedMedia$$serializer)), a.u(embedMedia$$serializer), a.u(EmbedThumbnail$$serializer.INSTANCE), a.u(a2Var), a.u(a2Var), a.u(a2Var), a.u(h.f29582a), a.u(EmbedFooter$$serializer.INSTANCE), a.u(a2Var), a.u(a2Var), a.u(EmbedFailureState.Serializer.INSTANCE), a.u(m0Var), a.u(m0Var), a.u(m0Var), m0Var, a.u(m0Var), a.u(a2Var)};
    }

    @Override 
    public Embed deserialize(Decoder decoder) {
        int i10;
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
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        Object obj19;
        Object obj20;
        Object obj21;
        Object obj22;
        Object obj23;
        Object obj24;
        Object obj25;
        Object obj26;
        int i12;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        if (c10.y()) {
            obj26 = c10.m(descriptor2, 0, EmbedType.Companion.serializer(), null);
            obj20 = c10.v(descriptor2, 1, EmbedAuthor$$serializer.INSTANCE, null);
            obj21 = c10.v(descriptor2, 2, EmbedProvider$$serializer.INSTANCE, null);
            a2 a2Var = a2.f29540a;
            obj3 = c10.v(descriptor2, 3, a2Var, null);
            StructurableTextSerializer structurableTextSerializer = StructurableTextSerializer.INSTANCE;
            obj2 = c10.v(descriptor2, 4, structurableTextSerializer, null);
            obj25 = c10.v(descriptor2, 5, new f(EmbedField$$serializer.INSTANCE), null);
            obj17 = c10.v(descriptor2, 6, a2Var, null);
            obj16 = c10.v(descriptor2, 7, a2Var, null);
            obj = c10.v(descriptor2, 8, structurableTextSerializer, null);
            EmbedMedia$$serializer embedMedia$$serializer = EmbedMedia$$serializer.INSTANCE;
            obj19 = c10.v(descriptor2, 9, embedMedia$$serializer, null);
            obj5 = c10.v(descriptor2, 10, new f(embedMedia$$serializer), null);
            obj18 = c10.v(descriptor2, 11, embedMedia$$serializer, null);
            obj7 = c10.v(descriptor2, 12, EmbedThumbnail$$serializer.INSTANCE, null);
            obj6 = c10.v(descriptor2, 13, a2Var, null);
            obj8 = c10.v(descriptor2, 14, a2Var, null);
            obj9 = c10.v(descriptor2, 15, a2Var, null);
            obj10 = c10.v(descriptor2, 16, h.f29582a, null);
            obj12 = c10.v(descriptor2, 17, EmbedFooter$$serializer.INSTANCE, null);
            obj11 = c10.v(descriptor2, 18, a2Var, null);
            obj13 = c10.v(descriptor2, 19, a2Var, null);
            obj24 = c10.v(descriptor2, 20, EmbedFailureState.Serializer.INSTANCE, null);
            m0 m0Var = m0.f29615a;
            obj23 = c10.v(descriptor2, 21, m0Var, null);
            obj4 = c10.v(descriptor2, 22, m0Var, null);
            obj14 = c10.v(descriptor2, 23, m0Var, null);
            i10 = c10.k(descriptor2, 24);
            obj15 = c10.v(descriptor2, 25, m0Var, null);
            obj22 = c10.v(descriptor2, 26, a2Var, null);
            i11 = 134217727;
        } else {
            boolean z10 = true;
            Object obj27 = null;
            Object obj28 = null;
            obj24 = null;
            obj23 = null;
            obj22 = null;
            Object obj29 = null;
            Object obj30 = null;
            Object obj31 = null;
            Object obj32 = null;
            Object obj33 = null;
            obj15 = null;
            obj14 = null;
            Object obj34 = null;
            Object obj35 = null;
            Object obj36 = null;
            Object obj37 = null;
            Object obj38 = null;
            Object obj39 = null;
            Object obj40 = null;
            Object obj41 = null;
            Object obj42 = null;
            Object obj43 = null;
            Object obj44 = null;
            Object obj45 = null;
            Object obj46 = null;
            int i13 = 0;
            int i14 = 0;
            Object obj47 = null;
            while (z10) {
                int x10 = c10.x(descriptor2);
                switch (x10) {
                    case -1:
                        obj27 = obj27;
                        obj28 = obj28;
                        obj30 = obj30;
                        z10 = false;
                        break;
                    case 0:
                        obj34 = c10.m(descriptor2, 0, EmbedType.Companion.serializer(), obj34);
                        i14 |= 1;
                        obj27 = obj27;
                        obj28 = obj28;
                        obj30 = obj30;
                        obj35 = obj35;
                        break;
                    case 1:
                        obj35 = c10.v(descriptor2, 1, EmbedAuthor$$serializer.INSTANCE, obj35);
                        i14 |= 2;
                        obj27 = obj27;
                        obj28 = obj28;
                        obj30 = obj30;
                        obj36 = obj36;
                        break;
                    case 2:
                        obj36 = c10.v(descriptor2, 2, EmbedProvider$$serializer.INSTANCE, obj36);
                        i14 |= 4;
                        obj27 = obj27;
                        obj28 = obj28;
                        obj30 = obj30;
                        obj37 = obj37;
                        break;
                    case 3:
                        obj37 = c10.v(descriptor2, 3, a2.f29540a, obj37);
                        i14 |= 8;
                        obj27 = obj27;
                        obj28 = obj28;
                        obj30 = obj30;
                        obj38 = obj38;
                        break;
                    case 4:
                        obj38 = c10.v(descriptor2, 4, StructurableTextSerializer.INSTANCE, obj38);
                        i14 |= 16;
                        obj27 = obj27;
                        obj28 = obj28;
                        obj30 = obj30;
                        obj39 = obj39;
                        break;
                    case 5:
                        obj39 = c10.v(descriptor2, 5, new f(EmbedField$$serializer.INSTANCE), obj39);
                        i14 |= 32;
                        obj27 = obj27;
                        obj28 = obj28;
                        obj30 = obj30;
                        obj40 = obj40;
                        break;
                    case 6:
                        obj40 = c10.v(descriptor2, 6, a2.f29540a, obj40);
                        i14 |= 64;
                        obj27 = obj27;
                        obj28 = obj28;
                        obj30 = obj30;
                        obj41 = obj41;
                        break;
                    case 7:
                        obj41 = c10.v(descriptor2, 7, a2.f29540a, obj41);
                        i14 |= 128;
                        obj27 = obj27;
                        obj28 = obj28;
                        obj30 = obj30;
                        obj42 = obj42;
                        break;
                    case 8:
                        obj42 = c10.v(descriptor2, 8, StructurableTextSerializer.INSTANCE, obj42);
                        i14 |= 256;
                        obj27 = obj27;
                        obj28 = obj28;
                        obj30 = obj30;
                        obj43 = obj43;
                        break;
                    case 9:
                        obj43 = c10.v(descriptor2, 9, EmbedMedia$$serializer.INSTANCE, obj43);
                        i14 |= 512;
                        obj27 = obj27;
                        obj28 = obj28;
                        obj30 = obj30;
                        obj44 = obj44;
                        break;
                    case 10:
                        obj44 = c10.v(descriptor2, 10, new f(EmbedMedia$$serializer.INSTANCE), obj44);
                        i14 |= 1024;
                        obj27 = obj27;
                        obj28 = obj28;
                        obj30 = obj30;
                        obj45 = obj45;
                        break;
                    case 11:
                        obj45 = c10.v(descriptor2, 11, EmbedMedia$$serializer.INSTANCE, obj45);
                        i14 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        obj27 = obj27;
                        obj28 = obj28;
                        obj30 = obj30;
                        obj46 = obj46;
                        break;
                    case 12:
                        obj27 = obj27;
                        obj28 = obj28;
                        obj30 = obj30;
                        obj46 = c10.v(descriptor2, 12, EmbedThumbnail$$serializer.INSTANCE, obj46);
                        i14 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        break;
                    case 13:
                        obj30 = c10.v(descriptor2, 13, a2.f29540a, obj30);
                        i14 |= 8192;
                        obj27 = obj27;
                        obj28 = obj28;
                        break;
                    case 14:
                        obj31 = c10.v(descriptor2, 14, a2.f29540a, obj31);
                        i14 |= 16384;
                        obj27 = obj27;
                        obj30 = obj30;
                        break;
                    case 15:
                        obj31 = obj31;
                        obj32 = c10.v(descriptor2, 15, a2.f29540a, obj32);
                        i12 = 32768;
                        i14 |= i12;
                        obj30 = obj30;
                        break;
                    case 16:
                        obj31 = obj31;
                        obj33 = c10.v(descriptor2, 16, h.f29582a, obj33);
                        i12 = 65536;
                        i14 |= i12;
                        obj30 = obj30;
                        break;
                    case 17:
                        obj31 = obj31;
                        obj47 = c10.v(descriptor2, 17, EmbedFooter$$serializer.INSTANCE, obj47);
                        i12 = 131072;
                        i14 |= i12;
                        obj30 = obj30;
                        break;
                    case 18:
                        obj31 = obj31;
                        obj27 = c10.v(descriptor2, 18, a2.f29540a, obj27);
                        i12 = 262144;
                        i14 |= i12;
                        obj30 = obj30;
                        break;
                    case 19:
                        obj31 = obj31;
                        obj29 = c10.v(descriptor2, 19, a2.f29540a, obj29);
                        i12 = 524288;
                        i14 |= i12;
                        obj30 = obj30;
                        break;
                    case 20:
                        obj31 = obj31;
                        obj24 = c10.v(descriptor2, 20, EmbedFailureState.Serializer.INSTANCE, obj24);
                        i12 = 1048576;
                        i14 |= i12;
                        obj30 = obj30;
                        break;
                    case 21:
                        obj31 = obj31;
                        obj23 = c10.v(descriptor2, 21, m0.f29615a, obj23);
                        i12 = 2097152;
                        i14 |= i12;
                        obj30 = obj30;
                        break;
                    case 22:
                        obj31 = obj31;
                        obj28 = c10.v(descriptor2, 22, m0.f29615a, obj28);
                        i12 = 4194304;
                        i14 |= i12;
                        obj30 = obj30;
                        break;
                    case 23:
                        obj31 = obj31;
                        obj14 = c10.v(descriptor2, 23, m0.f29615a, obj14);
                        i12 = 8388608;
                        i14 |= i12;
                        obj30 = obj30;
                        break;
                    case 24:
                        i13 = c10.k(descriptor2, 24);
                        i14 |= 16777216;
                        obj30 = obj30;
                        break;
                    case 25:
                        obj31 = obj31;
                        obj15 = c10.v(descriptor2, 25, m0.f29615a, obj15);
                        i12 = 33554432;
                        i14 |= i12;
                        obj30 = obj30;
                        break;
                    case 26:
                        obj31 = obj31;
                        obj22 = c10.v(descriptor2, 26, a2.f29540a, obj22);
                        i12 = 67108864;
                        i14 |= i12;
                        obj30 = obj30;
                        break;
                    default:
                        throw new n(x10);
                }
            }
            obj6 = obj30;
            obj3 = obj37;
            obj2 = obj38;
            obj = obj42;
            obj26 = obj34;
            obj13 = obj29;
            i11 = i14;
            obj12 = obj47;
            obj9 = obj32;
            obj10 = obj33;
            obj11 = obj27;
            obj20 = obj35;
            obj21 = obj36;
            obj25 = obj39;
            obj17 = obj40;
            obj16 = obj41;
            obj19 = obj43;
            i10 = i13;
            obj8 = obj31;
            obj4 = obj28;
            obj7 = obj46;
            obj18 = obj45;
            obj5 = obj44;
        }
        c10.b(descriptor2);
        return new Embed(i11, (EmbedType) obj26, (EmbedAuthor) obj20, (EmbedProvider) obj21, (String) obj3, (StructurableText) obj2, (List) obj25, (String) obj17, (String) obj16, (StructurableText) obj, (EmbedMedia) obj19, (List) obj5, (EmbedMedia) obj18, (EmbedThumbnail) obj7, (String) obj6, (String) obj8, (String) obj9, (Boolean) obj10, (EmbedFooter) obj12, (String) obj11, (String) obj13, (EmbedFailureState) obj24, (Integer) obj23, (Integer) obj4, (Integer) obj14, i10, (Integer) obj15, (String) obj22, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, Embed value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        Embed.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
