package com.discord.chat.bridge.sticker;

import bj.AbstractC3644f0;
import bj.C3622a2;
import bj.C3676m0;
import bj.C3710w0;
import com.discord.chat.bridge.sticker.StickerFormatType;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p449yi.C14447n;
import p469zi.C14667a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/sticker/Sticker.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/sticker/Sticker;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class Sticker$$serializer implements AbstractC3644f0<Sticker> {
    public static final Sticker$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Sticker$$serializer sticker$$serializer = new Sticker$$serializer();
        INSTANCE = sticker$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.sticker.Sticker", sticker$$serializer, 8);
        pluginGeneratedSerialDescriptor.m13841l("id", false);
        pluginGeneratedSerialDescriptor.m13841l("format_type", false);
        pluginGeneratedSerialDescriptor.m13841l("name", false);
        pluginGeneratedSerialDescriptor.m13841l("asset", false);
        pluginGeneratedSerialDescriptor.m13841l("url", false);
        pluginGeneratedSerialDescriptor.m13841l("width", true);
        pluginGeneratedSerialDescriptor.m13841l("height", true);
        pluginGeneratedSerialDescriptor.m13841l("renderMode", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Sticker$$serializer() {
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] childSerializers() {
        C3622a2 a2Var = C3622a2.f5917a;
        C3676m0 m0Var = C3676m0.f5992a;
        return new KSerializer[]{C3710w0.f6033a, StickerFormatType.StickerFormatTypeSerializer.INSTANCE, a2Var, a2Var, a2Var, C14667a.m13u(m0Var), C14667a.m13u(m0Var), m0Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Sticker deserialize(Decoder decoder) {
        String str;
        String str2;
        int i;
        Object obj;
        Object obj2;
        String str3;
        long j;
        int i2;
        Object obj3;
        C9971q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC10248c b = decoder.mo13905b(descriptor2);
        int i3 = 7;
        int i4 = 6;
        if (b.mo13850p()) {
            j = b.mo13856f(descriptor2, 0);
            obj3 = b.mo13847y(descriptor2, 1, StickerFormatType.StickerFormatTypeSerializer.INSTANCE, null);
            str3 = b.mo13853m(descriptor2, 2);
            str2 = b.mo13853m(descriptor2, 3);
            str = b.mo13853m(descriptor2, 4);
            C3676m0 m0Var = C3676m0.f5992a;
            obj = b.mo13852n(descriptor2, 5, m0Var, null);
            obj2 = b.mo13852n(descriptor2, 6, m0Var, null);
            i = b.mo13855i(descriptor2, 7);
            i2 = 255;
        } else {
            long j2 = 0;
            boolean z = true;
            int i5 = 0;
            obj2 = null;
            str2 = null;
            str = null;
            Object obj4 = null;
            String str4 = null;
            obj = null;
            int i6 = 0;
            while (z) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        i3 = 7;
                        break;
                    case 0:
                        j2 = b.mo13856f(descriptor2, 0);
                        i6 |= 1;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 1:
                        obj4 = b.mo13847y(descriptor2, 1, StickerFormatType.StickerFormatTypeSerializer.INSTANCE, obj4);
                        i6 |= 2;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 2:
                        str4 = b.mo13853m(descriptor2, 2);
                        i6 |= 4;
                        break;
                    case 3:
                        str2 = b.mo13853m(descriptor2, 3);
                        i6 |= 8;
                        break;
                    case 4:
                        str = b.mo13853m(descriptor2, 4);
                        i6 |= 16;
                        break;
                    case 5:
                        obj = b.mo13852n(descriptor2, 5, C3676m0.f5992a, obj);
                        i6 |= 32;
                        break;
                    case 6:
                        obj2 = b.mo13852n(descriptor2, i4, C3676m0.f5992a, obj2);
                        i6 |= 64;
                        break;
                    case 7:
                        i5 = b.mo13855i(descriptor2, i3);
                        i6 |= 128;
                        break;
                    default:
                        throw new C14447n(o);
                }
            }
            i2 = i6;
            str3 = str4;
            j = j2;
            i = i5;
            obj3 = obj4;
        }
        b.mo13857c(descriptor2);
        return new Sticker(i2, j, (StickerFormatType) obj3, str3, str2, str, (Integer) obj, (Integer) obj2, i, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, Sticker value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        Sticker.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC3644f0.C3645a.m33897a(this);
    }
}
