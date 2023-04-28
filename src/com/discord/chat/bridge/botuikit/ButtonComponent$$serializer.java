package com.discord.chat.bridge.botuikit;

import bj.AbstractC2522f0;
import bj.C2500a2;
import bj.C2521f;
import bj.C2530h;
import bj.C2555m0;
import com.discord.chat.bridge.botuikit.ActionComponentState;
import com.discord.chat.bridge.botuikit.ButtonStyle;
import com.discord.primitives.ApplicationId;
import com.discord.primitives.ApplicationId$$serializer;
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
import p164j$.util.Spliterator;
import p450yi.C14382n;
import p470zi.C14606a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/botuikit/ButtonComponent.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/botuikit/ButtonComponent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ButtonComponent$$serializer implements AbstractC2522f0<ButtonComponent> {
    public static final ButtonComponent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ButtonComponent$$serializer buttonComponent$$serializer = new ButtonComponent$$serializer();
        INSTANCE = buttonComponent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("2", buttonComponent$$serializer, 10);
        pluginGeneratedSerialDescriptor.m13841l("type", false);
        pluginGeneratedSerialDescriptor.m13841l("indices", false);
        pluginGeneratedSerialDescriptor.m13841l("applicationId", false);
        pluginGeneratedSerialDescriptor.m13841l("customId", true);
        pluginGeneratedSerialDescriptor.m13841l("label", true);
        pluginGeneratedSerialDescriptor.m13841l("style", false);
        pluginGeneratedSerialDescriptor.m13841l("disabled", true);
        pluginGeneratedSerialDescriptor.m13841l("emoji", true);
        pluginGeneratedSerialDescriptor.m13841l("url", true);
        pluginGeneratedSerialDescriptor.m13841l("state", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ButtonComponent$$serializer() {
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] childSerializers() {
        C2555m0 m0Var = C2555m0.f6794a;
        C2500a2 a2Var = C2500a2.f6719a;
        return new KSerializer[]{m0Var, new C2521f(m0Var), ApplicationId$$serializer.INSTANCE, C14606a.m13u(a2Var), C14606a.m13u(a2Var), ButtonStyle.Serializer.INSTANCE, C2530h.f6761a, C14606a.m13u(ComponentEmoji$$serializer.INSTANCE), C14606a.m13u(a2Var), ActionComponentState.Serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ButtonComponent deserialize(Decoder decoder) {
        Object obj;
        boolean z;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        int i2;
        Object obj6;
        Object obj7;
        Object obj8;
        char c;
        C9677q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC9967c b = decoder.mo13905b(descriptor2);
        int i3 = 9;
        int i4 = 8;
        if (b.mo13850p()) {
            i = b.mo13855i(descriptor2, 0);
            obj = b.mo13847y(descriptor2, 1, new C2521f(C2555m0.f6794a), null);
            obj3 = b.mo13847y(descriptor2, 2, ApplicationId$$serializer.INSTANCE, null);
            C2500a2 a2Var = C2500a2.f6719a;
            obj2 = b.mo13852n(descriptor2, 3, a2Var, null);
            obj4 = b.mo13852n(descriptor2, 4, a2Var, null);
            obj8 = b.mo13847y(descriptor2, 5, ButtonStyle.Serializer.INSTANCE, null);
            z = b.mo13861C(descriptor2, 6);
            obj6 = b.mo13852n(descriptor2, 7, ComponentEmoji$$serializer.INSTANCE, null);
            obj5 = b.mo13852n(descriptor2, 8, a2Var, null);
            obj7 = b.mo13847y(descriptor2, 9, ActionComponentState.Serializer.INSTANCE, null);
            i2 = 1023;
        } else {
            boolean z2 = true;
            int i5 = 0;
            int i6 = 0;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            Object obj12 = null;
            Object obj13 = null;
            obj2 = null;
            obj = null;
            Object obj14 = null;
            z = false;
            while (z2) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z2 = false;
                        i3 = 9;
                        i4 = 8;
                    case 0:
                        i5 = b.mo13855i(descriptor2, 0);
                        i6 |= 1;
                        i3 = 9;
                        i4 = 8;
                    case 1:
                        obj = b.mo13847y(descriptor2, 1, new C2521f(C2555m0.f6794a), obj);
                        i6 |= 2;
                        i3 = 9;
                        i4 = 8;
                    case 2:
                        obj14 = b.mo13847y(descriptor2, 2, ApplicationId$$serializer.INSTANCE, obj14);
                        i6 |= 4;
                        i3 = 9;
                        i4 = 8;
                    case 3:
                        obj2 = b.mo13852n(descriptor2, 3, C2500a2.f6719a, obj2);
                        i6 |= 8;
                        i3 = 9;
                        i4 = 8;
                    case 4:
                        obj13 = b.mo13852n(descriptor2, 4, C2500a2.f6719a, obj13);
                        i6 |= 16;
                        i3 = 9;
                        i4 = 8;
                    case 5:
                        obj11 = b.mo13847y(descriptor2, 5, ButtonStyle.Serializer.INSTANCE, obj11);
                        i6 |= 32;
                        i3 = 9;
                        i4 = 8;
                    case 6:
                        c = 7;
                        z = b.mo13861C(descriptor2, 6);
                        i6 |= 64;
                        i3 = 9;
                    case 7:
                        c = 7;
                        obj12 = b.mo13852n(descriptor2, 7, ComponentEmoji$$serializer.INSTANCE, obj12);
                        i6 |= 128;
                        i3 = 9;
                    case 8:
                        obj10 = b.mo13852n(descriptor2, i4, C2500a2.f6719a, obj10);
                        i6 |= Spliterator.NONNULL;
                    case 9:
                        obj9 = b.mo13847y(descriptor2, i3, ActionComponentState.Serializer.INSTANCE, obj9);
                        i6 |= 512;
                    default:
                        throw new C14382n(o);
                }
            }
            obj7 = obj9;
            obj5 = obj10;
            obj6 = obj12;
            obj4 = obj13;
            obj3 = obj14;
            i2 = i6;
            i = i5;
            obj8 = obj11;
        }
        b.mo13857c(descriptor2);
        return new ButtonComponent(i2, i, (List) obj, (ApplicationId) obj3, (String) obj2, (String) obj4, (ButtonStyle) obj8, z, (ComponentEmoji) obj6, (String) obj5, (ActionComponentState) obj7, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ButtonComponent value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        ButtonComponent.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC2522f0.C2523a.m33897a(this);
    }
}
