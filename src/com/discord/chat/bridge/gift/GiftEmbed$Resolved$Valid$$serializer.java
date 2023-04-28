package com.discord.chat.bridge.gift;

import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC2522f0;
import bj.C2500a2;
import bj.C2518e0;
import bj.C2530h;
import bj.C2555m0;
import com.discord.chat.bridge.gift.GiftEmbed;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC9967c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p164j$.util.Spliterator;
import p450yi.C14382n;
import p470zi.C14606a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/gift/GiftEmbed.Resolved.Valid.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class GiftEmbed$Resolved$Valid$$serializer implements AbstractC2522f0<GiftEmbed.Resolved.Valid> {
    public static final GiftEmbed$Resolved$Valid$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        GiftEmbed$Resolved$Valid$$serializer giftEmbed$Resolved$Valid$$serializer = new GiftEmbed$Resolved$Valid$$serializer();
        INSTANCE = giftEmbed$Resolved$Valid$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.gift.GiftEmbed.Resolved.Valid", giftEmbed$Resolved$Valid$$serializer, 18);
        pluginGeneratedSerialDescriptor.m13841l("headerText", false);
        pluginGeneratedSerialDescriptor.m13841l("headerColor", false);
        pluginGeneratedSerialDescriptor.m13841l(ViewProps.BACKGROUND_COLOR, false);
        pluginGeneratedSerialDescriptor.m13841l("thumbnailCornerRadius", false);
        pluginGeneratedSerialDescriptor.m13841l("thumbnailUrl", true);
        pluginGeneratedSerialDescriptor.m13841l("titleText", true);
        pluginGeneratedSerialDescriptor.m13841l("titleColor", false);
        pluginGeneratedSerialDescriptor.m13841l("subtitle", true);
        pluginGeneratedSerialDescriptor.m13841l("subtitleColor", false);
        pluginGeneratedSerialDescriptor.m13841l("bodyText", true);
        pluginGeneratedSerialDescriptor.m13841l("bodyTextColor", false);
        pluginGeneratedSerialDescriptor.m13841l("acceptLabelText", true);
        pluginGeneratedSerialDescriptor.m13841l("acceptLabelColor", false);
        pluginGeneratedSerialDescriptor.m13841l("acceptLabelBackgroundColor", false);
        pluginGeneratedSerialDescriptor.m13841l("splashUrl", true);
        pluginGeneratedSerialDescriptor.m13841l("splashOpacity", false);
        pluginGeneratedSerialDescriptor.m13841l("canBeAccepted", false);
        pluginGeneratedSerialDescriptor.m13841l("giftCode", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GiftEmbed$Resolved$Valid$$serializer() {
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] childSerializers() {
        C2500a2 a2Var = C2500a2.f6719a;
        C2555m0 m0Var = C2555m0.f6794a;
        return new KSerializer[]{a2Var, m0Var, m0Var, m0Var, C14606a.m13u(a2Var), C14606a.m13u(a2Var), m0Var, C14606a.m13u(a2Var), m0Var, C14606a.m13u(a2Var), m0Var, C14606a.m13u(a2Var), m0Var, m0Var, C14606a.m13u(a2Var), C2518e0.f6744a, C2530h.f6761a, a2Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public GiftEmbed.Resolved.Valid deserialize(Decoder decoder) {
        String str;
        boolean z;
        float f;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String str2;
        int i9;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        char c;
        C9677q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC9967c b = decoder.mo13905b(descriptor2);
        int i10 = 8;
        if (b.mo13850p()) {
            str2 = b.mo13853m(descriptor2, 0);
            i8 = b.mo13855i(descriptor2, 1);
            i7 = b.mo13855i(descriptor2, 2);
            i6 = b.mo13855i(descriptor2, 3);
            C2500a2 a2Var = C2500a2.f6719a;
            obj4 = b.mo13852n(descriptor2, 4, a2Var, null);
            obj5 = b.mo13852n(descriptor2, 5, a2Var, null);
            i5 = b.mo13855i(descriptor2, 6);
            obj = b.mo13852n(descriptor2, 7, a2Var, null);
            i4 = b.mo13855i(descriptor2, 8);
            obj2 = b.mo13852n(descriptor2, 9, a2Var, null);
            i3 = b.mo13855i(descriptor2, 10);
            obj3 = b.mo13852n(descriptor2, 11, a2Var, null);
            i2 = b.mo13855i(descriptor2, 12);
            i = b.mo13855i(descriptor2, 13);
            obj6 = b.mo13852n(descriptor2, 14, a2Var, null);
            f = b.mo13848u(descriptor2, 15);
            z = b.mo13861C(descriptor2, 16);
            str = b.mo13853m(descriptor2, 17);
            i9 = 262143;
        } else {
            int i11 = 17;
            float f2 = 0.0f;
            boolean z2 = true;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            String str3 = null;
            String str4 = null;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            boolean z3 = false;
            int i19 = 0;
            int i20 = 0;
            obj4 = null;
            while (z2) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z2 = false;
                        i10 = 8;
                    case 0:
                        str3 = b.mo13853m(descriptor2, 0);
                        i12 |= 1;
                        i10 = 8;
                        i11 = 17;
                    case 1:
                        i14 = b.mo13855i(descriptor2, 1);
                        i12 |= 2;
                        i10 = 8;
                        i11 = 17;
                    case 2:
                        i13 = b.mo13855i(descriptor2, 2);
                        i12 |= 4;
                        i10 = 8;
                        i11 = 17;
                    case 3:
                        i15 = b.mo13855i(descriptor2, 3);
                        i12 |= 8;
                        i10 = 8;
                        i11 = 17;
                    case 4:
                        obj4 = b.mo13852n(descriptor2, 4, C2500a2.f6719a, obj4);
                        i12 |= 16;
                        i10 = 8;
                        i11 = 17;
                    case 5:
                        obj7 = b.mo13852n(descriptor2, 5, C2500a2.f6719a, obj7);
                        i12 |= 32;
                        i10 = 8;
                        i11 = 17;
                    case 6:
                        c = 7;
                        i18 = b.mo13855i(descriptor2, 6);
                        i12 |= 64;
                        i10 = 8;
                        i11 = 17;
                    case 7:
                        c = 7;
                        obj8 = b.mo13852n(descriptor2, 7, C2500a2.f6719a, obj8);
                        i12 |= 128;
                        i10 = 8;
                        i11 = 17;
                    case 8:
                        i19 = b.mo13855i(descriptor2, i10);
                        i12 |= Spliterator.NONNULL;
                        i11 = 17;
                    case 9:
                        obj10 = b.mo13852n(descriptor2, 9, C2500a2.f6719a, obj10);
                        i12 |= 512;
                        i10 = 8;
                        i11 = 17;
                    case 10:
                        i17 = b.mo13855i(descriptor2, 10);
                        i12 |= Spliterator.IMMUTABLE;
                        i10 = 8;
                        i11 = 17;
                    case 11:
                        obj11 = b.mo13852n(descriptor2, 11, C2500a2.f6719a, obj11);
                        i12 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        i10 = 8;
                        i11 = 17;
                    case 12:
                        i16 = b.mo13855i(descriptor2, 12);
                        i12 |= 4096;
                        i10 = 8;
                        i11 = 17;
                    case 13:
                        i20 = b.mo13855i(descriptor2, 13);
                        i12 |= 8192;
                        i10 = 8;
                        i11 = 17;
                    case 14:
                        obj9 = b.mo13852n(descriptor2, 14, C2500a2.f6719a, obj9);
                        i12 |= Spliterator.SUBSIZED;
                        i10 = 8;
                        i11 = 17;
                    case 15:
                        f2 = b.mo13848u(descriptor2, 15);
                        i12 |= 32768;
                        i11 = 17;
                    case 16:
                        z3 = b.mo13861C(descriptor2, 16);
                        i12 |= 65536;
                    case 17:
                        str4 = b.mo13853m(descriptor2, i11);
                        i12 |= 131072;
                    default:
                        throw new C14382n(o);
                }
            }
            obj5 = obj7;
            obj = obj8;
            i = i20;
            obj6 = obj9;
            obj2 = obj10;
            obj3 = obj11;
            i7 = i13;
            i8 = i14;
            i6 = i15;
            f = f2;
            str2 = str3;
            i2 = i16;
            str = str4;
            i3 = i17;
            i5 = i18;
            z = z3;
            i9 = i12;
            i4 = i19;
        }
        b.mo13857c(descriptor2);
        return new GiftEmbed.Resolved.Valid(i9, str2, i8, i7, i6, (String) obj4, (String) obj5, i5, (String) obj, i4, (String) obj2, i3, (String) obj3, i2, i, (String) obj6, f, z, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, GiftEmbed.Resolved.Valid value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        GiftEmbed.Resolved.Valid.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC2522f0.C2523a.m33897a(this);
    }
}
