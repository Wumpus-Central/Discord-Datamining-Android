package com.discord.mobile_voice_overlay;

import bj.AbstractC3644f0;
import bj.C3622a2;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p449yi.C14447n;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult.$serializer", "Lbj/f0;", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "mobile_voice_overlay_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class MobileVoiceOverlaySelectorResult$$serializer implements AbstractC3644f0<MobileVoiceOverlaySelectorResult> {
    public static final MobileVoiceOverlaySelectorResult$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MobileVoiceOverlaySelectorResult$$serializer mobileVoiceOverlaySelectorResult$$serializer = new MobileVoiceOverlaySelectorResult$$serializer();
        INSTANCE = mobileVoiceOverlaySelectorResult$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.mobile_voice_overlay.MobileVoiceOverlaySelectorResult", mobileVoiceOverlaySelectorResult$$serializer, 5);
        pluginGeneratedSerialDescriptor.m13841l("guildId", false);
        pluginGeneratedSerialDescriptor.m13841l("channelId", false);
        pluginGeneratedSerialDescriptor.m13841l("channelName", false);
        pluginGeneratedSerialDescriptor.m13841l("guildName", false);
        pluginGeneratedSerialDescriptor.m13841l("categoryName", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MobileVoiceOverlaySelectorResult$$serializer() {
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] childSerializers() {
        C3622a2 a2Var = C3622a2.f5917a;
        return new KSerializer[]{GuildId$$serializer.INSTANCE, ChannelId$$serializer.INSTANCE, a2Var, a2Var, a2Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public MobileVoiceOverlaySelectorResult deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        Object obj;
        int i;
        Object obj2;
        C9971q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC10248c b = decoder.mo13905b(descriptor2);
        Object obj3 = null;
        if (b.mo13850p()) {
            obj2 = b.mo13847y(descriptor2, 0, GuildId$$serializer.INSTANCE, null);
            obj = b.mo13847y(descriptor2, 1, ChannelId$$serializer.INSTANCE, null);
            str3 = b.mo13853m(descriptor2, 2);
            str2 = b.mo13853m(descriptor2, 3);
            str = b.mo13853m(descriptor2, 4);
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            Object obj4 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (z) {
                int o = b.mo13851o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    obj3 = b.mo13847y(descriptor2, 0, GuildId$$serializer.INSTANCE, obj3);
                    i2 |= 1;
                } else if (o == 1) {
                    obj4 = b.mo13847y(descriptor2, 1, ChannelId$$serializer.INSTANCE, obj4);
                    i2 |= 2;
                } else if (o == 2) {
                    str4 = b.mo13853m(descriptor2, 2);
                    i2 |= 4;
                } else if (o == 3) {
                    str5 = b.mo13853m(descriptor2, 3);
                    i2 |= 8;
                } else if (o == 4) {
                    str6 = b.mo13853m(descriptor2, 4);
                    i2 |= 16;
                } else {
                    throw new C14447n(o);
                }
            }
            i = i2;
            obj2 = obj3;
            obj = obj4;
            str3 = str4;
            str2 = str5;
            str = str6;
        }
        b.mo13857c(descriptor2);
        return new MobileVoiceOverlaySelectorResult(i, (GuildId) obj2, (ChannelId) obj, str3, str2, str, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, MobileVoiceOverlaySelectorResult value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        MobileVoiceOverlaySelectorResult.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC3644f0.C3645a.m33897a(this);
    }
}
