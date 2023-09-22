package com.discord.chat.bridge.codedlinks;

import aj.a;
import androidx.recyclerview.widget.RecyclerView;
import cj.a2;
import cj.f;
import cj.f0;
import cj.h;
import cj.m0;
import com.discord.chat.bridge.codedlinks.CodedLinkExtendedType;
import com.discord.chat.bridge.codedlinks.InviteType;
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText;
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableTextSerializer;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import zi.n;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/codedlinks/EmbeddedActivityInviteEmbedImpl.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/codedlinks/EmbeddedActivityInviteEmbedImpl;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class EmbeddedActivityInviteEmbedImpl$$serializer implements f0<EmbeddedActivityInviteEmbedImpl> {
    public static final EmbeddedActivityInviteEmbedImpl$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        EmbeddedActivityInviteEmbedImpl$$serializer embeddedActivityInviteEmbedImpl$$serializer = new EmbeddedActivityInviteEmbedImpl$$serializer();
        INSTANCE = embeddedActivityInviteEmbedImpl$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.codedlinks.EmbeddedActivityInviteEmbedImpl", embeddedActivityInviteEmbedImpl$$serializer, 32);
        pluginGeneratedSerialDescriptor.l(ViewProps.BACKGROUND_COLOR, false);
        pluginGeneratedSerialDescriptor.l(ViewProps.BORDER_COLOR, false);
        pluginGeneratedSerialDescriptor.l("headerColor", false);
        pluginGeneratedSerialDescriptor.l("headerText", false);
        pluginGeneratedSerialDescriptor.l("type", true);
        pluginGeneratedSerialDescriptor.l("acceptLabelBackgroundColor", true);
        pluginGeneratedSerialDescriptor.l("acceptLabelBorderColor", true);
        pluginGeneratedSerialDescriptor.l("acceptLabelColor", true);
        pluginGeneratedSerialDescriptor.l("acceptLabelText", true);
        pluginGeneratedSerialDescriptor.l("bodyText", true);
        pluginGeneratedSerialDescriptor.l("bodyTextColor", true);
        pluginGeneratedSerialDescriptor.l("canBeAccepted", true);
        pluginGeneratedSerialDescriptor.l("embedCanBeTapped", true);
        pluginGeneratedSerialDescriptor.l("resolvingGradientEnd", true);
        pluginGeneratedSerialDescriptor.l("resolvingGradientStart", true);
        pluginGeneratedSerialDescriptor.l("splashHasRadialGradient", true);
        pluginGeneratedSerialDescriptor.l("splashOpacity", true);
        pluginGeneratedSerialDescriptor.l("splashUrl", true);
        pluginGeneratedSerialDescriptor.l("inviteSplash", true);
        pluginGeneratedSerialDescriptor.l("subtitle", true);
        pluginGeneratedSerialDescriptor.l("subtitleColor", true);
        pluginGeneratedSerialDescriptor.l("thumbnailBackgroundColor", true);
        pluginGeneratedSerialDescriptor.l("thumbnailCornerRadius", true);
        pluginGeneratedSerialDescriptor.l("thumbnailText", true);
        pluginGeneratedSerialDescriptor.l("thumbnailUrl", true);
        pluginGeneratedSerialDescriptor.l("titleColor", true);
        pluginGeneratedSerialDescriptor.l("titleText", true);
        pluginGeneratedSerialDescriptor.l("participantAvatarUris", false);
        pluginGeneratedSerialDescriptor.l("extendedType", true);
        pluginGeneratedSerialDescriptor.l("structurableSubtitleText", true);
        pluginGeneratedSerialDescriptor.l("noParticipantsText", false);
        pluginGeneratedSerialDescriptor.l("ctaEnabled", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EmbeddedActivityInviteEmbedImpl$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        m0 m0Var = m0.f6313a;
        a2 a2Var = a2.f6238a;
        h hVar = h.f6280a;
        return new KSerializer[]{m0Var, m0Var, m0Var, a.u(a2Var), a.u(InviteType.Serializer.INSTANCE), a.u(m0Var), a.u(m0Var), a.u(m0Var), a.u(a2Var), a.u(a2Var), a.u(m0Var), a.u(hVar), a.u(hVar), a.u(m0Var), a.u(m0Var), a.u(hVar), a.u(m0Var), a.u(a2Var), a.u(a2Var), a.u(a2Var), a.u(m0Var), a.u(m0Var), a.u(m0Var), a.u(a2Var), a.u(a2Var), a.u(m0Var), a.u(a2Var), new f(a2Var), CodedLinkExtendedType.Serializer.INSTANCE, a.u(AnnotatedStructurableTextSerializer.INSTANCE), a2Var, hVar};
    }

    @Override 
    public EmbeddedActivityInviteEmbedImpl deserialize(Decoder decoder) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        String str;
        Object obj;
        int i13;
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
        Object obj27;
        int i14;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            i12 = b10.i(descriptor2, 0);
            i11 = b10.i(descriptor2, 1);
            i10 = b10.i(descriptor2, 2);
            a2 a2Var = a2.f6238a;
            obj22 = b10.n(descriptor2, 3, a2Var, null);
            obj21 = b10.n(descriptor2, 4, InviteType.Serializer.INSTANCE, null);
            m0 m0Var = m0.f6313a;
            obj10 = b10.n(descriptor2, 5, m0Var, null);
            obj20 = b10.n(descriptor2, 6, m0Var, null);
            obj19 = b10.n(descriptor2, 7, m0Var, null);
            obj4 = b10.n(descriptor2, 8, a2Var, null);
            obj18 = b10.n(descriptor2, 9, a2Var, null);
            obj17 = b10.n(descriptor2, 10, m0Var, null);
            h hVar = h.f6280a;
            obj12 = b10.n(descriptor2, 11, hVar, null);
            obj13 = b10.n(descriptor2, 12, hVar, null);
            obj14 = b10.n(descriptor2, 13, m0Var, null);
            obj16 = b10.n(descriptor2, 14, m0Var, null);
            obj15 = b10.n(descriptor2, 15, hVar, null);
            obj11 = b10.n(descriptor2, 16, m0Var, null);
            obj27 = b10.n(descriptor2, 17, a2Var, null);
            obj26 = b10.n(descriptor2, 18, a2Var, null);
            obj25 = b10.n(descriptor2, 19, a2Var, null);
            obj24 = b10.n(descriptor2, 20, m0Var, null);
            obj23 = b10.n(descriptor2, 21, m0Var, null);
            obj9 = b10.n(descriptor2, 22, m0Var, null);
            obj8 = b10.n(descriptor2, 23, a2Var, null);
            obj7 = b10.n(descriptor2, 24, a2Var, null);
            obj6 = b10.n(descriptor2, 25, m0Var, null);
            obj5 = b10.n(descriptor2, 26, a2Var, null);
            obj = b10.y(descriptor2, 27, new f(a2Var), null);
            obj3 = b10.y(descriptor2, 28, CodedLinkExtendedType.Serializer.INSTANCE, null);
            obj2 = b10.n(descriptor2, 29, AnnotatedStructurableTextSerializer.INSTANCE, null);
            str = b10.m(descriptor2, 30);
            z10 = b10.C(descriptor2, 31);
            i13 = -1;
        } else {
            Object obj28 = null;
            boolean z11 = true;
            Object obj29 = null;
            Object obj30 = null;
            Object obj31 = null;
            Object obj32 = null;
            Object obj33 = null;
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
            Object obj47 = null;
            Object obj48 = null;
            Object obj49 = null;
            Object obj50 = null;
            Object obj51 = null;
            Object obj52 = null;
            str = null;
            Object obj53 = null;
            int i15 = 0;
            i12 = 0;
            i11 = 0;
            i10 = 0;
            z10 = false;
            Object obj54 = null;
            while (z11) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        obj29 = obj29;
                        obj30 = obj30;
                        obj28 = obj28;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                        z11 = false;
                        Unit unit = Unit.f21600a;
                    case 0:
                        obj29 = obj29;
                        obj30 = obj30;
                        obj28 = obj28;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                        i12 = b10.i(descriptor2, 0);
                        i15 |= 1;
                        Unit unit2 = Unit.f21600a;
                    case 1:
                        obj29 = obj29;
                        obj30 = obj30;
                        obj28 = obj28;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                        i11 = b10.i(descriptor2, 1);
                        i15 |= 2;
                        Unit unit3 = Unit.f21600a;
                    case 2:
                        obj29 = obj29;
                        obj30 = obj30;
                        obj28 = obj28;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                        i10 = b10.i(descriptor2, 2);
                        i15 |= 4;
                        Unit unit4 = Unit.f21600a;
                    case 3:
                        obj29 = obj29;
                        obj30 = obj30;
                        obj28 = obj28;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                        obj41 = obj41;
                        obj40 = b10.n(descriptor2, 3, a2.f6238a, obj40);
                        i15 |= 8;
                        Unit unit5 = Unit.f21600a;
                    case 4:
                        obj30 = obj30;
                        obj28 = obj28;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                        obj42 = obj42;
                        obj41 = b10.n(descriptor2, 4, InviteType.Serializer.INSTANCE, obj41);
                        i15 |= 16;
                        Unit unit6 = Unit.f21600a;
                        obj29 = obj29;
                    case 5:
                        obj29 = obj29;
                        obj30 = obj30;
                        obj28 = obj28;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                        obj43 = obj43;
                        obj42 = b10.n(descriptor2, 5, m0.f6313a, obj42);
                        i15 |= 32;
                        Unit unit7 = Unit.f21600a;
                        obj41 = obj41;
                    case 6:
                        obj30 = obj30;
                        obj28 = obj28;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                        obj44 = obj44;
                        obj43 = b10.n(descriptor2, 6, m0.f6313a, obj43);
                        i15 |= 64;
                        Unit unit8 = Unit.f21600a;
                        obj29 = obj29;
                        obj41 = obj41;
                        obj42 = obj42;
                    case 7:
                        obj29 = obj29;
                        obj30 = obj30;
                        obj28 = obj28;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                        obj45 = obj45;
                        obj44 = b10.n(descriptor2, 7, m0.f6313a, obj44);
                        i15 |= 128;
                        Unit unit9 = Unit.f21600a;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                    case 8:
                        obj30 = obj30;
                        obj28 = obj28;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                        obj46 = obj46;
                        obj45 = b10.n(descriptor2, 8, a2.f6238a, obj45);
                        i15 |= 256;
                        Unit unit10 = Unit.f21600a;
                        obj29 = obj29;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                    case 9:
                        obj29 = obj29;
                        obj30 = obj30;
                        obj28 = obj28;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                        obj47 = obj47;
                        obj46 = b10.n(descriptor2, 9, a2.f6238a, obj46);
                        i15 |= 512;
                        Unit unit11 = Unit.f21600a;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                    case 10:
                        obj30 = obj30;
                        obj28 = obj28;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                        obj48 = obj48;
                        obj47 = b10.n(descriptor2, 10, m0.f6313a, obj47);
                        i15 |= 1024;
                        Unit unit12 = Unit.f21600a;
                        obj29 = obj29;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                    case 11:
                        obj29 = obj29;
                        obj30 = obj30;
                        obj28 = obj28;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                        obj49 = obj49;
                        obj48 = b10.n(descriptor2, 11, h.f6280a, obj48);
                        i15 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        Unit unit13 = Unit.f21600a;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                    case 12:
                        obj30 = obj30;
                        obj28 = obj28;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                        obj50 = obj50;
                        obj49 = b10.n(descriptor2, 12, h.f6280a, obj49);
                        i15 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        Unit unit14 = Unit.f21600a;
                        obj29 = obj29;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                    case 13:
                        obj29 = obj29;
                        obj30 = obj30;
                        obj28 = obj28;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                        obj51 = obj51;
                        obj50 = b10.n(descriptor2, 13, m0.f6313a, obj50);
                        i15 |= 8192;
                        Unit unit15 = Unit.f21600a;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                    case 14:
                        obj30 = obj30;
                        obj28 = obj28;
                        obj53 = obj53;
                        obj36 = obj36;
                        obj52 = obj52;
                        obj51 = b10.n(descriptor2, 14, m0.f6313a, obj51);
                        i15 |= 16384;
                        Unit unit16 = Unit.f21600a;
                        obj29 = obj29;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                    case 15:
                        obj29 = obj29;
                        obj30 = obj30;
                        obj28 = obj28;
                        obj36 = obj36;
                        obj53 = obj53;
                        obj52 = b10.n(descriptor2, 15, h.f6280a, obj52);
                        i15 |= 32768;
                        Unit unit17 = Unit.f21600a;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                    case 16:
                        obj30 = obj30;
                        obj28 = obj28;
                        obj36 = obj36;
                        obj53 = b10.n(descriptor2, 16, m0.f6313a, obj53);
                        i15 |= 65536;
                        Unit unit18 = Unit.f21600a;
                        obj29 = obj29;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                    case 17:
                        obj29 = obj29;
                        obj30 = obj30;
                        obj28 = obj28;
                        obj36 = b10.n(descriptor2, 17, a2.f6238a, obj36);
                        i15 |= 131072;
                        Unit unit19 = Unit.f21600a;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                    case 18:
                        obj30 = obj30;
                        obj28 = b10.n(descriptor2, 18, a2.f6238a, obj28);
                        i15 |= 262144;
                        Unit unit20 = Unit.f21600a;
                        obj29 = obj29;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                    case 19:
                        obj29 = obj29;
                        obj37 = b10.n(descriptor2, 19, a2.f6238a, obj37);
                        i15 |= 524288;
                        Unit unit21 = Unit.f21600a;
                        obj30 = obj30;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                        obj28 = obj28;
                    case 20:
                        obj54 = b10.n(descriptor2, 20, m0.f6313a, obj54);
                        i15 |= 1048576;
                        Unit unit22 = Unit.f21600a;
                        obj30 = obj30;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                        obj28 = obj28;
                    case 21:
                        obj28 = obj28;
                        obj29 = b10.n(descriptor2, 21, m0.f6313a, obj29);
                        i14 = 2097152;
                        i15 |= i14;
                        Unit unit23 = Unit.f21600a;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                    case 22:
                        obj28 = obj28;
                        obj35 = b10.n(descriptor2, 22, m0.f6313a, obj35);
                        i14 = 4194304;
                        i15 |= i14;
                        Unit unit232 = Unit.f21600a;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                    case 23:
                        obj28 = obj28;
                        obj32 = b10.n(descriptor2, 23, a2.f6238a, obj32);
                        i14 = 8388608;
                        i15 |= i14;
                        Unit unit2322 = Unit.f21600a;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                    case 24:
                        obj28 = obj28;
                        obj33 = b10.n(descriptor2, 24, a2.f6238a, obj33);
                        i14 = 16777216;
                        i15 |= i14;
                        Unit unit23222 = Unit.f21600a;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                    case 25:
                        obj28 = obj28;
                        obj30 = b10.n(descriptor2, 25, m0.f6313a, obj30);
                        i14 = 33554432;
                        i15 |= i14;
                        Unit unit232222 = Unit.f21600a;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                    case 26:
                        obj28 = obj28;
                        obj31 = b10.n(descriptor2, 26, a2.f6238a, obj31);
                        i14 = 67108864;
                        i15 |= i14;
                        Unit unit2322222 = Unit.f21600a;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                    case 27:
                        obj28 = obj28;
                        obj39 = b10.y(descriptor2, 27, new f(a2.f6238a), obj39);
                        i15 |= 134217728;
                        Unit unit24 = Unit.f21600a;
                        obj30 = obj30;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                    case 28:
                        obj28 = obj28;
                        obj34 = b10.y(descriptor2, 28, CodedLinkExtendedType.Serializer.INSTANCE, obj34);
                        i14 = 268435456;
                        i15 |= i14;
                        Unit unit23222222 = Unit.f21600a;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                    case 29:
                        obj28 = obj28;
                        obj38 = b10.n(descriptor2, 29, AnnotatedStructurableTextSerializer.INSTANCE, obj38);
                        i15 |= 536870912;
                        Unit unit25 = Unit.f21600a;
                        obj30 = obj30;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                    case 30:
                        str = b10.m(descriptor2, 30);
                        i15 |= 1073741824;
                        Unit unit26 = Unit.f21600a;
                        obj30 = obj30;
                        obj28 = obj28;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                    case 31:
                        z10 = b10.C(descriptor2, 31);
                        i15 |= Integer.MIN_VALUE;
                        Unit unit27 = Unit.f21600a;
                        obj30 = obj30;
                        obj28 = obj28;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj36 = obj36;
                    default:
                        throw new n(o10);
                }
            }
            obj4 = obj45;
            obj15 = obj52;
            obj9 = obj35;
            obj = obj39;
            obj11 = obj53;
            obj21 = obj41;
            obj10 = obj42;
            obj20 = obj43;
            obj17 = obj47;
            obj22 = obj40;
            obj8 = obj32;
            obj7 = obj33;
            obj24 = obj54;
            obj25 = obj37;
            obj2 = obj38;
            obj6 = obj30;
            obj27 = obj36;
            obj16 = obj51;
            obj14 = obj50;
            obj13 = obj49;
            obj19 = obj44;
            obj18 = obj46;
            obj12 = obj48;
            obj5 = obj31;
            obj3 = obj34;
            i13 = i15;
            obj26 = obj28;
            obj23 = obj29;
        }
        b10.c(descriptor2);
        return new EmbeddedActivityInviteEmbedImpl(i13, 0, i12, i11, i10, (String) obj22, (InviteType) obj21, (Integer) obj10, (Integer) obj20, (Integer) obj19, (String) obj4, (String) obj18, (Integer) obj17, (Boolean) obj12, (Boolean) obj13, (Integer) obj14, (Integer) obj16, (Boolean) obj15, (Integer) obj11, (String) obj27, (String) obj26, (String) obj25, (Integer) obj24, (Integer) obj23, (Integer) obj9, (String) obj8, (String) obj7, (Integer) obj6, (String) obj5, (List) obj, (CodedLinkExtendedType) obj3, (AnnotatedStructurableText) obj2, str, z10, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, EmbeddedActivityInviteEmbedImpl value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        EmbeddedActivityInviteEmbedImpl.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
