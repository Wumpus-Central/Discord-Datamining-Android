package com.discord.chat.bridge.gift;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.gift.GiftEmbed;
import com.facebook.react.uimanager.ViewProps;
import j$.util.Spliterator;
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
import vj.n;
import wj.a;
import yj.a2;
import yj.e0;
import yj.f0;
import yj.h;
import yj.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/gift/GiftEmbed.Resolved.Valid.$serializer", "Lyj/f0;", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class GiftEmbed$Resolved$Valid$$serializer implements f0<GiftEmbed.Resolved.Valid> {
    public static final GiftEmbed$Resolved$Valid$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        GiftEmbed$Resolved$Valid$$serializer giftEmbed$Resolved$Valid$$serializer = new GiftEmbed$Resolved$Valid$$serializer();
        INSTANCE = giftEmbed$Resolved$Valid$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.gift.GiftEmbed.Resolved.Valid", giftEmbed$Resolved$Valid$$serializer, 18);
        pluginGeneratedSerialDescriptor.l("headerText", false);
        pluginGeneratedSerialDescriptor.l("headerColor", false);
        pluginGeneratedSerialDescriptor.l(ViewProps.BACKGROUND_COLOR, false);
        pluginGeneratedSerialDescriptor.l("thumbnailCornerRadius", false);
        pluginGeneratedSerialDescriptor.l("thumbnailUrl", true);
        pluginGeneratedSerialDescriptor.l("titleText", true);
        pluginGeneratedSerialDescriptor.l("titleColor", false);
        pluginGeneratedSerialDescriptor.l("subtitle", true);
        pluginGeneratedSerialDescriptor.l("subtitleColor", false);
        pluginGeneratedSerialDescriptor.l("bodyText", true);
        pluginGeneratedSerialDescriptor.l("bodyTextColor", false);
        pluginGeneratedSerialDescriptor.l("acceptLabelText", true);
        pluginGeneratedSerialDescriptor.l("acceptLabelColor", false);
        pluginGeneratedSerialDescriptor.l("acceptLabelBackgroundColor", false);
        pluginGeneratedSerialDescriptor.l("splashUrl", true);
        pluginGeneratedSerialDescriptor.l("splashOpacity", false);
        pluginGeneratedSerialDescriptor.l("canBeAccepted", false);
        pluginGeneratedSerialDescriptor.l("giftCode", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GiftEmbed$Resolved$Valid$$serializer() {
    }

    @Override // yj.f0
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f32924a;
        m0 m0Var = m0.f32999a;
        return new KSerializer[]{a2Var, m0Var, m0Var, m0Var, a.u(a2Var), a.u(a2Var), m0Var, a.u(a2Var), m0Var, a.u(a2Var), m0Var, a.u(a2Var), m0Var, m0Var, a.u(a2Var), e0.f32949a, h.f32966a, a2Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public GiftEmbed.Resolved.Valid deserialize(Decoder decoder) {
        String str;
        boolean z10;
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String str2;
        int i18;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        char c10;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        int i19 = 8;
        if (b10.p()) {
            str2 = b10.m(descriptor2, 0);
            i17 = b10.i(descriptor2, 1);
            i16 = b10.i(descriptor2, 2);
            i15 = b10.i(descriptor2, 3);
            a2 a2Var = a2.f32924a;
            obj4 = b10.n(descriptor2, 4, a2Var, null);
            obj5 = b10.n(descriptor2, 5, a2Var, null);
            i14 = b10.i(descriptor2, 6);
            obj = b10.n(descriptor2, 7, a2Var, null);
            i13 = b10.i(descriptor2, 8);
            obj2 = b10.n(descriptor2, 9, a2Var, null);
            i12 = b10.i(descriptor2, 10);
            obj3 = b10.n(descriptor2, 11, a2Var, null);
            i11 = b10.i(descriptor2, 12);
            i10 = b10.i(descriptor2, 13);
            obj6 = b10.n(descriptor2, 14, a2Var, null);
            f10 = b10.u(descriptor2, 15);
            z10 = b10.C(descriptor2, 16);
            str = b10.m(descriptor2, 17);
            i18 = 262143;
        } else {
            int i20 = 17;
            float f11 = 0.0f;
            boolean z11 = true;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            String str3 = null;
            String str4 = null;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            boolean z12 = false;
            int i28 = 0;
            int i29 = 0;
            obj4 = null;
            while (z11) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z11 = false;
                        i19 = 8;
                    case 0:
                        str3 = b10.m(descriptor2, 0);
                        i21 |= 1;
                        i19 = 8;
                        i20 = 17;
                    case 1:
                        i23 = b10.i(descriptor2, 1);
                        i21 |= 2;
                        i19 = 8;
                        i20 = 17;
                    case 2:
                        i22 = b10.i(descriptor2, 2);
                        i21 |= 4;
                        i19 = 8;
                        i20 = 17;
                    case 3:
                        i24 = b10.i(descriptor2, 3);
                        i21 |= 8;
                        i19 = 8;
                        i20 = 17;
                    case 4:
                        obj4 = b10.n(descriptor2, 4, a2.f32924a, obj4);
                        i21 |= 16;
                        i19 = 8;
                        i20 = 17;
                    case 5:
                        obj7 = b10.n(descriptor2, 5, a2.f32924a, obj7);
                        i21 |= 32;
                        i19 = 8;
                        i20 = 17;
                    case 6:
                        c10 = 7;
                        i27 = b10.i(descriptor2, 6);
                        i21 |= 64;
                        i19 = 8;
                        i20 = 17;
                    case 7:
                        c10 = 7;
                        obj8 = b10.n(descriptor2, 7, a2.f32924a, obj8);
                        i21 |= 128;
                        i19 = 8;
                        i20 = 17;
                    case 8:
                        i28 = b10.i(descriptor2, i19);
                        i21 |= Spliterator.NONNULL;
                        i20 = 17;
                    case 9:
                        obj10 = b10.n(descriptor2, 9, a2.f32924a, obj10);
                        i21 |= 512;
                        i19 = 8;
                        i20 = 17;
                    case 10:
                        i26 = b10.i(descriptor2, 10);
                        i21 |= Spliterator.IMMUTABLE;
                        i19 = 8;
                        i20 = 17;
                    case 11:
                        obj11 = b10.n(descriptor2, 11, a2.f32924a, obj11);
                        i21 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        i19 = 8;
                        i20 = 17;
                    case 12:
                        i25 = b10.i(descriptor2, 12);
                        i21 |= 4096;
                        i19 = 8;
                        i20 = 17;
                    case 13:
                        i29 = b10.i(descriptor2, 13);
                        i21 |= 8192;
                        i19 = 8;
                        i20 = 17;
                    case 14:
                        obj9 = b10.n(descriptor2, 14, a2.f32924a, obj9);
                        i21 |= Spliterator.SUBSIZED;
                        i19 = 8;
                        i20 = 17;
                    case 15:
                        f11 = b10.u(descriptor2, 15);
                        i21 |= 32768;
                        i20 = 17;
                    case 16:
                        z12 = b10.C(descriptor2, 16);
                        i21 |= 65536;
                    case 17:
                        str4 = b10.m(descriptor2, i20);
                        i21 |= 131072;
                    default:
                        throw new n(o10);
                }
            }
            obj5 = obj7;
            obj = obj8;
            i10 = i29;
            obj6 = obj9;
            obj2 = obj10;
            obj3 = obj11;
            i16 = i22;
            i17 = i23;
            i15 = i24;
            f10 = f11;
            str2 = str3;
            i11 = i25;
            str = str4;
            i12 = i26;
            i14 = i27;
            z10 = z12;
            i18 = i21;
            i13 = i28;
        }
        b10.c(descriptor2);
        return new GiftEmbed.Resolved.Valid(i18, str2, i17, i16, i15, (String) obj4, (String) obj5, i14, (String) obj, i13, (String) obj2, i12, (String) obj3, i11, i10, (String) obj6, f10, z10, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, vj.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, GiftEmbed.Resolved.Valid value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        GiftEmbed.Resolved.Valid.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // yj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
