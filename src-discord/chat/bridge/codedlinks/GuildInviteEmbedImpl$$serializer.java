package com.discord.chat.bridge.codedlinks;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.codedlinks.InviteType;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.ViewProps;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ti.n;
import ui.a;
import wi.a2;
import wi.f0;
import wi.h;
import wi.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl.$serializer", "Lwi/f0;", "Lcom/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class GuildInviteEmbedImpl$$serializer implements f0<GuildInviteEmbedImpl> {
    public static final GuildInviteEmbedImpl$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        GuildInviteEmbedImpl$$serializer guildInviteEmbedImpl$$serializer = new GuildInviteEmbedImpl$$serializer();
        INSTANCE = guildInviteEmbedImpl$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.codedlinks.GuildInviteEmbedImpl", guildInviteEmbedImpl$$serializer, 31);
        pluginGeneratedSerialDescriptor.l(ViewProps.BACKGROUND_COLOR, false);
        pluginGeneratedSerialDescriptor.l(ViewProps.BORDER_COLOR, false);
        pluginGeneratedSerialDescriptor.l("headerColor", false);
        pluginGeneratedSerialDescriptor.l("headerText", false);
        pluginGeneratedSerialDescriptor.l("type", false);
        pluginGeneratedSerialDescriptor.l("acceptLabelBackgroundColor", true);
        pluginGeneratedSerialDescriptor.l("acceptLabelBorderColor", true);
        pluginGeneratedSerialDescriptor.l("acceptLabelColor", true);
        pluginGeneratedSerialDescriptor.l("acceptLabelText", true);
        pluginGeneratedSerialDescriptor.l("bodyText", true);
        pluginGeneratedSerialDescriptor.l("bodyTextColor", true);
        pluginGeneratedSerialDescriptor.l("canBeAccepted", true);
        pluginGeneratedSerialDescriptor.l("channelIcon", true);
        pluginGeneratedSerialDescriptor.l("channelName", true);
        pluginGeneratedSerialDescriptor.l("embedCanBeTapped", true);
        pluginGeneratedSerialDescriptor.l("memberText", true);
        pluginGeneratedSerialDescriptor.l("onlineText", true);
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
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GuildInviteEmbedImpl$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        m0 m0Var = m0.f29615a;
        a2 a2Var = a2.f29540a;
        h hVar = h.f29582a;
        return new KSerializer[]{m0Var, m0Var, m0Var, a.u(a2Var), InviteType.Serializer.INSTANCE, a.u(m0Var), a.u(m0Var), a.u(m0Var), a.u(a2Var), a.u(a2Var), a.u(m0Var), a.u(hVar), a.u(a2Var), a.u(a2Var), a.u(hVar), a.u(a2Var), a.u(a2Var), a.u(m0Var), a.u(m0Var), a.u(hVar), a.u(m0Var), a.u(a2Var), a.u(a2Var), a.u(a2Var), a.u(m0Var), a.u(m0Var), a.u(m0Var), a.u(a2Var), a.u(a2Var), a.u(m0Var), a.u(a2Var)};
    }

    @Override 
    public GuildInviteEmbedImpl deserialize(Decoder decoder) {
        int i10;
        int i11;
        int i12;
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
        int i13;
        Object obj25;
        Object obj26;
        Object obj27;
        Object obj28;
        int i14;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        int i15 = 0;
        Object obj29 = null;
        if (c10.y()) {
            i13 = c10.k(descriptor2, 0);
            i11 = c10.k(descriptor2, 1);
            i10 = c10.k(descriptor2, 2);
            a2 a2Var = a2.f29540a;
            obj22 = c10.v(descriptor2, 3, a2Var, null);
            obj21 = c10.m(descriptor2, 4, InviteType.Serializer.INSTANCE, null);
            m0 m0Var = m0.f29615a;
            obj11 = c10.v(descriptor2, 5, m0Var, null);
            obj19 = c10.v(descriptor2, 6, m0Var, null);
            obj20 = c10.v(descriptor2, 7, m0Var, null);
            obj6 = c10.v(descriptor2, 8, a2Var, null);
            obj18 = c10.v(descriptor2, 9, a2Var, null);
            obj17 = c10.v(descriptor2, 10, m0Var, null);
            h hVar = h.f29582a;
            obj13 = c10.v(descriptor2, 11, hVar, null);
            obj14 = c10.v(descriptor2, 12, a2Var, null);
            obj15 = c10.v(descriptor2, 13, a2Var, null);
            obj16 = c10.v(descriptor2, 14, hVar, null);
            obj12 = c10.v(descriptor2, 15, a2Var, null);
            obj10 = c10.v(descriptor2, 16, a2Var, null);
            obj9 = c10.v(descriptor2, 17, m0Var, null);
            obj8 = c10.v(descriptor2, 18, m0Var, null);
            obj28 = c10.v(descriptor2, 19, hVar, null);
            obj7 = c10.v(descriptor2, 20, m0Var, null);
            obj27 = c10.v(descriptor2, 21, a2Var, null);
            obj26 = c10.v(descriptor2, 22, a2Var, null);
            obj25 = c10.v(descriptor2, 23, a2Var, null);
            obj24 = c10.v(descriptor2, 24, m0Var, null);
            obj23 = c10.v(descriptor2, 25, m0Var, null);
            obj5 = c10.v(descriptor2, 26, m0Var, null);
            obj4 = c10.v(descriptor2, 27, a2Var, null);
            obj3 = c10.v(descriptor2, 28, a2Var, null);
            obj2 = c10.v(descriptor2, 29, m0Var, null);
            obj = c10.v(descriptor2, 30, a2Var, null);
            i12 = ViewDefaults.NUMBER_OF_LINES;
        } else {
            boolean z10 = true;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            Object obj30 = null;
            Object obj31 = null;
            Object obj32 = null;
            Object obj33 = null;
            obj25 = null;
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
            Object obj53 = null;
            Object obj54 = null;
            Object obj55 = null;
            while (z10) {
                int x10 = c10.x(descriptor2);
                switch (x10) {
                    case -1:
                        obj30 = obj30;
                        obj31 = obj31;
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
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                        z10 = false;
                        Unit unit = Unit.f21025a;
                    case 0:
                        obj30 = obj30;
                        obj31 = obj31;
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
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                        i16 = c10.k(descriptor2, 0);
                        i15 |= 1;
                        Unit unit2 = Unit.f21025a;
                    case 1:
                        obj30 = obj30;
                        obj31 = obj31;
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
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                        i18 = c10.k(descriptor2, 1);
                        i15 |= 2;
                        Unit unit3 = Unit.f21025a;
                    case 2:
                        obj30 = obj30;
                        obj31 = obj31;
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
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                        i17 = c10.k(descriptor2, 2);
                        i15 |= 4;
                        Unit unit4 = Unit.f21025a;
                    case 3:
                        obj30 = obj30;
                        obj31 = obj31;
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
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                        obj42 = obj42;
                        obj41 = c10.v(descriptor2, 3, a2.f29540a, obj41);
                        i15 |= 8;
                        Unit unit5 = Unit.f21025a;
                    case 4:
                        obj30 = obj30;
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
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                        obj43 = obj43;
                        obj42 = c10.m(descriptor2, 4, InviteType.Serializer.INSTANCE, obj42);
                        i15 |= 16;
                        Unit unit6 = Unit.f21025a;
                        obj31 = obj31;
                        obj41 = obj41;
                    case 5:
                        obj30 = obj30;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                        obj44 = obj44;
                        obj43 = c10.v(descriptor2, 5, m0.f29615a, obj43);
                        i15 |= 32;
                        Unit unit7 = Unit.f21025a;
                        obj31 = obj31;
                        obj41 = obj41;
                        obj42 = obj42;
                    case 6:
                        obj30 = obj30;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                        obj45 = obj45;
                        obj44 = c10.v(descriptor2, 6, m0.f29615a, obj44);
                        i15 |= 64;
                        Unit unit8 = Unit.f21025a;
                        obj31 = obj31;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                    case 7:
                        obj30 = obj30;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                        obj46 = obj46;
                        obj45 = c10.v(descriptor2, 7, m0.f29615a, obj45);
                        i15 |= 128;
                        Unit unit9 = Unit.f21025a;
                        obj31 = obj31;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                    case 8:
                        obj30 = obj30;
                        obj48 = obj48;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                        obj47 = obj47;
                        obj46 = c10.v(descriptor2, 8, a2.f29540a, obj46);
                        i15 |= 256;
                        Unit unit10 = Unit.f21025a;
                        obj31 = obj31;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                    case 9:
                        obj30 = obj30;
                        obj49 = obj49;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                        obj48 = obj48;
                        obj47 = c10.v(descriptor2, 9, a2.f29540a, obj47);
                        i15 |= 512;
                        Unit unit11 = Unit.f21025a;
                        obj31 = obj31;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                    case 10:
                        obj30 = obj30;
                        obj50 = obj50;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                        obj49 = obj49;
                        obj48 = c10.v(descriptor2, 10, m0.f29615a, obj48);
                        i15 |= 1024;
                        Unit unit12 = Unit.f21025a;
                        obj31 = obj31;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                    case 11:
                        obj30 = obj30;
                        obj51 = obj51;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                        obj50 = obj50;
                        obj49 = c10.v(descriptor2, 11, h.f29582a, obj49);
                        i15 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        Unit unit13 = Unit.f21025a;
                        obj31 = obj31;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                    case 12:
                        obj30 = obj30;
                        obj52 = obj52;
                        obj53 = obj53;
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                        obj51 = obj51;
                        obj50 = c10.v(descriptor2, 12, a2.f29540a, obj50);
                        i15 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        Unit unit14 = Unit.f21025a;
                        obj31 = obj31;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj47 = obj47;
                        obj48 = obj48;
                        obj49 = obj49;
                    case 13:
                        obj30 = obj30;
                        obj53 = obj53;
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                        obj52 = obj52;
                        obj51 = c10.v(descriptor2, 13, a2.f29540a, obj51);
                        i15 |= 8192;
                        Unit unit15 = Unit.f21025a;
                        obj31 = obj31;
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
                    case 14:
                        obj30 = obj30;
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                        obj53 = obj53;
                        obj52 = c10.v(descriptor2, 14, h.f29582a, obj52);
                        i15 |= 16384;
                        Unit unit16 = Unit.f21025a;
                        obj31 = obj31;
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
                    case 15:
                        obj30 = obj30;
                        obj55 = obj55;
                        obj32 = obj32;
                        obj54 = obj54;
                        obj53 = c10.v(descriptor2, 15, a2.f29540a, obj53);
                        i15 |= 32768;
                        Unit unit17 = Unit.f21025a;
                        obj31 = obj31;
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
                    case 16:
                        obj30 = obj30;
                        obj32 = obj32;
                        obj55 = obj55;
                        obj54 = c10.v(descriptor2, 16, a2.f29540a, obj54);
                        i15 |= 65536;
                        Unit unit18 = Unit.f21025a;
                        obj31 = obj31;
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
                    case 17:
                        obj30 = obj30;
                        obj32 = obj32;
                        obj55 = c10.v(descriptor2, 17, m0.f29615a, obj55);
                        i15 |= 131072;
                        Unit unit19 = Unit.f21025a;
                        obj31 = obj31;
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
                        obj54 = obj54;
                    case 18:
                        obj30 = obj30;
                        obj32 = c10.v(descriptor2, 18, m0.f29615a, obj32);
                        i15 |= 262144;
                        Unit unit20 = Unit.f21025a;
                        obj31 = obj31;
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
                        obj54 = obj54;
                        obj55 = obj55;
                    case 19:
                        obj30 = obj30;
                        obj33 = c10.v(descriptor2, 19, h.f29582a, obj33);
                        i15 |= 524288;
                        Unit unit21 = Unit.f21025a;
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
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                    case 20:
                        obj33 = obj33;
                        obj31 = c10.v(descriptor2, 20, m0.f29615a, obj31);
                        i14 = 1048576;
                        i15 |= i14;
                        Unit unit22 = Unit.f21025a;
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
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                    case 21:
                        obj33 = obj33;
                        obj40 = c10.v(descriptor2, 21, a2.f29540a, obj40);
                        i15 |= 2097152;
                        Unit unit23 = Unit.f21025a;
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
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                    case 22:
                        obj33 = obj33;
                        obj39 = c10.v(descriptor2, 22, a2.f29540a, obj39);
                        i15 |= 4194304;
                        Unit unit24 = Unit.f21025a;
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
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                    case 23:
                        obj33 = obj33;
                        obj25 = c10.v(descriptor2, 23, a2.f29540a, obj25);
                        i15 |= 8388608;
                        Unit unit25 = Unit.f21025a;
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
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                    case 24:
                        obj33 = obj33;
                        obj38 = c10.v(descriptor2, 24, m0.f29615a, obj38);
                        i15 |= 16777216;
                        Unit unit26 = Unit.f21025a;
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
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                    case 25:
                        obj33 = obj33;
                        obj37 = c10.v(descriptor2, 25, m0.f29615a, obj37);
                        i15 |= 33554432;
                        Unit unit27 = Unit.f21025a;
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
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                    case 26:
                        obj33 = obj33;
                        obj30 = c10.v(descriptor2, 26, m0.f29615a, obj30);
                        i14 = 67108864;
                        i15 |= i14;
                        Unit unit222 = Unit.f21025a;
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
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                    case 27:
                        obj33 = obj33;
                        obj29 = c10.v(descriptor2, 27, a2.f29540a, obj29);
                        i15 |= 134217728;
                        Unit unit28 = Unit.f21025a;
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
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                    case 28:
                        obj33 = obj33;
                        obj36 = c10.v(descriptor2, 28, a2.f29540a, obj36);
                        i15 |= 268435456;
                        Unit unit29 = Unit.f21025a;
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
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                    case 29:
                        obj33 = obj33;
                        obj35 = c10.v(descriptor2, 29, m0.f29615a, obj35);
                        i15 |= 536870912;
                        Unit unit30 = Unit.f21025a;
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
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                    case 30:
                        obj33 = obj33;
                        obj34 = c10.v(descriptor2, 30, a2.f29540a, obj34);
                        i15 |= 1073741824;
                        Unit unit31 = Unit.f21025a;
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
                        obj54 = obj54;
                        obj55 = obj55;
                        obj32 = obj32;
                    default:
                        throw new n(x10);
                }
            }
            obj6 = obj46;
            obj28 = obj33;
            i12 = i15;
            obj23 = obj37;
            obj26 = obj39;
            obj10 = obj54;
            obj12 = obj53;
            obj16 = obj52;
            obj15 = obj51;
            obj14 = obj50;
            obj11 = obj43;
            obj20 = obj45;
            obj13 = obj49;
            i10 = i17;
            i11 = i18;
            obj = obj34;
            obj3 = obj36;
            obj8 = obj32;
            obj21 = obj42;
            i13 = i16;
            obj2 = obj35;
            obj24 = obj38;
            obj9 = obj55;
            obj22 = obj41;
            obj27 = obj40;
            obj19 = obj44;
            obj7 = obj31;
            obj17 = obj48;
            obj4 = obj29;
            obj5 = obj30;
            obj18 = obj47;
        }
        c10.b(descriptor2);
        return new GuildInviteEmbedImpl(i12, i13, i11, i10, (String) obj22, (InviteType) obj21, (Integer) obj11, (Integer) obj19, (Integer) obj20, (String) obj6, (String) obj18, (Integer) obj17, (Boolean) obj13, (String) obj14, (String) obj15, (Boolean) obj16, (String) obj12, (String) obj10, (Integer) obj9, (Integer) obj8, (Boolean) obj28, (Integer) obj7, (String) obj27, (String) obj26, (String) obj25, (Integer) obj24, (Integer) obj23, (Integer) obj5, (String) obj4, (String) obj3, (Integer) obj2, (String) obj, (SerializationConstructorMarker) null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, GuildInviteEmbedImpl value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        GuildInviteEmbedImpl.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
