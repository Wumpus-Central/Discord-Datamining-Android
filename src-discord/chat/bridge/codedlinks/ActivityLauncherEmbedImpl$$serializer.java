package com.discord.chat.bridge.codedlinks;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.codedlinks.CodedLinkExtendedType;
import com.discord.chat.bridge.codedlinks.InviteType;
import com.discord.primitives.ApplicationId;
import com.discord.primitives.ApplicationId$$serializer;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.facebook.react.uimanager.ViewProps;
import j$.util.Spliterator;
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
import vj.n;
import wj.a;
import yj.a2;
import yj.f;
import yj.f0;
import yj.h;
import yj.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl.$serializer", "Lyj/f0;", "Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class ActivityLauncherEmbedImpl$$serializer implements f0<ActivityLauncherEmbedImpl> {
    public static final ActivityLauncherEmbedImpl$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ActivityLauncherEmbedImpl$$serializer activityLauncherEmbedImpl$$serializer = new ActivityLauncherEmbedImpl$$serializer();
        INSTANCE = activityLauncherEmbedImpl$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.codedlinks.ActivityLauncherEmbedImpl", activityLauncherEmbedImpl$$serializer, 33);
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
        pluginGeneratedSerialDescriptor.l("applicationId", false);
        pluginGeneratedSerialDescriptor.l("channelId", false);
        pluginGeneratedSerialDescriptor.l("extendedType", true);
        pluginGeneratedSerialDescriptor.l("participantAvatarUris", false);
        pluginGeneratedSerialDescriptor.l("description", true);
        pluginGeneratedSerialDescriptor.l("participantsText", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ActivityLauncherEmbedImpl$$serializer() {
    }

    @Override // yj.f0
    public KSerializer<?>[] childSerializers() {
        m0 m0Var = m0.f32999a;
        a2 a2Var = a2.f32924a;
        h hVar = h.f32966a;
        return new KSerializer[]{m0Var, m0Var, m0Var, a.u(a2Var), a.u(InviteType.Serializer.INSTANCE), a.u(m0Var), a.u(m0Var), a.u(m0Var), a.u(a2Var), a.u(a2Var), a.u(m0Var), a.u(hVar), a.u(hVar), a.u(m0Var), a.u(m0Var), a.u(hVar), a.u(m0Var), a.u(a2Var), a.u(a2Var), a.u(a2Var), a.u(m0Var), a.u(m0Var), a.u(m0Var), a.u(a2Var), a.u(a2Var), a.u(m0Var), a.u(a2Var), ApplicationId$$serializer.INSTANCE, ChannelId$$serializer.INSTANCE, CodedLinkExtendedType.Serializer.INSTANCE, new f(a2Var), a.u(a2Var), a2Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ActivityLauncherEmbedImpl deserialize(Decoder decoder) {
        int i10;
        int i11;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        String str;
        int i12;
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
        int i13;
        Object obj27;
        Object obj28;
        Object obj29;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        int i14 = 0;
        if (b10.p()) {
            i13 = b10.i(descriptor2, 0);
            i12 = b10.i(descriptor2, 1);
            i10 = b10.i(descriptor2, 2);
            a2 a2Var = a2.f32924a;
            obj14 = b10.n(descriptor2, 3, a2Var, null);
            obj25 = b10.n(descriptor2, 4, InviteType.Serializer.INSTANCE, null);
            m0 m0Var = m0.f32999a;
            obj24 = b10.n(descriptor2, 5, m0Var, null);
            obj23 = b10.n(descriptor2, 6, m0Var, null);
            obj22 = b10.n(descriptor2, 7, m0Var, null);
            obj21 = b10.n(descriptor2, 8, a2Var, null);
            obj20 = b10.n(descriptor2, 9, a2Var, null);
            obj19 = b10.n(descriptor2, 10, m0Var, null);
            h hVar = h.f32966a;
            obj15 = b10.n(descriptor2, 11, hVar, null);
            obj16 = b10.n(descriptor2, 12, hVar, null);
            obj17 = b10.n(descriptor2, 13, m0Var, null);
            obj18 = b10.n(descriptor2, 14, m0Var, null);
            obj29 = b10.n(descriptor2, 15, hVar, null);
            obj10 = b10.n(descriptor2, 16, m0Var, null);
            obj28 = b10.n(descriptor2, 17, a2Var, null);
            obj27 = b10.n(descriptor2, 18, a2Var, null);
            obj26 = b10.n(descriptor2, 19, a2Var, null);
            obj6 = b10.n(descriptor2, 20, m0Var, null);
            obj5 = b10.n(descriptor2, 21, m0Var, null);
            obj4 = b10.n(descriptor2, 22, m0Var, null);
            obj13 = b10.n(descriptor2, 23, a2Var, null);
            obj12 = b10.n(descriptor2, 24, a2Var, null);
            obj11 = b10.n(descriptor2, 25, m0Var, null);
            obj3 = b10.n(descriptor2, 26, a2Var, null);
            obj9 = b10.y(descriptor2, 27, ApplicationId$$serializer.INSTANCE, null);
            obj8 = b10.y(descriptor2, 28, ChannelId$$serializer.INSTANCE, null);
            obj7 = b10.y(descriptor2, 29, CodedLinkExtendedType.Serializer.INSTANCE, null);
            obj2 = b10.y(descriptor2, 30, new f(a2Var), null);
            obj = b10.n(descriptor2, 31, a2Var, null);
            str = b10.m(descriptor2, 32);
            i14 = -1;
            i11 = 1;
        } else {
            int i15 = 32;
            int i16 = 0;
            int i17 = 0;
            i11 = 0;
            Object obj30 = null;
            Object obj31 = null;
            Object obj32 = null;
            Object obj33 = null;
            Object obj34 = null;
            Object obj35 = null;
            Object obj36 = null;
            Object obj37 = null;
            Object obj38 = null;
            String str2 = null;
            Object obj39 = null;
            Object obj40 = null;
            Object obj41 = null;
            Object obj42 = null;
            Object obj43 = null;
            Object obj44 = null;
            Object obj45 = null;
            Object obj46 = null;
            Object obj47 = null;
            obj5 = null;
            obj4 = null;
            Object obj48 = null;
            Object obj49 = null;
            Object obj50 = null;
            obj3 = null;
            Object obj51 = null;
            Object obj52 = null;
            Object obj53 = null;
            obj2 = null;
            obj = null;
            boolean z10 = true;
            int i18 = 0;
            while (z10) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        i18 = i18;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        z10 = false;
                        Unit unit = Unit.f22063a;
                        break;
                    case 0:
                        i18 = i18;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        i16 = b10.i(descriptor2, 0);
                        i14 |= 1;
                        Unit unit2 = Unit.f22063a;
                        break;
                    case 1:
                        i18 = i18;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        i17 = b10.i(descriptor2, 1);
                        i14 |= 2;
                        Unit unit3 = Unit.f22063a;
                        break;
                    case 2:
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        i18 = b10.i(descriptor2, 2);
                        i14 |= 4;
                        Unit unit4 = Unit.f22063a;
                        obj46 = obj46;
                        obj39 = obj39;
                        break;
                    case 3:
                        i18 = i18;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj33 = b10.n(descriptor2, 3, a2.f32924a, obj33);
                        i14 |= 8;
                        Unit unit5 = Unit.f22063a;
                        break;
                    case 4:
                        i18 = i18;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj30 = b10.n(descriptor2, 4, InviteType.Serializer.INSTANCE, obj30);
                        i14 |= 16;
                        Unit unit6 = Unit.f22063a;
                        break;
                    case 5:
                        i18 = i18;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj31 = b10.n(descriptor2, 5, m0.f32999a, obj31);
                        i14 |= 32;
                        Unit unit7 = Unit.f22063a;
                        break;
                    case 6:
                        i18 = i18;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj38 = b10.n(descriptor2, 6, m0.f32999a, obj38);
                        i14 |= 64;
                        Unit unit8 = Unit.f22063a;
                        break;
                    case 7:
                        i18 = i18;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj37 = b10.n(descriptor2, 7, m0.f32999a, obj37);
                        i14 |= 128;
                        Unit unit9 = Unit.f22063a;
                        break;
                    case 8:
                        i18 = i18;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj36 = b10.n(descriptor2, 8, a2.f32924a, obj36);
                        i14 |= Spliterator.NONNULL;
                        Unit unit10 = Unit.f22063a;
                        break;
                    case 9:
                        i18 = i18;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj32 = b10.n(descriptor2, 9, a2.f32924a, obj32);
                        i14 |= 512;
                        Unit unit11 = Unit.f22063a;
                        break;
                    case 10:
                        i18 = i18;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj35 = b10.n(descriptor2, 10, m0.f32999a, obj35);
                        i14 |= Spliterator.IMMUTABLE;
                        Unit unit12 = Unit.f22063a;
                        break;
                    case 11:
                        i18 = i18;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj34 = b10.n(descriptor2, 11, h.f32966a, obj34);
                        i14 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        Unit unit13 = Unit.f22063a;
                        break;
                    case 12:
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj40 = obj40;
                        obj39 = b10.n(descriptor2, 12, h.f32966a, obj39);
                        i14 |= 4096;
                        Unit unit14 = Unit.f22063a;
                        i18 = i18;
                        obj46 = obj46;
                        break;
                    case 13:
                        i18 = i18;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj41 = obj41;
                        obj40 = b10.n(descriptor2, 13, m0.f32999a, obj40);
                        i14 |= 8192;
                        Unit unit15 = Unit.f22063a;
                        obj39 = obj39;
                        break;
                    case 14:
                        i18 = i18;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj42 = obj42;
                        obj41 = b10.n(descriptor2, 14, m0.f32999a, obj41);
                        i14 |= Spliterator.SUBSIZED;
                        Unit unit16 = Unit.f22063a;
                        obj40 = obj40;
                        obj39 = obj39;
                        break;
                    case 15:
                        i18 = i18;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj43 = obj43;
                        obj42 = b10.n(descriptor2, 15, h.f32966a, obj42);
                        i14 |= 32768;
                        Unit unit17 = Unit.f22063a;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj39 = obj39;
                        break;
                    case 16:
                        i18 = i18;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj44 = obj44;
                        obj43 = b10.n(descriptor2, 16, m0.f32999a, obj43);
                        i14 |= 65536;
                        Unit unit18 = Unit.f22063a;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj39 = obj39;
                        break;
                    case 17:
                        i18 = i18;
                        obj46 = obj46;
                        obj45 = obj45;
                        obj44 = b10.n(descriptor2, 17, a2.f32924a, obj44);
                        i14 |= 131072;
                        Unit unit19 = Unit.f22063a;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj39 = obj39;
                        break;
                    case 18:
                        i18 = i18;
                        obj46 = obj46;
                        obj45 = b10.n(descriptor2, 18, a2.f32924a, obj45);
                        i14 |= 262144;
                        Unit unit20 = Unit.f22063a;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj39 = obj39;
                        break;
                    case 19:
                        obj46 = b10.n(descriptor2, 19, a2.f32924a, obj46);
                        i14 |= 524288;
                        Unit unit21 = Unit.f22063a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj47 = obj47;
                        i18 = i18;
                        break;
                    case 20:
                        i18 = i18;
                        obj47 = b10.n(descriptor2, 20, m0.f32999a, obj47);
                        i14 |= 1048576;
                        Unit unit22 = Unit.f22063a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        break;
                    case 21:
                        i18 = i18;
                        obj5 = b10.n(descriptor2, 21, m0.f32999a, obj5);
                        i14 |= 2097152;
                        Unit unit23 = Unit.f22063a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        break;
                    case 22:
                        i18 = i18;
                        obj4 = b10.n(descriptor2, 22, m0.f32999a, obj4);
                        i14 |= 4194304;
                        Unit unit24 = Unit.f22063a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        break;
                    case 23:
                        i18 = i18;
                        obj48 = b10.n(descriptor2, 23, a2.f32924a, obj48);
                        i14 |= 8388608;
                        Unit unit25 = Unit.f22063a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        break;
                    case 24:
                        i18 = i18;
                        obj49 = b10.n(descriptor2, 24, a2.f32924a, obj49);
                        i14 |= 16777216;
                        Unit unit26 = Unit.f22063a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        break;
                    case 25:
                        i18 = i18;
                        obj50 = b10.n(descriptor2, 25, m0.f32999a, obj50);
                        i14 |= 33554432;
                        Unit unit27 = Unit.f22063a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        break;
                    case 26:
                        i18 = i18;
                        obj3 = b10.n(descriptor2, 26, a2.f32924a, obj3);
                        i14 |= 67108864;
                        Unit unit28 = Unit.f22063a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        break;
                    case 27:
                        i18 = i18;
                        obj51 = b10.y(descriptor2, 27, ApplicationId$$serializer.INSTANCE, obj51);
                        i14 |= 134217728;
                        Unit unit29 = Unit.f22063a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        break;
                    case 28:
                        i18 = i18;
                        obj52 = b10.y(descriptor2, 28, ChannelId$$serializer.INSTANCE, obj52);
                        i14 |= 268435456;
                        Unit unit30 = Unit.f22063a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        break;
                    case 29:
                        i18 = i18;
                        obj53 = b10.y(descriptor2, 29, CodedLinkExtendedType.Serializer.INSTANCE, obj53);
                        i14 |= 536870912;
                        Unit unit31 = Unit.f22063a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        break;
                    case 30:
                        i18 = i18;
                        obj2 = b10.y(descriptor2, 30, new f(a2.f32924a), obj2);
                        i14 |= 1073741824;
                        Unit unit32 = Unit.f22063a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        break;
                    case 31:
                        i18 = i18;
                        obj = b10.n(descriptor2, 31, a2.f32924a, obj);
                        i14 |= Integer.MIN_VALUE;
                        Unit unit33 = Unit.f22063a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        break;
                    case 32:
                        str2 = b10.m(descriptor2, i15);
                        i11 |= 1;
                        Unit unit34 = Unit.f22063a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        break;
                    default:
                        throw new n(o10);
                }
                i15 = 32;
            }
            i10 = i18;
            obj6 = obj47;
            obj14 = obj33;
            i12 = i17;
            obj15 = obj34;
            obj26 = obj46;
            obj10 = obj43;
            obj29 = obj42;
            obj18 = obj41;
            obj17 = obj40;
            str = str2;
            obj13 = obj48;
            obj12 = obj49;
            obj11 = obj50;
            obj9 = obj51;
            obj8 = obj52;
            obj7 = obj53;
            i13 = i16;
            obj25 = obj30;
            obj24 = obj31;
            obj16 = obj39;
            obj19 = obj35;
            obj23 = obj38;
            obj28 = obj44;
            obj20 = obj32;
            obj27 = obj45;
            obj21 = obj36;
            obj22 = obj37;
        }
        b10.c(descriptor2);
        return new ActivityLauncherEmbedImpl(i14, i11, i13, i12, i10, (String) obj14, (InviteType) obj25, (Integer) obj24, (Integer) obj23, (Integer) obj22, (String) obj21, (String) obj20, (Integer) obj19, (Boolean) obj15, (Boolean) obj16, (Integer) obj17, (Integer) obj18, (Boolean) obj29, (Integer) obj10, (String) obj28, (String) obj27, (String) obj26, (Integer) obj6, (Integer) obj5, (Integer) obj4, (String) obj13, (String) obj12, (Integer) obj11, (String) obj3, (ApplicationId) obj9, (ChannelId) obj8, (CodedLinkExtendedType) obj7, (List) obj2, (String) obj, str, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, vj.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ActivityLauncherEmbedImpl value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        ActivityLauncherEmbedImpl.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // yj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
