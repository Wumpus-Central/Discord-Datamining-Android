package com.discord.chat.bridge.botuikit;

import bj.AbstractC3644f0;
import bj.C3622a2;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p449yi.C14447n;
import p469zi.C14667a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/botuikit/SearchableSelectItem.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class SearchableSelectItem$$serializer implements AbstractC3644f0<SearchableSelectItem> {
    public static final SearchableSelectItem$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SearchableSelectItem$$serializer searchableSelectItem$$serializer = new SearchableSelectItem$$serializer();
        INSTANCE = searchableSelectItem$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.botuikit.SearchableSelectItem", searchableSelectItem$$serializer, 6);
        pluginGeneratedSerialDescriptor.m13841l("label", false);
        pluginGeneratedSerialDescriptor.m13841l("value", false);
        pluginGeneratedSerialDescriptor.m13841l("emoji", true);
        pluginGeneratedSerialDescriptor.m13841l("type", false);
        pluginGeneratedSerialDescriptor.m13841l("iconSrc", true);
        pluginGeneratedSerialDescriptor.m13841l("iconColor", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SearchableSelectItem$$serializer() {
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] childSerializers() {
        C3622a2 a2Var = C3622a2.f5917a;
        C3676m0 m0Var = C3676m0.f5992a;
        return new KSerializer[]{a2Var, a2Var, C14667a.m13u(ComponentEmoji$$serializer.INSTANCE), m0Var, C14667a.m13u(a2Var), C14667a.m13u(m0Var)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public SearchableSelectItem deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        int i2;
        Object obj;
        Object obj2;
        Object obj3;
        C9971q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC10248c b = decoder.mo13905b(descriptor2);
        if (b.mo13850p()) {
            str2 = b.mo13853m(descriptor2, 0);
            str = b.mo13853m(descriptor2, 1);
            obj = b.mo13852n(descriptor2, 2, ComponentEmoji$$serializer.INSTANCE, null);
            i = b.mo13855i(descriptor2, 3);
            obj2 = b.mo13852n(descriptor2, 4, C3622a2.f5917a, null);
            obj3 = b.mo13852n(descriptor2, 5, C3676m0.f5992a, null);
            i2 = 63;
        } else {
            boolean z = true;
            int i3 = 0;
            String str3 = null;
            String str4 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            int i4 = 0;
            while (z) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        str3 = b.mo13853m(descriptor2, 0);
                        i4 |= 1;
                        continue;
                    case 1:
                        str4 = b.mo13853m(descriptor2, 1);
                        i4 |= 2;
                        break;
                    case 2:
                        obj4 = b.mo13852n(descriptor2, 2, ComponentEmoji$$serializer.INSTANCE, obj4);
                        i4 |= 4;
                        break;
                    case 3:
                        i3 = b.mo13855i(descriptor2, 3);
                        i4 |= 8;
                        break;
                    case 4:
                        obj5 = b.mo13852n(descriptor2, 4, C3622a2.f5917a, obj5);
                        i4 |= 16;
                        break;
                    case 5:
                        obj6 = b.mo13852n(descriptor2, 5, C3676m0.f5992a, obj6);
                        i4 |= 32;
                        break;
                    default:
                        throw new C14447n(o);
                }
            }
            obj = obj4;
            obj2 = obj5;
            obj3 = obj6;
            i = i3;
            str = str4;
            str2 = str3;
            i2 = i4;
        }
        b.mo13857c(descriptor2);
        return new SearchableSelectItem(i2, str2, str, (ComponentEmoji) obj, i, (String) obj2, (Integer) obj3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, SearchableSelectItem value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        SearchableSelectItem.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC3644f0.C3645a.m33897a(this);
    }
}
