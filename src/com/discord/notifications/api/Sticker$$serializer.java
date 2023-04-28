package com.discord.notifications.api;

import bj.AbstractC2522f0;
import bj.C2500a2;
import bj.C2530h;
import bj.C2589w0;
import com.discord.notifications.api.StickerFormatType;
import com.discord.notifications.api.StickerType;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import com.discord.primitives.StickerId;
import com.discord.primitives.StickerId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC9967c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p164j$.util.Spliterator;
import p450yi.C14382n;
import p470zi.C14606a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/notifications/api/Sticker.$serializer", "Lbj/f0;", "Lcom/discord/notifications/api/Sticker;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "notification_api_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class Sticker$$serializer implements AbstractC2522f0<Sticker> {
    public static final Sticker$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Sticker$$serializer sticker$$serializer = new Sticker$$serializer();
        INSTANCE = sticker$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.notifications.api.Sticker", sticker$$serializer, 9);
        pluginGeneratedSerialDescriptor.m13841l("id", true);
        pluginGeneratedSerialDescriptor.m13841l("name", false);
        pluginGeneratedSerialDescriptor.m13841l("pack_id", true);
        pluginGeneratedSerialDescriptor.m13841l("guild_id", true);
        pluginGeneratedSerialDescriptor.m13841l("description", true);
        pluginGeneratedSerialDescriptor.m13841l("format_type", true);
        pluginGeneratedSerialDescriptor.m13841l("tags", true);
        pluginGeneratedSerialDescriptor.m13841l("type", true);
        pluginGeneratedSerialDescriptor.m13841l("available", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Sticker$$serializer() {
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] childSerializers() {
        C2500a2 a2Var = C2500a2.f6719a;
        return new KSerializer[]{StickerId$$serializer.INSTANCE, a2Var, C14606a.m13u(C2589w0.f6835a), C14606a.m13u(GuildId$$serializer.INSTANCE), a2Var, StickerFormatType.Serializer.INSTANCE, a2Var, StickerType.Serializer.INSTANCE, C14606a.m13u(C2530h.f6761a)};
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
        int i;
        Object obj5;
        Object obj6;
        C9677q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC9967c b = decoder.mo13905b(descriptor2);
        int i2 = 7;
        int i3 = 6;
        Object obj7 = null;
        if (b.mo13850p()) {
            obj6 = b.mo13847y(descriptor2, 0, StickerId$$serializer.INSTANCE, null);
            str3 = b.mo13853m(descriptor2, 1);
            obj = b.mo13852n(descriptor2, 2, C2589w0.f6835a, null);
            obj4 = b.mo13852n(descriptor2, 3, GuildId$$serializer.INSTANCE, null);
            str2 = b.mo13853m(descriptor2, 4);
            obj2 = b.mo13847y(descriptor2, 5, StickerFormatType.Serializer.INSTANCE, null);
            str = b.mo13853m(descriptor2, 6);
            obj5 = b.mo13847y(descriptor2, 7, StickerType.Serializer.INSTANCE, null);
            obj3 = b.mo13852n(descriptor2, 8, C2530h.f6761a, null);
            i = 511;
        } else {
            boolean z = true;
            int i4 = 0;
            obj3 = null;
            Object obj8 = null;
            obj2 = null;
            String str4 = null;
            obj = null;
            Object obj9 = null;
            String str5 = null;
            String str6 = null;
            while (z) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        i3 = 6;
                        break;
                    case 0:
                        obj7 = b.mo13847y(descriptor2, 0, StickerId$$serializer.INSTANCE, obj7);
                        i4 |= 1;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 1:
                        str4 = b.mo13853m(descriptor2, 1);
                        i4 |= 2;
                        i2 = 7;
                        break;
                    case 2:
                        obj = b.mo13852n(descriptor2, 2, C2589w0.f6835a, obj);
                        i4 |= 4;
                        i2 = 7;
                        break;
                    case 3:
                        obj9 = b.mo13852n(descriptor2, 3, GuildId$$serializer.INSTANCE, obj9);
                        i4 |= 8;
                        i2 = 7;
                        continue;
                    case 4:
                        str5 = b.mo13853m(descriptor2, 4);
                        i4 |= 16;
                        break;
                    case 5:
                        obj2 = b.mo13847y(descriptor2, 5, StickerFormatType.Serializer.INSTANCE, obj2);
                        i4 |= 32;
                        break;
                    case 6:
                        str6 = b.mo13853m(descriptor2, i3);
                        i4 |= 64;
                        break;
                    case 7:
                        obj8 = b.mo13847y(descriptor2, i2, StickerType.Serializer.INSTANCE, obj8);
                        i4 |= 128;
                        break;
                    case 8:
                        obj3 = b.mo13852n(descriptor2, 8, C2530h.f6761a, obj3);
                        i4 |= Spliterator.NONNULL;
                        break;
                    default:
                        throw new C14382n(o);
                }
            }
            i = i4;
            obj5 = obj8;
            obj6 = obj7;
            str3 = str4;
            obj4 = obj9;
            str2 = str5;
            str = str6;
        }
        b.mo13857c(descriptor2);
        return new Sticker(i, (StickerId) obj6, str3, (Long) obj, (GuildId) obj4, str2, (StickerFormatType) obj2, str, (StickerType) obj5, (Boolean) obj3, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, Sticker value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        Sticker.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC2522f0.C2523a.m33897a(this);
    }
}
