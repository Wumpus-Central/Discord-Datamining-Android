package com.discord.mobile_voice_overlay;

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
import xi.a2;
import xi.f0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/mobile_voice_overlay/MobileVoiceOverlayAssets.$serializer", "Lxi/f0;", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "mobile_voice_overlay_release"}, k = 1, mv = {1, 8, 0})

public final class MobileVoiceOverlayAssets$$serializer implements f0<MobileVoiceOverlayAssets> {
    public static final MobileVoiceOverlayAssets$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        MobileVoiceOverlayAssets$$serializer mobileVoiceOverlayAssets$$serializer = new MobileVoiceOverlayAssets$$serializer();
        INSTANCE = mobileVoiceOverlayAssets$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets", mobileVoiceOverlayAssets$$serializer, 11);
        pluginGeneratedSerialDescriptor.l("useSpeaker", false);
        pluginGeneratedSerialDescriptor.l("mute", false);
        pluginGeneratedSerialDescriptor.l("disconnectFromVoice", false);
        pluginGeneratedSerialDescriptor.l("getInvite", false);
        pluginGeneratedSerialDescriptor.l("switchChannels", false);
        pluginGeneratedSerialDescriptor.l("openDiscord", false);
        pluginGeneratedSerialDescriptor.l("inviteLinkCopied", false);
        pluginGeneratedSerialDescriptor.l("channelSelect", false);
        pluginGeneratedSerialDescriptor.l("closeWindow", false);
        pluginGeneratedSerialDescriptor.l("searchChannels", false);
        pluginGeneratedSerialDescriptor.l("noResults", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MobileVoiceOverlayAssets$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f30574a;
        return new KSerializer[]{a2Var, a2Var, a2Var, a2Var, a2Var, a2Var, a2Var, a2Var, a2Var, a2Var, a2Var};
    }

    @Override 
    public MobileVoiceOverlayAssets deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        int i10;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        int i11 = 0;
        if (b10.p()) {
            str11 = b10.m(descriptor2, 0);
            str10 = b10.m(descriptor2, 1);
            str9 = b10.m(descriptor2, 2);
            str8 = b10.m(descriptor2, 3);
            str7 = b10.m(descriptor2, 4);
            str6 = b10.m(descriptor2, 5);
            str5 = b10.m(descriptor2, 6);
            str4 = b10.m(descriptor2, 7);
            str3 = b10.m(descriptor2, 8);
            str2 = b10.m(descriptor2, 9);
            str = b10.m(descriptor2, 10);
            i10 = 2047;
        } else {
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            boolean z10 = true;
            while (z10) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        str12 = b10.m(descriptor2, 0);
                        i11 |= 1;
                        continue;
                    case 1:
                        str22 = b10.m(descriptor2, 1);
                        i11 |= 2;
                        continue;
                    case 2:
                        str21 = b10.m(descriptor2, 2);
                        i11 |= 4;
                        break;
                    case 3:
                        str18 = b10.m(descriptor2, 3);
                        i11 |= 8;
                        break;
                    case 4:
                        str20 = b10.m(descriptor2, 4);
                        i11 |= 16;
                        break;
                    case 5:
                        str17 = b10.m(descriptor2, 5);
                        i11 |= 32;
                        break;
                    case 6:
                        str16 = b10.m(descriptor2, 6);
                        i11 |= 64;
                        break;
                    case 7:
                        str15 = b10.m(descriptor2, 7);
                        i11 |= 128;
                        break;
                    case 8:
                        str19 = b10.m(descriptor2, 8);
                        i11 |= 256;
                        break;
                    case 9:
                        str14 = b10.m(descriptor2, 9);
                        i11 |= 512;
                        break;
                    case 10:
                        str13 = b10.m(descriptor2, 10);
                        i11 |= 1024;
                        break;
                    default:
                        throw new n(o10);
                }
            }
            str = str13;
            str2 = str14;
            str11 = str12;
            i10 = i11;
            str4 = str15;
            str10 = str22;
            str3 = str19;
            str6 = str17;
            str8 = str18;
            str7 = str20;
            str5 = str16;
            str9 = str21;
        }
        b10.c(descriptor2);
        return new MobileVoiceOverlayAssets(i10, str11, str10, str9, str8, str7, str6, str5, str4, str3, str2, str, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, MobileVoiceOverlayAssets value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        MobileVoiceOverlayAssets.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
