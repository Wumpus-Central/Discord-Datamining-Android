package com.discord.mobile_voice_overlay;

import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
import kotlin.Metadata;
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
import yj.f0;
import yj.h;
import yj.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser.$serializer", "Lyj/f0;", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "mobile_voice_overlay_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class MobileVoiceOverlayDataUser$$serializer implements f0<MobileVoiceOverlayDataUser> {
    public static final MobileVoiceOverlayDataUser$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MobileVoiceOverlayDataUser$$serializer mobileVoiceOverlayDataUser$$serializer = new MobileVoiceOverlayDataUser$$serializer();
        INSTANCE = mobileVoiceOverlayDataUser$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.mobile_voice_overlay.MobileVoiceOverlayDataUser", mobileVoiceOverlayDataUser$$serializer, 4);
        pluginGeneratedSerialDescriptor.l("userId", false);
        pluginGeneratedSerialDescriptor.l("avatar", false);
        pluginGeneratedSerialDescriptor.l("speaking", false);
        pluginGeneratedSerialDescriptor.l("discriminator", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MobileVoiceOverlayDataUser$$serializer() {
    }

    @Override // yj.f0
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{UserId$$serializer.INSTANCE, a.u(a2.f32924a), h.f32966a, m0.f32999a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public MobileVoiceOverlayDataUser deserialize(Decoder decoder) {
        int i10;
        boolean z10;
        Object obj;
        int i11;
        Object obj2;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            obj2 = b10.y(descriptor2, 0, UserId$$serializer.INSTANCE, null);
            obj = b10.n(descriptor2, 1, a2.f32924a, null);
            z10 = b10.C(descriptor2, 2);
            i10 = b10.i(descriptor2, 3);
            i11 = 15;
        } else {
            boolean z11 = true;
            int i12 = 0;
            int i13 = 0;
            Object obj3 = null;
            Object obj4 = null;
            z10 = false;
            while (z11) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z11 = false;
                } else if (o10 == 0) {
                    obj3 = b10.y(descriptor2, 0, UserId$$serializer.INSTANCE, obj3);
                    i13 |= 1;
                } else if (o10 == 1) {
                    obj4 = b10.n(descriptor2, 1, a2.f32924a, obj4);
                    i13 |= 2;
                } else if (o10 == 2) {
                    z10 = b10.C(descriptor2, 2);
                    i13 |= 4;
                } else if (o10 == 3) {
                    i12 = b10.i(descriptor2, 3);
                    i13 |= 8;
                } else {
                    throw new n(o10);
                }
            }
            i11 = i13;
            obj = obj4;
            i10 = i12;
            obj2 = obj3;
        }
        b10.c(descriptor2);
        return new MobileVoiceOverlayDataUser(i11, (UserId) obj2, (String) obj, z10, i10, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, vj.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, MobileVoiceOverlayDataUser value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        MobileVoiceOverlayDataUser.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // yj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
