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
import qi.n;
import ri.a;
import ti.a2;
import ti.f0;
import ti.h;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/botuikit/StringSelectItem.$serializer", "Lti/f0;", "Lcom/discord/chat/bridge/botuikit/StringSelectItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class StringSelectItem$$serializer implements f0<StringSelectItem> {
    public static final StringSelectItem$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        StringSelectItem$$serializer stringSelectItem$$serializer = new StringSelectItem$$serializer();
        INSTANCE = stringSelectItem$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.botuikit.StringSelectItem", stringSelectItem$$serializer, 5);
        pluginGeneratedSerialDescriptor.l("label", false);
        pluginGeneratedSerialDescriptor.l("value", false);
        pluginGeneratedSerialDescriptor.l("emoji", true);
        pluginGeneratedSerialDescriptor.l("description", true);
        pluginGeneratedSerialDescriptor.l("default", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StringSelectItem$$serializer() {
    }

    @Override // ti.f0
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f26939a;
        return new KSerializer[]{a2Var, a2Var, a.u(ComponentEmoji$$serializer.INSTANCE), a.u(a2Var), a.u(h.f26981a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public StringSelectItem deserialize(Decoder decoder) {
        String str;
        String str2;
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        String str3 = null;
        if (c10.y()) {
            str2 = c10.t(descriptor2, 0);
            str = c10.t(descriptor2, 1);
            obj = c10.v(descriptor2, 2, ComponentEmoji$$serializer.INSTANCE, null);
            obj3 = c10.v(descriptor2, 3, a2.f26939a, null);
            obj2 = c10.v(descriptor2, 4, h.f26981a, null);
            i10 = 31;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String str4 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            while (z10) {
                int x10 = c10.x(descriptor2);
                if (x10 == -1) {
                    z10 = false;
                } else if (x10 == 0) {
                    str3 = c10.t(descriptor2, 0);
                    i11 |= 1;
                } else if (x10 == 1) {
                    str4 = c10.t(descriptor2, 1);
                    i11 |= 2;
                } else if (x10 == 2) {
                    obj4 = c10.v(descriptor2, 2, ComponentEmoji$$serializer.INSTANCE, obj4);
                    i11 |= 4;
                } else if (x10 == 3) {
                    obj5 = c10.v(descriptor2, 3, a2.f26939a, obj5);
                    i11 |= 8;
                } else if (x10 == 4) {
                    obj6 = c10.v(descriptor2, 4, h.f26981a, obj6);
                    i11 |= 16;
                } else {
                    throw new n(x10);
                }
            }
            i10 = i11;
            str2 = str3;
            str = str4;
            obj = obj4;
            obj3 = obj5;
            obj2 = obj6;
        }
        c10.b(descriptor2);
        return new StringSelectItem(i10, str2, str, (ComponentEmoji) obj, (String) obj3, (Boolean) obj2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, qi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, StringSelectItem value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        StringSelectItem.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // ti.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
