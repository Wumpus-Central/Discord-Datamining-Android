package com.discord.chat.bridge.embed;

import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC2522f0;
import bj.C2500a2;
import bj.C2521f;
import bj.C2530h;
import bj.C2555m0;
import com.discord.chat.bridge.embed.EmbedFailureState;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import com.facebook.react.uimanager.ViewProps;
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
import org.webrtc.MediaStreamTrack;
import p164j$.util.Spliterator;
import p450yi.C14382n;
import p470zi.C14606a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/embed/Embed.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/embed/Embed;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class Embed$$serializer implements AbstractC2522f0<Embed> {
    public static final Embed$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Embed$$serializer embed$$serializer = new Embed$$serializer();
        INSTANCE = embed$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.embed.Embed", embed$$serializer, 26);
        pluginGeneratedSerialDescriptor.m13841l("type", false);
        pluginGeneratedSerialDescriptor.m13841l("author", true);
        pluginGeneratedSerialDescriptor.m13841l("provider", true);
        pluginGeneratedSerialDescriptor.m13841l("rawTitle", true);
        pluginGeneratedSerialDescriptor.m13841l("title", true);
        pluginGeneratedSerialDescriptor.m13841l("fields", true);
        pluginGeneratedSerialDescriptor.m13841l("url", true);
        pluginGeneratedSerialDescriptor.m13841l("rawDescription", true);
        pluginGeneratedSerialDescriptor.m13841l("description", true);
        pluginGeneratedSerialDescriptor.m13841l("image", true);
        pluginGeneratedSerialDescriptor.m13841l("images", true);
        pluginGeneratedSerialDescriptor.m13841l(MediaStreamTrack.VIDEO_TRACK_KIND, true);
        pluginGeneratedSerialDescriptor.m13841l("thumbnail", true);
        pluginGeneratedSerialDescriptor.m13841l("numAttachments", true);
        pluginGeneratedSerialDescriptor.m13841l("attachmentsSize", true);
        pluginGeneratedSerialDescriptor.m13841l("messageSendError", true);
        pluginGeneratedSerialDescriptor.m13841l("disableBackgroundColor", true);
        pluginGeneratedSerialDescriptor.m13841l("footer", true);
        pluginGeneratedSerialDescriptor.m13841l("spoiler", true);
        pluginGeneratedSerialDescriptor.m13841l("iconURL", true);
        pluginGeneratedSerialDescriptor.m13841l("failureState", true);
        pluginGeneratedSerialDescriptor.m13841l("providerColor", true);
        pluginGeneratedSerialDescriptor.m13841l(ViewProps.BORDER_LEFT_COLOR, true);
        pluginGeneratedSerialDescriptor.m13841l("headerTextColor", true);
        pluginGeneratedSerialDescriptor.m13841l("bodyTextColor", false);
        pluginGeneratedSerialDescriptor.m13841l("spoilerOrNull", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Embed$$serializer() {
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] childSerializers() {
        C2500a2 a2Var = C2500a2.f6719a;
        StructurableTextSerializer structurableTextSerializer = StructurableTextSerializer.INSTANCE;
        EmbedMedia$$serializer embedMedia$$serializer = EmbedMedia$$serializer.INSTANCE;
        C2555m0 m0Var = C2555m0.f6794a;
        return new KSerializer[]{EmbedType.Companion.serializer(), C14606a.m13u(EmbedAuthor$$serializer.INSTANCE), C14606a.m13u(EmbedProvider$$serializer.INSTANCE), C14606a.m13u(a2Var), C14606a.m13u(structurableTextSerializer), C14606a.m13u(new C2521f(EmbedField$$serializer.INSTANCE)), C14606a.m13u(a2Var), C14606a.m13u(a2Var), C14606a.m13u(structurableTextSerializer), C14606a.m13u(embedMedia$$serializer), C14606a.m13u(new C2521f(embedMedia$$serializer)), C14606a.m13u(embedMedia$$serializer), C14606a.m13u(EmbedThumbnail$$serializer.INSTANCE), C14606a.m13u(a2Var), C14606a.m13u(a2Var), C14606a.m13u(a2Var), C14606a.m13u(C2530h.f6761a), C14606a.m13u(EmbedFooter$$serializer.INSTANCE), C14606a.m13u(a2Var), C14606a.m13u(a2Var), C14606a.m13u(EmbedFailureState.Serializer.INSTANCE), C14606a.m13u(m0Var), C14606a.m13u(m0Var), C14606a.m13u(m0Var), m0Var, C14606a.m13u(a2Var)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Embed deserialize(Decoder decoder) {
        int i;
        int i2;
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
        int i3;
        C9677q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC9967c b = decoder.mo13905b(descriptor2);
        if (b.mo13850p()) {
            obj25 = b.mo13847y(descriptor2, 0, EmbedType.Companion.serializer(), null);
            obj = b.mo13852n(descriptor2, 1, EmbedAuthor$$serializer.INSTANCE, null);
            obj18 = b.mo13852n(descriptor2, 2, EmbedProvider$$serializer.INSTANCE, null);
            C2500a2 a2Var = C2500a2.f6719a;
            obj23 = b.mo13852n(descriptor2, 3, a2Var, null);
            StructurableTextSerializer structurableTextSerializer = StructurableTextSerializer.INSTANCE;
            obj20 = b.mo13852n(descriptor2, 4, structurableTextSerializer, null);
            obj24 = b.mo13852n(descriptor2, 5, new C2521f(EmbedField$$serializer.INSTANCE), null);
            obj15 = b.mo13852n(descriptor2, 6, a2Var, null);
            obj14 = b.mo13852n(descriptor2, 7, a2Var, null);
            obj19 = b.mo13852n(descriptor2, 8, structurableTextSerializer, null);
            EmbedMedia$$serializer embedMedia$$serializer = EmbedMedia$$serializer.INSTANCE;
            obj17 = b.mo13852n(descriptor2, 9, embedMedia$$serializer, null);
            obj3 = b.mo13852n(descriptor2, 10, new C2521f(embedMedia$$serializer), null);
            obj16 = b.mo13852n(descriptor2, 11, embedMedia$$serializer, null);
            obj5 = b.mo13852n(descriptor2, 12, EmbedThumbnail$$serializer.INSTANCE, null);
            obj4 = b.mo13852n(descriptor2, 13, a2Var, null);
            obj6 = b.mo13852n(descriptor2, 14, a2Var, null);
            obj7 = b.mo13852n(descriptor2, 15, a2Var, null);
            obj8 = b.mo13852n(descriptor2, 16, C2530h.f6761a, null);
            obj10 = b.mo13852n(descriptor2, 17, EmbedFooter$$serializer.INSTANCE, null);
            obj9 = b.mo13852n(descriptor2, 18, a2Var, null);
            obj11 = b.mo13852n(descriptor2, 19, a2Var, null);
            obj22 = b.mo13852n(descriptor2, 20, EmbedFailureState.Serializer.INSTANCE, null);
            C2555m0 m0Var = C2555m0.f6794a;
            obj2 = b.mo13852n(descriptor2, 21, m0Var, null);
            obj12 = b.mo13852n(descriptor2, 22, m0Var, null);
            obj13 = b.mo13852n(descriptor2, 23, m0Var, null);
            i2 = b.mo13855i(descriptor2, 24);
            obj21 = b.mo13852n(descriptor2, 25, a2Var, null);
            i = 67108863;
        } else {
            boolean z = true;
            int i4 = 0;
            Object obj26 = null;
            Object obj27 = null;
            Object obj28 = null;
            obj22 = null;
            obj21 = null;
            Object obj29 = null;
            Object obj30 = null;
            Object obj31 = null;
            Object obj32 = null;
            Object obj33 = null;
            obj13 = null;
            obj12 = null;
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
            int i5 = 0;
            while (z) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        obj27 = obj27;
                        obj28 = obj28;
                        obj26 = obj26;
                        z = false;
                        break;
                    case 0:
                        obj34 = b.mo13847y(descriptor2, 0, EmbedType.Companion.serializer(), obj34);
                        i5 |= 1;
                        obj27 = obj27;
                        obj28 = obj28;
                        obj26 = obj26;
                        obj35 = obj35;
                        break;
                    case 1:
                        obj35 = b.mo13852n(descriptor2, 1, EmbedAuthor$$serializer.INSTANCE, obj35);
                        i5 |= 2;
                        obj27 = obj27;
                        obj28 = obj28;
                        obj26 = obj26;
                        obj36 = obj36;
                        break;
                    case 2:
                        obj36 = b.mo13852n(descriptor2, 2, EmbedProvider$$serializer.INSTANCE, obj36);
                        i5 |= 4;
                        obj27 = obj27;
                        obj28 = obj28;
                        obj26 = obj26;
                        obj37 = obj37;
                        break;
                    case 3:
                        obj37 = b.mo13852n(descriptor2, 3, C2500a2.f6719a, obj37);
                        i5 |= 8;
                        obj27 = obj27;
                        obj28 = obj28;
                        obj26 = obj26;
                        obj38 = obj38;
                        break;
                    case 4:
                        obj38 = b.mo13852n(descriptor2, 4, StructurableTextSerializer.INSTANCE, obj38);
                        i5 |= 16;
                        obj27 = obj27;
                        obj28 = obj28;
                        obj26 = obj26;
                        obj39 = obj39;
                        break;
                    case 5:
                        obj39 = b.mo13852n(descriptor2, 5, new C2521f(EmbedField$$serializer.INSTANCE), obj39);
                        i5 |= 32;
                        obj27 = obj27;
                        obj28 = obj28;
                        obj26 = obj26;
                        obj40 = obj40;
                        break;
                    case 6:
                        obj40 = b.mo13852n(descriptor2, 6, C2500a2.f6719a, obj40);
                        i5 |= 64;
                        obj27 = obj27;
                        obj28 = obj28;
                        obj26 = obj26;
                        obj41 = obj41;
                        break;
                    case 7:
                        obj41 = b.mo13852n(descriptor2, 7, C2500a2.f6719a, obj41);
                        i5 |= 128;
                        obj27 = obj27;
                        obj28 = obj28;
                        obj26 = obj26;
                        obj42 = obj42;
                        break;
                    case 8:
                        obj42 = b.mo13852n(descriptor2, 8, StructurableTextSerializer.INSTANCE, obj42);
                        i5 |= Spliterator.NONNULL;
                        obj27 = obj27;
                        obj28 = obj28;
                        obj26 = obj26;
                        obj43 = obj43;
                        break;
                    case 9:
                        obj43 = b.mo13852n(descriptor2, 9, EmbedMedia$$serializer.INSTANCE, obj43);
                        i5 |= 512;
                        obj27 = obj27;
                        obj28 = obj28;
                        obj26 = obj26;
                        obj44 = obj44;
                        break;
                    case 10:
                        obj44 = b.mo13852n(descriptor2, 10, new C2521f(EmbedMedia$$serializer.INSTANCE), obj44);
                        i5 |= Spliterator.IMMUTABLE;
                        obj27 = obj27;
                        obj28 = obj28;
                        obj26 = obj26;
                        obj45 = obj45;
                        break;
                    case 11:
                        obj27 = obj27;
                        obj28 = obj28;
                        obj26 = obj26;
                        obj45 = b.mo13852n(descriptor2, 11, EmbedMedia$$serializer.INSTANCE, obj45);
                        i5 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        break;
                    case 12:
                        obj26 = b.mo13852n(descriptor2, 12, EmbedThumbnail$$serializer.INSTANCE, obj26);
                        i5 |= 4096;
                        obj27 = obj27;
                        obj28 = obj28;
                        break;
                    case 13:
                        obj31 = b.mo13852n(descriptor2, 13, C2500a2.f6719a, obj31);
                        i5 |= 8192;
                        obj27 = obj27;
                        obj26 = obj26;
                        break;
                    case 14:
                        obj31 = obj31;
                        obj32 = b.mo13852n(descriptor2, 14, C2500a2.f6719a, obj32);
                        i5 |= Spliterator.SUBSIZED;
                        obj26 = obj26;
                        break;
                    case 15:
                        obj31 = obj31;
                        obj33 = b.mo13852n(descriptor2, 15, C2500a2.f6719a, obj33);
                        i3 = 32768;
                        i5 |= i3;
                        obj26 = obj26;
                        break;
                    case 16:
                        obj31 = obj31;
                        obj46 = b.mo13852n(descriptor2, 16, C2530h.f6761a, obj46);
                        i3 = 65536;
                        i5 |= i3;
                        obj26 = obj26;
                        break;
                    case 17:
                        obj31 = obj31;
                        obj30 = b.mo13852n(descriptor2, 17, EmbedFooter$$serializer.INSTANCE, obj30);
                        i3 = 131072;
                        i5 |= i3;
                        obj26 = obj26;
                        break;
                    case 18:
                        obj31 = obj31;
                        obj29 = b.mo13852n(descriptor2, 18, C2500a2.f6719a, obj29);
                        i3 = 262144;
                        i5 |= i3;
                        obj26 = obj26;
                        break;
                    case 19:
                        obj31 = obj31;
                        obj28 = b.mo13852n(descriptor2, 19, C2500a2.f6719a, obj28);
                        i3 = 524288;
                        i5 |= i3;
                        obj26 = obj26;
                        break;
                    case 20:
                        obj31 = obj31;
                        obj22 = b.mo13852n(descriptor2, 20, EmbedFailureState.Serializer.INSTANCE, obj22);
                        i3 = 1048576;
                        i5 |= i3;
                        obj26 = obj26;
                        break;
                    case 21:
                        obj31 = obj31;
                        obj27 = b.mo13852n(descriptor2, 21, C2555m0.f6794a, obj27);
                        i3 = 2097152;
                        i5 |= i3;
                        obj26 = obj26;
                        break;
                    case 22:
                        obj31 = obj31;
                        obj12 = b.mo13852n(descriptor2, 22, C2555m0.f6794a, obj12);
                        i3 = 4194304;
                        i5 |= i3;
                        obj26 = obj26;
                        break;
                    case 23:
                        obj31 = obj31;
                        obj13 = b.mo13852n(descriptor2, 23, C2555m0.f6794a, obj13);
                        i3 = 8388608;
                        i5 |= i3;
                        obj26 = obj26;
                        break;
                    case 24:
                        i4 = b.mo13855i(descriptor2, 24);
                        i5 |= 16777216;
                        obj26 = obj26;
                        break;
                    case 25:
                        obj31 = obj31;
                        obj21 = b.mo13852n(descriptor2, 25, C2500a2.f6719a, obj21);
                        i3 = 33554432;
                        i5 |= i3;
                        obj26 = obj26;
                        break;
                    default:
                        throw new C14382n(o);
                }
            }
            obj = obj35;
            obj25 = obj34;
            obj9 = obj29;
            obj10 = obj30;
            obj8 = obj46;
            i = i5;
            obj6 = obj32;
            obj7 = obj33;
            obj11 = obj28;
            obj18 = obj36;
            obj23 = obj37;
            obj20 = obj38;
            obj24 = obj39;
            obj15 = obj40;
            obj14 = obj41;
            obj19 = obj42;
            obj17 = obj43;
            i2 = i4;
            obj4 = obj31;
            obj16 = obj45;
            obj2 = obj27;
            obj5 = obj26;
            obj3 = obj44;
        }
        b.mo13857c(descriptor2);
        return new Embed(i, (EmbedType) obj25, (EmbedAuthor) obj, (EmbedProvider) obj18, (String) obj23, (StructurableText) obj20, (List) obj24, (String) obj15, (String) obj14, (StructurableText) obj19, (EmbedMedia) obj17, (List) obj3, (EmbedMedia) obj16, (EmbedThumbnail) obj5, (String) obj4, (String) obj6, (String) obj7, (Boolean) obj8, (EmbedFooter) obj10, (String) obj9, (String) obj11, (EmbedFailureState) obj22, (Integer) obj2, (Integer) obj12, (Integer) obj13, i2, (String) obj21, null);
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, Embed value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        Embed.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC2522f0.C2523a.m33897a(this);
    }
}
