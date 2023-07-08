package com.discord.notifications.api;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.notifications.api.StickerFormatType;
import com.discord.notifications.api.StickerType;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import com.discord.primitives.StickerId;
import com.discord.primitives.StickerId$$serializer;
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
import qi.a;
import si.a2;
import si.f0;
import si.h;
import si.w0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/notifications/api/Sticker.$serializer", "Lsi/f0;", "Lcom/discord/notifications/api/Sticker;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "notification_api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class Sticker$$serializer implements f0<Sticker> {
    public static final Sticker$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Sticker$$serializer sticker$$serializer = new Sticker$$serializer();
        INSTANCE = sticker$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.notifications.api.Sticker", sticker$$serializer, 9);
        pluginGeneratedSerialDescriptor.l("id", true);
        pluginGeneratedSerialDescriptor.l(ZeroconfModule.KEY_SERVICE_NAME, false);
        pluginGeneratedSerialDescriptor.l("pack_id", true);
        pluginGeneratedSerialDescriptor.l("guild_id", true);
        pluginGeneratedSerialDescriptor.l("description", true);
        pluginGeneratedSerialDescriptor.l("format_type", true);
        pluginGeneratedSerialDescriptor.l("tags", true);
        pluginGeneratedSerialDescriptor.l("type", true);
        pluginGeneratedSerialDescriptor.l("available", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Sticker$$serializer() {
    }

    @Override // si.f0
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f26230a;
        return new KSerializer[]{StickerId$$serializer.INSTANCE, a2Var, a.u(w0.f26346a), a.u(GuildId$$serializer.INSTANCE), a2Var, StickerFormatType.Serializer.INSTANCE, a2Var, StickerType.Serializer.INSTANCE, a.u(h.f26272a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Sticker deserialize(Decoder decoder) {
        Object obj;
        String str;
        Object obj2;
        String str2;
        Object obj3;
        String str3;
        Object obj4;
        int i10;
        Object obj5;
        Object obj6;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        int i11 = 7;
        int i12 = 6;
        Object obj7 = null;
        if (c10.y()) {
            obj6 = c10.m(descriptor2, 0, StickerId$$serializer.INSTANCE, null);
            str3 = c10.t(descriptor2, 1);
            obj = c10.v(descriptor2, 2, w0.f26346a, null);
            obj4 = c10.v(descriptor2, 3, GuildId$$serializer.INSTANCE, null);
            str2 = c10.t(descriptor2, 4);
            obj2 = c10.m(descriptor2, 5, StickerFormatType.Serializer.INSTANCE, null);
            str = c10.t(descriptor2, 6);
            obj5 = c10.m(descriptor2, 7, StickerType.Serializer.INSTANCE, null);
            obj3 = c10.v(descriptor2, 8, h.f26272a, null);
            i10 = 511;
        } else {
            boolean z10 = true;
            int i13 = 0;
            obj3 = null;
            Object obj8 = null;
            obj2 = null;
            String str4 = null;
            obj = null;
            Object obj9 = null;
            String str5 = null;
            String str6 = null;
            while (z10) {
                int x10 = c10.x(descriptor2);
                switch (x10) {
                    case -1:
                        z10 = false;
                        i12 = 6;
                        break;
                    case 0:
                        obj7 = c10.m(descriptor2, 0, StickerId$$serializer.INSTANCE, obj7);
                        i13 |= 1;
                        i11 = 7;
                        i12 = 6;
                        break;
                    case 1:
                        str4 = c10.t(descriptor2, 1);
                        i13 |= 2;
                        i11 = 7;
                        break;
                    case 2:
                        obj = c10.v(descriptor2, 2, w0.f26346a, obj);
                        i13 |= 4;
                        i11 = 7;
                        break;
                    case 3:
                        obj9 = c10.v(descriptor2, 3, GuildId$$serializer.INSTANCE, obj9);
                        i13 |= 8;
                        i11 = 7;
                        continue;
                    case 4:
                        str5 = c10.t(descriptor2, 4);
                        i13 |= 16;
                        break;
                    case 5:
                        obj2 = c10.m(descriptor2, 5, StickerFormatType.Serializer.INSTANCE, obj2);
                        i13 |= 32;
                        break;
                    case 6:
                        str6 = c10.t(descriptor2, i12);
                        i13 |= 64;
                        break;
                    case 7:
                        obj8 = c10.m(descriptor2, i11, StickerType.Serializer.INSTANCE, obj8);
                        i13 |= 128;
                        break;
                    case 8:
                        obj3 = c10.v(descriptor2, 8, h.f26272a, obj3);
                        i13 |= 256;
                        break;
                    default:
                        throw new n(x10);
                }
            }
            i10 = i13;
            obj5 = obj8;
            obj6 = obj7;
            str3 = str4;
            obj4 = obj9;
            str2 = str5;
            str = str6;
        }
        c10.b(descriptor2);
        return new Sticker(i10, (StickerId) obj6, str3, (Long) obj, (GuildId) obj4, str2, (StickerFormatType) obj2, str, (StickerType) obj5, (Boolean) obj3, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, pi.h, kotlinx.serialization.DeserializationStrategy
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

    @Override // si.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
