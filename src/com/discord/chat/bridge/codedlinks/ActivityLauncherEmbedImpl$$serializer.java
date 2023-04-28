package com.discord.chat.bridge.codedlinks;

import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC3644f0;
import bj.C3622a2;
import bj.C3643f;
import bj.C3652h;
import bj.C3676m0;
import com.discord.chat.bridge.codedlinks.CodedLinkExtendedType;
import com.discord.chat.bridge.codedlinks.InviteType;
import com.discord.primitives.ApplicationId;
import com.discord.primitives.ApplicationId$$serializer;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p163j$.util.Spliterator;
import p449yi.C14447n;
import p469zi.C14667a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ActivityLauncherEmbedImpl$$serializer implements AbstractC3644f0<ActivityLauncherEmbedImpl> {
    public static final ActivityLauncherEmbedImpl$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ActivityLauncherEmbedImpl$$serializer activityLauncherEmbedImpl$$serializer = new ActivityLauncherEmbedImpl$$serializer();
        INSTANCE = activityLauncherEmbedImpl$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.codedlinks.ActivityLauncherEmbedImpl", activityLauncherEmbedImpl$$serializer, 33);
        pluginGeneratedSerialDescriptor.m13841l(ViewProps.BACKGROUND_COLOR, false);
        pluginGeneratedSerialDescriptor.m13841l(ViewProps.BORDER_COLOR, false);
        pluginGeneratedSerialDescriptor.m13841l("headerColor", false);
        pluginGeneratedSerialDescriptor.m13841l("headerText", false);
        pluginGeneratedSerialDescriptor.m13841l("type", true);
        pluginGeneratedSerialDescriptor.m13841l("acceptLabelBackgroundColor", true);
        pluginGeneratedSerialDescriptor.m13841l("acceptLabelBorderColor", true);
        pluginGeneratedSerialDescriptor.m13841l("acceptLabelColor", true);
        pluginGeneratedSerialDescriptor.m13841l("acceptLabelText", true);
        pluginGeneratedSerialDescriptor.m13841l("bodyText", true);
        pluginGeneratedSerialDescriptor.m13841l("bodyTextColor", true);
        pluginGeneratedSerialDescriptor.m13841l("canBeAccepted", true);
        pluginGeneratedSerialDescriptor.m13841l("embedCanBeTapped", true);
        pluginGeneratedSerialDescriptor.m13841l("resolvingGradientEnd", true);
        pluginGeneratedSerialDescriptor.m13841l("resolvingGradientStart", true);
        pluginGeneratedSerialDescriptor.m13841l("splashHasRadialGradient", true);
        pluginGeneratedSerialDescriptor.m13841l("splashOpacity", true);
        pluginGeneratedSerialDescriptor.m13841l("splashUrl", true);
        pluginGeneratedSerialDescriptor.m13841l("inviteSplash", true);
        pluginGeneratedSerialDescriptor.m13841l("subtitle", true);
        pluginGeneratedSerialDescriptor.m13841l("subtitleColor", true);
        pluginGeneratedSerialDescriptor.m13841l("thumbnailBackgroundColor", true);
        pluginGeneratedSerialDescriptor.m13841l("thumbnailCornerRadius", true);
        pluginGeneratedSerialDescriptor.m13841l("thumbnailText", true);
        pluginGeneratedSerialDescriptor.m13841l("thumbnailUrl", true);
        pluginGeneratedSerialDescriptor.m13841l("titleColor", true);
        pluginGeneratedSerialDescriptor.m13841l("titleText", true);
        pluginGeneratedSerialDescriptor.m13841l("applicationId", false);
        pluginGeneratedSerialDescriptor.m13841l("channelId", false);
        pluginGeneratedSerialDescriptor.m13841l("extendedType", true);
        pluginGeneratedSerialDescriptor.m13841l("participantAvatarUris", false);
        pluginGeneratedSerialDescriptor.m13841l("description", true);
        pluginGeneratedSerialDescriptor.m13841l("participantsText", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ActivityLauncherEmbedImpl$$serializer() {
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] childSerializers() {
        C3676m0 m0Var = C3676m0.f5992a;
        C3622a2 a2Var = C3622a2.f5917a;
        C3652h hVar = C3652h.f5959a;
        return new KSerializer[]{m0Var, m0Var, m0Var, C14667a.m13u(a2Var), C14667a.m13u(InviteType.Serializer.INSTANCE), C14667a.m13u(m0Var), C14667a.m13u(m0Var), C14667a.m13u(m0Var), C14667a.m13u(a2Var), C14667a.m13u(a2Var), C14667a.m13u(m0Var), C14667a.m13u(hVar), C14667a.m13u(hVar), C14667a.m13u(m0Var), C14667a.m13u(m0Var), C14667a.m13u(hVar), C14667a.m13u(m0Var), C14667a.m13u(a2Var), C14667a.m13u(a2Var), C14667a.m13u(a2Var), C14667a.m13u(m0Var), C14667a.m13u(m0Var), C14667a.m13u(m0Var), C14667a.m13u(a2Var), C14667a.m13u(a2Var), C14667a.m13u(m0Var), C14667a.m13u(a2Var), ApplicationId$$serializer.INSTANCE, ChannelId$$serializer.INSTANCE, CodedLinkExtendedType.Serializer.INSTANCE, new C3643f(a2Var), C14667a.m13u(a2Var), a2Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ActivityLauncherEmbedImpl deserialize(Decoder decoder) {
        int i;
        int i2;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        String str;
        int i3;
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
        int i4;
        Object obj27;
        Object obj28;
        Object obj29;
        C9971q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC10248c b = decoder.mo13905b(descriptor2);
        int i5 = 0;
        if (b.mo13850p()) {
            i4 = b.mo13855i(descriptor2, 0);
            i3 = b.mo13855i(descriptor2, 1);
            i = b.mo13855i(descriptor2, 2);
            C3622a2 a2Var = C3622a2.f5917a;
            obj14 = b.mo13852n(descriptor2, 3, a2Var, null);
            obj25 = b.mo13852n(descriptor2, 4, InviteType.Serializer.INSTANCE, null);
            C3676m0 m0Var = C3676m0.f5992a;
            obj24 = b.mo13852n(descriptor2, 5, m0Var, null);
            obj23 = b.mo13852n(descriptor2, 6, m0Var, null);
            obj22 = b.mo13852n(descriptor2, 7, m0Var, null);
            obj21 = b.mo13852n(descriptor2, 8, a2Var, null);
            obj20 = b.mo13852n(descriptor2, 9, a2Var, null);
            obj19 = b.mo13852n(descriptor2, 10, m0Var, null);
            C3652h hVar = C3652h.f5959a;
            obj15 = b.mo13852n(descriptor2, 11, hVar, null);
            obj16 = b.mo13852n(descriptor2, 12, hVar, null);
            obj17 = b.mo13852n(descriptor2, 13, m0Var, null);
            obj18 = b.mo13852n(descriptor2, 14, m0Var, null);
            obj29 = b.mo13852n(descriptor2, 15, hVar, null);
            obj10 = b.mo13852n(descriptor2, 16, m0Var, null);
            obj28 = b.mo13852n(descriptor2, 17, a2Var, null);
            obj27 = b.mo13852n(descriptor2, 18, a2Var, null);
            obj26 = b.mo13852n(descriptor2, 19, a2Var, null);
            obj6 = b.mo13852n(descriptor2, 20, m0Var, null);
            obj5 = b.mo13852n(descriptor2, 21, m0Var, null);
            obj4 = b.mo13852n(descriptor2, 22, m0Var, null);
            obj13 = b.mo13852n(descriptor2, 23, a2Var, null);
            obj12 = b.mo13852n(descriptor2, 24, a2Var, null);
            obj11 = b.mo13852n(descriptor2, 25, m0Var, null);
            obj3 = b.mo13852n(descriptor2, 26, a2Var, null);
            obj9 = b.mo13847y(descriptor2, 27, ApplicationId$$serializer.INSTANCE, null);
            obj8 = b.mo13847y(descriptor2, 28, ChannelId$$serializer.INSTANCE, null);
            obj7 = b.mo13847y(descriptor2, 29, CodedLinkExtendedType.Serializer.INSTANCE, null);
            obj2 = b.mo13847y(descriptor2, 30, new C3643f(a2Var), null);
            obj = b.mo13852n(descriptor2, 31, a2Var, null);
            str = b.mo13853m(descriptor2, 32);
            i5 = -1;
            i2 = 1;
        } else {
            int i6 = 32;
            int i7 = 0;
            int i8 = 0;
            i2 = 0;
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
            boolean z = true;
            int i9 = 0;
            while (z) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        i9 = i9;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        z = false;
                        Unit unit = Unit.f22042a;
                        break;
                    case 0:
                        i9 = i9;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        i7 = b.mo13855i(descriptor2, 0);
                        i5 |= 1;
                        Unit unit2 = Unit.f22042a;
                        break;
                    case 1:
                        i9 = i9;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        i8 = b.mo13855i(descriptor2, 1);
                        i5 |= 2;
                        Unit unit3 = Unit.f22042a;
                        break;
                    case 2:
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        i9 = b.mo13855i(descriptor2, 2);
                        i5 |= 4;
                        Unit unit4 = Unit.f22042a;
                        obj46 = obj46;
                        obj39 = obj39;
                        break;
                    case 3:
                        i9 = i9;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj33 = b.mo13852n(descriptor2, 3, C3622a2.f5917a, obj33);
                        i5 |= 8;
                        Unit unit5 = Unit.f22042a;
                        break;
                    case 4:
                        i9 = i9;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj30 = b.mo13852n(descriptor2, 4, InviteType.Serializer.INSTANCE, obj30);
                        i5 |= 16;
                        Unit unit6 = Unit.f22042a;
                        break;
                    case 5:
                        i9 = i9;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj31 = b.mo13852n(descriptor2, 5, C3676m0.f5992a, obj31);
                        i5 |= 32;
                        Unit unit7 = Unit.f22042a;
                        break;
                    case 6:
                        i9 = i9;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj38 = b.mo13852n(descriptor2, 6, C3676m0.f5992a, obj38);
                        i5 |= 64;
                        Unit unit8 = Unit.f22042a;
                        break;
                    case 7:
                        i9 = i9;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj37 = b.mo13852n(descriptor2, 7, C3676m0.f5992a, obj37);
                        i5 |= 128;
                        Unit unit9 = Unit.f22042a;
                        break;
                    case 8:
                        i9 = i9;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj36 = b.mo13852n(descriptor2, 8, C3622a2.f5917a, obj36);
                        i5 |= Spliterator.NONNULL;
                        Unit unit10 = Unit.f22042a;
                        break;
                    case 9:
                        i9 = i9;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj32 = b.mo13852n(descriptor2, 9, C3622a2.f5917a, obj32);
                        i5 |= 512;
                        Unit unit11 = Unit.f22042a;
                        break;
                    case 10:
                        i9 = i9;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj35 = b.mo13852n(descriptor2, 10, C3676m0.f5992a, obj35);
                        i5 |= Spliterator.IMMUTABLE;
                        Unit unit12 = Unit.f22042a;
                        break;
                    case 11:
                        i9 = i9;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj34 = b.mo13852n(descriptor2, 11, C3652h.f5959a, obj34);
                        i5 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        Unit unit13 = Unit.f22042a;
                        break;
                    case 12:
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj40 = obj40;
                        obj39 = b.mo13852n(descriptor2, 12, C3652h.f5959a, obj39);
                        i5 |= 4096;
                        Unit unit14 = Unit.f22042a;
                        i9 = i9;
                        obj46 = obj46;
                        break;
                    case 13:
                        i9 = i9;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj41 = obj41;
                        obj40 = b.mo13852n(descriptor2, 13, C3676m0.f5992a, obj40);
                        i5 |= 8192;
                        Unit unit15 = Unit.f22042a;
                        obj39 = obj39;
                        break;
                    case 14:
                        i9 = i9;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj42 = obj42;
                        obj41 = b.mo13852n(descriptor2, 14, C3676m0.f5992a, obj41);
                        i5 |= Spliterator.SUBSIZED;
                        Unit unit16 = Unit.f22042a;
                        obj40 = obj40;
                        obj39 = obj39;
                        break;
                    case 15:
                        i9 = i9;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj43 = obj43;
                        obj42 = b.mo13852n(descriptor2, 15, C3652h.f5959a, obj42);
                        i5 |= 32768;
                        Unit unit17 = Unit.f22042a;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj39 = obj39;
                        break;
                    case 16:
                        i9 = i9;
                        obj45 = obj45;
                        obj46 = obj46;
                        obj44 = obj44;
                        obj43 = b.mo13852n(descriptor2, 16, C3676m0.f5992a, obj43);
                        i5 |= 65536;
                        Unit unit18 = Unit.f22042a;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj39 = obj39;
                        break;
                    case 17:
                        i9 = i9;
                        obj46 = obj46;
                        obj45 = obj45;
                        obj44 = b.mo13852n(descriptor2, 17, C3622a2.f5917a, obj44);
                        i5 |= 131072;
                        Unit unit19 = Unit.f22042a;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj39 = obj39;
                        break;
                    case 18:
                        i9 = i9;
                        obj46 = obj46;
                        obj45 = b.mo13852n(descriptor2, 18, C3622a2.f5917a, obj45);
                        i5 |= 262144;
                        Unit unit20 = Unit.f22042a;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj39 = obj39;
                        break;
                    case 19:
                        obj46 = b.mo13852n(descriptor2, 19, C3622a2.f5917a, obj46);
                        i5 |= 524288;
                        Unit unit21 = Unit.f22042a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        obj47 = obj47;
                        i9 = i9;
                        break;
                    case 20:
                        i9 = i9;
                        obj47 = b.mo13852n(descriptor2, 20, C3676m0.f5992a, obj47);
                        i5 |= 1048576;
                        Unit unit22 = Unit.f22042a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        break;
                    case 21:
                        i9 = i9;
                        obj5 = b.mo13852n(descriptor2, 21, C3676m0.f5992a, obj5);
                        i5 |= 2097152;
                        Unit unit23 = Unit.f22042a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        break;
                    case 22:
                        i9 = i9;
                        obj4 = b.mo13852n(descriptor2, 22, C3676m0.f5992a, obj4);
                        i5 |= 4194304;
                        Unit unit24 = Unit.f22042a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        break;
                    case 23:
                        i9 = i9;
                        obj48 = b.mo13852n(descriptor2, 23, C3622a2.f5917a, obj48);
                        i5 |= 8388608;
                        Unit unit25 = Unit.f22042a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        break;
                    case 24:
                        i9 = i9;
                        obj49 = b.mo13852n(descriptor2, 24, C3622a2.f5917a, obj49);
                        i5 |= 16777216;
                        Unit unit26 = Unit.f22042a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        break;
                    case 25:
                        i9 = i9;
                        obj50 = b.mo13852n(descriptor2, 25, C3676m0.f5992a, obj50);
                        i5 |= 33554432;
                        Unit unit27 = Unit.f22042a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        break;
                    case 26:
                        i9 = i9;
                        obj3 = b.mo13852n(descriptor2, 26, C3622a2.f5917a, obj3);
                        i5 |= 67108864;
                        Unit unit28 = Unit.f22042a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        break;
                    case 27:
                        i9 = i9;
                        obj51 = b.mo13847y(descriptor2, 27, ApplicationId$$serializer.INSTANCE, obj51);
                        i5 |= 134217728;
                        Unit unit29 = Unit.f22042a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        break;
                    case 28:
                        i9 = i9;
                        obj52 = b.mo13847y(descriptor2, 28, ChannelId$$serializer.INSTANCE, obj52);
                        i5 |= 268435456;
                        Unit unit30 = Unit.f22042a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        break;
                    case 29:
                        i9 = i9;
                        obj53 = b.mo13847y(descriptor2, 29, CodedLinkExtendedType.Serializer.INSTANCE, obj53);
                        i5 |= 536870912;
                        Unit unit31 = Unit.f22042a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        break;
                    case 30:
                        i9 = i9;
                        obj2 = b.mo13847y(descriptor2, 30, new C3643f(C3622a2.f5917a), obj2);
                        i5 |= 1073741824;
                        Unit unit32 = Unit.f22042a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        break;
                    case 31:
                        i9 = i9;
                        obj = b.mo13852n(descriptor2, 31, C3622a2.f5917a, obj);
                        i5 |= Integer.MIN_VALUE;
                        Unit unit33 = Unit.f22042a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        break;
                    case 32:
                        str2 = b.mo13853m(descriptor2, i6);
                        i2 |= 1;
                        Unit unit34 = Unit.f22042a;
                        obj39 = obj39;
                        obj40 = obj40;
                        obj41 = obj41;
                        obj42 = obj42;
                        obj43 = obj43;
                        obj44 = obj44;
                        obj45 = obj45;
                        break;
                    default:
                        throw new C14447n(o);
                }
                i6 = 32;
            }
            i = i9;
            obj6 = obj47;
            obj14 = obj33;
            i3 = i8;
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
            i4 = i7;
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
        b.mo13857c(descriptor2);
        return new ActivityLauncherEmbedImpl(i5, i2, i4, i3, i, (String) obj14, (InviteType) obj25, (Integer) obj24, (Integer) obj23, (Integer) obj22, (String) obj21, (String) obj20, (Integer) obj19, (Boolean) obj15, (Boolean) obj16, (Integer) obj17, (Integer) obj18, (Boolean) obj29, (Integer) obj10, (String) obj28, (String) obj27, (String) obj26, (Integer) obj6, (Integer) obj5, (Integer) obj4, (String) obj13, (String) obj12, (Integer) obj11, (String) obj3, (ApplicationId) obj9, (ChannelId) obj8, (CodedLinkExtendedType) obj7, (List) obj2, (String) obj, str, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ActivityLauncherEmbedImpl value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        ActivityLauncherEmbedImpl.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC3644f0.C3645a.m33897a(this);
    }
}
