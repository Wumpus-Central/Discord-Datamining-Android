package com.discord.chat.bridge.gift;

import bj.AbstractC3644f0;
import bj.C3622a2;
import bj.C3676m0;
import com.discord.chat.bridge.gift.GiftEmbed;
import com.facebook.react.uimanager.ViewProps;
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

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/gift/GiftEmbed.Resolving.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolving;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class GiftEmbed$Resolving$$serializer implements AbstractC3644f0<GiftEmbed.Resolving> {
    public static final GiftEmbed$Resolving$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        GiftEmbed$Resolving$$serializer giftEmbed$Resolving$$serializer = new GiftEmbed$Resolving$$serializer();
        INSTANCE = giftEmbed$Resolving$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.gift.GiftEmbed.Resolving", giftEmbed$Resolving$$serializer, 6);
        pluginGeneratedSerialDescriptor.m13841l("headerText", false);
        pluginGeneratedSerialDescriptor.m13841l("headerColor", false);
        pluginGeneratedSerialDescriptor.m13841l(ViewProps.BACKGROUND_COLOR, false);
        pluginGeneratedSerialDescriptor.m13841l("thumbnailCornerRadius", false);
        pluginGeneratedSerialDescriptor.m13841l("resolvingGradientStart", false);
        pluginGeneratedSerialDescriptor.m13841l("resolvingGradientEnd", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GiftEmbed$Resolving$$serializer() {
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] childSerializers() {
        C3676m0 m0Var = C3676m0.f5992a;
        return new KSerializer[]{C3622a2.f5917a, m0Var, m0Var, m0Var, m0Var, m0Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public GiftEmbed.Resolving deserialize(Decoder decoder) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        C9971q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC10248c b = decoder.mo13905b(descriptor2);
        if (b.mo13850p()) {
            str = b.mo13853m(descriptor2, 0);
            i5 = b.mo13855i(descriptor2, 1);
            i4 = b.mo13855i(descriptor2, 2);
            i3 = b.mo13855i(descriptor2, 3);
            i2 = b.mo13855i(descriptor2, 4);
            i = b.mo13855i(descriptor2, 5);
            i6 = 63;
        } else {
            String str2 = null;
            boolean z = true;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (z) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        str2 = b.mo13853m(descriptor2, 0);
                        i12 |= 1;
                        continue;
                    case 1:
                        i11 = b.mo13855i(descriptor2, 1);
                        i12 |= 2;
                        break;
                    case 2:
                        i10 = b.mo13855i(descriptor2, 2);
                        i12 |= 4;
                        break;
                    case 3:
                        i8 = b.mo13855i(descriptor2, 3);
                        i12 |= 8;
                        break;
                    case 4:
                        i9 = b.mo13855i(descriptor2, 4);
                        i12 |= 16;
                        break;
                    case 5:
                        i7 = b.mo13855i(descriptor2, 5);
                        i12 |= 32;
                        break;
                    default:
                        throw new C14447n(o);
                }
            }
            i = i7;
            i2 = i9;
            str = str2;
            i3 = i8;
            i6 = i12;
            i4 = i10;
            i5 = i11;
        }
        b.mo13857c(descriptor2);
        return new GiftEmbed.Resolving(i6, str, i5, i4, i3, i2, i, null);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, GiftEmbed.Resolving value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        GiftEmbed.Resolving.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC3644f0.C3645a.m33897a(this);
    }
}
