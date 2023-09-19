package com.discord.mobile_voice_overlay;

import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
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
import ui.n;
import vi.a;
import xi.a2;
import xi.f;
import xi.f0;
import xi.h;
import xi.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/mobile_voice_overlay/MobileVoiceOverlayData.$serializer", "Lxi/f0;", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "mobile_voice_overlay_release"}, k = 1, mv = {1, 8, 0})

public final class MobileVoiceOverlayData$$serializer implements f0<MobileVoiceOverlayData> {
    public static final MobileVoiceOverlayData$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        MobileVoiceOverlayData$$serializer mobileVoiceOverlayData$$serializer = new MobileVoiceOverlayData$$serializer();
        INSTANCE = mobileVoiceOverlayData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.mobile_voice_overlay.MobileVoiceOverlayData", mobileVoiceOverlayData$$serializer, 11);
        pluginGeneratedSerialDescriptor.l("users", false);
        pluginGeneratedSerialDescriptor.l("extraUsers", false);
        pluginGeneratedSerialDescriptor.l("guildId", false);
        pluginGeneratedSerialDescriptor.l("channelId", false);
        pluginGeneratedSerialDescriptor.l("channelName", false);
        pluginGeneratedSerialDescriptor.l("guildName", false);
        pluginGeneratedSerialDescriptor.l("deafened", false);
        pluginGeneratedSerialDescriptor.l("muted", false);
        pluginGeneratedSerialDescriptor.l("connectionQuality", false);
        pluginGeneratedSerialDescriptor.l("canGenerateInvite", false);
        pluginGeneratedSerialDescriptor.l("channelSelectorResults", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MobileVoiceOverlayData$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f30576a;
        h hVar = h.f30618a;
        return new KSerializer[]{new f(MobileVoiceOverlayDataUser$$serializer.INSTANCE), m0.f30651a, a.u(GuildId$$serializer.INSTANCE), ChannelId$$serializer.INSTANCE, a2Var, a2Var, hVar, hVar, ConnectionQuality.Companion.serializer(), hVar, new f(MobileVoiceOverlaySelectorResult$$serializer.INSTANCE)};
    }

    @Override 
    public MobileVoiceOverlayData deserialize(Decoder decoder) {
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj;
        String str2;
        Object obj2;
        Object obj3;
        int i10;
        int i11;
        Object obj4;
        Object obj5;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        int i12 = 10;
        int i13 = 9;
        int i14 = 7;
        int i15 = 6;
        int i16 = 0;
        if (b10.p()) {
            obj5 = b10.y(descriptor2, 0, new f(MobileVoiceOverlayDataUser$$serializer.INSTANCE), null);
            i10 = b10.i(descriptor2, 1);
            obj = b10.n(descriptor2, 2, GuildId$$serializer.INSTANCE, null);
            obj3 = b10.y(descriptor2, 3, ChannelId$$serializer.INSTANCE, null);
            str2 = b10.m(descriptor2, 4);
            str = b10.m(descriptor2, 5);
            z12 = b10.C(descriptor2, 6);
            z11 = b10.C(descriptor2, 7);
            obj2 = b10.y(descriptor2, 8, ConnectionQuality.Companion.serializer(), null);
            z10 = b10.C(descriptor2, 9);
            obj4 = b10.y(descriptor2, 10, new f(MobileVoiceOverlaySelectorResult$$serializer.INSTANCE), null);
            i11 = 2047;
        } else {
            boolean z13 = true;
            boolean z14 = false;
            boolean z15 = false;
            int i17 = 0;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            String str3 = null;
            str = null;
            boolean z16 = false;
            while (z13) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z13 = false;
                        i13 = 9;
                        i14 = 7;
                        break;
                    case 0:
                        obj10 = b10.y(descriptor2, 0, new f(MobileVoiceOverlayDataUser$$serializer.INSTANCE), obj10);
                        i16 |= 1;
                        i12 = 10;
                        i13 = 9;
                        i14 = 7;
                        break;
                    case 1:
                        i17 = b10.i(descriptor2, 1);
                        i16 |= 2;
                        i12 = 10;
                        i13 = 9;
                        break;
                    case 2:
                        obj9 = b10.n(descriptor2, 2, GuildId$$serializer.INSTANCE, obj9);
                        i16 |= 4;
                        i12 = 10;
                        i13 = 9;
                        break;
                    case 3:
                        obj8 = b10.y(descriptor2, 3, ChannelId$$serializer.INSTANCE, obj8);
                        i16 |= 8;
                        i12 = 10;
                        i13 = 9;
                        break;
                    case 4:
                        str3 = b10.m(descriptor2, 4);
                        i16 |= 16;
                        i12 = 10;
                        break;
                    case 5:
                        str = b10.m(descriptor2, 5);
                        i16 |= 32;
                        break;
                    case 6:
                        z15 = b10.C(descriptor2, i15);
                        i16 |= 64;
                        break;
                    case 7:
                        z16 = b10.C(descriptor2, i14);
                        i16 |= 128;
                        i15 = 6;
                        break;
                    case 8:
                        obj6 = b10.y(descriptor2, 8, ConnectionQuality.Companion.serializer(), obj6);
                        i16 |= 256;
                        i15 = 6;
                        break;
                    case 9:
                        z14 = b10.C(descriptor2, i13);
                        i16 |= 512;
                        i15 = 6;
                        break;
                    case 10:
                        obj7 = b10.y(descriptor2, i12, new f(MobileVoiceOverlaySelectorResult$$serializer.INSTANCE), obj7);
                        i16 |= 1024;
                        i15 = 6;
                        break;
                    default:
                        throw new n(o10);
                }
            }
            obj2 = obj6;
            obj4 = obj7;
            obj3 = obj8;
            obj = obj9;
            i11 = i16;
            z11 = z16;
            z12 = z15;
            i10 = i17;
            str2 = str3;
            z10 = z14;
            obj5 = obj10;
        }
        b10.c(descriptor2);
        return new MobileVoiceOverlayData(i11, (List) obj5, i10, (GuildId) obj, (ChannelId) obj3, str2, str, z12, z11, (ConnectionQuality) obj2, z10, (List) obj4, null, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, MobileVoiceOverlayData value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        MobileVoiceOverlayData.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
