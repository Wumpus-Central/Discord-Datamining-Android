package com.discord.mobile_voice_overlay;

import bj.AbstractC3644f0;
import bj.C3622a2;
import kotlin.Metadata;
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

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/mobile_voice_overlay/MobileVoiceOverlayAssets.$serializer", "Lbj/f0;", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "mobile_voice_overlay_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class MobileVoiceOverlayAssets$$serializer implements AbstractC3644f0<MobileVoiceOverlayAssets> {
    public static final MobileVoiceOverlayAssets$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MobileVoiceOverlayAssets$$serializer mobileVoiceOverlayAssets$$serializer = new MobileVoiceOverlayAssets$$serializer();
        INSTANCE = mobileVoiceOverlayAssets$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets", mobileVoiceOverlayAssets$$serializer, 11);
        pluginGeneratedSerialDescriptor.m13841l("useSpeaker", false);
        pluginGeneratedSerialDescriptor.m13841l("mute", false);
        pluginGeneratedSerialDescriptor.m13841l("disconnectFromVoice", false);
        pluginGeneratedSerialDescriptor.m13841l("getInvite", false);
        pluginGeneratedSerialDescriptor.m13841l("switchChannels", false);
        pluginGeneratedSerialDescriptor.m13841l("openDiscord", false);
        pluginGeneratedSerialDescriptor.m13841l("inviteLinkCopied", false);
        pluginGeneratedSerialDescriptor.m13841l("channelSelect", false);
        pluginGeneratedSerialDescriptor.m13841l("closeWindow", false);
        pluginGeneratedSerialDescriptor.m13841l("searchChannels", false);
        pluginGeneratedSerialDescriptor.m13841l("noResults", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MobileVoiceOverlayAssets$$serializer() {
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] childSerializers() {
        C3622a2 a2Var = C3622a2.f5917a;
        return new KSerializer[]{a2Var, a2Var, a2Var, a2Var, a2Var, a2Var, a2Var, a2Var, a2Var, a2Var, a2Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
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
        int i;
        C9971q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC10248c b = decoder.mo13905b(descriptor2);
        int i2 = 0;
        if (b.mo13850p()) {
            str11 = b.mo13853m(descriptor2, 0);
            str10 = b.mo13853m(descriptor2, 1);
            str9 = b.mo13853m(descriptor2, 2);
            str8 = b.mo13853m(descriptor2, 3);
            str7 = b.mo13853m(descriptor2, 4);
            str6 = b.mo13853m(descriptor2, 5);
            str5 = b.mo13853m(descriptor2, 6);
            str4 = b.mo13853m(descriptor2, 7);
            str3 = b.mo13853m(descriptor2, 8);
            str2 = b.mo13853m(descriptor2, 9);
            str = b.mo13853m(descriptor2, 10);
            i = 2047;
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
            boolean z = true;
            while (z) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        str12 = b.mo13853m(descriptor2, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        str22 = b.mo13853m(descriptor2, 1);
                        i2 |= 2;
                        continue;
                    case 2:
                        str21 = b.mo13853m(descriptor2, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        str18 = b.mo13853m(descriptor2, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        str20 = b.mo13853m(descriptor2, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        str17 = b.mo13853m(descriptor2, 5);
                        i2 |= 32;
                        break;
                    case 6:
                        str16 = b.mo13853m(descriptor2, 6);
                        i2 |= 64;
                        break;
                    case 7:
                        str15 = b.mo13853m(descriptor2, 7);
                        i2 |= 128;
                        break;
                    case 8:
                        str19 = b.mo13853m(descriptor2, 8);
                        i2 |= Spliterator.NONNULL;
                        break;
                    case 9:
                        str14 = b.mo13853m(descriptor2, 9);
                        i2 |= 512;
                        break;
                    case 10:
                        str13 = b.mo13853m(descriptor2, 10);
                        i2 |= Spliterator.IMMUTABLE;
                        break;
                    default:
                        throw new C14447n(o);
                }
            }
            str = str13;
            str2 = str14;
            str11 = str12;
            i = i2;
            str4 = str15;
            str10 = str22;
            str3 = str19;
            str6 = str17;
            str8 = str18;
            str7 = str20;
            str5 = str16;
            str9 = str21;
        }
        b.mo13857c(descriptor2);
        return new MobileVoiceOverlayAssets(i, str11, str10, str9, str8, str7, str6, str5, str4, str3, str2, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, MobileVoiceOverlayAssets value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        MobileVoiceOverlayAssets.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC3644f0.C3645a.m33897a(this);
    }
}
