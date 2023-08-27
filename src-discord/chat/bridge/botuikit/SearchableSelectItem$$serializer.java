package com.discord.chat.bridge.botuikit;

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
import ti.n;
import ui.a;
import wi.a2;
import wi.f0;
import wi.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/botuikit/SearchableSelectItem.$serializer", "Lwi/f0;", "Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class SearchableSelectItem$$serializer implements f0<SearchableSelectItem> {
    public static final SearchableSelectItem$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        SearchableSelectItem$$serializer searchableSelectItem$$serializer = new SearchableSelectItem$$serializer();
        INSTANCE = searchableSelectItem$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.botuikit.SearchableSelectItem", searchableSelectItem$$serializer, 6);
        pluginGeneratedSerialDescriptor.l("label", false);
        pluginGeneratedSerialDescriptor.l("value", false);
        pluginGeneratedSerialDescriptor.l("emoji", true);
        pluginGeneratedSerialDescriptor.l("type", false);
        pluginGeneratedSerialDescriptor.l("iconSrc", true);
        pluginGeneratedSerialDescriptor.l("iconColor", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SearchableSelectItem$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f29762a;
        m0 m0Var = m0.f29837a;
        return new KSerializer[]{a2Var, a2Var, a.u(ComponentEmoji$$serializer.INSTANCE), m0Var, a.u(a2Var), a.u(m0Var)};
    }

    @Override 
    public SearchableSelectItem deserialize(Decoder decoder) {
        int i10;
        String str;
        String str2;
        int i11;
        Object obj;
        Object obj2;
        Object obj3;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            str2 = b10.m(descriptor2, 0);
            str = b10.m(descriptor2, 1);
            obj = b10.n(descriptor2, 2, ComponentEmoji$$serializer.INSTANCE, null);
            i10 = b10.i(descriptor2, 3);
            obj2 = b10.n(descriptor2, 4, a2.f29762a, null);
            obj3 = b10.n(descriptor2, 5, m0.f29837a, null);
            i11 = 63;
        } else {
            boolean z10 = true;
            int i12 = 0;
            String str3 = null;
            String str4 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            int i13 = 0;
            while (z10) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        str3 = b10.m(descriptor2, 0);
                        i13 |= 1;
                        continue;
                    case 1:
                        str4 = b10.m(descriptor2, 1);
                        i13 |= 2;
                        break;
                    case 2:
                        obj4 = b10.n(descriptor2, 2, ComponentEmoji$$serializer.INSTANCE, obj4);
                        i13 |= 4;
                        break;
                    case 3:
                        i12 = b10.i(descriptor2, 3);
                        i13 |= 8;
                        break;
                    case 4:
                        obj5 = b10.n(descriptor2, 4, a2.f29762a, obj5);
                        i13 |= 16;
                        break;
                    case 5:
                        obj6 = b10.n(descriptor2, 5, m0.f29837a, obj6);
                        i13 |= 32;
                        break;
                    default:
                        throw new n(o10);
                }
            }
            obj = obj4;
            obj2 = obj5;
            obj3 = obj6;
            i10 = i12;
            str = str4;
            str2 = str3;
            i11 = i13;
        }
        b10.c(descriptor2);
        return new SearchableSelectItem(i11, str2, str, (ComponentEmoji) obj, i10, (String) obj2, (Integer) obj3, (SerializationConstructorMarker) null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, SearchableSelectItem value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        SearchableSelectItem.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
