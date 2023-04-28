package com.discord.mobile_voice_overlay;

import bj.AbstractC2522f0;
import bj.C2500a2;
import bj.C2521f;
import bj.C2530h;
import bj.C2555m0;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
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
import p164j$.util.Spliterator;
import p450yi.C14382n;
import p470zi.C14606a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/mobile_voice_overlay/MobileVoiceOverlayData.$serializer", "Lbj/f0;", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "mobile_voice_overlay_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class MobileVoiceOverlayData$$serializer implements AbstractC2522f0<MobileVoiceOverlayData> {
    public static final MobileVoiceOverlayData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MobileVoiceOverlayData$$serializer mobileVoiceOverlayData$$serializer = new MobileVoiceOverlayData$$serializer();
        INSTANCE = mobileVoiceOverlayData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.mobile_voice_overlay.MobileVoiceOverlayData", mobileVoiceOverlayData$$serializer, 11);
        pluginGeneratedSerialDescriptor.m13841l("users", false);
        pluginGeneratedSerialDescriptor.m13841l("extraUsers", false);
        pluginGeneratedSerialDescriptor.m13841l("guildId", false);
        pluginGeneratedSerialDescriptor.m13841l("channelId", false);
        pluginGeneratedSerialDescriptor.m13841l("channelName", false);
        pluginGeneratedSerialDescriptor.m13841l("guildName", false);
        pluginGeneratedSerialDescriptor.m13841l("deafened", false);
        pluginGeneratedSerialDescriptor.m13841l("muted", false);
        pluginGeneratedSerialDescriptor.m13841l("connectionQuality", false);
        pluginGeneratedSerialDescriptor.m13841l("canGenerateInvite", false);
        pluginGeneratedSerialDescriptor.m13841l("channelSelectorResults", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MobileVoiceOverlayData$$serializer() {
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] childSerializers() {
        C2500a2 a2Var = C2500a2.f6719a;
        C2530h hVar = C2530h.f6761a;
        return new KSerializer[]{new C2521f(MobileVoiceOverlayDataUser$$serializer.INSTANCE), C2555m0.f6794a, C14606a.m13u(GuildId$$serializer.INSTANCE), ChannelId$$serializer.INSTANCE, a2Var, a2Var, hVar, hVar, ConnectionQuality.Companion.serializer(), hVar, new C2521f(MobileVoiceOverlaySelectorResult$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public MobileVoiceOverlayData deserialize(Decoder decoder) {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        Object obj;
        String str2;
        Object obj2;
        Object obj3;
        int i;
        int i2;
        Object obj4;
        Object obj5;
        C9677q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC9967c b = decoder.mo13905b(descriptor2);
        int i3 = 10;
        int i4 = 9;
        int i5 = 7;
        int i6 = 6;
        int i7 = 0;
        if (b.mo13850p()) {
            obj5 = b.mo13847y(descriptor2, 0, new C2521f(MobileVoiceOverlayDataUser$$serializer.INSTANCE), null);
            i = b.mo13855i(descriptor2, 1);
            obj = b.mo13852n(descriptor2, 2, GuildId$$serializer.INSTANCE, null);
            obj3 = b.mo13847y(descriptor2, 3, ChannelId$$serializer.INSTANCE, null);
            str2 = b.mo13853m(descriptor2, 4);
            str = b.mo13853m(descriptor2, 5);
            z3 = b.mo13861C(descriptor2, 6);
            z2 = b.mo13861C(descriptor2, 7);
            obj2 = b.mo13847y(descriptor2, 8, ConnectionQuality.Companion.serializer(), null);
            z = b.mo13861C(descriptor2, 9);
            obj4 = b.mo13847y(descriptor2, 10, new C2521f(MobileVoiceOverlaySelectorResult$$serializer.INSTANCE), null);
            i2 = 2047;
        } else {
            boolean z4 = true;
            boolean z5 = false;
            boolean z6 = false;
            int i8 = 0;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            String str3 = null;
            str = null;
            boolean z7 = false;
            while (z4) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z4 = false;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 0:
                        obj10 = b.mo13847y(descriptor2, 0, new C2521f(MobileVoiceOverlayDataUser$$serializer.INSTANCE), obj10);
                        i7 |= 1;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 1:
                        i8 = b.mo13855i(descriptor2, 1);
                        i7 |= 2;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 2:
                        obj9 = b.mo13852n(descriptor2, 2, GuildId$$serializer.INSTANCE, obj9);
                        i7 |= 4;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 3:
                        obj8 = b.mo13847y(descriptor2, 3, ChannelId$$serializer.INSTANCE, obj8);
                        i7 |= 8;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 4:
                        str3 = b.mo13853m(descriptor2, 4);
                        i7 |= 16;
                        i3 = 10;
                        break;
                    case 5:
                        str = b.mo13853m(descriptor2, 5);
                        i7 |= 32;
                        break;
                    case 6:
                        z6 = b.mo13861C(descriptor2, i6);
                        i7 |= 64;
                        break;
                    case 7:
                        z7 = b.mo13861C(descriptor2, i5);
                        i7 |= 128;
                        i6 = 6;
                        break;
                    case 8:
                        obj6 = b.mo13847y(descriptor2, 8, ConnectionQuality.Companion.serializer(), obj6);
                        i7 |= Spliterator.NONNULL;
                        i6 = 6;
                        break;
                    case 9:
                        z5 = b.mo13861C(descriptor2, i4);
                        i7 |= 512;
                        i6 = 6;
                        break;
                    case 10:
                        obj7 = b.mo13847y(descriptor2, i3, new C2521f(MobileVoiceOverlaySelectorResult$$serializer.INSTANCE), obj7);
                        i7 |= Spliterator.IMMUTABLE;
                        i6 = 6;
                        break;
                    default:
                        throw new C14382n(o);
                }
            }
            obj2 = obj6;
            obj4 = obj7;
            obj3 = obj8;
            obj = obj9;
            i2 = i7;
            z2 = z7;
            z3 = z6;
            i = i8;
            str2 = str3;
            z = z5;
            obj5 = obj10;
        }
        b.mo13857c(descriptor2);
        return new MobileVoiceOverlayData(i2, (List) obj5, i, (GuildId) obj, (ChannelId) obj3, str2, str, z3, z2, (ConnectionQuality) obj2, z, (List) obj4, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, MobileVoiceOverlayData value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        MobileVoiceOverlayData.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC2522f0.C2523a.m33897a(this);
    }
}
