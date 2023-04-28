package com.discord.chat.bridge.botuikit;

import bj.AbstractC2522f0;
import bj.C2500a2;
import bj.C2521f;
import bj.C2555m0;
import com.discord.nearby.NearbyManager;
import java.util.List;
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
import p450yi.C14382n;
import p470zi.C14606a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/botuikit/ActionRowComponent.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/botuikit/ActionRowComponent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ActionRowComponent$$serializer implements AbstractC2522f0<ActionRowComponent> {
    public static final ActionRowComponent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ActionRowComponent$$serializer actionRowComponent$$serializer = new ActionRowComponent$$serializer();
        INSTANCE = actionRowComponent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(NearbyManager.PERMISSION_DENIED, actionRowComponent$$serializer, 4);
        pluginGeneratedSerialDescriptor.m13841l("type", false);
        pluginGeneratedSerialDescriptor.m13841l("indices", false);
        pluginGeneratedSerialDescriptor.m13841l("errorText", true);
        pluginGeneratedSerialDescriptor.m13841l("components", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ActionRowComponent$$serializer() {
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] childSerializers() {
        C2555m0 m0Var = C2555m0.f6794a;
        return new KSerializer[]{m0Var, new C2521f(m0Var), C14606a.m13u(C2500a2.f6719a), new C2521f(ComponentSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ActionRowComponent deserialize(Decoder decoder) {
        int i;
        int i2;
        Object obj;
        Object obj2;
        Object obj3;
        C9677q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC9967c b = decoder.mo13905b(descriptor2);
        if (b.mo13850p()) {
            i = b.mo13855i(descriptor2, 0);
            obj = b.mo13847y(descriptor2, 1, new C2521f(C2555m0.f6794a), null);
            obj2 = b.mo13852n(descriptor2, 2, C2500a2.f6719a, null);
            obj3 = b.mo13847y(descriptor2, 3, new C2521f(ComponentSerializer.INSTANCE), null);
            i2 = 15;
        } else {
            boolean z = true;
            int i3 = 0;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            int i4 = 0;
            while (z) {
                int o = b.mo13851o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    i3 = b.mo13855i(descriptor2, 0);
                    i4 |= 1;
                } else if (o == 1) {
                    obj4 = b.mo13847y(descriptor2, 1, new C2521f(C2555m0.f6794a), obj4);
                    i4 |= 2;
                } else if (o == 2) {
                    obj5 = b.mo13852n(descriptor2, 2, C2500a2.f6719a, obj5);
                    i4 |= 4;
                } else if (o == 3) {
                    obj6 = b.mo13847y(descriptor2, 3, new C2521f(ComponentSerializer.INSTANCE), obj6);
                    i4 |= 8;
                } else {
                    throw new C14382n(o);
                }
            }
            i = i3;
            i2 = i4;
            obj = obj4;
            obj2 = obj5;
            obj3 = obj6;
        }
        b.mo13857c(descriptor2);
        return new ActionRowComponent(i2, i, (List) obj, (String) obj2, (List) obj3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ActionRowComponent value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        ActionRowComponent.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC2522f0.C2523a.m33897a(this);
    }
}
