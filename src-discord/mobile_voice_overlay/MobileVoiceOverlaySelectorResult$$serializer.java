package com.discord.mobile_voice_overlay;

import bj.a2;
import bj.f0;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import yi.n;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult.$serializer", "Lbj/f0;", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "mobile_voice_overlay_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class MobileVoiceOverlaySelectorResult$$serializer implements f0<MobileVoiceOverlaySelectorResult> {
    public static final MobileVoiceOverlaySelectorResult$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MobileVoiceOverlaySelectorResult$$serializer mobileVoiceOverlaySelectorResult$$serializer = new MobileVoiceOverlaySelectorResult$$serializer();
        INSTANCE = mobileVoiceOverlaySelectorResult$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.mobile_voice_overlay.MobileVoiceOverlaySelectorResult", mobileVoiceOverlaySelectorResult$$serializer, 5);
        pluginGeneratedSerialDescriptor.l("guildId", false);
        pluginGeneratedSerialDescriptor.l("channelId", false);
        pluginGeneratedSerialDescriptor.l("channelName", false);
        pluginGeneratedSerialDescriptor.l("guildName", false);
        pluginGeneratedSerialDescriptor.l("categoryName", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MobileVoiceOverlaySelectorResult$$serializer() {
    }

    @Override // bj.f0
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f5917a;
        return new KSerializer[]{GuildId$$serializer.INSTANCE, ChannelId$$serializer.INSTANCE, a2Var, a2Var, a2Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public MobileVoiceOverlaySelectorResult deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        Object obj;
        int i10;
        Object obj2;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        Object obj3 = null;
        if (b10.p()) {
            obj2 = b10.y(descriptor2, 0, GuildId$$serializer.INSTANCE, null);
            obj = b10.y(descriptor2, 1, ChannelId$$serializer.INSTANCE, null);
            str3 = b10.m(descriptor2, 2);
            str2 = b10.m(descriptor2, 3);
            str = b10.m(descriptor2, 4);
            i10 = 31;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object obj4 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (z10) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z10 = false;
                } else if (o10 == 0) {
                    obj3 = b10.y(descriptor2, 0, GuildId$$serializer.INSTANCE, obj3);
                    i11 |= 1;
                } else if (o10 == 1) {
                    obj4 = b10.y(descriptor2, 1, ChannelId$$serializer.INSTANCE, obj4);
                    i11 |= 2;
                } else if (o10 == 2) {
                    str4 = b10.m(descriptor2, 2);
                    i11 |= 4;
                } else if (o10 == 3) {
                    str5 = b10.m(descriptor2, 3);
                    i11 |= 8;
                } else if (o10 == 4) {
                    str6 = b10.m(descriptor2, 4);
                    i11 |= 16;
                } else {
                    throw new n(o10);
                }
            }
            i10 = i11;
            obj2 = obj3;
            obj = obj4;
            str3 = str4;
            str2 = str5;
            str = str6;
        }
        b10.c(descriptor2);
        return new MobileVoiceOverlaySelectorResult(i10, (GuildId) obj2, (ChannelId) obj, str3, str2, str, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, yi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, MobileVoiceOverlaySelectorResult value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        MobileVoiceOverlaySelectorResult.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // bj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}