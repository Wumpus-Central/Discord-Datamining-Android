package com.discord.chat.bridge.embed;

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

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/embed/EmbedThumbnail.$serializer", "Lyj/f0;", "Lcom/discord/chat/bridge/embed/EmbedThumbnail;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class EmbedThumbnail$$serializer implements f0<EmbedThumbnail> {
    public static final EmbedThumbnail$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        EmbedThumbnail$$serializer embedThumbnail$$serializer = new EmbedThumbnail$$serializer();
        INSTANCE = embedThumbnail$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.embed.EmbedThumbnail", embedThumbnail$$serializer, 8);
        pluginGeneratedSerialDescriptor.l("url", false);
        pluginGeneratedSerialDescriptor.l("proxyURL", true);
        pluginGeneratedSerialDescriptor.l("videoUrl", true);
        pluginGeneratedSerialDescriptor.l("height", false);
        pluginGeneratedSerialDescriptor.l("width", false);
        pluginGeneratedSerialDescriptor.l("gifv", true);
        pluginGeneratedSerialDescriptor.l("showPlayButton", true);
        pluginGeneratedSerialDescriptor.l("embedUrl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EmbedThumbnail$$serializer() {
    }

    @Override // yj.f0
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f32925a;
        m0 m0Var = m0.f33000a;
        h hVar = h.f32967a;
        return new KSerializer[]{a2Var, a.u(a2Var), a.u(a2Var), m0Var, m0Var, a.u(hVar), a.u(hVar), a2Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public EmbedThumbnail deserialize(Decoder decoder) {
        String str;
        int i10;
        int i11;
        String str2;
        int i12;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        int i13 = 7;
        if (b10.p()) {
            str2 = b10.m(descriptor2, 0);
            a2 a2Var = a2.f32925a;
            obj = b10.n(descriptor2, 1, a2Var, null);
            obj2 = b10.n(descriptor2, 2, a2Var, null);
            i11 = b10.i(descriptor2, 3);
            i10 = b10.i(descriptor2, 4);
            h hVar = h.f32967a;
            obj3 = b10.n(descriptor2, 5, hVar, null);
            obj4 = b10.n(descriptor2, 6, hVar, null);
            str = b10.m(descriptor2, 7);
            i12 = 255;
        } else {
            boolean z10 = true;
            int i14 = 0;
            int i15 = 0;
            Object obj5 = null;
            String str3 = null;
            Object obj6 = null;
            Object obj7 = null;
            String str4 = null;
            Object obj8 = null;
            int i16 = 0;
            while (z10) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        str3 = b10.m(descriptor2, 0);
                        i15 |= 1;
                        i13 = 7;
                        break;
                    case 1:
                        obj6 = b10.n(descriptor2, 1, a2.f32925a, obj6);
                        i15 |= 2;
                        i13 = 7;
                        break;
                    case 2:
                        obj7 = b10.n(descriptor2, 2, a2.f32925a, obj7);
                        i15 |= 4;
                        i13 = 7;
                        continue;
                    case 3:
                        i14 = b10.i(descriptor2, 3);
                        i15 |= 8;
                        break;
                    case 4:
                        i16 = b10.i(descriptor2, 4);
                        i15 |= 16;
                        break;
                    case 5:
                        obj8 = b10.n(descriptor2, 5, h.f32967a, obj8);
                        i15 |= 32;
                        break;
                    case 6:
                        obj5 = b10.n(descriptor2, 6, h.f32967a, obj5);
                        i15 |= 64;
                        break;
                    case 7:
                        str4 = b10.m(descriptor2, i13);
                        i15 |= 128;
                        break;
                    default:
                        throw new n(o10);
                }
            }
            obj4 = obj5;
            obj3 = obj8;
            i12 = i15;
            obj = obj6;
            obj2 = obj7;
            str = str4;
            i11 = i14;
            i10 = i16;
            str2 = str3;
        }
        b10.c(descriptor2);
        return new EmbedThumbnail(i12, str2, (String) obj, (String) obj2, i11, i10, (Boolean) obj3, (Boolean) obj4, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, vj.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, EmbedThumbnail value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        EmbedThumbnail.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // yj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
