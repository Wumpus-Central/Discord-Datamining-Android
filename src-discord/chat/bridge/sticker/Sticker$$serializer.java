package com.discord.chat.bridge.sticker;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.chat.bridge.sticker.StickerFormatType;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import pi.n;
import qi.a;
import si.a2;
import si.f0;
import si.m0;
import si.w0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/sticker/Sticker.$serializer", "Lsi/f0;", "Lcom/discord/chat/bridge/sticker/Sticker;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class Sticker$$serializer implements f0<Sticker> {
    public static final Sticker$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        Sticker$$serializer sticker$$serializer = new Sticker$$serializer();
        INSTANCE = sticker$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.sticker.Sticker", sticker$$serializer, 8);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l("format_type", false);
        pluginGeneratedSerialDescriptor.l(ZeroconfModule.KEY_SERVICE_NAME, false);
        pluginGeneratedSerialDescriptor.l("asset", false);
        pluginGeneratedSerialDescriptor.l("url", false);
        pluginGeneratedSerialDescriptor.l("width", true);
        pluginGeneratedSerialDescriptor.l("height", true);
        pluginGeneratedSerialDescriptor.l("renderMode", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Sticker$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f26230a;
        m0 m0Var = m0.f26305a;
        return new KSerializer[]{w0.f26346a, StickerFormatType.StickerFormatTypeSerializer.INSTANCE, a2Var, a2Var, a2Var, a.u(m0Var), a.u(m0Var), m0Var};
    }

    @Override 
    public Sticker deserialize(Decoder decoder) {
        String str;
        String str2;
        int i10;
        Object obj;
        Object obj2;
        String str3;
        long j10;
        int i11;
        Object obj3;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        int i12 = 7;
        int i13 = 6;
        if (c10.y()) {
            j10 = c10.h(descriptor2, 0);
            obj3 = c10.m(descriptor2, 1, StickerFormatType.StickerFormatTypeSerializer.INSTANCE, null);
            str3 = c10.t(descriptor2, 2);
            str2 = c10.t(descriptor2, 3);
            str = c10.t(descriptor2, 4);
            m0 m0Var = m0.f26305a;
            obj = c10.v(descriptor2, 5, m0Var, null);
            obj2 = c10.v(descriptor2, 6, m0Var, null);
            i10 = c10.k(descriptor2, 7);
            i11 = 255;
        } else {
            long j11 = 0;
            boolean z10 = true;
            int i14 = 0;
            obj2 = null;
            str2 = null;
            str = null;
            Object obj4 = null;
            String str4 = null;
            obj = null;
            int i15 = 0;
            while (z10) {
                int x10 = c10.x(descriptor2);
                switch (x10) {
                    case -1:
                        z10 = false;
                        i12 = 7;
                        break;
                    case 0:
                        j11 = c10.h(descriptor2, 0);
                        i15 |= 1;
                        i12 = 7;
                        i13 = 6;
                        break;
                    case 1:
                        obj4 = c10.m(descriptor2, 1, StickerFormatType.StickerFormatTypeSerializer.INSTANCE, obj4);
                        i15 |= 2;
                        i12 = 7;
                        i13 = 6;
                        break;
                    case 2:
                        str4 = c10.t(descriptor2, 2);
                        i15 |= 4;
                        break;
                    case 3:
                        str2 = c10.t(descriptor2, 3);
                        i15 |= 8;
                        break;
                    case 4:
                        str = c10.t(descriptor2, 4);
                        i15 |= 16;
                        break;
                    case 5:
                        obj = c10.v(descriptor2, 5, m0.f26305a, obj);
                        i15 |= 32;
                        break;
                    case 6:
                        obj2 = c10.v(descriptor2, i13, m0.f26305a, obj2);
                        i15 |= 64;
                        break;
                    case 7:
                        i14 = c10.k(descriptor2, i12);
                        i15 |= 128;
                        break;
                    default:
                        throw new n(x10);
                }
            }
            i11 = i15;
            str3 = str4;
            j10 = j11;
            i10 = i14;
            obj3 = obj4;
        }
        c10.b(descriptor2);
        return new Sticker(i11, j10, (StickerFormatType) obj3, str3, str2, str, (Integer) obj, (Integer) obj2, i10, (SerializationConstructorMarker) null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, Sticker value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        Sticker.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
