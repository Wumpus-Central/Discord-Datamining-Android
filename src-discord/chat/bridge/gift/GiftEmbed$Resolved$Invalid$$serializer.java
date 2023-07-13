package com.discord.chat.bridge.gift;

import com.discord.chat.bridge.gift.GiftEmbed;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import pi.n;
import si.a2;
import si.f0;
import si.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/gift/GiftEmbed.Resolved.Invalid.$serializer", "Lsi/f0;", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Invalid;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class GiftEmbed$Resolved$Invalid$$serializer implements f0<GiftEmbed.Resolved.Invalid> {
    public static final GiftEmbed$Resolved$Invalid$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        GiftEmbed$Resolved$Invalid$$serializer giftEmbed$Resolved$Invalid$$serializer = new GiftEmbed$Resolved$Invalid$$serializer();
        INSTANCE = giftEmbed$Resolved$Invalid$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.gift.GiftEmbed.Resolved.Invalid", giftEmbed$Resolved$Invalid$$serializer, 10);
        pluginGeneratedSerialDescriptor.l("headerText", false);
        pluginGeneratedSerialDescriptor.l("headerColor", false);
        pluginGeneratedSerialDescriptor.l(ViewProps.BACKGROUND_COLOR, false);
        pluginGeneratedSerialDescriptor.l("thumbnailCornerRadius", false);
        pluginGeneratedSerialDescriptor.l("thumbnailUrl", false);
        pluginGeneratedSerialDescriptor.l("titleText", false);
        pluginGeneratedSerialDescriptor.l("titleColor", false);
        pluginGeneratedSerialDescriptor.l("subtitle", false);
        pluginGeneratedSerialDescriptor.l("subtitleColor", false);
        pluginGeneratedSerialDescriptor.l("thumbnailBackgroundColor", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GiftEmbed$Resolved$Invalid$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f26230a;
        m0 m0Var = m0.f26305a;
        return new KSerializer[]{a2Var, m0Var, m0Var, m0Var, a2Var, a2Var, m0Var, a2Var, m0Var, m0Var};
    }

    @Override 
    public GiftEmbed.Resolved.Invalid deserialize(Decoder decoder) {
        int i10;
        int i11;
        String str;
        int i12;
        String str2;
        String str3;
        int i13;
        int i14;
        int i15;
        String str4;
        int i16;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        int i17 = 0;
        if (c10.y()) {
            str4 = c10.t(descriptor2, 0);
            i15 = c10.k(descriptor2, 1);
            i14 = c10.k(descriptor2, 2);
            i13 = c10.k(descriptor2, 3);
            str3 = c10.t(descriptor2, 4);
            str2 = c10.t(descriptor2, 5);
            i12 = c10.k(descriptor2, 6);
            str = c10.t(descriptor2, 7);
            i11 = c10.k(descriptor2, 8);
            i10 = c10.k(descriptor2, 9);
            i16 = 1023;
        } else {
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            boolean z10 = true;
            int i18 = 0;
            int i19 = 0;
            i13 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (z10) {
                int x10 = c10.x(descriptor2);
                switch (x10) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        str5 = c10.t(descriptor2, 0);
                        i17 |= 1;
                        continue;
                    case 1:
                        i22 = c10.k(descriptor2, 1);
                        i17 |= 2;
                        continue;
                    case 2:
                        i21 = c10.k(descriptor2, 2);
                        i17 |= 4;
                        break;
                    case 3:
                        i13 = c10.k(descriptor2, 3);
                        i17 |= 8;
                        break;
                    case 4:
                        str8 = c10.t(descriptor2, 4);
                        i17 |= 16;
                        break;
                    case 5:
                        str7 = c10.t(descriptor2, 5);
                        i17 |= 32;
                        break;
                    case 6:
                        i19 = c10.k(descriptor2, 6);
                        i17 |= 64;
                        break;
                    case 7:
                        str6 = c10.t(descriptor2, 7);
                        i17 |= 128;
                        break;
                    case 8:
                        i20 = c10.k(descriptor2, 8);
                        i17 |= 256;
                        break;
                    case 9:
                        i18 = c10.k(descriptor2, 9);
                        i17 |= 512;
                        break;
                    default:
                        throw new n(x10);
                }
            }
            i10 = i18;
            i11 = i20;
            str3 = str8;
            i16 = i17;
            str2 = str7;
            i14 = i21;
            i12 = i19;
            i15 = i22;
            str = str6;
            str4 = str5;
        }
        c10.b(descriptor2);
        return new GiftEmbed.Resolved.Invalid(i16, str4, i15, i14, i13, str3, str2, i12, str, i11, i10, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, GiftEmbed.Resolved.Invalid value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        GiftEmbed.Resolved.Invalid.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
