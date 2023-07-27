package com.discord.chat.bridge.botuikit;

import com.discord.chat.bridge.botuikit.ActionComponentState;
import com.discord.chat.bridge.botuikit.ButtonStyle;
import com.discord.primitives.ApplicationId;
import com.discord.primitives.ApplicationId$$serializer;
import java.util.List;
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
import si.f;
import si.f0;
import si.h;
import si.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/botuikit/ButtonComponent.$serializer", "Lsi/f0;", "Lcom/discord/chat/bridge/botuikit/ButtonComponent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class ButtonComponent$$serializer implements f0<ButtonComponent> {
    public static final ButtonComponent$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        ButtonComponent$$serializer buttonComponent$$serializer = new ButtonComponent$$serializer();
        INSTANCE = buttonComponent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("2", buttonComponent$$serializer, 10);
        pluginGeneratedSerialDescriptor.l("type", false);
        pluginGeneratedSerialDescriptor.l("indices", false);
        pluginGeneratedSerialDescriptor.l("applicationId", false);
        pluginGeneratedSerialDescriptor.l("customId", true);
        pluginGeneratedSerialDescriptor.l("label", true);
        pluginGeneratedSerialDescriptor.l("style", false);
        pluginGeneratedSerialDescriptor.l("disabled", true);
        pluginGeneratedSerialDescriptor.l("emoji", true);
        pluginGeneratedSerialDescriptor.l("url", true);
        pluginGeneratedSerialDescriptor.l("state", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ButtonComponent$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        m0 m0Var = m0.f26308a;
        a2 a2Var = a2.f26233a;
        return new KSerializer[]{m0Var, new f(m0Var), ApplicationId$$serializer.INSTANCE, a.u(a2Var), a.u(a2Var), ButtonStyle.Serializer.INSTANCE, h.f26275a, a.u(ComponentEmoji$$serializer.INSTANCE), a.u(a2Var), ActionComponentState.Serializer.INSTANCE};
    }

    @Override 
    public ButtonComponent deserialize(Decoder decoder) {
        Object obj;
        boolean z10;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i10;
        int i11;
        Object obj6;
        Object obj7;
        Object obj8;
        char c10;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c11 = decoder.c(descriptor2);
        int i12 = 9;
        int i13 = 8;
        if (c11.y()) {
            i10 = c11.k(descriptor2, 0);
            obj = c11.m(descriptor2, 1, new f(m0.f26308a), null);
            obj3 = c11.m(descriptor2, 2, ApplicationId$$serializer.INSTANCE, null);
            a2 a2Var = a2.f26233a;
            obj2 = c11.v(descriptor2, 3, a2Var, null);
            obj4 = c11.v(descriptor2, 4, a2Var, null);
            obj8 = c11.m(descriptor2, 5, ButtonStyle.Serializer.INSTANCE, null);
            z10 = c11.s(descriptor2, 6);
            obj6 = c11.v(descriptor2, 7, ComponentEmoji$$serializer.INSTANCE, null);
            obj5 = c11.v(descriptor2, 8, a2Var, null);
            obj7 = c11.m(descriptor2, 9, ActionComponentState.Serializer.INSTANCE, null);
            i11 = 1023;
        } else {
            boolean z11 = true;
            int i14 = 0;
            int i15 = 0;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            Object obj12 = null;
            Object obj13 = null;
            obj2 = null;
            obj = null;
            Object obj14 = null;
            z10 = false;
            while (z11) {
                int x10 = c11.x(descriptor2);
                switch (x10) {
                    case -1:
                        z11 = false;
                        i12 = 9;
                        i13 = 8;
                    case 0:
                        i14 = c11.k(descriptor2, 0);
                        i15 |= 1;
                        i12 = 9;
                        i13 = 8;
                    case 1:
                        obj = c11.m(descriptor2, 1, new f(m0.f26308a), obj);
                        i15 |= 2;
                        i12 = 9;
                        i13 = 8;
                    case 2:
                        obj14 = c11.m(descriptor2, 2, ApplicationId$$serializer.INSTANCE, obj14);
                        i15 |= 4;
                        i12 = 9;
                        i13 = 8;
                    case 3:
                        obj2 = c11.v(descriptor2, 3, a2.f26233a, obj2);
                        i15 |= 8;
                        i12 = 9;
                        i13 = 8;
                    case 4:
                        obj13 = c11.v(descriptor2, 4, a2.f26233a, obj13);
                        i15 |= 16;
                        i12 = 9;
                        i13 = 8;
                    case 5:
                        obj11 = c11.m(descriptor2, 5, ButtonStyle.Serializer.INSTANCE, obj11);
                        i15 |= 32;
                        i12 = 9;
                        i13 = 8;
                    case 6:
                        c10 = 7;
                        z10 = c11.s(descriptor2, 6);
                        i15 |= 64;
                        i12 = 9;
                    case 7:
                        c10 = 7;
                        obj12 = c11.v(descriptor2, 7, ComponentEmoji$$serializer.INSTANCE, obj12);
                        i15 |= 128;
                        i12 = 9;
                    case 8:
                        obj10 = c11.v(descriptor2, i13, a2.f26233a, obj10);
                        i15 |= 256;
                    case 9:
                        obj9 = c11.m(descriptor2, i12, ActionComponentState.Serializer.INSTANCE, obj9);
                        i15 |= 512;
                    default:
                        throw new n(x10);
                }
            }
            obj7 = obj9;
            obj5 = obj10;
            obj6 = obj12;
            obj4 = obj13;
            obj3 = obj14;
            i11 = i15;
            i10 = i14;
            obj8 = obj11;
        }
        c11.b(descriptor2);
        return new ButtonComponent(i11, i10, (List) obj, (ApplicationId) obj3, (String) obj2, (String) obj4, (ButtonStyle) obj8, z10, (ComponentEmoji) obj6, (String) obj5, (ActionComponentState) obj7, null, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ButtonComponent value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        ButtonComponent.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
