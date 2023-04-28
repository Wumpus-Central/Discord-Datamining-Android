package com.discord.chat.bridge.embed;

import bj.AbstractC3644f0;
import bj.C3622a2;
import bj.C3652h;
import bj.C3676m0;
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
import p469zi.C14667a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/embed/EmbedThumbnail.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/embed/EmbedThumbnail;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class EmbedThumbnail$$serializer implements AbstractC3644f0<EmbedThumbnail> {
    public static final EmbedThumbnail$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        EmbedThumbnail$$serializer embedThumbnail$$serializer = new EmbedThumbnail$$serializer();
        INSTANCE = embedThumbnail$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.embed.EmbedThumbnail", embedThumbnail$$serializer, 8);
        pluginGeneratedSerialDescriptor.m13841l("url", false);
        pluginGeneratedSerialDescriptor.m13841l("proxyURL", true);
        pluginGeneratedSerialDescriptor.m13841l("videoUrl", true);
        pluginGeneratedSerialDescriptor.m13841l("height", false);
        pluginGeneratedSerialDescriptor.m13841l("width", false);
        pluginGeneratedSerialDescriptor.m13841l("gifv", true);
        pluginGeneratedSerialDescriptor.m13841l("showPlayButton", true);
        pluginGeneratedSerialDescriptor.m13841l("embedUrl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EmbedThumbnail$$serializer() {
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] childSerializers() {
        C3622a2 a2Var = C3622a2.f5917a;
        C3676m0 m0Var = C3676m0.f5992a;
        C3652h hVar = C3652h.f5959a;
        return new KSerializer[]{a2Var, C14667a.m13u(a2Var), C14667a.m13u(a2Var), m0Var, m0Var, C14667a.m13u(hVar), C14667a.m13u(hVar), a2Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public EmbedThumbnail deserialize(Decoder decoder) {
        String str;
        int i;
        int i2;
        String str2;
        int i3;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        C9971q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC10248c b = decoder.mo13905b(descriptor2);
        int i4 = 7;
        if (b.mo13850p()) {
            str2 = b.mo13853m(descriptor2, 0);
            C3622a2 a2Var = C3622a2.f5917a;
            obj = b.mo13852n(descriptor2, 1, a2Var, null);
            obj2 = b.mo13852n(descriptor2, 2, a2Var, null);
            i2 = b.mo13855i(descriptor2, 3);
            i = b.mo13855i(descriptor2, 4);
            C3652h hVar = C3652h.f5959a;
            obj3 = b.mo13852n(descriptor2, 5, hVar, null);
            obj4 = b.mo13852n(descriptor2, 6, hVar, null);
            str = b.mo13853m(descriptor2, 7);
            i3 = 255;
        } else {
            boolean z = true;
            int i5 = 0;
            int i6 = 0;
            Object obj5 = null;
            String str3 = null;
            Object obj6 = null;
            Object obj7 = null;
            String str4 = null;
            Object obj8 = null;
            int i7 = 0;
            while (z) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        str3 = b.mo13853m(descriptor2, 0);
                        i6 |= 1;
                        i4 = 7;
                        break;
                    case 1:
                        obj6 = b.mo13852n(descriptor2, 1, C3622a2.f5917a, obj6);
                        i6 |= 2;
                        i4 = 7;
                        break;
                    case 2:
                        obj7 = b.mo13852n(descriptor2, 2, C3622a2.f5917a, obj7);
                        i6 |= 4;
                        i4 = 7;
                        continue;
                    case 3:
                        i5 = b.mo13855i(descriptor2, 3);
                        i6 |= 8;
                        break;
                    case 4:
                        i7 = b.mo13855i(descriptor2, 4);
                        i6 |= 16;
                        break;
                    case 5:
                        obj8 = b.mo13852n(descriptor2, 5, C3652h.f5959a, obj8);
                        i6 |= 32;
                        break;
                    case 6:
                        obj5 = b.mo13852n(descriptor2, 6, C3652h.f5959a, obj5);
                        i6 |= 64;
                        break;
                    case 7:
                        str4 = b.mo13853m(descriptor2, i4);
                        i6 |= 128;
                        break;
                    default:
                        throw new C14447n(o);
                }
            }
            obj4 = obj5;
            obj3 = obj8;
            i3 = i6;
            obj = obj6;
            obj2 = obj7;
            str = str4;
            i2 = i5;
            i = i7;
            str2 = str3;
        }
        b.mo13857c(descriptor2);
        return new EmbedThumbnail(i3, str2, (String) obj, (String) obj2, i2, i, (Boolean) obj3, (Boolean) obj4, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, EmbedThumbnail value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        EmbedThumbnail.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC3644f0.C3645a.m33897a(this);
    }
}
